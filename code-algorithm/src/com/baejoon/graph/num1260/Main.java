package com.baejoon.graph.num1260;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	int node,line,start,size;
	int[][] arr;
	boolean[] check;

	Queue<Integer> q = new LinkedList<>();

	String dfsResult = "";
	String bfsResult = "";

	private void execute() {
		//dfs statck

//		for(int i=1; i<size; i++ ) {
//			System.out.println(i);
//			for( int j=1; j<size; j++ ) {
//				System.out.print(j + ": " + arr[i][j] + " ");
//			}
//			System.out.println("");
//		}

		dfs(start);
		System.out.println(dfsResult);

		Arrays.fill(check, false);

		bfs(start);
		System.out.println(bfsResult);
	}

	private void dfs(int start) {
		check[start] = true;
		dfsResult += start + " ";

		for( int i=1; i<size; i++ ) {
			if(arr[start][i] == 1 && !check[i]) {
				dfs(i);
			}
		}
	}

	private void bfs(int start) {
		q.add(start);
		check[start] = true;

		while( !q.isEmpty() ) {
			start = q.poll();
			bfsResult += start + " ";

			for( int i=1; i<size; i++ ) {
				if(arr[start][i] == 1 && !check[i]) {
					q.add(i);
					check[i] = true;
				}
			}
		}
	}
	public void solution() throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		st = new StringTokenizer(br.readLine());
		node = Integer.parseInt(st.nextToken());
		line = Integer.parseInt(st.nextToken());
		start = Integer.parseInt(st.nextToken());

		size = node+1;
		arr = new int[size][size];
		check = new boolean[size];

		for( int i = 0; i<line; i++ ) {
			st = new StringTokenizer(br.readLine());

			int v1 = Integer.parseInt(st.nextToken());
			int v2 = Integer.parseInt(st.nextToken());

			arr[v1][v2] = 1;
			arr[v2][v1] = 1;
		}

		execute();
	}

	public static void main(String[] args) throws Exception {
		new Main().solution();
	}
}
