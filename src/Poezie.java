public class Poezie {
    private String denumire;
    private String autor;
    private short numarStrofe;
    private int anulPublicarii;
    private String descriere;

    Poezie(String denumire, String autor, short numarStrofe, int anulPublicarii, String descriere) {
        this.denumire = denumire;
        this.autor = autor;
        this.numarStrofe = numarStrofe;
        this.anulPublicarii = anulPublicarii;
        this.descriere = descriere;
    }

    public String getDenumire() { return this.denumire; }
    public String getAutor() { return this.autor; }
    public short getNumarStrofe() { return this.numarStrofe; }
    public int getAnulPublicarii() { return this.anulPublicarii; }
    public String getDescriere() { return this.descriere; }

    public void setDenumire(String denumire) { this.denumire = denumire; }
    public void setAutor(String autor) { this.autor = autor; }
    public void setNumarStrofe(short numarStrofe) { this.numarStrofe = numarStrofe; }
    public void setAnulPublicarii(int anulPublicarii) { this.anulPublicarii = anulPublicarii; }
    public void setDescriere(String descriere) { this.descriere = descriere; }

    @Override
    public String toString() {
        return "----------Poezie--------\n" +
                "Denumirea: " + this.denumire + "\n" +
                "Autorul: " + this.autor + "\n" +
                "Numarul de strofe: " + this.numarStrofe + "\n" +
                "Anul publicarii: " + this.anulPublicarii + "\n" +
                "Descrierea: " + this.descriere + "\n";
    }
}
