# Static Example
## example static

public class MyStatic {

    public static String name;
    public String address;
    
}

public class MainTestStatic {
    
    public static void main(String[] args) {
        MyStatic ms1 = new MyStatic();
        ms1.address ="jakarta";
        ms1.name = "Guntur";
        MyStatic ms2 = new MyStatic();
        ms2.name = "Agung";
        ms2.address = "bandung";
        
        System.out.println("name : "+ MyStatic.name);
        System.out.println("address : "+ ms1.address);
    }
    
}