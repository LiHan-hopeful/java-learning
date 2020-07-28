public class FirstLook {
//   public static void main(String[] args) throws InterruptedException {
//        Thread.sleep(99999999999L);
//    }
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(99999999999L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }   
            }
        }).start();

    }
}