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

		//1순위. 여분이 있는 사람이 도난 당한 경우 여분과 도난에서 제거
		int[] lt = Arrays.stream(lost).filter(v1 -> !Arrays.stream(reserve).anyMatch(v2 -> v1 == v2)).toArray();
		int[] rv = Arrays.stream(reserve).filter(v1 -> !Arrays.stream(lost).anyMatch(v2 -> v1 == v2)).toArray();

		answer = n - lt.length;
		System.out.println("n - lt.length: " + answer);
		for( int i=0; i<lt.length; i++ ) {
			System.out.print(lt[i] + " ");
		}
		System.out.println("");
		for( int i=0; i<rv.length; i++ ) {
			System.out.print(rv[i] + " ");
		}
		System.out.println("");


		//2순위 도난번호-1, 도난번호+1 값을 구한다.
		for( int i=0; i<lt.length; i++ ) {

			int a1 = lt[i] - 1; //1
			int b1 = lt[i] + 1; //3

			for( int j=0; j<rv.length; j++ ) {
				if( rv[j] == 0 ) continue;
				System.out.println("rv[" + j + "]: " + rv[j]);
				
				//3순위 값이 여분에 있으면 수업 가능.
				if( rv[j] == a1 || rv[j] == b1 ) {
					answer++;
					rv[j] = 0;
					break;
				}
			}
		}
		System.out.println(answer);

        return answer;
    }

	public static void main(String[] args) throws Exception {
		int n = 5;
		int[] lost = new int[] {2,4};
		int[] reserve = new int[] {1,3,5};

		// int n = 5;
		// int[] lost = new int[] {2,4};
		// int[] reserve = new int[] {3};

		// int n = 3;
		// int[] lost = new int[] {3};
		// int[] reserve = new int[] {1};

		// int n = 5;
		// int[] lost = new int[] {1,2,3,4,5};
		// int[] reserve = new int[] {1};

//		int n = 8;
//		int[] lost = new int[] {3};
//		int[] reserve = new int[] {1,5};

		new Main().solution(n, lost, reserve);
	}
}
