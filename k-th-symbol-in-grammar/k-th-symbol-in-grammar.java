class Solution {
    public int kthGrammar(int n, int k) {
        if(getkthGrammar(n,k)) return 1;
        else return 0;
    }
    public boolean getkthGrammar(int n, int k) {
        if(n==1&&k==1) return  false;

        int mid = (int) Math.round(Math.pow(2,n-1))/2;

        if(k<=mid){
            return getkthGrammar(n-1,k);
        }
        else return !getkthGrammar(n-1, k-mid);

    }
}