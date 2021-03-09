package dz2;

import java.util.*;

public class Dz1 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in, "windows-1251");
        
        int cont = 1;
        
        while(cont == 1) {
            System.out.println("Введите название проигрывателя: ");
            String name = in.nextLine();
            Device dev1 = new Device(name);
        
            System.out.println("Введите название песни: ");
            String songName = in.nextLine();
            System.out.println("Введите исполнителя: ");
            String musName = in.nextLine();
            Song song = new Song(songName, musName);
        
            System.out.println("Введите название носителя: ");
            String medName = in.nextLine();
            System.out.println("Введите название проигрывателя, подходящего для этого носителя: ");
            String d = in.nextLine();
            Device dev2 = new Device(d);
            
            Media media = new Media(medName, song, dev2);
        
            dev1.play(media);
            
            System.out.println("Хотите повторить? (0 - нет, 1 - да)");
            cont = in.nextInt();
            in.nextLine();
            
            System.out.println("----------------------------------");
        }
        System.out.println("До свидания!");
    }
}
