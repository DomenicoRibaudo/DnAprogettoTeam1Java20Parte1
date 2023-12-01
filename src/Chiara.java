public class Chiara {
    //queste sono le proprietà
    public String nome;
    public String cognome;
    public int eta;
    public String citta;
    public String passatempo;
    public String ciboPreferito;
    public String giocoPreferito;
    public String filmPreferito;
    public String libroPreferito;
    public String nomeCucciolo;

    //faccio il costruttore
    public Chiara(String nome, String cognome, int eta, String citta, String passatempo,
                  String ciboPreferito, String giocoPreferito, String filmPreferito,
                  String libroPreferito, String nomeCucciolo) {
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

    //metodo toString per vedere in maniera leggibile
    @Override
    public String toString() {
        return "Chiara{" +
                "nome='" + nome + '\'' +
                ", cognome='" + cognome + '\'' +
                ", età=" + eta +
                ", città='" + citta + '\'' +
                ", passatempo='" + passatempo + '\'' +
                ", cibo preferito='" + ciboPreferito + '\'' +
                ", gioco preferito='" + giocoPreferito + '\'' +
                ", film preferito='" + filmPreferito + '\'' +
                ", libro preferito='" + libroPreferito + '\'' +
                ", nome del cucciolo='" + nomeCucciolo + '\'' +
                '}';
    }
}
