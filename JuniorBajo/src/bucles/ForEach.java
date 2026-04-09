package bucles;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

//la estructura for itena sobre la longitud de la entidad
public class ForEach {
    void forEachFunction(){
        List<String> names = new ArrayList<>();

        names.add("daniel");
        names.add("jose");
        names.add("andre");

        for( String name: names ){

            names.stream().map(String::toUpperCase)
                    .collect(Collectors.toList());
            System.out.println( name );
        }


    }


   public static void main() {

       {
           ForEach forEach = new ForEach();
         forEach.forEachFunction();

       }
   }


}
