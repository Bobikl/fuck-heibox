package com.max.hbstory;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.j1;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.j0;
import androidx.lifecycle.y;
import androidx.lifecycle.y0;
import androidx.lifecycle.z;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.SimpleItemAnimator;
import androidx.viewpager2.widget.ViewPager2;
import com.max.basebbs.bean.BBSLinkRecObj;
import com.max.basebbs.bean.video.VideoInfoObj;
import com.max.basebbs.utils.AccelWorldBBSKt;
import com.max.hbstory.bean.StoryCardIdInfoObj;
import com.max.hbstory.bean.StoryItemsObj;
import com.max.hbstory.bean.StoryLinkCardInfoObj;
import com.max.hbstory.bean.StoryNextOffsetCardObj;
import com.max.hbstory.bean.StoryPageItemInfoObj;
import com.max.hbstory.bean.StoryPageObj;
import com.max.hbstory.bean.StoryVideoInfoObj;
import com.max.hbstory.config.StoryRootViewBuilder;
import com.max.hbstory.delegate.StoryReportDelegate;
import com.max.hbstory.delegate.StoryViewPage2Delegate;
import com.max.hbstory.delegate.picture.PictureViewPager2Delegate;
import com.max.hbstory.delegate.video.VideoViewDelegate;
import com.max.hbstory.utils.StoryUtilsKt;
import com.max.hbstory.viewpage2.root.IStoryGestureUserHomeHolder;
import com.max.hbstory.viewpage2.root.IStoryTitleBarHolder;
import com.max.hbstory.viewpage2.video.StoryViewPage2Adapter;
import com.max.hbutils.utils.t;
import com.max.video.player.VideoPlayerManager;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.rtmp.downloader.TXVodPreloadManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.jvm.internal.u;
import kotlinx.coroutines.k;
import kotlinx.coroutines.q0;
import yh.l;
import yh.p;

/* JADX INFO: compiled from: StoryPlayerFragment.kt */
/* JADX INFO: loaded from: classes13.dex */
@t0({"SMAP\nStoryPlayerFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StoryPlayerFragment.kt\ncom/max/hbstory/StoryPlayerFragment\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,588:1\n154#2,8:589\n*S KotlinDebug\n*F\n+ 1 StoryPlayerFragment.kt\ncom/max/hbstory/StoryPlayerFragment\n*L\n379#1:589,8\n*E\n"})
public final class StoryPlayerFragment extends Fragment {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @dl.d
    public static final a f72777t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @dl.d
    public static final String f72778u = "video_info";

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @dl.d
    public static final String f72779v = "rec";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @dl.d
    public static final String f72780w = "h_src";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f72781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.max.hbstory.viewpage2.video.b f72782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private StoryViewPage2Adapter f72783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private pd.d f72784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private com.max.hbstory.d f72785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private VideoViewDelegate f72786g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private StoryViewPage2Delegate f72787h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private PictureViewPager2Delegate f72788i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private StoryReportDelegate f72789j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.e
    private StoryItemsObj f72790k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.e
    private String f72791l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.e
    private BBSLinkRecObj f72792m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final TXVodPreloadManager f72793n = TXVodPreloadManager.getInstance(ContextUtils.getApplicationContext());

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.d
    private final ArrayList<Integer> f72794o = new ArrayList<>();

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private od.a f72795p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @dl.e
    private View f72796q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f72797r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @dl.e
    private db.a f72798s;

    /* JADX INFO: compiled from: StoryPlayerFragment.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }
    }

    /* JADX INFO: compiled from: StoryPlayerFragment.kt */
    public static final class b implements qd.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.d
        private List<StoryItemsObj> f72799a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f72800b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f72801c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f72802d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f72803e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f72804f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f72805g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @dl.e
        private StoryNextOffsetCardObj f72806h;

        b() {
        }

        @Override // qd.a
        public void a(boolean z10) {
            this.f72801c = z10;
        }

        @Override // qd.a
        public void b(int i10) {
            this.f72805g = i10;
        }

        @Override // qd.a
        @dl.e
        public StoryNextOffsetCardObj c() {
            return this.f72806h;
        }

        @Override // qd.a
        public void d(boolean z10) {
            this.f72800b = z10;
        }

        @Override // qd.a
        public int e() {
            return this.f72804f;
        }

        @Override // qd.a
        public int f() {
            return this.f72802d;
        }

        @Override // qd.a
        @dl.d
        public List<StoryItemsObj> g() {
            return this.f72799a;
        }

        @Override // qd.a
        public void h(int i10) {
            this.f72804f = i10;
        }

        @Override // qd.a
        public void i(int i10) {
            this.f72802d = i10;
        }

        @Override // qd.a
        public void j(boolean z10) {
            this.f72803e = z10;
        }

        @Override // qd.a
        public boolean k() {
            return this.f72800b;
        }

        @Override // qd.a
        public void l(@dl.e StoryNextOffsetCardObj storyNextOffsetCardObj) {
            this.f72806h = storyNextOffsetCardObj;
        }

        @Override // qd.a
        public void m(@dl.d List<StoryItemsObj> list) {
            if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.f33549fc, new Class[]{List.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(list, "<set-?>");
            this.f72799a = list;
        }

        @Override // qd.a
        public boolean n() {
            return this.f72801c;
        }

        @Override // qd.a
        public int o() {
            return this.f72805g;
        }

        @Override // qd.a
        public boolean p() {
            return this.f72803e;
        }
    }

    /* JADX INFO: compiled from: StoryPlayerFragment.kt */
    public static final class c implements com.max.hbstory.c {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @dl.e
        private final io.reactivex.disposables.a f72807a;

