public class Main
{
    public static void main(String[] args)
    {
        int price = 120;
        double shipping = 0.02;
        double shippingTax = price * shipping;
        double total = shippingTax + price;
                if (price >= 100)
                    System.out.println("the total is " + total);
                else
                    System.out.println("the total is "+ price);
    }
}

