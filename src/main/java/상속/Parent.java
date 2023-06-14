package 상속;

public class Parent {
    private String name;
    private boolean gender;
    public Parent(){
        this("무명씨", false);
    }

    public Parent(String name, boolean gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return name + "("+(gender ? "남":"여")+")";
    }
}
