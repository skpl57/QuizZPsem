public class PytanieZamkniete extends Pytanie{

    private String trescA;
    private String trescB;
    private String trescC;
    private char poprawnaOdp;


    public PytanieZamkniete(String trescPytania, String nazwaZdjecia, String trescA, String trescB, String trescC, char poprawnaOdp) {
        super(trescPytania, nazwaZdjecia);
        this.trescA = trescA;
        this.trescB = trescB;
        this.trescC = trescC;
        this.poprawnaOdp = poprawnaOdp;
    }

    @Override
    public boolean sprawdzOdpowiedz(char litera) {
        return poprawnaOdp == litera;
    }
}
