package androidx.arch.core.executor;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;

/* JADX INFO: compiled from: TaskExecutor.java */
/* JADX INFO: loaded from: classes.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public abstract class f {
    public abstract void a(@n0 Runnable runnable);

    public void b(@n0 Runnable runnable) {
        if (c()) {
            runnable.run();
        } else {
            d(runnable);
        }
    }

    public abstract boolean c();

    public abstract void d(@n0 Runnable runnable);
}
