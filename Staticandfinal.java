class Staticandfinal
{
    static int count = 0;
    final int MAX = 100;

    Staticandfinal()
    {
        count++;
    }

    void display()
    {
        System.out.println("Static count: " + count);
        System.out.println("Final value: " + MAX);
    }

    public static void main(String[] args)
    {
        Staticandfinal d1 = new Staticandfinal();
        Staticandfinal d2 = new Staticandfinal();

        d2.display();
    }
}