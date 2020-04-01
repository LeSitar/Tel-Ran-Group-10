package telran.data;

public abstract class Plant {
    private String name;
    private int height;
    private int age;

    public Plant(String name, int height, int age) {
        this.name = name;
        this.height = height;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getAge() {
        return age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void addYearToAge(){
        this.age ++;
    }
    public abstract int getGrowPerSeason();

    public void doWinter(){
        System.out.println(getName() + " is not growing in Winter " + getHeight());
    }

    public void doSpring(){
        addYearToAge();
        System.out.println(getName() + " at the beginning of the height is " + getHeight());
        setHeight(getHeight() + getGrowPerSeason());
        System.out.println(getName() + " has grown in Spring up to " + getHeight());
    }

    public abstract void doSummer();
    public abstract void doAutumn();

    @Override
    public String toString() {
        return "Plant{" +
                "name='" + name + '\'' +
                ", height=" + height +
                ", age=" + age +
                '}';
    }
}
