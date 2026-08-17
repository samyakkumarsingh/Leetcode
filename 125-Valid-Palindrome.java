class Solution { 
    public boolean isPalindrome(String s) { 
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) { 

            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') { 
                str.append(Character.toLowerCase(s.charAt(i))); 
            } 
            else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') { 
                str.append(s.charAt(i)); 
            } 
            else if (s.charAt(i) >= '0' && s.charAt(i) <= '9') { 
                str.append(s.charAt(i)); 
            } 
        } 

        int i = 0;
        int j = str.length() - 1;

        while (i <= j) { 
            if (str.charAt(i) != str.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }

        return true; 
    } 
}