package com.benguo.Adapter;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void palyVlc(String filename) {
		// TODO Auto-generated method stub
		System.out.println("正在播放vlc格式文件:"+filename);

	}

	@Override
	public void palyMp4(String filename) {
		// TODO Auto-generated method stub

	}

}
