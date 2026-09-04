package com.max.hbcommon.component.triplebanner;

import android.hardware.SensorEvent;
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
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: TripleBannerDecorationView.kt */
/* JADX INFO: loaded from: classes9.dex */
@d(c = "com.max.hbcommon.component.triplebanner.TripleBannerDecorationView$1$onSensorChanged$1$1", f = "TripleBannerDecorationView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class TripleBannerDecorationView$1$onSensorChanged$1$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f67950b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ TripleBannerDecorationView f67951c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ float f67952d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ SensorEvent f67953e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f67954f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TripleBannerDecorationView$1$onSensorChanged$1$1(TripleBannerDecorationView tripleBannerDecorationView, float f10, SensorEvent sensorEvent, float f11, c<? super TripleBannerDecorationView$1$onSensorChanged$1$1> cVar) {
        super(2, cVar);
        this.f67951c = tripleBannerDecorationView;
        this.f67952d = f10;
        this.f67953e = sensorEvent;
        this.f67954f = f11;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.e.W4, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new TripleBannerDecorationView$1$onSensorChanged$1$1(this.f67951c, this.f67952d, this.f67953e, this.f67954f, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.Y4, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.e.X4, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((TripleBannerDecorationView$1$onSensorChanged$1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.e.V4, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        b.h();
        if (this.f67950b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        TripleBannerDecorationView tripleBannerDecorationView = this.f67951c;
        float f10 = this.f67952d;
        TripleBannerDecorationView.e(tripleBannerDecorationView, Math.max(-f10, Math.min(f10, TripleBannerDecorationView.c(tripleBannerDecorationView, (-this.f67953e.values[0]) / 9.8f) * this.f67954f * (this.f67951c.getSameWithGyroScope() ? 1.0f : -1.0f))));
        TripleBannerDecorationView tripleBannerDecorationView2 = this.f67951c;
        float f11 = this.f67952d;
        TripleBannerDecorationView.f(tripleBannerDecorationView2, Math.max(-f11, Math.min(f11, TripleBannerDecorationView.c(tripleBannerDecorationView2, this.f67953e.values[1] / 9.8f) * this.f67954f * (this.f67951c.getSameWithGyroScope() ? 1.0f : -1.0f))));
        return b2.f124493a;
    }
}
