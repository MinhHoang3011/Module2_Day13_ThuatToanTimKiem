package TH_1;

public class BinarySearch {
    static int[] list = {1, 2, 3, 4, 5, 6, 7, 8};
    static int binarySearch(int[] list, int key) {
        int low = 0;
        int high = list.length -1;
        while (high >= low) {
            int mid = (low + high) / 2;
            if (key == list[mid])
                return mid;
            if (key < list[mid])
                high = mid -1;
            else
                low= mid + 1;
        }
        return  -1;
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list,2));
        System.out.println(binarySearch(list,10));
        System.out.println(binarySearch(list,8));
    }
}
