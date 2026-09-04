package kotlinx.coroutines.internal;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineContextKt;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.i3;
import kotlinx.coroutines.l1;
import kotlinx.coroutines.o3;
import kotlinx.coroutines.z1;

/* JADX INFO: compiled from: DispatchedContinuation.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u0000L\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u001aW\u0010\u000b\u001a\u00020\t\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022%\b\u0002\u0010\n\u001a\u001f\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0004H\u0007ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u001a\u0012\u0010\u000f\u001a\u00020\u000e*\b\u0012\u0004\u0012\u00020\t0\rH\u0000\u001a;\u0010\u0017\u001a\u00020\u000e*\u0006\u0012\u0002\b\u00030\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0015H\u0082\b\"\u001a\u0010\u001d\u001a\u00020\u00188\u0002X\u0083\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u0012\u0004\b\u001b\u0010\u001c\"\u001a\u0010\u001f\u001a\u00020\u00188\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u001a\u0012\u0004\b\u001e\u0010\u001c\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlin/coroutines/c;", "Lkotlin/Result;", "result", "Lkotlin/Function1;", "", "Lkotlin/m0;", "name", "cause", "Lkotlin/b2;", "onCancellation", "f", "(Lkotlin/coroutines/c;Ljava/lang/Object;Lyh/l;)V", "Lkotlinx/coroutines/internal/l;", "", RXScreenCaptureService.KEY_HEIGHT, "", "contState", "", "mode", "doYield", "Lkotlin/Function0;", "block", "b", "Lkotlinx/coroutines/internal/o0;", ak.av, "Lkotlinx/coroutines/internal/o0;", "getUNDEFINED$annotations", "()V", "UNDEFINED", "getREUSABLE_CLAIMED$annotations", "REUSABLE_CLAIMED", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private static final o0 f130180a = new o0("UNDEFINED");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    @xh.e
    public static final o0 f130181b = new o0("REUSABLE_CLAIMED");

    private static final boolean b(l<?> lVar, Object obj, int i10, boolean z10, yh.a<b2> aVar) {
        l1 l1VarB = i3.f130113a.b();
        if (z10 && l1VarB.C0()) {
            return false;
        }
        if (l1VarB.B0()) {
            lVar._state = obj;
            lVar.resumeMode = i10;
            l1VarB.u0(lVar);
            return true;
        }
        l1VarB.w0(true);
        try {
            aVar.invoke();
            do {
            } while (l1VarB.E0());
            kotlin.jvm.internal.c0.d(1);
        } catch (Throwable th2) {
            try {
                lVar.g(th2, null);
                kotlin.jvm.internal.c0.d(1);
            } finally {
                kotlin.jvm.internal.c0.d(1);
                l1VarB.p0(true);
                kotlin.jvm.internal.c0.c(1);
            }
        }
        return false;
    }

    static /* synthetic */ boolean c(l lVar, Object obj, int i10, boolean z10, yh.a aVar, int i11, Object obj2) {
        if ((i11 & 4) != 0) {
            z10 = false;
        }
        l1 l1VarB = i3.f130113a.b();
        if (z10 && l1VarB.C0()) {
            return false;
        }
        if (l1VarB.B0()) {
            lVar._state = obj;
            lVar.resumeMode = i10;
            l1VarB.u0(lVar);
            return true;
        }
        l1VarB.w0(true);
        try {
            aVar.invoke();
            do {
            } while (l1VarB.E0());
            kotlin.jvm.internal.c0.d(1);
        } catch (Throwable th2) {
            try {
                lVar.g(th2, null);
                kotlin.jvm.internal.c0.d(1);
            } finally {
                kotlin.jvm.internal.c0.d(1);
                l1VarB.p0(true);
                kotlin.jvm.internal.c0.c(1);
            }
        }
        return false;
    }

    public static /* synthetic */ void d() {
    }

    private static /* synthetic */ void e() {
    }

    @z1
    public static final <T> void f(@dl.d kotlin.coroutines.c<? super T> cVar, @dl.d Object obj, @dl.e yh.l<? super Throwable, b2> lVar) {
        boolean z10;
        if (!(cVar instanceof l)) {
            cVar.resumeWith(obj);
            return;
        }
        l lVar2 = (l) cVar;
        Object objC = kotlinx.coroutines.i0.c(obj, lVar);
        if (lVar2.dispatcher.V(lVar2.getCom.umeng.analytics.pro.d.R java.lang.String())) {
            lVar2._state = objC;
            lVar2.resumeMode = 1;
            lVar2.dispatcher.O(lVar2.getCom.umeng.analytics.pro.d.R java.lang.String(), lVar2);
            return;
        }
        l1 l1VarB = i3.f130113a.b();
        if (l1VarB.B0()) {
            lVar2._state = objC;
            lVar2.resumeMode = 1;
            l1VarB.u0(lVar2);
            return;
        }
        l1VarB.w0(true);
        try {
            d2 d2Var = (d2) lVar2.getCom.umeng.analytics.pro.d.R java.lang.String().f(d2.INSTANCE);
            if (d2Var == null || d2Var.isActive()) {
                z10 = false;
            } else {
                CancellationException cancellationExceptionZ = d2Var.Z();
                lVar2.c(objC, cancellationExceptionZ);
                Result.a aVar = Result.f124476c;
                lVar2.resumeWith(Result.b(kotlin.t0.a(cancellationExceptionZ)));
                z10 = true;
            }
            if (!z10) {
                kotlin.coroutines.c<T> cVar2 = lVar2.continuation;
                Object obj2 = lVar2.countOrElement;
                CoroutineContext context = cVar2.getCom.umeng.analytics.pro.d.R java.lang.String();
                Object objC2 = ThreadContextKt.c(context, obj2);
                o3<?> o3VarG = objC2 != ThreadContextKt.f130141a ? CoroutineContextKt.g(cVar2, context, objC2) : null;
                try {
                    lVar2.continuation.resumeWith(obj);
                    b2 b2Var = b2.f124493a;
                    if (o3VarG == null || o3VarG.L1()) {
                        ThreadContextKt.a(context, objC2);
                    }
                } catch (Throwable th2) {
                    if (o3VarG == null || o3VarG.L1()) {
                        ThreadContextKt.a(context, objC2);
                    }
                    throw th2;
                }
            }
            while (l1VarB.E0()) {
            }
        } catch (Throwable th3) {
            try {
                lVar2.g(th3, null);
            } finally {
                l1VarB.p0(true);
            }
        }
    }

    public static /* synthetic */ void g(kotlin.coroutines.c cVar, Object obj, yh.l lVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            lVar = null;
        }
        f(cVar, obj, lVar);
    }

    public static final boolean h(@dl.d l<? super b2> lVar) {
        b2 b2Var = b2.f124493a;
        l1 l1VarB = i3.f130113a.b();
        if (l1VarB.C0()) {
            return false;
        }
        if (l1VarB.B0()) {
            lVar._state = b2Var;
            lVar.resumeMode = 1;
            l1VarB.u0(lVar);
            return true;
        }
        l1VarB.w0(true);
        try {
            lVar.run();
            do {
            } while (l1VarB.E0());
        } catch (Throwable th2) {
            try {
                lVar.g(th2, null);
            } finally {
                l1VarB.p0(true);
            }
        }
        return false;
    }
}
