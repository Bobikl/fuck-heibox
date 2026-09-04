package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.e0;
import com.max.xiaoheihe.view.BoxAutoPlayView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Arrays;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.v0;

/* JADX INFO: compiled from: GameTimeAchieveItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameTimeAchieveItemView extends RelativeLayout {

    @e
    private static String B;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public CardView f86833b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f86834c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ViewGroup f86835d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f86836e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f86837f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ProgressBar f86838g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextView f86839h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public TextView f86840i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public LinearLayout f86841j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f86842k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public ImageView f86843l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public BoxAutoPlayView f86844m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public GameRateStarView f86845n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f86846o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f86847p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f86848q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f86849r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f86850s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ImageView f86851t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f86852u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public TextView f86853v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public ViewGroup f86854w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public ImageView f86855x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @d
    private Type f86856y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @d
    public static final a f86832z = new a(null);
    public static final int A = 8;

    /* JADX INFO: compiled from: GameTimeAchieveItemView.kt */
    public enum Type {
        Normal,
        Achievement,
        GameRate,
        Comment;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36767, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36766, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: GameTimeAchieveItemView.kt */
    public static final class a {
        public static ChangeQuickRedirect changeQuickRedirect;

        private a() {
        }

        public /* synthetic */ a(u uVar) {
            this();
        }

        @e
        public final String a() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36764, new Class[0], String.class);
            return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : GameTimeAchieveItemView.B;
        }

        public final void b(@e String str) {
            if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36765, new Class[]{String.class}, Void.TYPE).isSupported) {
                return;
            }
            GameTimeAchieveItemView.B = str;
        }
    }

    /* JADX INFO: compiled from: GameTimeAchieveItemView.kt */
    public final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86857a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.Achievement.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.GameRate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Type.Comment.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f86857a = iArr;
        }
    }

    public GameTimeAchieveItemView(@e Context context) {
        this(context, null);
    }

    public GameTimeAchieveItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameTimeAchieveItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameTimeAchieveItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f86856y = Type.Normal;
        c();
    }

    private final void c() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36751, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View.inflate(getContext(), R.layout.view_game_time_achieve_item, this);
        View viewInflate = View.inflate(getContext(), R.layout.divider, null);
        f0.o(viewInflate, "inflate(context, R.layout.divider, null)");
        setVg_divider(viewInflate);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 0.5f));
        layoutParams.addRule(12);
        layoutParams.addRule(3, R.id.vg_game_content);
        layoutParams.leftMargin = ViewUtils.f(getContext(), 140.0f);
        layoutParams.rightMargin = ViewUtils.f(getContext(), 10.0f);
        addView(getVg_divider(), layoutParams);
        View viewFindViewById = findViewById(R.id.cv_img);
        f0.o(viewFindViewById, "findViewById(R.id.cv_img)");
        setCv_img((CardView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.iv_icon);
        f0.o(viewFindViewById2, "findViewById(R.id.iv_icon)");
        setIv_game_icon((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.vg_online_num);
        f0.o(viewFindViewById3, "findViewById(R.id.vg_online_num)");
        setVg_online_num((ViewGroup) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_online_num);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_online_num)");
        setTv_online_num((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_name);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_name)");
        setTv_game_name((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.pb_achievement);
        f0.o(viewFindViewById6, "findViewById(R.id.pb_achievement)");
        setPb_achievement((ProgressBar) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.tv_playtime_forever);
        f0.o(viewFindViewById7, "findViewById(R.id.tv_playtime_forever)");
        setTv_playtime_forever((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.tv_special_time);
        f0.o(viewFindViewById8, "findViewById(R.id.tv_special_time)");
        setTv_special_time((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.tv_achievement);
        f0.o(viewFindViewById9, "findViewById(R.id.tv_achievement)");
        setTv_achievement((TextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.iv_prefect_achievement);
        f0.o(viewFindViewById10, "findViewById(R.id.iv_prefect_achievement)");
        setIv_prefect_achievement((ImageView) viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.vg_achievement);
        f0.o(viewFindViewById11, "findViewById(R.id.vg_achievement)");
        setVg_achievement((LinearLayout) viewFindViewById11);
        View viewFindViewById12 = findViewById(R.id.view_online);
        f0.o(viewFindViewById12, "findViewById(R.id.view_online)");
        setView_online(viewFindViewById12);
        View viewFindViewById13 = findViewById(R.id.bv_bg);
        f0.o(viewFindViewById13, "findViewById(R.id.bv_bg)");
        setBv_bg((BoxAutoPlayView) viewFindViewById13);
        View viewFindViewById14 = findViewById(R.id.grsv);
        f0.o(viewFindViewById14, "findViewById(R.id.grsv)");
        setGrsv((GameRateStarView) viewFindViewById14);
        View viewFindViewById15 = findViewById(R.id.vg_psn_trophy);
        f0.o(viewFindViewById15, "findViewById(R.id.vg_psn_trophy)");
        setVg_psn_trophy((LinearLayout) viewFindViewById15);
        View viewFindViewById16 = findViewById(R.id.tv_gold);
        f0.o(viewFindViewById16, "findViewById(R.id.tv_gold)");
        setTv_gold((TextView) viewFindViewById16);
        View viewFindViewById17 = findViewById(R.id.tv_silver);
        f0.o(viewFindViewById17, "findViewById(R.id.tv_silver)");
        setTv_silver((TextView) viewFindViewById17);
        View viewFindViewById18 = findViewById(R.id.tv_bronze);
        f0.o(viewFindViewById18, "findViewById(R.id.tv_bronze)");
        setTv_bronze((TextView) viewFindViewById18);
        View viewFindViewById19 = findViewById(R.id.iv_special_icon);
        f0.o(viewFindViewById19, "findViewById(R.id.iv_special_icon)");
        setIv_special_icon((ImageView) viewFindViewById19);
        View viewFindViewById20 = findViewById(R.id.tv_goto_comment);
        f0.o(viewFindViewById20, "findViewById(R.id.tv_goto_comment)");
        setTv_goto_comment((TextView) viewFindViewById20);
        View viewFindViewById21 = findViewById(R.id.vg_not_owned);
        f0.o(viewFindViewById21, "findViewById(R.id.vg_not_owned)");
        setVg_not_owned((ViewGroup) viewFindViewById21);
        View viewFindViewById22 = findViewById(R.id.iv_not_owned_help);
        f0.o(viewFindViewById22, "findViewById(R.id.iv_not_owned_help)");
        setIv_not_owned_help((ImageView) viewFindViewById22);
        getTv_goto_comment().setBackground(ViewUtils.H(ViewUtils.o(getContext(), getTv_goto_comment()), com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color), com.max.xiaoheihe.utils.d.E(R.color.text_primary_1_color)));
    }

    public final void d(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36760, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            getBv_bg().setVisibility(8);
            ViewGroup.LayoutParams layoutParams = getCv_img().getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).width = ViewUtils.f(getContext(), 120.0f);
            ViewGroup.LayoutParams layoutParams2 = getCv_img().getLayoutParams();
            f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).height = ViewUtils.f(getContext(), 56.0f);
            return;
        }
        getBv_bg().setVisibility(0);
        getBv_bg().setmResId(R.drawable.game_prefect_achieve_290x56);
        getBv_bg().setRadiusZone(5);
        getBv_bg().c(ViewUtils.f(getContext(), 56.0f), ViewUtils.f(getContext(), 120.0f));
        getBv_bg().setRadius(ViewUtils.f(getContext(), 4.0f));
        getBv_bg().e();
        ViewGroup.LayoutParams layoutParams3 = getCv_img().getLayoutParams();
        f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).width = ViewUtils.f(getContext(), 116.0f);
        ViewGroup.LayoutParams layoutParams4 = getCv_img().getLayoutParams();
        f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams4).height = ViewUtils.f(getContext(), 52.0f);
    }

    @d
    public final BoxAutoPlayView getBv_bg() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36727, new Class[0], BoxAutoPlayView.class);
        if (patchProxyResultProxy.isSupported) {
            return (BoxAutoPlayView) patchProxyResultProxy.result;
        }
        BoxAutoPlayView boxAutoPlayView = this.f86844m;
        if (boxAutoPlayView != null) {
            return boxAutoPlayView;
        }
        f0.S("bv_bg");
        return null;
    }

    @d
    public final CardView getCv_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36705, new Class[0], CardView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardView) patchProxyResultProxy.result;
        }
        CardView cardView = this.f86833b;
        if (cardView != null) {
            return cardView;
        }
        f0.S("cv_img");
        return null;
    }

    @d
    public final GameRateStarView getGrsv() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36729, new Class[0], GameRateStarView.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameRateStarView) patchProxyResultProxy.result;
        }
        GameRateStarView gameRateStarView = this.f86845n;
        if (gameRateStarView != null) {
            return gameRateStarView;
        }
        f0.S("grsv");
        return null;
    }

    @d
    public final ImageView getIv_game_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36707, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86834c;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_game_icon");
        return null;
    }

    @d
    public final ImageView getIv_not_owned_help() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36749, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86855x;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_not_owned_help");
        return null;
    }

    @d
    public final ImageView getIv_prefect_achievement() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36725, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86843l;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_prefect_achievement");
        return null;
    }

    @d
    public final ImageView getIv_special_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36741, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86851t;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_special_icon");
        return null;
    }

    @d
    public final ProgressBar getPb_achievement() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36715, new Class[0], ProgressBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProgressBar) patchProxyResultProxy.result;
        }
        ProgressBar progressBar = this.f86838g;
        if (progressBar != null) {
            return progressBar;
        }
        f0.S("pb_achievement");
        return null;
    }

    @d
    public final TextView getTv_achievement() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36723, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86842k;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_achievement");
        return null;
    }

    @d
    public final TextView getTv_bronze() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36739, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86850s;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_bronze");
        return null;
    }

    @d
    public final TextView getTv_game_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36713, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86837f;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_game_name");
        return null;
    }

    @d
    public final TextView getTv_gold() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36735, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86848q;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_gold");
        return null;
    }

    @d
    public final TextView getTv_goto_comment() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36745, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86853v;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_goto_comment");
        return null;
    }

    @d
    public final TextView getTv_online_num() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36711, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86836e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_online_num");
        return null;
    }

    @d
    public final TextView getTv_playtime_forever() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36717, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86839h;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_playtime_forever");
        return null;
    }

    @d
    public final TextView getTv_silver() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36737, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86849r;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_silver");
        return null;
    }

    @d
    public final TextView getTv_special_time() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36719, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86840i;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_special_time");
        return null;
    }

    @d
    public final Type getType() {
        return this.f86856y;
    }

    @d
    public final LinearLayout getVg_achievement() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36721, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86841j;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("vg_achievement");
        return null;
    }

    @d
    public final View getVg_divider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36743, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86852u;
        if (view != null) {
            return view;
        }
        f0.S("vg_divider");
        return null;
    }

    @d
    public final ViewGroup getVg_not_owned() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36747, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f86854w;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_not_owned");
        return null;
    }

    @d
    public final ViewGroup getVg_online_num() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36709, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f86835d;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_online_num");
        return null;
    }

    @d
    public final LinearLayout getVg_psn_trophy() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36733, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86847p;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("vg_psn_trophy");
        return null;
    }

    @d
    public final View getView_online() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36731, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86846o;
        if (view != null) {
            return view;
        }
        f0.S("view_online");
        return null;
    }

    public final void setAchievementNum(int i10, int i11, @e String str, boolean z10, boolean z11) {
        Object[] objArr = {new Integer(i10), new Integer(i11), str, new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        Class cls2 = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 36758, new Class[]{cls, cls, String.class, cls2, cls2}, Void.TYPE).isSupported) {
            return;
        }
        if (i11 == 0) {
            getTv_achievement().setText("- / -");
            getTv_achievement().setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
            bb.d.d(getTv_achievement(), 2);
            d(false);
        } else {
            v0 v0Var = v0.f124986a;
            String str2 = String.format("%s / %s", Arrays.copyOf(new Object[]{Integer.valueOf(i10), Integer.valueOf(i11)}, 2));
            f0.o(str2, "format(format, *args)");
            if (z10) {
                getTv_achievement().setText(str2);
                getTv_achievement().setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
                bb.d.d(getTv_achievement(), 5);
            } else {
                bb.d.d(getTv_achievement(), 2);
                getTv_achievement().setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
                getTv_achievement().setText(e0.d(str2, getContext().getResources().getColor(R.color.text_primary_1_color), 0, String.valueOf(i10).length(), false, null, null));
            }
        }
        com.max.hbimage.b.K(str, getIv_prefect_achievement());
        d(z10);
        setPrefectAchievement(z11);
    }

    public final void setAchievementText(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36759, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_achievement().setText(str);
        getTv_achievement().setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
        bb.d.d(getTv_achievement(), 2);
    }

    public final void setBv_bg(@d BoxAutoPlayView boxAutoPlayView) {
        if (PatchProxy.proxy(new Object[]{boxAutoPlayView}, this, changeQuickRedirect, false, 36728, new Class[]{BoxAutoPlayView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(boxAutoPlayView, "<set-?>");
        this.f86844m = boxAutoPlayView;
    }

    public final void setCv_img(@d CardView cardView) {
        if (PatchProxy.proxy(new Object[]{cardView}, this, changeQuickRedirect, false, 36706, new Class[]{CardView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cardView, "<set-?>");
        this.f86833b = cardView;
    }

    public final void setForeverPlayTime(@e CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 36753, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_playtime_forever().setText(charSequence);
    }

    public final void setFreeGet(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36756, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            getVg_online_num().setVisibility(8);
            return;
        }
        getVg_online_num().setVisibility(0);
        getView_online().setVisibility(8);
        getTv_online_num().setText("免费获得");
    }

    public final void setGameName(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36752, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_game_name().setText(str);
    }

    public final void setGrsv(@d GameRateStarView gameRateStarView) {
        if (PatchProxy.proxy(new Object[]{gameRateStarView}, this, changeQuickRedirect, false, 36730, new Class[]{GameRateStarView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gameRateStarView, "<set-?>");
        this.f86845n = gameRateStarView;
    }

    public final void setIv_game_icon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36708, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86834c = imageView;
    }

    public final void setIv_not_owned_help(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36750, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86855x = imageView;
    }

    public final void setIv_prefect_achievement(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36726, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86843l = imageView;
    }

    public final void setIv_special_icon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36742, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86851t = imageView;
    }

    public final void setOnlinePlayersAndFriends(@e String str, int i10) {
        if (PatchProxy.proxy(new Object[]{str, new Integer(i10)}, this, changeQuickRedirect, false, 36755, new Class[]{String.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        if (com.max.hbcommon.utils.c.u(str)) {
            getVg_online_num().setVisibility(8);
            return;
        }
        getVg_online_num().setVisibility(0);
        getView_online().setVisibility(0);
        sb2.append(str);
        if (i10 > 0) {
            sb2.append(" · ");
            v0 v0Var = v0.f124986a;
            String string = getContext().getResources().getString(R.string.friends_num_of_online_format);
            f0.o(string, "context.resources.getStr…nds_num_of_online_format)");
            String str2 = String.format(string, Arrays.copyOf(new Object[]{Integer.valueOf(i10)}, 1));
            f0.o(str2, "format(format, *args)");
            sb2.append(str2);
        }
        getTv_online_num().setText(sb2);
    }

    public final void setPb_achievement(@d ProgressBar progressBar) {
        if (PatchProxy.proxy(new Object[]{progressBar}, this, changeQuickRedirect, false, 36716, new Class[]{ProgressBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(progressBar, "<set-?>");
        this.f86838g = progressBar;
    }

    public final void setPrefectAchievement(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36757, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (!z10) {
            ViewGroup.LayoutParams layoutParams = getTv_game_name().getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = 0;
            ViewGroup.LayoutParams layoutParams2 = getVg_achievement().getLayoutParams();
            f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin = ViewUtils.f(getContext(), 13.0f);
            getIv_prefect_achievement().setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = getTv_game_name().getLayoutParams();
        f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams3).rightMargin = ViewUtils.f(getContext(), 42.0f);
        ViewGroup.LayoutParams layoutParams4 = getVg_achievement().getLayoutParams();
        f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = ViewUtils.f(getContext(), 7.0f);
        getIv_prefect_achievement().setVisibility(0);
        getTv_achievement().setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
    }

    public final void setPsnTrophy(@e String str, @e String str2, @e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 36763, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        getVg_psn_trophy().setVisibility(0);
        getTv_special_time().setVisibility(8);
        if (str != null) {
            getTv_gold().setText(str);
            getTv_gold().setVisibility(0);
        } else {
            getTv_gold().setVisibility(8);
        }
        if (str2 != null) {
            getTv_silver().setText(str2);
            getTv_silver().setVisibility(0);
        } else {
            getTv_silver().setVisibility(8);
        }
        if (str3 == null) {
            getTv_bronze().setVisibility(8);
        } else {
            getTv_bronze().setText(str3);
            getTv_bronze().setVisibility(0);
        }
    }

    public final void setRating(float f10) {
        if (PatchProxy.proxy(new Object[]{new Float(f10)}, this, changeQuickRedirect, false, 36761, new Class[]{Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getGrsv().setRating(f10);
    }

    public final void setSpecialPlayTime(@e CharSequence charSequence) {
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, 36754, new Class[]{CharSequence.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_special_time().setText(charSequence);
    }

    public final void setTv_achievement(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36724, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86842k = textView;
    }

    public final void setTv_bronze(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36740, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86850s = textView;
    }

    public final void setTv_game_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36714, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86837f = textView;
    }

    public final void setTv_gold(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36736, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86848q = textView;
    }

    public final void setTv_goto_comment(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36746, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86853v = textView;
    }

    public final void setTv_online_num(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36712, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86836e = textView;
    }

    public final void setTv_playtime_forever(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36718, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86839h = textView;
    }

    public final void setTv_silver(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36738, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86849r = textView;
    }

    public final void setTv_special_time(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36720, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86840i = textView;
    }

    public final void setType(@d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 36762, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        this.f86856y = type;
        int i10 = b.f86857a[type.ordinal()];
        if (i10 == 1 || i10 == 2) {
            getVg_achievement().setVisibility(0);
            getGrsv().setVisibility(8);
            getTv_goto_comment().setVisibility(8);
        } else if (i10 == 3) {
            getVg_achievement().setVisibility(8);
            getGrsv().setVisibility(0);
            getTv_goto_comment().setVisibility(8);
        } else {
            if (i10 != 4) {
                return;
            }
            getVg_achievement().setVisibility(8);
            getGrsv().setVisibility(8);
            getTv_goto_comment().setVisibility(0);
        }
    }

    public final void setVg_achievement(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36722, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86841j = linearLayout;
    }

    public final void setVg_divider(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36744, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86852u = view;
    }

    public final void setVg_not_owned(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 36748, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f86854w = viewGroup;
    }

    public final void setVg_online_num(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 36710, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f86835d = viewGroup;
    }

    public final void setVg_psn_trophy(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36734, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86847p = linearLayout;
    }

    public final void setView_online(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36732, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86846o = view;
    }
}
