public class AddressCopy {
    public static void main(String[] args) {
        int[] list = {100, 85, 99};
        System.out.println("list[0] 요소 값: " + list[0]);
        System.out.println("list[0] 요소 값: " + list);

        int[] copyList = list;
        System.out.println("copyList[0] 요소 값: " + copyList[0]);
    }
}
