package ch08.class09;

public class Song {
	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	//기본생성자
	public Song() {
	}
	
	
	//생성자
	public Song(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		
		System.out.print("노래 제목을 입력하세요 >> ");
	}
	
	
	//
	public void setSongInfo(String title, String artist, String album, String composer, int year, int track) {
		this.title = title;
		this.artist = artist;
		this.album = album;
		this.composer = composer;
		this.year = year;
		this.track = track;
		if (year <1000 || track < 0)
			System.out.println("잘못된 입력입니다.\n");
	}
	
	
	//
	public String getTitle() {
		return title;
	}
	public String getArtist() {
		return artist;
	}
	public String getAlbum() {
		return album;
	}
	public String getComposer() {
		return composer;
	}
	public int getYear() {
		return year;
	}
	public int getTrack() {
		return track;
	}
	
	

	public void show(String title) {
		
		System.out.println("노래 제목 : " + title);
		System.out.println("가수 : " + artist);
		System.out.println("앨범제목 : " + album);
		System.out.println("작곡가 : " + composer);
		System.out.println("발표 연도 : " + year);
		System.out.println("트랙 번호 : " + track);
	}

}
