package algorithm.esay;

/**
 * Min Stack 双向链式解法
 *
 * @author chengshaojin
 * @since 2016/9/23.
 */
public class MinStack1 {

    private int val;
    private int min;
    private MinStack1 pre = null;
    private MinStack1 tail = null;

    /**
     * initialize your data structure here.
     */
    public MinStack1() {
    }

    public void push(int x) {
        if (tail == null) {
            tail = new MinStack1();
            tail.val = x;
            tail.min = x;
        } else {
            MinStack1 st = new MinStack1();
            st.val = x;
            st.min = x < tail.min ? x : tail.min;
            st.pre = tail;
            tail = st;
        }
    }

    public void pop() {
        if (tail != null) {
            tail = tail.pre;
        }
    }

    public int top() {
        return tail.val;
    }

    public int getMin() {
        return tail.min;
    }

}
