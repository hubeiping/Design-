package com.benguo.Adapter;

public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.paly("mp3", "��ѧ��");
		audioPlayer.paly("mp4", "����");
		audioPlayer.paly("vlc", "������");
		audioPlayer.paly("avi", "what");
		
	}

}
