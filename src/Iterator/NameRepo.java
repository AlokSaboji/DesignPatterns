package Iterator;
public class NameRepo implements Container {
    private String[] nameList;

    public NameRepo(String[] nameList) {
        this.nameList = nameList;
    }

    @Override
    public Iterator getIterator() {
        return new NameIterator(nameList);
    }
}
