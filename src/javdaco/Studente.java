package javdaco;
/*
the import go one under the other without blank lines
just before the class, to be imported

 */

/**
 * general comment, for the students class
 */
public class Studente {
    /**
     * this is the security number of the student, declared private
     */
    private String codice_fiscale;
    /**
     * name of the students retrieved with the method, getStudente
     * @see Studente#getStudente()
     */
    private String nome;
    /**
     * surname of the students retrieved with the method, getStudente
     * @see Studente#getStudente()
     */
    private String cognome;

    /**
     *
     * @param codice_fiscale the security number
     * @param nome
     * @param cognome
     */
    public Studente(String codice_fiscale, String nome, String cognome){
        this.codice_fiscale=codice_fiscale;
        this.nome=nome;
        this.cognome=cognome;
    }

    /**
     * method to retrieve the String name surname of the student
     * @return String of the name and the surname
     */
    public String getStudente(){
            return nome+" "+cognome;
    }
}
