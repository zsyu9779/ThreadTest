package CPtest;

/**
 * @Author: Zsyu
 * @Date: 19-10-25 下午7:12
 */
public class C_Thread extends Thread{

    private C c;

    public C_Thread(C c) {
        super();
        this.c = c;
    }

    @Override
    public void run() {
        while (true){
            c.popService();
        }
    }
}
