package org.aolin.service.core;

import java.util.Date;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.aolin.com.common.msgType.resp.TextMessage;
import org.aolin.util.Constant;
import org.aolin.util.ParsingXML;
import org.aolin.util.ResposeManageToXML;
import org.springframework.stereotype.Service;
/**
 * @author aolin
 * @description ����������Ӧ��,�����������
 * @date 2014-5-28����07:50:58
 */

@Service
public class CoreService {
	/*
	 * ����΢�ŷ���������
	 */
	public static String processRequest(HttpServletRequest request) throws Exception{
		String resMessage = null;
		// Ĭ����Ӧ�ı�����
		String respContent = "ƴ��������...";
		
		//1���Ƚ��� ΢�ŷ���������--->  ��Ϊ��������xml ����ʽ���͵ģ����ݶ���xml��
		Map<String, String> requestMap = ParsingXML.parseXML(request);
		
		// ��ȡ�������˺�
		String fromUserName = requestMap.get("FromUserName");
		//������΢�ź� 
		String toUserName = requestMap.get("ToUserName");
		//��������
		String msgType = requestMap.get("MsgType");
		
		//Ĭ�ϻظ��ı���Ϣ
		TextMessage textMessage = new TextMessage();
		textMessage.setFromUserName(fromUserName);
		textMessage.setToUserName(toUserName);
		textMessage.setCreateTime(new Date().getTime());
		textMessage.setMsgType(Constant.REQ_MESSAGE_TYPE_TEXT);
		
		if(msgType.equals(Constant.REQ_MESSAGE_TYPE_TEXT)){
			respContent = "���������ı���Ϣ";
		}else if (msgType.equals(Constant.REQ_MESSAGE_TYPE_IMAGE)) {
			respContent = "��������ͼƬ";
		}else if (msgType.equals(Constant.REQ_MESSAGE_TYPE_LINK)) {
			respContent = "������������";
		}else if (msgType.equals(Constant.REQ_MESSAGE_TYPE_LOCATION)) {
			respContent = "�������ǵ���λ��";
		}else if (msgType.equals(Constant.REQ_MESSAGE_TYPE_VIDEO)) {
			respContent = "������������";
		}else if (msgType.equals(Constant.REQ_MESSAGE_TYPE_VOICE)) {
			respContent = "����������Ƶ";
		}
		textMessage.setContent(respContent);
		resMessage = ResposeManageToXML.textManageToXML(textMessage);
			return resMessage;
	}
}
