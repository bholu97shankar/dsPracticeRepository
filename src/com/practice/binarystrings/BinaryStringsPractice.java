package com.practice.binarystrings;

import java.util.Arrays;
import java.util.HashMap;

public class BinaryStringsPractice {

	int[] A;
	public BinaryStringsPractice(int n) {
		A= new int[n];
	}
	public void binary(int n) {
		if(n<=0) {
			System.out.println(Arrays.toString(A));
		}
		else {
			A[n-1] =0;
			binary(n-1);
			A[n-1] =1;
			binary(n-1);
		}
	}
	public static void main(String[] args) {
	BinaryStringsPractice binaryStringsPractice = new BinaryStringsPractice(40);
	binaryStringsPractice.binary(40);

	}

}
