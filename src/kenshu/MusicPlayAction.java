package kenshu;

public class MusicPlayAction {

	public static void main(String[] args) {
		 Walkman walkman = new Walkman("ブルーバード", "いきものがかり");
	        walkman.useWalkman("ブルーバード", "いきものがかり");

	        Ipod ipod = new Ipod("ブルーバード", "いきものがかり");
	        ipod.useIpod("ブルーバード", "いきものがかり");
	    }
	}