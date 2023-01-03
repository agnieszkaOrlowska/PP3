
public class Laptop
{
    private String name;
    private int ram;
    private boolean touchscreen;
    
    Laptop(String name, int ram, boolean touchscreen){
        this.name=name;
        this.ram=ram;
        this.touchscreen=touchscreen;
    }
    
    public void setName(){
        this.name=name;
    }
    public void setRam(){
        this.ram=ram;
    }
    public void setTouchscreen(){
        this.touchscreen=touchscreen;
    }
    public String getName(){
        return name;
    }
    public int getRam(){
        return ram;
    }
    public boolean getTouchscreen(){
        return touchscreen;
    }
    
  
}
