import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        String newArr = Arrays.toString(arr);
        System.out.println(newArr);
    }
}


//自定义版本的数组转字符串
public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(toString(arr));
    }
    public static String toString(int[] arr) {
        String ret = "[";
        for (int i = 0; i < arr.length; i++) {
            ret += arr[i];// 拼接字符串
            if (i != arr.length - 1) {
                ret += ", ";
            }
        }
        ret += "]";
        return ret;
    }
}

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int[] newArr = Arrays.copyOf(arr, arr.length);
        System.out.println("newArr: " + Arrays.toString(newArr));
        arr[0] = 10;
        System.out.println("arr: " + Arrays.toString(arr));
        System.out.println("newArr: " + Arrays.toString(newArr));//copyOf 是将数组进行了 深拷贝, 即又创建了一个数组对象, 拷贝原有数组中的所有元素到新数组中. 因此, 修改原数组, 不会影响到新数组
        // 拷贝某个范围.
        int[] newArr2 = Arrays.copyOfRange(arr, 2, 4);
        System.out.println("newArr2: " + Arrays.toString(newArr2));
    }
}

//自定义拷贝数组
public static int[] copyOf(int[] arr) {
  int[] ret = new int[arr.length];
  for (int i = 0; i < arr.length; i++) {
    ret[i] = arr[i];
 }
  return ret;
}

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(max(arr));
    }
    public static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(avg(arr));
    }
    public static double avg(int[] arr) {
        int sum = 0;
        for (int x : arr) {
            sum += x;
        }
        return (double)sum / (double)arr.length;
    }
}

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,5,6};
        System.out.println(find(arr, 10));
    }
    public static int find(int[] arr, int toFind) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == toFind) {
                return i;
            }
        }
        return -1; // 表示没有找到
    }
}

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(binarySearch(arr, 6));
    }
    public static int binarySearch(int[] arr, int toFind) {
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (toFind < arr[mid]) {
// 去左侧区间找
                right = mid - 1;
            } else if (toFind > arr[mid]) {
// 去右侧区间找
                left = mid + 1;
            } else {
                return mid;//找到了！
            }
        }
        return -1;//表示没找到。
    }
}


import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1,2,3,10,5,6};
        System.out.println(isSorted(arr));
    }
    public static boolean isSorted(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }
}

public class test {
    public static void main(String[] args) {
        int[] arr = {7, 3, 9, 5, 1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void bubbleSort(int[] arr) {
        for (int bound = 0; bound < arr.length; bound++) {
            for (int cur = arr.length - 1; cur > bound; cur--) {
                if (arr[cur - 1] > arr[cur]) {
                    int tmp = arr[cur - 1];
                    arr[cur - 1] = arr[cur];
                    arr[cur] = tmp;
                }
            }
        } 
    }
}


import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void reverse(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            left++;
            right--;
        }
    }
}

import java.util.Arrays;

public class test {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        transform(arr);
        System.out.println(Arrays.toString(arr));
    }
    public static void transform(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (left < right) {
// 循环结束, left 就指向了一个奇数
            while (left < right && arr[left] % 2 == 0) {
                left++;
            }
// 循环结束, right 就指向了一个偶数
            while (left < right && arr[right] % 2 != 0) {
                right--;
            }
// 交换两个位置的元素
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
}
