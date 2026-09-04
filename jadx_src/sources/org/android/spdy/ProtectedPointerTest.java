package org.android.spdy;

/* JADX INFO: loaded from: classes5.dex */
public class ProtectedPointerTest {

    public static class Data {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f132857i = 0;

        Data() {
        }

        public void destroy() {
            System.out.println("destroy");
            this.f132857i = 1;
        }

        public void work() {
            System.out.println("work");
            if (this.f132857i == 1) {
                System.exit(-1);
            }
        }
    }

    public static void main(String[] strArr) {
        for (int i10 = 0; i10 < 1; i10++) {
            ProtectedPointer protectedPointer = new ProtectedPointer(new Data());
            protectedPointer.setHow2close(new ProtectedPointer.ProtectedPointerOnClose() { // from class: org.android.spdy.ProtectedPointerTest.3
                @Override // org.android.spdy.ProtectedPointer.ProtectedPointerOnClose
                public void close(Object obj) {
                    ((Data) obj).destroy();
                }
            });
            test_close_with_work(protectedPointer);
        }
    }

    public static void test_close_anywhere1(ProtectedPointer protectedPointer) {
        if (protectedPointer.enter()) {
            Data data = (Data) protectedPointer.getData();
            protectedPointer.release();
            data.work();
            protectedPointer.exit();
        }
    }

    public static void test_close_with_work(final ProtectedPointer protectedPointer) {
        Thread thread = new Thread(new Runnable() { // from class: org.android.spdy.ProtectedPointerTest.1
            @Override // java.lang.Runnable
            public void run() {
                for (int i10 = 0; i10 < 1000; i10++) {
                    if (protectedPointer.enter()) {
                        ((Data) protectedPointer.getData()).work();
                        protectedPointer.exit();
                    } else {
                        System.out.println("the data has been destroy");
                    }
                }
            }
        });
        new Thread(new Runnable() { // from class: org.android.spdy.ProtectedPointerTest.2
            @Override // java.lang.Runnable
            public void run() {
                protectedPointer.release();
            }
        }).run();
        thread.run();
    }

    public static void test_sequece(ProtectedPointer protectedPointer) {
        protectedPointer.release();
    }
}
