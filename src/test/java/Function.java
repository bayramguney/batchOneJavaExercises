public class Function extends Exercise {

    public static void main(String[] args){
        System.out.println("alphabetical-----"+alphabetical("hello"));
        System.out.println("factorial-----"+factorial(6));
        System.out.println("alphabetical-----"+removeCharacter("sfdgtr$%hhfdjf&!tyu67"));
        removeDuplicateUsingSorting(new int[]{5, 1, 2, 6, 4, 4, 5,});
        removeDuplicateUsingHashing(new int[]{5, 1, 2, 6, 4, 4, 5,});
        removeDuplicateUsingSet(new int[]{5, 1, 2, 6, 4, 4, 5,});
    }

}
