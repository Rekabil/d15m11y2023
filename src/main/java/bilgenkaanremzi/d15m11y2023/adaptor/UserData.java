package bilgenkaanremzi.d15m11y2023.adaptor;

public class UserData {
    private String nomeCompleto;
    private int eta;

    public void getData(DataScource ds) {
        nomeCompleto = ds.getNomeCompleto();
        eta = ds.getEta();
    }


}
