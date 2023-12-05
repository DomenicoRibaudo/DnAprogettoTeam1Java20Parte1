package src;

import java.util.Arrays;

public class Student {
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


    public static void getStudentiConGiocoPreferito() {
        String result = "";

        for (Student student : studentsArray) {
            if (student != null && "league of legends".equalsIgnoreCase(student.getGiocoPreferito())) {
                result += student + "\n";
            }


        }
        System.out.println("I giocatori di LOL sono : " + result);

    }





}




