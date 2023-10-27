import java.util.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("Salut!\nPentru a crea un obiect 'Film', scrieti 'Film\n" +
                "Pentru a crea un obiect 'Poezie', scrieti 'Poezie'\n" +
                "Pentru a crea un obiect 'Dragon', scrieti 'Dragon;\n" +
                "Pentru a crea un obiect 'Ceasca', scrieti 'Ceasca'\n");

        Scanner scanner = new Scanner(System.in);

            String obiect = scanner.next();
            switch (obiect) {
                case "Film":
                    System.out.println("Perfect! Acum introdu parametrii: Denumirea(String), Categoria(String), Nota medie(Short), Vizionarile(int), " +
                            "Vizionat(boolean), Descrierea(String) delimitati prin 'enter':\n");
                    String denumire = scanner.next();
                    String categorie = scanner.next();
                    Short notaMedie = scanner.nextShort();
                    int vizionari = scanner.nextInt();
                    boolean vizionat = scanner.nextBoolean();
                    String descriere = scanner.next();
                    Film film = new Film(denumire, categorie, notaMedie, vizionari, vizionat, descriere);
                    System.out.println(film.toString());

                    while (true) {
                        System.out.println("Daca doriti sa schimbati un atribut introduceti denumirea atributului iar mai jos valoarea");
                        System.out.println("Sau introduceti 'Afisare' pentru a afisa obiectul");
                        String atribut = scanner.next();

                        switch (atribut) {
                            case "Denumirea":
                                String atributValueDenumire = scanner.next();
                                film.setDenumire(atributValueDenumire);
                                System.out.println(film.getDenumire());
                                break;
                            case "Categoria":
                                String atributValueCategorie = scanner.next();
                                film.setCategorie(atributValueCategorie);
                                System.out.println(film.getCategorie());
                                break;
                            case "Nota Medie":
                                short atributValueNotaMedie = scanner.nextShort();
                                film.setNotaMedie(atributValueNotaMedie);
                                System.out.println(film.getNotaMedie());
                                break;
                            case "Vizionari":
                                int atributValueVizionari = scanner.nextInt();
                                film.setVizionari(atributValueVizionari);
                                System.out.println(film.getVizionari());
                                break;
                            case "Vizionat":
                                boolean atributValueVizionat = scanner.nextBoolean();
                                film.setVizionat(atributValueVizionat);
                                System.out.println(film.getVizionat());
                                break;
                            case "Descriere":
                                String atributValueDescriere = scanner.next();
                                film.setDescriere(atributValueDescriere);
                                System.out.println(film.getDescriere());
                                break;
                            case "Afisare":
                                System.out.println(film.toString());
                                break;
                        }
                    }

                case "Dragon":
                    System.out.println("Perfect! Acum introdu parametrii: Numele(String), Rasa(String), Culoarea(String), Numarul perechilor aripilor(short), " +
                            "Greutatea(int) delimitati prin 'enter':\n");
                    String nume = scanner.next();
                    String rasa = scanner.next();
                    String culoare = scanner.next();
                    short numarPerechiAripi = scanner.nextShort();
                    int greutate = scanner.nextInt();
                    Dragon dragon = new Dragon(nume, rasa, culoare, numarPerechiAripi, greutate);
                    System.out.println(dragon.toString());

                    while (true) {
                        System.out.println("Daca doriti sa schimbati un atribut introduceti denumirea atributului iar mai jos valoarea");
                        System.out.println("Sau introduceti 'Afisare' pentru a afisa obiectul");
                        String atribut1 = scanner.next();

                        switch (atribut1) {
                            case "Numele":
                                String atributValueNume = scanner.next();
                                dragon.setNume(atributValueNume);
                                System.out.println(dragon.getNume());
                                break;
                            case "Rasa":
                                String atributValueRasa = scanner.next();
                                dragon.setRasa(atributValueRasa);
                                System.out.println(dragon.getRasa());
                                break;
                            case "Culoarea":
                                String atributValueCuloare2 = scanner.next();
                                dragon.setCuloare(atributValueCuloare2);
                                System.out.println(dragon.getCuloare());
                                break;
                            case "Numarul perechilor aripilor":
                                short atributValueNumarPerechiAripi = scanner.nextShort();
                                dragon.setNumarPerechiAripi(atributValueNumarPerechiAripi);
                                System.out.println(dragon.getNumarPerechiAripi());
                                break;
                            case "Greutate":
                                int atributValueGreutate = scanner.nextInt();
                                dragon.setGreutate(atributValueGreutate);
                                System.out.println(dragon.getGreutate());
                                break;
                            case "Afisare":
                                System.out.println(dragon.toString());
                                break;
                        }
                    }

                case "Poezie":
                    System.out.println("Perfect! Acum introdu parametrii: Denumirea(String), Autorul(String), Numarul strofelor(Short), Anul publicarii(int), " +
                            "Descrierea(String) delimitati prin 'enter':\n");
                    String denumire1 = scanner.next();
                    String autor = scanner.next();
                    Short numarStrofe = scanner.nextShort();
                    int anulPublicarii = scanner.nextInt();
                    String descriere1 = scanner.next();
                    Poezie poezie = new Poezie(denumire1, autor, numarStrofe, anulPublicarii, descriere1);
                    System.out.println(poezie.toString());

                    while (true) {
                        System.out.println("Daca doriti sa schimbati un atribut introduceti denumirea atributului iar mai jos valoarea");
                        System.out.println("Sau introduceti 'Afisare' pentru a afisa obiectul");
                        String atribut2 = scanner.next();

                        switch (atribut2) {
                            case "Denumirea":
                                String atributValueDenumire1 = scanner.next();
                                poezie.setDenumire(atributValueDenumire1);
                                System.out.println(poezie.getDenumire());
                                break;
                            case "Autorul":
                                String atributValueAutor = scanner.next();
                                poezie.setDenumire(atributValueAutor);
                                System.out.println(poezie.getAutor());
                                break;
                            case "Numarul de strofe":
                                short atributValueNumarStrofe = scanner.nextShort();
                                poezie.setNumarStrofe(atributValueNumarStrofe);
                                System.out.println(poezie.getNumarStrofe());
                                break;
                            case "Anul publicarii":
                                int atributValueNumarAnul = scanner.nextInt();
                                poezie.setAnulPublicarii(atributValueNumarAnul);
                                System.out.println(poezie.getAnulPublicarii());
                                break;
                            case "Desrierea":
                                String atributValueDesriere1 = scanner.next();
                                poezie.setDescriere(atributValueDesriere1);
                                System.out.println(poezie.getDescriere());
                                break;
                            case "Afisare":
                                System.out.println(poezie.toString());
                                break;
                        }
                    }

                case "Ceasca":
                    System.out.println("Perfect! Acum introdu parametrii: Forma(String), Culoarea(String), Materialul(String), Volumul(double), " +
                            "Toarta(boolean) delimitati prin 'enter':\n");
                    String forma = scanner.next();
                    String culoare1 = scanner.next();
                    String material = scanner.next();
                    double volum = scanner.nextInt();
                    boolean toarta = scanner.nextBoolean();
                    Ceasca ceasca = new Ceasca(forma, culoare1, material, volum, toarta);
                    System.out.println(ceasca.toString());

                    while (true) {
                        System.out.println("Daca doriti sa schimbati un atribut introduceti denumirea atributului iar mai jos valoarea");
                        System.out.println("Sau introduceti 'Afisare' pentru a afisa obiectul");
                        String atribut3 = scanner.next();

                        switch (atribut3) {
                            case "Forma":
                                String atributValueForma = scanner.next();
                                ceasca.setForma(atributValueForma);
                                System.out.println(ceasca.getForma());
                                break;
                            case "Culoarea":
                                String atributValueCulaore1 = scanner.next();
                                ceasca.setCuloare(atributValueCulaore1);
                                System.out.println(ceasca.getCuloare());
                                break;
                            case "Maerialul":
                                String atributValueMaterial = scanner.next();
                                ceasca.setMaterial(atributValueMaterial);
                                System.out.println(ceasca.getCuloare());
                                break;
                            case "Volumul":
                                double atributValueVolum = scanner.nextDouble();
                                ceasca.setVolumL(atributValueVolum);
                                System.out.println(ceasca.getVolumL());
                                break;
                            case "Toarta":
                                boolean atributValueToarta = scanner.nextBoolean();
                                ceasca.setToarta(atributValueToarta);
                                System.out.println(ceasca.getToarta());
                                break;
                            case "Afisare":
                                System.out.println(ceasca.toString());
                                break;
                        }

                        break;
                    }
            }

    }
}