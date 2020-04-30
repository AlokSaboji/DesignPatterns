package Factory;

public class Factory {
    public Door giveMeDoor(String doortype){
        if(doortype=="plastic"){
            return new PlasticDoor();
        }else if(doortype=="wood"){
            return new WoodenDoor();
        }else if(doortype=="iron"){
            return new IronDoor();
        }
        return null;
    }
}
