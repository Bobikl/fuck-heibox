package androidx.activity.contextaware;

import android.content.Context;
import dl.d;
import dl.e;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.q;
import yh.l;

/* JADX INFO: compiled from: ContextAware.kt */
/* JADX INFO: loaded from: classes.dex */
@t0({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n+ 2 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n*L\n1#1,93:1\n314#2,11:94\n*S KotlinDebug\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt\n*L\n81#1:94,11\n*E\n"})
public final class ContextAwareKt {

    /* JADX INFO: compiled from: ContextAware.kt */
    @t0({"SMAP\nContextAware.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextAware.kt\nandroidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,93:1\n1#2:94\n*E\n"})
    public static final class a implements c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ p<R> f1471a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l<Context, R> f1472b;

        public a(p<R> pVar, l<Context, R> lVar) {
            this.f1471a = pVar;
            this.f1472b = lVar;
        }

        @Override // androidx.activity.contextaware.c
        public void a(@d Context context) {
            Object objB;
            f0.p(context, "context");
            kotlin.coroutines.c cVar = this.f1471a;
            l<Context, R> lVar = this.f1472b;
            try {
                Result.a aVar = Result.f124476c;
                objB = Result.b(lVar.invoke(context));
            } catch (Throwable th2) {
                Result.a aVar2 = Result.f124476c;
                objB = Result.b(kotlin.t0.a(th2));
            }
            cVar.resumeWith(objB);
        }
    }

    @e
    public static final <R> Object a(@d androidx.activity.contextaware.a aVar, @d l<Context, R> lVar, @d kotlin.coroutines.c<R> cVar) {
        Context contextPeekAvailableContext = aVar.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return lVar.invoke(contextPeekAvailableContext);
        }
        q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        a aVar2 = new a(qVar, lVar);
        aVar.addOnContextAvailableListener(aVar2);
        qVar.L(new ContextAwareKt$withContextAvailable$2$1(aVar, aVar2));
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            f.c(cVar);
        }
        return objT;
    }

    private static final <R> Object b(androidx.activity.contextaware.a aVar, l<Context, R> lVar, kotlin.coroutines.c<R> cVar) {
        Context contextPeekAvailableContext = aVar.peekAvailableContext();
        if (contextPeekAvailableContext != null) {
            return lVar.invoke(contextPeekAvailableContext);
        }
        c0.e(0);
        q qVar = new q(IntrinsicsKt__IntrinsicsJvmKt.d(cVar), 1);
        qVar.F0();
        a aVar2 = new a(qVar, lVar);
        aVar.addOnContextAvailableListener(aVar2);
        qVar.L(new ContextAwareKt$withContextAvailable$2$1(aVar, aVar2));
        b2 b2Var = b2.f124493a;
        Object objT = qVar.t();
        if (objT == kotlin.coroutines.intrinsics.b.h()) {
            f.c(cVar);
        }
        c0.e(1);
        return objT;
    }
}
