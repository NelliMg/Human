package com.company;
public class FunctionManager {
    public static void main(String[] args) {
        Human h = new Human("Vazgen", "Manukyan", 2015,true,'M');
        Human h1 =  new Human("Vazgen", "Manukyan", 2015,true,'M');
        Human h2 =new Human("Varduhi", "Manukyan", 2000,true,'F');
        Human h3 = new Human("Joanne", "Smith", 1985,false,'F');
        Human h4 = new Human("Katya", "Bovsuniska", 1998,false,'F');
        h.setLastname("Aramyan");
        h.setFirstname("Aram");
        System.out.println(sum(9,-250));
        System.out.println(mult(2.2,5));
        biggestFloat(-8.9f,0f);
        printBiggest(3,4,5);
        isMale(h4);
        System.out.println(theOldestPerson(h1,h2,h3));
        printInfo(h1,h2);
        printFirstName(false, h);
        int [] arr={2,20,5,6,30,-9,45};
        System.out.println(maxNumber(arr));
        float[] numbers = {5f, 8f, 2f, 9f, 7f, 88f};
        System.out.println(minIndex(numbers));
        Human[] humans = {h1, h2, h3, h4};
        sortByAscending(humans);
    }
    private static int sum(int a,int b){
        return a+b;
    }
    private static double mult(double a,double b){
        return a*b;
    }
    private static void biggestFloat(float a,float b){
        if (a > b) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
    public static void printBiggest(long a, long b, long c) {
        long max = a > b ? (a > c ? a : c) : (b > c ? b : c);
        System.out.println(max);
    }
    private static void isMale(Human human){
        if(human.getGender()=='M'){
            System.out.println("yes");
        } else{
            System.out.println("no");
        }
    }
    private static String theOldestPerson(Human h1,Human h2,Human h3){
        Human Oldest;
        if(h1.getYear()<h2.getYear()){
            Oldest=h1;
        }else{
            Oldest=h2;
        }
        if(Oldest.getYear()>h3.getYear()){
            Oldest=h3;
        }
        return  Oldest.getLastname();

    }
    private static void printInfo(Human h1,Human h2){
        System.out.println(h1.getFirstname()+"  "+h2.getFirstname());
    }
    private static void printFirstName(boolean b, Human h) {
        if (b) {
            System.out.println(h.getFirstname());
        } else {
            System.out.println(h.getLastname());
        }
    }
    private static int maxNumber(int[] numbers) {
        int max = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        return max;
    }
    private static int minIndex(float[] f) {
        if (f == null || f.length == 0) {
            return -1;
        }
        int indexOfMinimum = 0;
        for (int index = 0; index < f.length; index++) {
            if (f[index] < f[indexOfMinimum]) {
                indexOfMinimum = index;
            }
        }
        return indexOfMinimum;
    }
    private static void sortByAscending(Human[] humans) {
        Human t;
        for (int i = 0; i < humans.length - 1; i++) {
            for (int j = i + 1; j < humans.length; j++) {
                if (humans[i].getYear() > humans[j].getYear()) {
                    t = humans[i];
                    humans[i] = humans[j];
                    humans[j] = t;
                }
            }
        }
        for (int i = 0; i < humans.length; i++) {
            Human.print((humans[i]));
        }
    }
}