class Solution {
    public boolean isAnagram(String s, String t) {
         char[] arr=s.toCharArray();
         char[] brr=t.toCharArray();
         Arrays.sort(arr);
         Arrays.sort(brr);
         return Arrays.equals(arr,brr);
    }
}
