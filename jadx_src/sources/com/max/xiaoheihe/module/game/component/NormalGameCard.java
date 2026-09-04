package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.CustomHorizontalScrollView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.max.xiaoheihe.module.game.r1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NormalGameCard.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class NormalGameCard extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f86927i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f86928b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86929c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f86930d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CardView f86931e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CustomHorizontalScrollView f86932f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f86933g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public LinearLayout f86934h;

    /* JADX INFO: compiled from: NormalGameCard.kt */
    public enum Type {
        Normal,
        LightRectangle,
        LightSquare;

        public static ChangeQuickRedirect changeQuickRedirect;

        public static Type valueOf(String str) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36895, new Class[]{String.class}, Type.class);
            return (Type) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : Enum.valueOf(Type.class, str));
        }

        /* JADX INFO: renamed from: values, reason: to resolve conflict with enum method */
        public static Type[] valuesCustom() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 36894, new Class[0], Type[].class);
            return (Type[]) (patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : values().clone());
        }
    }

    /* JADX INFO: compiled from: NormalGameCard.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86935a;

        static {
            int[] iArr = new int[Type.valuesCustom().length];
            try {
                iArr[Type.Normal.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.LightRectangle.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Type.LightSquare.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86935a = iArr;
        }
    }

    public NormalGameCard(@e Context context) {
        this(context, null);
    }

    public NormalGameCard(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NormalGameCard(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public NormalGameCard(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36888, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        setCard_img(new CardView(getContext()));
        getCard_img().setElevation(0.0f);
        getCard_img().setRadius(ViewUtils.f(getContext(), 4.0f));
        addView(getCard_img(), new LinearLayout.LayoutParams(ViewUtils.f(getContext(), 200.0f), ViewUtils.f(getContext(), 104.0f)));
        RelativeLayout relativeLayout = new RelativeLayout(getContext());
        getCard_img().addView(relativeLayout, new ViewGroup.LayoutParams(-1, -1));
        setIv_game(new ImageView(getContext()));
        getIv_game().setScaleType(ImageView.ScaleType.CENTER_CROP);
        relativeLayout.addView(getIv_game(), new RelativeLayout.LayoutParams(-1, -1));
        setV_gradient(new View(getContext()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 52.0f));
        layoutParams.addRule(12);
        relativeLayout.addView(getV_gradient(), layoutParams);
        setLl_platform_icon(new LinearLayout(getContext()));
        getLl_platform_icon().setOrientation(0);
        getLl_platform_icon().setGravity(16);
        getLl_platform_icon().setVisibility(8);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams2.addRule(9);
        layoutParams2.addRule(10);
        relativeLayout.addView(getLl_platform_icon(), layoutParams2);
        setTv_game_name(new TextView(getContext()));
        getTv_game_name().setTextSize(1, 13.0f);
        getTv_game_name().setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        getTv_game_name().setMaxLines(1);
        getTv_game_name().setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams3 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams3.topMargin = ViewUtils.f(getContext(), 5.0f);
        addView(getTv_game_name(), layoutParams3);
        setScroll_rich_tags(new CustomHorizontalScrollView(getContext()));
        LinearLayout.LayoutParams layoutParams4 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams4.topMargin = ViewUtils.f(getContext(), 4.0f);
        addView(getScroll_rich_tags(), layoutParams4);
        setType(Type.Normal);
    }

    public final void b(@e List<RichAttributeModelObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36892, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        r1.N1(getScroll_rich_tags(), list, this.f86933g);
    }

    @d
    public final CardView getCard_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36882, new Class[0], CardView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CardView) patchProxyResultProxy.result;
        }
        CardView cardView = this.f86931e;
        if (cardView != null) {
            return cardView;
        }
        f0.S("card_img");
        return null;
    }

    public final int getDesireWidth() {
        return this.f86933g;
    }

    @d
    public final ImageView getIv_game() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36876, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86928b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_game");
        return null;
    }

    @d
    public final LinearLayout getLl_platform_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36886, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f86934h;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_platform_icon");
        return null;
    }

    @d
    public final CustomHorizontalScrollView getScroll_rich_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36884, new Class[0], CustomHorizontalScrollView.class);
        if (patchProxyResultProxy.isSupported) {
            return (CustomHorizontalScrollView) patchProxyResultProxy.result;
        }
        CustomHorizontalScrollView customHorizontalScrollView = this.f86932f;
        if (customHorizontalScrollView != null) {
            return customHorizontalScrollView;
        }
        f0.S("scroll_rich_tags");
        return null;
    }

    @d
    public final TextView getTv_game_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36878, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86929c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_game_name");
        return null;
    }

    @d
    public final View getV_gradient() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36880, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86930d;
        if (view != null) {
            return view;
        }
        f0.S("v_gradient");
        return null;
    }

    public final void setCard_img(@d CardView cardView) {
        if (PatchProxy.proxy(new Object[]{cardView}, this, changeQuickRedirect, false, 36883, new Class[]{CardView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(cardView, "<set-?>");
        this.f86931e = cardView;
    }

    public final void setDesireWidth(int i10) {
        this.f86933g = i10;
    }

    public final void setGameName(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36889, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_game_name().setText(str);
    }

    public final void setGradientColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36890, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getV_gradient().setBackground(ViewUtils.P(0, ViewUtils.k(0.0f, i10), i10));
    }

    public final void setIv_game(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36877, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86928b = imageView;
    }

    public final void setLl_platform_icon(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 36887, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f86934h = linearLayout;
    }

    public final void setPlatformsIcon(@e List<String> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 36893, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        getLl_platform_icon().removeAllViews();
        if (com.max.hbcommon.utils.c.w(list)) {
            getLl_platform_icon().setVisibility(8);
            return;
        }
        getLl_platform_icon().setVisibility(0);
        f0.m(list);
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            ImageView imageViewN0 = r1.n0(getContext(), it.next(), ViewUtils.f(getContext(), 14.0f));
            if (imageViewN0 != null) {
                getLl_platform_icon().addView(imageViewN0);
            }
        }
    }

    public final void setScroll_rich_tags(@d CustomHorizontalScrollView customHorizontalScrollView) {
        if (PatchProxy.proxy(new Object[]{customHorizontalScrollView}, this, changeQuickRedirect, false, 36885, new Class[]{CustomHorizontalScrollView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(customHorizontalScrollView, "<set-?>");
        this.f86932f = customHorizontalScrollView;
    }

    public final void setTv_game_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36879, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86929c = textView;
    }

    public final void setType(@d Type type) {
        if (PatchProxy.proxy(new Object[]{type}, this, changeQuickRedirect, false, 36891, new Class[]{Type.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(type, "type");
        int iF = ViewUtils.f(getContext(), 200.0f);
        int iF2 = ViewUtils.f(getContext(), 104.0f);
        int color = getContext().getResources().getColor(R.color.text_primary_1_color);
        int i10 = a.f86935a[type.ordinal()];
        if (i10 == 1) {
            iF = ViewUtils.f(getContext(), 200.0f);
            iF2 = ViewUtils.f(getContext(), 104.0f);
            color = getContext().getResources().getColor(R.color.text_primary_1_color);
            getScroll_rich_tags().setVisibility(0);
        } else if (i10 == 2) {
            iF = ViewUtils.f(getContext(), 150.0f);
            iF2 = ViewUtils.f(getContext(), 75.0f);
            color = getContext().getResources().getColor(R.color.white);
            getScroll_rich_tags().setVisibility(8);
        } else if (i10 == 3) {
            iF = ViewUtils.f(getContext(), 130.0f);
            iF2 = ViewUtils.f(getContext(), 130.0f);
            color = getContext().getResources().getColor(R.color.white);
            getScroll_rich_tags().setVisibility(8);
        }
        if (getLayoutParams() != null) {
            getLayoutParams().width = iF;
        } else {
            setLayoutParams(new ViewGroup.LayoutParams(iF, -2));
        }
        this.f86933g = iF;
        getCard_img().getLayoutParams().width = iF;
        getCard_img().getLayoutParams().height = iF2;
        getTv_game_name().setTextColor(color);
        getCard_img().setRadius(ViewUtils.n(getContext(), iF, iF2, ViewUtils.ViewType.IMAGE));
    }

    public final void setV_gradient(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36881, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86930d = view;
    }
}
