package edu.cnm.deepdive;

import java.util.Arrays;

public class JavaVariableArguments {

//  public static void main(String[] args) {
//
//  }

  public static void main(String...args) {
    System.out.println(args.length);//prints 0
    System.out.println(Arrays.toString(args));//prints []
  }//is also a valid main method

  //when changing the configuration the program arguments to java is cool, length becomes 4 and it
  //prints [java, 8, is cool]



}
