package k;

import com.tencent.msdk.dns.base.executor.DnsExecutors;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: CountDownManager.java */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public List<c> f124364a = Collections.emptyList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CountDownLatch f124365b = null;

    public CountDownLatch a() {
        CountDownLatch countDownLatch = this.f124365b;
        if (countDownLatch == null) {
            int i10 = 0;
            Iterator<c> it = this.f124364a.iterator();
            while (it.hasNext()) {
                if (!it.next().f124363c) {
                    i10++;
                }
            }
            countDownLatch = new CountDownLatch(i10);
        }
        Iterator<c> it2 = this.f124364a.iterator();
        while (it2.hasNext()) {
            DnsExecutors.f100946c.execute(new b(it2.next(), countDownLatch));
        }
        this.f124364a.clear();
        this.f124365b = countDownLatch;
        return countDownLatch;
    }

    public synchronized d b(Runnable runnable, boolean z10) {
        try {
            if (runnable == null) {
                throw new IllegalArgumentException("task".concat(" can not be null"));
            }
            if (Collections.emptyList() == this.f124364a) {
                this.f124364a = new ArrayList();
            }
            this.f124364a.add(new c(runnable, z10));
        } catch (Throwable th2) {
            throw th2;
        }
        return this;
    }
}
