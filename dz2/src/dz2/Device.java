package dz2;

public class Device {
    /**
     * Поле название воспроизводящего устройства 
     */
    private String device;
    
    /**
     * Конструктор по умолчанию
     */
    public Device() {
        device = "Unknown";
    }
    
    /**
     * Конструктор с определенным значением
     * @param _device - название воспроизводящего устрйоства
     */ 
    public Device(String _device) {
        device = _device;
    }
    
    /**
     * Метод получения значения поля 
     * @return возвращает название устройства
     */
    public String getDevice(){
        return device;
    }
    
    /**
     * Метод определения воспроизводящего устройства
     * @param _device - устройство
     */
    public void setDevice(String _device) {
        device = _device;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Device dev = (Device) other;
        return (device.compareTo(dev.device) == 0);
    }
    
    @Override
    public int hashCode() {
        return device.hashCode();
    }
    
    @Override
    public String toString() {
        return "Звуковоспроизводящее устройство: " + device;
    }
    
    /**
     * Метод, который производит попытку воспроизвести песню с некоторого носителя. если носитель возможно запустить с текущего устройства, то отображается информация о том, что и на чем проигрывается. Иначе сообщается об ошибке.
     * @param media - носитель, который планируется воспроизвести
     */
    public void play (Media media) {
        System.out.println("----------------------------------");
        if (this.equals(media.getDevice())) {
            System.out.println("Сейчас проигрывается: \n" + media);
        }
        else {
            System.out.println(device +" не может воспроизвести музыку с носителя " + media.getMedia());
        }
        
        System.out.println("----------------------------------");
    }
    
}
