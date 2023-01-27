import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String[] strOld = {"ola","sasha","katja","zina","frozina","tusja","dusja"};
        String[] strNew = new String[1];
        for (String str : strOld) {
//            try {
                strNew[strNew.length - 1] = str;
//            } catch (ArrayIndexOutOfBoundsException e){
//                System.out.println("Error");
//            } finally {
//                System.out.print(1+2);
//            }

        }

        System.out.println(Arrays.toString(strNew));

    }
}