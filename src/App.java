public class App {
    String name;
    String city;
    int roll;
    App(int roll ,String name,String city)
    {
        this.roll=roll;
        this.name=name;
        this.city=city;
        System.out.println("----Orignal construtor------");
        System.out.println("roll :"+roll+ "\tname :"+name+"\tcity:"+city);
    
    }
    App(App ap)
    {
        this.roll=ap.roll;
        this.name=ap.name;
        this.city=ap.city;
        System.out.println("----Copy construtor------");
        System.out.println("roll :"+roll+ "\tname :"+name+"\tcity:"+city);
    }
    public static void main(String args[])
    {
        App obj=new App(101,"Amar","bhopal");
        App obj1=new App (obj);
    }
 
}

   