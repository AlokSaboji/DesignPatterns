package Iterator;

public class IteratorDemo {

    public static void main(String[] args) {
        String[] list = {"Alok","Adisha","Amol","Swathi"};
        NameRepo nameList = new NameRepo(list);
        for(Iterator itr = nameList.getIterator(); itr.hasNext();){
            System.out.println(itr.next());
        }
    }
}
