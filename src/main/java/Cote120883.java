package class0316;

public class Cote120883 {
    public static void main(String[] args) {
//        kFindKMJ findNum = new kFindKMJ(1, 100, 2);
    }

}

class Solution_kmj {
    public String solution(String[] id_pw, String[][] db) {
        //String answer = "";
        for(int n =0; n<db.length; n++ ){
            if(id_pw[1].equals(db[n][1])){
                if(id_pw[0].equals(db[n][0])) return("login");
                //else return "fail";
            }
            else if( id_pw[0].equals(db[n][0])){
                if( id_pw[1] != db[n][1]) return("wrong pw");
                else return "login";
            }
            //else if(! id_pw[0].equals(db[n][0]))


        }return "fail";
    }
}

class teacher{
    public String solution(String[] id_pw, String[][] db) {
        String answer= "";
        for(int n =0; n<db.length; n++ ){
            if(db[n][0].equals(id_pw[0])){
                if(db[n][1].equals(id_pw[1])){
                    return "login";
                }else return "wrong";
            }else{
                answer = "fail";
            }
        }
        return answer;
    }
}

class coupon{
    public int solution(int chicken) {
        int answer =0;
        //쿠폰
        while(chicken >= 10){// 쿠폰이 10보다 크거나 같을때
            int coupon = chicken % 10;
            //잔여 쿠폰 쿠폰 %10
            answer += chicken / 10;
            chicken = chicken / 10 + coupon;

        }

        return answer;
    }
}

class kFindKMJ {
    public kFindKMJ(int i, int j, int k) {
        int result = 0;
        int num = 100;
        while(i < j+1) {
            // if(i / 100000 == k) {
            //     i -= 100000*k;
            //     result++;
            // }
            // if(i / 10000 == k){
            //     i -= 10000*k;
            //    result++;
            // }
            // if(i / 1000 == k){
            //     i -= 1000*k;
            //     result++;
            // }
            // if(i / 100 == k){
            //     i -= 100*k;
            //     result++;// 100자리 수
            // }
            if (i % 10 == k) {
                result++;
            } //1의 자리 수
            if (i / 10 == k) {
                result++;
            }//10자리 수
            for (int f = 0; f < 4; f++) {
                if (i / num == k) {
                    // i -= num*k;
                    result++;
                } else continue;
                num *= 10;
            }
            i++;
        }
    }

class kFindTVersion{
    public int kFindTVersion(int i, int j, int k) {
        int result = 0;
        String n = String.valueOf(k);
        for(i = i; i<=j; i++){
            String a = String.valueOf(i);
            if(a.contains(n)){
                //1
                String arr[] = a.split("");
                for(String m : arr){
                    if(m.equals(n)) result++;
                }
                    //2
                for(int b =0; b<a.length(); b++){
                    if(String.valueOf(a.charAt(b)).equals(n)) result++;
                    }
                }
            }return result;
        }
    }
}
//가까운 수

class approximation {
    public int approximation(int[] array, int n) {
        int answer = 0;
        int min = Integer.MAX_VALUE;
        int differ =0;
        for(int i = 0; i < array.length; i++){
            //차이 구하기()
            differ = Math.abs(array[i]- n);
            if(differ < min) {
                answer = array[i];
                min = differ;
            }
            else if(differ == min && array[i] <answer) answer = array[i];//최소값이 같으면 더 작은수를 출력한다
        }

        return answer;
    }
}