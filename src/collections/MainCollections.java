package collections;

public class MainCollections {
	private static ArrayListTest alt;
	private static LinkedListTest llt;
	private static HashSetTest hst;
	private static TreeSetTest tst;
	private static TreeMapTest tmt;
	private static HashMapTest hmt;
	
	public static void main(String[] args) {
		alt = new ArrayListTest();
		llt = new LinkedListTest();
		hst = new HashSetTest();
		tst = new TreeSetTest();
		hmt = new HashMapTest();
		tmt = new TreeMapTest();
		
		System.out.println("\n-= ArrayList ---- ----");
		for (int i = 0; i < 20; i++) test(alt);
		System.out.println("\n-= LinkedList ---- ----");
        for (int i = 0; i < 20; i++) test(llt);
		System.out.println("\n-= HashSet ---- ----");
        for (int i = 0; i < 20; i++) test(hst);
		System.out.println("\n-= TreeSet ---- ----");
        for (int i = 0; i < 20; i++) test(tst);
		System.out.println("\n-= HashMap ---- ----");
        for (int i = 0; i < 20; i++) test(hmt);
		System.out.println("\n-= TreeMap ---- ----");
        for (int i = 0; i < 20; i++) test(tmt);
	}

	private static void test(ITestable t) {
		System.out.println(t.addTest());
		System.out.println(t.removeTest());
		System.out.println(t.searchTest());
        t.clear();
	}
}