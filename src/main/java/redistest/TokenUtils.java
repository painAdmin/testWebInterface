package redistest;



import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import sun.misc.BASE64Decoder;
import sun.misc.BASE64Encoder;

/**
 * token
 * @author pain
 *
 */
public class TokenUtils {
	 private static final String secret="4828248324_76649265664_5426464926";
	public static void main(String[] args) throws Exception {
		String jwt=createJWT("1","htmcc","test",System.currentTimeMillis());
		Claims claims=parseJWT("eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI3MjcxM2JhZGI3M2E0MDMxYTNjYjM5MDA2YTYyZDBhMSIsImlzcyI6InN5c2FkbWluOjcyNzEzYmFkYjczYTQwMzFhM2NiMzkwMDZhNjJkMGExIiwiaWF0IjoxNTA1OTU3NDI1LCJleHAiOjE1MDYwMDA2MjV9.jnGavjVAuwrNlkipzija2tpfWDovk3kZrBtJ3Q0_myQ");
		//System.out.println(jwt);
		System.out.println(claims.toString());
//		System.out.println(claims.get("iat"));
//		System.out.println(claims.get("exp"));
//		System.out.println(claims.get("iss"));
//		System.out.println(claims.get("sub"));
		

	}
	//获取加密秘钥
	public static SecretKey generalKey() throws Exception {
        byte[] encodedKey =secret.getBytes();
        SecretKey key = new SecretKeySpec(encodedKey, 0, encodedKey.length, "AES");
        return key;
    }
	
	/**
	  * 创建 jwt
	  * @param id
	  * @param subject
	  * @param ttlMillis
	  * @return
	  * @throws Exception
	  */
	  public static String createJWT(String id,String issuser ,String subject, long ttlMillis) throws Exception {
	       SignatureAlgorithm signatureAlgorithm = SignatureAlgorithm.HS256 ;
	       long nowMillis = System. currentTimeMillis();
	       Map<String,Object> map=new HashMap<String,Object>();
	       map.put("name", "hw");
	       map.put("age", "14");
	       map.put("sss", "ss");
	       Date now = new Date( nowMillis);
	       SecretKey key = generalKey();
	       JwtBuilder builder = Jwts. builder()
	            .setId(id)
	            .setAudience(issuser)
	            .setClaims(map)
	            .setIssuer(issuser)             //签发者
	            .setIssuedAt(now)              //签发时间
	            .setSubject(subject)           // 面向用户
	           .signWith(signatureAlgorithm, key);
	       if (ttlMillis >= 0){
	           long expMillis = nowMillis + ttlMillis;
	           Date exp = new Date( expMillis);  // 过期时间
	           builder.setExpiration(exp);
	       }
	       return builder.compact();
	 }

	  /**
	  * 解密和验证 jwt
	  * @param jwt
	  * @return
	  * @throws Exception
	  */
	  public static Claims parseJWT(String jwt) throws Exception{
	       SecretKey key = generalKey();
	       Claims claims = Jwts. parser()
	          .setSigningKey( key)
	          .parseClaimsJws( jwt).getBody();
	       return claims;
	 }
	
}
