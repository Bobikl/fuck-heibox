package com.max.xiaoheihe.module.game.adapter.recommend.binder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.gson.JsonObject;
import com.max.hbcommon.bean.analytics.PathSrcNode;
import com.max.hbcustomview.CustomHorizontalScrollView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbutils.utils.ViewUtils;
import com.max.video.AbsVideoView;
import com.max.video.impl.CountDownTopPanel;
import com.max.video.impl.PlainVideoUI;
import com.max.video.player.VideoPlayerManager;
import com.max.video.player.info.PlaybackState;
import com.max.video.ui.widget.BasicCenterPanel;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.bbs.BBSTextObj;
import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.max.xiaoheihe.bean.bbs.LinkInfoObj;
import com.max.xiaoheihe.bean.game.GameScreenshotObj;
import com.max.xiaoheihe.bean.game.recommend.GameRecommendBaseObj;
import com.max.xiaoheihe.bean.game.recommend.RecommendBoardObj;
import com.max.xiaoheihe.bean.mall.RecommendBoardItem;
import com.max.xiaoheihe.bean.recommend.GeneralGameObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.utils.e0;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.e1;
import kotlinx.coroutines.r0;

/* JADX INFO: compiled from: RecommendBoardVHB.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class RecommendBoardVHB extends r {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @dl.d
    public static final a f86042h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86043i = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private RecommendVHBParam f86044g;

    /* JADX INFO: compiled from: RecommendBoardVHB.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.RecommendBoardVHB$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RecommendBoardVHB.kt */
        public static final class ViewOnAttachStateChangeListenerC0771a implements View.OnAttachStateChangeListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbsVideoView f86045b;

            ViewOnAttachStateChangeListenerC0771a(AbsVideoView absVideoView) {
                this.f86045b = absVideoView;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(@dl.d View v10) {
                if (PatchProxy.proxy(new Object[]{v10}, this, changeQuickRedirect, false, 36124, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(v10, "v");
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(@dl.d View v10) {
                if (PatchProxy.proxy(new Object[]{v10}, this, changeQuickRedirect, false, 36125, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(v10, "v");
                if (this.f86045b.G()) {
                    this.f86045b.K();
                }
            }
        }

        /* JADX INFO: compiled from: RecommendBoardVHB.kt */
        public static final class b implements xe.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ BannerViewPager<GameScreenshotObj> f86046a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbsVideoView f86047b;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.RecommendBoardVHB$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RecommendBoardVHB.kt */
            public final /* synthetic */ class C0772a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f86048a;

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
                    f86048a = iArr;
                }
            }

            b(BannerViewPager<GameScreenshotObj> bannerViewPager, AbsVideoView absVideoView) {
                this.f86046a = bannerViewPager;
                this.f86047b = absVideoView;
            }

            @Override // xe.a
            public void a(@dl.d PlaybackState state) {
                if (PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 36126, new Class[]{PlaybackState.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(state, "state");
                int i10 = C0772a.f86048a[state.ordinal()];
                if (i10 == 1) {
                    this.f86046a.setVisibility(8);
                    this.f86047b.setVisibility(0);
                } else {
                    if (i10 != 2) {
                        return;
                    }
                    this.f86047b.setVisibility(8);
                    this.f86046a.setVisibility(0);
                    this.f86046a.bringToFront();
                }
            }
        }

        /* JADX INFO: compiled from: RecommendBoardVHB.kt */
        public static final class c implements xe.a {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbsVideoView f86049a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ PlainVideoUI f86050b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ com.max.hbcommon.base.adapter.s.e f86051c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ RecommendBoardItem f86052d;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.RecommendBoardVHB$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RecommendBoardVHB.kt */
            public final /* synthetic */ class C0773a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f86053a;

                static {
                    int[] iArr = new int[PlaybackState.valuesCustom().length];
                    try {
                        iArr[PlaybackState.COMPLETE.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[PlaybackState.STARTED.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    f86053a = iArr;
                }
            }

            c(AbsVideoView absVideoView, PlainVideoUI plainVideoUI, com.max.hbcommon.base.adapter.s.e eVar, RecommendBoardItem recommendBoardItem) {
                this.f86049a = absVideoView;
                this.f86050b = plainVideoUI;
                this.f86051c = eVar;
                this.f86052d = recommendBoardItem;
            }

            @Override // xe.a
            public void a(@dl.d PlaybackState state) {
                if (PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 36127, new Class[]{PlaybackState.class}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(state, "state");
                int i10 = C0773a.f86053a[state.ordinal()];
                if (i10 != 1) {
                    if (i10 != 2) {
                        return;
                    }
                    this.f86050b.n(false, 0, 0L);
                    return;
                }
                AbsVideoView absVideoView = this.f86049a;
                if (absVideoView != null) {
                    com.max.hbcommon.base.adapter.s.e eVar = this.f86051c;
                    RecommendBoardItem recommendBoardItem = this.f86052d;
                    if (absVideoView.getTag() != null) {
                        RecommendBoardVHB.f86042h.c(eVar, recommendBoardItem, Integer.parseInt(absVideoView.getTag().toString()) + 1, true);
                    }
                }
            }
        }

        /* JADX INFO: compiled from: RecommendBoardVHB.kt */
        public static final class d implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AbsVideoView f86054b;

            d(AbsVideoView absVideoView) {
                this.f86054b = absVideoView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36128, new Class[]{View.class}, Void.TYPE).isSupported && this.f86054b.F()) {
                    if (this.f86054b.G()) {
                        this.f86054b.K();
                    } else {
                        this.f86054b.M();
                    }
                }
            }
        }

        /* JADX INFO: compiled from: RecommendBoardVHB.kt */
        public static final class e implements Runnable {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BannerViewPager<GameScreenshotObj> f86055b;

            e(BannerViewPager<GameScreenshotObj> bannerViewPager) {
                this.f86055b = bannerViewPager;
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36129, new Class[0], Void.TYPE).isSupported) {
                    return;
                }
                this.f86055b.setVisibility(0);
            }
        }

        /* JADX INFO: compiled from: RecommendBoardVHB.kt */
        public static final class f extends ViewPager2.OnPageChangeCallback {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ AbsVideoView f86056a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ BannerViewPager<GameScreenshotObj> f86057b;

            f(AbsVideoView absVideoView, BannerViewPager<GameScreenshotObj> bannerViewPager) {
                this.f86056a = absVideoView;
                this.f86057b = bannerViewPager;
            }

            @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
            public void onPageSelected(int i10) {
                if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36130, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                    return;
                }
                super.onPageSelected(i10);
                this.f86056a.setTag(Integer.valueOf(i10));
                this.f86057b.setVisibility(0);
            }
        }

        /* JADX INFO: compiled from: RecommendBoardVHB.kt */
        public static final class g extends com.max.hbcustomview.bannerview.d<GameScreenshotObj> {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ BannerViewPager<GameScreenshotObj> f86058f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ AbsVideoView f86059g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ RecommendBoardItem f86060h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            final /* synthetic */ Context f86061i;

            /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.binder.RecommendBoardVHB$a$g$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: RecommendBoardVHB.kt */
            public static final class ViewOnClickListenerC0774a implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ GameScreenshotObj f86062b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ BannerViewPager<GameScreenshotObj> f86063c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ AbsVideoView f86064d;

                ViewOnClickListenerC0774a(GameScreenshotObj gameScreenshotObj, BannerViewPager<GameScreenshotObj> bannerViewPager, AbsVideoView absVideoView) {
                    this.f86062b = gameScreenshotObj;
                    this.f86063c = bannerViewPager;
                    this.f86064d = absVideoView;
                }

                /* JADX WARN: Code duplicated, block: B:16:0x0060  */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36133, new Class[]{View.class}, Void.TYPE).isSupported && f0.g(this.f86062b.getType(), GameScreenshotObj.TYPE_MOVIE)) {
                        this.f86063c.setVisibility(8);
                        this.f86064d.setVisibility(0);
                        if (this.f86064d.F()) {
                            com.max.video.player.a player = this.f86064d.getPlayer();
                            if (f0.g(player != null ? player.s() : null, this.f86062b.getUrl())) {
                                this.f86064d.M();
                            } else {
                                this.f86064d.R();
                                this.f86064d.setVideoRes(this.f86062b.getUrl());
                                this.f86064d.M();
                            }
                        } else {
                            this.f86064d.R();
                            this.f86064d.setVideoRes(this.f86062b.getUrl());
                            this.f86064d.M();
                        }
                        VideoPlayerManager videoPlayerManager = VideoPlayerManager.f76079a;
                        AbsVideoView absVideoViewM = videoPlayerManager.m();
                        if (!f0.g(absVideoViewM, this.f86064d)) {
                            if (absVideoViewM != null && absVideoViewM.G()) {
                                absVideoViewM.K();
                            }
                        }
                        AbsVideoView videoView = this.f86064d;
                        f0.o(videoView, "videoView");
                        videoPlayerManager.o(videoView);
                    }
                }
            }

            /* JADX INFO: compiled from: RecommendBoardVHB.kt */
            @t0({"SMAP\nRecommendBoardVHB.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommendBoardVHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/RecommendBoardVHB$Companion$refreshRecommendBoard$3$bindData$2\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,515:1\n37#2,2:516\n*S KotlinDebug\n*F\n+ 1 RecommendBoardVHB.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/binder/RecommendBoardVHB$Companion$refreshRecommendBoard$3$bindData$2\n*L\n218#1:516,2\n*E\n"})
            public static final class b implements View.OnClickListener {
                public static ChangeQuickRedirect changeQuickRedirect;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ RecommendBoardItem f86065b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ GameScreenshotObj f86066c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ Context f86067d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ ImageView f86068e;

                b(RecommendBoardItem recommendBoardItem, GameScreenshotObj gameScreenshotObj, Context context, ImageView imageView) {
                    this.f86065b = recommendBoardItem;
                    this.f86066c = gameScreenshotObj;
                    this.f86067d = context;
                    this.f86068e = imageView;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36134, new Class[]{View.class}, Void.TYPE).isSupported) {
                        return;
                    }
                    GeneralGameObj game = this.f86065b.getGame();
                    List<GameScreenshotObj> screenshots = game != null ? game.getScreenshots() : null;
                    if (com.max.hbcommon.utils.c.w(screenshots)) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    f0.m(screenshots);
                    int size = screenshots.size();
                    int i10 = 0;
                    int i11 = 0;
                    for (int i12 = 0; i12 < size; i12++) {
                        GameScreenshotObj gameScreenshotObj = screenshots.get(i12);
                        f0.o(gameScreenshotObj, "list[i]");
                        GameScreenshotObj gameScreenshotObj2 = gameScreenshotObj;
                        if (f0.g(gameScreenshotObj2.getType(), "image")) {
                            if (f0.g(gameScreenshotObj2.getThumbnail(), this.f86066c.getThumbnail())) {
                                i10 = i11;
                            }
                            i11++;
                            arrayList.add(gameScreenshotObj2.getThumbnail());
                        }
                    }
                    ImageViewerHelper.Companion companion = ImageViewerHelper.f95500a;
                    ImageViewerHelper.a aVarA = companion.a(this.f86067d);
                    ImageView imgView = this.f86068e;
                    f0.o(imgView, "imgView");
                    aVarA.m(companion.d(imgView, i10), (String[]) arrayList.toArray(new String[0])).d(i10).p();
                }
            }

            g(BannerViewPager<GameScreenshotObj> bannerViewPager, AbsVideoView absVideoView, RecommendBoardItem recommendBoardItem, Context context) {
                this.f86058f = bannerViewPager;
                this.f86059g = absVideoView;
                this.f86060h = recommendBoardItem;
                this.f86061i = context;
            }

            public void A(@dl.d com.max.hbcustomview.bannerview.e<GameScreenshotObj> holder, @dl.d GameScreenshotObj vpData, int i10, int i11) {
                Object[] objArr = {holder, vpData, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36131, new Class[]{com.max.hbcustomview.bannerview.e.class, GameScreenshotObj.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                f0.p(holder, "holder");
                f0.p(vpData, "vpData");
                View viewFindViewById = holder.findViewById(R.id.vg_play_button);
                ImageView imageView = (ImageView) holder.findViewById(R.id.iv_simple_img);
                holder.itemView.setOnClickListener(new ViewOnClickListenerC0774a(vpData, this.f86058f, this.f86059g));
                if (f0.g(vpData.getType(), GameScreenshotObj.TYPE_MOVIE)) {
                    viewFindViewById.setVisibility(0);
                } else {
                    viewFindViewById.setVisibility(8);
                    imageView.setOnClickListener(new b(this.f86060h, vpData, this.f86061i, imageView));
                }
                com.max.hbimage.b.L(vpData.getThumbnail(), imageView, R.drawable.common_default_placeholder_375x210);
            }

            @Override // com.max.hbcustomview.bannerview.d
            public /* bridge */ /* synthetic */ void n(com.max.hbcustomview.bannerview.e<GameScreenshotObj> eVar, GameScreenshotObj gameScreenshotObj, int i10, int i11) {
                Object[] objArr = {eVar, gameScreenshotObj, new Integer(i10), new Integer(i11)};
                ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
                Class cls = Integer.TYPE;
                if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36132, new Class[]{com.max.hbcustomview.bannerview.e.class, Object.class, cls, cls}, Void.TYPE).isSupported) {
                    return;
                }
                A(eVar, gameScreenshotObj, i10, i11);
            }

            @Override // com.max.hbcustomview.bannerview.d
            public int q(int i10) {
                return R.layout.item_rec_board_screenshot;
            }

            @Override // com.max.hbcustomview.bannerview.d
            public int s(int i10) {
                return 0;
            }
        }

        /* JADX INFO: compiled from: RecommendBoardVHB.kt */
        public static final class h implements com.max.xiaoheihe.view.n {
            public static ChangeQuickRedirect changeQuickRedirect;

            h() {
            }

            @Override // com.max.xiaoheihe.view.n
            public void a() {
            }
        }

        /* JADX INFO: compiled from: RecommendBoardVHB.kt */
        public static final class i implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecommendBoardItem f86069b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f86070c;

            i(RecommendBoardItem recommendBoardItem, Context context) {
                this.f86069b = recommendBoardItem;
                this.f86070c = context;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                String id2;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36135, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                LinkInfoObj game_comment = this.f86069b.getGame_comment();
                if (com.max.hbcommon.utils.c.u(game_comment != null ? game_comment.getLinkid() : null)) {
                    return;
                }
                Context context = this.f86070c;
                RecommendBoardItem recommendBoardItem = this.f86069b;
                AppCompatActivity appCompatActivity = (AppCompatActivity) context;
                GeneralGameObj game = recommendBoardItem.getGame();
                String h_src = game != null ? game.getH_src() : null;
                GeneralGameObj game2 = recommendBoardItem.getGame();
                if (game2 == null || (id2 = game2.getAppid()) == null) {
                    GeneralGameObj game3 = recommendBoardItem.getGame();
                    id2 = game3 != null ? game3.getId() : null;
                }
                GeneralGameObj game4 = recommendBoardItem.getGame();
                String game_type = game4 != null ? game4.getGame_type() : null;
                LinkInfoObj game_comment2 = recommendBoardItem.getGame_comment();
                com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.L(appCompatActivity, h_src, id2, game_type, game_comment2 != null ? game_comment2.getLinkid() : null));
            }
        }

        /* JADX INFO: compiled from: RecommendBoardVHB.kt */
        public static final class j implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ RecommendBoardItem f86071b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f86072c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ View.OnClickListener f86073d;

            j(RecommendBoardItem recommendBoardItem, Context context, View.OnClickListener onClickListener) {
                this.f86071b = recommendBoardItem;
                this.f86072c = context;
                this.f86073d = onClickListener;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36136, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                GeneralGameObj game = this.f86071b.getGame();
                if (!com.max.hbcommon.utils.c.u(game != null ? game.getAppid() : null)) {
                    Context context = this.f86072c;
                    GeneralGameObj game2 = this.f86071b.getGame();
                    String h_src = game2 != null ? game2.getH_src() : null;
                    GeneralGameObj game3 = this.f86071b.getGame();
                    String appid = game3 != null ? game3.getAppid() : null;
                    GeneralGameObj game4 = this.f86071b.getGame();
                    context.startActivity(z.b(context, h_src, appid, game4 != null ? game4.getGame_type() : null, null, i0.m(), i0.j(), null));
                }
                View.OnClickListener onClickListener = this.f86073d;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        }

        /* JADX INFO: compiled from: RecommendBoardVHB.kt */
        public static final class k implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Context f86074b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ View.OnClickListener f86075c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ RecommendBoardItem f86076d;

            k(Context context, View.OnClickListener onClickListener, RecommendBoardItem recommendBoardItem) {
                this.f86074b = context;
                this.f86075c = onClickListener;
                this.f86076d = recommendBoardItem;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BBSUserInfoObj user;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36137, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                AppCompatActivity appCompatActivity = (AppCompatActivity) this.f86074b;
                LinkInfoObj game_comment = this.f86076d.getGame_comment();
                com.max.xiaoheihe.base.router.b.T(appCompatActivity, (game_comment == null || (user = game_comment.getUser()) == null) ? null : user.getUserid()).A();
                View.OnClickListener onClickListener = this.f86075c;
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        }

        private a() {
        }

        public /* synthetic */ a(kotlin.jvm.internal.u uVar) {
            this();
        }

        public static /* synthetic */ void e(a aVar, Context context, com.max.hbcommon.base.adapter.s.e eVar, RecommendBoardItem recommendBoardItem, boolean z10, boolean z11, View.OnClickListener onClickListener, int i10, Object obj) {
            Object[] objArr = {aVar, context, eVar, recommendBoardItem, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), onClickListener, new Integer(i10), obj};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36120, new Class[]{a.class, Context.class, com.max.hbcommon.base.adapter.s.e.class, RecommendBoardItem.class, cls, cls, View.OnClickListener.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
                return;
            }
            aVar.d(context, eVar, recommendBoardItem, (i10 & 8) != 0 ? false : z10 ? 1 : 0, (i10 & 16) != 0 ? true : z11 ? 1 : 0, (i10 & 32) != 0 ? null : onClickListener);
        }

        @dl.d
        @xh.m
        public final ImageView a(@dl.d String url, @dl.d Context context) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url, context}, this, changeQuickRedirect, false, 36121, new Class[]{String.class, Context.class}, ImageView.class);
            if (patchProxyResultProxy.isSupported) {
                return (ImageView) patchProxyResultProxy.result;
            }
            f0.p(url, "url");
            f0.p(context, "context");
            int iF = ViewUtils.f(context, 16.0f);
            ImageView imageView = new ImageView(context);
            imageView.setLayoutParams(new LinearLayout.LayoutParams(iF, iF));
            com.max.hbimage.b.d0(url, imageView, ViewUtils.f(context, 2.0f));
            return imageView;
        }

        @xh.m
        public final void b(@dl.d Context context, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d RecommendBoardItem data) {
            ze.b bVarA;
            ze.b bVarD;
            if (PatchProxy.proxy(new Object[]{context, viewHolder, data}, this, changeQuickRedirect, false, 36122, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, RecommendBoardItem.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            AbsVideoView absVideoView = (AbsVideoView) viewHolder.i(R.id.video_view);
            BannerViewPager bannerViewPager = (BannerViewPager) viewHolder.i(R.id.banner_viewpager);
            com.max.video.impl.f fVar = new com.max.video.impl.f(context);
            PlainVideoUI plainVideoUI = new PlainVideoUI(context);
            CountDownTopPanel countDownTopPanel = new CountDownTopPanel(context);
            BasicCenterPanel basicCenterPanel = new BasicCenterPanel(context);
            plainVideoUI.m(countDownTopPanel);
            plainVideoUI.k(basicCenterPanel);
            plainVideoUI.setAlwaysShowTopPanel(true);
            absVideoView.p(plainVideoUI).o(fVar).s(context);
            ze.b gestureHandler = absVideoView.getGestureHandler();
            if (gestureHandler != null && (bVarA = gestureHandler.a()) != null && (bVarD = bVarA.d()) != null) {
                bVarD.c();
            }
            absVideoView.u();
            absVideoView.setVisibility(8);
            absVideoView.setId(R.id.video_view);
            absVideoView.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0771a(absVideoView));
            absVideoView.setTargetStateChangeListener(new b(bannerViewPager, absVideoView));
            absVideoView.setPlaybackStateChangeListener(new c(absVideoView, plainVideoUI, viewHolder, data));
            absVideoView.setOnClickListener(new d(absVideoView));
            absVideoView.post(new e(bannerViewPager));
        }

        @xh.m
        public final void c(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d RecommendBoardItem data, int i10, boolean z10) {
            if (PatchProxy.proxy(new Object[]{viewHolder, data, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36123, new Class[]{com.max.hbcommon.base.adapter.s.e.class, RecommendBoardItem.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            AbsVideoView absVideoView = (AbsVideoView) viewHolder.i(R.id.video_view);
            BannerViewPager bannerViewPager = (BannerViewPager) viewHolder.i(R.id.banner_viewpager);
            GeneralGameObj game = data.getGame();
            List<GameScreenshotObj> screenshots = game != null ? game.getScreenshots() : null;
            if (screenshots == null || screenshots.size() <= 0) {
                return;
            }
            if (i10 >= screenshots.size() || i10 < 0) {
                c(viewHolder, data, 0, false);
                return;
            }
            GameScreenshotObj gameScreenshotObj = screenshots.get(i10);
            bannerViewPager.setCurrentItem(i10, false);
            if (!f0.g(gameScreenshotObj.getType(), GameScreenshotObj.TYPE_MOVIE)) {
                absVideoView.setVisibility(8);
                bannerViewPager.setVisibility(0);
                bannerViewPager.bringToFront();
                return;
            }
            bannerViewPager.setVisibility(8);
            Context context = absVideoView.getContext();
            f0.o(context, "videoView.context");
            absVideoView.S(context);
            absVideoView.setVideoRes(gameScreenshotObj.getUrl());
            absVideoView.O();
            absVideoView.Y();
        }

        /* JADX WARN: Code duplicated, block: B:37:0x02a8  */
        /* JADX WARN: Code duplicated, block: B:39:0x02ae  */
        /* JADX WARN: Code duplicated, block: B:40:0x02b3  */
        /* JADX WARN: Code duplicated, block: B:43:0x02ba  */
        @xh.m
        public final void d(@dl.d Context context, @dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d RecommendBoardItem data, boolean z10, boolean z11, @dl.e View.OnClickListener onClickListener) {
            GeneralGameObj game;
            String vertical_img_fg;
            BBSUserInfoObj user;
            BBSUserInfoObj user2;
            String score;
            List<String> platforms_icon;
            int i10;
            Object[] objArr = {context, viewHolder, data, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), onClickListener};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Boolean.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36119, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, RecommendBoardItem.class, cls, cls, View.OnClickListener.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(context, "context");
            f0.p(viewHolder, "viewHolder");
            f0.p(data, "data");
            ImageView imageView = (ImageView) viewHolder.i(R.id.iv_img);
            ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_mini_img);
            FrameLayout frameLayout = (FrameLayout) viewHolder.i(R.id.rcv_img_container);
            LinearLayout linearLayout = (LinearLayout) viewHolder.i(R.id.vg_platforms);
            AbsVideoView absVideoView = (AbsVideoView) viewHolder.i(R.id.video_view);
            BannerViewPager bannerViewPager = (BannerViewPager) viewHolder.i(R.id.banner_viewpager);
            TextView textView = (TextView) viewHolder.i(R.id.tv_game_name);
            SliceGradeView sliceGradeView = (SliceGradeView) viewHolder.i(R.id.sgv);
            ImageView imageView3 = (ImageView) viewHolder.i(R.id.iv_avatar);
            TextView textView2 = (TextView) viewHolder.i(R.id.tv_time);
            TextView textView3 = (TextView) viewHolder.i(R.id.tv_username);
            TextView textView4 = (TextView) viewHolder.i(R.id.tv_content);
            ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_video);
            View viewI = viewHolder.i(R.id.vg_score);
            View viewI2 = viewHolder.i(R.id.divider);
            data.setIndex(String.valueOf(viewHolder.getAdapterPosition()));
            CustomHorizontalScrollView customHorizontalScrollView = (CustomHorizontalScrollView) viewHolder.i(R.id.vg_tags);
            if (z11) {
                List<RichAttributeModelObj> rich_text_labels = data.getRich_text_labels();
                if (rich_text_labels != null) {
                    i10 = 0;
                    r1.N1(customHorizontalScrollView, rich_text_labels, fi.u.u(ViewUtils.L(context) - ViewUtils.f(context, 24.0f), 0));
                } else {
                    i10 = 0;
                }
                customHorizontalScrollView.setVisibility(i10);
            } else {
                textView = textView;
                customHorizontalScrollView.setVisibility(8);
            }
            if (z10) {
                if (viewHolder.getAbsoluteAdapterPosition() == 0) {
                    ViewGroup.LayoutParams layoutParams = frameLayout.getLayoutParams();
                    f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(context, 4.0f);
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ViewUtils.f(context, 4.0f);
                } else {
                    ViewGroup.LayoutParams layoutParams3 = frameLayout.getLayoutParams();
                    f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = ViewUtils.f(context, 18.0f);
                    ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
                    f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = ViewUtils.f(context, 18.0f);
                }
                viewI2.setVisibility(0);
                textView4.setPadding(textView4.getPaddingLeft(), textView4.getPaddingTop(), textView4.getPaddingRight(), ViewUtils.f(context, 14.0f));
            } else {
                ViewGroup.LayoutParams layoutParams5 = frameLayout.getLayoutParams();
                f0.n(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = 0;
                ViewGroup.LayoutParams layoutParams6 = viewGroup.getLayoutParams();
                f0.n(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = 0;
                if (z11) {
                    ViewGroup.LayoutParams layoutParams7 = frameLayout.getLayoutParams();
                    f0.n(layoutParams7, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams7).topMargin = ViewUtils.f(context, 14.0f);
                    ViewGroup.LayoutParams layoutParams8 = viewGroup.getLayoutParams();
                    f0.n(layoutParams8, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    ((ViewGroup.MarginLayoutParams) layoutParams8).topMargin = ViewUtils.f(context, 14.0f);
                    viewI2.setVisibility(0);
                } else {
                    textView4.setPadding(textView4.getPaddingLeft(), textView4.getPaddingTop(), textView4.getPaddingRight(), 0);
                    viewI2.setVisibility(8);
                }
            }
            b(context, viewHolder, data);
            bannerViewPager.V(ViewUtils.f(context, 1.5f));
            bannerViewPager.c0(ViewUtils.f(context, 6.0f));
            bannerViewPager.Z(ViewUtils.f(context, 4.0f));
            bannerViewPager.Y(androidx.core.content.res.i.e(context.getResources(), R.color.white_alpha40, null), androidx.core.content.res.i.e(context.getResources(), R.color.white, null));
            bannerViewPager.T(false);
            bannerViewPager.L(new f(absVideoView, bannerViewPager));
            bannerViewPager.j0(((AppCompatActivity) context).getLifecycle()).R(new g(bannerViewPager, absVideoView, data, context)).k();
            GeneralGameObj game2 = data.getGame();
            f0.m(game2);
            bannerViewPager.J(game2.getScreenshots());
            bannerViewPager.S(false);
            GeneralGameObj game3 = data.getGame();
            if (com.max.hbcommon.utils.c.u(game3 != null ? game3.getVertical_img_fg() : null)) {
                game = data.getGame();
                if (game != null) {
                    vertical_img_fg = game.getVertical_img_fg();
                } else {
                    vertical_img_fg = null;
                }
                if (!com.max.hbcommon.utils.c.u(vertical_img_fg)) {
                    imageView2.setVisibility(8);
                    GeneralGameObj game4 = data.getGame();
                    f0.m(game4);
                    com.max.hbimage.b.d0(game4.getVertical_img_fg(), imageView, ViewUtils.f(context, 3.0f));
                }
            } else {
                GeneralGameObj game5 = data.getGame();
                if (com.max.hbcommon.utils.c.u(game5 != null ? game5.getVertical_img_bg() : null)) {
                    game = data.getGame();
                    if (game != null) {
                        vertical_img_fg = game.getVertical_img_fg();
                    } else {
                        vertical_img_fg = null;
                    }
                    if (!com.max.hbcommon.utils.c.u(vertical_img_fg)) {
                        imageView2.setVisibility(8);
                        GeneralGameObj game6 = data.getGame();
                        f0.m(game6);
                        com.max.hbimage.b.d0(game6.getVertical_img_fg(), imageView, ViewUtils.f(context, 3.0f));
                    }
                } else {
                    imageView2.setVisibility(0);
                    GeneralGameObj game7 = data.getGame();
                    f0.m(game7);
                    com.max.hbimage.b.d0(game7.getVertical_img_bg(), imageView, ViewUtils.f(context, 3.0f));
                    GeneralGameObj game8 = data.getGame();
                    f0.m(game8);
                    com.max.hbimage.b.d0(game8.getVertical_img_fg(), imageView2, ViewUtils.f(context, 3.0f));
                }
            }
            j jVar = new j(data, context, onClickListener);
            imageView.setOnClickListener(jVar);
            imageView2.setOnClickListener(jVar);
            TextView textView5 = textView;
            textView5.setOnClickListener(jVar);
            viewI.setOnClickListener(jVar);
            k kVar = new k(context, onClickListener, data);
            imageView3.setOnClickListener(kVar);
            textView3.setOnClickListener(kVar);
            textView2.setOnClickListener(kVar);
            GeneralGameObj game9 = data.getGame();
            textView5.setText(game9 != null ? game9.getName() : null);
            linearLayout.removeAllViews();
            GeneralGameObj game10 = data.getGame();
            if (game10 != null && (platforms_icon = game10.getPlatforms_icon()) != null) {
                for (String platform : platforms_icon) {
                    a aVar = RecommendBoardVHB.f86042h;
                    f0.o(platform, "platform");
                    linearLayout.addView(aVar.a(platform, context));
                }
            }
            LinkInfoObj game_comment = data.getGame_comment();
            r17.setGrade((game_comment == null || (score = game_comment.getScore()) == null) ? 0 : (int) Float.parseFloat(score));
            sliceGradeView.setEnableSlide(false);
            LinkInfoObj game_comment2 = data.getGame_comment();
            com.max.hbimage.b.I((game_comment2 == null || (user2 = game_comment2.getUser()) == null) ? null : user2.getAvatar(), imageView3, R.drawable.common_default_avatar_40x40);
            LinkInfoObj game_comment3 = data.getGame_comment();
            textView2.setText(game_comment3 != null ? game_comment3.getPlay_state() : null);
            LinkInfoObj game_comment4 = data.getGame_comment();
            textView3.setText((game_comment4 == null || (user = game_comment4.getUser()) == null) ? null : user.getUsername());
            LinkInfoObj game_comment5 = data.getGame_comment();
            if (!com.max.hbcommon.utils.c.u(game_comment5 != null ? game_comment5.getText() : null)) {
                LinkInfoObj game_comment6 = data.getGame_comment();
                String text = game_comment6 != null ? game_comment6.getText() : null;
                f0.m(text);
                if (kotlin.text.u.v2(text, Constants.ARRAY_TYPE, false, 2, null)) {
                    LinkInfoObj game_comment7 = data.getGame_comment();
                    String text2 = game_comment7 != null ? game_comment7.getText() : null;
                    f0.m(text2);
                    if (kotlin.text.u.K1(text2, "]", false, 2, null)) {
                        LinkInfoObj game_comment8 = data.getGame_comment();
                        e0.b(textView4, e0.k(((BBSTextObj) com.max.hbutils.utils.k.b(game_comment8 != null ? game_comment8.getText() : null, BBSTextObj.class).get(0)).getText()), new h(), false, 3);
                        textView4.setOnClickListener(new i(data, context));
                    }
                }
            }
            GeneralGameObj game11 = data.getGame();
            String score_desc = game11 != null ? game11.getScore_desc() : null;
            GeneralGameObj game12 = data.getGame();
            String score2 = game12 != null ? game12.getScore() : null;
            GeneralGameObj game13 = data.getGame();
            String expect_num = game13 != null ? game13.getExpect_num() : null;
            GeneralGameObj game14 = data.getGame();
            r1.R1(viewHolder, score_desc, score2, expect_num, game14 != null ? game14.getScore_comment() : null);
            viewHolder.itemView.setTag(data);
        }
    }

    public RecommendBoardVHB(@dl.d RecommendVHBParam param) {
        f0.p(param, "param");
        this.f86044g = param;
    }

    @dl.d
    @xh.m
    public static final ImageView w(@dl.d String str, @dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, context}, null, changeQuickRedirect, true, 36116, new Class[]{String.class, Context.class}, ImageView.class);
        return patchProxyResultProxy.isSupported ? (ImageView) patchProxyResultProxy.result : f86042h.a(str, context);
    }

    @xh.m
    public static final void x(@dl.d Context context, @dl.d com.max.hbcommon.base.adapter.s.e eVar, @dl.d RecommendBoardItem recommendBoardItem) {
        if (PatchProxy.proxy(new Object[]{context, eVar, recommendBoardItem}, null, changeQuickRedirect, true, 36117, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, RecommendBoardItem.class}, Void.TYPE).isSupported) {
            return;
        }
        f86042h.b(context, eVar, recommendBoardItem);
    }

    @xh.m
    public static final void y(@dl.d com.max.hbcommon.base.adapter.s.e eVar, @dl.d RecommendBoardItem recommendBoardItem, int i10, boolean z10) {
        if (PatchProxy.proxy(new Object[]{eVar, recommendBoardItem, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 36118, new Class[]{com.max.hbcommon.base.adapter.s.e.class, RecommendBoardItem.class, Integer.TYPE, Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f86042h.c(eVar, recommendBoardItem, i10, z10);
    }

    @xh.m
    public static final void z(@dl.d Context context, @dl.d com.max.hbcommon.base.adapter.s.e eVar, @dl.d RecommendBoardItem recommendBoardItem, boolean z10, boolean z11, @dl.e View.OnClickListener onClickListener) {
        Object[] objArr = {context, eVar, recommendBoardItem, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0), onClickListener};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 36115, new Class[]{Context.class, com.max.hbcommon.base.adapter.s.e.class, RecommendBoardItem.class, cls, cls, View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f86042h.d(context, eVar, recommendBoardItem, z10, z11, onClickListener);
    }

    public final void A(@dl.d RecommendVHBParam recommendVHBParam) {
        if (PatchProxy.proxy(new Object[]{recommendVHBParam}, this, changeQuickRedirect, false, 36112, new Class[]{RecommendVHBParam.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(recommendVHBParam, "<set-?>");
        this.f86044g = recommendVHBParam;
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void g(@dl.d com.max.hbcommon.base.adapter.s.e viewHolder, @dl.d GameRecommendBaseObj data) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data}, this, changeQuickRedirect, false, 36113, new Class[]{com.max.hbcommon.base.adapter.s.e.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        kotlinx.coroutines.k.f(r0.a(e1.e()), null, null, new RecommendBoardVHB$contentBinding$1(data, viewHolder, this, null), 3, null);
    }

    @Override // com.max.xiaoheihe.module.game.adapter.recommend.binder.r
    public void p(@dl.d View itemView, @dl.d List<PathSrcNode> shownList, @dl.d GameRecommendBaseObj data) {
        GeneralGameObj game;
        GeneralGameObj game2;
        if (PatchProxy.proxy(new Object[]{itemView, shownList, data}, this, changeQuickRedirect, false, 36114, new Class[]{View.class, List.class, GameRecommendBaseObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(itemView, "itemView");
        f0.p(shownList, "shownList");
        f0.p(data, "data");
        if (com.max.hbcommon.utils.c.u(data.getReport_path()) || !(data instanceof RecommendBoardObj)) {
            return;
        }
        RecommendBoardObj recommendBoardObj = (RecommendBoardObj) data;
        PathSrcNode pathSrcNodeCopyToPathNode = recommendBoardObj.copyToPathNode();
        JsonObject addition = pathSrcNodeCopyToPathNode.getAddition();
        RecommendBoardItem item = recommendBoardObj.getItem();
        String h_src = null;
        addition.addProperty("app_id", (item == null || (game2 = item.getGame()) == null) ? null : game2.getAppid());
        JsonObject addition2 = pathSrcNodeCopyToPathNode.getAddition();
        RecommendBoardItem item2 = recommendBoardObj.getItem();
        if (item2 != null && (game = item2.getGame()) != null) {
            h_src = game.getH_src();
        }
        addition2.addProperty("h_src", h_src);
        r(shownList, pathSrcNodeCopyToPathNode);
    }

    @dl.d
    public final RecommendVHBParam v() {
        return this.f86044g;
    }
}
