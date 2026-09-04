package a9;

import androidx.annotation.n0;
import com.google.android.gms.common.internal.p;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class b implements ThreadFactory {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f1185b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ThreadFactory f1186c = Executors.defaultThreadFactory();

    @v8.a
    public b(@n0 String str) {
        p.m(str, "Name must not be null");
        this.f1185b = str;
    }

    @Override // java.util.concurrent.ThreadFactory
    @n0
    public final Thread newThread(@n0 Runnable runnable) {
        Thread threadNewThread = this.f1186c.newThread(new d(runnable, 0));
        threadNewThread.setName(this.f1185b);
        return threadNewThread;
    }
}
