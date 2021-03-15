package dz2;

public class Media {
    /**
     * Поле названия носителя
     */
    private String media;
    
    /**
     * Поле песни
     */
    private Song song;
    
    /**
     * Конструктор по умолчанию
     */
    public Media() {
        media = "Unknown";
        song = new Song();
    }
    
    /**
     * Конструктор с опредлеленными значениями
     * @param _media - название носителя
     * @param _song - песня
     */
    public Media(String _media, Song _song) {
        media = _media;
        song = _song;
    }
    
    /**
     * Конструктор с опредлеленными значениями
     * @param _media - название носителя
     */
    public Media(String _media) {
        media = _media;
        song = new Song();
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
    
    
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Media othr = (Media) other;
        return (media.compareTo(othr.media) == 0) && song.equals(othr.song);
    }
    
    @Override
    public int hashCode() {
        return media.hashCode() + song.hashCode();
    }
    
    @Override
    public String toString() {
        return "Носитель музыкальной композиции: " + media + "\n" + song;
    }
}
