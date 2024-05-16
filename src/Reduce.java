public class Reduce {
    public static void main(String[] args)
    {
        int count = 0;
        int top = 100;
        while (top > 0)
        {
            if (top % 2 == 0)
            {
                top = top / 2;
            }
            else
            {
                top = top - 1;
            }
        count++;
        }
        System.out.println(count);
    }
}
