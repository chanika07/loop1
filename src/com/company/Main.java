package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int x = sc.nextInt();
	for(int i=0;i<x;i++){
	    int s = sc.nextInt();
	    if (s>=80){
            System.out.print("4 ");
        }
	    else if(s>=75){
            System.out.print("3.5 ");
        }
	    else if (s>=70){
            System.out.print("3 ");
        }
	    else if (s>=65){
            System.out.print("2.5 ");
        }
	    else if(s>=60){
            System.out.print("2 ");
        }
	    else if (s>=55){
            System.out.print("1.5 ");
        }
	    else if (s>=50){
            System.out.print("1 ");
        }
	    else{
            System.out.print("0 ");
        }
        }
    }
}
