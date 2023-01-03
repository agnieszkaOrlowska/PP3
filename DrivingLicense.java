
public class DrivingLicense
{
    private String name;
    private String surname;
    private String adress;
    private String code;
    private String city;
    private int number;
    private int year;
    
    
    public String getName(){
        return name;
    }
    
     public void setName(String name){
        this.name=name;
        String cap = name.substring(0, 1).toUpperCase() + name.substring(1);
        this.name=cap;
    }
    
        public String getSurname(){
        return name;
       
    }
    
     public void setSurname(String surname){
        this.surname=surname;
        
    }
    
        public String getAdress(){
        return adress;
    }
    
     public void setAdresss(String adress){
        this.adress=adress;
    }
    
        public String getCode(){
        return code;
    }
    
     public void setCode(String code){
        this.code=code;
    }
    
        public String getCity(){
        return city;
    }
    
     public void setCity(String city){
        this.city=city;
    }
    
        public int getNumber(){
        return number;
    }
    
     public void setNumber(int number){
        this.number=number;
    }
    
        public int getYear(){
        return year;
    }
    
     public void setYear(int year){
         if(year>1980 && year<=2021){
            this.year=year;}
        else{
             System.out.println("Incorect year");
        }
    }
    
    public void displayData(){
        System.out.println(getName()+" "+getSurname()+" "+getAdress()+" "+getCode()+" "+getCity()+" "+getNumber()+" "+getYear());
    }
    
    DrivingLicense(String name,String surname,String adress,String code,String city,int number,int year){
        this.name=name;
        this.surname=surname;
        this.adress=adress;
        this.code=code;
        this.city=city;
        this.number=number;
        this.year=year;
    }
    
    public String toString(){//overriding the toString() method  
		  return getName()+" "+getSurname()+" "+getAdress()+" "+getCode()+" "+getCity()+" "+getNumber()+" "+getYear();
		 }  
		 
    public  static void main(String[] args){
        
    DrivingLicense d1 = new DrivingLicense("maciej","piech","os. boh", "31-621", "Krak", 31221,2011);
    d1.displayData();
    System.out.println(d1);
    }

    }
    
    
    
    

