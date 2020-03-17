package telran.data;

public enum DayOfWeek {
    MONDAY("mon"),
    TUESDAY("tue"),
    WEDNESDAY("wed"),
    THURSDAY("thu"),
    FRIDAY("fri"),
    SATURDAY("sat"),
    SUNDAY("sun");

    private String title;

    DayOfWeek(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void printHello() {
        System.out.println("Hallo!");
    }

    @Override
    public String toString() {
        return this.name() + ", " + title + ". ";
    }
}