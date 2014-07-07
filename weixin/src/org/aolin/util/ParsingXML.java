package org.aolin.util;

import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

/**
 * @author aolin
 * @description 解析微信发来的请求消息
 * @date 2014-5-28上午10:01:43
 */
public class ParsingXML {
	public static Map<String, String> parseXML(HttpServletRequest request) throws Exception{
		/*
		 * 将解析结果存放到hashMap中
		 */
		Map<String, String> map = new HashMap<String, String>();
		/*
		 * 从request中获取输入流
		 */
		InputStream inputStream = request.getInputStream();
		/*
		 * 读取输入流
		 */
		SAXReader reader = new SAXReader();
		Document document = reader.read(inputStream);
		
		/*
		 * 获取XML的根元素
		 */
		Element root = document.getRootElement();
		/*
		 * 得到xml所有的子节点
		 */
		List<Element> elementlist = root.elements();
		
		/*
		 * 遍历所有子节点
		 */
		for(Element element : elementlist){
			map.put(element.getName(), element.getText());
		}
		/*
		 * 释放资源
		 */
		inputStream.close();
		inputStream = null;

		return map;
	}
}
