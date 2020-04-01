package telran.data;

public class Flower extends Plant {

    public Flower(String name, int height, int age) {
        super(name, height, age);
    }

    private static int FLOWER_GROW_PER_SEASON = 20;

    @Override
    public int getGrowPerSeason() {
        return FLOWER_GROW_PER_SEASON;
    }

    @Override
    public void doSummer() {
        System.out.println(getName() + " is not grown in Summer, but blossom");

    }

    @Override
    public void doAutumn() {
        setHeight(0);
        System.out.println(getName() + " is cut to zero in Autumn, height is " + getHeight());
    }

}
