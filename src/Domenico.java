public class Domenico {
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


    public Domenico(String nome, String cognome, int eta, String citta, String passatempo,
                    String ciboPreferito, String giocoPreferito, String filmPreferito, String libroPreferito, String nomeCucciolo) {
        this.nome = nome;
        this.cognome = nome;
        this.eta = eta;
        this.citta = citta;
        this.passatempo = passatempo;
        this.ciboPreferito = ciboPreferito;
        this.giocoPreferito = giocoPreferito;
        this.filmPreferito = filmPreferito;
        this.libroPreferito = libroPreferito;
        this.nomeCucciolo = nomeCucciolo;
    }

    @Override
    public String toString() {
        return "Domenico{" +
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
                '}';
    }
}



