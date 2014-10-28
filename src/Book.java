import java.util.ArrayList;

/**
 * Created by homic1de on 28.10.2014.
 */
public class Book {
    public static ArrayList users = new ArrayList();

    public static void add(String name, String number){
        User user = new User(name, number);
        users.add(user);

    }

    public static void delete(int index){
        users.remove(index);


    }
    public static void show(){
        for(int i = 0; i< users.size(); i++){
            User user = (User) users.get(i);
            System.out.println(i+ " "+ user.name + " " +user.number);

        }

    }

}

