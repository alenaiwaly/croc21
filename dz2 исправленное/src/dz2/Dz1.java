package dz2;

import java.util.*;

public class Dz1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "windows-1251");
        
        int cont = 1;
        
        while(cont == 1) {
            System.out.println("Выберите желаемый проигрыватель(1 - Виниловая катушка, 2 - CD, 3 - Универсальный проигрыватель) ");
            int name = in.nextInt();
            in.nextLine();
            Device dev1;
            if (name == 1){
                dev1 = new VinylPlayer();
            }
            else if (name == 2){
                dev1 = new CDPlayer();
            }
            else if (name == 3) {
                dev1 = new UniversalPlayer();
            }
            else {
                System.out.println("----------------------------------");
                System.out.println("Ошибка ввода. Пожалуйста, повторите попытку.");
                System.out.println("----------------------------------");
                continue;
            }
        
            System.out.println("Введите название песни: ");
            String songName = in.nextLine();
            System.out.println("Введите исполнителя: ");
            String musName = in.nextLine();
            Song song = new Song(songName, musName);
        
            System.out.println("Выберите желаемый носитель(1 - Пластинка, 2 - CD, 3 - Флэш-носитель) ");
            name = in.nextInt();
            in.nextLine();
            Media media;
            if(name == 1){
                media = new VinylMedia();
            }
            else if (name == 2){
                media = new CDMedia();
            }
            else if (name == 3) {
                media = new FlashMedia();
            }
            else {
                System.out.println("----------------------------------");
                System.out.println("Ошибка ввода. Пожалуйста, повторите попытку.");
                System.out.println("----------------------------------");
                continue;
            }
            media.setSong(song);
            dev1.play(media);
            
            System.out.println("Хотите повторить? (0 - нет, 1 - да)");
            cont = in.nextInt();
            in.nextLine();
            
            System.out.println("----------------------------------");
        }
        System.out.println("До свидания!");
    }
}
