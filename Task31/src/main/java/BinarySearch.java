public class BinarySearch {

    // has to return boxed integer in order to comfort to interface defined in the book
    // Sorted only
    private static Integer binarySearch(int[] list, int item) {
        int low = 0;
        int high = list.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = list[mid];
            if (guess == item) {
                return mid;
            }
            if (guess > item) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return null;
    }

    public static void main(String[] args) {
        int[] myList = {1, 3, 5, 7, 9};

        System.out.println(binarySearch(myList, -2)); // index null index
        System.out.println(binarySearch(myList, -1)); //index null
        System.out.println(binarySearch(myList, 0)); //index null
        System.out.println(binarySearch(myList, 1)); //index 0
        System.out.println(binarySearch(myList, 2)); //index null
        System.out.println(binarySearch(myList, 3)); //index 1
        System.out.println(binarySearch(myList, 4)); //index null
        System.out.println(binarySearch(myList, 5)); //index 2
        System.out.println(binarySearch(myList, 6)); //index null
        System.out.println(binarySearch(myList, 7));//index 3
        System.out.println(binarySearch(myList, 8));//index null
        System.out.println(binarySearch(myList, 9));//index 4
        System.out.println(binarySearch(myList, 10));//index null
        System.out.println(binarySearch(myList, 11));//index null
        System.out.println(binarySearch(myList, 12));//index null
        System.out.println(binarySearch(myList, 13));//index null
    }
}