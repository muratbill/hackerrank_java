package JavaIterator;

import java.util.*;
public class Main {

    static Iterator func(ArrayList mylist) {
        Iterator it = mylist.iterator();
        while (it.hasNext()) {
            Object element = it.next();
            //if (element instanceof )//Hints: use instanceof operator
            if (element instanceof String && ((String) element).equals("###"))


               break;


        }


        return it;

    }
}