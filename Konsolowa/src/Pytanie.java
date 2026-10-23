public abstract class Pytanie {
    protected String trescPytania;
    protected String nazwaZdjecia;
    private boolean czyPoprawna;

    public Pytanie(String trescPytania, String nazwaZdjecia) {
        this.trescPytania = trescPytania;
        this.nazwaZdjecia = nazwaZdjecia;
        czyPoprawna = false;
    }

    public abstract boolean sprawdzOdpowiedz(char litera);
}
