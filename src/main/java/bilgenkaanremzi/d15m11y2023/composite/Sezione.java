package bilgenkaanremzi.d15m11y2023.composite;

import java.util.List;

public class Sezione {
    private List<SottoSezione> sezioneList;
    private List<Pagina> paginaList;

    @Override
    public String toString() {
        return "Sezione{" +
                "sezioneList=" + sezioneList +
                ", paginaList=" + paginaList +
                '}';
    }

    public List<SottoSezione> getSezioneList() {
        return sezioneList;
    }

    public void setSezioneList(List<SottoSezione> sezioneList) {
        this.sezioneList = sezioneList;
    }

    public List<Pagina> getPaginaList() {
        return paginaList;
    }

    public void setPaginaList(List<Pagina> paginaList) {
        this.paginaList = paginaList;
    }
}
