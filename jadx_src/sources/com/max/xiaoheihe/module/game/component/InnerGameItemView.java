package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.CustomHorizontalScrollView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: InnerGameItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class InnerGameItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f86905j = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QMUIRadiusImageView f86906b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86907c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CustomHorizontalScrollView f86908d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public GamePriceView f86909e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public GameAwardView f86910f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public RelativeLayout f86911g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public RelativeLayout f86912h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f86913i;

    /* JADX INFO: compiled from: InnerGameItemView.kt */
    public enum Type {
        GAME_PRICE,
        GAME_AWARD;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36845, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36844, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: InnerGameItemView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86914a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.GAME_PRICE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.GAME_AWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f86914a = iArr;
        }
    }

    public InnerGameItemView(@e Context context) {
        this(context, null);
    }

    public InnerGameItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public InnerGameItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public InnerGameItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
        this.f86913i = ViewUtils.L(context) - ViewUtils.f(context, 202.0f);
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36837, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setIv_icon(new QMUIRadiusImageView(getContext()));
        getIv_icon().setId(R.id.iv_icon);
        int iF = ViewUtils.f(getContext(), 46.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams.rightMargin = ViewUtils.f(getContext(), 10.0f);
        getIv_icon().setCornerRadius(ViewUtils.f(getContext(), 4.0f));
        getIv_icon().setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(getIv_icon(), layoutParams);
        setLl_center(new RelativeLayout(getContext()));
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-1, iF);
        layoutParams2.addRule(1, R.id.iv_icon);
        layoutParams2.addRule(0, R.id.vg_right);
        layoutParams2.addRule(15);
        addView(getLl_center(), layoutParams2);
        setTv_name(new TextView(getContext()));
        getTv_name().setMaxLines(1);
        getTv_name().setEllipsize(TextUtils.TruncateAt.END);
        getTv_name().setTextColor(getContext().getResources().getColor(R.color.white));
        getTv_name().setTextSize(1, 14.0f);
        getTv_name().setIncludeFontPadding(false);
        getTv_name().setGravity(17);
        getTv_name().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, ViewUtils.f(getContext(), 20.0f));
        layoutParams3.addRule(10);
        layoutParams3.topMargin = ViewUtils.f(getContext(), 5.0f);
        getLl_center().addView(getTv_name(), layoutParams3);
        setScroll_rich_tags(new CustomHorizontalScrollView(getContext()));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        getScroll_rich_tags().setMinimumHeight(ViewUtils.f(getContext(), 14.0f));
        layoutParams4.bottomMargin = ViewUtils.f(getContext(), 5.0f);
        layoutParams4.addRule(12);
        getLl_center().addView(getScroll_rich_tags(), layoutParams4);
        setLl_right(new RelativeLayout(getContext()));
        getLl_right().setId(R.id.vg_right);
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(-2, iF);
        layoutParams5.addRule(11);
        layoutParams5.addRule(15);
        addView(getLl_right(), layoutParams5);
        setView_price(new GamePriceView(getContext()));
        getView_price().setId(R.id.gpv);
        RelativeLayout.LayoutParams layoutParams6 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams6.addRule(12);
        layoutParams6.bottomMargin = ViewUtils.f(getContext(), 5.0f);
        getLl_right().addView(getView_price(), layoutParams6);
        int iF2 = ViewUtils.f(getContext(), 31.0f);
        setView_award(new GameAwardView(getContext()));
        getView_award().setId(R.id.game_award);
        RelativeLayout.LayoutParams layoutParams7 = new RelativeLayout.LayoutParams(-2, iF2);
        layoutParams7.addRule(15);
        layoutParams7.rightMargin = ViewUtils.f(getContext(), 2.0f);
        getLl_right().addView(getView_award(), layoutParams7);
        getView_award().setVisibility(8);
    }

    public static /* synthetic */ void setMiniStyle$default(InnerGameItemView innerGameItemView, boolean z10, int i10, Object obj) {
        if (PatchProxy.proxy(new Object[]{innerGameItemView, new Byte(z10 ? (byte) 1 : (byte) 0), new Integer(i10), obj}, null, changeQuickRedirect, true, 36843, new Class[]{InnerGameItemView.class, Boolean.TYPE, Integer.TYPE, Object.class}, Void.TYPE).isSupported) {
            return;
        }
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        innerGameItemView.setMiniStyle(z10);
    }

    public final void b(@e List<RichAttributeModelObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36841, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        if (com.max.hbcommon.utils.c.w(list)) {
            ViewGroup.LayoutParams layoutParams = getTv_name().getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams).removeRule(10);
            ViewGroup.LayoutParams layoutParams2 = getTv_name().getLayoutParams();
            f0.n(layoutParams2, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
            ((RelativeLayout.LayoutParams) layoutParams2).addRule(15);
            getScroll_rich_tags().setVisibility(8);
            return;
        }
        ViewGroup.LayoutParams layoutParams3 = getTv_name().getLayoutParams();
        f0.n(layoutParams3, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams3).removeRule(15);
        ViewGroup.LayoutParams layoutParams4 = getTv_name().getLayoutParams();
        f0.n(layoutParams4, "null cannot be cast to non-null type android.widget.RelativeLayout.LayoutParams");
        ((RelativeLayout.LayoutParams) layoutParams4).addRule(10);
        getScroll_rich_tags().setVisibility(0);
        r1.N1(getScroll_rich_tags(), list, getLl_center().getMeasuredWidth() > 0 ? getLl_center().getMeasuredWidth() : this.f86913i);
    }

    @d
    public final QMUIRadiusImageView getIv_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36823, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f86906b;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("iv_icon");
        return null;
    }

    @d
    public final RelativeLayout getLl_center() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36833, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f86911g;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("ll_center");
        return null;
    }

    @d
    public final RelativeLayout getLl_right() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36835, new Class[0], RelativeLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (RelativeLayout) patchProxyResultProxy.result;
        }
        RelativeLayout relativeLayout = this.f86912h;
        if (relativeLayout != null) {
            return relativeLayout;
        }
        f0.S("ll_right");
        return null;
    }

    @d
    public final CustomHorizontalScrollView getScroll_rich_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36827, new Class[0], CustomHorizontalScrollView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CustomHorizontalScrollView) patchProxyResultProxy.result;
        }
        CustomHorizontalScrollView customHorizontalScrollView = this.f86908d;
        if (customHorizontalScrollView != null) {
            return customHorizontalScrollView;
        }
        f0.S("scroll_rich_tags");
        return null;
    }

    @d
    public final TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36825, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86907c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    @d
    public final GameAwardView getView_award() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36831, new Class[0], GameAwardView.class);
        if (patchProxyResultProxy.isSupported) {
            return (GameAwardView) patchProxyResultProxy.result;
        }
        GameAwardView gameAwardView = this.f86910f;
        if (gameAwardView != null) {
            return gameAwardView;
        }
        f0.S("view_award");
        return null;
    }

    @d
    public final GamePriceView getView_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36829, new Class[0], GamePriceView.class);
        if (patchProxyResultProxy.isSupported) {
            return (GamePriceView) patchProxyResultProxy.result;
        }
        GamePriceView gamePriceView = this.f86909e;
        if (gamePriceView != null) {
            return gamePriceView;
        }
        f0.S("view_price");
        return null;
    }

    public final void setGameName(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36838, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_name().setText(str);
    }

    public final void setGamePrice(@e GameObj gameObj, @d GamePriceView.ColorType colorType) {
        if (PatchProxy.proxy(new Object[]{gameObj, colorType}, this, changeQuickRedirect, false, 36839, new Class[]{GameObj.class, GamePriceView.ColorType.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(colorType, "colorType");
        if (gameObj == null) {
            getView_price().setVisibility(8);
        } else {
            getView_price().setVisibility(0);
            GamePriceView.k(getView_price(), gameObj, false, colorType, true, false, 16, null);
        }
    }

    public final void setIv_icon(@d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, 36824, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f86906b = qMUIRadiusImageView;
    }

    public final void setLl_center(@d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 36834, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f86911g = relativeLayout;
    }

    public final void setLl_right(@d RelativeLayout relativeLayout) {
        if (PatchProxy.proxy(new Object[]{relativeLayout}, this, changeQuickRedirect, false, 36836, new Class[]{RelativeLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(relativeLayout, "<set-?>");
        this.f86912h = relativeLayout;
    }

    public final void setMiniStyle(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36842, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            int iF = ViewUtils.f(getContext(), 36.0f);
            int iF2 = ViewUtils.f(getContext(), 1.0f);
            getIv_icon().getLayoutParams().width = iF;
            getIv_icon().getLayoutParams().height = iF;
            getLl_center().getLayoutParams().height = iF;
            getLl_right().getLayoutParams().height = iF;
            ViewGroup.LayoutParams layoutParams = getIv_icon().getLayoutParams();
            f0.n(layoutParams, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin = ViewUtils.f(getContext(), 8.0f);
            ViewGroup.LayoutParams layoutParams2 = getTv_name().getLayoutParams();
            f0.n(layoutParams2, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin = 0;
            ViewGroup.LayoutParams layoutParams3 = getScroll_rich_tags().getLayoutParams();
            f0.n(layoutParams3, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin = iF2;
            ViewGroup.LayoutParams layoutParams4 = getView_price().getLayoutParams();
            f0.n(layoutParams4, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
            ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin = iF2;
            return;
        }
        int iF3 = ViewUtils.f(getContext(), 46.0f);
        int iF4 = ViewUtils.f(getContext(), 5.0f);
        getIv_icon().getLayoutParams().width = iF3;
        getIv_icon().getLayoutParams().height = iF3;
        getLl_center().getLayoutParams().height = iF3;
        getLl_right().getLayoutParams().height = iF3;
        ViewGroup.LayoutParams layoutParams5 = getIv_icon().getLayoutParams();
        f0.n(layoutParams5, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams5).rightMargin = ViewUtils.f(getContext(), 10.0f);
        ViewGroup.LayoutParams layoutParams6 = getTv_name().getLayoutParams();
        f0.n(layoutParams6, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin = iF4;
        ViewGroup.LayoutParams layoutParams7 = getScroll_rich_tags().getLayoutParams();
        f0.n(layoutParams7, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams7).bottomMargin = iF4;
        ViewGroup.LayoutParams layoutParams8 = getView_price().getLayoutParams();
        f0.n(layoutParams8, "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        ((ViewGroup.MarginLayoutParams) layoutParams8).bottomMargin = iF4;
    }

    public final void setScroll_rich_tags(@d CustomHorizontalScrollView customHorizontalScrollView) {
        if (PatchProxy.proxy(new Object[]{customHorizontalScrollView}, this, changeQuickRedirect, false, 36828, new Class[]{CustomHorizontalScrollView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(customHorizontalScrollView, "<set-?>");
        this.f86908d = customHorizontalScrollView;
    }

    public final void setTv_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36826, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86907c = textView;
    }

    public final void setType(@d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 36840, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        int i10 = a.f86914a[type.ordinal()];
        if (i10 == 1) {
            getView_price().setVisibility(0);
            getView_award().setVisibility(8);
        } else {
            if (i10 != 2) {
                return;
            }
            getView_price().setVisibility(8);
            getView_award().setVisibility(0);
        }
    }

    public final void setView_award(@d GameAwardView gameAwardView) {
        if (PatchProxy.proxy(new Object[]{gameAwardView}, this, changeQuickRedirect, false, 36832, new Class[]{GameAwardView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gameAwardView, "<set-?>");
        this.f86910f = gameAwardView;
    }

    public final void setView_price(@d GamePriceView gamePriceView) {
        if (PatchProxy.proxy(new Object[]{gamePriceView}, this, changeQuickRedirect, false, 36830, new Class[]{GamePriceView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(gamePriceView, "<set-?>");
        this.f86909e = gamePriceView;
    }
}
