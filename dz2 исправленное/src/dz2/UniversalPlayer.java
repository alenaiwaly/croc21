package dz2;

public class UniversalPlayer extends Device {
    /**
     * Конструктор суперкласса с параметром
     */
    UniversalPlayer(){
        super("Универсальный проигрыватель");
    }
    
    /**
     * Метод, который производит попытку воспроизвести песню с Универсального проигрывателя. если носитель возможно запустить с текущего устройства, то отображается информация о том, что и на чем проигрывается. Иначе сообщается об ошибке.
     * @param media - носитель, который планируется воспроизвести
     */
    public void play (Media media) {
        System.out.println("----------------------------------");
       
        if (media instanceof FlashMedia || media instanceof CDMedia) {
            System.out.println("Сейчас проигрывается: \n" + media);
        }
        else{
            System.out.println("Универсальный проигрыватель не может воспроизвести музыку с носителя " + media.getMedia());
        }
        
        System.out.println("----------------------------------");
    }
}
