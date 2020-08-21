import java.util.HashMap;

/**
 * Author:zhengshanjian
 * Date:2020/8/12
 * Desc:
 */
public class MyTest {
    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("aa","11");
        String aa = map.put("aa","22");
//        System.out.println(aa);
//        System.out.println(map);

        int len =9;
        for (int i=1; i<10; i++){
            String is = String.valueOf(i);
            int n = (is.hashCode() & len);
            n |= n >>> 1;
            System.out.println(n);
        }

        String Str = new String("16");
//        System.out.println("字符串的哈希码为 :" + Str.hashCode() );

    }
}
