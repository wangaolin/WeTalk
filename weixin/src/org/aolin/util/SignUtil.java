package org.aolin.util;
//
//import java.security.MessageDigest;
//import java.security.NoSuchAlgorithmException;
//import java.util.Arrays;
//
///**
// * 
// * @author aolin
// *
// */
//public class SignUtil {
//	/**这里的TOKEN 要与微信借口中填入的TOKEN一致
//	 * 
//	 */
//	private static String token = "weixinface11"; 
//	/**
//	 * 验证签名
//	 * @param signature
//	 * @param timestamp
//	 * @param nonce
//	 * @return
//	 */
//	public static boolean checkSignature(String signature, String timestamp, String nonce){
//		String[] tmpArr = new String[]{token, timestamp, nonce};
//		/*将三个参数按字典排序 */
//		Arrays.sort(tmpArr);
//		StringBuffer sb = new StringBuffer();
//		/*将字符数组转换成字符串 */
//		for(int i = 0; i < tmpArr.length; i++){
//			sb.append(tmpArr[i]);
//		}
//		
//		 MessageDigest md = null;
//		 String afterSha1 = null;
//		 /*
//		  * 获取SHA-1加密
//		  */
//		 try {
//			 md = MessageDigest.getInstance("SHA-1");
//		} catch (NoSuchAlgorithmException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 byte[] byteStr = md.digest(sb.toString().getBytes());
//		 /*
//		  * 将字节数组转换成字符串
//		  */
//		 afterSha1 = byteToStr(byteStr);
//		 sb = null;
//		 return afterSha1 != null?afterSha1.equals(signature.toUpperCase()):false;
//	}
//	/**
//	 * 将字节数组转换成十六进制字符串
//	 */
//	public static String byteToStr(byte[] bte){
//		String strbyte = "";
//		for(int i = 0; i < bte.length; i++){
//			strbyte += byteToHexStr(bte[i]);
//		}
//		return strbyte;
//	}
//	/**
//	 * 将字节转换成十六进制字符串
//	 */
//	private static String byteToHexStr(byte b) {  
//		char[] Digit = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};  
//		char[] tempArr = new char[2];  
//        tempArr[0] = Digit[(b >>> 4) & 0X0F];  
//        tempArr[1] = Digit[b & 0X0F];  
//		          
//	    String s = new String(tempArr);  
//	    return s;  
//	}
//	public static String getToken() {
//		return token;
//	}
//	public static void setToken(String token) {
//		SignUtil.token = token;
//	}  
//	
//}

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

/**
 * 请求校验工具类
 * 
 * @author liufeng
 * @date 2013-05-18
 */
public class SignUtil {
	// 与接口配置信息中的Token要一致
	private static String token = "weixinCourse";

	/**
	 * 验证签名
	 * 
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @return
	 */
	public static boolean checkSignature(String signature, String timestamp, String nonce) {
		String[] arr = new String[] { token, timestamp, nonce };
		// 将token、timestamp、nonce三个参数进行字典序排序
		Arrays.sort(arr);
		StringBuilder content = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			content.append(arr[i]);
		}
		MessageDigest md = null;
		String tmpStr = null;

		try {
			md = MessageDigest.getInstance("SHA-1");
			// 将三个参数字符串拼接成一个字符串进行sha1加密
			byte[] digest = md.digest(content.toString().getBytes());
			tmpStr = byteToStr(digest);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		content = null;
		// 将sha1加密后的字符串可与signature对比，标识该请求来源于微信
		return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;
	}

	/**
	 * 将字节数组转换为十六进制字符串
	 * 
	 * @param byteArray
	 * @return
	 */
	private static String byteToStr(byte[] byteArray) {
		String strDigest = "";
		for (int i = 0; i < byteArray.length; i++) {
			strDigest += byteToHexStr(byteArray[i]);
		}
		return strDigest;
	}

	/**
	 * 将字节转换为十六进制字符串
	 * 
	 * @param mByte
	 * @return
	 */
	private static String byteToHexStr(byte mByte) {
		char[] Digit = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F' };
		char[] tempArr = new char[2];
		tempArr[0] = Digit[(mByte >>> 4) & 0X0F];
		tempArr[1] = Digit[mByte & 0X0F];

		String s = new String(tempArr);
		return s;
	}
}
