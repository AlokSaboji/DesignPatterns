package Builder;

public class BuilderDemo {

    public static void main(String[] args) {
        Music music = new MusicBuilder().setGuitar(false).setFlute(true).setDrums(true).getMusic();
        System.out.println(music.toString());
    }
}
