package cgmouse.javainaction.chap15.flow;


public class SimpleCellTestDrive {
    public static void main(String[] args) {
        SimpleCell c3 = new SimpleCell("C3");
        SimpleCell c2 = new SimpleCell("C2");
        SimpleCell c1 = new SimpleCell("C1");

        c1.subscribe(c3);

        c1.onNext(10);
        c2.onNext(20);

       

    }

    static void printCell(SimpleCell cell){
        System.out.println(cell.toString());
    }

    
}
