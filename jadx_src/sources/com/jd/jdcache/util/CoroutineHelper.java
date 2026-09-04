package com.jd.jdcache.util;

import androidx.annotation.Keep;
import com.jd.jdcache.JDCacheConstant;
import dl.d;
import dl.e;
import kotlin.Result;
import kotlin.b2;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.i;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import xh.m;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: CoroutineHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@t0({"SMAP\nCoroutineHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineHelper.kt\ncom/jd/jdcache/util/CoroutineHelper\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,53:1\n1#2:54\n*E\n"})
@Keep
public final class CoroutineHelper {

    @d
    public static final CoroutineHelper INSTANCE = new CoroutineHelper();

    /* JADX INFO: renamed from: com.jd.jdcache.util.CoroutineHelper$launchCoroutine$1, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineHelper.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.util.CoroutineHelper$launchCoroutine$1", f = "CoroutineHelper.kt", i = {}, l = {29}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f64288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<kotlin.coroutines.c<? super b2>, Object> f64289c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass1(l<? super kotlin.coroutines.c<? super b2>, ? extends Object> lVar, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
            super(2, cVar);
            this.f64289c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass1(this.f64289c, cVar);
        }

        @Override // yh.p
        @e
        public final Object invoke(@d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
            return ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f64288b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                l<kotlin.coroutines.c<? super b2>, Object> lVar = this.f64289c;
                this.f64288b = 1;
                if (lVar.invoke(this) == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return b2.f124493a;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: com.jd.jdcache.util.CoroutineHelper$runOnIo$2, reason: invalid class name */
    /* JADX INFO: compiled from: CoroutineHelper.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.jd.jdcache.util.CoroutineHelper$runOnIo$2", f = "CoroutineHelper.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2<T> extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super T>, Object> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f64290b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<kotlin.coroutines.c<? super T>, Object> f64291c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(l<? super kotlin.coroutines.c<? super T>, ? extends Object> lVar, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
            super(2, cVar);
            this.f64291c = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final kotlin.coroutines.c<b2> create(@e Object obj, @d kotlin.coroutines.c<?> cVar) {
            return new AnonymousClass2(this.f64291c, cVar);
        }

        @Override // yh.p
        @e
        public final Object invoke(@d q0 q0Var, @e kotlin.coroutines.c<? super T> cVar) {
            return ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            Object objH = kotlin.coroutines.intrinsics.b.h();
            int i10 = this.f64290b;
            if (i10 == 0) {
                kotlin.t0.n(obj);
                l<kotlin.coroutines.c<? super T>, Object> lVar = this.f64291c;
                this.f64290b = 1;
                obj = lVar.invoke(this);
                if (obj == objH) {
                    return objH;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.t0.n(obj);
            }
            return obj;
        }
    }

    private CoroutineHelper() {
    }

    public static /* synthetic */ d2 launchCoroutine$default(CoroutineHelper coroutineHelper, Object obj, q0 q0Var, l lVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            q0Var = JDCacheConstant.f64122a.a();
        }
        return coroutineHelper.launchCoroutine(obj, q0Var, lVar);
    }

    @m
    public static final <T> void onFail(@d kotlin.coroutines.c<? super T> cVar, @d Throwable throwable) {
        f0.p(cVar, "<this>");
        f0.p(throwable, "throwable");
        Result.a aVar = Result.f124476c;
        cVar.resumeWith(Result.b(kotlin.t0.a(throwable)));
    }

    @m
    public static final <T> void onSuccess(@d kotlin.coroutines.c<? super T> cVar, T t10) {
        f0.p(cVar, "<this>");
        Result.a aVar = Result.f124476c;
        cVar.resumeWith(Result.b(t10));
    }

    public static /* synthetic */ Object runOnIo$default(CoroutineHelper coroutineHelper, Object obj, q0 q0Var, l lVar, kotlin.coroutines.c cVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            q0Var = null;
        }
        return coroutineHelper.runOnIo(obj, q0Var, lVar, cVar);
    }

    @d
    public final d2 launchCoroutine(@e Object obj, @e q0 q0Var, @d l<? super kotlin.coroutines.c<? super b2>, ? extends Object> block) {
        f0.p(block, "block");
        if (q0Var == null) {
            q0Var = JDCacheConstant.f64122a.a();
        }
        return k.f(q0Var, null, null, new AnonymousClass1(block, null), 3, null);
    }

    @e
    public final <T> Object runOnIo(@e Object obj, @e q0 q0Var, @d l<? super kotlin.coroutines.c<? super T>, ? extends Object> lVar, @d kotlin.coroutines.c<? super T> cVar) {
        CoroutineContext coroutineContextB;
        if (q0Var == null || (coroutineContextB = q0Var.getCoroutineContext().I(JDCacheConstant.f64122a.b())) == null) {
            coroutineContextB = JDCacheConstant.f64122a.b();
        }
        return i.h(coroutineContextB, new AnonymousClass2(lVar, null), cVar);
    }
}
