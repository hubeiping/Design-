package com.benguo.Adapter;

public class AudioPlayer implements MediaPlayer {
	
	MediaAdapter mediaAdapter;

	@Override
	public void paly(String audio, String filename) {
		// TODO Auto-generated method stub
		
		if("mp3".equalsIgnoreCase(audio)){
			
			System.out.println("���ڲ���mp3�ļ�:"+filename);
			
		}else if("vlc".equalsIgnoreCase(audio) || "mp4".equalsIgnoreCase(audio)){
			
			mediaAdapter = new MediaAdapter(audio);
			mediaAdapter.paly(audio, filename);
		}else{
			System.out.println("���ļ���ʽ��֧�ֲ���...");
		}
		

	}

}
