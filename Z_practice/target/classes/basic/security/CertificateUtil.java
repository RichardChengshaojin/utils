package basic.security;//package basic.security;
//
//import java.io.ByteArrayInputStream;
//import java.math.BigInteger;
//import java.security.PrivateKey;
//import java.security.PublicKey;
//import java.security.cert.CertificateFactory;
//import java.security.cert.X509Certificate;
//import java.util.Date;
//
//import org.bouncycastle.asn1.x509.X509Name;
//import org.bouncycastle.x509.X509V3CertificateGenerator;
//
//public final class CertificateUtil {
//
//	/**
//	 * 从证书中获取公钥信息
//	 * @param certiflcateContent
//	 * @return
//	 */
//	public static String getPublicKey(String certiflcateContent) throws Exception
//	{
//		if(null == certiflcateContent)
//			return null;
//
//		certiflcateContent = "-----BEGIN PRIVATE KEY-----\r"+certiflcateContent+"\r-----END PRIVATE KEY-----";
//		ByteArrayInputStream in = null;
//		try {
//			in = new ByteArrayInputStream(certiflcateContent.getBytes());
//			CertificateFactory certificatefactory = CertificateFactory.getInstance("X.509");
//			X509Certificate certificate=(X509Certificate)certificatefactory.generateCertificate(in);
//
//			PublicKey key = certificate.getPublicKey();
//			return Base64Util.encode(key.getEncoded());
//		} finally{
//			if(null != in)
//				in.close();
//		}
//	}
//
//	/**
//	 * 生成X509证书
//	 * (该功能使用第三方库，此处创建x509 v3证书所使用的是过期类，暂未找到可替换的方法)
//	 * @param publicKey		--公钥
//	 * @param privateKey	--私钥
//	 * @return
//	 * @throws Exception
//	 */
//	@SuppressWarnings("deprecation")
//	public static byte[] generateX509Certificate(PublicKey publicKey,PrivateKey privateKey) throws Exception
//	{
//		long currTime = new Date().getTime();
//        String issuerDN = "CN=XGD";
//        String subjectDN = "CN=XGD";
//        int vday = 365;
//        //创建X509 v3证书
//		X509V3CertificateGenerator v3CertGen = new X509V3CertificateGenerator();
//		//写序号
//		v3CertGen.setSerialNumber(BigInteger.valueOf(currTime));
//		//发行人
//        v3CertGen.setIssuerDN(new X509Name(true,issuerDN));
//        //接收方
//        v3CertGen.setSubjectDN(new X509Name(true,subjectDN));
//        //开始时间和结束时间
//        v3CertGen.setNotBefore(new Date(currTime));
//        v3CertGen.setNotAfter(new Date(currTime + vday*24*60*60*1000));
//        //签名算法
//        v3CertGen.setSignatureAlgorithm("MD5withRSA");
//        //公钥
//        v3CertGen.setPublicKey(publicKey);
//
//        return v3CertGen.generate(privateKey).getEncoded();
//	}
//}
