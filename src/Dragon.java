public class Dragon {
    private String nume;
    private String rasa;
    private String culoare;
    private short numarPerechiAripi;
    private int greutate;

    Dragon(String nume, String rasa, String culoare, short numarPerechiAripi, int greutate) {
        this.nume = nume;
        this.rasa = rasa;
        this.culoare = culoare;
        this.numarPerechiAripi = numarPerechiAripi;
        this.greutate = greutate;
    }

    public String getNume() { return this.nume; }
    public String getrasa() { return this.rasa; }
    public String getCuloare() { return this.culoare; }
    public short getNumarPerechiAripi() { return this.numarPerechiAripi; }
    public int getGreutate() { return this.greutate; }

    public void setNume(String nume) { this.nume = nume; }
    public void setRasa(String rasa) { this.rasa = rasa; }
    public void setCuloare(String culoare) { this.culoare = culoare; }
    public void setNumarPerechiAripi(short numarPerechiAripi) { this.numarPerechiAripi = numarPerechiAripi; }
    public void setGreutate(int greutate) { this.greutate = greutate; }

    @Override
    public String toString() {
        return "----------Dragon--------\n" +
                "Numele: " + this.nume + "\n" +
                "Rasa: " + this.rasa + "\n" +
                "Culoarea: " + this.culoare + "\n" +
                "Numarul perechilor aripilor: " + this.numarPerechiAripi + "\n" +
                "Greutatea: " + this.greutate + "\n";
    }
}
