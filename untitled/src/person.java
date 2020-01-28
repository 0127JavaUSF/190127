public class person {
    private String name;
    public String name(String name){
        this.name = name;
        return name;
    }
    public void changename(person p){
        p.name = "mark";
    }

    public static void main(String[] args){
        person myperson = new person();

    }
}
