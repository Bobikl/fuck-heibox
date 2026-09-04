package com.max.hbstory.delegate.video;

import android.content.Context;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.v;
import androidx.lifecycle.y;
import androidx.lifecycle.z;
import androidx.viewpager2.widget.ViewPager2;
import com.google.gson.JsonObject;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.basebbs.utils.AccelWorldBBSKt;
import com.max.hbcustomview.video.VideoViewX;
import com.max.hbstory.R;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryVideoInfoObj;
import com.max.hbstory.g;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbstory.widget.IStoryLandscapeControlWidget;
import com.max.video.player.VideoPlayerManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.ui.UCropPlusActivity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.v0;
import kotlin.t0;
import kotlin.text.u;
import kotlinx.coroutines.d2;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: VideoViewDelegate.kt */
/* JADX INFO: loaded from: classes13.dex */
public final class VideoViewDelegate implements com.max.hbstory.delegate.a {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final com.max.hbstory.d f72917a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final od.a f72918b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f72919c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private List<VideoViewX> f72920d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f72921e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @dl.e
    private d2 f72922f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.e
    private d2 f72923g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f72924h;

    public VideoViewDelegate(@dl.d com.max.hbstory.d storyContext, @dl.d od.a storyConfig) {
        f0.p(storyContext, "storyContext");
        f0.p(storyConfig, "storyConfig");
        this.f72917a = storyContext;
        this.f72918b = storyConfig;
        this.f72919c = 3;
        this.f72920d = new ArrayList();
        this.f72921e = -1;
        this.f72924h = System.currentTimeMillis();
        Context contextA = storyContext.a();
        if (contextA != null) {
            for (int i10 = 0; i10 < 3; i10++) {
                this.f72920d.add(s(contextA));
            }
        }
        B();
        G();
        N();
        J();
        L();
        E();
        q();
    }

