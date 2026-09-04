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
import kotlin.jvm.internal.f0;
import kotlin.t0;
import kotlinx.coroutines.flow.f;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.q0;
import yh.p;

/* JADX INFO: compiled from: AbsVideoView.kt */
/* JADX INFO: loaded from: classes8.dex */
@d(c = "com.max.video.AbsVideoView$create$2", f = "AbsVideoView.kt", i = {}, l = {c.b.D1}, m = "invokeSuspend", n = {}, s = {})
public final class AbsVideoView$create$2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f75870b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbsVideoView f75871c;

    /* JADX INFO: compiled from: AbsVideoView.kt */
    public static final class a<T> implements f {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ AbsVideoView f75872b;

        /* JADX INFO: renamed from: com.max.video.AbsVideoView$create$2$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: AbsVideoView.kt */
        public final /* synthetic */ class C0616a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f75873a;

            static {
                int[] iArr = new int[PlaybackState.valuesCustom().length];
                try {
                    iArr[PlaybackState.STARTED.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[PlaybackState.PAUSED.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[PlaybackState.COMPLETE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[PlaybackState.END.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                f75873a = iArr;
            }
        }

        a(AbsVideoView absVideoView) {
            this.f75872b = absVideoView;
        }

        @e
        public final Object a(@dl.d PlaybackState playbackState, @dl.d kotlin.coroutines.c<? super b2> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{playbackState, cVar}, this, changeQuickRedirect, false, c.m.Yi, new Class[]{PlaybackState.class, kotlin.coroutines.c.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            xe.a playbackStateChangeListener = this.f75872b.getPlaybackStateChangeListener();
            if (playbackStateChangeListener != null) {
                playbackStateChangeListener.a(playbackState);
            }
            int i10 = C0616a.f75873a[playbackState.ordinal()];
            com.max.video.device.b bVar = null;
            if (i10 == 1) {
                if (this.f75872b.getUi() instanceof af.c) {
                    ze.d ui2 = this.f75872b.getUi();
                    f0.n(ui2, "null cannot be cast to non-null type com.max.video.ui.abilities.CompletedCover");
                    ((af.c) ui2).p();
                }
                com.max.video.device.b bVar2 = this.f75872b.f75848b;
                if (bVar2 == null) {
                    f0.S("audioManager");
                } else {
                    bVar = bVar2;
                }
                bVar.j();
            } else if (i10 == 2 || i10 == 3 || i10 == 4) {
                if (PlaybackState.COMPLETE == playbackState && (this.f75872b.getUi() instanceof af.c)) {
                    ze.d ui3 = this.f75872b.getUi();
                    f0.n(ui3, "null cannot be cast to non-null type com.max.video.ui.abilities.CompletedCover");
                    ((af.c) ui3).a();
                }
                com.max.video.device.b bVar3 = this.f75872b.f75848b;
                if (bVar3 == null) {
                    f0.S("audioManager");
                } else {
                    bVar = bVar3;
                }
                bVar.a();
            } else if (this.f75872b.getUi() instanceof af.c) {
                ze.d ui4 = this.f75872b.getUi();
                f0.n(ui4, "null cannot be cast to non-null type com.max.video.ui.abilities.CompletedCover");
                ((af.c) ui4).p();
            }
            return b2.f124493a;
        }

        @Override // kotlinx.coroutines.flow.f
        public /* bridge */ /* synthetic */ Object emit(Object obj, kotlin.coroutines.c cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, c.m.Zi, new Class[]{Object.class, kotlin.coroutines.c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : a((PlaybackState) obj, cVar);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AbsVideoView$create$2(AbsVideoView absVideoView, kotlin.coroutines.c<? super AbsVideoView$create$2> cVar) {
        super(2, cVar);
        this.f75871c = absVideoView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, c.m.Vi, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AbsVideoView$create$2(this.f75871c, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, c.m.Xi, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, c.m.Wi, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AbsVideoView$create$2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        u<PlaybackState> uVarQ;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.Ui, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f75870b;
        if (i10 == 0) {
            t0.n(obj);
            com.max.video.player.a player = this.f75871c.getPlayer();
            if (player == null || (uVarQ = player.Q()) == null) {
                return b2.f124493a;
            }
            a aVar = new a(this.f75871c);
            this.f75870b = 1;
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
