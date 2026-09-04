package a9;

import androidx.annotation.n0;
import com.google.android.gms.common.internal.p;
import com.meituan.robust.Constants;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class c implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1187b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicInteger f1188c = new AtomicInteger();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ThreadFactory f1189d = Executors.defaultThreadFactory();

    @v8.a
    public c(@n0 String str) {
        p.m(str, "Name must not be null");
        this.f1187b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @n0
    public final Thread newThread(@n0 Runnable runnable) {
        Thread threadNewThread = this.f1189d.newThread(new d(runnable, 0));
        threadNewThread.setName(this.f1187b + Constants.ARRAY_TYPE + this.f1188c.getAndIncrement() + "]");
        return threadNewThread;
    }
}
