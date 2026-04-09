package bucles;

import java.util.ArrayList;
import java.util.List;

public class For {
    public void funcionConFor(){

        List<String> listaDenombres = new ArrayList<>();

        listaDenombres.add("Daniel");
        listaDenombres.add("Pedro");
        listaDenombres.add("Juan");

        for (int i = 0; i < listaDenombres.size(); i++){
            System.out.println(listaDenombres.get(i));
        }


    }
    public void main(String[] args){
        For function = new For();
        function.funcionConFor();
    }
}
