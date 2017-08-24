package com.benguo.Adapter;

/**
 * 
 *   ≈‰∆˜
 * @author hubeiping
 *
 */
public class MediaAdapter implements MediaPlayer {
	
	AdvancedMediaPlayer advancedMediaPlayer;
	
	public MediaAdapter(String audioType){
		
		if("vlc".equalsIgnoreCase(audioType)){
			
			advancedMediaPlayer = new VlcPlayer();
			
		}else if("mp4".equalsIgnoreCase(audioType)){
			
			advancedMediaPlayer = new Mp4Player();
		}
		
	}
	

	@Override
	public void paly(String audio, String filename) {
		// TODO Auto-generated method stub
		if("vlc".equalsIgnoreCase(audio)){
			
			advancedMediaPlayer.palyVlc(filename);
			
		}else if("mp4".equalsIgnoreCase(audio)){
			
			advancedMediaPlayer.palyMp4(filename);
		}
		

	}
	
	
	
	

}
