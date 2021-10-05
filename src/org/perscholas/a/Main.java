package org.perscholas.a;




public class Main {



    public static void main(String[] args) {




/*

        // fields
        int[] values = new int[5];

        Scanner input = new Scanner(System.in);

        for(int i = 0; i < values.length; i++){
            System.out.println("please enter a number: ");
            values[i]=input.nextInt();
        }

        // close
        input.close();
        System.out.println(Arrays.toString(values));
*/


/*        // fields
        int nElementsNeeded;
        double maxValue;
        Scanner input = new Scanner(System.in);
        System.out.println("Elements needed? ");
        nElementsNeeded = input.nextInt();
        System.out.println("max number: ");
        maxValue = input.nextDouble();

        int[] values = new int[nElementsNeeded];

        for(int i = 0; i< values.length ; i++){
            values[i] = (int)(Math.random() * maxValue);
        }

        for(int i = 0 ; i< values.length; i++){
            System.out.print(values[i] + " ");
        }*/

/*

        String[] fillArray = new String[10];
        System.out.println(Arrays.toString(fillArray));
        Arrays.fill(fillArray, "Hello World!");
        System.out.println(Arrays.toString(fillArray));

*/
/*


        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;


        System.out.println("max integer value is: " + max);
        System.out.println("min integer value is: " + min);


       // int[] values = { 43, 55, 6645, 1234234234};
        int index = -1;
        for(int i = 0; i< values.length; i++){
            if(values[i] > max){
                max = values[i];
                index = i;
            } // if statement

        } // end of loop
        System.out.println("largest value is : " + max);
        System.out.println(" index is: " + index);

*/

/*        int[] values = {10,20,30,40,50};
        int[] rValues = new int[values.length];

        int x =5 , y = 6 ;



        for(int i = values.length-1, j=0  ;  i>=0  ;   i--,j++){

            rValues[j] = values[i];
        }

        System.out.println(Arrays.toString(rValues));


*/

/*
        short[] fullSizeInt = new short[Short.MAX_VALUE];
        for(int i =0 ; i < fullSizeInt.length; i++){
            fullSizeInt[i]= (short) i;
        }
       // System.out.println(Arrays.toString(fullSizeInt));

      Arrays.sort(fullSizeInt);
        List x = Arrays.asList(fullSizeInt);
        Collections.shuffle(x);
        for(Object xx: x){
            System.out.println((short)xx);
        }*/
     /*

        double timeStart = System.nanoTime();
        short index = (short) Arrays.binarySearch(fullSizeInt, (short) 30000);
        double timeEnd = System.nanoTime();
        double duration = ((timeEnd - timeStart)/1e-9D);




        System.out.println("index is : " + index);
        System.out.println("time to execute is : " + duration );
*/
    }


}
