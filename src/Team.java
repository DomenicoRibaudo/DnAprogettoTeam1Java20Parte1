package src;

import src.Student;

import java.util.Arrays;

public class Team {
    public static void main(String[] args) {

        //TODO okey il main ma tutta la logica deve essere nella classe team


        Student domenico = new Student("Domenico", "Ribaudo", 23, "Palermo", "Gym", "Pizza",
                "Marvel Spiderman", "AmericanPsycho", "Harry Potter", "Sid");

        Student chiara = new Student("Chiara", "Carvelli", 27, "Milano",
                "Musica", "Mango", "Warcraft 3", "Interstellar",
                "Lovecraft", "Nadir");

        Student antonino = new Student("Antonino", "Pagana", 20, "Catania", "Netflix", "Sushi", "FIFA",
                "Now You See Me", "' '", "' '");

        Student andry = new Student("Andriy", "Bardakhivskyy", 26, "Montecchio Emilia", "trekking", "pasta",
                "StrongHold", "Pulp Fiction", "Un sacchetto di biglie", "");

        Student[] studentsArray = {domenico, chiara, antonino, andry};
        System.out.println(Arrays.toString(studentsArray));

        //TODO attenzione non si fa mai è una chiamata statica
        domenico.getStudentiConGiocoPreferito();
        Student.stampaStudentiConStessoNome();

    }
}