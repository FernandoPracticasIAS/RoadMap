package bucles;

public class While {
   private Integer initValue;

    void setInitValue(Integer value){
        this.initValue= value;
    }


public While(Integer initValue){
        this.initValue= initValue;
}


    public void count(int finalValue){




        //El ciclo while es una estructure de control que se mantiene en ejeucion hasta que
        // una condicion dada se cumpla
        while (this.initValue < finalValue ){

            System.out.println("Valor actual: " + this.initValue);
            this.setInitValue(12);
        }

    }
    public static void main(String[] args){
        While objectWhile = new While(1);
        objectWhile.count(10);
        System.out.println("Valor Final:" + objectWhile.initValue);
    }
}
