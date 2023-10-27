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

            case "Dragon":
                System.out.println("Perfect! Acum introdu parametrii: Denumirea(String), Categoria(String), Nota medie(Short), Vizionarile(int), " +
                        "Vizionat(boolean), Descrierea(String) delimitati prin 'enter':\n");
                String nume = scanner.next();
                String rasa = scanner.next();
                String culoare = scanner.next();
                short numarPerechiAripi = scanner.nextShort();
                int greutate = scanner.nextInt();
                Dragon dragon = new Dragon(nume, rasa, culoare, numarPerechiAripi, greutate);
                System.out.println(dragon.toString());

                System.out.println("Daca doriti sa schimbati un atribut introduceti denumirea atributului iar mai jos valoarea");
                System.out.println("Sau introduceti 'Afisare' pentru a afisa obiectul");
                String atribut1 = scanner.next();

                switch (atribut1) {
                    case "Numele":
                        String atributValueNume = scanner.next();
                        dragon.setNume(atributValueNume);
                        System.out.println(dragon.getNume());
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

                break;
        }

    }
}