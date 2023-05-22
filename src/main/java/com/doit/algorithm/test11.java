package com.doit.algorithm;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class test11 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int A[] = new int[N];
		for(int i=0; i<N; i++) {
			A[i] = sc.nextInt();
		}
		boolean result = true; 
		Stack<Integer> stack = new Stack();
		int num = 1;
		StringBuffer bf = new StringBuffer();
		for(int i=0; i<A.length; i++) {
			int su = A[i];
			if(su >= num) {
				while(su>=num) {
					stack.push(num++);
					bf.append("+\n");
				}
				stack.pop();
				bf.append("-\n");
			}else {
				int n = stack.pop();
				if(n > su) {
					System.out.println("NO");
					result = false;
					break;
				}else {
					bf.append("-\n");	
				}
			}
		}
		
		if(result) {
			System.out.println(bf.toString());
		}
	}
}
