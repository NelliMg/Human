package com.company;

public class Arrays {
    public static void main(String[] args) {
        //problem 1
        int [] zeroArr=new int[10];
        for (int i:zeroArr){
            System.out.print(i+"  ");
        }
        System.out.println();
        // problem 2
        int [] zeroArr1=new int[10];
        for (int i:zeroArr1){
            i=0;
            System.out.print(i+"  ");
        }
        System.out.println();
        //problem 3
        int [] num= new int[1000];
        for (int i=1;i<=num.length;i++){
            num[i-1]=i;
        }
        //problem 4
        int [] even= new int[30];
        for (int i=-30;i<=30;i+=2){
            if(i!=0) {
                even[i/2+15]=i;
            }
        }
        //problem 5
        int [] odds= new int[150];
        for (int i=1;i<=299;i+=2){
            odds[(i-1)/2]=i;
        }
        //problem 6
        int[] arr1= {1,5,9,10,4,7};
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]%5==0){
                System.out.print(arr1[i]+ "  ");
            }
        }
        //problem 7
        double [] numbers={1.2,25,24.9,52.2,};
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]>24.56){
                System.out.println(numbers[i]);
            }
        }
        //problem 8
        float [] floats={1f,5f,-8f,0.2f,0.25f,250f};
        for (int i=0;i<floats.length;i++){
            if(floats[i]>35.56||floats[i]<-34.655){
                System.out.print(floats[i]+ "  ");
            }
        }
        //problem 9
        double [] doubles={2.5,3,9,-9,8,7,6};
        double tempd;
        for(int i=0;i<doubles.length;i++){
            for (int j=0;j<doubles.length-i-1;j++){
                if(doubles[j]>doubles[j+1]){
                    tempd=doubles[j];
                    doubles[j]=doubles[j+1];
                    doubles[j+1]=tempd;
                }
            }
        }
        //problem 10
        String aCount="auhAbAhijun";
        int count=0;
        for (int i =0;i<aCount.length();i++){
            if(aCount.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println(count);
        // problem 11
        String b="ahahahahahahha";
        count=0;
        for (int i =0;i<aCount.length();i++){
            if(aCount.charAt(i)=='a'){
                count++;
            }
        }
        if(count!=0){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
        //problem 12
        int [] inum={2,4,9,5,6,7,12,14};
        for(int i=0;i<inum.length;i++){
            if((inum[i]&inum[i]-1)==0){
                System.out.println(inum[i]);
            }
        }
    }

}
