package lang.immutable.test;

public class ImmutableMyDate {

    private final int year;
    private final int month;
    private final int day;

    public ImmutableMyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public ImmutableMyDate withYear(int newYear) { // 새로운 값을 반환한다 할때는 set보단 with라는 표현을 사용
        return new ImmutableMyDate(newYear,month,day);
    }

    public ImmutableMyDate withMonth(int newMonth) {
        return new ImmutableMyDate(year,newMonth,day);
    }

    public ImmutableMyDate withDay(int newDay) {
        return new ImmutableMyDate(year,month,newDay);
    }



    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }

}
