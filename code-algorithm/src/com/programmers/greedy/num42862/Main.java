package com.programmers.greedy.num42862;


import java.util.Arrays;

/*
 * 문제위치 : https://school.programmers.co.kr/learn/courses/30/lessons/42862
 */
public class Main {

	public int solution(int n, int[] lost, int[] reserve) {

		//체육수업가능한 최대 학생수 구하기
		int answer = 0;

		//n : 학생수
		//lost[] : 체육복 도난 학생 번호
		//reserve[] : 여벌옷이 있는 학생 번호

		//여벌옷은 자신의 자신(0), 앞(-1), 뒤(+1) 사람에게만 빌려줄수 있음.

		//n : 5
		//n[] :        1 2 3 4 5
		//lost[] :     2 4     수업가능(1 3 5)
		//reserve[] :  1 3 5

		//reserve 의 앞(-1), 뒤(+1) 계산해서 lost 와 일치하면 수업 가능

		Arrays.sort(lost);
		Arrays.sort(reserve);

		int[] psbStd = new int[n];
		Arrays.fill(psbStd, 1);

		for( int i=0; i<lost.length; i++ ) {
			psbStd[lost[i]-1] = 0;
		}

		Arrays.stream(psbStd).forEach(System.out::print);
		System.out.println("");

		for( int i=0; i<reserve.length; i++ ) {
			int f = (reserve[i] - 1) - 1;
			int b = (reserve[i] + 1) - 1;

			if( f < 0 ) f = 0;
			if( b >= psbStd.length ) b = b-1;

			if( psbStd[f] == 0 ) {
				psbStd[f] = 1;
			} else if( psbStd[b] == 0 ) {
				psbStd[b] = 1;
			}
		}

		Arrays.stream(psbStd).forEach(System.out::print);
		System.out.println("");
		for( int i=0; i<psbStd.length; i++ ) {
			answer += psbStd[i] == 1 ? 1:0;
		}

		System.out.println(answer);

        return answer;
    }

	public int solution2(int n, int[] lost, int[] reserve) {

		//체육수업가능한 최대 학생수 구하기
		int answer = 0;

		Arrays.sort(lost);
		Arrays.sort(reserve);

		int[] psbStd = new int[n];
		Arrays.fill(psbStd, 1);

		//n = 5
		//idx   = 0 1 2 3 4
		//value = 1 2 3 4 5


		//lost = 2 4
		//idx  = 2 4
		for( int i=0; i<lost.length; i++ ) {
			psbStd[lost[i]-1] = 0;
		}

		Arrays.stream(psbStd).forEach(System.out::print);
		System.out.println("");

		//reserve = 1 3 5
		//1 = 0,1,2
		//3 = 2,3,4
		//5 = 4,5,6

		for( int i=0; i<reserve.length; i++ ) {
			int f = reserve[i] - 1;
			int m = reserve[i];
			int b = reserve[i] + 1;

//			for( int j=0; j<psbStd.length; j++ ) {
//				if( f == 0 ) continue;
//				if( b > psbStd.length ) continue;

			if( f != 0 && psbStd[f - 1] == 0) {
				psbStd[f - 1] = 1;
			} else if( b < psbStd.length && psbStd[b - 1] == 0 ) {
				psbStd[b - 1] = 1;
			} else if( psbStd[m - 1] == 0 ) {
				psbStd[m - 1] = 1;
			}
		}

		Arrays.stream(psbStd).forEach(System.out::print);
		System.out.println("");

		for( int i=0; i<psbStd.length; i++ ) {
			answer += psbStd[i];
		}

		System.out.println(answer);

        return answer;
    }

	public static void main(String[] args) throws Exception {
//		int n = 5;
//		int[] lost = new int[] {2,4};
//		int[] reserve = new int[] {1,3,5};

//		int n = 5;
//		int[] lost = new int[] {2,4};
//		int[] reserve = new int[] {3};

		int n = 3;
		int[] lost = new int[] {3};
		int[] reserve = new int[] {1};

//		int n = 5;
//		int[] lost = new int[] {1,2,3,4,5};
//		int[] reserve = new int[] {1,2,3,5};

//		int n = 8;
//		int[] lost = new int[] {3};
//		int[] reserve = new int[] {1,5};

		new Main().solution2(n, lost, reserve);
	}
}
