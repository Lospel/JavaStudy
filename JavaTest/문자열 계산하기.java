class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] tmp = my_string.split(" ");
        answer = Integer.parseInt(tmp[0]);
        for(int i=1; i<tmp.length; i+=2){
            if(tmp[i].equals("+")){
                answer += Integer.parseInt(tmp[i+1]);
            }else{
                answer -= Integer.parseInt(tmp[i+1]);
            }
        }
        return answer;
    }
}