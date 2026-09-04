package androidx.compose.runtime;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;

/* JADX INFO: compiled from: ActualJvm.jvm.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u001a/\u0010\b\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\u0006\u0010\u0005\u001a\u00020\u00002\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0081\bø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u001a*\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00020\f0\u0006¢\u0006\u0002\b\rH\u0000¢\u0006\u0004\b\u000f\u0010\u0010\u001a0\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00112\u0006\u0010\u000b\u001a\u00020\n2\u0011\u0010\u000e\u001a\r\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\b\rH\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0010\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0000H\u0000*\u001e\b\u0000\u0010\u0018\u001a\u0004\b\u0000\u0010\u0016\"\b\u0012\u0004\u0012\u00028\u00000\u00172\b\u0012\u0004\u0012\u00028\u00000\u0017*\f\b\u0000\u0010\u001a\"\u00020\u00192\u00020\u0019\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u001b"}, d2 = {"", "instance", "", "b", "R", "lock", "Lkotlin/Function0;", "block", "e", "(Ljava/lang/Object;Lyh/a;)Ljava/lang/Object;", "Landroidx/compose/runtime/p;", "composer", "Lkotlin/b2;", "Landroidx/compose/runtime/h;", "composable", ak.aF, "(Landroidx/compose/runtime/p;Lyh/p;)V", androidx.exifinterface.media.a.f23244d5, "d", "(Landroidx/compose/runtime/p;Lyh/p;)Ljava/lang/Object;", "it", ak.av, androidx.exifinterface.media.a.X4, "Ljava/util/concurrent/atomic/AtomicReference;", "AtomicReference", "Ldl/g;", "TestOnly", "runtime_release"}, k = 2, mv = {1, 7, 1})
public final class b {
    public static final void a(@dl.d Object it) {
        kotlin.jvm.internal.f0.p(it, "it");
    }

    public static final int b(@dl.e Object obj) {
        return System.identityHashCode(obj);
    }

    public static final void c(@dl.d p composer, @dl.d yh.p<? super p, ? super Integer, kotlin.b2> composable) {
        kotlin.jvm.internal.f0.p(composer, "composer");
        kotlin.jvm.internal.f0.p(composable, "composable");
        ((yh.p) kotlin.jvm.internal.w0.q(composable, 2)).invoke(composer, 1);
    }

    public static final <T> T d(@dl.d p composer, @dl.d yh.p<? super p, ? super Integer, ? extends T> composable) {
        kotlin.jvm.internal.f0.p(composer, "composer");
        kotlin.jvm.internal.f0.p(composable, "composable");
        return (T) ((yh.p) kotlin.jvm.internal.w0.q(composable, 2)).invoke(composer, 1);
    }

    @kotlin.r0
    public static final <R> R e(@dl.d Object lock, @dl.d yh.a<? extends R> block) {
        R rInvoke;
        kotlin.jvm.internal.f0.p(lock, "lock");
        kotlin.jvm.internal.f0.p(block, "block");
        synchronized (lock) {
            try {
                rInvoke = block.invoke();
                kotlin.jvm.internal.c0.d(1);
            } finally {
                kotlin.jvm.internal.c0.d(1);
                kotlin.jvm.internal.c0.c(1);
            }
        }
        return rInvoke;
    }
}
