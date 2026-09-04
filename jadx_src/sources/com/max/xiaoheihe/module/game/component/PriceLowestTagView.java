package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.d;
import com.max.xiaoheihe.view.BoxAutoPlayView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PriceLowestTagView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class PriceLowestTagView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f86944e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f86945b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public BoxAutoPlayView f86946c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f86947d;

    /* JADX INFO: compiled from: PriceLowestTagView.kt */
    public final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f86948a;

        static {
            int[] iArr = new int[GamePriceView.DiscountType.valuesCustom().length];
            try {
                iArr[GamePriceView.DiscountType.Lowest.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GamePriceView.DiscountType.NewLowest.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[GamePriceView.DiscountType.SuperLowest.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f86948a = iArr;
        }
    }

    /* JADX INFO: compiled from: PriceLowestTagView.kt */
    public static final class b implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36926, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PriceLowestTagView.this.getBv_bg().e();
        }
    }

    /* JADX INFO: compiled from: PriceLowestTagView.kt */
    public static final class c implements Runnable {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36927, new Class[0], Void.TYPE).isSupported) {
                return;
            }
            PriceLowestTagView.this.getBv_bg().e();
        }
    }

    public PriceLowestTagView(@e Context context) {
        this(context, null);
    }

    public PriceLowestTagView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceLowestTagView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36922, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BoxAutoPlayView boxAutoPlayView = new BoxAutoPlayView(getContext());
        boxAutoPlayView.setId(R.id.bv_bg);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(ViewUtils.f(boxAutoPlayView.getContext(), getSuperLowestWidth()), -1);
        layoutParams.gravity = 17;
        boxAutoPlayView.setLayoutParams(layoutParams);
        setBv_bg(boxAutoPlayView);
        addView(getBv_bg());
        TextView textView = new TextView(getContext());
        textView.setId(R.id.tv_lowest_in_history);
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-2, -1);
        layoutParams2.gravity = 17;
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextColor(d.F(textView.getContext(), R.color.white));
        textView.setTextSize(1, 10.0f);
        textView.setMaxLines(1);
        textView.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        setTv_lowest_in_history(textView);
        addView(getTv_lowest_in_history());
    }

    public final boolean b() {
        return this.f86947d;
    }

    @dl.d
    public final BoxAutoPlayView getBv_bg() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36920, new Class[0], BoxAutoPlayView.class);
        if (patchProxyResultProxy.isSupported) {
            return (BoxAutoPlayView) patchProxyResultProxy.result;
        }
        BoxAutoPlayView boxAutoPlayView = this.f86946c;
        if (boxAutoPlayView != null) {
            return boxAutoPlayView;
        }
        f0.S("bv_bg");
        return null;
    }

    public final float getLowestWidth() {
        return this.f86947d ? 22.0f : 26.0f;
    }

    public final float getNewLowestWidth() {
        return this.f86947d ? 30.0f : 36.0f;
    }

    public final float getSuperLowestWidth() {
        return this.f86947d ? 30.0f : 36.0f;
    }

    @dl.d
    public final TextView getTv_lowest_in_history() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36918, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86945b;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_lowest_in_history");
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36925, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        super.onAttachedToWindow();
        if (getBv_bg().getVisibility() == 0) {
            getBv_bg().post(new b());
        }
    }

    public final void setBv_bg(@dl.d BoxAutoPlayView boxAutoPlayView) {
        if (PatchProxy.proxy(new Object[]{boxAutoPlayView}, this, changeQuickRedirect, false, 36921, new Class[]{BoxAutoPlayView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(boxAutoPlayView, "<set-?>");
        this.f86946c = boxAutoPlayView;
    }

    public final void setDiscountType(@e GamePriceView.DiscountType discountType) {
        if (PatchProxy.proxy(new Object[]{discountType}, this, changeQuickRedirect, false, 36923, new Class[]{GamePriceView.DiscountType.class}, Void.TYPE).isSupported) {
            return;
        }
        setVisibility(0);
        ViewGroup.LayoutParams layoutParams = getTv_lowest_in_history().getLayoutParams();
        int i10 = discountType == null ? -1 : a.f86948a[discountType.ordinal()];
        if (i10 == 1) {
            getBv_bg().setVisibility(8);
            getTv_lowest_in_history().setVisibility(0);
            getTv_lowest_in_history().setText(d.n0(R.string.lowest_in_history));
            getTv_lowest_in_history().setBackgroundResource(R.color.lowest_discount_color);
            if (layoutParams != null) {
                layoutParams.width = ViewUtils.f(getContext(), getLowestWidth());
            }
        } else if (i10 == 2) {
            getBv_bg().setVisibility(8);
            getTv_lowest_in_history().setVisibility(0);
            getTv_lowest_in_history().setText(d.n0(R.string.new_lowest_in_history));
            getTv_lowest_in_history().setBackgroundResource(R.color.emerald_green);
            if (layoutParams != null) {
                layoutParams.width = ViewUtils.f(getContext(), getNewLowestWidth());
            }
        } else if (i10 != 3) {
            setVisibility(8);
        } else {
            getBv_bg().setVisibility(0);
            getTv_lowest_in_history().setVisibility(0);
            getTv_lowest_in_history().setText(d.n0(R.string.super_lowest_in_history));
            getTv_lowest_in_history().setBackgroundResource(R.color.transparent);
            getBv_bg().setVisibility(0);
            getBv_bg().setmResId(R.drawable.game_lowest_price_167x16_1);
            getBv_bg().setDoublePicture(true);
            getBv_bg().setmScrollltr(true);
            getBv_bg().setRadiusZone(2);
            getBv_bg().c(ViewUtils.f(getContext(), 16.0f), ViewUtils.f(getContext(), 36.0f));
            getBv_bg().post(new c());
            if (layoutParams != null) {
                layoutParams.width = ViewUtils.f(getContext(), getSuperLowestWidth());
            }
        }
        getTv_lowest_in_history().setLayoutParams(layoutParams);
    }

    public final void setMiniStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36924, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        getTv_lowest_in_history().setTextSize(1, 8.0f);
        this.f86947d = true;
        invalidate();
    }

    public final void setMiniStyle(boolean z10) {
        this.f86947d = z10;
    }

    public final void setTv_lowest_in_history(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36919, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86945b = textView;
    }
}
