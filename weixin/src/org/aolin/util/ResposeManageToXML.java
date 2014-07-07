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
 * @description 将响应信息转换成xml发送给微信 
 * @date 2014-5-28上午10:27:55
 */
public class ResposeManageToXML {
//	static XStream xStream = null;
	/*
	 * 将文本信息转换成XML
	 */
	public static String textManageToXML(TextMessage textMessage){
//		//初始化XStream 对象
//		xStream = new XStream();
		// 设置xml 根节点
		xstream.alias("xml", textMessage.getClass());
		return xstream.toXML(textMessage);
	}
	
	/*
	 * 将音乐消息对象转换成xml
	 */
	public static String musicMessageToXml(MusicMessage musicMessage){
//		//初始化XStream 对象
//		xStream = new XStream();
		// 设置xml 根节点
		xstream.alias("xml", musicMessage.getClass());
		return xstream.toXML(musicMessage);
	}
	
	/*
	 * 将图文消息对象转换成xml
	 */
	public static String newsMessageToXml(NewsMessage newsMessage){
//		//初始化XStream 对象
//		xStream = new XStream();
		// 设置xml 根节点
		xstream.alias("xml", newsMessage.getClass());
		return xstream.toXML(newsMessage);
	}
	
	/*
	 * 向xStream中加入CDATA块支持
	 * 重载XppDriver
	 */
	private static XStream xstream = new XStream(new XppDriver(){
		public HierarchicalStreamWriter createWriter(Writer out){
			return new PrettyPrintWriter(out){
				// 对所有xml节点的转换都增加CDATA标记
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
