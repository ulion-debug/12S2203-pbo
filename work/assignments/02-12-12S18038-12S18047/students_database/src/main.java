import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 12-12S18038  Naomi Simatupang
 * @author 12-12S18047  Ulion Pardede
 */
public class main {
    private static List<String> nims = new ArrayList<>();
    private static List<String> names = new ArrayList<>();

public static void main(String[] args) {
        // TODO code application logic here
        // see https://docs.oracle.com/javase/8/docs/api/java/util/Scanner.html
        Scanner in = new Scanner(System.in);
        String s;
        boolean quit = false;
    do {
        s = in.nextLine();
    // see https://docs.oracle.com/javase/8/docs/api/java/lang/String.html
        String[] tokens = s.split(" ");
        String output = "";
        switch (tokens[0]) {
        case "add":
            add(tokens[1], tokens[2]);
            break;
        case "find":
            output = find(tokens[1]);
            break;
        case "count":
            output = "" + count();
            break;
        case "reset":
            reset();
            break;
        case "exit":
            quit = true;
        }
            if (output.length() > 0) {
                System.out.println(output);
            }
        } 
    while (!quit);
 }

    public static void add(String _nim, String _name) {
    int check =0;
    for (int i = 0; i < nims.size() ;i++){
        if(_nim.equals(nims.get(i))){
            check++;
        }
    }if( check == 0){
        nims.add(_nim);
        names.add(_name);
    }
 }
public static String find(String _nim) {
    int index = nims.indexOf(_nim);
    if (index >= 0) {
        return nims.get(index) + " " + names.get(index);
    }
    return "";

}
    public static int count() {
    System.out.println(nims.size());
        return 0;
 }
    public static void reset() {
        nims.clear();
        names.clear();
    }
}
    
