package dz2;

public class Song {
    /**
     * Поле названия песни
     */
    private String songName;
    
    /**
     * Поле исполнителя
     */
    private String musician;
    
    /**
     * Конструктор по умолчанию
     */
    public Song() {
        songName = "Unknown";
        musician = "Unknown";
    }
    
    /**
     * Конструктор с определенными параметрами
     * @param _songName - название песни
     * @param _musician - исполнитель
     */
    public Song(String _songName, String _musician){
        songName = _songName;
        musician = _musician;
    }
    
    /**
     * Метод получения значения поля 
     * @return возвращает название песни
     */
    public String getSongName() {
        return songName;
    }
    
    /**
     * Метод получения значения поля 
     * @return возвращает исполнителя
     */
    public String getMusician() {
        return musician;
    }
    
    /**
     * Метод определения названия песни
     * @param _songName - название песни
     */
    public void setSongName(String _songName) {
        songName = _songName;
    }
    
    /**
     *  Метод определения исполнителя
     * @param _musician - исполнитель
     */
    public void setMusician(String _musician) {
        musician = _musician;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        Song othr = (Song) other;
        return (songName.compareTo(othr.songName) == 0) && (musician.compareTo(othr.musician) == 0);
    }
    
    @Override
    public int hashCode() {
        return songName.hashCode() + musician.hashCode();
    }
    
    @Override
    public String toString() {
        return "Исполнитель: " + musician + "\nПесня: " + songName;
    }
    
}
