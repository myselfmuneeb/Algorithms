public class PalindromeNumbers {
    public boolean isPalindrome(int x) {
        String xStr = Integer.toString(x);
        char[] xArr = xStr.toCharArray();
        int lastElement = xArr.length-1;
        for(int i = 0; i<xArr.length/2; i++){
            if(xArr[i] != xArr[lastElement]){
                return false;
            }
            lastElement--;
        }
        return true;
    }
}
