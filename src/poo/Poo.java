package poo;
import java.time.LocalDateTime;

// La programacion orientada a objetos es un paradigma de programacion que buscar abstraer
// los elementos de la vida real que componen un sistema, creanado un molde que refleje las
// caracteristicas de dicho objeto asi como sus accione
public class Poo {
    private String title;
    private LocalDateTime createDate;

    //Los metodos son las funcionalidades propias que tiene cada clase
    //Estos metodos pueden recibir parametros
    //Loa parametros que reciben suelen ser corresponde a atributos de la clase

    //Metodo constructor
    //Este metodo se usa para instanciar las clase, es decir crear el objeto
    public Poo(String title){
        this.title = title;
        this.createDate= LocalDateTime.now();
    }
    public static void main(String[] args) {
        //Instaciamos el objeto usando el constructor que creamos
        Poo objetoPoo = new Poo("El Objeto");
        System.out.println(objetoPoo.title + " se creo el " + objetoPoo.createDate);

    }
    //Cada Atributo debe tener un metodo para obtener su valor - GETTER
    String GetTitle(){
        return this.title;
    }
    LocalDateTime GetCreateDate(){
        return this.createDate;
    }
    // y un metodo para motificar su valor - SETTER
    void setTitle(String newTitle){
        this.title= newTitle;
    }
    void setCreateDate(LocalDateTime newDate){
        this.createDate = newDate;
    }
}

