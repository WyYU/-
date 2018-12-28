package Modle;

public class Restaurant {
    private String name;
    private int id;
    private String adress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String toString(){
        return this.getId()+"  "+this.getName()+"  地址:"+this.getAdress();
    }
}
