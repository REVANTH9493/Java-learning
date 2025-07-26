class AuthorInitializer {
    private String name;
    private String email;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setAge(int age){
        this.age = age<100?age:100;
    }
    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;

    }
    public int getAge(){
        return age;
    }
}


public class Author {
    public static void main(String[] args) {
        String a,b;
        int c;
        AuthorInitializer au = new AuthorInitializer();
        au.setAge(21);
        au.setEmail("revanth@gmail.com");
        au.setName("revanth");
        a = au.getName();
        b = au.getEmail();
        c = au.getAge();
        System.out.println(a+"\t"+b+"\t"+c);
        

    }

}