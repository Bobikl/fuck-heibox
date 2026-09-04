package com.max.video.impl;

import af.o;
import com.max.video.AbsVideoView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: PlainVideoUI.kt */
/* JADX INFO: loaded from: classes8.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.video.impl.PlainVideoUI$bind$7$8", f = "PlainVideoUI.kt", i = {}, l = {bb.c.b.G3}, m = "invokeSuspend", n = {}, s = {})
public final class PlainVideoUI$bind$7$8 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f76009b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbsVideoView f76010c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ PlainVideoUI f76011d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ ze.c f76012e;

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class a<T> implements kotlinx.coroutines.flow.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbsVideoView f76013b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PlainVideoUI f76014c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ ze.c f76015d;

        a(AbsVideoView absVideoView, PlainVideoUI plainVideoUI, ze.c cVar) {
            this.f76013b = absVideoView;
            this.f76014c = plainVideoUI;
            this.f76015d = cVar;
        }

        @dl.e
        public final Object a(float f10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            u<Integer> uVarL;
            u<Boolean> uVarK;
            u<Integer> uVarC0;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), cVar}, this, changeQuickRedirect, false, bb.c.m.dn, new Class[]{Float.TYPE, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            ze.b gestureHandler = this.f76013b.getGestureHandler();
            if (gestureHandler != null && gestureHandler.m()) {
                if (this.f76014c.f75937e) {
                    return b2.f124493a;
                }
                com.max.video.player.a player = this.f76013b.getPlayer();
                int iIntValue = (player == null || (uVarC0 = player.c0()) == null) ? 0 : uVarC0.getValue().intValue();
                com.max.video.player.a player2 = this.f76013b.getPlayer();
                if (player2 == null || (uVarL = player2.L()) == null) {
                    return b2.f124493a;
                }
                int iIntValue2 = uVarL.getValue().intValue() + ((int) (f10 * iIntValue));
                if (iIntValue2 > iIntValue) {
                    iIntValue2 = iIntValue;
                } else if (iIntValue2 < 0) {
                    iIntValue2 = 0;
                }
                ze.b gestureHandler2 = this.f76013b.getGestureHandler();
                if ((gestureHandler2 == null || (uVarK = gestureHandler2.k()) == null || !uVarK.getValue().booleanValue()) ? false : true) {
                    PlainVideoUI.I(this.f76014c, false);
                    ze.c cVar2 = this.f76015d;
                    f0.n(cVar2, "null cannot be cast to non-null type com.max.video.ui.abilities.SeekDragAware");
                    ((o) cVar2).a();
                }
                ze.c cVar3 = this.f76015d;
                f0.n(cVar3, "null cannot be cast to non-null type com.max.video.ui.abilities.SeekDragAware");
                ((o) cVar3).f(iIntValue2, iIntValue);
            }
            ze.b gestureHandler3 = this.f76013b.getGestureHandler();
            if (gestureHandler3 != null) {
                gestureHandler3.s(true);
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.en, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(((Number) obj).floatValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlainVideoUI$bind$7$8(AbsVideoView absVideoView, PlainVideoUI plainVideoUI, ze.c cVar, kotlin.coroutines.c<? super PlainVideoUI$bind$7$8> cVar2) {
        super(2, cVar2);
        this.f76010c = absVideoView;
        this.f76011d = plainVideoUI;
        this.f76012e = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.an, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PlainVideoUI$bind$7$8(this.f76010c, this.f76011d, this.f76012e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34665cn, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.bn, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PlainVideoUI$bind$7$8) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        u<Float> uVarL;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Zm, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f76009b;
        if (i10 == 0) {
            t0.n(obj);
            ze.b gestureHandler = this.f76010c.getGestureHandler();
            if (gestureHandler == null || (uVarL = gestureHandler.l()) == null) {
                return b2.f124493a;
            }
            a aVar = new a(this.f76010c, this.f76011d, this.f76012e);
            this.f76009b = 1;
            if (uVarL.a(aVar, this) == objH) {
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
