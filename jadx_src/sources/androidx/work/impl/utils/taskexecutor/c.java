package androidx.work.impl.utils.taskexecutor;

import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: TaskExecutor.java */
/* JADX INFO: loaded from: classes6.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public interface c {
    void a(@n0 Runnable runnable);

    @n0
    Executor b();

    @n0
    a c();
}
