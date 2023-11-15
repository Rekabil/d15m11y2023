package bilgenkaanremzi.d15m11y2023.composite;

import java.util.List;

public class Libro implements Stampa{
   private List<Sezione> sezioni;
   private List<String> autori;
   private int prezzo;

    public Libro(List<Sezione> sezioni, List<String> autori, int prezzo) {
        this.sezioni = sezioni;
        this.autori = autori;
        this.prezzo = prezzo;
    }

    public List<Sezione> getSezioni() {
        return sezioni;
    }

    public void setSezioni(List<Sezione> sezioni) {
        this.sezioni = sezioni;
    }

    public List<String> getAutori() {
        return autori;
    }

    public void setAutori(List<String> autori) {
        this.autori = autori;
    }

    public int getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(int prezzo) {
        this.prezzo = prezzo;
    }


    @Override
    public String stampaSezione() {
        sezioni.forEach(sezione ->  System.out.println(sezione.toString()));
        return null;
    }

    @Override
    public String stampaLibro() {
        return "Libro{" +
                "sezioni=" + sezioni +
                ", autori=" + autori +
                ", prezzo=" + prezzo +
                '}';
    }

    @Override
    public String stampaPagina() {
        return null;
    }

    @Override
    public int numPagine() {
        return 0;
    }
}
