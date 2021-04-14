package hw;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;

public class hw {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        String[] info = s.split("/");
        Deque<String> stack = new ArrayDeque<>();
        for (String c : info) {
            //System.out.println(c);
            if ((!c.equals("..") && !c.equals(".") ) || (c.equals("..")  && stack.size()==0)) {
                stack.addFirst(c);
            }
            else if (c.equals("..")) {
                //System.out.println(c);
                if (stack.peekFirst().equals("..") ) {
                    stack.addFirst(c);
                }
                else {
                    stack.removeFirst();
                }
            }
        }
        String ans = "";
        int sz = stack.size();
        for (int i = 0; i < sz; i++) {
            //System.out.println(c);
            ans += stack.peekLast();
            if (i != sz-1){
                ans+="/";
            }
            stack.removeLast();
        }
        System.out.println(ans);
    }

}
