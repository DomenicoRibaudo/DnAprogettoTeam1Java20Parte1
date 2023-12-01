public class Team {
    public static void main(String[] args) {

        Domenico domenico1 = new Domenico("Domenico", "Ribaudo", 23, "Palermo", "Gym",
                "Pizza", "Marvel Spiderman", "AmericanPsycho", "Harry Potter", "Sid");
        System.out.println(domenico1);


        //creo l'oggetto
        Chiara chiara = new Chiara("Chiara", "Carvelli", 27, "Milano",
                "Musica", "Mango", "Warcraft 3", "Interstellar",
                "Lovecraft", "Nadir");
        //stampa oggetto
        System.out.println(chiara);


        Antonino antoninopagana = new Antonino("Antonino", "Pagana", 20, "Catania", "Netflix", "Sushi", "FIFA",
            "Now You See Me", "' '", "' '");
        System.out.println(antoninopagana);


        Andriy andriy1 = new Andriy("Andriy", "Bardakhivskyy", 26, "Montecchio Emilia", "trekking", "pasta",
                "StrongHold", "Pulp Fiction", "Un sacchetto di biglie", "");
        System.out.println(andriy1);

    }
}