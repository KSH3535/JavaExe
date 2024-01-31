package ch08.class09;

import java.util.Scanner;

public class SongMain {

	public static void main(String[] args) {
		Song song = new Song();
		Scanner sc = new Scanner(System.in);
		
		System.out.print("노래 제목을 입력하세요 >> ");
		String title = sc.nextLine();
		System.out.print("가수 이름을 입력하세요 >> ");
		String aritist = sc.nextLine();
		System.out.print("앨범 제목을 입력하세요 >> ");
		String album = sc.nextLine();
		System.out.print("작곡가 이름을 입력하세요 >> ");
		String composer = sc.nextLine();
		System.out.print("발표 연도를 입력하세요 >> ");
		int year = sc.nextInt();
		System.out.print("트랙 번호를 입력하세요 >> ");
		int track = sc.nextInt();
		System.out.println();
		
		
		song.setSongInfo(title, aritist, album, composer, year, track);
		song.show("Dancing Queen");
		
		
		sc.close();
	}

}
