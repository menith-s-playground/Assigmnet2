void main() {
    int[] myArray1 = new int[]{10, 20, 30};
    int[] myArray2 = {10, 20, 30, 40};
    int[][] my2dArray = new int[][]{myArray1, myArray2, null, {10,20}};
//    System.out.println(myArray1);
//    System.out.println(myArray1.length);
//    System.out.println(myArray2);
//    System.out.println(myArray2.length);
//    System.out.println(myArray1[1]);
//    System.out.println(myArray2[0]);
    System.out.println(my2dArray[0] == myArray1);
    System.out.println(my2dArray[1] == myArray2);
    System.out.println(my2dArray[0][1]);
    System.out.println(my2dArray[2]);
    System.out.println(my2dArray[my2dArray.length - 1][1]);
}