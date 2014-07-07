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
 * @description ����΢�ŷ�����������Ϣ
 * @date 2014-5-28����10:01:43
 */
public class ParsingXML {
	public static Map<String, String> parseXML(HttpServletRequest request) throws Exception{
		/*
		 * �����������ŵ�hashMap��
		 */
		Map<String, String> map = new HashMap<String, String>();
		/*
		 * ��request�л�ȡ������
		 */
		InputStream inputStream = request.getInputStream();
		/*
		 * ��ȡ������
		 */
		SAXReader reader = new SAXReader();
		Document document = reader.read(inputStream);
		
		/*
		 * ��ȡXML�ĸ�Ԫ��
		 */
		Element root = document.getRootElement();
		/*
		 * �õ�xml���е��ӽڵ�
		 */
		List<Element> elementlist = root.elements();
		
		/*
		 * ���������ӽڵ�
		 */
		for(Element element : elementlist){
			map.put(element.getName(), element.getText());
		}
		/*
		 * �ͷ���Դ
		 */
		inputStream.close();
		inputStream = null;

		return map;
	}
}
