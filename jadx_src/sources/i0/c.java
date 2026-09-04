package i0;

import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: LockExt.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nLockExt.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n+ 2 Lock.jvm.kt\nandroidx/collection/internal/Lock\n*L\n1#1,27:1\n26#2:28\n*S KotlinDebug\n*F\n+ 1 LockExt.kt\nandroidx/collection/internal/LockExtKt\n*L\n25#1:28\n*E\n"})
public final class c {
    public static final <T> T a(@dl.d b bVar, @dl.d yh.a<? extends T> block) {
        T tInvoke;
        f0.p(bVar, "<this>");
        f0.p(block, "block");
        synchronized (bVar) {
            try {
                tInvoke = block.invoke();
                c0.d(1);
            } finally {
                c0.d(1);
                c0.c(1);
            }
        }
        return tInvoke;
    }
}
