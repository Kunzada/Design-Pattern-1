package structural;

public class SmartPhoneFactory {
    public static SmartPhone getInstance(String name, String modelName){
        if(name == "IPhone"){
            return new IPhone(modelName);
        } else if(name == "Samsung"){
            return new Samsung(modelName);
        } else if(name == "Huawei"){
            return new Huawei(modelName);
        }
        return null;
    }
}