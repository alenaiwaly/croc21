package dz3;

import java.util.Scanner;

public class Dz3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "windows-1251");
        
        ChessBoard cb;
        
        System.out.println("Введите количество фигур, которые Вы хотите расположить на доске");
        
        int cont = in.nextInt();
        int done = 0;
        ChessPoint[] cp = new ChessPoint[cont];
        System.out.println("-------------------------");
        
        while (done < cont) {
            System.out.println("Введите координату по x " + (done+1) + " точки:");
            int x = in.nextInt();
            System.out.println("Введите координату по y " + (done+1) + " точки:");
            int y = in.nextInt();
            System.out.println("Введите цвет "+ (done+1) + " точки:");
            in.nextLine();
            char c = (in.next()).charAt(0);
            System.out.println("-------------------------");
            ChessPoint point = new ChessPoint();
            try {
                point.setX(x);
                point.setY(y);
                point.setColor(c);
            } catch (IllegalArgumentException e) {
                System.out.println(e);
                System.out.println("Повторите попытку ввода.");
                System.out.println("-------------------------");
                continue;
            } 
            boolean flag = false;
            for (int i = 0; i < done; i++) {
                if (cp[i].getX() == x && cp[i].getY() == y) {
                    System.out.println("Точка с такими координатами уже была задана. Пожалуйста, повторите попытку.");
                    System.out.println("-------------------------");
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                cp[done] = point;
                done++;
            }
        }
        cb = new ChessBoard(cp);
        System.out.println("Получившаяся шахматная доска ");
        System.out.println("-------------------------");
        System.out.println(cb);
        
    }
    
}
