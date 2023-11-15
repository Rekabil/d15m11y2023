package bilgenkaanremzi.d15m11y2023.composite;

import java.util.List;

public class SottoSezione extends Sezione{
    private List<Pagina> paginaList;

    public SottoSezione(List<Pagina> paginaList) {
        this.paginaList = paginaList;
    }

    public List<Pagina> getPaginaList() {
        return paginaList;
    }

    public void setPaginaList(List<Pagina> paginaList) {
        this.paginaList = paginaList;
    }
}
