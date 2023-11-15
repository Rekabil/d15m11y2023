package bilgenkaanremzi.d15m11y2023.chain;

public class RoleCheckerFilter extends Filter{
    @Override
    public void doCheck(Ufficiale ufficiale) {
        if (ufficiale.getRole().equals(Role.CAPITANO)){
            System.out.println("Welcome Captain , the major is your superior");
            this.goNext(ufficiale);
        } else if (ufficiale.getRole().equals(Role.MAGGIORE)) {
            System.out.println("Welcome MAJOR , the tenet is your superior");
            this.goNext(ufficiale);
        } else if (ufficiale.getRole().equals(Role.TENENTE)) {
            System.out.println("Welcome TENET , the Corporal is your superior");
            this.goNext(ufficiale);
        } else if (ufficiale.getRole().equals(Role.COLONNELLO)) {
            System.out.println("Welcome Corporal , the General is your superior");
            this.goNext(ufficiale);
        } else if (ufficiale.getRole().equals(Role.GENERALE)) {
            System.out.println("Welcome GENERAL , You are at the top of the world");
        }
    }
}
