package test;

public class Test {

	public static void main(String[] args) {
		
		
		SongLyricAuditingSystem system = new SongLyricAuditingSystem();

        
        SongLyric lyric1 = new SongLyric(1, "Lyric 1", true);
        system.addSongLyric(lyric1);

        system.processNextSongLyricInQueue("Drafting");
        system.showQueue("Auditing");
    }
		

	}


