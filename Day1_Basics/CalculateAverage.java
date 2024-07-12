//Write a program that calculates the average weight of 10 people. Use descriptive and meaningful variable names
// following Java naming conventions. Use proper datatypes for the variables.
import  java.util.Scanner;

public class CalculateAverage {

    public static void main(String[] args) throws Exception{

        float weights[] = new float[10];
        Scanner sc = new Scanner(System.in);


      try{
          for (int i = 1; i <= 10; i++) {
              System.out.println("enter the weight of person " + i);
              weights[i-1] = sc.nextFloat();
          }
      }
        catch (Exception e){
            System.out.println("enter possible values of weights");
            String str[] = {"restart"};
            main(str);
        }

        float sum = 0f;
        for(float el: weights) {
            sum += el;
        }

        float avg = sum / 10.0f;

        System.out.println("The average weight of 10 person is" + avg);
    }
}
