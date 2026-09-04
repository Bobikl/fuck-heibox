package com.max.video.impl;

import af.m;
import com.max.video.AbsVideoView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: PlainVideoUI.kt */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.video.impl.PlainVideoUI$bind$7$7", f = "PlainVideoUI.kt", i = {}, l = {bb.c.b.f31053y3}, m = "invokeSuspend", n = {}, s = {})
public final class PlainVideoUI$bind$7$7 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f76005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbsVideoView f76006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ ze.c f76007d;

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class a<T> implements kotlinx.coroutines.flow.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ze.c f76008b;

        a(ze.c cVar) {
            this.f76008b = cVar;
        }

        @dl.e
        public final Object a(int i10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), cVar}, this, changeQuickRedirect, false, bb.c.m.Xm, new Class[]{Integer.TYPE, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            ((m) this.f76008b).e(i10);
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Ym, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(((Number) obj).intValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlainVideoUI$bind$7$7(AbsVideoView absVideoView, ze.c cVar, kotlin.coroutines.c<? super PlainVideoUI$bind$7$7> cVar2) {
        super(2, cVar2);
        this.f76006c = absVideoView;
        this.f76007d = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Um, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PlainVideoUI$bind$7$7(this.f76006c, this.f76007d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Wm, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Vm, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PlainVideoUI$bind$7$7) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        u<Integer> uVarP;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Tm, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f76005b;
        if (i10 == 0) {
            t0.n(obj);
            com.max.video.player.a player = this.f76006c.getPlayer();
            if (player == null || (uVarP = player.P()) == null) {
                return b2.f124493a;
            }
            a aVar = new a(this.f76007d);
            this.f76005b = 1;
            if (uVarP.a(aVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        throw new KotlinNothingValueException();
    }
}
