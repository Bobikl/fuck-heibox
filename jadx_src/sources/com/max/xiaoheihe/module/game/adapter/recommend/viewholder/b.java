package com.max.xiaoheihe.module.game.adapter.recommend.viewholder;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcommon.base.adapter.l;
import com.max.hbcommon.base.adapter.s;
import com.max.hbcustomview.CustomHorizontalScrollView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbcustomview.video.VideoViewX;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
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
import com.max.xiaoheihe.bean.mall.RecommendBoardItem;
import com.max.xiaoheihe.bean.recommend.GeneralGameObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.game.z;
import com.max.xiaoheihe.utils.e0;
import com.max.xiaoheihe.utils.i0;
import com.max.xiaoheihe.utils.imageviewer.ImageViewerHelper;
import com.max.xiaoheihe.view.n;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.Constants;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.sv;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;
import kotlin.text.u;

/* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nRecommentBoradMultiViewHolder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RecommentBoradMultiViewHolder.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/viewholder/RecommentBoradMultiViewHolder\n+ 2 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,554:1\n37#2,2:555\n*S KotlinDebug\n*F\n+ 1 RecommentBoradMultiViewHolder.kt\ncom/max/xiaoheihe/module/game/adapter/recommend/viewholder/RecommentBoradMultiViewHolder\n*L\n357#1:555,2\n*E\n"})
@o(parameters = 0)
public class b extends com.max.hbcommon.base.adapter.g {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final int f86304p = 8;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @dl.d
    private sv f86305j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @dl.d
    private BannerViewPager<GameScreenshotObj> f86306k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @dl.d
    private FrameLayout f86307l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @dl.d
    private SliceGradeView f86308m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public PlainVideoUI f86309n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @dl.e
    private AbsVideoView f86310o;

    /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
    public static final class a extends ViewPager2.OnPageChangeCallback {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
        public void onPageSelected(int i10) {
            if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36190, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
                return;
            }
            super.onPageSelected(i10);
            AbsVideoView absVideoViewD = b.this.D();
            if (absVideoViewD != null) {
                absVideoViewD.setTag(Integer.valueOf(i10));
            }
            b.this.B().setVisibility(0);
        }
    }

    /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.viewholder.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
    public static final class ViewOnAttachStateChangeListenerC0783b implements View.OnAttachStateChangeListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoViewX f86312b;

        ViewOnAttachStateChangeListenerC0783b(VideoViewX videoViewX) {
            this.f86312b = videoViewX;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(@dl.d View v10) {
            if (PatchProxy.proxy(new Object[]{v10}, this, changeQuickRedirect, false, 36191, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(v10, "v");
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(@dl.d View v10) {
            if (PatchProxy.proxy(new Object[]{v10}, this, changeQuickRedirect, false, 36192, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(v10, "v");
            if (this.f86312b.G()) {
                this.f86312b.K();
            }
        }
    }

    /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
    public static final class c implements xe.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoViewX f86314b;

        /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f86315a;

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
                f86315a = iArr;
            }
        }

        c(VideoViewX videoViewX) {
            this.f86314b = videoViewX;
        }

        @Override // xe.a
        public void a(@dl.d PlaybackState state) {
            if (PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 36193, new Class[]{PlaybackState.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(state, "state");
            int i10 = a.f86315a[state.ordinal()];
            if (i10 == 1) {
                b.this.B().setVisibility(8);
                this.f86314b.setVisibility(0);
            } else {
                if (i10 != 2) {
                    return;
                }
                this.f86314b.setVisibility(8);
                b.this.B().setVisibility(0);
                b.this.B().bringToFront();
            }
        }
    }

    /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
    public static final class d implements xe.a {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ VideoViewX f86316a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f86317b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ s.e f86318c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ RecommendBoardItem f86319d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ PlainVideoUI f86320e;

        /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
        public final /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f86321a;

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
                f86321a = iArr;
            }
        }

        d(VideoViewX videoViewX, b bVar, s.e eVar, RecommendBoardItem recommendBoardItem, PlainVideoUI plainVideoUI) {
            this.f86316a = videoViewX;
            this.f86317b = bVar;
            this.f86318c = eVar;
            this.f86319d = recommendBoardItem;
            this.f86320e = plainVideoUI;
        }

        @Override // xe.a
        public void a(@dl.d PlaybackState state) {
            if (PatchProxy.proxy(new Object[]{state}, this, changeQuickRedirect, false, 36194, new Class[]{PlaybackState.class}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(state, "state");
            int i10 = a.f86321a[state.ordinal()];
            if (i10 != 1) {
                if (i10 != 2) {
                    return;
                }
                this.f86320e.n(false, 0, 0L);
            } else if (this.f86316a.getTag() != null) {
                this.f86317b.K(this.f86318c, this.f86319d, Integer.parseInt(this.f86316a.getTag().toString()) + 1, true, this.f86316a);
            }
        }
    }

    /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
    public static final class e implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ VideoViewX f86322b;

        e(VideoViewX videoViewX) {
            this.f86322b = videoViewX;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36195, new Class[]{View.class}, Void.TYPE).isSupported && this.f86322b.F()) {
                if (this.f86322b.G()) {
                    this.f86322b.K();
                } else {
                    this.f86322b.M();
                }
            }
        }
    }

    /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
    public static final class f implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        f() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36196, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            b.this.B().setVisibility(0);
        }
    }

    /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
    public static final class g extends com.max.hbcustomview.bannerview.d<GameScreenshotObj> {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Context f86324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f86325g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Object f86326h;

        /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
        public static final class a implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ GameScreenshotObj f86327b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ b f86328c;

            a(GameScreenshotObj gameScreenshotObj, b bVar) {
                this.f86327b = gameScreenshotObj;
                this.f86328c = bVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AbsVideoView absVideoViewD;
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36199, new Class[]{View.class}, Void.TYPE).isSupported || !f0.g(this.f86327b.getType(), GameScreenshotObj.TYPE_MOVIE) || (absVideoViewD = this.f86328c.D()) == null) {
                    return;
                }
                this.f86328c.M(absVideoViewD, this.f86327b);
            }
        }

        /* JADX INFO: renamed from: com.max.xiaoheihe.module.game.adapter.recommend.viewholder.b$g$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
        public static final class ViewOnClickListenerC0784b implements View.OnClickListener {
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f86329b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Context f86330c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ Object f86331d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ GameScreenshotObj f86332e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ ImageView f86333f;

            ViewOnClickListenerC0784b(b bVar, Context context, Object obj, GameScreenshotObj gameScreenshotObj, ImageView imageView) {
                this.f86329b = bVar;
                this.f86330c = context;
                this.f86331d = obj;
                this.f86332e = gameScreenshotObj;
                this.f86333f = imageView;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36200, new Class[]{View.class}, Void.TYPE).isSupported) {
                    return;
                }
                b bVar = this.f86329b;
                Context context = this.f86330c;
                f0.o(context, "context");
                RecommendBoardItem recommendBoardItem = (RecommendBoardItem) this.f86331d;
                GameScreenshotObj gameScreenshotObj = this.f86332e;
                ImageView imgView = this.f86333f;
                f0.o(imgView, "imgView");
                bVar.L(context, recommendBoardItem, gameScreenshotObj, imgView);
            }
        }

        g(Context context, b bVar, Object obj) {
            this.f86324f = context;
            this.f86325g = bVar;
            this.f86326h = obj;
        }

        public void A(@dl.d com.max.hbcustomview.bannerview.e<GameScreenshotObj> holder, @dl.d GameScreenshotObj vpData, int i10, int i11) {
            Object[] objArr = {holder, vpData, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36197, new Class[]{com.max.hbcustomview.bannerview.e.class, GameScreenshotObj.class, cls, cls}, Void.TYPE).isSupported) {
                return;
            }
            f0.p(holder, "holder");
            f0.p(vpData, "vpData");
            View viewFindViewById = holder.findViewById(R.id.vg_play_button);
            ImageView imageView = (ImageView) holder.findViewById(R.id.iv_simple_img);
            int iO = ViewUtils.o(this.f86324f, viewFindViewById);
            Context context = this.f86324f;
            viewFindViewById.setBackground(q.o(context, R.color.text_primary_1_color_alpha50, ViewUtils.h0(context, iO)));
            holder.itemView.setOnClickListener(new a(vpData, this.f86325g));
            if (f0.g(vpData.getType(), GameScreenshotObj.TYPE_MOVIE)) {
                viewFindViewById.setVisibility(0);
            } else {
                viewFindViewById.setVisibility(8);
                imageView.setOnClickListener(new ViewOnClickListenerC0784b(this.f86325g, this.f86324f, this.f86326h, vpData, imageView));
            }
            com.max.hbimage.b.L(vpData.getThumbnail(), imageView, R.drawable.common_default_placeholder_375x210);
        }

        @Override // com.max.hbcustomview.bannerview.d
        public /* bridge */ /* synthetic */ void n(com.max.hbcustomview.bannerview.e<GameScreenshotObj> eVar, GameScreenshotObj gameScreenshotObj, int i10, int i11) {
            Object[] objArr = {eVar, gameScreenshotObj, new Integer(i10), new Integer(i11)};
            ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
            Class cls = Integer.TYPE;
            if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36198, new Class[]{com.max.hbcustomview.bannerview.e.class, Object.class, cls, cls}, Void.TYPE).isSupported) {
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

    /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
    public static final class h implements n {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // com.max.xiaoheihe.view.n
        public void a() {
        }
    }

    /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
    public static final class i implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecommendBoardItem f86334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f86335c;

        i(RecommendBoardItem recommendBoardItem, Context context) {
            this.f86334b = recommendBoardItem;
            this.f86335c = context;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String id2;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36201, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            LinkInfoObj game_comment = this.f86334b.getGame_comment();
            if (com.max.hbcommon.utils.c.u(game_comment != null ? game_comment.getLinkid() : null)) {
                return;
            }
            Context context = this.f86335c;
            RecommendBoardItem recommendBoardItem = this.f86334b;
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
            com.max.xiaoheihe.base.router.b.z0(com.max.xiaoheihe.base.router.b.L(context, h_src, id2, game_type, game_comment2 != null ? game_comment2.getLinkid() : null));
        }
    }

    /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
    public static final class j implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ RecommendBoardItem f86336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Context f86337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f86338d;

        j(RecommendBoardItem recommendBoardItem, Context context, View.OnClickListener onClickListener) {
            this.f86336b = recommendBoardItem;
            this.f86337c = context;
            this.f86338d = onClickListener;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36202, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            GeneralGameObj game = this.f86336b.getGame();
            if (!com.max.hbcommon.utils.c.u(game != null ? game.getAppid() : null)) {
                Context context = this.f86337c;
                GeneralGameObj game2 = this.f86336b.getGame();
                String h_src = game2 != null ? game2.getH_src() : null;
                GeneralGameObj game3 = this.f86336b.getGame();
                String appid = game3 != null ? game3.getAppid() : null;
                GeneralGameObj game4 = this.f86336b.getGame();
                context.startActivity(z.b(context, h_src, appid, game4 != null ? game4.getGame_type() : null, null, i0.m(), i0.j(), null));
            }
            View.OnClickListener onClickListener = this.f86338d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX INFO: compiled from: RecommentBoradMultiViewHolder.kt */
    public static final class k implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Context f86339b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ View.OnClickListener f86340c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ RecommendBoardItem f86341d;

        k(Context context, View.OnClickListener onClickListener, RecommendBoardItem recommendBoardItem) {
            this.f86339b = context;
            this.f86340c = onClickListener;
            this.f86341d = recommendBoardItem;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BBSUserInfoObj user;
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36203, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            Context context = this.f86339b;
            LinkInfoObj game_comment = this.f86341d.getGame_comment();
            com.max.xiaoheihe.base.router.b.T(context, (game_comment == null || (user = game_comment.getUser()) == null) ? null : user.getUserid()).A();
            View.OnClickListener onClickListener = this.f86340c;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@dl.d Context context, @dl.d sv binding) {
        super(binding);
        f0.p(context, "context");
        f0.p(binding, "binding");
        this.f86305j = binding;
        FrameLayout frameLayout = binding.f115716v;
        f0.o(frameLayout, "binding.videoViewContainer");
        this.f86307l = frameLayout;
        BannerViewPager<GameScreenshotObj> bannerViewPager = this.f86305j.f115696b;
        f0.n(bannerViewPager, "null cannot be cast to non-null type com.max.hbcustomview.bannerview.BannerViewPager<com.max.xiaoheihe.bean.game.GameScreenshotObj>");
        this.f86306k = bannerViewPager;
        SliceGradeView sliceGradeView = this.f86305j.f115702h;
        f0.o(sliceGradeView, "binding.sgv");
        this.f86308m = sliceGradeView;
    }

    public static /* synthetic */ void O(b bVar, Context context, s.e eVar, RecommendBoardItem recommendBoardItem, boolean z10, View.OnClickListener onClickListener, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{bVar, context, eVar, recommendBoardItem, new Byte(z10 ? (byte) 1 : (byte) 0), onClickListener, new Integer(i10), obj}, null, changeQuickRedirect, true, 36182, new Class[]{b.class, Context.class, s.e.class, RecommendBoardItem.class, Boolean.TYPE, View.OnClickListener.class, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: refreshRecommendBoard");
        }
        bVar.N(context, eVar, recommendBoardItem, (i10 & 8) != 0 ? true : z10 ? 1 : 0, (i10 & 16) != 0 ? null : onClickListener);
    }

    @dl.d
    public final BannerViewPager<GameScreenshotObj> B() {
        return this.f86306k;
    }

    @dl.d
    public final sv C() {
        return this.f86305j;
    }

    @dl.e
    public final AbsVideoView D() {
        return this.f86310o;
    }

    @dl.d
    public final ImageView E(@dl.d String url, @dl.d Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{url, context}, this, changeQuickRedirect, false, 36183, new Class[]{String.class, Context.class}, ImageView.class);
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

    @dl.d
    public final SliceGradeView F() {
        return this.f86308m;
    }

    @dl.d
    public final PlainVideoUI G() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36178, new Class[0], PlainVideoUI.class);
        if (patchProxyResultProxy.isSupported) {
            return (PlainVideoUI) patchProxyResultProxy.result;
        }
        PlainVideoUI plainVideoUI = this.f86309n;
        if (plainVideoUI != null) {
            return plainVideoUI;
        }
        f0.S("videoUI");
        return null;
    }

    @dl.d
    public final FrameLayout H() {
        return this.f86307l;
    }

    public final void I(@dl.d Context context, @dl.d RecommendBoardItem data) {
        if (PatchProxy.proxy(new Object[]{context, data}, this, changeQuickRedirect, false, 36184, new Class[]{Context.class, RecommendBoardItem.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(data, "data");
        this.f86306k.V(ViewUtils.f(context, 1.5f));
        this.f86306k.c0(ViewUtils.f(context, 6.0f));
        this.f86306k.Z(ViewUtils.f(context, 4.0f));
        this.f86306k.Y(androidx.core.content.res.i.e(context.getResources(), R.color.white_alpha40, null), androidx.core.content.res.i.e(context.getResources(), R.color.white, null));
        this.f86306k.T(false);
        this.f86306k.L(new a());
    }

    public final void J(@dl.d Context context, @dl.d s.e viewHolder, @dl.d RecommendBoardItem data) {
        ze.b bVarA;
        ze.b bVarD;
        if (PatchProxy.proxy(new Object[]{context, viewHolder, data}, this, changeQuickRedirect, false, 36187, new Class[]{Context.class, s.e.class, RecommendBoardItem.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        VideoViewX videoViewX = new VideoViewX(context);
        com.max.video.impl.f fVar = new com.max.video.impl.f(context);
        PlainVideoUI plainVideoUI = new PlainVideoUI(context);
        CountDownTopPanel countDownTopPanel = new CountDownTopPanel(context);
        BasicCenterPanel basicCenterPanel = new BasicCenterPanel(context);
        plainVideoUI.m(countDownTopPanel);
        plainVideoUI.k(basicCenterPanel);
        plainVideoUI.setAlwaysShowTopPanel(true);
        videoViewX.p(plainVideoUI).o(fVar).s(context);
        ze.b gestureHandler = videoViewX.getGestureHandler();
        if (gestureHandler != null && (bVarA = gestureHandler.a()) != null && (bVarD = bVarA.d()) != null) {
            bVarD.c();
        }
        videoViewX.u();
        videoViewX.setVisibility(8);
        videoViewX.setId(R.id.video_view);
        this.f86307l.removeAllViews();
        this.f86307l.addView(videoViewX, new FrameLayout.LayoutParams(-1, -1));
        this.f86310o = videoViewX;
        videoViewX.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC0783b(videoViewX));
        videoViewX.setTargetStateChangeListener(new c(videoViewX));
        videoViewX.setPlaybackStateChangeListener(new d(videoViewX, this, viewHolder, data, plainVideoUI));
        videoViewX.setOnClickListener(new e(videoViewX));
        videoViewX.post(new f());
    }

    public final void K(@dl.d s.e viewHolder, @dl.d RecommendBoardItem data, int i10, boolean z10, @dl.d AbsVideoView videoView) {
        if (PatchProxy.proxy(new Object[]{viewHolder, data, new Integer(i10), new Byte(z10 ? (byte) 1 : (byte) 0), videoView}, this, changeQuickRedirect, false, 36188, new Class[]{s.e.class, RecommendBoardItem.class, Integer.TYPE, Boolean.TYPE, AbsVideoView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        f0.p(videoView, "videoView");
        BannerViewPager bannerViewPager = (BannerViewPager) viewHolder.i(R.id.banner_viewpager);
        GeneralGameObj game = data.getGame();
        List<GameScreenshotObj> screenshots = game != null ? game.getScreenshots() : null;
        if (screenshots == null || screenshots.size() <= 0) {
            return;
        }
        if (i10 >= screenshots.size() || i10 < 0) {
            K(viewHolder, data, 0, false, videoView);
            return;
        }
        GameScreenshotObj gameScreenshotObj = screenshots.get(i10);
        bannerViewPager.setCurrentItem(i10, false);
        if (!f0.g(gameScreenshotObj.getType(), GameScreenshotObj.TYPE_MOVIE)) {
            videoView.setVisibility(8);
            bannerViewPager.setVisibility(0);
            bannerViewPager.bringToFront();
        } else {
            bannerViewPager.setVisibility(8);
            videoView.R();
            videoView.setVideoRes(gameScreenshotObj.getUrl());
            videoView.O();
            videoView.Y();
        }
    }

    public final void L(@dl.d Context context, @dl.d RecommendBoardItem data, @dl.d GameScreenshotObj vpData, @dl.d ImageView imgView) {
        if (PatchProxy.proxy(new Object[]{context, data, vpData, imgView}, this, changeQuickRedirect, false, 36186, new Class[]{Context.class, RecommendBoardItem.class, GameScreenshotObj.class, ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(data, "data");
        f0.p(vpData, "vpData");
        f0.p(imgView, "imgView");
        GeneralGameObj game = data.getGame();
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
                if (f0.g(gameScreenshotObj2.getThumbnail(), vpData.getThumbnail())) {
                    i10 = i11;
                }
                i11++;
                arrayList.add(gameScreenshotObj2.getThumbnail());
            }
        }
        ImageViewerHelper.Companion companion = ImageViewerHelper.f95500a;
        companion.a(context).m(companion.d(imgView, i10), (String[]) arrayList.toArray(new String[0])).d(i10).p();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0065  */
    public final void M(@dl.d AbsVideoView videoView, @dl.d GameScreenshotObj vpData) {
        boolean z10 = false;
        if (PatchProxy.proxy(new Object[]{videoView, vpData}, this, changeQuickRedirect, false, 36185, new Class[]{AbsVideoView.class, GameScreenshotObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(videoView, "videoView");
        f0.p(vpData, "vpData");
        if (f0.g(vpData.getType(), GameScreenshotObj.TYPE_MOVIE)) {
            this.f86306k.setVisibility(8);
            videoView.setVisibility(0);
            if (videoView.F()) {
                com.max.video.player.a player = videoView.getPlayer();
                if (f0.g(player != null ? player.s() : null, vpData.getUrl())) {
                    videoView.M();
                } else {
                    videoView.R();
                    videoView.setVideoRes(vpData.getUrl());
                    videoView.M();
                }
            } else {
                videoView.R();
                videoView.setVideoRes(vpData.getUrl());
                videoView.M();
            }
            VideoPlayerManager videoPlayerManager = VideoPlayerManager.f76079a;
            AbsVideoView absVideoViewM = videoPlayerManager.m();
            if (!f0.g(absVideoViewM, videoView)) {
                if (absVideoViewM != null && absVideoViewM.G()) {
                    z10 = true;
                }
                if (z10) {
                    absVideoViewM.K();
                }
            }
            videoPlayerManager.o(videoView);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:28:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:29:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:32:0x01f5  */
    public final void N(@dl.d Context context, @dl.d s.e viewHolder, @dl.d RecommendBoardItem data, boolean z10, @dl.e View.OnClickListener onClickListener) {
        GeneralGameObj game;
        String vertical_img_fg;
        BBSUserInfoObj user;
        BBSUserInfoObj user2;
        List<String> platforms_icon;
        if (PatchProxy.proxy(new Object[]{context, viewHolder, data, new Byte(z10 ? (byte) 1 : (byte) 0), onClickListener}, this, changeQuickRedirect, false, 36181, new Class[]{Context.class, s.e.class, RecommendBoardItem.class, Boolean.TYPE, View.OnClickListener.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(viewHolder, "viewHolder");
        f0.p(data, "data");
        View viewI = viewHolder.i(R.id.vg_item);
        ImageView imageView = (ImageView) viewHolder.i(R.id.iv_img);
        ImageView imageView2 = (ImageView) viewHolder.i(R.id.iv_mini_img);
        LinearLayout linearLayout = (LinearLayout) viewHolder.i(R.id.vg_platforms);
        TextView textView = (TextView) viewHolder.i(R.id.tv_game_name);
        ImageView imageView3 = (ImageView) viewHolder.i(R.id.iv_avatar);
        TextView textView2 = (TextView) viewHolder.i(R.id.tv_time);
        TextView textView3 = (TextView) viewHolder.i(R.id.tv_username);
        TextView textView4 = (TextView) viewHolder.i(R.id.tv_content);
        ViewGroup viewGroup = (ViewGroup) viewHolder.i(R.id.vg_video);
        CardView cardView = (CardView) viewHolder.i(R.id.vg_header);
        CardView cardView2 = (CardView) viewHolder.i(R.id.vg_score);
        data.setIndex(String.valueOf(viewHolder.getAdapterPosition()));
        int iW = ViewUtils.W(viewI);
        int iF = ViewUtils.f(context, 100.0f);
        ViewUtils.ViewType viewType = ViewUtils.ViewType.IMAGE;
        float fN = ViewUtils.n(context, iW, iF, viewType);
        cardView.setRadius(fN);
        viewI.setBackground(q.s(context, R.color.background_layer_2_color, ViewUtils.h0(context, fN)));
        cardView2.setRadius(ViewUtils.o(context, cardView2));
        if (z10) {
            if (viewHolder.getAbsoluteAdapterPosition() == 0) {
                ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
                f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams).topMargin = ViewUtils.f(context, 4.0f);
                ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = ViewUtils.f(context, 4.0f);
            } else {
                ViewGroup.LayoutParams layoutParams3 = imageView.getLayoutParams();
                f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin = ViewUtils.f(context, 18.0f);
                ViewGroup.LayoutParams layoutParams4 = viewGroup.getLayoutParams();
                f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin = ViewUtils.f(context, 18.0f);
            }
            textView4.setPadding(textView4.getPaddingLeft(), textView4.getPaddingTop(), textView4.getPaddingRight(), ViewUtils.f(context, 14.0f));
        } else {
            ViewGroup.LayoutParams layoutParams5 = imageView.getLayoutParams();
            f0.n(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin = 0;
            ViewGroup.LayoutParams layoutParams6 = viewGroup.getLayoutParams();
            f0.n(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = 0;
            textView4.setPadding(textView4.getPaddingLeft(), textView4.getPaddingTop(), textView4.getPaddingRight(), 0);
        }
        I(context, data);
        GeneralGameObj game2 = data.getGame();
        if (com.max.hbcommon.utils.c.u(game2 != null ? game2.getVertical_img_fg() : null)) {
            game = data.getGame();
            if (game != null) {
                vertical_img_fg = game.getVertical_img_fg();
            } else {
                vertical_img_fg = null;
            }
            if (!com.max.hbcommon.utils.c.u(vertical_img_fg)) {
                imageView2.setVisibility(8);
                GeneralGameObj game3 = data.getGame();
                f0.m(game3);
                com.max.hbimage.b.K(game3.getVertical_img_fg(), imageView);
            }
        } else {
            GeneralGameObj game4 = data.getGame();
            if (com.max.hbcommon.utils.c.u(game4 != null ? game4.getVertical_img_bg() : null)) {
                game = data.getGame();
                if (game != null) {
                    vertical_img_fg = game.getVertical_img_fg();
                } else {
                    vertical_img_fg = null;
                }
                if (!com.max.hbcommon.utils.c.u(vertical_img_fg)) {
                    imageView2.setVisibility(8);
                    GeneralGameObj game5 = data.getGame();
                    f0.m(game5);
                    com.max.hbimage.b.K(game5.getVertical_img_fg(), imageView);
                }
            } else {
                imageView2.setVisibility(0);
                GeneralGameObj game6 = data.getGame();
                f0.m(game6);
                com.max.hbimage.b.K(game6.getVertical_img_bg(), imageView);
                int iN = ViewUtils.n(context, ViewUtils.W(imageView2), ViewUtils.V(imageView2), viewType);
                GeneralGameObj game7 = data.getGame();
                f0.m(game7);
                com.max.hbimage.b.d0(game7.getVertical_img_fg(), imageView2, iN);
            }
        }
        j jVar = new j(data, context, onClickListener);
        imageView.setOnClickListener(jVar);
        imageView2.setOnClickListener(jVar);
        textView.setOnClickListener(jVar);
        cardView2.setOnClickListener(jVar);
        k kVar = new k(context, onClickListener, data);
        imageView3.setOnClickListener(kVar);
        textView3.setOnClickListener(kVar);
        textView2.setOnClickListener(kVar);
        GeneralGameObj game8 = data.getGame();
        textView.setText(game8 != null ? game8.getName() : null);
        linearLayout.removeAllViews();
        GeneralGameObj game9 = data.getGame();
        if (game9 != null && (platforms_icon = game9.getPlatforms_icon()) != null) {
            for (String platform : platforms_icon) {
                f0.o(platform, "platform");
                linearLayout.addView(E(platform, context));
            }
        }
        LinkInfoObj game_comment = data.getGame_comment();
        com.max.hbimage.b.I((game_comment == null || (user2 = game_comment.getUser()) == null) ? null : user2.getAvatar(), imageView3, R.drawable.common_default_avatar_40x40);
        LinkInfoObj game_comment2 = data.getGame_comment();
        textView2.setText(game_comment2 != null ? game_comment2.getPlay_state() : null);
        LinkInfoObj game_comment3 = data.getGame_comment();
        textView3.setText((game_comment3 == null || (user = game_comment3.getUser()) == null) ? null : user.getUsername());
        LinkInfoObj game_comment4 = data.getGame_comment();
        if (!com.max.hbcommon.utils.c.u(game_comment4 != null ? game_comment4.getText() : null)) {
            LinkInfoObj game_comment5 = data.getGame_comment();
            String text = game_comment5 != null ? game_comment5.getText() : null;
            f0.m(text);
            if (u.v2(text, Constants.ARRAY_TYPE, false, 2, null)) {
                LinkInfoObj game_comment6 = data.getGame_comment();
                String text2 = game_comment6 != null ? game_comment6.getText() : null;
                f0.m(text2);
                if (u.K1(text2, "]", false, 2, null)) {
                    LinkInfoObj game_comment7 = data.getGame_comment();
                    e0.b(textView4, e0.k(((BBSTextObj) com.max.hbutils.utils.k.b(game_comment7 != null ? game_comment7.getText() : null, BBSTextObj.class).get(0)).getText()), new h(), false, 3);
                    textView4.setOnClickListener(new i(data, context));
                }
            }
        }
        GeneralGameObj game10 = data.getGame();
        String score_desc = game10 != null ? game10.getScore_desc() : null;
        GeneralGameObj game11 = data.getGame();
        String score = game11 != null ? game11.getScore() : null;
        GeneralGameObj game12 = data.getGame();
        String expect_num = game12 != null ? game12.getExpect_num() : null;
        GeneralGameObj game13 = data.getGame();
        r1.R1(viewHolder, score_desc, score, expect_num, game13 != null ? game13.getScore_comment() : null);
        viewHolder.itemView.setTag(data);
    }

    public final void P(@dl.d BannerViewPager<GameScreenshotObj> bannerViewPager) {
        if (PatchProxy.proxy(new Object[]{bannerViewPager}, this, changeQuickRedirect, false, 36175, new Class[]{BannerViewPager.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(bannerViewPager, "<set-?>");
        this.f86306k = bannerViewPager;
    }

    public final void Q(@dl.d sv svVar) {
        if (PatchProxy.proxy(new Object[]{svVar}, this, changeQuickRedirect, false, 36174, new Class[]{sv.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(svVar, "<set-?>");
        this.f86305j = svVar;
    }

    public final void R(@dl.e AbsVideoView absVideoView) {
        this.f86310o = absVideoView;
    }

    public final void S(@dl.d SliceGradeView sliceGradeView) {
        if (PatchProxy.proxy(new Object[]{sliceGradeView}, this, changeQuickRedirect, false, 36177, new Class[]{SliceGradeView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(sliceGradeView, "<set-?>");
        this.f86308m = sliceGradeView;
    }

    public final void T(@dl.d PlainVideoUI plainVideoUI) {
        if (PatchProxy.proxy(new Object[]{plainVideoUI}, this, changeQuickRedirect, false, 36179, new Class[]{PlainVideoUI.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(plainVideoUI, "<set-?>");
        this.f86309n = plainVideoUI;
    }

    public final void U(@dl.d FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, 36176, new Class[]{FrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(frameLayout, "<set-?>");
        this.f86307l = frameLayout;
    }

    @Override // com.max.hbcommon.base.adapter.g
    public void v(@dl.d Context context, @dl.d s<?> adapter, @dl.d s.e viewHolder, @dl.e Object obj) {
        String score;
        if (PatchProxy.proxy(new Object[]{context, adapter, viewHolder, obj}, this, changeQuickRedirect, false, 36189, new Class[]{Context.class, s.class, s.e.class, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        f0.p(viewHolder, "viewHolder");
        Context context2 = viewHolder.itemView.getContext();
        if (context2 == null) {
            return;
        }
        super.v(context2, adapter, viewHolder, obj);
        if (obj instanceof RecommendBoardItem) {
            SliceGradeView sliceGradeView = this.f86308m;
            RecommendBoardItem recommendBoardItem = (RecommendBoardItem) obj;
            LinkInfoObj game_comment = recommendBoardItem.getGame_comment();
            sliceGradeView.setGrade((game_comment == null || (score = game_comment.getScore()) == null) ? 0 : (int) Float.parseFloat(score));
            this.f86308m.setEnableSlide(false);
            J(context2, viewHolder, recommendBoardItem);
            this.f86306k.j0(((AppCompatActivity) context2).getLifecycle()).R(new g(context2, this, obj)).k();
            BannerViewPager<GameScreenshotObj> bannerViewPager = this.f86306k;
            GeneralGameObj game = recommendBoardItem.getGame();
            f0.m(game);
            bannerViewPager.J(game.getScreenshots());
            this.f86306k.S(false);
        }
    }

    @Override // com.max.hbcommon.base.adapter.g
    @dl.e
    public Pair<l, RecyclerView> x(@dl.d Context context, @dl.d s<?> adapter, @dl.d s.e viewHolder, @dl.e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, adapter, viewHolder, obj}, this, changeQuickRedirect, false, 36180, new Class[]{Context.class, s.class, s.e.class, Object.class}, Pair.class);
        if (patchProxyResultProxy.isSupported) {
            return (Pair) patchProxyResultProxy.result;
        }
        f0.p(context, "context");
        f0.p(adapter, "adapter");
        f0.p(viewHolder, "viewHolder");
        super.x(context, adapter, viewHolder, obj);
        if (!(obj instanceof RecommendBoardItem)) {
            return null;
        }
        viewHolder.itemView.getLayoutParams().width = ViewUtils.L(context) - ViewUtils.f(context, 40.0f);
        RecommendBoardItem recommendBoardItem = (RecommendBoardItem) obj;
        N(context, viewHolder, recommendBoardItem, false, null);
        CustomHorizontalScrollView customHorizontalScrollView = (CustomHorizontalScrollView) viewHolder.i(R.id.vg_tags);
        List<RichAttributeModelObj> rich_text_labels = recommendBoardItem.getRich_text_labels();
        if (rich_text_labels == null) {
            return null;
        }
        r1.N1(customHorizontalScrollView, rich_text_labels, fi.u.u(ViewUtils.L(context) - ViewUtils.f(context, 60.0f), 0));
        return null;
    }
}
