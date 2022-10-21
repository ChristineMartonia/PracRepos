public class Pet {
    String name;
    String kind;
    String color;
    String concern;

    public Pet(String name, String kind, String color, String concern) {
        this.name = name;
        this.kind= kind;
        this.color = color;
        this.concern = concern;
    }

   
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }


    public void setKind(String kind) {
        this.kind = kind;
    }
    public String getKind() {
        return kind;
    }


    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }


    public void setConcern(String concern) {
        this.concern = concern;
    }
    public String getConcern() {
        return concern;
    }
    @Override
    public String toString(){
        String petss = "Welcome to Pet's Haven " + this.getName() + ". A cute " + this.getKind() +". with a "+ this.getColor() + " colored fur!. Let's check your " + this.getConcern();
        return petss;
    }


    public static boolean contains(String remove) {
        return false;
    }


}
