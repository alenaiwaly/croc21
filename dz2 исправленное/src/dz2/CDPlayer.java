package dz2;

public class CDPlayer extends Device{
    /**
     * Конструктор суперкласса с параметром
     */
    CDPlayer(){
        super("CD");
    }
    
    /**
     * Метод, который производит попытку воспроизвести песню с CD. если носитель возможно запустить с текущего устройства, то отображается информация о том, что и на чем проигрывается. Иначе сообщается об ошибке.
     * @param media - носитель, который планируется воспроизвести
     */
    public void play (Media media) {
        System.out.println("----------------------------------");
       
        if (media instanceof CDMedia) {
            System.out.println("Сейчас проигрывается: \n" + media);
        }
        else{
            System.out.println("CD не может воспроизвести музыку с носителя " + media.getMedia());
        }
        
        System.out.println("----------------------------------");
    }
} 

