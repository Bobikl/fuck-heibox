package androidx.work.impl.utils;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: SynchronousExecutor.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class z implements Executor {
    @Override // java.util.concurrent.Executor
    public void execute(@n0 Runnable runnable) {
        runnable.run();
    }
}
