package com.max.video.impl;

import af.i;
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
@kotlin.coroutines.jvm.internal.d(c = "com.max.video.impl.PlainVideoUI$bind$7$11", f = "PlainVideoUI.kt", i = {}, l = {419}, m = "invokeSuspend", n = {}, s = {})
public final class PlainVideoUI$bind$7$11 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f75979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbsVideoView f75980c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PlainVideoUI f75981d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ze.c f75982e;

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class a<T> implements kotlinx.coroutines.flow.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ PlainVideoUI f75983b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ze.c f75984c;

        a(PlainVideoUI plainVideoUI, ze.c cVar) {
            this.f75983b = plainVideoUI;
            this.f75984c = cVar;
        }

        @dl.e
        public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, bb.c.m.mm, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (z10) {
                PlainVideoUI.I(this.f75983b, false);
                ((i) this.f75984c).showLoading();
            } else {
                ((i) this.f75984c).b();
                PlainVideoUI.B(this.f75983b, false);
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.nm, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(((Boolean) obj).booleanValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlainVideoUI$bind$7$11(AbsVideoView absVideoView, PlainVideoUI plainVideoUI, ze.c cVar, kotlin.coroutines.c<? super PlainVideoUI$bind$7$11> cVar2) {
        super(2, cVar2);
        this.f75980c = absVideoView;
        this.f75981d = plainVideoUI;
        this.f75982e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.jm, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PlainVideoUI$bind$7$11(this.f75980c, this.f75981d, this.f75982e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.lm, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.km, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PlainVideoUI$bind$7$11) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        u<Boolean> uVarW;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.im, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f75979b;
        if (i10 == 0) {
            t0.n(obj);
            com.max.video.player.a player = this.f75980c.getPlayer();
            if (player == null || (uVarW = player.w()) == null) {
                return b2.f124493a;
            }
            a aVar = new a(this.f75981d, this.f75982e);
            this.f75979b = 1;
            if (uVarW.a(aVar, this) == objH) {
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
