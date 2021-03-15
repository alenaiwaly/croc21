package dz3;

public class ChessPoint {
    /**
     * Поле координаты x
     */
    private int x;
    
    /**
     * Поле координаты y
     */
    private int y;
    
    /**
     * Поле цвета точки
     */
    private char color;
    
    /**
     * Конструктор по умолчанию
     */
    public ChessPoint(){
        x = 0;
        y = 0;
        color = 'w';
    }
    
    /**
     * Конструктор с определенными параметрами
     * @param _x - координата x
     * @param _y - координата y
     * @throws IllegalArgumentException - исключение недопустимые аргументы
     */
    public ChessPoint (int _x, int _y) throws IllegalArgumentException{
        if (_x < 0 || _x > 7 || _y < 0 || _y > 7) {
            throw new IllegalArgumentException("Координаты должны находиться в диапазоне от 0 до 7");
        }
        x = _x;
        y = _y;
        color = 'w';
    }
    
    /**
     * Конструктор с определенными параметрами
     * @param _x - координата x
     * @param _y - координата y
     * @param c - цвет точки
     * @throws IllegalArgumentException - исключение недопустимые аргументы 
     */
    public ChessPoint (int _x, int _y, char c) throws IllegalArgumentException{
        if (_x < 0 || _x > 7 || _y < 0 || _y > 7) {
            throw new IllegalArgumentException("Координаты должны находиться в диапазоне от 0 до 7");
        }
        if (c != 'w' && c != 'b') {
            throw new IllegalArgumentException("Цвет может быть только черным(b) или белым(w)");
        }
        x = _x;
        y = _y;
        color = c;
    }
    
    /**
     * Метод определния координаты x
     * @param _x - координата x
     * @throws IllegalArgumentException - исключение недопустимые аргументы 
     */
    public void setX(int _x) throws IllegalArgumentException{
        if (_x < 0 || _x > 7) {
            throw new IllegalArgumentException("Координаты должны находиться в диапазоне от 0 до 7");
        }
        x = _x;
    }  
    
    /**
     * Метод определения значения координаты y
     * @param _y - координата y
     * @throws IllegalArgumentException - исключение недопустимые аргументы 
     */
    public void setY(int _y) throws IllegalArgumentException{
        if (_y < 0 || _y > 7) {
            throw new IllegalArgumentException("Координаты должны находиться в диапазоне от 0 до 7");
        }
        y = _y;
    }  
    
    /**
     * Метод определения значения цвета точки
     * @param c - цвет точки
     * @throws IllegalArgumentException - исключение недопустимые аргументы 
     */
    public void setColor(char c) throws IllegalArgumentException{
        if (c != 'w' && c != 'b') {
            throw new IllegalArgumentException("Цвет может быть только черным(b) или белым(w)");
        }
        color = c;
    }  
    
    /**
     * Метод получения значения поля
     * @return - возвращает координаты x
     */
    public int getX() {
        return x;
    }
    
    /**
     * Метод получения значения поля
     * @return - возвращает координаты y
     */
    public int getY() {
        return y;
    }
    
    /**
     * Метод получения значения поля
     * @return - возвращает цвет точки
     */
    public char getColor() {
        return color;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        ChessPoint othr = (ChessPoint) other;
        return x==othr.x && y==othr.y && color == othr.color;
    }
    
    @Override
    public int hashCode() {
        return x+y+color;
    }
    
    @Override
    public String toString() {
        int x1 = x+97;
        String c = (char) x1 + "";
        return c + (y+1);
    }
    
}
