import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args){
        Map<Integer, java.lang.String> userById = new HashMap<>();
        userById.put(1, "⽥中");
        userById.put(2, "鈴⽊");
        userById.put(3, "⼭⽥");
    }
    static {
        try {
            System.out.println(findUserById(4));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static java.lang.String findUserById(int id) throws Exception {
        Map<Integer, java.lang.String> userById = new HashMap<>();
        userById.put(1, "⽥中");
        userById.put(2, "鈴⽊");
        userById.put(3, "⼭⽥");
        java.lang.String userName = userById.get(id);
        if (userName == null) {
            throw new Exception("no user found. id: " + id);
        }
        return userName;
    }
}