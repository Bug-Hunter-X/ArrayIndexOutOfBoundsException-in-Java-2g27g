public class MyClass {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int index = 2; // Valid index
        if (index >= 0 && index < arr.length) {
            System.out.println(arr[index]);
        } else {
            System.out.println("Index out of bounds");
        }
    }
}