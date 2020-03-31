package iwms.spring_wechat.entity;

public class ViewButton extends AbstractButton {
    private String type = "view";
    private String url;
    public String getType(){
        return type;
    }
    public void setType(){
        this.type = type;
    }
    public String getUrl(){
        return url;
    }
    public void setUrl(){
        this.url = url;
    }
    public ViewButton(String name,String url){
        super(name);
        this.url =url;
    }

    @Override
    public String toString() {
        return "{" +
                "'type':'" + type + '\'' +
                ", 'url':'" + url + '\'' +
                '}';
    }
}
