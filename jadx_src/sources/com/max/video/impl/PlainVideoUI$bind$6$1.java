package com.max.video.impl;

import android.content.Context;
import android.widget.FrameLayout;
import com.max.video.AbsVideoView;
import com.max.video.player.info.WindowMode;
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
@kotlin.coroutines.jvm.internal.d(c = "com.max.video.impl.PlainVideoUI$bind$6$1", f = "PlainVideoUI.kt", i = {}, l = {bb.c.b.f30853p2}, m = "invokeSuspend", n = {}, s = {})
public final class PlainVideoUI$bind$6$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f75967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbsVideoView f75968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ com.max.video.ui.widget.e f75969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ PlainVideoUI f75970e;

    /* JADX INFO: compiled from: PlainVideoUI.kt */
    public static final class a<T> implements kotlinx.coroutines.flow.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ com.max.video.ui.widget.e f75971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ PlainVideoUI f75972c;

        a(com.max.video.ui.widget.e eVar, PlainVideoUI plainVideoUI) {
            this.f75971b = eVar;
            this.f75972c = plainVideoUI;
        }

        @dl.e
        public final Object a(@dl.d WindowMode windowMode, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{windowMode, cVar}, this, changeQuickRedirect, false, bb.c.m.Xl, new Class[]{WindowMode.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            this.f75971b.a(windowMode == WindowMode.FULLSCREEN);
            com.max.video.ui.widget.e completedPanel = this.f75972c.getCompletedPanel();
            if (completedPanel != null) {
                PlainVideoUI plainVideoUI = this.f75972c;
                plainVideoUI.f75934b.f141308l.removeAllViews();
                plainVideoUI.f75934b.f141308l.addView(completedPanel.c(), new FrameLayout.LayoutParams(-1, -1));
                Context context = plainVideoUI.getContext();
                f0.o(context, "getContext(...)");
                completedPanel.b(context, plainVideoUI);
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Yl, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((WindowMode) obj, cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PlainVideoUI$bind$6$1(AbsVideoView absVideoView, com.max.video.ui.widget.e eVar, PlainVideoUI plainVideoUI, kotlin.coroutines.c<? super PlainVideoUI$bind$6$1> cVar) {
        super(2, cVar);
        this.f75968c = absVideoView;
        this.f75969d = eVar;
        this.f75970e = plainVideoUI;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.Ul, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new PlainVideoUI$bind$6$1(this.f75968c, this.f75969d, this.f75970e, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Wl, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.Vl, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((PlainVideoUI$bind$6$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.Tl, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f75967b;
        if (i10 == 0) {
            t0.n(obj);
            u<WindowMode> windowMode = this.f75968c.getWindowMode();
            a aVar = new a(this.f75969d, this.f75970e);
            this.f75967b = 1;
            if (windowMode.a(aVar, this) == objH) {
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
