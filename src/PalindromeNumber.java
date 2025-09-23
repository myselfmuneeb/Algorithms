public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println(isPalindrome(10101));
    }

    public static boolean isPalindrome(int x) {
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
