package iwms.spring_wechat.entity;

public class TemplateMessage {
    private String touser;
    private String template_id;
//    private String url;
    private TempMessage data;

    public String getTouser() {
        return touser;
    }

    public void setTouser(String touser) {
        this.touser = touser;
    }

    public String getTemplate_id() {
        return template_id;
    }

    public void setTemplate_id(String template_id) {
        this.template_id = template_id;
    }
//
//    public String getUrl() {
//        return url;
//    }
//
//    public void setUrl(String url) {
//        this.url = url;
//    }


    public TempMessage getData() {
        return data;
    }

    public void setData(TempMessage data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "{" +
                "touser:'" + touser + '\'' +
                ", template_id:'" + template_id + '\'' +
                ", data:" + data.toString() +
                '}';
    }
}
