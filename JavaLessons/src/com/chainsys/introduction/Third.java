package com.chainsys.introduction;

public class Third {
public static void main(String args[]) {
byte b = 126;
System.out.println("b : " + b);

short shortMaxValue = 32767;
System.out.println("s1 : " + shortMaxValue);
short shortMinValue = -32768;
System.out.println("s2 : " + shortMinValue);

int intMaxValue = 217483647;
System.out.println("i1 : " + intMaxValue);
int intMinValue = -217483648;
System.out.println("i2 : " + intMinValue);

char c1 = 'A';
System.out.println("c1 = " + c1);
int asciiValueofc1 = (int) c1;
System.out.println(asciiValueofc1);
}
}