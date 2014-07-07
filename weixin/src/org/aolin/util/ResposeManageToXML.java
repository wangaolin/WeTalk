package org.aolin.util;

import java.io.Writer;

import org.aolin.com.common.msgType.resp.MusicMessage;
import org.aolin.com.common.msgType.resp.NewsMessage;
import org.aolin.com.common.msgType.resp.TextMessage;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.core.util.QuickWriter;
import com.thoughtworks.xstream.io.HierarchicalStreamWriter;
import com.thoughtworks.xstream.io.xml.DomDriver;
import com.thoughtworks.xstream.io.xml.PrettyPrintWriter;
import com.thoughtworks.xstream.io.xml.XppDriver;

/**
 * @author aolin
 * @description ����Ӧ��Ϣת����xml���͸�΢�� 
 * @date 2014-5-28����10:27:55
 */
public class ResposeManageToXML {
//	static XStream xStream = null;
	/*
	 * ���ı���Ϣת����XML
	 */
	public static String textManageToXML(TextMessage textMessage){
//		//��ʼ��XStream ����
//		xStream = new XStream();
		// ����xml ���ڵ�
		xstream.alias("xml", textMessage.getClass());
		return xstream.toXML(textMessage);
	}
	
	/*
	 * ��������Ϣ����ת����xml
	 */
	public static String musicMessageToXml(MusicMessage musicMessage){
//		//��ʼ��XStream ����
//		xStream = new XStream();
		// ����xml ���ڵ�
		xstream.alias("xml", musicMessage.getClass());
		return xstream.toXML(musicMessage);
	}
	
	/*
	 * ��ͼ����Ϣ����ת����xml
	 */
	public static String newsMessageToXml(NewsMessage newsMessage){
//		//��ʼ��XStream ����
//		xStream = new XStream();
		// ����xml ���ڵ�
		xstream.alias("xml", newsMessage.getClass());
		return xstream.toXML(newsMessage);
	}
	
	/*
	 * ��xStream�м���CDATA��֧��
	 * ����XppDriver
	 */
	private static XStream xstream = new XStream(new XppDriver(){
		public HierarchicalStreamWriter createWriter(Writer out){
			return new PrettyPrintWriter(out){
				// ������xml�ڵ��ת��������CDATA���
				boolean cdata = true;
				
				protected void writeText(QuickWriter writer, String text){
					if (cdata) {
						writer.write("<![CDATA[");
						writer.write(text);
						writer.write("]]>");
					} else {
						writer.write(text);
					}
				}
			};
		}
	});
	public static void main(String[] args) {
		TextMessage textMessage = new TextMessage();
		textMessage.setCreateTime(1212121212);
		textMessage.setFromUserName("54545545");
		textMessage.setMsgType("484558");
		textMessage.setToUserName("4a8sa8s4");
		System.out.println(textManageToXML(textMessage));
	}
}
