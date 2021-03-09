package dz2;

public class Media {
    /**
     * Поле названия носителя
     */
    String media;
    
    /**
     * Поле песни
     */
    Song song;
    
    /**
     * Поле подходящего для этого носителя устроqства
     */
    Device device; 
    
    /**
     * Конструктор по умолчанию
     */
    public Media() {
        media = "Unknown";
        song = new Song();
        device = new Device("Универсальный проигрыватель");
    }
    
    /**
     * Конструктор с опредлеленными значениями
     * @param _media - название носителя
     * @param _song - песня
     * @param _device - подходящее устройство
     */
    public Media(String _media, Song _song, Device _device) {
        media = _media;
        song = _song;
        device = _device;
    }
    
    /**
     * Конструктор с опредлеленными значениями
     * @param _media - название носителя
     */
    public Media(String _media) {
        media = _media;
        song = new Song();
        device = new Device("Универсальный проигрыватель");
    }
    
    /**
     * Метод получения значения поля 
     * @return вовзращает название носителя
     */
    public String getMedia(){
        return media;
    }
    
    /**
     * Метод получения значения поля 
     * @return вовзращает песню
     */
    public Song getSong(){
        return song;
    }
    
    /**
     * Метод получения значения поля 
     * @return вовзращает название подходящего устройства
     */
    public Device getDevice(){
        return device;
    }
    
    /**
     * Метод определения носителя
     * @param _media - носитель 
     */
    public void setMedia(String _media) {
        media = _media;
    }
    
    /**
     * Метод определения песни
     * @param _song - песня
     */
    public void setSong(Song _song) {
        song = _song;
    }
    
    /**
     * Метод определения подходящего устройства
     * @param _device - подходящее устройство
     */
    public void setDevice(Device _device){
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
        Media othr = (Media) other;
        return (media.compareTo(othr.media) == 0) && song == othr.song && device == othr.device;
    }
    
    @Override
    public int hashCode() {
        return media.hashCode() + song.hashCode() + device.hashCode();
    }
    
    @Override
    public String toString() {
        return "Носитель музыкальной композиции: " + media + "\n" + song;
    }
}
