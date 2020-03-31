package iwms.spring_wechat.entity;

public class Ticket {
    private String Ticket;
    private long expireTime;

    public String getTicket() {
        return Ticket;
    }

    public void setTicket(String Ticket) {
        this.Ticket = Ticket;
    }

    public long getExpireTime() {
        return expireTime;
    }

    public void setExpireTime(long expireTime) {
        this.expireTime = expireTime;
    }

    public Ticket(String Ticket, String expireIn) {
        super();
        this.Ticket = Ticket;
        expireTime = System.currentTimeMillis()+Integer.parseInt(expireIn)*1000;
    }

    public boolean isExpired() {
        return System.currentTimeMillis()>expireTime;
    }
}
