import java.util.Scanner;
class PrimeNumbers2
{
    public static void main (String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int i = 0;
        int num = 0;
        System.out.println("Enter the last number in the range :");
        int last_num = scanner.nextInt();
        scanner.close();
        for (i = 1; i <= last_num; i++)
        {
            int counter =0;
            for(num = i; num>=1; num--)
            {
                if(i%num==0)
                {
                    counter = counter + 1;
                }
            }
            if (counter == 2 || i == 1)
            {
        System.out.println(i +  " is a prime number.");
            }
            else
            {
                System.out.println(i + " is not a prime number.");
            }
        }

    }

}
