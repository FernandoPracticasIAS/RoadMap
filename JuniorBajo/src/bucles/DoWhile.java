package bucles;


// A difierencia el while el dowhile primero ejecuta y luego valida
public class DoWhile {
    int count = 1;

    public void doWhileFunction(){

        boolean flag = false;

        do {
            System.out.println("Vuelta: #" + this.count);
            this.count++;
        }while (this.count != 4);
    }

    static void main() {
        DoWhile doWhile = new DoWhile();
        doWhile.doWhileFunction();

    }
}
