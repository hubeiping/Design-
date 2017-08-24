package com.benguo.Adapter;

public class AdapterPatternDemo {
	
	public static void main(String[] args) {
		AudioPlayer audioPlayer = new AudioPlayer();
		
		audioPlayer.paly("mp3", "张学友");
		audioPlayer.paly("mp4", "王菲");
		audioPlayer.paly("vlc", "蔡依林");
		audioPlayer.paly("avi", "what");
		
	}

}
