package LLD_DesignPattern.prototype;

public class NetworkConnection implements Cloneable {
    private String ip;
    private String importantData;

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getImportantData() {
        return importantData;
    }

    public void setImportantData(String importantData) {
        this.importantData = importantData;
    }

    public void loadVeryImportantData() throws InterruptedException {
        this.importantData= "Very Very Important Data";
        Thread.sleep(10000);
        //taking 5 minutes
    }

    @Override
    public String toString() {
        return this.ip + " : "
                + this.importantData;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
