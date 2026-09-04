package k;

import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: CountDownManager.java */
/* JADX INFO: loaded from: classes.dex */
public class b implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f124361b;

    public b(c cVar, CountDownLatch countDownLatch) {
        this.f124361b = cVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            this.f124361b.f124362b.run();
        } catch (Exception e10) {
            f.b.e("exception: %s", e10);
        }
    }
}
