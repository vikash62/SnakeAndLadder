package com.bridgelabz.SnakeAndLadder;

//Day 4 Snake And Ladder Simulator
public class SnakeAndLadder
{
  public static int getRandomInteger(int maximum, int minimum){
      return ((int) (Math.random()*(maximum - minimum))) + minimum;
  }

  public static void main(String[] args) {

      System.out.println("---------- Welcome to the Game of SNAKES AND LADDERS!! ----------");

      int startPositionA = 0;
      int dice = getRandomInteger(7,1);
      System.out.println(dice);

  }
}