package iwms.spring_wechat.entity;

public class TempMessage {
    private ValueColor p;
    private ValueColor m;
//    private ValueColor orderProductName;

    public ValueColor getP() {
        return p;
    }

    public void setP(ValueColor p) {
        this.p = p;
    }

    public ValueColor getM() {
        return m;
    }

    public void setM(ValueColor m) {
        this.m = m;
    }

    @Override
    public String toString() {
        return "{" +
                "p:" + p.toString() +
                ", m:" + m.toString() +
                '}';
    }
    //    public ValueColor getOrderProductName() {
//        return orderProductName;
//    }
//
//    public void setOrderProductName(ValueColor orderProductName) {
//        this.orderProductName = orderProductName;
//    }
}
