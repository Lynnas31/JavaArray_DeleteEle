import java.util.Scanner;

public class DeleteElement {
    public static void main(String[] args) {
        int[] array = {1,3,4,5,6,8,9,10};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Element");
        int element = scanner.nextInt();
        boolean isExit = false;
        int index_del = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == element){
                index_del = i;
                isExit = true;
                break;
        }

    }
        if(!isExit){
            System.out.println("Not Found " + element);
        }
        if (isExit){
            for (int j = index_del; j <array.length-1 ; j++) {
                array[j] = array[j+1];
            }
        }
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }

}
}
