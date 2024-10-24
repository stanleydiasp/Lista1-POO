package Ex8;

public class ControleRemoto {

    public Televisao tv;

    public ControleRemoto(Televisao tv) {
        this.tv = tv;
    }

    public int diminuiVolume(int qtd) {
        int volumeAtual = tv.getVolume();

        if (tv.getVolume() == 0) {
            System.out.println("Som mudo");
        } else {
            int diminuir = volumeAtual - qtd;
            tv.setVolume(diminuir);
        }

        return tv.getVolume();
    }

    public int aumentaVolume(int qtd) {
        int volumeAtual = tv.getVolume();

        if (tv.getVolume() == 100) {
            System.out.println("Volume máximo");
        } else {
            int aumentar = volumeAtual + qtd;
            tv.setVolume(aumentar);
        }

        return tv.getVolume();
    }

    public int trocarCanal(int canal) {
        tv.setCanal(canal);

        return tv.getCanal();
    }

    public void exibirVolume() {

        if (tv.getVolume() <= 0) {
            System.out.println("Mudo");
        }
        else if (tv.getVolume() >= 1){
            System.out.println("Volume: " + tv.getVolume());
        }
        else if (tv.getVolume() >= 100){
            System.out.println("Volume Máximo");
        }
    }

    public void exibirCanal() {

        System.out.println("Você está assistindo o canal " + tv.getCanal());

    }
}



