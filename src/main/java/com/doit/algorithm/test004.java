package com.doit.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class test004 {
	public static void main(String[] args) throws IOException{
		
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());
		
		int arrangeCount = Integer.parseInt(stringTokenizer.nextToken());
		int qustionCount = Integer.parseInt(stringTokenizer.nextToken());
		
		int arrange[][] = new int[arrangeCount+1][arrangeCount+1];
		
		for(int i = 1; i<=arrangeCount; i++) {
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			for(int j = 1; j<=arrangeCount; j++) {
				arrange[i][j] = Integer.parseInt(stringTokenizer.nextToken());
			}
		}
		
		int sumArrange[][] = new int[arrangeCount+1][arrangeCount+1];
		
		for(int i = 1; i<=arrangeCount; i++) {
			for(int j = 1; j<=arrangeCount; j++) {
				sumArrange[i][j] = sumArrange[i-1][j] + sumArrange[i][j-1] - sumArrange[i-1][j-1] + arrange[i][j]; 
			}
		}
		
		for(int i = 0 ; i<qustionCount ; i++) {
			
			stringTokenizer = new StringTokenizer(bufferedReader.readLine());
			int x1 = Integer.parseInt(stringTokenizer.nextToken());
			int y1 = Integer.parseInt(stringTokenizer.nextToken());
			int x2 = Integer.parseInt(stringTokenizer.nextToken());
			int y2 = Integer.parseInt(stringTokenizer.nextToken());
			
			int result = sumArrange[x2][y2] - sumArrange[x1 - 1][y2] - sumArrange[x2][y1-1] + sumArrange[x1 - 1][y1 - 1];
			
			System.out.println(result);
		}
		
	}

}
