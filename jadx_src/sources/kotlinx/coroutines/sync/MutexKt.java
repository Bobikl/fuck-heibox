package kotlinx.coroutines.sync;

import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.jvm.internal.c0;
import kotlin.t0;
import kotlinx.coroutines.internal.o0;

/* JADX INFO: compiled from: Mutex.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000,\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0010\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0001\u001a\u00020\u0000\u001aD\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0004*\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007H\u0086Hø\u0001\u0000\u0082\u0002\n\n\b\b\u0001\u0012\u0002\u0010\u0002 \u0001¢\u0006\u0004\b\t\u0010\n\"\u001a\u0010\u000f\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u0012\u0004\b\r\u0010\u000e\"\u001a\u0010\u0012\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0010\u0010\f\u0012\u0004\b\u0011\u0010\u000e\"\u001a\u0010\u0015\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0013\u0010\f\u0012\u0004\b\u0014\u0010\u000e\"\u001a\u0010\u0018\u001a\u00020\u000b8\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0016\u0010\f\u0012\u0004\b\u0017\u0010\u000e\"\u001a\u0010\u001d\u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u000e\"\u001a\u0010 \u001a\u00020\u00198\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010\u000e\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006!"}, d2 = {"", "locked", "Lkotlinx/coroutines/sync/c;", ak.av, androidx.exifinterface.media.a.f23244d5, "", "owner", "Lkotlin/Function0;", "action", "o", "(Lkotlinx/coroutines/sync/c;Ljava/lang/Object;Lyh/a;Lkotlin/coroutines/c;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/o0;", "Lkotlinx/coroutines/internal/o0;", "getLOCK_FAIL$annotations", "()V", "LOCK_FAIL", "b", "getUNLOCK_FAIL$annotations", "UNLOCK_FAIL", ak.aF, "getLOCKED$annotations", "LOCKED", "d", "getUNLOCKED$annotations", "UNLOCKED", "Lkotlinx/coroutines/sync/b;", "e", "Lkotlinx/coroutines/sync/b;", "getEMPTY_LOCKED$annotations", "EMPTY_LOCKED", "f", "getEMPTY_UNLOCKED$annotations", "EMPTY_UNLOCKED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class MutexKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final o0 f130456a = new o0("LOCK_FAIL");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final o0 f130457b = new o0("UNLOCK_FAIL");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final o0 f130458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final o0 f130459d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final b f130460e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.d
    private static final b f130461f;

    static {
        o0 o0Var = new o0("LOCKED");
        f130458c = o0Var;
        o0 o0Var2 = new o0("UNLOCKED");
        f130459d = o0Var2;
        f130460e = new b(o0Var);
        f130461f = new b(o0Var2);
    }

    @dl.d
    public static final c a(boolean z10) {
        return new MutexImpl(z10);
    }

    public static /* synthetic */ c b(boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        return a(z10);
    }

    private static /* synthetic */ void i() {
    }

    private static /* synthetic */ void j() {
    }

    private static /* synthetic */ void k() {
    }

    private static /* synthetic */ void l() {
    }

    private static /* synthetic */ void m() {
    }

    private static /* synthetic */ void n() {
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @dl.e
    public static final <T> Object o(@dl.d c cVar, @dl.e Object obj, @dl.d yh.a<? extends T> aVar, @dl.d kotlin.coroutines.c<? super T> cVar2) throws Throwable {
        MutexKt$withLock$1 mutexKt$withLock$1;
        if (cVar2 instanceof MutexKt$withLock$1) {
            mutexKt$withLock$1 = (MutexKt$withLock$1) cVar2;
            int i10 = mutexKt$withLock$1.f130466f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                mutexKt$withLock$1.f130466f = i10 - Integer.MIN_VALUE;
            } else {
                mutexKt$withLock$1 = new MutexKt$withLock$1(cVar2);
            }
        } else {
            mutexKt$withLock$1 = new MutexKt$withLock$1(cVar2);
        }
        Object obj2 = mutexKt$withLock$1.f130465e;
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i11 = mutexKt$withLock$1.f130466f;
        if (i11 == 0) {
            t0.n(obj2);
            mutexKt$withLock$1.f130462b = cVar;
            mutexKt$withLock$1.f130463c = obj;
            mutexKt$withLock$1.f130464d = aVar;
            mutexKt$withLock$1.f130466f = 1;
            if (cVar.e(obj, mutexKt$withLock$1) == objH) {
                return objH;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            aVar = (yh.a) mutexKt$withLock$1.f130464d;
            obj = mutexKt$withLock$1.f130463c;
            cVar = (c) mutexKt$withLock$1.f130462b;
            t0.n(obj2);
        }
        try {
            return aVar.invoke();
        } finally {
            c0.d(1);
            cVar.f(obj);
            c0.c(1);
        }
    }

    private static final <T> Object p(c cVar, Object obj, yh.a<? extends T> aVar, kotlin.coroutines.c<? super T> cVar2) {
        c0.e(0);
        cVar.e(obj, cVar2);
        c0.e(1);
        try {
            return aVar.invoke();
        } finally {
            c0.d(1);
            cVar.f(obj);
            c0.c(1);
        }
    }

    public static /* synthetic */ Object q(c cVar, Object obj, yh.a aVar, kotlin.coroutines.c cVar2, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = null;
        }
        c0.e(0);
        cVar.e(obj, cVar2);
        c0.e(1);
        try {
            return aVar.invoke();
        } finally {
            c0.d(1);
            cVar.f(obj);
            c0.c(1);
        }
    }
}
