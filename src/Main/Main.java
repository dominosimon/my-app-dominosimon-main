package Main;

import java.util.ArrayList;
public class Main {
    public static void swapPairs(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i+= 0) {
            String temp = list.get(i);
            list.set(i, list.get(i + 1));
            list.set(i + 1, temp);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<String>();
        strList.add("to");
        strList.add("be");
        strList.add("or");
        strList.add("not");
        strList.add("to");
        strList.add("be");
        strList.add("hamlet");

        swapPairs(strList);
        System.out.println(strList);
    }
}