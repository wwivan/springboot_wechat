package iwms.spring_wechat.entity;

import java.util.ArrayList;
import java.util.List;

public class Button {
    private List button = new ArrayList<>();
    public List getButton(){
        return button;
    }

    public void setButton(List button){
        this.button = button;
    }

    @Override
    public String toString() {
        return "{" +
                "'button':" + button +
                '}';
    }
}
