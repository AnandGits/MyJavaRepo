package MyMaven.DemoMavenProject.jwtExamples;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import javax.crypto.spec.SecretKeySpec;
import java.security.Key;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Base64;
import java.util.Date;
import java.util.UUID;

public class JWTGenerateValidateHMAC {

	private static String secret="Fxazc4eYZPAaLEbIqSW6YLjFwKAaZt81VEdKI3Pu9Mk";
    public static void main(String[] args) {

        String jwt = createJwtSignedHMAC();

        Jws<Claims> token = parseJwt(jwt);

        System.out.println(token.getBody());
    }

    public static Jws<Claims> parseJwt(String jwtString) {

      //  String secret = "Fxazc4eYZPAaLEbIqSW6YLjFwKAaZt81VEdKI3Pu9Mk";

        Key hmacKey = new SecretKeySpec(Base64.getDecoder().decode(secret), SignatureAlgorithm.HS256.getJcaName());

        Jws<Claims> jwt = Jwts.parserBuilder()
                .setSigningKey(hmacKey)
                .build()
                .parseClaimsJws(jwtString);

        return jwt;
    }


    public static String createJwtSignedHMAC() {


        Key hmacKey = new SecretKeySpec(Base64.getDecoder().decode(secret), SignatureAlgorithm.HS256.getJcaName());
      //  System.out.println(hmacKey.toString());
        Instant now = Instant.now();
        String jwtToken = Jwts.builder()
                .claim("name", "Anand Doe")
                .claim("email", "jane@example.com")
                .setSubject("jane")
                .setId(UUID.randomUUID().toString())
                .setIssuedAt(Date.from(now))
                .setExpiration(Date.from(now.plus(5l, ChronoUnit.MINUTES)))
                .signWith(hmacKey)
                .compact();
        System.out.println("JWT Token " + jwtToken);
        return jwtToken;
    }

}