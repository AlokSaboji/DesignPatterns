package Builder;

public class MusicBuilder {
    private boolean guitar;
    private boolean drums;
    private boolean flute;

    public MusicBuilder setGuitar(boolean bool){
        this.guitar = bool;
        return this;
    }
    public MusicBuilder setDrums(boolean bool){
        this.drums = bool;
        return this;
    }
    public MusicBuilder setFlute(boolean bool){
        this.flute = bool;
        return this;
    }

    public Music getMusic(){
       Music music = new Music(this.guitar,this.drums,this.flute);
        return music;
    }
}
