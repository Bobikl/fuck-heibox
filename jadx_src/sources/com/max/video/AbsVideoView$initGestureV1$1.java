package com.max.video;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.coroutines.jvm.internal.d;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: AbsVideoView.kt */
/* JADX INFO: loaded from: classes8.dex */
@t0({"SMAP\nAbsVideoView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbsVideoView.kt\ncom/max/video/AbsVideoView$initGestureV1$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,713:1\n1#2:714\n*E\n"})
@d(c = "com.max.video.AbsVideoView$initGestureV1$1", f = "AbsVideoView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AbsVideoView$initGestureV1$1 extends SuspendLambda implements p<q0, c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f75881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbsVideoView f75882c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbsVideoView$initGestureV1$1(AbsVideoView absVideoView, c<? super AbsVideoView$initGestureV1$1> cVar) {
        super(2, cVar);
        this.f75882c = absVideoView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean f(AbsVideoView absVideoView, GestureDetector gestureDetector, View view, MotionEvent motionEvent) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{absVideoView, gestureDetector, view, motionEvent}, null, changeQuickRedirect, true, bb.c.m.f35007rj, new Class[]{AbsVideoView.class, GestureDetector.class, View.class, MotionEvent.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        f0.m(motionEvent);
        if (!absVideoView.v(motionEvent)) {
            if (!(gestureDetector != null && gestureDetector.onTouchEvent(motionEvent))) {
                ze.b gestureHandler = absVideoView.getGestureHandler();
                if (gestureHandler == null) {
                    return false;
                }
                f0.m(view);
                return gestureHandler.onTouch(view, motionEvent);
            }
        }
        return true;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final c<b2> create(@e Object obj, @dl.d c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.f34962pj, new Class[]{Object.class, c.class}, c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new AbsVideoView$initGestureV1$1(this.f75882c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f35029sj, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.f34985qj, new Class[]{q0.class, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AbsVideoView$initGestureV1$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.f34939oj, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f75881b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kotlin.t0.n(obj);
        ze.b gestureHandler = this.f75882c.getGestureHandler();
        final GestureDetector gestureDetector = gestureHandler != null ? new GestureDetector(this.f75882c.getContext(), gestureHandler) : null;
        final AbsVideoView absVideoView = this.f75882c;
        absVideoView.setOnTouchListener(new View.OnTouchListener() { // from class: com.max.video.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                return AbsVideoView$initGestureV1$1.f(absVideoView, gestureDetector, view, motionEvent);
            }
        });
        return b2.f124493a;
    }
}
