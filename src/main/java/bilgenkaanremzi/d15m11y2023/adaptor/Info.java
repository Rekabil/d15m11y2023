package bilgenkaanremzi.d15m11y2023.adaptor;

import java.time.LocalDate;
import java.util.Date;

public class Info {
    private String nome;
    private String cognome;
    private LocalDate dataDiNascita;

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public LocalDate getDataDiNascita() {
        return dataDiNascita;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setDataDiNascita(LocalDate dataDiNascita) {
        this.dataDiNascita = dataDiNascita;
    }
}
