import java.util.*;

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
    // 2--klasik faktoriyel--------------------------------------------------------------------------------------------------
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
    //4 array icindedeki dublari eliyor---------------------------------------------------------------------------

    public static void removeDuplicateUsingSorting(int arr[]) {

        Arrays.sort(arr);

        int len = arr.length;
        int j = 0;

        //Traverse an array
        for (int i = 0; i < len - 1; i++) {

            //if value present at i and i+1 index is not equal
            if (arr[i] != arr[i + 1]) {
                arr[j++] = arr[i];
            }
        }

        arr[j++] = arr[len - 1];
        System.out.print("removeDuplicateUsingSorting-------");
        for (int k = 0; k < j; k++) {
            System.out.print(arr[k] + " ");
        }
    }
   //5 removing dubs using hashmap--------------------------------------------------------------------------------------

    public static void removeDuplicateUsingHashing(int arr[]) {

        //Declare a hashmap
        Map<Integer, Integer> map = new HashMap<>();
        int len = arr.length;

        //Traverse an array
        for (int i = 0; i < len - 1; i++) {
            //If key is already present in a map
            if (map.containsKey(arr[i])) {
                //Increment it's count
                map.put(arr[i], map.get(arr[i]) + 1);
            } else {
               /*
                If it's not present in a map
                then put a key and it's initial count 1
               */
                map.put(arr[i], 1);
            }
        }
        System.out.println();
        System.out.print("removeDuplicateUsingMap-------");
        //Print Each Key
        map.forEach((k, v) -> System.out.print(k + "  "));
    }
    //6 removing dubs using set--------------------------------------------------------------------------------------
    public static void removeDuplicateUsingSet(int arr[]) {

        //Declare set
        Set st = new HashSet<>();
        int len = arr.length;

        //Traverse an array and add element in a set
        for (int i = 0; i < len - 1; i++) {
            //It only add unique value
            st.add(arr[i]);
        }
        System.out.println();
        System.out.print("removeDuplicateUsingSet-------");
        //Print each element
        st.forEach(elem -> System.out.print(elem + " "));
    }

    //7 cat ve dog sayisi esitse true farkliysa false verecek
    public static boolean catDogCompareTo(String str) {
        System.out.println();
        int len = str.length();
        int cat = 0;
        int dog = 0;
        for (int i = 0; i < len - 2; i++) {
            String temp = str.substring(i, i+3);
            if (temp.compareTo("cat") == 0)
            cat++;  // If both the strings are equal then this method returns 0 else it returns positive or negative value.
            if (temp.compareTo("dog") == 0)
            dog++;
        }
        if (cat == dog)
        return true;
  else
        return false;
    }
    //8 cat ve dog sayisi esitse true farkliysa false verecek
    public static boolean catDogSubstring(String str) {
        int c=0;
        for (int i=0;i<str.length()-2;i++) {
            if (str.substring(i,i+3).equals("cat")) c++;
            if (str.substring(i,i+3).equals("dog")) c--;
        }
        return (c==0);
    }


}

