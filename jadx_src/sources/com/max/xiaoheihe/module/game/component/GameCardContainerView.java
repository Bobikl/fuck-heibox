package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.video.AbsVideoView;
import com.max.video.impl.CountDownV2TopPanel;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoMovieObj;
import com.max.xiaoheihe.bean.game.recommend.GameCardVideoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameCardContainerView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameCardContainerView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameCardContainerView.kt\ncom/max/xiaoheihe/module/game/component/GameCardContainerView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,266:1\n262#2,2:267\n262#2,2:269\n168#2,2:271\n168#2,2:273\n*S KotlinDebug\n*F\n+ 1 GameCardContainerView.kt\ncom/max/xiaoheihe/module/game/component/GameCardContainerView\n*L\n120#1:267,2\n123#1:269,2\n216#1:271,2\n230#1:273,2\n*E\n"})
@o(parameters = 0)
public class GameCardContainerView extends CardView {
    public static final int C = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private final float A;
    private final float B;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public RelativeLayout f86638k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f86639l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f86640m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ImageView f86641n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f86642o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public FrameLayout f86643p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public View f86644q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public View f86645r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public ViewGroup f86646s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public CardView f86647t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public ImageView f86648u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ViewGroup f86649v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @e
    private Type f86650w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @d
    private SizeType f86651x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final float f86652y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final float f86653z;

    /* JADX INFO: compiled from: GameCardContainerView.kt */
    public enum SizeType {
        MIDDLE,
        SMALL;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static SizeType valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36416, new Class[]{String.class}, SizeType.class);
            return (SizeType) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(SizeType.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static SizeType[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36415, new Class[0], SizeType[].class);
            return (SizeType[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: GameCardContainerView.kt */
    public enum Type {
        NORMAL,
        BORDER;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36418, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36417, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: GameCardContainerView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86654a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f86655b;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.BORDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f86654a = iArr;
            int[] iArr2 = new int[SizeType.valuesCustom().length];
            try {
                iArr2[SizeType.MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[SizeType.SMALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f86655b = iArr2;
        }
    }

    public GameCardContainerView(@e Context context) {
        this(context, null);
    }

    public GameCardContainerView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameCardContainerView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        this.f86650w = Type.NORMAL;
        this.f86651x = SizeType.SMALL;
        this.f86652y = 62.0f;
        this.f86653z = 60.0f;
        this.A = 27.0f;
        this.B = 33.0f;
        j();
    }

    @d
    public final CardView getCard_video_container() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36397, new Class[0], CardView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardView) patchProxyResultProxy.result;
        }
        CardView cardView = this.f86647t;
        if (cardView != null) {
            return cardView;
        }
        f0.S("card_video_container");
        return null;
    }

    @d
    public final ImageView getIv_bg() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36381, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86639l;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_bg");
        return null;
    }

