


int[] countCharOccurrences(String A){
int cnt[26];
for(int i=0;i<A.length();i++){
cnt[A.charAt(i)-97]++;
}
return cnt;
}
