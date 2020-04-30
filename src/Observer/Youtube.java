package Observer;

public class Youtube {

    public static void main(String[] args) {
        Channel c1 = new Channel("sony");
        Channel c2 = new Channel("zee");
        Channel c3 = new Channel("dd");

        Subscriber s1 = new Subscriber("Alok");
        Subscriber s2 = new Subscriber("Adisha");
        Subscriber s3 = new Subscriber("Amol");
        Subscriber s4 = new Subscriber("Swati");

        c1.addSubscribers(s1);
        c1.addSubscribers(s2);
        c2.addSubscribers(s3);
        c2.addSubscribers(s4);

        s1.subscribe(c1);
        s2.subscribe(c1);
        s3.subscribe(c2);
        s4.subscribe(c2);

        c1.uploadVideo("The last kingdom");

        c2.uploadVideo("Saas bhi kabhi bahu thi");
    }


}
