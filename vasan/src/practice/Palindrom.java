package practice;

public class Palindrom {
    public static void main(String[] args) {
        String st = "baabaaabaa";
        int point = 0;
        for (int i = 0; i < st.length(); i++) {
            for (int j = i+1; j <= st.length(); j++) {
                String str = st.substring(i,j);
                if(isPlaindrom(str) && (str.length()==4 || str.length()==5)) {
                    System.out.println(str);
                    if(str.length()==4) {
                        point += 5;
                    }else {
                        point += 10;
                    }
                }
            }
        }
        System.out.println(point);

    }
    public static boolean isPlaindrom(String s) {
        int i = 0;
        int j = s.length()-1;
        while (i<=j){
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }return true;
    }

}
