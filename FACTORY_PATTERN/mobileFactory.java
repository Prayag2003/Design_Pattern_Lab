package FACTORY_PATTERN;

public class mobileFactory 
{
    mobilee createMobile(String company)
    {
        if(company.toLowerCase().equals("samsung"))
        {
            return new Samsung();
        }
        else if(company.toLowerCase().equals("apple"))
        {
            return new Apple();
        }
        else return new iPhone();
    }    
}
