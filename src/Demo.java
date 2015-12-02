import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by YB on 02.12.2015.
 */
public class Demo {

    public static void main(String[] args){

        ArrayList<String> list = new ArrayList<String>();

        String str1 = "Kolumbia";
        String str2 = "Brazil";
        String str3 = "Congo";
        String str4 = "Equador";
        String str5 = "Dominicana";
        String str6 = "Ethiopia";
        String str7 = "France";
        String str8 = "Germany";
        String str9 = "Hungary";
        String str10 = "Namibia";

        list.add(str1);
        list.add(str2);
        list.add(str3);
        list.add(str4);
        list.add(str5);
        list.add(str6);
        list.add(str7);
        list.add(str8);
        list.add(str9);
        list.add(str10);

        Collections.sort(list, new StringComparator() {

        });

        for(String str : list){
            System.out.println(str);
        }
    }

}
