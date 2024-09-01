package lang.immutable.address;

public class ImmutableAddress {

    private final String value; // final을 안해도 어차피 바꿀방법이 없음. private로 되어있기 때문

    public ImmutableAddress(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return "Address{" +
                "value='" + value + '\'' +
                '}';
    }
}
