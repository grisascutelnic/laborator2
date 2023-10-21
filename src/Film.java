public class Film {
    private String denumire;
    private String categorie;
    private short notaMedie;
    private int vizionari;
    private boolean vizionat;
    private String descriere;

    Film(String denumire, String categorie, short notaMedie, int vizionari, boolean vizionat, String descriere) {
        this.denumire = denumire;
        this.categorie = categorie;
        this.notaMedie = notaMedie;
        this.vizionari = vizionari;
        this.vizionat = vizionat;
        this.descriere = descriere;
    }

    public String getDenumire() { return this.denumire; }
    public String getCategorie() { return this.categorie; }
    public short getNotaMedie() { return this.notaMedie; }
    public int getVizionari() { return this.vizionari; }
    public boolean getVizionat() { return this.vizionat; }
    public String getDescriere() { return this.descriere; }

    public void setDenumire(String denumire) { this.denumire = denumire; }
    public void setCategorie(String categorie) { this.categorie = categorie; }
    public void setNotaMedie(short notaMedie) { this.notaMedie = notaMedie; }
    public void setVizionari(int vizionari) { this.vizionari = vizionari; }
    public void setVizionat(boolean vizionat) { this.vizionat = vizionat; }
    public void setDescriere(String descriere) { this.descriere = descriere; }

    @Override
    public String toString() {
        return "----------Film--------\n" +
                "Denumirea: " + this.denumire + "\n" +
                "Categoria: " + this.categorie + "\n" +
                "Nota medie: " + this.notaMedie + "\n" +
                "Viznionari: " + this.vizionari + "\n" +
                "Vizionat: " + this.vizionat + "\n" +
                "Descrierea: " + this.descriere + "\n";
    }
}
