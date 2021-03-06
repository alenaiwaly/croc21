package dz2;

public class VinylPlayer extends Device {
    /**
     * Конструктор суперкласса с параметром
     */
    public VinylPlayer(){
        super("Виниловая катушка");
    }
    
    /**
     * Метод, который производит попытку воспроизвести песню с виниловой катушки. Если носитель возможно запустить с текущего устройства, то отображается информация о том, что и на чем проигрывается. Иначе сообщается об ошибке.
     * @param media - носитель, который планируется воспроизвести
     */
    public void play (Media media) {
        System.out.println("----------------------------------");
       
        if (media instanceof VinylMedia) {
            System.out.println("Сейчас проигрывается: \n" + media);
        }
        else{
            System.out.println("Винилолвая катушка не может воспроизвести музыку с носителя " + media.getMedia());
        }
        
        System.out.println("----------------------------------");
    }
}

