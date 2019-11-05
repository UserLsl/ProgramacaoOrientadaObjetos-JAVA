package com.sartorelli.model;

public class Game {

    private String[][] positions;
    private int round;
    private char status; //A - Em Andamento | F - Finalizado | E - Empatou
    private String latestPosition;

    public Game() {
        this.status = 'A';
        this.round = 1;
        this.positions = new String[3][3];
    }

    public String[][] getPositions() {
        return positions;
    }

    public int getRound() {
        return round;
    }

    public char getStatus() {
        return status;
    }

    public String getLatestPosition() {
        return latestPosition;
    }

    public boolean checkPosition(int row, int column) {
        return this.positions[row - 1][column - 1] == null;
    }

    public void addToTable(String symbol, int row, int column) {
        if(row < 1 || row > 3) return;
        if(column < 1 || column > 3) return;
        if(!symbol.equalsIgnoreCase("o") && !symbol.equalsIgnoreCase("x")) return;
        this.positions[row - 1][column - 1] = symbol;
        this.round++;
        if(this.checkWinner(symbol) == 3){
            this.status = 'F';
        }else if(this.checkTie()) this.status = 'E';
    }

    public void printPositions() {
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                System.out.printf("[" + this.positions[i][j] + "]");
            }
            System.out.printf("\n");
        }
    }

    private int checkWinner(String symbol) {
        //verify rows
        for(int i = 0; i < 3; i++) {
            int adder = 0;
            for(int j = 0; j < 3; j++) {
                if(this.positions[i][j] != null) {
                    if(this.positions[i][j].equalsIgnoreCase(symbol)) adder++;
                    if(adder == 2) this.latestPosition = "r" + String.valueOf(i);
                }
            }
            if(adder == 3) return adder;
        }

        //verify columns
        for(int i = 0; i < 3; i++) {
            int adder = 0;
            for(int j = 0; j < 3; j++) {
                if(this.positions[j][i] != null) {
                    if(this.positions[j][i].equalsIgnoreCase(symbol)) adder++;
                    if(adder == 2) this.latestPosition = "c" + String.valueOf(i);
                }
            }
            if(adder == 3) return adder;
        }

        //verify diagonals
        int adder = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = i; j <= i; j++) {
                if(this.positions[i][j] != null) {
                    if(this.positions[i][j].equalsIgnoreCase(symbol)) adder++; ///nivel 2
                    //if(adder == 2) this.latestPosition = "d1"; ///nivel 2
                }
            }
            if(adder == 3) return adder;
        }
        if(adder == 2) this.latestPosition = "d1"; ///nivel 3
        adder = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 2 - i; j <= 2 - i; j++) {
                if(this.positions[i][j] != null) {
                    if(this.positions[i][j].equalsIgnoreCase(symbol)) adder++; ///nivel 2
                    //if(adder == 2) this.latestPosition = "d2"; ///nivel 2
                }
            }
            if(adder == 3) return adder;
        }
        if(adder == 2) this.latestPosition = "d2"; ///nivel 3

        return 0;
    }

    private Boolean checkTie() {
        for(int i = 1; i < 4; i++) {
            for(int j = 1; j < 4; j++) {
                if(this.checkPosition(i,j)) {
                    return false;
                }
            }
        }
       return true;
    }
}
