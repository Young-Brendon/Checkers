/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.checkers.models;


import byui.cit260.checkers.exceptions.GameException;
import byui.cit260.checkers.enums.ErrorType;
import java.awt.Point;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author BDawg
 */
public class Board extends AbstractTableModel {
    
    int rowCount = 8;
    int columnCount = 8;    
    private String name;
    private Point boardDimensions = new Point();
    private Player[][] boardLocations;
    
    public Board() {
    }
    
    public Board(int noRows, int noColumns) {
        this.boardDimensions.setLocation(noRows, noRows);
        this.boardLocations = new Player[noRows][noColumns];
    }
    
     public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
     public Point getBoardDimensions() {
        return boardDimensions;
    }

    public void setBoardDimensions(Point boardDimensions) {
        this.boardDimensions = boardDimensions;
    }

    public Player[][] getBoardLocations() {
        return boardLocations;
    }

    public void setBoardLocations(Player[][] boardLocations) {
        this.boardLocations = boardLocations;
    }
    
    @Override
    public int getRowCount() {
        return (int) this.boardDimensions.getX();
    }
    
    @Override
    public int getColumnCount() {
        return (int) this.boardDimensions.getY();
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        return boardLocations[rowIndex][columnIndex];
    } 
    
    public Player getPlayerAt(int row, int column) {
        return this.boardLocations[row][column];
    }
    
    public void clearTheBoard() {
        for (int i = 0; i < this.boardLocations.length; i++) {
            Player[] rowlocations = this.boardLocations[i];
            for (int j = 0; j < rowlocations.length; j++) {
                Player location = rowlocations[j];
                location = null;
            }
        }
    }
    
    
 public void occupyLocation(Player player, int row, int column) throws GameException {        

         Player playerAtLocation = this.boardLocations[row][column];

        if (playerAtLocation != null) { // location already occupied
           throw new GameException(ErrorType.ERROR203.getMessage());
        }
        this.boardLocations[row][column] = player;
    }
    
    public class Location {

        private int row;
        private int column;
        private String value;
        private Player player;

        Location() {    
        }

        int getRow() {
            return row;
        }

        void setRow(int row) {
            this.row = row;
        }

        int getColumn() {
            return column;
        }

        void setColumn(int column) {
            this.column = column;
        }

        String getValue() {
            return value;
        }

        void setValue(String value) {
            this.value = value;
        }

        Player getPlayer() {
            return player;
        }

        public void setPlayer(Player player) {
            this.player = player;
        }

        String[] getCoordinates() {
            String[] coordinates = new String[2];
            Integer intRow = this.getRow() + 1;
            Integer intColumn = this.getColumn() + 1;
            coordinates[0] = intRow.toString();
            coordinates[1] = intColumn.toString();
            return coordinates;
        }
    }
    
}
