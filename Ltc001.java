
    public class Ltc001 {
        public boolean isPalindrome(int x) {
            if (x < 0 || (x % 10 == 0 && x != 0)) {
                return false;
            }
    
            int reversed = 0;
            int original = x;
            while (x > 0) {
                int digit = x % 10;
                reversed = reversed * 10 + digit;
                x /= 10;
            }
            return original == reversed;
        }
    
        public static void main(String[] args) {
            Ltc001 solution = new Ltc001();
            System.out.println("Is 121 a palindrome? " + solution.isPalindrome(121)); // true
            System.out.println("Is -121 a palindrome? " + solution.isPalindrome(-121)); // false
            System.out.println("Is 10 a palindrome? " + solution.isPalindrome(10)); // false
            System.out.println("Is 0 a palindrome? " + solution.isPalindrome(0)); // true
        }
    }