    @d
    public final ImageView getIv_label() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36385, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86641n;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_label");
        return null;
    }

    @d
    public final ImageView getIv_video_play() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36399, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86648u;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_video_play");
        return null;
    }

    @d
    public final TextView getTv_left_top_label() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36387, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86642o;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_left_top_label");
        return null;
    }

    @d
    public final View getV_gradient() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36391, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86644q;
        if (view != null) {
            return view;
        }
        f0.S("v_gradient");
        return null;
    }

    @d
    public final View getV_pure_color() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36393, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86645r;
        if (view != null) {
            return view;
        }
        f0.S("v_pure_color");
        return null;
    }

    @d
    public final FrameLayout getVg_bottom_container() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36389, new Class[0], FrameLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (FrameLayout) patchProxyResultProxy.result;
        }
        FrameLayout frameLayout = this.f86643p;
        if (frameLayout != null) {
            return frameLayout;
        }
        f0.S("vg_bottom_container");
        return null;
    }

    @d
    public final RelativeLayout getVg_container() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36379, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f86638k;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("vg_container");
        return null;
    }

    @d
    public final ViewGroup getVg_content() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36401, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f86649v;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_content");
        return null;
    }

    @d
    public final LinearLayout getVg_label() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36383, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86640m;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("vg_label");
        return null;
    }

    @d
    public final ViewGroup getVg_video_thump() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36395, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f86646s;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_video_thump");
        return null;
    }

    @d
    public final AbsVideoView getVideo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36412, new Class[0], AbsVideoView.class);
        if (patchProxyResultProxy.isSupported) {
            return (AbsVideoView) patchProxyResultProxy.result;
        }
        View childAt = getCard_video_container().getChildAt(0);
        f0.n(childAt, "null cannot be cast to non-null type com.max.video.AbsVideoView");
        return (AbsVideoView) childAt;
    }

    public final void h(@d AbsVideoView video) {
        if (PatchProxy.proxy(new Object[]{video}, this, changeQuickRedirect, false, 36409, new Class[]{AbsVideoView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(video, "video");
        getCard_video_container().removeAllViews();
        getCard_video_container().addView(video, new ViewGroup.LayoutParams(-1, -1));
    }

    public final boolean i() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36411, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return getCard_video_container().getChildCount() > 0;
    }

    public void j() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36403, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setRadius(ViewUtils.f(getContext(), 6.0f));
        setCardElevation(0.0f);
        super.setCardBackgroundColor(getContext().getResources().getColor(R.color.transparent));
        View.inflate(getContext(), R.layout.view_game_card_container, this);
        View viewFindViewById = findViewById(R.id.vg_container);
        f0.o(viewFindViewById, "findViewById(R.id.vg_container)");
        setVg_container((RelativeLayout) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.iv_bg);
        f0.o(viewFindViewById2, "findViewById(R.id.iv_bg)");
        setIv_bg((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.vg_label);
        f0.o(viewFindViewById3, "findViewById(R.id.vg_label)");
        setVg_label((LinearLayout) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.iv_label);
        f0.o(viewFindViewById4, "findViewById(R.id.iv_label)");
        setIv_label((ImageView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_left_top_label);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_left_top_label)");
        setTv_left_top_label((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.vg_bottom_container);
        f0.o(viewFindViewById6, "findViewById(R.id.vg_bottom_container)");
        setVg_bottom_container((FrameLayout) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.v_gradient);
        f0.o(viewFindViewById7, "findViewById(R.id.v_gradient)");
        setV_gradient(viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.v_pure_color);
        f0.o(viewFindViewById8, "findViewById(R.id.v_pure_color)");
        setV_pure_color(viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.vg_video_thump);
        f0.o(viewFindViewById9, "findViewById(R.id.vg_video_thump)");
        setVg_video_thump((ViewGroup) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.card_video_container);
        f0.o(viewFindViewById10, "findViewById(R.id.card_video_container)");
        setCard_video_container((CardView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.iv_video_play);
        f0.o(viewFindViewById11, "findViewById(R.id.iv_video_play)");
        setIv_video_play((ImageView) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.vg_content);
        f0.o(viewFindViewById12, "findViewById(R.id.vg_content)");
        setVg_content((ViewGroup) viewFindViewById12);
        int iF = ViewUtils.f(getContext(), 3.0f);
        getVg_container().setPadding(iF, iF, iF, iF);
    }

    public final void k() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36410, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getCard_video_container().removeAllViews();
    }

    public final void l(@e GameCardVideoObj gameCardVideoObj, boolean z10) {
        GameCardVideoMovieObj movie;
        AbsVideoView video;
        GameCardVideoMovieObj movie2;
        if (PatchProxy.proxy(new Object[]{gameCardVideoObj, new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36408, new Class[]{GameCardVideoObj.class, Boolean.TYPE}, Void.TYPE).isSupported || gameCardVideoObj == null || (movie = gameCardVideoObj.getMovie()) == null) {
            return;
        }
        if (i()) {
            video = getVideo();
        } else {
            com.max.xiaoheihe.module.game.adapter.recommend.binder.e.a aVar = com.max.xiaoheihe.module.game.adapter.recommend.binder.e.f86098i;
            Context context = getContext();
            f0.o(context, "context");
            video = aVar.e(context);
        }
        com.max.xiaoheihe.module.game.adapter.recommend.binder.e.a aVar2 = com.max.xiaoheihe.module.game.adapter.recommend.binder.e.f86098i;
        GameCardVideoObj gameCardVideoObj2 = (GameCardVideoObj) video.getTag(aVar2.d());
        if (gameCardVideoObj2 != null && !z10) {
            GameCardVideoMovieObj movie3 = gameCardVideoObj2.getMovie();
            if (f0.g(movie3 != null ? movie3.getMovie_url() : null, movie.getMovie_url()) && (movie.isPlaying() || movie.isCompleted())) {
                return;
            }
        }
        if (!i()) {
            ViewParent parent = video.getParent();
            if (parent != null) {
                f0.o(parent, "parent");
                ((ViewGroup) parent).removeView(video);
            }
            h(video);
        }
        if (f0.g((gameCardVideoObj2 == null || (movie2 = gameCardVideoObj2.getMovie()) == null) ? null : movie2.getMovie_url(), movie.getMovie_url()) && gameCardVideoObj2 != null && (!z10 || !movie.isCompleted())) {
            video.H();
            video.Y();
            return;
        }
        if (video.G()) {
            video.Z();
        }
        Context context2 = getContext();
        f0.o(context2, "context");
        video.S(context2);
        int iP = (int) n.p(movie.getMovie_end_time());
        ze.d ui2 = video.getUi();
        CountDownV2TopPanel countDownV2TopPanel = (CountDownV2TopPanel) (ui2 != null ? ui2.getPanelTop() : null);
        if (countDownV2TopPanel != null) {
            if (iP <= ((int) n.p(movie.getMovie_start_time()))) {
                iP = -1;
            }
            countDownV2TopPanel.setLimitedTime(iP);
        }
        video.setTag(aVar2.d(), gameCardVideoObj);
        video.setVideoRes(movie.getMovie_url());
        if (com.max.hbcommon.utils.c.u(movie.getMovie_start_time())) {
            video.O();
        } else {
            video.P((int) n.p(movie.getMovie_start_time()));
        }
        video.H();
        video.Y();
    }

    @Override // android.view.View
    public void setBackground(@e Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, 36405, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        getVg_container().setBackground(drawable);
    }

    public final void setBackgroundGradientColor(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36404, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setBackground(ViewUtils.x(0, i10, i11));
    }

    public final void setCard_video_container(@d CardView cardView) {
        if (PatchProxy.proxy(new Object[]{cardView}, this, changeQuickRedirect, false, 36398, new Class[]{CardView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cardView, "<set-?>");
        this.f86647t = cardView;
    }

    public final void setGradientColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36414, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getV_gradient().setBackground(ViewUtils.P(0, com.max.xiaoheihe.utils.d.I(0.0f, i10), i10));
        getV_pure_color().setBackgroundColor(i10);
    }

    public final void setIv_bg(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36382, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86639l = imageView;
    }

    public final void setIv_label(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36386, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86641n = imageView;
    }

    public final void setIv_video_play(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36400, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86648u = imageView;
    }

    public final void setLabelBackGroundGradientColor(int i10, int i11) {
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36406, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        getVg_label().setBackground(q.k(getContext(), i10, i11, GradientDrawable.Orientation.TL_BR, new float[]{0.0f, 0.0f, 0.0f, 0.0f, 6.0f, 6.0f, 0.0f, 0.0f}));
    }

    public final void setLabelText(@e String str, @e String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 36407, new Class[]{String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_left_top_label().setText(str);
        if (com.max.hbcommon.utils.c.u(str2)) {
            getIv_label().setVisibility(8);
        } else {
            getIv_label().setVisibility(0);
            com.max.hbimage.b.K(str2, getIv_label());
        }
    }

    public final void setTv_left_top_label(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36388, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86642o = textView;
    }

    public final void setType(@d Type type, @d SizeType sizeType) {
        int iC;
        int iC2 = 0;
        if (PatchProxy.proxy(new Object[]{type, sizeType}, this, changeQuickRedirect, false, 36413, new Class[]{Type.class, SizeType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        f0.p(sizeType, "sizeType");
        this.f86650w = type;
        this.f86651x = sizeType;
        int i10 = a.f86654a[type.ordinal()];
        if (i10 == 1) {
            getVg_container().setPadding(0, 0, 0, 0);
            int iF = ViewUtils.f(getContext(), 12.0f);
            ViewGroup.LayoutParams layoutParams = getVg_bottom_container().getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
            marginLayoutParams.leftMargin = iF;
            marginLayoutParams.rightMargin = iF;
            marginLayoutParams.bottomMargin = iF;
            getVg_label().setGravity(17);
            ViewGroup.LayoutParams layoutParams2 = getVg_label().getLayoutParams();
            Context context = getContext();
            f0.o(context, "context");
            layoutParams2.height = l.c(21.0f, context);
            Context context2 = getContext();
            f0.o(context2, "context");
            int iC3 = l.c(7.0f, context2);
            getVg_label().setPadding(iC3, 0, iC3, 0);
        } else if (i10 == 2) {
            int iF2 = ViewUtils.f(getContext(), 3.0f);
            getVg_container().setPadding(iF2, iF2, iF2, iF2);
            int iF3 = ViewUtils.f(getContext(), 9.0f);
            ViewGroup.LayoutParams layoutParams3 = getVg_bottom_container().getLayoutParams();
            f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3;
            marginLayoutParams2.leftMargin = iF3;
            marginLayoutParams2.rightMargin = iF3;
            marginLayoutParams2.bottomMargin = iF3;
            getVg_label().setGravity(17);
            ViewGroup.LayoutParams layoutParams4 = getVg_label().getLayoutParams();
            Context context3 = getContext();
            f0.o(context3, "context");
            layoutParams4.height = l.c(19.0f, context3);
            LinearLayout vg_label = getVg_label();
            Context context4 = getContext();
            f0.o(context4, "context");
            int iC4 = l.c(4.0f, context4);
            Context context5 = getContext();
            f0.o(context5, "context");
            int iC5 = l.c(7.0f, context5);
            Context context6 = getContext();
            f0.o(context6, "context");
            vg_label.setPadding(iC4, 0, iC5, l.c(3.0f, context6));
        }
        int i11 = a.f86655b[sizeType.ordinal()];
        if (i11 == 1) {
            float f10 = this.f86652y;
            Context context7 = getContext();
            f0.o(context7, "context");
            iC2 = l.c(f10, context7);
            float f11 = this.A;
            Context context8 = getContext();
            f0.o(context8, "context");
            iC = l.c(f11, context8);
        } else if (i11 != 2) {
            iC = 0;
        } else {
            float f12 = this.f86653z;
            Context context9 = getContext();
            f0.o(context9, "context");
            iC2 = l.c(f12, context9);
            float f13 = this.B;
            Context context10 = getContext();
            f0.o(context10, "context");
            iC = l.c(f13, context10);
        }
        getV_gradient().getLayoutParams().height = iC2;
        getV_pure_color().getLayoutParams().height = iC;
        ViewGroup.LayoutParams layoutParams5 = getVg_content().getLayoutParams();
        f0.n(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin = iC;
        invalidate();
    }

    public final void setV_gradient(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36392, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86644q = view;
    }

    public final void setV_pure_color(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36394, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86645r = view;
    }

    public final void setVg_bottom_container(@d FrameLayout frameLayout) {
        if (PatchProxy.proxy(new Object[]{frameLayout}, this, changeQuickRedirect, false, 36390, new Class[]{FrameLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(frameLayout, "<set-?>");
        this.f86643p = frameLayout;
    }

    public final void setVg_container(@d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 36380, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f86638k = relativeLayout;
    }

    public final void setVg_content(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 36402, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f86649v = viewGroup;
    }

    public final void setVg_label(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36384, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86640m = linearLayout;
    }

    public final void setVg_video_thump(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 36396, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f86646s = viewGroup;
    }
}
