package com.max.xiaoheihe.module.bbs.post.utils;

import android.util.Log;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.DelayKt;
import kotlinx.coroutines.q0;
import kotlinx.coroutines.r0;
import yh.p;

/* JADX INFO: compiled from: SimpleDoubleTapDetector.kt */
/* JADX INFO: loaded from: classes10.dex */
@d(c = "com.max.xiaoheihe.module.bbs.post.utils.SimpleDoubleClickDetector$onClick$2", f = "SimpleDoubleTapDetector.kt", i = {0}, l = {41}, m = "invokeSuspend", n = {"$this$launch"}, s = {"L$0"})
public final class SimpleDoubleClickDetector$onClick$2 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f82037b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private /* synthetic */ Object f82038c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ SimpleDoubleClickDetector f82039d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SimpleDoubleClickDetector$onClick$2(SimpleDoubleClickDetector simpleDoubleClickDetector, c<? super SimpleDoubleClickDetector$onClick$2> cVar) {
        super(2, cVar);
        this.f82039d = simpleDoubleClickDetector;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, 29500, new Class[]{Object.class, c.class}, c.class);
        if (patchProxyResultProxy.isSupported) {
            return (c) patchProxyResultProxy.result;
        }
        SimpleDoubleClickDetector$onClick$2 simpleDoubleClickDetector$onClick$2 = new SimpleDoubleClickDetector$onClick$2(this.f82039d, cVar);
        simpleDoubleClickDetector$onClick$2.f82038c = obj;
        return simpleDoubleClickDetector$onClick$2;
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29502, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, 29501, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((SimpleDoubleClickDetector$onClick$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        q0 q0Var;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 29499, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = b.h();
        int i10 = this.f82037b;
        if (i10 == 0) {
            t0.n(obj);
            q0 q0Var2 = (q0) this.f82038c;
            if (!r0.k(q0Var2)) {
                return b2.f124493a;
            }
            long j10 = this.f82039d.f82025a;
            this.f82038c = q0Var2;
            this.f82037b = 1;
            if (DelayKt.b(j10, this) == objH) {
                return objH;
            }
            q0Var = q0Var2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            q0Var = (q0) this.f82038c;
            t0.n(obj);
        }
        if (!r0.k(q0Var)) {
            return b2.f124493a;
        }
        if (this.f82039d.f82029e) {
            Log.d("SimpleDoubleClickDetector", "[onClick] block single tap");
        } else {
            this.f82039d.f82027c.invoke();
        }
        this.f82039d.f82030f = false;
        return b2.f124493a;
    }
}
