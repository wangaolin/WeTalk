package org.aolin.com.common.msgType.resp;

import org.aolin.com.common.base.resp.BaseManage;
/**
 * 
 * @author aolin
 * @description ��Ӧ������Ϣ
 * @date 2014-5-28����09:39:10
 */
public class MusicMessage extends BaseManage {
	/*
	 * ����
	 */
	private Music Music;

	public Music getMusic() {
		return Music;
	}

	public void setMusic(Music music) {
		Music = music;
	}
}
