package dz3;

import java.util.Arrays;

public class ChessBoard {
    /**
     * Поле массива с координатами точек на доске
     */
    private ChessPoint[] coords;
    
    /**
     * Поле доски
     */
    private char[][] board;
    
    /**
     * Конструктор по умолчанию
     */
    public ChessBoard(){
        coords = new ChessPoint[0];
        board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = ' ';
            }
        }
    }
    
    /**
     * Конструктор с определнными параметрами 
     * @param mC - массив координат
     */
    public ChessBoard(ChessPoint[] mC){
        coords = mC.clone();
        board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = ' ';
            }
        }
        for (int i = 0; i < coords.length; i++) {
            board[7 - coords[i].getX()][coords[i].getY()] = coords[i].getColor();
        }
        
    }
    
    /**
     * Метод определения массива координат 
     * @param mC - массив координат точек
     */
    public void setCoords(ChessPoint[] mC) {
        coords = mC.clone();
        board = new char[8][8];
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                board[i][j] = ' ';
            }
        }
        for (int i = 0; i < coords.length; i++) {
            board[7 - coords[i].getX()][coords[i].getY()] = coords[i].getColor();
        }
    }
    
    /**
     * Метод получения значения поля
     * @return возвращает массив точек
     */
    public ChessPoint[] getCoords(){
        return coords;
    }
    
    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || getClass() != other.getClass()) {
            return false;
        }
        ChessBoard othr = (ChessBoard) other;
        return Arrays.equals(coords, othr.coords);
    }
    
    @Override
    public int hashCode() {
        return Arrays.hashCode(coords);
    }
    
    @Override
    public String toString() {
        String brd = " |a|b|c|d|e|f|g|h| \n";
        for (int i = 0; i < 8; i++) {
            brd += "------------------\n";
            brd += (8-i);
            for (int j = 0; j < 8; j++) {
                brd+= "|"+board[i][j];
            }
            brd += "|"+(8-i)+"\n";
        }
        brd += "------------------\n";
        brd += " |a|b|c|d|e|f|g|h| \n";
        return brd;
    }
    
}
