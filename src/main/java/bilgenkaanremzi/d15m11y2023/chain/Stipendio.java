package bilgenkaanremzi.d15m11y2023.chain;

public class Stipendio extends Filter {
    @Override
    public void doCheck(Ufficiale ufficiale) {
        if (ufficiale.getRole().equals(Role.CAPITANO)){
            System.out.println("Welcome Captain , Your Pay is 2000");
            this.goNext(ufficiale);
        } else if (ufficiale.getRole().equals(Role.MAGGIORE)) {
            System.out.println("Welcome MAJOR , Your Pay is 3000");
            this.goNext(ufficiale);
        } else if (ufficiale.getRole().equals(Role.TENENTE)) {
            System.out.println("Welcome TENET , Your Pay is 4000");
            this.goNext(ufficiale);
        } else if (ufficiale.getRole().equals(Role.COLONNELLO)) {
            System.out.println("Welcome Corporal , Your Pay is 5000");
            this.goNext(ufficiale);
        } else if (ufficiale.getRole().equals(Role.GENERALE)) {
            System.out.println("Welcome GENERAL , Your Pay is 6000");
        }
    }
}
