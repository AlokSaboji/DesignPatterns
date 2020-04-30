package Builder;

public class Music {
    private boolean guitar;
    private boolean drums;
    private boolean flute;

    public Music(boolean guitar, boolean drums, boolean flute) {
        this.guitar = guitar;
        this.drums = drums;
        this.flute = flute;
    }

    public boolean isGuitar() {
        return guitar;
    }

    public void setGuitar(boolean guitar) {
        this.guitar = guitar;
    }

    public boolean isDrums() {
        return drums;
    }

    public void setDrums(boolean drums) {
        this.drums = drums;
    }

    public boolean isFlute() {
        return flute;
    }

    public void setFlute(boolean flute) {
        this.flute = flute;
    }

    @Override
    public String toString() {
        return "Music{" +
            "guitar=" + guitar +
            ", drums=" + drums +
            ", flute=" + flute +
            '}';
    }
}
