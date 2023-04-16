package kenshu;

public class Walkman extends Title implements Player {
	
    public Walkman(String musicName, String ArtistMusic) {
        System.out.println("iPodの使用を開始します。");
        if (musicName == null || musicName.length() == 0 || ArtistMusic == null || ArtistMusic.length() == 0) {
            System.out.println("再生に失敗しました");
            return;
        }
        outPrintMusicInfo(musicName, ArtistMusic);
    }

    @Override
    public void start() {
    	//再生
        System.out.println("爆音で再生します");
    }

    @Override
    public void pause() {
    	//一時停止
        System.out.println("3分間待ってやる");
    }

    @Override
    public void stop() {
    	//停止
        System.out.println("停止しました");
    }

    public void useWalkman(String music, String artist) {
        Walkman walkman = new Walkman(music, artist);
        walkman.start();
        walkman.pause();
        walkman.stop();
    }
}