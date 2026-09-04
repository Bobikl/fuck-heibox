package kotlinx.coroutines;

import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.internal.ThreadContextKt;

/* JADX INFO: compiled from: DispatchedTask.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0011\u001a \u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a.\u0010\n\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\t\u001a\u00020\bH\u0000\u001a\u0010\u0010\u000b\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u0001H\u0002\u001a'\u0010\u0010\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000eH\u0080\b\u001a\u0019\u0010\u0013\u001a\u00020\u0004*\u0006\u0012\u0002\b\u00030\u00062\u0006\u0010\u0012\u001a\u00020\u0011H\u0080\b\"\u0014\u0010\u0015\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014\"\u001a\u0010\u0019\u001a\u00020\u00028\u0000X\u0081T¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u0012\u0004\b\u0017\u0010\u0018\"\u0014\u0010\u001b\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0014\"\u0014\u0010\u001d\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u001c\u0010\u0014\"\u0014\u0010\u001e\u001a\u00020\u00028\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\u0014\"\u0018\u0010 \u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001f\"\u0018\u0010!\u001a\u00020\b*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001f¨\u0006\""}, d2 = {androidx.exifinterface.media.a.f23244d5, "Lkotlinx/coroutines/b1;", "", "mode", "Lkotlin/b2;", ak.av, "Lkotlin/coroutines/c;", "delegate", "", "undispatched", "e", "f", "Lkotlinx/coroutines/l1;", "eventLoop", "Lkotlin/Function0;", "block", RXScreenCaptureService.KEY_HEIGHT, "", "exception", "g", "I", "MODE_ATOMIC", "b", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE", ak.aF, "MODE_CANCELLABLE_REUSABLE", "d", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "(I)Z", "isCancellableMode", "isReusableMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0})
public final class c1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f128747a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f128748b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f128749c = 2;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f128750d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f128751e = -1;

    public static final <T> void a(@dl.d b1<? super T> b1Var, int i10) {
        kotlin.coroutines.c<? super T> cVarD = b1Var.d();
        boolean z10 = i10 == 4;
        if (z10 || !(cVarD instanceof kotlinx.coroutines.internal.l) || c(i10) != c(b1Var.resumeMode)) {
            e(b1Var, cVarD, z10);
            return;
        }
        CoroutineDispatcher coroutineDispatcher = ((kotlinx.coroutines.internal.l) cVarD).dispatcher;
        CoroutineContext context = cVarD.getCom.umeng.analytics.pro.d.R java.lang.String();
        if (coroutineDispatcher.V(context)) {
            coroutineDispatcher.O(context, b1Var);
        } else {
            f(b1Var);
        }
    }

    @kotlin.r0
    public static /* synthetic */ void b() {
    }

    public static final boolean c(int i10) {
        return i10 == 1 || i10 == 2;
    }

    public static final boolean d(int i10) {
        return i10 == 2;
    }

    public static final <T> void e(@dl.d b1<? super T> b1Var, @dl.d kotlin.coroutines.c<? super T> cVar, boolean z10) {
        Object objF;
        Object objH = b1Var.h();
        Throwable thE = b1Var.e(objH);
        if (thE != null) {
            Result.a aVar = Result.f124476c;
            objF = kotlin.t0.a(thE);
        } else {
            Result.a aVar2 = Result.f124476c;
            objF = b1Var.f(objH);
        }
        Object objB = Result.b(objF);
        if (!z10) {
            cVar.resumeWith(objB);
            return;
        }
        kotlinx.coroutines.internal.l lVar = (kotlinx.coroutines.internal.l) cVar;
        kotlin.coroutines.c<T> cVar2 = lVar.continuation;
        Object obj = lVar.countOrElement;
        CoroutineContext context = cVar2.getCom.umeng.analytics.pro.d.R java.lang.String();
        Object objC = ThreadContextKt.c(context, obj);
        o3<?> o3VarG = objC != ThreadContextKt.f130141a ? CoroutineContextKt.g(cVar2, context, objC) : null;
        try {
            lVar.continuation.resumeWith(objB);
            kotlin.b2 b2Var = kotlin.b2.f124493a;
        } finally {
            if (o3VarG == null || o3VarG.L1()) {
                ThreadContextKt.a(context, objC);
            }
        }
    }

    private static final void f(b1<?> b1Var) {
        l1 l1VarB = i3.f130113a.b();
        if (l1VarB.B0()) {
            l1VarB.u0(b1Var);
            return;
        }
        l1VarB.w0(true);
        try {
            e(b1Var, b1Var.d(), true);
            do {
            } while (l1VarB.E0());
        } catch (Throwable th2) {
            try {
                b1Var.g(th2, null);
            } finally {
                l1VarB.p0(true);
            }
        }
    }

    public static final void g(@dl.d kotlin.coroutines.c<?> cVar, @dl.d Throwable th2) {
        Result.a aVar = Result.f124476c;
        cVar.resumeWith(Result.b(kotlin.t0.a(th2)));
    }

    public static final void h(@dl.d b1<?> b1Var, @dl.d l1 l1Var, @dl.d yh.a<kotlin.b2> aVar) {
        l1Var.w0(true);
        try {
            aVar.invoke();
            do {
            } while (l1Var.E0());
            kotlin.jvm.internal.c0.d(1);
        } catch (Throwable th2) {
            try {
                b1Var.g(th2, null);
                kotlin.jvm.internal.c0.d(1);
            } finally {
                kotlin.jvm.internal.c0.d(1);
                l1Var.p0(true);
                kotlin.jvm.internal.c0.c(1);
            }
        }
    }
}
