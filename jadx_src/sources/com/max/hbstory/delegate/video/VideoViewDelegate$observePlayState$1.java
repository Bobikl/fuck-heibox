package com.max.hbstory.delegate.video;

import android.util.Log;
import com.max.hbcustomview.video.VideoViewX;
import com.max.hbstory.R;
import com.max.hbstory.g;
import com.max.hbstory.i;
import com.max.video.player.info.PlaybackState;
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

/* JADX INFO: compiled from: VideoViewDelegate.kt */
/* JADX INFO: loaded from: classes13.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbstory.delegate.video.VideoViewDelegate$observePlayState$1", f = "VideoViewDelegate.kt", i = {}, l = {317}, m = "invokeSuspend", n = {}, s = {})
public final class VideoViewDelegate$observePlayState$1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f72948b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ VideoViewX f72949c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ g f72950d;

    /* JADX INFO: compiled from: VideoViewDelegate.kt */
    public static final class a<T> implements kotlinx.coroutines.flow.f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoViewX f72951b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ g f72952c;

        a(VideoViewX videoViewX, g gVar) {
            this.f72951b = videoViewX;
            this.f72952c = gVar;
        }

        @dl.e
        public final Object a(@dl.d PlaybackState playbackState, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{playbackState, cVar}, this, changeQuickRedirect, false, bb.c.k.f33462bi, new Class[]{PlaybackState.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object tag = this.f72951b.getTag(R.id.tag_video_position);
            Integer num = tag instanceof Integer ? (Integer) tag : null;
            Log.d("observePlayState", "playbackState: " + playbackState + "  mPosition: " + num + ' ');
            if (i.a(this.f72952c, num != null ? num.intValue() : -1)) {
                this.f72952c.g0(playbackState);
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.k.f33485ci, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((PlaybackState) obj, cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VideoViewDelegate$observePlayState$1(VideoViewX videoViewX, g gVar, kotlin.coroutines.c<? super VideoViewDelegate$observePlayState$1> cVar) {
        super(2, cVar);
        this.f72949c = videoViewX;
        this.f72950d = gVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.k.Yh, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new VideoViewDelegate$observePlayState$1(this.f72949c, this.f72950d, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.f33439ai, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Zh, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((VideoViewDelegate$observePlayState$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        com.max.video.player.a player;
        u<PlaybackState> uVarQ;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.Xh, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f72948b;
        if (i10 == 0) {
            t0.n(obj);
            VideoViewX videoViewX = this.f72949c;
            if (videoViewX == null || (player = videoViewX.getPlayer()) == null || (uVarQ = player.Q()) == null) {
                return b2.f124493a;
            }
            a aVar = new a(this.f72949c, this.f72950d);
            this.f72948b = 1;
            if (uVarQ.a(aVar, this) == objH) {
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
