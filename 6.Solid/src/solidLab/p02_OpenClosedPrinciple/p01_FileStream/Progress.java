package solidLab.p02_OpenClosedPrinciple.p01_FileStream;

public class Progress {
    //  private final File file;
    private final Music music;

    public Progress(Music music) {
        //  this.file = file;
        this.music = music;
    }

    public int getCurrentPercent() {
        return this.music.getSent() * 100 / this.music.getLength();
    }
}
