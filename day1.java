import java.util.*;



public class day1 {
    public static void main(String args[]){
// int[] marks = new int[3];
// marks[0] = 97;
// marks[1] = 98;
// marks[2] = 95;
// System.out.println(marks[0]);
// System.out.println(marks[1]);
// System.out.println(marks[2]);

//        int marks[] = {97, 98, 95};

        Scanner sc = new Scanner(System.in);
        int size= sc.nextInt();
        int number[] = new int[size];

        for (int i=0; i<size; i++){
            number[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        for(int i=0; i<size; i++){
            if (number[i] == x){
                System.out.println("x found at index : " +i);
            }
        }
    }
}
