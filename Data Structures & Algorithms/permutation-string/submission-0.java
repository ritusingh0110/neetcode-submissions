class Solution {
    public boolean check(String s,String t){
        char[] s1=s.toCharArray();
        char[] s2=t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1,s2);
    }
    public boolean checkInclusion(String s1, String s2) {
        int r=0;
        while(r+s1.length()<=s2.length()){
            StringBuilder sb=new StringBuilder();
            for(int i=r;i<r+s1.length();i++){
                sb.append(s2.charAt(i));
            }
            if(check(sb.toString(),s1)){
                return true;
            }
            r++;
        }
        return false;
    }
}
