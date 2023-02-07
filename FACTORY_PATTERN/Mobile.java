package FACTORY_PATTERN;

interface mobilee
{
     String features();
     int Price();
     String OS();
}

class Apple implements mobilee
{
    @Override
    public String features()
    {
        return "Mirror Selfie";
    }
    public int Price()
    {
        return 100000;
    }
    public String OS()
    {
        return "Apple OS";
    }
}
class Samsung implements mobilee
{
    @Override
    public String features()
    {
        return "Durable";
    }
    public int Price()
    {
        return 25000;
    }
    public String OS()
    {
        return "Android OS";
    }
}
class iPhone implements mobilee
{
    @Override
    public String features()
    {
        return "LifeLong";
    }
    public int Price()
    {
        return 1000000;
    }
    public String OS()
    {
        return " iPhone OS";
    }
}

public class Mobile 
{
    public static void main(String[] args) {
        mobileFactory mf = new mobileFactory();
        mobileFactory mf2 = new mobileFactory();
        mobileFactory mf3 = new mobileFactory();

        System.out.println(mf.createMobile("Samsung").features());
        System.out.println(mf.createMobile("Samsung").Price());
        System.out.println(mf.createMobile("Samsung").OS());

        System.out.println(mf2.createMobile("Apple").features());
        System.out.println(mf.createMobile("Apple").Price());
        System.out.println(mf.createMobile("Apple").OS());

        System.out.println(mf3.createMobile("iPhone").features());
        System.out.println(mf.createMobile("iPhone").Price());
        System.out.println(mf.createMobile("iPhone").OS());

    }    
}