        c() {
        }

        @Override // com.max.hbstory.c
        @dl.e
        public io.reactivex.disposables.a a() {
            return this.f72807a;
        }

        @Override // com.max.hbstory.c
        public void b(@dl.d Context context, @dl.e String str, @dl.e String str2, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
            if (PatchProxy.proxy(new Object[]{context, str, str2, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, bb.c.k.f33733nc, new Class[]{Context.class, String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(onSuccessFoo, "onSuccessFoo");
            f0.p(onErrorFoo, "onErrorFoo");
        }

        @Override // com.max.hbstory.c
        public void c(@dl.e String str, @dl.e String str2, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
            if (PatchProxy.proxy(new Object[]{str, str2, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, bb.c.k.f33664kc, new Class[]{String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(onSuccessFoo, "onSuccessFoo");
            f0.p(onErrorFoo, "onErrorFoo");
        }

        @Override // com.max.hbstory.c
        public void d(@dl.e String str, @dl.e String str2, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
            if (PatchProxy.proxy(new Object[]{str, str2, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, bb.c.k.f33641jc, new Class[]{String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(onSuccessFoo, "onSuccessFoo");
            f0.p(onErrorFoo, "onErrorFoo");
        }

        @Override // com.max.hbstory.c
        public void e(@dl.d Context context, @dl.e String str, @dl.e String str2, @dl.e String str3, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
            if (PatchProxy.proxy(new Object[]{context, str, str2, str3, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, bb.c.k.f33710mc, new Class[]{Context.class, String.class, String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(onSuccessFoo, "onSuccessFoo");
            f0.p(onErrorFoo, "onErrorFoo");
        }

        @Override // com.max.hbstory.c
        public void f(@dl.e String str, @dl.e String str2, @dl.e String str3, @dl.e Map<String, String> map, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
            if (PatchProxy.proxy(new Object[]{str, str2, str3, map, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, bb.c.k.f33687lc, new Class[]{String.class, String.class, String.class, Map.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(onSuccessFoo, "onSuccessFoo");
            f0.p(onErrorFoo, "onErrorFoo");
        }

        @Override // com.max.hbstory.c
        public void g(@dl.e String str, @dl.e String str2, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
            if (PatchProxy.proxy(new Object[]{str, str2, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, bb.c.k.f33618ic, new Class[]{String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(onSuccessFoo, "onSuccessFoo");
            f0.p(onErrorFoo, "onErrorFoo");
        }

        @Override // com.max.hbstory.c
        public void h(@dl.e e eVar, @dl.d l<? super StoryPageItemInfoObj, b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
            if (PatchProxy.proxy(new Object[]{eVar, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, bb.c.k.f33595hc, new Class[]{e.class, l.class, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(onSuccessFoo, "onSuccessFoo");
            f0.p(onErrorFoo, "onErrorFoo");
        }

        @Override // com.max.hbstory.c
        public void i(@dl.d y lifecycleOwner) {
            if (PatchProxy.proxy(new Object[]{lifecycleOwner}, this, changeQuickRedirect, false, bb.c.k.f33572gc, new Class[]{y.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(lifecycleOwner, "lifecycleOwner");
        }

        @Override // com.max.hbstory.c
        public void j(@dl.d Context context, @dl.e String str, @dl.e String str2, @dl.d yh.a<b2> onSuccessFoo, @dl.d l<? super Throwable, b2> onErrorFoo) {
            if (PatchProxy.proxy(new Object[]{context, str, str2, onSuccessFoo, onErrorFoo}, this, changeQuickRedirect, false, bb.c.k.f33756oc, new Class[]{Context.class, String.class, String.class, yh.a.class, l.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(onSuccessFoo, "onSuccessFoo");
            f0.p(onErrorFoo, "onErrorFoo");
        }
    }

    /* JADX INFO: compiled from: StoryPlayerFragment.kt */
    public static final class d extends o {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
            super(true);
        }

        @Override // androidx.activity.o
        public void handleOnBackPressed() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33868tc, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            g gVar = StoryPlayerFragment.this.f72781b;
            g gVar2 = null;
            if (gVar == null) {
                f0.S("mStoryViewModel");
                gVar = null;
            }
            if (f0.g(gVar.O().f(), Boolean.TRUE)) {
                if (StoryPlayerFragment.this.getActivity() != null) {
                    g gVar3 = StoryPlayerFragment.this.f72781b;
                    if (gVar3 == null) {
                        f0.S("mStoryViewModel");
                    } else {
                        gVar2 = gVar3;
                    }
                    gVar2.r0(false);
                    return;
                }
                return;
            }
            db.a aVar = StoryPlayerFragment.this.f72798s;
            if (f0.e(aVar != null ? Float.valueOf(aVar.c0()) : null, 1.0f)) {
                db.a aVar2 = StoryPlayerFragment.this.f72798s;
                if (aVar2 != null) {
                    aVar2.j(true);
                    return;
                }
                return;
            }
            FragmentActivity activity = StoryPlayerFragment.this.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }

    public static final /* synthetic */ void M3(StoryPlayerFragment storyPlayerFragment, StoryItemsObj storyItemsObj) {
        if (PatchProxy.proxy(new Object[]{storyPlayerFragment, storyItemsObj}, null, changeQuickRedirect, true, bb.c.k.Kb, new Class[]{StoryPlayerFragment.class, StoryItemsObj.class}, Void.TYPE).isSupported) {
            return;
        }
        storyPlayerFragment.W3(storyItemsObj);
    }

    public static final /* synthetic */ void V3(StoryPlayerFragment storyPlayerFragment, List list) {
        if (PatchProxy.proxy(new Object[]{storyPlayerFragment, list}, null, changeQuickRedirect, true, bb.c.k.Jb, new Class[]{StoryPlayerFragment.class, List.class}, Void.TYPE).isSupported) {
            return;
        }
        storyPlayerFragment.n4(list);
    }

    private final void W3(StoryItemsObj storyItemsObj) {
        StoryLinkCardInfoObj link_card_info;
        StoryVideoInfoObj video_info;
        if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, bb.c.k.f33755ob, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported || storyItemsObj == null || (link_card_info = storyItemsObj.getLink_card_info()) == null || (video_info = link_card_info.getVideo_info()) == null) {
            return;
        }
        String play_url = video_info.getPlay_url();
        if (play_url != null && AccelWorldBBSKt.c(play_url)) {
            Log.d("cacheVideo", "expired url: " + video_info.getPlay_url());
            Z3(storyItemsObj);
        }
    }

    private final void Z3(final StoryItemsObj storyItemsObj) {
        if (PatchProxy.proxy(new Object[]{storyItemsObj}, this, changeQuickRedirect, false, bb.c.k.f33732nb, new Class[]{StoryItemsObj.class}, Void.TYPE).isSupported || storyItemsObj == null) {
            return;
        }
        od.a aVar = this.f72795p;
        if (aVar == null) {
            f0.S("mStoryConfig");
            aVar = null;
        }
        com.max.hbstory.c cVarB = aVar.b();
        io.reactivex.disposables.a aVarA = cVarB != null ? cVarB.a() : null;
        StoryCardIdInfoObj card_id_info = storyItemsObj.getCard_id_info();
        AccelWorldBBSKt.b(aVarA, card_id_info != null ? card_id_info.getItem_id() : null, new l<VideoInfoObj, b2>() { // from class: com.max.hbstory.StoryPlayerFragment$getVideoInfo$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: com.max.hbstory.StoryPlayerFragment$getVideoInfo$1$1$1, reason: invalid class name */
            /* JADX INFO: compiled from: StoryPlayerFragment.kt */
            @kotlin.coroutines.jvm.internal.d(c = "com.max.hbstory.StoryPlayerFragment$getVideoInfo$1$1$1", f = "StoryPlayerFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            public static final class AnonymousClass1 extends SuspendLambda implements p<q0, kotlin.coroutines.c<? super b2>, Object> {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                int f72819b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ StoryPlayerFragment f72820c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ StoryItemsObj f72821d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ VideoInfoObj f72822e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(StoryPlayerFragment storyPlayerFragment, StoryItemsObj storyItemsObj, VideoInfoObj videoInfoObj, kotlin.coroutines.c<? super AnonymousClass1> cVar) {
                    super(2, cVar);
                    this.f72820c = storyPlayerFragment;
                    this.f72821d = storyItemsObj;
                    this.f72822e = videoInfoObj;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.d
                public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.k.f33433ac, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
                    return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AnonymousClass1(this.f72820c, this.f72821d, this.f72822e, cVar);
                }

                @Override // yh.p
                public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.f33479cc, new Class[]{Object.class, Object.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
                }

                @dl.e
                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.k.f33456bc, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
                    return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @dl.e
                public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.k.Zb, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    kotlin.coroutines.intrinsics.b.h();
                    if (this.f72819b != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.t0.n(obj);
                    g gVar = this.f72820c.f72781b;
                    if (gVar == null) {
                        f0.S("mStoryViewModel");
                        gVar = null;
                    }
                    List<StoryItemsObj> listF = gVar.F().f();
                    if (listF != null) {
                        StoryItemsObj storyItemsObj = this.f72821d;
                        VideoInfoObj videoInfoObj = this.f72822e;
                        if (listF.contains(storyItemsObj)) {
                            StoryLinkCardInfoObj link_card_info = listF.get(listF.indexOf(storyItemsObj)).getLink_card_info();
                            StoryVideoInfoObj video_info = link_card_info != null ? link_card_info.getVideo_info() : null;
                            if (video_info != null) {
                                video_info.setPlay_url(videoInfoObj.getVideo_url());
                            }
                        }
                    }
                    return b2.f124493a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(@dl.d VideoInfoObj newVideoInfo) {
                if (PatchProxy.proxy(new Object[]{newVideoInfo}, this, changeQuickRedirect, false, bb.c.k.Xb, new Class[]{VideoInfoObj.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(newVideoInfo, "newVideoInfo");
                k.f(z.a(this.f72817b), null, null, new AnonymousClass1(this.f72817b, storyItemsObj, newVideoInfo, null), 3, null);
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(VideoInfoObj videoInfoObj) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{videoInfoObj}, this, changeQuickRedirect, false, bb.c.k.Yb, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(videoInfoObj);
                return b2.f124493a;
            }
        }, new l<Throwable, b2>() { // from class: com.max.hbstory.StoryPlayerFragment$getVideoInfo$1$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.k.f33526ec, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                invoke2(th2);
                return b2.f124493a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@dl.d Throwable it) {
                if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.k.f33503dc, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(it, "it");
            }
        });
    }

    private final b a4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Eb, new Class[0], b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : new b();
    }

    private final c b4() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Fb, new Class[0], c.class);
        return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : new c();
    }

    private final void c4() {
        StoryRootViewBuilder storyRootViewBuilderC;
        yh.a<IStoryGestureUserHomeHolder> aVarA;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33999zb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f72798s = new db.a();
        FrameLayout frameLayout = new FrameLayout(requireContext());
        frameLayout.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        frameLayout.setId(R.id.base_fragment_container);
        db.a aVar = (db.a) com.billy.android.swipe.b.m(requireActivity()).addConsumer(this.f72798s);
        if (aVar != null) {
            aVar.z2(frameLayout);
        }
        od.a aVar2 = this.f72795p;
        com.max.hbstory.d dVar = null;
        if (aVar2 == null) {
            f0.S("mStoryConfig");
            aVar2 = null;
        }
        od.g gVarC = aVar2.c();
        if (gVarC == null || (storyRootViewBuilderC = gVarC.c()) == null || (aVarA = storyRootViewBuilderC.a()) == null) {
            return;
        }
        IStoryGestureUserHomeHolder iStoryGestureUserHomeHolderInvoke = aVarA.invoke();
        com.max.hbstory.d dVar2 = this.f72785f;
        if (dVar2 == null) {
            f0.S("mStoryContext");
        } else {
            dVar = dVar2;
        }
        iStoryGestureUserHomeHolderInvoke.b(dVar);
    }

    private final void d4(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        qd.a aVarA4;
        g gVar;
        if (PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, this, changeQuickRedirect, false, bb.c.k.f33889ub, new Class[]{LayoutInflater.class, ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        pd.d dVarD = pd.d.d(layoutInflater, viewGroup, false);
        f0.o(dVarD, "inflate(...)");
        this.f72784e = dVarD;
        od.a aVar = this.f72795p;
        com.max.hbstory.d dVar = null;
        if (aVar == null) {
            f0.S("mStoryConfig");
            aVar = null;
        }
        od.e eVarA = aVar.a();
        if (eVarA == null || (aVarA4 = eVarA.a()) == null) {
            aVarA4 = a4();
        }
        this.f72781b = (g) new y0(this, new h(aVarA4)).a(g.class);
        od.a aVar2 = this.f72795p;
        if (aVar2 == null) {
            f0.S("mStoryConfig");
            aVar2 = null;
        }
        com.max.hbstory.c cVarB = aVar2.b();
        if (cVarB == null) {
            cVarB = b4();
        }
        com.max.hbstory.c cVar = cVarB;
        cVar.i(this);
        pd.d dVar2 = this.f72784e;
        if (dVar2 == null) {
            f0.S("binding");
            dVar2 = null;
        }
        Context context = dVar2.b().getContext();
        f0.o(context, "getContext(...)");
        pd.d dVar3 = this.f72784e;
        if (dVar3 == null) {
            f0.S("binding");
            dVar3 = null;
        }
        ViewPager2 storyMainViewPager2 = dVar3.f138274b;
        f0.o(storyMainViewPager2, "storyMainViewPager2");
        g gVar2 = this.f72781b;
        if (gVar2 == null) {
            f0.S("mStoryViewModel");
            gVar = null;
        } else {
            gVar = gVar2;
        }
        com.max.hbstory.d dVar4 = new com.max.hbstory.d(context, this, storyMainViewPager2, gVar, cVar);
        this.f72785f = dVar4;
        this.f72782c = new com.max.hbstory.viewpage2.video.b(dVar4);
        com.max.hbstory.d dVar5 = this.f72785f;
        if (dVar5 == null) {
            f0.S("mStoryContext");
            dVar5 = null;
        }
        od.a aVar3 = this.f72795p;
        if (aVar3 == null) {
            f0.S("mStoryConfig");
            aVar3 = null;
        }
        this.f72786g = new VideoViewDelegate(dVar5, aVar3);
        com.max.hbstory.d dVar6 = this.f72785f;
        if (dVar6 == null) {
            f0.S("mStoryContext");
            dVar6 = null;
        }
        this.f72788i = new PictureViewPager2Delegate(dVar6);
        od.a aVar4 = this.f72795p;
        if (aVar4 == null) {
            f0.S("mStoryConfig");
            aVar4 = null;
        }
        od.g gVarC = aVar4.c();
        com.max.hbstory.d dVar7 = this.f72785f;
        if (dVar7 == null) {
            f0.S("mStoryContext");
            dVar7 = null;
        }
        this.f72783d = new StoryViewPage2Adapter(gVarC, dVar7);
        com.max.hbstory.d dVar8 = this.f72785f;
        if (dVar8 == null) {
            f0.S("mStoryContext");
            dVar8 = null;
        }
        this.f72787h = new StoryViewPage2Delegate(dVar8);
        com.max.hbstory.d dVar9 = this.f72785f;
        if (dVar9 == null) {
            f0.S("mStoryContext");
        } else {
            dVar = dVar9;
        }
        this.f72789j = new StoryReportDelegate(dVar);
        i4();
    }

    private final void e4(pd.d dVar) {
        pb.f fVarI;
        StoryRootViewBuilder storyRootViewBuilderC;
        l<StoryRootViewBuilder.OverlayTipsType, View> lVarB;
        StoryRootViewBuilder.OverlayTipsType overlayTipsTypeW;
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.k.f33955xb, new Class[]{pd.d.class}, Void.TYPE).isSupported || (fVarI = ob.a.i()) == null || fVarI.j(od.f.f132279c, false)) {
            return;
        }
        od.a aVar = this.f72795p;
        if (aVar == null) {
            f0.S("mStoryConfig");
            aVar = null;
        }
        od.g gVarC = aVar.c();
        if (gVarC == null || (storyRootViewBuilderC = gVarC.c()) == null || (lVarB = storyRootViewBuilderC.b()) == null || (overlayTipsTypeW = StoryUtilsKt.w(this.f72790k)) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
        View viewInvoke = lVarB.invoke(overlayTipsTypeW);
        dVar.f138275c.addView(viewInvoke, layoutParams);
        this.f72796q = viewInvoke;
    }

    private final void f4(pd.d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.k.Bb, new Class[]{pd.d.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewPager2 viewPager2 = dVar.f138274b;
        viewPager2.setOffscreenPageLimit(3);
        StoryViewPage2Adapter storyViewPage2Adapter = this.f72783d;
        if (storyViewPage2Adapter == null) {
            f0.S("mViewPage2Adapter");
            storyViewPage2Adapter = null;
        }
        viewPager2.setAdapter(storyViewPage2Adapter);
        View childAt = viewPager2.getChildAt(0);
        RecyclerView recyclerView = childAt instanceof RecyclerView ? (RecyclerView) childAt : null;
        if (recyclerView != null) {
            RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
            SimpleItemAnimator simpleItemAnimator = itemAnimator instanceof SimpleItemAnimator ? (SimpleItemAnimator) itemAnimator : null;
            if (simpleItemAnimator != null) {
                simpleItemAnimator.setSupportsChangeAnimations(false);
            }
            recyclerView.setItemAnimator(null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void g4(pd.d dVar) {
        Resources resources;
        StoryRootViewBuilder storyRootViewBuilderC;
        yh.a<View> aVarC;
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.k.f33977yb, new Class[]{pd.d.class}, Void.TYPE).isSupported) {
            return;
        }
        od.a aVar = this.f72795p;
        View view = null;
        com.max.hbstory.d dVar2 = null;
        view = null;
        view = null;
        if (aVar == null) {
            f0.S("mStoryConfig");
            aVar = null;
        }
        od.g gVarC = aVar.c();
        if (gVarC != null && (storyRootViewBuilderC = gVarC.c()) != null && (aVarC = storyRootViewBuilderC.c()) != null) {
            View viewInvoke = aVarC.invoke();
            if (viewInvoke instanceof IStoryTitleBarHolder) {
                IStoryTitleBarHolder iStoryTitleBarHolder = (IStoryTitleBarHolder) viewInvoke;
                com.max.hbstory.d dVar3 = this.f72785f;
                if (dVar3 == null) {
                    f0.S("mStoryContext");
                } else {
                    dVar2 = dVar3;
                }
                iStoryTitleBarHolder.b(dVar2);
            }
            view = viewInvoke;
        }
        FrameLayout frameLayout = dVar.f138276d;
        Context context = getContext();
        frameLayout.addView(view, new ViewGroup.LayoutParams(-1, (context == null || (resources = context.getResources()) == null) ? -2 : (int) resources.getDimension(R.dimen.title_bar_height)));
    }

    private final void h4(pd.d dVar) {
        Window window;
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.k.f33933wb, new Class[]{pd.d.class}, Void.TYPE).isSupported) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity != null && (window = activity.getWindow()) != null) {
            t.h0(window);
            t.N(window, false);
            t.L(window, false);
            FragmentActivity activity2 = getActivity();
            Window window2 = activity2 != null ? activity2.getWindow() : null;
            if (window2 != null) {
                window2.setNavigationBarColor(j1.f21601t);
            }
            ConstraintLayout constraintLayoutB = dVar.b();
            f0.o(constraintLayoutB, "getRoot(...)");
            constraintLayoutB.setPadding(constraintLayoutB.getPaddingLeft(), t.p(getContext()), constraintLayoutB.getPaddingRight(), constraintLayoutB.getPaddingBottom());
        }
        f4(dVar);
        g4(dVar);
        e4(dVar);
    }

    private final void i4() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33911vb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        final g gVar = this.f72781b;
        if (gVar == null) {
            f0.S("mStoryViewModel");
            gVar = null;
        }
        LiveData<Integer> liveDataN = gVar.n();
        y viewLifecycleOwner = getViewLifecycleOwner();
        final l<Integer, b2> lVar = new l<Integer, b2>() { // from class: com.max.hbstory.StoryPlayerFragment$observerPage$1$1
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            public final void a(final Integer num) {
                if (!PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.k.f33779pc, new Class[]{Integer.class}, Void.TYPE).isSupported && f0.g(gVar.M().f(), Boolean.FALSE)) {
                    d dVar = this.f72785f;
                    if (dVar == null) {
                        f0.S("mStoryContext");
                        dVar = null;
                    }
                    f0.m(num);
                    int iIntValue = num.intValue();
                    final g gVar2 = gVar;
                    final StoryPlayerFragment storyPlayerFragment = this;
                    StoryUtilsKt.v(dVar, iIntValue, new yh.a<b2>() { // from class: com.max.hbstory.StoryPlayerFragment$observerPage$1$1.1
                        public static ChangeQuickRedirect changeQuickRedirect;

                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        {
                            super(0);
                        }

                        /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, kotlin.b2] */
                        @Override // yh.a
                        public /* bridge */ /* synthetic */ b2 invoke() {
                            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33846sc, new Class[0], Object.class);
                            if (patchProxyResultProxy.isSupported) {
                                return patchProxyResultProxy.result;
                            }
                            invoke2();
                            return b2.f124493a;
                        }

                        /* JADX WARN: Code duplicated, block: B:12:0x0043  */
                        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                        public final void invoke2() {
                            String item_id;
                            StoryCardIdInfoObj card_id_info;
                            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33824rc, new Class[0], Void.TYPE).isSupported) {
                                return;
                            }
                            List<StoryItemsObj> listF = gVar2.F().f();
                            if (listF != null) {
                                Integer position = num;
                                f0.o(position, "$position");
                                StoryItemsObj storyItemsObj = listF.get(position.intValue());
                                if (storyItemsObj == null || (card_id_info = storyItemsObj.getCard_id_info()) == null) {
                                    item_id = null;
                                } else {
                                    item_id = card_id_info.getItem_id();
                                }
                            } else {
                                item_id = null;
                            }
                            if (item_id != null) {
                                StoryNextOffsetCardObj storyNextOffsetCardObjC = gVar2.z().c();
                                if (f0.g(item_id, storyNextOffsetCardObjC != null ? storyNextOffsetCardObjC.getItem_id() : null)) {
                                    StoryPlayerFragment storyPlayerFragment2 = storyPlayerFragment;
                                    HashMap map = new HashMap();
                                    String str = storyPlayerFragment.f72791l;
                                    if (str != null) {
                                        map.put("h_src", str);
                                    }
                                    b2 b2Var = b2.f124493a;
                                    storyPlayerFragment2.Y3(new e(null, map));
                                }
                            }
                        }
                    });
                }
            }

            /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
            @Override // yh.l
            public /* bridge */ /* synthetic */ b2 invoke(Integer num) {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, bb.c.k.f33802qc, new Class[]{Object.class}, Object.class);
                if (patchProxyResultProxy.isSupported) {
                    return patchProxyResultProxy.result;
                }
                a(num);
                return b2.f124493a;
            }
        };
        liveDataN.k(viewLifecycleOwner, new j0() { // from class: com.max.hbstory.f
            @Override // androidx.lifecycle.j0
            public final void a(Object obj) {
                StoryPlayerFragment.j4(lVar, obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j4(l tmp0, Object obj) {
        if (PatchProxy.proxy(new Object[]{tmp0, obj}, null, changeQuickRedirect, true, bb.c.k.Ib, new Class[]{l.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(tmp0, "$tmp0");
        tmp0.invoke(obj);
    }

    private final void k4(pd.d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.k.Cb, new Class[]{pd.d.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewPager2 viewPager2 = dVar.f138274b;
        com.max.hbstory.viewpage2.video.b bVar = this.f72782c;
        if (bVar == null) {
            f0.S("mPageChangeCallback");
            bVar = null;
        }
        viewPager2.registerOnPageChangeCallback(bVar);
    }

    private final void l4() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33640jb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        d dVar = new d();
        FragmentActivity activity = getActivity();
        if (activity == null || (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) == null) {
            return;
        }
        onBackPressedDispatcher.c(getViewLifecycleOwner(), dVar);
    }

    private final synchronized void m4(int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.f33778pb, new Class[]{Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            this.f72794o.add(Integer.valueOf(i10));
        } else {
            this.f72794o.remove(Integer.valueOf(i10));
        }
    }

    private final void n4(List<StoryItemsObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, bb.c.k.f33709mb, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (true ^ list.isEmpty()) {
            StoryItemsObj storyItemsObj = list.get(0);
            StoryItemsObj storyItemsObj2 = this.f72790k;
            storyItemsObj.setNeed_story_mode_report(storyItemsObj2 != null ? storyItemsObj2.getNeed_story_mode_report() : false);
        }
        com.max.hbstory.d dVar = this.f72785f;
        if (dVar == null) {
            f0.S("mStoryContext");
            dVar = null;
        }
        g gVarD = dVar.d();
        qd.a aVarZ = gVarD != null ? gVarD.z() : null;
        if (aVarZ != null) {
            aVarZ.m(list);
        }
        g gVar = this.f72781b;
        if (gVar == null) {
            f0.S("mStoryViewModel");
            gVar = null;
        }
        gVar.g();
        k.f(z.a(this), null, null, new StoryPlayerFragment$syncList$1(this, null), 3, null);
    }

    private final void o4(boolean z10) {
        Activity activityA;
        Window window;
        Activity activityA2;
        Window window2;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.k.Gb, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10 && !this.f72797r) {
            this.f72797r = true;
            Context context = getContext();
            if (context == null || (activityA2 = ye.a.f141789a.a(context)) == null || (window2 = activityA2.getWindow()) == null) {
                return;
            }
            window2.addFlags(128);
            return;
        }
        if (z10 || !this.f72797r) {
            return;
        }
        this.f72797r = false;
        Context context2 = getContext();
        if (context2 == null || (activityA = ye.a.f141789a.a(context2)) == null || (window = activityA.getWindow()) == null) {
            return;
        }
        window.clearFlags(128);
    }

    private final void p4(pd.d dVar) {
        if (PatchProxy.proxy(new Object[]{dVar}, this, changeQuickRedirect, false, bb.c.k.Db, new Class[]{pd.d.class}, Void.TYPE).isSupported) {
            return;
        }
        ViewPager2 viewPager2 = dVar.f138274b;
        com.max.hbstory.viewpage2.video.b bVar = this.f72782c;
        if (bVar == null) {
            f0.S("mPageChangeCallback");
            bVar = null;
        }
        viewPager2.unregisterOnPageChangeCallback(bVar);
    }

    @dl.e
    public final StoryItemsObj X3() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Hb, new Class[0], StoryItemsObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (StoryItemsObj) patchProxyResultProxy.result;
        }
        com.max.hbstory.d dVar = this.f72785f;
        g gVar = null;
        if (dVar == null) {
            f0.S("mStoryContext");
            dVar = null;
        }
        g gVar2 = this.f72781b;
        if (gVar2 == null) {
            f0.S("mStoryViewModel");
        } else {
            gVar = gVar2;
        }
        Integer numF = gVar.n().f();
        if (numF == null) {
            numF = -1;
        }
        return StoryUtilsKt.m(dVar, numF.intValue());
    }

    public final void Y3(@dl.e e eVar) {
        if (PatchProxy.proxy(new Object[]{eVar}, this, changeQuickRedirect, false, bb.c.k.f33686lb, new Class[]{e.class}, Void.TYPE).isSupported) {
            return;
        }
        g gVar = this.f72781b;
        od.a aVar = null;
        if (gVar == null) {
            f0.S("mStoryViewModel");
            gVar = null;
        }
        gVar.b0(true);
        od.a aVar2 = this.f72795p;
        if (aVar2 == null) {
            f0.S("mStoryConfig");
        } else {
            aVar = aVar2;
        }
        com.max.hbstory.c cVarB = aVar.b();
        if (cVarB != null) {
            cVarB.h(eVar, new l<StoryPageItemInfoObj, b2>() { // from class: com.max.hbstory.StoryPlayerFragment$getStoryModeList$1
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                public final void a(@dl.d StoryPageItemInfoObj it) {
                    List<StoryItemsObj> items;
                    qd.a aVarZ;
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.k.Lb, new Class[]{StoryPageItemInfoObj.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    g gVar2 = this.f72809b.f72781b;
                    if (gVar2 == null) {
                        f0.S("mStoryViewModel");
                        gVar2 = null;
                    }
                    gVar2.b0(false);
                    if (!com.max.hbcommon.utils.c.w(it.getItems()) && (items = it.getItems()) != null) {
                        StoryPlayerFragment storyPlayerFragment = this.f72809b;
                        d dVar = storyPlayerFragment.f72785f;
                        if (dVar == null) {
                            f0.S("mStoryContext");
                            dVar = null;
                        }
                        g gVarD = dVar.d();
                        List<StoryItemsObj> listG = (gVarD == null || (aVarZ = gVarD.z()) == null) ? null : aVarZ.g();
                        if (listG == null || listG.isEmpty()) {
                            StoryPlayerFragment.V3(storyPlayerFragment, items);
                        } else if (listG.size() == 1 && f0.g(listG.get(0), storyPlayerFragment.f72790k)) {
                            StoryPlayerFragment.V3(storyPlayerFragment, items);
                            StoryViewPage2Adapter storyViewPage2Adapter = storyPlayerFragment.f72783d;
                            if (storyViewPage2Adapter == null) {
                                f0.S("mViewPage2Adapter");
                                storyViewPage2Adapter = null;
                            }
                            storyViewPage2Adapter.E(0);
                            View view = storyPlayerFragment.f72796q;
                            if (view != null) {
                                view.setVisibility(0);
                            }
                            storyPlayerFragment.f72796q = null;
                        } else {
                            listG.addAll(items);
                            g gVar3 = storyPlayerFragment.f72781b;
                            if (gVar3 == null) {
                                f0.S("mStoryViewModel");
                                gVar3 = null;
                            }
                            gVar3.g();
                        }
                        k.f(z.a(storyPlayerFragment), null, null, new StoryPlayerFragment$getStoryModeList$1$1$1(items, storyPlayerFragment, null), 3, null);
                    }
                    d dVar2 = this.f72809b.f72785f;
                    if (dVar2 == null) {
                        f0.S("mStoryContext");
                        dVar2 = null;
                    }
                    g gVarD2 = dVar2.d();
                    qd.a aVarZ2 = gVarD2 != null ? gVarD2.z() : null;
                    if (aVarZ2 == null) {
                        return;
                    }
                    StoryPageObj page = it.getPage();
                    aVarZ2.l(page != null ? page.getNext_offset_card() : null);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(StoryPageItemInfoObj storyPageItemInfoObj) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{storyPageItemInfoObj}, this, changeQuickRedirect, false, bb.c.k.Mb, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    a(storyPageItemInfoObj);
                    return b2.f124493a;
                }
            }, new l<Throwable, b2>() { // from class: com.max.hbstory.StoryPlayerFragment$getStoryModeList$2
                public static ChangeQuickRedirect changeQuickRedirect;

                {
                    super(1);
                }

                /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, kotlin.b2] */
                @Override // yh.l
                public /* bridge */ /* synthetic */ b2 invoke(Throwable th2) {
                    PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{th2}, this, changeQuickRedirect, false, bb.c.k.Wb, new Class[]{Object.class}, Object.class);
                    if (patchProxyResultProxy.isSupported) {
                        return patchProxyResultProxy.result;
                    }
                    invoke2(th2);
                    return b2.f124493a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@dl.d Throwable it) {
                    if (PatchProxy.proxy(new Object[]{it}, this, changeQuickRedirect, false, bb.c.k.Vb, new Class[]{Throwable.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    f0.p(it, "it");
                    g gVar2 = this.f72816b.f72781b;
                    if (gVar2 == null) {
                        f0.S("mStoryViewModel");
                        gVar2 = null;
                    }
                    gVar2.b0(false);
                    String message = it.getMessage();
                    if (message == null) {
                        message = "请稍候重试";
                    }
                    com.max.hbutils.utils.c.d(message);
                }
            });
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@dl.d Context context) throws Throwable {
        com.max.hbstory.b bVar;
        if (PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, bb.c.k.f33571gb, new Class[]{Context.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        super.onAttach(context);
        if (this.f72795p == null) {
            if (context instanceof com.max.hbstory.b) {
                bVar = (com.max.hbstory.b) context;
            } else if (getParentFragment() instanceof com.max.hbstory.b) {
                androidx.activity.result.b parentFragment = getParentFragment();
                f0.n(parentFragment, "null cannot be cast to non-null type com.max.hbstory.IStoryConfig");
                bVar = (com.max.hbstory.b) parentFragment;
            } else {
                if (!(getActivity() instanceof com.max.hbstory.b)) {
                    throw new Throwable("StoryPlayerFragment parent must be IStoryConfig");
                }
                LayoutInflater.Factory activity = getActivity();
                f0.n(activity, "null cannot be cast to non-null type com.max.hbstory.IStoryConfig");
                bVar = (com.max.hbstory.b) activity;
            }
            this.f72795p = bVar.x();
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(@dl.d Configuration newConfig) {
        if (PatchProxy.proxy(new Object[]{newConfig}, this, changeQuickRedirect, false, bb.c.k.Ab, new Class[]{Configuration.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(newConfig, "newConfig");
        super.onConfigurationChanged(newConfig);
        int i10 = newConfig.orientation;
        com.max.hbstory.d dVar = null;
        if (i10 == 2) {
            com.max.hbstory.d dVar2 = this.f72785f;
            if (dVar2 == null) {
                f0.S("mStoryContext");
            } else {
                dVar = dVar2;
            }
            g gVarD = dVar.d();
            if (gVarD != null) {
                gVarD.r0(true);
                return;
            }
            return;
        }
        if (i10 == 1) {
            com.max.hbstory.d dVar3 = this.f72785f;
            if (dVar3 == null) {
                f0.S("mStoryContext");
            } else {
                dVar = dVar3;
            }
            g gVarD2 = dVar.d();
            if (gVarD2 != null) {
                gVarD2.r0(false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(@dl.e Bundle bundle) {
        if (PatchProxy.proxy(new Object[]{bundle}, this, changeQuickRedirect, false, bb.c.k.f33594hb, new Class[]{Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f72790k = (StoryItemsObj) arguments.getSerializable("video_info");
            this.f72792m = (BBSLinkRecObj) arguments.getSerializable("rec");
            this.f72791l = arguments.getString("h_src");
        }
    }

    @Override // androidx.fragment.app.Fragment
    @dl.d
    public View onCreateView(@dl.d LayoutInflater inflater, @dl.e ViewGroup viewGroup, @dl.e Bundle bundle) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{inflater, viewGroup, bundle}, this, changeQuickRedirect, false, bb.c.k.f33617ib, new Class[]{LayoutInflater.class, ViewGroup.class, Bundle.class}, View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        f0.p(inflater, "inflater");
        d4(inflater, viewGroup);
        pd.d dVar = this.f72784e;
        pd.d dVar2 = null;
        if (dVar == null) {
            f0.S("binding");
            dVar = null;
        }
        h4(dVar);
        l4();
        VideoPlayerManager videoPlayerManager = VideoPlayerManager.f76079a;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        f0.o(fragmentActivityRequireActivity, "requireActivity(...)");
        videoPlayerManager.s(fragmentActivityRequireActivity);
        pd.d dVar3 = this.f72784e;
        if (dVar3 == null) {
            f0.S("binding");
        } else {
            dVar2 = dVar3;
        }
        ConstraintLayout constraintLayoutB = dVar2.b();
        f0.o(constraintLayoutB, "getRoot(...)");
        return constraintLayoutB;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33867tb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        this.f72790k = null;
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33845sb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        VideoViewDelegate videoViewDelegate = this.f72786g;
        com.max.hbstory.d dVar = null;
        if (videoViewDelegate != null) {
            if (videoViewDelegate == null) {
                f0.S("mVideoViewDelegate");
                videoViewDelegate = null;
            }
            videoViewDelegate.P();
        }
        pd.d dVar2 = this.f72784e;
        if (dVar2 == null) {
            f0.S("binding");
            dVar2 = null;
        }
        p4(dVar2);
        if (!com.max.hbcommon.utils.c.w(this.f72794o)) {
            for (Integer num : this.f72794o) {
                try {
                    TXVodPreloadManager tXVodPreloadManager = this.f72793n;
                    f0.m(num);
                    tXVodPreloadManager.stopPreload(num.intValue());
                } catch (Throwable unused) {
                }
            }
        }
        com.max.hbstory.d dVar3 = this.f72785f;
        if (dVar3 == null) {
            f0.S("mStoryContext");
        } else {
            dVar = dVar3;
        }
        Context contextA = dVar.a();
        if (contextA != null) {
            VideoPlayerManager.f76079a.z(contextA);
        }
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33823rb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onPause();
        o4(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.f33801qb, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onResume();
        o4(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@dl.d View view, @dl.e Bundle bundle) {
        StoryVideoInfoObj video_info;
        StoryCardIdInfoObj card_id_info;
        if (PatchProxy.proxy(new Object[]{view, bundle}, this, changeQuickRedirect, false, bb.c.k.f33663kb, new Class[]{View.class, Bundle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        super.onViewCreated(view, bundle);
        pd.d dVar = this.f72784e;
        if (dVar == null) {
            f0.S("binding");
            dVar = null;
        }
        k4(dVar);
        StoryItemsObj storyItemsObj = this.f72790k;
        String item_id = (storyItemsObj == null || (card_id_info = storyItemsObj.getCard_id_info()) == null) ? null : card_id_info.getItem_id();
        HashMap<String, String> mapG = AccelWorldBBSKt.g(this.f72792m);
        String str = this.f72791l;
        if (str != null) {
            mapG.put("h_src", str);
        }
        b2 b2Var = b2.f124493a;
        Y3(new e(item_id, mapG));
        StoryItemsObj storyItemsObj2 = this.f72790k;
        if (storyItemsObj2 != null) {
            StoryLinkCardInfoObj link_card_info = storyItemsObj2.getLink_card_info();
            StoryItemsObj storyItemsObj3 = ((link_card_info == null || (video_info = link_card_info.getVideo_info()) == null) ? null : video_info.getPlay_url()) != null ? storyItemsObj2 : null;
            if (storyItemsObj3 != null) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(storyItemsObj3);
                n4(arrayList);
            }
        }
    }
}
