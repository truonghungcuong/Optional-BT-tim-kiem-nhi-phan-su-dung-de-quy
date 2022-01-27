import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(13);
        arrayList.add(19);
        arrayList.add(22);
        arrayList.add(26);
        arrayList.add(34);
        arrayList.add(37);

        arrayList.stream().sorted();

        System.out.print("Mảng: ");
        arrayList.forEach(value -> System.out.print(value + "\t"));
        System.out.println();

        int value = 357;
        int index = binarySearchRecursively(arrayList, value);
        System.out.println("Tìm kiếm giá trị value=" + value + ": index=" + index);


    }

    public static int binarySearchRecursively(ArrayList<Integer> arrayList, int value) {
        int left = 0;
        int right = arrayList.size() - 1;
        return binarySearchRecursively(arrayList, value, left, right);
    }

    public static int binarySearchRecursively(ArrayList<Integer> arrayList, int value, int left, int right) {
        if (left == right) {
            if (arrayList.get(left) == value)
                return left;
            return -1;
        }

        int mid = (left + right) / 2;
        if (arrayList.get(mid) == value)
            return mid;
        if (arrayList.get(mid) > value)
            return binarySearchRecursively(arrayList, value, left, mid - 1);
        return binarySearchRecursively(arrayList, value, mid+1, right);

    }

}