    private final boolean A(VideoViewX videoViewX, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{videoViewX, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Sg, new Class[]{VideoViewX.class, Integer.TYPE}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (videoViewX != null) {
            return f0.g(videoViewX.getTag(R.id.tag_video_position), Integer.valueOf(i10));
        }
        return false;
    }

    private final void B() {
        Fragment fragmentB;
        final g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33461bh, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72917a.b()) == null || (gVarD = this.f72917a.d()) == null) {
            return;
        }
        LiveData<g.d> liveDataI = gVarD.i();
        final l<g.d, b2> lVar = new l<g.d, b2>() { // from class: com.max.hbstory.delegate.video.VideoViewDelegate$observeBottomSheetSlideOffset$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(g.d dVar) {
                Integer numF;
                StoryLinkCardInfoObj link_card_info;
                StoryVideoInfoObj video_info;
                StoryLinkCardInfoObj link_card_info2;
                StoryVideoInfoObj video_info2;
                int height = 0;
                if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.k.Dh, new Class[]{g.d.class}, Void.TYPE).isSupported || (numF = gVarD.n().f()) == null) {
                    return;
                }
                StoryItemsObj storyItemsObjM = StoryUtilsKt.m(this.f72917a, numF.intValue());
                int width = (storyItemsObjM == null || (link_card_info2 = storyItemsObjM.getLink_card_info()) == null || (video_info2 = link_card_info2.getVideo_info()) == null) ? 0 : video_info2.getWidth();
                if (storyItemsObjM != null && (link_card_info = storyItemsObjM.getLink_card_info()) != null && (video_info = link_card_info.getVideo_info()) != null) {
                    height = video_info.getHeight();
                }
                VideoViewX videoViewXJ = VideoViewDelegate.j(this);
                ViewParent parent = videoViewXJ != null ? videoViewXJ.getParent() : null;
                ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                if (viewGroup != null) {
                    StoryUtilsKt.b(viewGroup, dVar.b(), dVar.a(), width, height, true);
                }
                VideoViewX videoViewXJ2 = VideoViewDelegate.j(this);
                if (videoViewXJ2 != null) {
                    StoryUtilsKt.b(videoViewXJ2, dVar.b(), dVar.a(), width, height, true);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(g.d dVar) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.k.Eh, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(dVar);
                return b2.f124493a;
            }
        };
        liveDataI.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.video.f
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                VideoViewDelegate.C(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void C(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33807qh, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void D(VideoViewX videoViewX) {
        if (PatchProxy.proxy(new Object[]{videoViewX}, this, changeQuickRedirect, false, bb.c.k.Yg, new Class[]{VideoViewX.class}, Void.TYPE).isSupported) {
            return;
        }
        d2 d2Var = this.f72923g;
        if (d2Var != null) {
            d2.a.b(d2Var, null, 1, null);
        }
        Fragment fragmentB = this.f72917a.b();
        if (fragmentB == null) {
            return;
        }
        y viewLifecycleOwner = fragmentB.getViewLifecycleOwner();
        f0.o(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        this.f72923g = k.f(z.a(viewLifecycleOwner), null, null, new VideoViewDelegate$observeCurrentVideoPosition$1(videoViewX, this, null), 3, null);
    }

    private final void E() {
        Fragment fragmentB;
        g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33438ah, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72917a.b()) == null || (gVarD = this.f72917a.d()) == null) {
            return;
        }
        LiveData<Boolean> liveDataW = gVarD.w();
        final l<Boolean, b2> lVar = new l<Boolean, b2>() { // from class: com.max.hbstory.delegate.video.VideoViewDelegate$observeLongPressEvent$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(Boolean bool) {
                VideoViewX videoViewXJ;
                com.max.video.player.a player;
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.k.Ph, new Class[]{Boolean.class}, Void.TYPE).isSupported || (videoViewXJ = VideoViewDelegate.j(this.f72942b)) == null || (player = videoViewXJ.getPlayer()) == null) {
                    return;
                }
                f0.m(bool);
                if (bool.booleanValue()) {
                    player.setPlaybackSpeed(3.0f);
                } else {
                    player.setPlaybackSpeed(1.0f);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.k.Qh, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool);
                return b2.f124493a;
            }
        };
        liveDataW.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.video.a
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                VideoViewDelegate.F(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33784ph, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void G() {
        final Fragment fragmentB;
        g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Pg, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72917a.b()) == null || (gVarD = this.f72917a.d()) == null) {
            return;
        }
        LiveData<Integer> liveDataN = gVarD.n();
        final l<Integer, b2> lVar = new l<Integer, b2>() { // from class: com.max.hbstory.delegate.video.VideoViewDelegate$observePageChanges$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.hbstory.delegate.video.VideoViewDelegate$observePageChanges$1$2, reason: invalid class name */
            /* JADX INFO: compiled from: VideoViewDelegate.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.hbstory.delegate.video.VideoViewDelegate$observePageChanges$1$2", f = "VideoViewDelegate.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass2 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f72945b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ VideoViewDelegate f72946c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ int f72947d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(VideoViewDelegate videoViewDelegate, int i10, kotlin.coroutines.c<? super AnonymousClass2> cVar) {
                    super(2, cVar);
                    this.f72946c = videoViewDelegate;
                    this.f72947d = i10;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.k.Uh, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass2(this.f72946c, this.f72947d, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Wh, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.Vh, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.Th, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.f72945b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    t0.n(obj);
                    VideoViewDelegate.g(this.f72946c, this.f72947d);
                    return b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(Integer num) {
                g.d dVar;
                LiveData<List<StoryItemsObj>> liveDataF;
                List<StoryItemsObj> listF;
                if (PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.k.Rh, new Class[]{Integer.class}, Void.TYPE).isSupported) {
                    return;
                }
                Log.d("observePageChanges", "currentPosition: " + this.f72943b.f72921e + "  currentPagePosition: " + num);
                g gVarD2 = this.f72943b.f72917a.d();
                if (gVarD2 != null && (liveDataF = gVarD2.F()) != null && (listF = liveDataF.f()) != null) {
                    VideoViewDelegate videoViewDelegate = this.f72943b;
                    int size = listF.size();
                    int i10 = videoViewDelegate.f72921e;
                    if (i10 >= 0 && i10 < size) {
                        int i11 = videoViewDelegate.f72921e;
                        if (num == null || i11 != num.intValue()) {
                            VideoViewDelegate.n(videoViewDelegate);
                        }
                    }
                }
                f0.m(num);
                if (num.intValue() >= 0) {
                    int i12 = this.f72943b.f72921e;
                    this.f72943b.f72921e = num.intValue();
                    k.f(z.a(fragmentB), null, null, new AnonymousClass2(this.f72943b, i12, null), 3, null);
                }
                g gVarD3 = this.f72943b.f72917a.d();
                if (gVarD3 != null) {
                    if (gVarD3.i().f() == null) {
                        dVar = new g.d(0.0f, 0);
                    } else {
                        g.d dVarF = gVarD3.i().f();
                        f0.m(dVarF);
                        g.d dVar2 = dVarF;
                        dVar2.c(0.0f);
                        f0.m(dVarF);
                        dVar = dVar2;
                    }
                    gVarD3.q0(dVar);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.k.Sh, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(num);
                return b2.f124493a;
            }
        };
        liveDataN.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.video.e
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                VideoViewDelegate.H(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void H(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33692lh, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void I(VideoViewX videoViewX) {
        Fragment fragmentB;
        g gVarD;
        if (PatchProxy.proxy(new Object[]{videoViewX}, this, changeQuickRedirect, false, bb.c.k.f33484ch, new Class[]{VideoViewX.class}, Void.TYPE).isSupported || (fragmentB = this.f72917a.b()) == null || (gVarD = this.f72917a.d()) == null) {
            return;
        }
        d2 d2Var = this.f72922f;
        if (d2Var != null) {
            d2.a.b(d2Var, null, 1, null);
        }
        this.f72922f = k.f(z.a(fragmentB), null, null, new VideoViewDelegate$observePlayState$1(videoViewX, gVarD, null), 3, null);
    }

    private final void J() {
        Fragment fragmentB;
        g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Xg, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72917a.b()) == null || (gVarD = this.f72917a.d()) == null) {
            return;
        }
        LiveData<Long> liveDataB = gVarD.B();
        final l<Long, b2> lVar = new l<Long, b2>() { // from class: com.max.hbstory.delegate.video.VideoViewDelegate$observeSeekPosition$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(Long l10) {
                VideoViewX videoViewXJ;
                if (PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, bb.c.k.f33509di, new Class[]{Long.class}, Void.TYPE).isSupported || (videoViewXJ = VideoViewDelegate.j(this.f72953b)) == null) {
                    return;
                }
                videoViewXJ.V((int) l10.longValue());
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Long l10) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{l10}, this, changeQuickRedirect, false, bb.c.k.f33532ei, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(l10);
                return b2.f124493a;
            }
        };
        liveDataB.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.video.b
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                VideoViewDelegate.K(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void K(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33738nh, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void L() {
        Fragment fragmentB;
        g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Zg, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72917a.b()) == null || (gVarD = this.f72917a.d()) == null) {
            return;
        }
        LiveData<b2> liveDataD = gVarD.D();
        final l<b2, b2> lVar = new l<b2, b2>() { // from class: com.max.hbstory.delegate.video.VideoViewDelegate$observeSingleClickEvent$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(b2 b2Var) {
                VideoViewX videoViewXJ;
                com.max.video.player.a player;
                if (PatchProxy.proxy(new Object[]{b2Var}, this, changeQuickRedirect, false, bb.c.k.f33555fi, new Class[]{b2.class}, Void.TYPE).isSupported || (videoViewXJ = VideoViewDelegate.j(this.f72954b)) == null || (player = videoViewXJ.getPlayer()) == null) {
                    return;
                }
                if (player.isPlaying()) {
                    player.pause();
                } else {
                    if (player.isPlaying()) {
                        return;
                    }
                    player.play();
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(b2 b2Var) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{b2Var}, this, changeQuickRedirect, false, bb.c.k.f33578gi, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(b2Var);
                return b2.f124493a;
            }
        };
        liveDataD.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.video.c
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                VideoViewDelegate.M(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void M(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33761oh, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void N() {
        Fragment fragmentB;
        g gVarD;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Ug, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72917a.b()) == null || (gVarD = this.f72917a.d()) == null) {
            return;
        }
        LiveData<Boolean> liveDataO = gVarD.O();
        final l<Boolean, b2> lVar = new l<Boolean, b2>() { // from class: com.max.hbstory.delegate.video.VideoViewDelegate$observeVideoFullScreenChanges$1
            public static ChangeQuickRedirect changeQuickRedirect;

            {
                super(1);
            }

            public final void a(Boolean bool) {
                Fragment fragmentB2;
                FragmentActivity activity;
                VideoViewX videoViewXJ;
                FragmentActivity activity2;
                if (PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.k.f33601hi, new Class[]{Boolean.class}, Void.TYPE).isSupported || (fragmentB2 = this.f72955b.f72917a.b()) == null || (activity = fragmentB2.getActivity()) == null || (videoViewXJ = VideoViewDelegate.j(this.f72955b)) == null) {
                    return;
                }
                VideoPlayerManager videoPlayerManager = VideoPlayerManager.f76079a;
                if (f0.g(bool, Boolean.valueOf(videoPlayerManager.q(videoViewXJ)))) {
                    return;
                }
                f0.m(bool);
                if (bool.booleanValue()) {
                    VideoViewDelegate.o(this.f72955b);
                    ViewParent parent = videoViewXJ.getParent();
                    ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
                    if (viewGroup != null) {
                        viewGroup.removeView(videoViewXJ);
                    }
                    VideoPlayerManager.x(videoPlayerManager, activity, videoViewXJ, viewGroup, 0, 8, null);
                    return;
                }
                VideoViewDelegate.l(this.f72955b);
                Fragment fragmentB3 = this.f72955b.f72917a.b();
                if (fragmentB3 == null || (activity2 = fragmentB3.getActivity()) == null) {
                    return;
                }
                videoPlayerManager.e(activity2);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Boolean bool) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool}, this, changeQuickRedirect, false, bb.c.k.f33623ii, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(bool);
                return b2.f124493a;
            }
        };
        liveDataO.k(fragmentB, new j0() { // from class: com.max.hbstory.delegate.video.d
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                VideoViewDelegate.O(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void O(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.f33715mh, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void Q(VideoViewX videoViewX) {
        StoryItemsObj storyItemsObjM;
        StoryVideoInfoObj video_info;
        if (PatchProxy.proxy(new Object[]{videoViewX}, this, changeQuickRedirect, false, bb.c.k.f33600hh, new Class[]{VideoViewX.class}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = this.f72921e;
        Context contextA = this.f72917a.a();
        if (contextA == null || (storyItemsObjM = StoryUtilsKt.m(this.f72917a, i10)) == null) {
            return;
        }
        StoryLinkCardInfoObj link_card_info = storyItemsObjM.getLink_card_info();
        String play_url = (link_card_info == null || (video_info = link_card_info.getVideo_info()) == null) ? null : video_info.getPlay_url();
        if (play_url == null || u.V1(play_url)) {
            return;
        }
        z(videoViewX, i10);
        if (videoViewX != null) {
            if (A(videoViewX, i10)) {
                videoViewX.Y();
            } else {
                videoViewX.S(contextA);
                videoViewX.setVideoRes(play_url);
                videoViewX.O();
                videoViewX.Y();
                com.max.video.player.a player = videoViewX.getPlayer();
                if (player != null) {
                    player.t(true);
                }
            }
            I(videoViewX);
            D(videoViewX);
        }
    }

    private final void R(VideoViewX videoViewX, int i10) {
        Context contextA;
        StoryItemsObj storyItemsObjM;
        StoryVideoInfoObj video_info;
        if (PatchProxy.proxy(new Object[]{videoViewX, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33622ih, new Class[]{VideoViewX.class, Integer.TYPE}, Void.TYPE).isSupported || (contextA = this.f72917a.a()) == null || (storyItemsObjM = StoryUtilsKt.m(this.f72917a, i10)) == null) {
            return;
        }
        StoryLinkCardInfoObj link_card_info = storyItemsObjM.getLink_card_info();
        String play_url = (link_card_info == null || (video_info = link_card_info.getVideo_info()) == null) ? null : video_info.getPlay_url();
        if ((play_url == null || u.V1(play_url)) || videoViewX == null) {
            return;
        }
        videoViewX.S(contextA);
        videoViewX.setVideoRes(play_url);
        videoViewX.setPlayOnReady(false);
        videoViewX.O();
        com.max.video.player.a player = videoViewX.getPlayer();
        if (player != null) {
            player.t(true);
        }
    }

    private final void S() {
        g gVarD;
        com.max.video.player.a player;
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Qg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        g gVarD2 = this.f72917a.d();
        if (gVarD2 != null) {
            JsonObject jsonObject = new JsonObject();
            StoryItemsObj storyItemsObjM = StoryUtilsKt.m(this.f72917a, this.f72921e);
            if (storyItemsObjM != null) {
                StoryCardIdInfoObj card_id_info = storyItemsObjM.getCard_id_info();
                jsonObject.addProperty("id", card_id_info != null ? card_id_info.getItem_id() : null);
                jsonObject.addProperty(UCropPlusActivity.ARG_INDEX, Integer.valueOf(this.f72921e));
                jsonObject.addProperty("h_src", storyItemsObjM.getH_src());
                VideoViewX videoViewXV = v();
                if (videoViewXV != null) {
                    jsonObject.addProperty("video_current_time", Integer.valueOf(videoViewXV.getCurrentPosition()));
                    jsonObject.addProperty("video_duration", Integer.valueOf(videoViewXV.getDuration()));
                    v0 v0Var = v0.f124986a;
                    String str = String.format("%.2f", Arrays.copyOf(new Object[]{Float.valueOf(videoViewXV.getCurrentPosition() / videoViewXV.getDuration())}, 1));
                    f0.o(str, "format(...)");
                    jsonObject.addProperty("video_progress", str);
                }
            }
            gVarD2.c0(jsonObject);
        }
        StoryItemsObj storyItemsObjM2 = StoryUtilsKt.m(this.f72917a, this.f72921e);
        if (storyItemsObjM2 != null && storyItemsObjM2.isVideo()) {
            z10 = true;
        }
        if (!z10 || (gVarD = this.f72917a.d()) == null) {
            return;
        }
        JsonObject jsonObject2 = new JsonObject();
        StoryItemsObj storyItemsObjM3 = StoryUtilsKt.m(this.f72917a, this.f72921e);
        if (storyItemsObjM3 != null) {
            StoryCardIdInfoObj card_id_info2 = storyItemsObjM3.getCard_id_info();
            jsonObject2.addProperty("id", card_id_info2 != null ? card_id_info2.getItem_id() : null);
            jsonObject2.addProperty(UCropPlusActivity.ARG_INDEX, Integer.valueOf(this.f72921e));
            jsonObject2.addProperty("h_src", storyItemsObjM3.getH_src());
            VideoViewX videoViewXV2 = v();
            if (videoViewXV2 != null && (player = videoViewXV2.getPlayer()) != null) {
                Log.d("VideoMonitor", "videoFirstFrameTime: " + player.u() + "   wantToPrepareTime: " + player.S() + "   videoWantPlayTime: " + player.Y());
                jsonObject2.addProperty("video_first_play_duration", Float.valueOf(((float) Math.max(0L, player.h0() - player.Y())) / 1000.0f));
                jsonObject2.addProperty("hangUpCount", Integer.valueOf(player.T()));
                String value = player.e0().getValue();
                if (value != null) {
                    jsonObject2.addProperty("is_failed", (Number) 1);
                    jsonObject2.addProperty("error_msg", value);
                }
                if (this.f72921e == 0) {
                    jsonObject2.addProperty("is_enter_page_item", "1");
                    jsonObject2.addProperty("enter_page_video_first_frame_duration", Float.valueOf(Math.max(0L, player.u() - this.f72924h) / 1000.0f));
                    jsonObject2.addProperty("enter_page_video_first_play_duration", Float.valueOf(Math.max(0L, player.h0() - this.f72924h) / 1000.0f));
                }
                player.g0();
            }
        }
        gVarD.d0(jsonObject2);
    }

    private final void T() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Wg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoViewX videoViewXV = v();
        ze.d ui2 = videoViewXV != null ? videoViewXV.getUi() : null;
        View view = ui2 instanceof View ? (View) ui2 : null;
        if (view == null) {
            return;
        }
        view.setVisibility(0);
    }

    private final void U(VideoViewX videoViewX, int i10) {
        g gVarD;
        LiveData<List<StoryItemsObj>> liveDataF;
        List<StoryItemsObj> listF;
        StoryVideoInfoObj video_info;
        if (PatchProxy.proxy(new Object[]{videoViewX, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33531eh, new Class[]{VideoViewX.class, Integer.TYPE}, Void.TYPE).isSupported || (gVarD = this.f72917a.d()) == null || (liveDataF = gVarD.F()) == null || (listF = liveDataF.f()) == null) {
            return;
        }
        if (i10 >= 0 && i10 < listF.size()) {
            StoryLinkCardInfoObj link_card_info = listF.get(i10).getLink_card_info();
            String play_url = (link_card_info == null || (video_info = link_card_info.getVideo_info()) == null) ? null : video_info.getPlay_url();
            if (play_url == null || u.V1(play_url)) {
                if (videoViewX != null) {
                    videoViewX.R();
                    return;
                }
                return;
            }
            if (videoViewX != null) {
                int i11 = R.id.tag_video_item_id;
                StoryCardIdInfoObj card_id_info = listF.get(i10).getCard_id_info();
                videoViewX.setTag(i11, card_id_info != null ? card_id_info.getItem_id() : null);
            }
            if (AccelWorldBBSKt.c(play_url)) {
                x(videoViewX, listF.get(i10));
            } else {
                V(videoViewX, u(i10), i10);
            }
        }
    }

    private final void V(VideoViewX videoViewX, ViewGroup viewGroup, int i10) {
        ViewGroup.LayoutParams layoutParams;
        if (PatchProxy.proxy(new Object[]{videoViewX, viewGroup, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33577gh, new Class[]{VideoViewX.class, ViewGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ViewParent parent = videoViewX != null ? videoViewX.getParent() : null;
        ViewGroup viewGroup2 = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (videoViewX != null) {
            if (!A(videoViewX, i10)) {
                if (viewGroup2 != null) {
                    viewGroup2.removeView(videoViewX);
                }
                if (viewGroup != null) {
                    if (videoViewX.getLayoutParams() == null) {
                        layoutParams = new ViewGroup.LayoutParams(viewGroup.getLayoutParams().width, viewGroup.getLayoutParams().height);
                    } else {
                        layoutParams = videoViewX.getLayoutParams();
                        layoutParams.width = viewGroup.getLayoutParams().width;
                        layoutParams.height = viewGroup.getLayoutParams().height;
                    }
                    videoViewX.setLayoutParams(layoutParams);
                    viewGroup.addView(videoViewX, 0);
                }
                if (i10 == this.f72921e) {
                    Q(videoViewX);
                } else {
                    R(videoViewX, i10);
                }
            } else if (i10 == this.f72921e) {
                if (!videoViewX.G()) {
                    Q(videoViewX);
                }
            } else if (videoViewX.G()) {
                videoViewX.K();
            }
            videoViewX.setTag(R.id.tag_video_position, Integer.valueOf(i10));
        }
    }

    public static final /* synthetic */ void g(VideoViewDelegate videoViewDelegate, int i10) {
        if (PatchProxy.proxy(new Object[]{videoViewDelegate, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.f33829rh, new Class[]{VideoViewDelegate.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        videoViewDelegate.t(i10);
    }

    public static final /* synthetic */ ViewGroup h(VideoViewDelegate videoViewDelegate, int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{videoViewDelegate, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.f33939wh, new Class[]{VideoViewDelegate.class, Integer.TYPE}, ViewGroup.class);
        return patchProxyResultProxy.isSupported ? (ViewGroup) patchProxyResultProxy.result : videoViewDelegate.u(i10);
    }

    public static final /* synthetic */ VideoViewX j(VideoViewDelegate videoViewDelegate) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{videoViewDelegate}, null, changeQuickRedirect, true, bb.c.k.f33873th, new Class[]{VideoViewDelegate.class}, VideoViewX.class);
        return patchProxyResultProxy.isSupported ? (VideoViewX) patchProxyResultProxy.result : videoViewDelegate.v();
    }

    public static final /* synthetic */ void l(VideoViewDelegate videoViewDelegate) {
        if (PatchProxy.proxy(new Object[]{videoViewDelegate}, null, changeQuickRedirect, true, bb.c.k.f33917vh, new Class[]{VideoViewDelegate.class}, Void.TYPE).isSupported) {
            return;
        }
        videoViewDelegate.y();
    }

    public static final /* synthetic */ void n(VideoViewDelegate videoViewDelegate) {
        if (PatchProxy.proxy(new Object[]{videoViewDelegate}, null, changeQuickRedirect, true, bb.c.k.f33851sh, new Class[]{VideoViewDelegate.class}, Void.TYPE).isSupported) {
            return;
        }
        videoViewDelegate.S();
    }

    public static final /* synthetic */ void o(VideoViewDelegate videoViewDelegate) {
        if (PatchProxy.proxy(new Object[]{videoViewDelegate}, null, changeQuickRedirect, true, bb.c.k.f33895uh, new Class[]{VideoViewDelegate.class}, Void.TYPE).isSupported) {
            return;
        }
        videoViewDelegate.T();
    }

    public static final /* synthetic */ void p(VideoViewDelegate videoViewDelegate, VideoViewX videoViewX, ViewGroup viewGroup, int i10) {
        if (PatchProxy.proxy(new Object[]{videoViewDelegate, videoViewX, viewGroup, new Integer(i10)}, null, changeQuickRedirect, true, bb.c.k.f33961xh, new Class[]{VideoViewDelegate.class, VideoViewX.class, ViewGroup.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        videoViewDelegate.V(videoViewX, viewGroup, i10);
    }

    private final void q() {
        Fragment fragmentB;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Og, new Class[0], Void.TYPE).isSupported || (fragmentB = this.f72917a.b()) == null) {
            return;
        }
        fragmentB.getLifecycle().a(new v() { // from class: com.max.hbstory.delegate.video.VideoViewDelegate$addLifecycleObserve$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: compiled from: VideoViewDelegate.kt */
            public final /* synthetic */ class a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f72926a;

                static {
                    int[] iArr = new int[Lifecycle.Event.values().length];
                    try {
                        iArr[Lifecycle.Event.ON_STOP.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    f72926a = iArr;
                }
            }

            @Override // androidx.lifecycle.v
            public void d(@dl.d y source, @dl.d Lifecycle.Event event) {
                g gVarD;
                LiveData<Integer> liveDataN;
                if (PatchProxy.proxy(new Object[]{source, event}, this, changeQuickRedirect, false, bb.c.k.f33983yh, new Class[]{y.class, Lifecycle.Event.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(source, "source");
                f0.p(event, "event");
                Log.d("onStateChanged", "video " + event);
                if (a.f72926a[event.ordinal()] != 1 || (gVarD = this.f72925b.f72917a.d()) == null || (liveDataN = gVarD.n()) == null || liveDataN.f() == null) {
                    return;
                }
                VideoViewDelegate videoViewDelegate = this.f72925b;
                Log.d("onStateChanged", "video setLastVideoReportData");
                VideoViewDelegate.n(videoViewDelegate);
            }
        });
    }

    private final IStoryLandscapeControlWidget r() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Mg, new Class[0], IStoryLandscapeControlWidget.class);
        if (patchProxyResultProxy.isSupported) {
            return (IStoryLandscapeControlWidget) patchProxyResultProxy.result;
        }
        yh.a<IStoryLandscapeControlWidget> aVarW = w();
        if (aVarW != null) {
            return aVarW.invoke();
        }
        return null;
    }

    private final VideoViewX s(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.k.Ng, new Class[]{Context.class}, VideoViewX.class);
        if (patchProxyResultProxy.isSupported) {
            return (VideoViewX) patchProxyResultProxy.result;
        }
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        VideoViewX videoViewX = new VideoViewX(context);
        videoViewX.o(new com.max.video.impl.f(context));
        videoViewX.setTag(R.id.tag_video_position, -1);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(displayMetrics.widthPixels, displayMetrics.heightPixels);
        layoutParams.gravity = 17;
        videoViewX.setLayoutParams(layoutParams);
        return videoViewX;
    }

    private final void t(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.Rg, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i11 = this.f72921e;
        if (i10 < i11) {
            List<VideoViewX> list = this.f72920d;
            list.add(list.remove(0));
        } else if (i10 > i11) {
            List<VideoViewX> list2 = this.f72920d;
            list2.add(0, list2.remove(list2.size() - 1));
        }
        U(this.f72920d.get(1), this.f72921e);
        U(this.f72920d.get(0), this.f72921e - 1);
        U(this.f72920d.get(2), this.f72921e + 1);
    }

    private final ViewGroup u(int i10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33508dh, new Class[]{Integer.TYPE}, ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewPager2 viewPager2E = this.f72917a.e();
        if (viewPager2E == null) {
            return null;
        }
        return (ViewGroup) viewPager2E.findViewWithTag(StoryUtilsKt.f73012a + i10);
    }

    private final VideoViewX v() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Tg, new Class[0], VideoViewX.class);
        if (patchProxyResultProxy.isSupported) {
            return (VideoViewX) patchProxyResultProxy.result;
        }
        for (VideoViewX videoViewX : this.f72920d) {
            if (A(videoViewX, this.f72921e)) {
                return videoViewX;
            }
        }
        return null;
    }

    private final yh.a<IStoryLandscapeControlWidget> w() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Lg, new Class[0], yh.a.class);
        if (patchProxyResultProxy.isSupported) {
            return (yh.a) patchProxyResultProxy.result;
        }
        od.g gVarC = this.f72918b.c();
        if (gVarC != null) {
            return gVarC.a();
        }
        return null;
    }

    private final void x(final VideoViewX videoViewX, final StoryItemsObj storyItemsObj) {
        if (PatchProxy.proxy(new Object[]{videoViewX, storyItemsObj}, this, changeQuickRedirect, false, bb.c.k.f33554fh, new Class[]{VideoViewX.class, StoryItemsObj.class}, Void.TYPE).isSupported || storyItemsObj == null) {
            return;
        }
        com.max.hbstory.c cVarB = this.f72918b.b();
        io.reactivex.disposables.a aVarA = cVarB != null ? cVarB.a() : null;
        StoryCardIdInfoObj card_id_info = storyItemsObj.getCard_id_info();
        AccelWorldBBSKt.b(aVarA, card_id_info != null ? card_id_info.getItem_id() : null, new l<VideoInfoObj, b2>() { // from class: com.max.hbstory.delegate.video.VideoViewDelegate$getVideoInfo$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d VideoInfoObj newVideoInfo) {
                LiveData<List<StoryItemsObj>> liveDataF;
                List<StoryItemsObj> listF;
                if (PatchProxy.proxy(new Object[]{newVideoInfo}, this, changeQuickRedirect, false, bb.c.k.f34005zh, new Class[]{VideoInfoObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(newVideoInfo, "newVideoInfo");
                Fragment fragmentB = this.f72927b.f72917a.b();
                if (fragmentB == null || z.a(fragmentB) == null) {
                    return;
                }
                VideoViewDelegate videoViewDelegate = this.f72927b;
                StoryItemsObj storyItemsObj2 = storyItemsObj;
                VideoViewX videoViewX2 = videoViewX;
                g gVarD = videoViewDelegate.f72917a.d();
                if (gVarD == null || (liveDataF = gVarD.F()) == null || (listF = liveDataF.f()) == null || !listF.contains(storyItemsObj2)) {
                    return;
                }
                int iIndexOf = listF.indexOf(storyItemsObj2);
                StoryItemsObj storyItemsObj3 = listF.get(iIndexOf);
                StoryLinkCardInfoObj link_card_info = storyItemsObj3.getLink_card_info();
                StoryVideoInfoObj video_info = link_card_info != null ? link_card_info.getVideo_info() : null;
                if (video_info != null) {
                    video_info.setPlay_url(newVideoInfo.getVideo_url());
                }
                Object tag = videoViewX2 != null ? videoViewX2.getTag(R.id.tag_video_item_id) : null;
                String str = tag instanceof String ? (String) tag : null;
                StoryCardIdInfoObj card_id_info2 = storyItemsObj3.getCard_id_info();
                if (f0.g(str, card_id_info2 != null ? card_id_info2.getItem_id() : null)) {
                    VideoViewDelegate.p(videoViewDelegate, videoViewX2, VideoViewDelegate.h(videoViewDelegate, iIndexOf), iIndexOf);
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(VideoInfoObj videoInfoObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{videoInfoObj}, this, changeQuickRedirect, false, bb.c.k.Ah, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(videoInfoObj);
                return b2.f124493a;
            }
        }, new l<Throwable, b2>() { // from class: com.max.hbstory.delegate.video.VideoViewDelegate$getVideoInfo$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.k.Ch, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d Throwable it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.k.Bh, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
            }
        });
    }

    private final void y() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Vg, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoViewX videoViewXV = v();
        ze.d ui2 = videoViewXV != null ? videoViewXV.getUi() : null;
        View view = ui2 instanceof View ? (View) ui2 : null;
        if (view == null) {
            return;
        }
        view.setVisibility(8);
    }

    private final void z(VideoViewX videoViewX, int i10) {
        Context contextA;
        Fragment fragmentB;
        if (PatchProxy.proxy(new Object[]{videoViewX, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.k.f33646jh, new Class[]{VideoViewX.class, Integer.TYPE}, Void.TYPE).isSupported || (contextA = this.f72917a.a()) == null || (fragmentB = this.f72917a.b()) == null || videoViewX == null) {
            return;
        }
        ze.d ui2 = videoViewX.getUi();
        IStoryLandscapeControlWidget iStoryLandscapeControlWidgetR = ui2 instanceof IStoryLandscapeControlWidget ? (IStoryLandscapeControlWidget) ui2 : null;
        if (iStoryLandscapeControlWidgetR == null) {
            iStoryLandscapeControlWidgetR = r();
        }
        if (iStoryLandscapeControlWidgetR != null) {
            ViewParent parent = iStoryLandscapeControlWidgetR.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(iStoryLandscapeControlWidgetR);
            }
        }
        if (iStoryLandscapeControlWidgetR != null) {
            iStoryLandscapeControlWidgetR.W(videoViewX, this.f72917a, i10);
        }
        videoViewX.p(iStoryLandscapeControlWidgetR);
        videoViewX.n(fragmentB);
        videoViewX.s(contextA);
    }

    public final void P() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33669kh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        for (VideoViewX videoViewX : this.f72920d) {
            com.max.video.player.a player = videoViewX.getPlayer();
            if (player != null) {
                player.stop();
            }
            ViewParent parent = videoViewX.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.removeView(videoViewX);
            }
        }
        this.f72920d.clear();
    }
}
