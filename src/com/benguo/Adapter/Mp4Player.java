package com.benguo.Adapter;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void palyVlc(String filename) {
		// TODO Auto-generated method stub

	}

	@Override
	public void palyMp4(String filename) {
		// TODO Auto-generated method stub
		System.out.println("正在播放mp4文件:"+filename);
	}

}
