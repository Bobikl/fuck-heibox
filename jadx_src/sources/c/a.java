package c;

import android.os.Process;
import com.tencent.msdk.dns.base.executor.DnsExecutors;

/* JADX INFO: compiled from: DnsExecutors.java */
/* JADX INFO: loaded from: classes.dex */
public final class a implements Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Runnable f35565b;

    public a(Runnable runnable) {
        this.f35565b = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        int threadPriority;
        String str = "dns-work-" + DnsExecutors.f100944a.getAndIncrement();
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(str);
        try {
            threadPriority = Process.getThreadPriority(Process.myTid());
            if (10 != threadPriority) {
                try {
                    Process.setThreadPriority(10);
                } catch (Exception e10) {
                    e = e10;
                    f.b.e("exception: %s", e);
                }
            }
        } catch (Exception e11) {
            e = e11;
            threadPriority = Integer.MIN_VALUE;
        }
        try {
            Runnable runnable = this.f35565b;
            if (runnable != null) {
                runnable.run();
            }
        } catch (Exception e12) {
            f.b.a(5, e12, "Run task in executor failed", new Object[0]);
        }
        if (Integer.MIN_VALUE != threadPriority) {
            try {
                if (threadPriority != Process.getThreadPriority(Process.myTid())) {
                    Process.setThreadPriority(threadPriority);
                }
            } catch (Exception e13) {
                f.b.e("exception: %s", e13);
            }
        }
        Thread.currentThread().setName(name);
    }
}
