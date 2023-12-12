package src;

class Main {
    public static void main(String[] args) {
        Team team = new Team();

        // Creazione di tre studenti
        Student chiara = new Student("Chiara", "Carvelli", 27, "Milano",
                "Musica", "Mango", "Warcraft 3", "Interstellar",
                "Lovecraft", "Nadir");

        Student antonino = new Student("Antonino", "Pagana", 20, "Catania", "Netflix", "Sushi", "FIFA",
                "Now You See Me", "' '", "' '");

        Student domenico = new Student("Domenico", "Ribaudo", 23, "Palermo", "Gym", "Pizza",
                "Marvel Spiderman", "AmericanPsycho", "Harry Potter", "Sid");

        // Aggiunta degli studenti all'oggetto team
        team.addStudent(chiara);
        team.addStudent(antonino);
        team.addStudent(domenico);

        team.stampaDuplicatiNome();
        team.getStudentiConGiocoPreferito();
    }
}