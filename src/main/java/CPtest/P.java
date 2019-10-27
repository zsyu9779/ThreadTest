package CPtest;

/**
 * @Author: Zsyu
 * @Date: 19-10-25 下午7:10
 */
public class P {
    private MyStack myStack;

    public P(MyStack myStack) {
        this.myStack = myStack;
    }
    public void pushService(){
        myStack.push();
    }
}
