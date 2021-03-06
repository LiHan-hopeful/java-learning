public class MyQueueByArray {
    private int[] array = new int[100];
    private int head = 0;
    private int tail = 0;
    private int size = 0;  // 元素个数

    public void offer(int val) {
        if (size == array.length) {
            return;            // 队列满了, 无法继续插入
        }
        array[tail] = val;
        tail++;
        if (tail >= array.length) {
            tail = 0;  //防止越界
        }
        size++;
    }

    public Integer poll() {
        if (size == 0) {
            return null;
        }
        Integer ret = array[head];
        head++;
        if (head >= array.length) {
            head = 0;
        }
        size--;
        return ret;
    }

    public Integer peek() {
        if (size == 0) {
            return null;
        }
        return array[head];
    }
}
