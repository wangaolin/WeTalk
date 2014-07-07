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
//	/**�����TOKEN Ҫ��΢�Ž���������TOKENһ��
//	 * 
//	 */
//	private static String token = "weixinface11"; 
//	/**
//	 * ��֤ǩ��
//	 * @param signature
//	 * @param timestamp
//	 * @param nonce
//	 * @return
//	 */
//	public static boolean checkSignature(String signature, String timestamp, String nonce){
//		String[] tmpArr = new String[]{token, timestamp, nonce};
//		/*�������������ֵ����� */
//		Arrays.sort(tmpArr);
//		StringBuffer sb = new StringBuffer();
//		/*���ַ�����ת�����ַ��� */
//		for(int i = 0; i < tmpArr.length; i++){
//			sb.append(tmpArr[i]);
//		}
//		
//		 MessageDigest md = null;
//		 String afterSha1 = null;
//		 /*
//		  * ��ȡSHA-1����
//		  */
//		 try {
//			 md = MessageDigest.getInstance("SHA-1");
//		} catch (NoSuchAlgorithmException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		 byte[] byteStr = md.digest(sb.toString().getBytes());
//		 /*
//		  * ���ֽ�����ת�����ַ���
//		  */
//		 afterSha1 = byteToStr(byteStr);
//		 sb = null;
//		 return afterSha1 != null?afterSha1.equals(signature.toUpperCase()):false;
//	}
//	/**
//	 * ���ֽ�����ת����ʮ�������ַ���
//	 */
//	public static String byteToStr(byte[] bte){
//		String strbyte = "";
//		for(int i = 0; i < bte.length; i++){
//			strbyte += byteToHexStr(bte[i]);
//		}
//		return strbyte;
//	}
//	/**
//	 * ���ֽ�ת����ʮ�������ַ���
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
 * ����У�鹤����
 * 
 * @author liufeng
 * @date 2013-05-18
 */
public class SignUtil {
	// ��ӿ�������Ϣ�е�TokenҪһ��
	private static String token = "weixinCourse";

	/**
	 * ��֤ǩ��
	 * 
	 * @param signature
	 * @param timestamp
	 * @param nonce
	 * @return
	 */
	public static boolean checkSignature(String signature, String timestamp, String nonce) {
		String[] arr = new String[] { token, timestamp, nonce };
		// ��token��timestamp��nonce�������������ֵ�������
		Arrays.sort(arr);
		StringBuilder content = new StringBuilder();
		for (int i = 0; i < arr.length; i++) {
			content.append(arr[i]);
		}
		MessageDigest md = null;
		String tmpStr = null;

		try {
			md = MessageDigest.getInstance("SHA-1");
			// �����������ַ���ƴ�ӳ�һ���ַ�������sha1����
			byte[] digest = md.digest(content.toString().getBytes());
			tmpStr = byteToStr(digest);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		}

		content = null;
		// ��sha1���ܺ���ַ�������signature�Աȣ���ʶ��������Դ��΢��
		return tmpStr != null ? tmpStr.equals(signature.toUpperCase()) : false;
	}

	/**
	 * ���ֽ�����ת��Ϊʮ�������ַ���
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
	 * ���ֽ�ת��Ϊʮ�������ַ���
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
