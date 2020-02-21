package java1;

abstract class Bank
{
    String name="";
    double rate;
    Bank(){}
    Bank(String name,float r)
    {
        this.name=name;
        this.rate=r;
    }
    public void getDetails()
    {
        System.out.println("Name: "+name);
        System.out.println("Rate: "+rate);
    }
}
class SBI extends Bank
{
    SBI()
    {
        name="SBI";
        rate=4.5;
    }
    public void getDetails()
    {
        super.getDetails();
    }

}
class BOI extends Bank
{
    BOI()
    {
        name="BOI";
        rate=4.4;
    }
    public void getDetails()
    {
        super.getDetails();
    }
}
class ICICI extends Bank
{
    String facility;
    ICICI()
    {
        name="ICICI";
        rate=4.6;
    }

    public void getDetails()
    {
        super.getDetails();
    }
}
class BankDetails
{
    public static void main(String[] args)
    {
        SBI sbi=new SBI();
        BOI boi=new BOI();
        ICICI i=new ICICI();
        sbi.getDetails();
        boi.getDetails();
        i.getDetails();
    }
}
