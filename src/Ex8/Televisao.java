package Ex8;

public class Televisao {

    public Televisao(int canal, int volume) {
        this.canal = 0;
        this.volume = 0;
    }

    private int canal;

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

}
