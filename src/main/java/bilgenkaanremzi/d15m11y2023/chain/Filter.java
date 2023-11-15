package bilgenkaanremzi.d15m11y2023.chain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class Filter {
    private Filter next;
    public abstract void doCheck(Ufficiale ufficiale);

    public  void goNext(Ufficiale ufficiale){
        if (this.getNext() != null){
            this.next.doCheck(ufficiale);
        } else {
            System.out.println("Siamo alla fine della catena");
        }
    }
}
