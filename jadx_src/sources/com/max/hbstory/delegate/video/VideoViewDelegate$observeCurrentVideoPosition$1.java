package com.max.hbstory.delegate.video;

import com.max.hbcustomview.video.VideoViewX;
import com.max.hbstory.g;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.KotlinNothingValueException;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.i;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: VideoViewDelegate.kt */
/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbstory.delegate.video.VideoViewDelegate$observeCurrentVideoPosition$1", f = "VideoViewDelegate.kt", i = {}, l = {240}, m = "invokeSuspend", n = {}, s = {})
public final class VideoViewDelegate$observeCurrentVideoPosition$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f72933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ VideoViewX f72934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ VideoViewDelegate f72935d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoViewDelegate$observeCurrentVideoPosition$1(VideoViewX videoViewX, VideoViewDelegate videoViewDelegate, kotlin.coroutines.c<? super VideoViewDelegate$observeCurrentVideoPosition$1> cVar) {
        super(2, cVar);
        this.f72934c = videoViewX;
        this.f72935d = videoViewDelegate;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.k.Gh, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new VideoViewDelegate$observeCurrentVideoPosition$1(this.f72934c, this.f72935d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Ih, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Hh, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((VideoViewDelegate$observeCurrentVideoPosition$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        com.max.video.player.a player;
        u<Integer> uVarL;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.Fh, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f72933b;
        if (i10 == 0) {
            t0.n(obj);
            VideoViewX videoViewX = this.f72934c;
            if (videoViewX == null || (player = videoViewX.getPlayer()) == null || (uVarL = player.L()) == null) {
                return b2.f124493a;
            }
            final VideoViewDelegate videoViewDelegate = this.f72935d;
            final VideoViewX videoViewX2 = this.f72934c;
            kotlinx.coroutines.flow.f<? super Integer> fVar = new kotlinx.coroutines.flow.f() { // from class: com.max.hbstory.delegate.video.VideoViewDelegate$observeCurrentVideoPosition$1.1
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: com.max.hbstory.delegate.video.VideoViewDelegate$observeCurrentVideoPosition$1$1$1, reason: invalid class name and collision with other inner class name */
                /* JADX INFO: compiled from: VideoViewDelegate.kt */
                @kotlin.coroutines.jvm.internal.d(c = "com.max.hbstory.delegate.video.VideoViewDelegate$observeCurrentVideoPosition$1$1$1", f = "VideoViewDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                public static final class C05841 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                    public static ChangeQuickRedirect changeQuickRedirect;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    int f72938b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ VideoViewDelegate f72939c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final /* synthetic */ VideoViewX f72940d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final /* synthetic */ int f72941e;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C05841(VideoViewDelegate videoViewDelegate, VideoViewX videoViewX, int i10, kotlin.coroutines.c<? super C05841> cVar) {
                        super(2, cVar);
                        this.f72939c = videoViewDelegate;
                        this.f72940d = videoViewX;
                        this.f72941e = i10;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.d
                    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.k.Mh, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new C05841(this.f72939c, this.f72940d, this.f72941e, cVar);
                    }

                    @Override // yh.p
                    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Oh, new Class[]{Object.class, Object.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                    }

                    @dl.e
                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Nh, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C05841) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @dl.e
                    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                        com.max.video.player.a player;
                        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.Lh, new Class[]{Object.class}, Object.class);
                        if (patchProxyResultProxy.isSupported) {
                            return patchProxyResultProxy.result;
                        }
                        kotlin.coroutines.intrinsics.b.h();
                        if (this.f72938b != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        t0.n(obj);
                        g gVarD = this.f72939c.f72917a.d();
                        VideoViewX videoViewX = this.f72940d;
                        int duration = (videoViewX == null || (player = videoViewX.getPlayer()) == null) ? 0 : player.getDuration();
                        g.e eVar = new g.e(duration > 0 ? this.f72941e : 0, duration);
                        if (gVarD != null) {
                            gVarD.Y(eVar);
                        }
                        return b2.f124493a;
                    }
                }

                @dl.e
                public final Object a(int i11, @dl.d kotlin.coroutines.c<? super b2> cVar) throws Throwable {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{new Integer(i11), cVar}, this, changeQuickRedirect, false, bb.c.k.Jh, new Class[]{Integer.TYPE, kotlin.coroutines.c.class}, Object.class);
                    if (patchProxyResultProxy2.isSupported) {
                        return patchProxyResultProxy2.result;
                    }
                    Object objH2 = i.h(e1.e(), new C05841(videoViewDelegate, videoViewX2, i11, null), cVar);
                    return objH2 == kotlin.coroutines.intrinsics.b.h() ? objH2 : b2.f124493a;
                }

                @Override // kotlinx.coroutines.flow.f
                public /* bridge */ /* synthetic */ Object emit(Object obj2, kotlin.coroutines.c cVar) {
                    PatchProxyResult patchProxyResultProxy2 = PatchProxy.proxy(new Object[]{obj2, cVar}, this, changeQuickRedirect, false, bb.c.k.Kh, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy2.isSupported ? patchProxyResultProxy2.result : a(((Number) obj2).intValue(), cVar);
                }
            };
            this.f72933b = 1;
            if (uVarL.a(fVar, this) == objH) {
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
