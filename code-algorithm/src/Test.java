public class Test {

	public static int solution(String[] babbling) {
        int answer = 0;

        //String[] cc = new String[] {"aya", "ye", "woo", "ma"};

        for( int i=0; i<babbling.length; i++ ) {

//        	System.out.println("before: babbling[i]: " + babbling[i]);

        	String[] tt = babbling[i].split("aya|ye|woo|ma");

        	if( tt.length == 0 ) {
        		answer++;
        	}
//        	if( checkStartWith(babbling[i], cc) ) {
//        		for( int j=0; j<cc.length; j++ ) {
//            		babbling[i] = babbling[i].replace(cc[j], "");
//            	}
//            	System.out.println("after: babbling[i]: " + babbling[i].length());
//            	if( babbling[i].length() == 0 ) {
//            		System.out.println("answer++");
//            		answer++;
//            	}
//    		}
        }

        System.out.println(answer);

        return answer;
    }

	public static boolean checkStartWith(String v, String[] cc) {

		for( int i=0; i<cc.length; i++ ) {
			if( v.startsWith(cc[i]) ) {
				return true;
			}
		}

		return false;
	}



	public static void main(String[] args) {

//		Test.solution(new String[] {"aya", "yee", "u", "maa", "wyeoo"});
		Test.solution(new String[] {"ayaye", "uuuma", "ye", "yemawoo", "ayaa"});
		//Test.solution(new String[] {"aya ye woo ma woo ma"});
	}
}
