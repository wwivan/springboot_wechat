package iwms.spring_wechat.entity;

public class ValueColor {
    private String value;
    private String color;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "{" +
                "value:'" + value + '\'' +
                ", color:'" + color + '\'' +
                '}';
    }
}
