package algorithm.esay;

/**
 * Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * push(x) -- Push element x onto stack.
 * pop() -- Removes the element on top of the stack.
 * top() -- Get the top element.
 * getMin() -- Retrieve the minimum element in the stack.
 * <p>
 * 解析：实现一个简单的栈不难，这里要求去最小值操作的时间复杂度位常数，显然不能通过遍历栈的方式找最小值；
 * 一下做法是另开辟一个与原来栈相同大小的栈，这个栈是最小值栈，栈顶的元素永远是原栈当前最小值，栈采用数组存储；
 * 另一种链式存储见类 {@link MinStack1}
 * </p>
 *
 * @author chengshaojin
 * @since 2016/9/23.
 */
public class MinStack {

    private final static int MAXSIZE = 1024;
    private int[] arr;
    private int[] minArr;
    private int maxIndex;
    private int top;

    /**
     * initialize your data structure here.
     */
    public MinStack() {
        arr = new int[MAXSIZE];
        minArr = new int[MAXSIZE];
        maxIndex = MAXSIZE - 1;
        top = -1;
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }

    public void push(int x) {
        if (isFull()) {
            System.out.println("Full");
            return;
        }
        if (isEmpty()) {
            minArr[++top] = x;
        } else {
            int curMin = minArr[top];
            if (x < curMin) {
                minArr[++top] = x;
            } else {
                minArr[++top] = curMin;
            }
        }
        arr[top] = x;
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Underflow");
            return;
        }
        top--;
    }

    public int top() {
        if (isEmpty()) {
            System.out.println("Empty");
            return Integer.MAX_VALUE;
        }
        return arr[top];
    }

    public int getMin() {
//        if (isEmpty()) {
//            System.out.println("Empty");
//            return Integer.MIN_VALUE;
//        }
//        int min = arr[0];
//        for (int i = 1; i <= top; i++) {
//            if (arr[i] < min) {
//                min = arr[i];
//            }
//        }
//        return min;
        return minArr[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == maxIndex;
    }
}

//    另一种实现思想，在push的时候，如遇到最小值，则将上一个最小值和当前最小值一起push进栈，
//    在pop时，若pop到了最小值，则必定下一个pop位的值为最小值，标记它位当前最小值，在执行一次pop即可
//    Stack<Integer> stack=new Stack<>();
//    int min=Integer.MAX_VALUE;
//    public void push(int x) {
//        if(x<=min) {stack.push(min); min=x;}
//        stack.push(x);
//    }
//    public void pop() {
//        if(stack.peek()==min){ stack.pop(); min=stack.pop(); }
//        else stack.pop();
//    }
//    public int top() {
//        return stack.peek();
//    }
//    public int getMin() {
//        return min;
//    }
