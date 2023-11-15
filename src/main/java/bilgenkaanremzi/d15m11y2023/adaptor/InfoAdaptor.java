package bilgenkaanremzi.d15m11y2023.adaptor;

import java.time.LocalDate;
import java.time.Period;

public class InfoAdaptor implements DataScource {
    private Info info;

    @Override
    public String getNomeCompleto() {
        return info.getNome() + " " + info.getCognome();
    }

    @Override
    public int getEta() {
        LocalDate now = LocalDate.now();
        return Period.between(info.getDataDiNascita(),now).getYears();
    }


}
