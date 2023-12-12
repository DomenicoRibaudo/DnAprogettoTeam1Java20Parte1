package src;

import java.util.Arrays;

public class Student {
    public static final String LEAGUE_OF_LEGENDS = "league of legends";
    private String nome;
    private String cognome;

    private int eta;

    private String citta;

    private String passatempo;

    private String ciboPreferito;

    private String giocoPreferito;

    private String filmPreferito;
    private String libroPreferito;

    private String nomeCucciolo;

    private int numStudenti;

    //TODO queste arry deve esistere su team
    public static  Student[] studentsArray;

    public Student(String nome, String cognome, int eta, String citta, String passatempo,
                   String ciboPreferito, String giocoPreferito, String filmPreferito, String libroPreferito, String nomeCucciolo) {
        this.nome = nome;
        this.cognome = cognome;
        this.eta = eta;
        this.citta = citta;
        this.passatempo = passatempo;
        this.ciboPreferito = ciboPreferito;
        this.giocoPreferito = giocoPreferito;
        this.filmPreferito = filmPreferito;
        this.libroPreferito = libroPreferito;
        this.nomeCucciolo = nomeCucciolo;
        this.studentsArray = new Student[numStudenti];
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public int getEta() {
        return eta;
    }

    public void setEta(int eta) {
        this.eta = eta;
    }

    public String getCitta() {
        return citta;
    }

    public void setCitta(String citta) {
        this.citta = citta;
    }

    public String getPassatempo() {
        return passatempo;
    }

    public void setPassatempo(String passatempo) {
        this.passatempo = passatempo;
    }

    public String getCiboPreferito() {
        return ciboPreferito;
    }

    public void setCiboPreferito(String ciboPreferito) {
        this.ciboPreferito = ciboPreferito;
    }

    public String getGiocoPreferito() {
        return giocoPreferito;
    }

    public void setGiocoPreferito(String giocoPreferito) {
        this.giocoPreferito = giocoPreferito;
    }

    public String getFilmPreferito() {
        return filmPreferito;
    }

    public void setFilmPreferito(String filmPreferito) {
        this.filmPreferito = filmPreferito;
    }

    public String getLibroPreferito() {
        return libroPreferito;
    }

    public void setLibroPreferito(String libroPreferito) {
        this.libroPreferito = libroPreferito;
    }

    public String getNomeCucciolo() {
        return nomeCucciolo;
    }

    public void setNomeCucciolo(String nomeCucciolo) {
        this.nomeCucciolo = nomeCucciolo;
    }

    public Student[] getStudentsArray() {
        return studentsArray;
    }

    public void setStudentsArray(Student[] studentsArray) {
        this.studentsArray = studentsArray;
    }

    //TODO foese è meglio fare anche un metodo che stampa a video in modo più carino (stampaDettagli di tipo void)
    @Override
    public String toString() {
        return "Student{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", eta=" + eta +
                ", citta='" + citta + '\'' +
                ", passatempo='" + passatempo + '\'' +
                ", ciboPreferito='" + ciboPreferito + '\'' +
                ", giocoPreferito='" + giocoPreferito + '\'' +
                ", filmPreferito='" + filmPreferito + '\'' +
                ", libroPreferito='" + libroPreferito + '\'' +
                ", nomeCucciolo='" + nomeCucciolo + '\'' +
                ", studentsArray=" + Arrays.toString(studentsArray) +
                '}';
    }

    //TODO perchè statico? quindi è lo stesso per ogni istanza?
    //TODO questi metodi vanno spostati nella classe team
    public static void getStudentiConGiocoPreferito() {
        String result = "";

        for (Student student : studentsArray) {
            //TODO attenziona gli oggetti sempre con l'equals
            if (student != null && LEAGUE_OF_LEGENDS == (student.getGiocoPreferito())) {
                result += student + "\n";
            }

        }
        System.out.println("I giocatori di LOL sono : " + result);

    }

    public static void stampaStudentiConStessoNome() {
        for (int i = 0; i < studentsArray.length - 1; i++) {
            for (int j = i + 1; j < studentsArray.length; j++) {
                //TODO ci sono condizioni che non servono appensantiscono solo la lettura e il mantenimento
                if (studentsArray[i] != null && studentsArray[j] != null
                        && studentsArray[i].getNome() == (studentsArray[j].getNome())) {
                    System.out.println("Gli studenti " + studentsArray[i] + " e " + studentsArray[j] + " hanno lo stesso nome.");
                }
            }
        }
    }
    public static void stampaStudentiConNomiDuplicati(Studente[] elencoStudenti) {
        // Ciclo attraverso l'array di studenti
        for (int i = 0; i < elencoStudenti.length; i++) {
            for (int j = i + 1; j < elencoStudenti.length; j++) {
                // Confronta il nome dello studente corrente con gli altri studenti nell'array
                if (elencoStudenti[i].getNome().equals(elencoStudenti[j].getNome())) {
                    System.out.println("Studente con nome duplicato: " + elencoStudenti[i]);
                }
            }
        }
    }

}




