import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number from 1 to 7 :");
        int number = in.nextInt();
        number--;
        switch (number)
        {
            case 0:
                System.out.println("Saturday");
                break;
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
        }
        if(number==0)
        {
            int column=0;
            int row_num=5;
            for (int row = 1; row <= row_num; row++,column=0)
            {
                nextSpace:for (int space = 1; space <= row_num - row; space++)
                {
                    if(row==3)
                        break nextSpace;
                    System.out.print(" ");
                }
                next_Column:while (column != 2 * row - 1)
                {
                    if(row==3)
                        break next_Column;
                    System.out.print("* ");
                    column++;
                }
                System.out.println();
            }
        }
        else if (number==1 || number==2)
        {
            System.out.println("Enter a number");
            int num = in.nextInt();
            double arr[]=new double[num];
            int sum = 0;
            for (int i = 0 ; i < num ; i++)
            {
                System.out.println("please enter the elements of array");
                int elements=in.nextInt();
                sum+=elements;
            }
            System.out.println("Average ="+(sum/num));
        }
        else if (number==4)
        {
           System.out.println("enter the size of rows");
           int array_Row = in.nextInt();
            System.out.println("enter the size of columns");
            int array_Column = in.nextInt();
            int array[][]=new int[array_Row][array_Column];
            System.out.println("please enter the elements of array :");
            for(int Row = 0 ; Row < array_Row ; Row++) {
                for (int Column = 0; Column < array_Column; Column++) {
                    array[Row][Column] = in.nextInt();
                    System.out.println("Elements of the array are: ");
                }
            }
            for(int Row = 0 ; Row < array_Row ; Row++)
            {
                for (int Column = 0; Column < array_Column; Column++)
                {
                    System.out.print(array[Row][Column] + " ");
                }
                System.out.println();
            }
        }
        else if (number==5)
        {
            Array();
        }
        else if (number==6)
        {
            int N=3;
            Float F=15.5f;
            String S="Cat";
            OverLoading(N);
            OverLoading(F);
            OverLoading(S);
        }
    }
    static void Array()
    {
        int[]Arr=new int[]{5,5,5,5};
        System.out.println(Arr[0]+ " " +Arr[1]+ " " +Arr[2]+ " " +Arr[3]);

    }
    static void OverLoading(int N)
    {
        System.out.println("OOP");
    }
    static void OverLoading(Float F)
    {
        System.out.println(F/3);
    }
    static void OverLoading(String S)
    {
        System.out.println("Hello "+S);
    }
}
