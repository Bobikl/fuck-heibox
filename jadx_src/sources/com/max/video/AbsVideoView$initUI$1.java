package com.max.video;

import android.util.Log;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: AbsVideoView.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.max.video.AbsVideoView$initUI$1", f = "AbsVideoView.kt", i = {}, l = {c.b.Y7}, m = "invokeSuspend", n = {}, s = {})
public final class AbsVideoView$initUI$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f75885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbsVideoView f75886c;

    /* JADX INFO: compiled from: AbsVideoView.kt */
    public static final class a<T> implements f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbsVideoView f75887b;

        a(AbsVideoView absVideoView) {
            this.f75887b = absVideoView;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @e
        public final Object a(boolean z10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            u<Float> uVarD;
            u<Boolean> uVarK;
            boolean z11 = false;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0), cVar}, this, changeQuickRedirect, false, c.m.Cj, new Class[]{Boolean.TYPE, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            if (z10) {
                ze.b gestureHandler = this.f75887b.getGestureHandler();
                if (((gestureHandler == null || (uVarK = gestureHandler.k()) == null || !uVarK.getValue().booleanValue()) ? false : true) != false) {
                    ze.b gestureHandler2 = this.f75887b.getGestureHandler();
                    if (gestureHandler2 != null && gestureHandler2.j()) {
                        z11 = true;
                    }
                    if (z11 && this.f75887b.f75853g && !this.f75887b.f75863q) {
                        AbsVideoView absVideoView = this.f75887b;
                        com.max.video.player.a player = absVideoView.getPlayer();
                        absVideoView.f75860n = (player == null || (uVarD = player.D()) == null) ? 1.0f : uVarD.getValue().floatValue();
                        com.max.video.player.a player2 = this.f75887b.getPlayer();
                        if (player2 != null) {
                            player2.setPlaybackSpeed(2.0f);
                        }
                        this.f75887b.f75863q = true;
                        Log.d("VTest", "Fast play");
                    }
                }
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, c.m.Dj, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(((Boolean) obj).booleanValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbsVideoView$initUI$1(AbsVideoView absVideoView, kotlin.coroutines.c<? super AbsVideoView$initUI$1> cVar) {
        super(2, cVar);
        this.f75886c = absVideoView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, c.m.f35183zj, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AbsVideoView$initUI$1(this.f75886c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, c.m.Bj, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, c.m.Aj, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AbsVideoView$initUI$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.f35161yj, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f75885b;
        if (i10 == 0) {
            t0.n(obj);
            u<Boolean> fastPlayState = this.f75886c.getFastPlayState();
            a aVar = new a(this.f75886c);
            this.f75885b = 1;
            if (fastPlayState.a(aVar, this) == objH) {
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
