package com.max.video;

import bb.c;
import com.max.heybox.hblog.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: AbsVideoView.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.max.video.AbsVideoView$initUI$4", f = "AbsVideoView.kt", i = {}, l = {c.b.f30514a9}, m = "invokeSuspend", n = {}, s = {})
public final class AbsVideoView$initUI$4 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f75894b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbsVideoView f75895c;

    /* JADX INFO: compiled from: AbsVideoView.kt */
    public static final class a<T> implements f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbsVideoView f75896b;

        a(AbsVideoView absVideoView) {
            this.f75896b = absVideoView;
        }

        @e
        public final Object a(float f10, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            j<Float> jVarP;
            int i10 = 0;
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), cVar}, this, changeQuickRedirect, false, c.m.Uj, new Class[]{Float.TYPE, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            ze.b gestureHandler = this.f75896b.getGestureHandler();
            if (gestureHandler != null && gestureHandler.o()) {
                float fFloatValue = 0.0f;
                if (!(f10 == 0.0f)) {
                    ze.b gestureHandler2 = this.f75896b.getGestureHandler();
                    if (gestureHandler2 != null && (jVarP = gestureHandler2.p()) != null) {
                        fFloatValue = jVarP.getValue().floatValue();
                    }
                    int i11 = (int) ((f10 * 1.5f * 100) + fFloatValue);
                    if (i11 > 100) {
                        i10 = 100;
                    } else if (i11 >= 0) {
                        i10 = i11;
                    }
                    g.f74531b.M("_volumeOffset currentSysVolume: " + fFloatValue + " targetVolume: " + i10);
                    ze.b gestureHandler3 = this.f75896b.getGestureHandler();
                    com.max.video.device.b bVar = null;
                    j<Float> jVarP2 = gestureHandler3 != null ? gestureHandler3.p() : null;
                    if (jVarP2 != null) {
                        jVarP2.setValue(kotlin.coroutines.jvm.internal.a.e(i10));
                    }
                    com.max.video.device.b bVar2 = this.f75896b.f75848b;
                    if (bVar2 == null) {
                        f0.S("audioManager");
                    } else {
                        bVar = bVar2;
                    }
                    bVar.n(i10);
                    ze.d ui2 = this.f75896b.getUi();
                    f0.n(ui2, "null cannot be cast to non-null type com.max.video.ui.abilities.VolumeAware");
                    ((af.p) ui2).o(i10);
                }
            }
            ze.b gestureHandler4 = this.f75896b.getGestureHandler();
            if (gestureHandler4 != null) {
                gestureHandler4.u(true);
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, c.m.Vj, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(((Number) obj).floatValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbsVideoView$initUI$4(AbsVideoView absVideoView, kotlin.coroutines.c<? super AbsVideoView$initUI$4> cVar) {
        super(2, cVar);
        this.f75895c = absVideoView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, c.m.Rj, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AbsVideoView$initUI$4(this.f75895c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, c.m.Tj, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, c.m.Sj, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AbsVideoView$initUI$4) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        u<Float> uVarN;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.Qj, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f75894b;
        if (i10 == 0) {
            t0.n(obj);
            ze.b gestureHandler = this.f75895c.getGestureHandler();
            if (gestureHandler == null || (uVarN = gestureHandler.n()) == null) {
                return b2.f124493a;
            }
            a aVar = new a(this.f75895c);
            this.f75894b = 1;
            if (uVarN.a(aVar, this) == objH) {
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
