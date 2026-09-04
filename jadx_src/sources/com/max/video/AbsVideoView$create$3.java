package com.max.video;

import bb.c;
import com.max.video.player.info.PlaybackState;
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
@d(c = "com.max.video.AbsVideoView$create$3", f = "AbsVideoView.kt", i = {}, l = {c.b.f30530b2}, m = "invokeSuspend", n = {}, s = {})
public final class AbsVideoView$create$3 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f75874b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbsVideoView f75875c;

    /* JADX INFO: compiled from: AbsVideoView.kt */
    public static final class a<T> implements f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbsVideoView f75876b;

        a(AbsVideoView absVideoView) {
            this.f75876b = absVideoView;
        }

        @e
        public final Object a(@dl.d PlaybackState playbackState, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{playbackState, cVar}, this, changeQuickRedirect, false, c.m.f34709ej, new Class[]{PlaybackState.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            xe.a targetStateChangeListener = this.f75876b.getTargetStateChangeListener();
            if (targetStateChangeListener != null) {
                targetStateChangeListener.a(playbackState);
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, c.m.f34732fj, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((PlaybackState) obj, cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbsVideoView$create$3(AbsVideoView absVideoView, kotlin.coroutines.c<? super AbsVideoView$create$3> cVar) {
        super(2, cVar);
        this.f75875c = absVideoView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, c.m.f34639bj, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AbsVideoView$create$3(this.f75875c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, c.m.f34686dj, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, c.m.f34662cj, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AbsVideoView$create$3) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        u<PlaybackState> uVarA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.f34616aj, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f75874b;
        if (i10 == 0) {
            t0.n(obj);
            com.max.video.player.a player = this.f75875c.getPlayer();
            if (player == null || (uVarA = player.a()) == null) {
                return b2.f124493a;
            }
            a aVar = new a(this.f75875c);
            this.f75874b = 1;
            if (uVarA.a(aVar, this) == objH) {
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
