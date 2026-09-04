package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.n;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PriceDiscountView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class PriceDiscountView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f86941m = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public TextView f86942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PriceLowestTagView f86943l;

    public PriceDiscountView(@e Context context) {
        this(context, null);
    }

    public PriceDiscountView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PriceDiscountView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        h();
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36914, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setRadius(ViewUtils.f(getContext(), 2.0f));
        setCardElevation(0.0f);
        setCardBackgroundColor(0);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_price_discount, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        addView(viewInflate);
        View viewFindViewById = findViewById(R.id.tv_discount);
        f0.o(viewFindViewById, "findViewById(R.id.tv_discount)");
        setTv_discount((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.v_price_tag);
        f0.o(viewFindViewById2, "findViewById(R.id.v_price_tag)");
        setV_price_tag((PriceLowestTagView) viewFindViewById2);
    }

    @d
    public final TextView getTv_discount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36910, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86942k;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_discount");
        return null;
    }

    @d
    public final PriceLowestTagView getV_price_tag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36912, new Class[0], PriceLowestTagView.class);
        if (patchProxyResultProxy.isSupported) {
            return (PriceLowestTagView) patchProxyResultProxy.result;
        }
        PriceLowestTagView priceLowestTagView = this.f86943l;
        if (priceLowestTagView != null) {
            return priceLowestTagView;
        }
        f0.S("v_price_tag");
        return null;
    }

    public final void setData(@e String str, @e GamePriceView.DiscountType discountType) {
        if (PatchProxy.proxy(new Object[]{str, discountType}, this, changeQuickRedirect, false, 36915, new Class[]{String.class, GamePriceView.DiscountType.class}, Void.TYPE).isSupported) {
            return;
        }
        setDiscount(str);
        setDiscountType(discountType);
    }

    public final void setDiscount(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36916, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        if (n.p(str) <= 0.0f) {
            setVisibility(8);
            return;
        }
        getTv_discount().setText('-' + str + '%');
        setVisibility(0);
    }

    public final void setDiscountType(@e GamePriceView.DiscountType discountType) {
        if (PatchProxy.proxy(new Object[]{discountType}, this, changeQuickRedirect, false, 36917, new Class[]{GamePriceView.DiscountType.class}, Void.TYPE).isSupported) {
            return;
        }
        getV_price_tag().setDiscountType(discountType);
    }

    public final void setTv_discount(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36911, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86942k = textView;
    }

    public final void setV_price_tag(@d PriceLowestTagView priceLowestTagView) {
        if (PatchProxy.proxy(new Object[]{priceLowestTagView}, this, changeQuickRedirect, false, 36913, new Class[]{PriceLowestTagView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(priceLowestTagView, "<set-?>");
        this.f86943l = priceLowestTagView;
    }
}
