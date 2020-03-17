package telran.data;

public class Schedule {
    private DayOfWeek dayOfWeek;

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public void wakeUp(){
        if (this.getDayOfWeek().ordinal()>= 5){
            System.out.println("you can sleep longer!");
        }else{
            System.out.println("wake up!");
        }
    }

    public void getMenu(DayOfWeek dayOfWeek){
        switch (dayOfWeek){
            case MONDAY:
                System.out.println("Goulash");
                break;
            case TUESDAY:
                System.out.println("Spaghetti");
                break;
            case WEDNESDAY:
                System.out.println("Chicken nuggets");
                break;
            case THURSDAY:
                System.out.println("Fish");
                break;
            case FRIDAY:
                System.out.println("Pizza");
                break;
        }
    }
}
