package solidLab.p02_OpenClosedPrinciple.p01_FileStream;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
        /*File mp3 = new File();
        mp3.setSent(5);
        mp3.setLength(10);
        */
        Music music= new Music();

        music.setLength(30);
        music.setSent(10);
        Progress progress= new Progress(music);

        System.out.println(progress.getCurrentPercent());

    }
}

