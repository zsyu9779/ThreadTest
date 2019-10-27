package CPtest;

/**
 * @Author: Zsyu
 * @Date: 19-10-25 下午7:12
 */
public class C {
    private MyStack myStack;

    public C(MyStack myStack) {
        super();
        this.myStack = myStack;
    }
    public void popService(){
        System.out.println("pop="+myStack.pop());
    }
}
