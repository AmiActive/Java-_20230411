package kenshu;

public class Ipod extends Title implements Player {

	//コンストラクタ
	 public Ipod(String musicName, String ArtistMusic) {
	        System.out.println("iPodの使用を開始します。");
	        if (musicName == null || musicName.length() == 0 || ArtistMusic == null || ArtistMusic.length() == 0) {
	            System.out.println("再生に失敗しました");
	            return;
	        }
	       outPrintMusicInfo(musicName, ArtistMusic);
	    }
	 //アクションクラスから呼び出し
	 public void useIpod(String musicName, String ArtistMusic) {
	        Ipod ipod = new Ipod(musicName, ArtistMusic);
	        ipod.start();
	        ipod.pause();
	        ipod.stop();
	    }

	@Override
	public void start() {
		// TODO 自動生成されたメソッド・スタブ
		//再生
		 System.out.println("ひかえめに再生します");
	}

	@Override
	public void pause() {
		// TODO 自動生成されたメソッド・スタブ
		//一時停止
		System.out.println("かしこまりました、一時停止します");
		
	}

	@Override
	public void stop() {
		// TODO 自動生成されたメソッド・スタブ
		//停止
		System.out.println("再生を停止しました");
		
	}

}
