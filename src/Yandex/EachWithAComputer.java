package Yandex;

import java.util.Arrays;
import java.util.Scanner;

public class EachWithAComputer {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("N groups: ");
        int N = scan.nextInt();
        System.out.println("M audiences: ");
        int M = scan.nextInt();


        int[] countOfComp = new int[M];
        for (int i = 0; i < M; i++) {
            System.out.println("Audience №" + (i+1) + ": ");
            countOfComp[i] = scan.nextInt();
        }



        int[] countOfMembers = new int[N];
        for (int i = 0; i < N; i++) {
            System.out.println("Group №" + (i+1) + ": ");
            countOfMembers[i] = scan.nextInt()+1;
        }



        Integer[] groupIndices = new Integer[N];
        for (int i = 0; i <      N; i++) {
            groupIndices[i] = i;
        }



        Integer[] roomIndices = new Integer[M];
        for (int j = 0; j < M; j++) {
            roomIndices[j] = j;
        }


        int[] assignment = new int[N];

        int countAssigned = 0;
        int roomPtr = 0;

        for (int i = 0; i < N && roomPtr < M; i++) {
            int groupIndex = groupIndices[i];
            int need = countOfMembers[groupIndex];


            while (roomPtr < M && countOfComp[roomIndices[roomPtr]] < need) {
                roomPtr++;
            }

            if (roomPtr < M) {
                assignment[groupIndex] = roomIndices[roomPtr] + 1;
                countAssigned++;
                roomPtr++;
            }
        }


        System.out.println(countAssigned);
        for (int i = 0; i < N; i++) {
            System.out.print(assignment[i] + " ");
        }
    }
}
