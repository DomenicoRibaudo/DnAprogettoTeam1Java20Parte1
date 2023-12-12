package src;

import java.util.Arrays;

public class Team {
    private Student[] students;
    private int variabileAppoggio;

    public Team() {
        this.students = new Student[10];
        this.variabileAppoggio = 0;
    }

    public void addStudent(Student student) {
        if (variabileAppoggio < students.length) {
            students[variabileAppoggio] = student;
            variabileAppoggio++;
        } else {
            System.out.println("Impossibile aggiungere altri studenti, il team è pieno.");
        }
    }

    public void stampaDuplicatiNome() {
        for (int i = 0; i < students.length - 1; i++) {
            if (students[i] == null) {
                continue;
            }

            for (int j = i + 1; j < students.length; j++) {
                if (students[j] == null) {
                    continue;
                }

                if (students[i].getNome().equalsIgnoreCase(students[j].getNome())) {
                    System.out.println("Ci sono due studenti con lo stesso nome: " + students[i].getNome());
                    return;
                }
            }
        }
        System.out.println("Non ci sono studenti con lo stesso nome nel team.");
    }

    public void getStudentiConGiocoPreferito() {
        String result = "";
        for (Student student : students) {

            if (student != null && "LEAGUE OF LEGENDS".equals(student.getVideogiocoPreferito())) {
                System.out.println("I studenti che giocano a LOl sono : " + student.getNome());
            }
            if (student != null && !"LEAGUE OF LEGENDS".equals(student.getVideogiocoPreferito())) {

                System.out.println("Non ci sono studenti che giocano a LOl");
                break;
            }

        }
    }


}
