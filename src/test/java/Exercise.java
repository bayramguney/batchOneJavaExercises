 public class Exercise {

    // 1--kendinden once gelen harf alfabetik olarak sonra geliyorsa o harfi almiyor-------------------------------
    public static String  alphabetical(String str) {

        String st = " " + str.charAt(0);
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i + 1) > str.charAt(i)) {
                st = st + str.charAt(i + 1);
            }
        }
        return st;
    }
    // 2--klasik faktoriyel---------------------------------------------------------------------------------------------------
    public static long factorial(int number) {
        long num = 1;
        for (int i = number; 1 <= i; i--) {
            num *= i;
        }
        return num;
    }
    //3 Stringteki karakterleri atiyor----------------------------------------------------------------------------------------
    public static String removeCharacter(String str){
        str=str.replaceAll("[!,@,#,$,%,&,*]","");
        return str;
    }
    //----------------------------------------------------------------------------------------------------------------------







}

