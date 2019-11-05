package com.sartorelli.model;

import java.util.Random;

public class Computer {

    private int xPosition;
    private int yPosition;

    public int getxPosition() {
        return xPosition;
    }

    public int getyPosition() {
        return yPosition;
    }

    public void takeDecision(Game game, char difficult) {
        String analyze = "\0";

        System.out.println(difficult);
        switch (difficult) {
            case 'F':
                choosePosition(game);
                return;
            case 'M':
                analyze = mediumAnalyze(game);
                break;
            case 'D':
                analyze = hardAnalyze(game);
                break;
        }

        //if(game.getLatestPosition() != null) {
        if(!analyze.equalsIgnoreCase("null")) {

            //analyze(game); //teste
            System.out.printf("fim\n" + game.getLatestPosition() + " | " + analyze + "\n"); //Conferência

            //if(game.getLatestPosition().substring(0,1).equalsIgnoreCase("r")) { //rows
            if(analyze.substring(0,1).equalsIgnoreCase("r")) {
                System.out.println("r");
                for(int i = 0; i < 3; i++) {
                    //if(game.checkPosition(Integer.parseInt(game.getLatestPosition().substring(1, 2)) + 1, i + 1)) {
                    if(game.checkPosition(Integer.parseInt(analyze.substring(1, 2)) + 1, i + 1)) {
                        //this.xPosition = Integer.parseInt(game.getLatestPosition().substring(1, 2)) + 1;
                        this.xPosition = Integer.parseInt(analyze.substring(1, 2)) + 1;
                        this.yPosition = i + 1;
                        return;
                    }
                }
                this.choosePosition(game);
            //}else if(game.getLatestPosition().substring(0,1).equalsIgnoreCase("c")) { //columns
            }else if(analyze.substring(0,1).equalsIgnoreCase("c")) {
                System.out.println("c");
                for(int i = 0; i < 3; i++) {
                    //if(game.checkPosition(i + 1,Integer.parseInt(game.getLatestPosition().substring(1, 2)) + 1)) {
                    if(game.checkPosition(i + 1,Integer.parseInt(analyze.substring(1, 2)) + 1)) {
                        this.xPosition = i + 1;
                        //this.yPosition = Integer.parseInt(game.getLatestPosition().substring(1, 2)) + 1;
                        this.yPosition = Integer.parseInt(analyze.substring(1, 2)) + 1;
                        return;
                    }

                }
                this.choosePosition(game);
            //}else if(game.getLatestPosition().substring(0,2).equalsIgnoreCase("d1")) { //diagonal 1
            }else if(analyze.substring(0,2).equalsIgnoreCase("d1")) {
                System.out.println("diag1");
                for(int i = 0; i < 3; i++) {
                    for (int j = i; j <= i; j++) {
                        if(game.checkPosition(i + 1,j + 1)) {
                            this.xPosition = i + 1;
                            this.yPosition = j + 1;
                            return;
                        }
                    }
                }
                this.choosePosition(game);
            //}else if(game.getLatestPosition().substring(0,2).equalsIgnoreCase("d2")) { //diagonal 2
            }else if(analyze.substring(0,2).equalsIgnoreCase("d2")) {
                System.out.println("diag2");
                for(int i = 0; i < 3; i++) {
                    for(int j = 2 - i; j <= 2 - i; j++) {
                        System.out.println(game.checkPosition(i + 1,j + 1));
                        if(game.checkPosition(i + 1,j + 1)) {
                            this.xPosition = i + 1;
                            this.yPosition = j + 1;
                            return;
                        }
                    }
                }
                this.choosePosition(game);
            }
        }else{
            this.choosePosition(game);
        }
    }


    public void choosePosition(Game game) {
        System.out.println("random");

        Random rand = new Random();
        Boolean cond = false;

        while (cond == false) {
            int x = rand.nextInt(3);
            int y = rand.nextInt(3);
            if(game.checkPosition(x + 1,y + 1)) {
                this.xPosition = x + 1;
                this.yPosition = y + 1;
                cond = true;
            }
        }
    }



