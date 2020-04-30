package Iterator;

public class NameIterator implements Iterator {

    private int index;
    private String[] list;

    public NameIterator(String[] list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        if(index < list.length){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object next() {
        if(this.hasNext()){
            return list[index++];
        }
        return null;
    }
}
