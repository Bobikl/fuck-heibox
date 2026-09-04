package com.max.video;

import android.app.Activity;
import android.view.WindowManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: AbsVideoView.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.max.video.AbsVideoView$initUI$3", f = "AbsVideoView.kt", i = {}, l = {600}, m = "invokeSuspend", n = {}, s = {})
public final class AbsVideoView$initUI$3 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f75891b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbsVideoView f75892c;

    /* JADX INFO: compiled from: AbsVideoView.kt */
    public static final class a<T> implements f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbsVideoView f75893b;

        a(AbsVideoView absVideoView) {
            this.f75893b = absVideoView;
        }

        @e
        public final Object a(float f10, @dl.d c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Float(f10), cVar}, this, changeQuickRedirect, false, bb.c.m.Oj, new Class[]{Float.TYPE, c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            ze.b gestureHandler = this.f75893b.getGestureHandler();
            if (gestureHandler != null && gestureHandler.i()) {
                if (!(f10 == 0.0f)) {
                    Activity activityA = ye.a.f141789a.a(this.f75893b.getContext());
                    if (activityA == null) {
                        return b2.f124493a;
                    }
                    float f11 = activityA.getWindow().getAttributes().screenBrightness + (f10 * 1.5f);
                    if (f11 > 1.0f) {
                        f11 = 1.0f;
                    } else if (f11 < 0.1f) {
                        f11 = 0.1f;
                    }
                    WindowManager.LayoutParams attributes = activityA.getWindow().getAttributes();
                    attributes.screenBrightness = f11;
                    activityA.getWindow().setAttributes(attributes);
                    ze.d ui2 = this.f75893b.getUi();
                    f0.n(ui2, "null cannot be cast to non-null type com.max.video.ui.abilities.BrightnessAware");
                    ((af.b) ui2).t((int) (f11 * 100));
                }
            }
            ze.b gestureHandler2 = this.f75893b.getGestureHandler();
            if (gestureHandler2 != null) {
                gestureHandler2.q(true);
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Pj, new Class[]{Object.class, c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a(((Number) obj).floatValue(), cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbsVideoView$initUI$3(AbsVideoView absVideoView, c<? super AbsVideoView$initUI$3> cVar) {
        super(2, cVar);
        this.f75892c = absVideoView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Lj, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AbsVideoView$initUI$3(this.f75892c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Nj, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Mj, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AbsVideoView$initUI$3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        u<Float> uVarH;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Kj, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f75891b;
        if (i10 == 0) {
            t0.n(obj);
            ze.b gestureHandler = this.f75892c.getGestureHandler();
            if (gestureHandler == null || (uVarH = gestureHandler.h()) == null) {
                return b2.f124493a;
            }
            a aVar = new a(this.f75892c);
            this.f75891b = 1;
            if (uVarH.a(aVar, this) == objH) {
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
