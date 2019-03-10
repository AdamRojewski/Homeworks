package JVMProject;

public class JVMTestSomeObjects {

    int i;

    public JVMTestSomeObjects(int i) {
        this.i = i;
    }


    public static void main(String[] args) throws InterruptedException {
        JVMTestSomeObjects f1 = new JVMTestSomeObjects(1);
        JVMTestSomeObjects f2 = new JVMTestSomeObjects(2);
        f1 = null;
        System.gc();
        f2 = null;
        System.gc();

        Thread.sleep(100000);
    }
    @Override
    protected void finalize () throws Throwable{
        System.out.println("GB Callec");

    }

}