    private String mediumAnalyze(Game game) {

        //verify rows
        for(int i = 0; i < 3; i++) {
            int adder = 0;
            for(int j = 0; j < 3; j++) {
                if(game.getPositions()[i][j] != null) {
                    if(game.getPositions()[i][j].equalsIgnoreCase("x")) adder++;
                    if(adder == 2) return "r" + String.valueOf(i);
                }
            }
        }

        //verify columns
        for(int i = 0; i < 3; i++) {
            int adder = 0;
            for(int j = 0; j < 3; j++) {
                if(game.getPositions()[j][i] != null) {
                    if(game.getPositions()[j][i].equalsIgnoreCase("x")) adder++;
                    if(adder == 2)  return "c" + String.valueOf(i);
                }
            }
        }

        //verify diagonals
        int adder = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = i; j <= i; j++) {
                if(game.getPositions()[i][j] != null) {
                    if(game.getPositions()[i][j].equalsIgnoreCase("x")) adder++; ///nivel 2
                    if(adder == 2) return "d1";
                }
            }
        }
        adder = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 2 - i; j <= 2 - i; j++) {
                if(game.getPositions()[i][j] != null) {
                    if(game.getPositions()[i][j].equalsIgnoreCase("x")) adder++; ///nivel 2
                    if(adder == 2) return "d2";
                }
            }
        }

        return "null";
    }

    private String hardAnalyze(Game game) {
        //verify rows
        for(int i = 0; i < 3; i++) {
            int adder = 0;
            for(int j = 0; j < 3; j++) {
                if(game.getPositions()[i][j] != null) {
                    if(game.getPositions()[i][j].equalsIgnoreCase("x")) adder++;
                    if(game.getPositions()[i][j].equalsIgnoreCase("o"))adder = adder - 1;
                    System.out.println("r_" + adder + " - " + String.valueOf(i) +  String.valueOf(j));

                }
            }
            if(adder == 2) return "r" + String.valueOf(i); //return String.valueOf(i) +  String.valueOf(j);
        }

        //verify columns
        for(int i = 0; i < 3; i++) {
            int adder = 0;
            for(int j = 0; j < 3; j++) {
                if(game.getPositions()[j][i] != null) {
                    if(game.getPositions()[j][i].equalsIgnoreCase("x")) adder++;
                    if(game.getPositions()[j][i].equalsIgnoreCase("o"))adder = adder - 1;
                    System.out.println("c_" + adder + " - " + String.valueOf(i) +  String.valueOf(j)); //i - coluna | j - linha

                }
            }
            if(adder == 2) return "c" + String.valueOf(i); //String.valueOf(j) +  String.valueOf(i);
        }

        //verify diagonal 1
        int adder = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = i; j <= i; j++) {
                if(game.getPositions()[i][j] != null) {
                    if(game.getPositions()[i][j].equalsIgnoreCase("x")) adder++;
                    if(game.getPositions()[i][j].equalsIgnoreCase("o"))adder = adder - 1;
                    System.out.println("d1_" + adder + " - " + String.valueOf(i) +  String.valueOf(j));

                }
            }
            if(adder == 2) return "d1"; //String.valueOf(i) +  String.valueOf(j);
        }

        //verify diagonal 2
        adder = 0;
        for(int i = 0; i < 3; i++) {
            for(int j = 2 - i; j <= 2 - i; j++) {
                if(game.getPositions()[i][j] != null) {
                    if(game.getPositions()[i][j].equalsIgnoreCase("x")) adder++;
                    if(game.getPositions()[i][j].equalsIgnoreCase("o"))adder = adder - 1;
                    System.out.println("d2_" + adder + " - " + String.valueOf(i) +  String.valueOf(j));

                }
            }
            if(adder == 2) return "d2"; //String.valueOf(i) +  String.valueOf(j);
        }
        return "null";
    }

}



