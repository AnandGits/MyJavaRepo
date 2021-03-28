package MyMaven.DemoMavenProject.jwtExamples;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Base64;
import java.util.Date;

//import org.junit.Test;

public class JwtRsaTest {
	
	//@Test
	public static void main(String[] args) throws NoSuchAlgorithmException {
		KeyPairGenerator keyGenerator = KeyPairGenerator.getInstance("RSA");
		keyGenerator.initialize(2048);

		KeyPair kp = keyGenerator.genKeyPair();
		PublicKey publicKey = (PublicKey) kp.getPublic();
		PrivateKey privateKey = (PrivateKey) kp.getPrivate();

		String encodedPublicKey = Base64.getEncoder().encodeToString(publicKey.getEncoded());
		System.out.println("Public Key:");
		System.out.println(convertToPublicKey(encodedPublicKey));
		String token = generateJwtToken(privateKey);
		System.out.println("TOKEN:");
		System.out.println(token);
		printStructure(token, publicKey);
	}

	@SuppressWarnings("deprecation")
	public static String generateJwtToken(PrivateKey privateKey) {
		String token = Jwts.builder().setSubject("adam")
				.setExpiration(new Date(2022, 1, 1))
				.setIssuer("info@wstutorial.com")
				.claim("groups", new String[] { "user", "admin" })
				// RS256 with privateKey
				.signWith(SignatureAlgorithm.RS256, privateKey).compact();
		return token;
	}

	//Print structure of JWT
	public static void printStructure(String token, PublicKey publicKey) {
		@SuppressWarnings("deprecation")
		Jws parseClaimsJws = Jwts.parser().setSigningKey(publicKey)
				.parseClaimsJws(token);

		System.out.println("Header     : " + parseClaimsJws.getHeader());
		System.out.println("Body       : " + parseClaimsJws.getBody());
		System.out.println("Signature  : " + parseClaimsJws.getSignature());
	}

	// Add BEGIN and END comments
	private static String convertToPublicKey(String key){
		StringBuilder result = new StringBuilder();
		result.append("-----BEGIN PUBLIC KEY-----\n");
		result.append(key);
		result.append("\n-----END PUBLIC KEY-----");
		return result.toString();
	}
}