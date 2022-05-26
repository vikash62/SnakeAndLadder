package com.bridgelabz.SnakeAndLadder;

//Day 4 Snake And Ladder Simulator
public class SnakeAndLadder
{
  private static final int NO_PLAY = 0;
  private static final int LADDER = 1;
  private static final int SNAKE = 2;
  private static final int MAX_POSITION = 100;
  private static final int MIN_POSITION = 0;

  public static int getRandomInteger(int maximum, int minimum){
      return ((int) (Math.random()*(maximum - minimum))) + minimum;
  }

  public static void main(String[] args) {

      System.out.println("---------- Welcome to the Game of SNAKES AND LADDERS!! ----------");

      int positionA = 0;
      int diceCount = 0;

      while(positionA < MAX_POSITION) {

          int dice = getRandomInteger(7,1);
          diceCount ++;
//			System.out.println("dice : "+dice);
          int checkPlay = (int) Math.floor(Math.random()*10)%3;
//			System.out.println("checkplay : "+checkPlay);

          switch(checkPlay) {
              case NO_PLAY:
                  break;

              case LADDER:
                  positionA += dice;
                  if(positionA > MAX_POSITION) {
                      positionA = positionA-dice;
                  }
                  break;

              case SNAKE:
                  positionA -= dice;
                  if(positionA < MIN_POSITION ) {
                      positionA = 0;
                  }
                  break;
          }
          System.out.println("Position after Die Roll "+diceCount+" : "+positionA);
      }
      System.out.println("Total Dice Rolls : "+diceCount);
  }
}