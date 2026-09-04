package com.max.xiaoheihe.module.mall.adapter;

import android.content.Context;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.mall.MallPriceObj;
import com.max.xiaoheihe.bean.mall.MallProductObj;
import com.max.xiaoheihe.module.game.component.GamePriceView;
import com.max.xiaoheihe.module.game.component.PriceLowestTagView;
import com.max.xiaoheihe.module.game.r1;
import com.max.xiaoheihe.module.mall.component.MallProductViewV2;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallProductAdapterV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
public final class n {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f89993c = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Context f89994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final f f89995b;

    public n(@dl.d Context context) {
        f0.p(context, "context");
        this.f89994a = context;
        this.f89995b = new f(context);
    }

    private final SpannableStringBuilder c(Context context, MallPriceObj mallPriceObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, mallPriceObj}, this, changeQuickRedirect, false, 41170, new Class[]{Context.class, MallPriceObj.class}, SpannableStringBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (SpannableStringBuilder) patchProxyResultProxy.result;
        }
        SpannableStringBuilder spannableStringBuilderD = d(context);
        String strG = r1.G(mallPriceObj.getFinal_price());
        if (strG == null) {
            strG = "0";
        }
        spannableStringBuilderD.append((CharSequence) strG);
        return spannableStringBuilderD;
    }

    private final SpannableStringBuilder d(Context context) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context}, this, changeQuickRedirect, false, 41171, new Class[]{Context.class}, SpannableStringBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (SpannableStringBuilder) patchProxyResultProxy.result;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(context.getResources().getString(R.string.rmb_symbol));
        spannableStringBuilder.setSpan(new AbsoluteSizeSpan(context.getResources().getDimensionPixelSize(R.dimen.text_size_14)), 0, spannableStringBuilder.length(), 33);
        return spannableStringBuilder;
    }

    private final int e(TextView textView) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 41178, new Class[]{TextView.class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : ViewUtils.h0(textView.getContext(), ViewUtils.o(textView.getContext(), textView));
    }

    private final String f() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41165, new Class[0], String.class);
        return patchProxyResultProxy.isSupported ? (String) patchProxyResultProxy.result : this.f89995b.c().getText();
    }

    private final SpannableString g(Context context, MallPriceObj mallPriceObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{context, mallPriceObj}, this, changeQuickRedirect, false, 41174, new Class[]{Context.class, MallPriceObj.class}, SpannableString.class);
        if (patchProxyResultProxy.isSupported) {
            return (SpannableString) patchProxyResultProxy.result;
        }
        SpannableString spannableString = new SpannableString(context.getResources().getString(R.string.rmb_symbol) + r1.G(mallPriceObj.getInitial_price()));
        spannableString.setSpan(new StrikethroughSpan(), 0, spannableString.length(), 33);
        return spannableString;
    }

    private final void h(MallProductViewV2 mallProductViewV2) {
        if (PatchProxy.proxy(new Object[]{mallProductViewV2}, this, changeQuickRedirect, false, 41175, new Class[]{MallProductViewV2.class}, Void.TYPE).isSupported) {
            return;
        }
        mallProductViewV2.getTvCurrentPrice().setVisibility(8);
        mallProductViewV2.getTvOriginalPrice().setVisibility(8);
        mallProductViewV2.getTvDiscount().setVisibility(8);
        mallProductViewV2.getVLowestTagView().setVisibility(8);
    }

    private final void i(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 41172, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        textView.setVisibility(8);
    }

    private final void j(MallProductViewV2 mallProductViewV2) {
        if (PatchProxy.proxy(new Object[]{mallProductViewV2}, this, changeQuickRedirect, false, 41167, new Class[]{MallProductViewV2.class}, Void.TYPE).isSupported) {
            return;
        }
        mallProductViewV2.getVLowestTagView().setVisibility(8);
    }

    private final boolean k(MallPriceObj mallPriceObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallPriceObj}, this, changeQuickRedirect, false, 41177, new Class[]{MallPriceObj.class}, Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : this.f89995b.d(mallPriceObj.getSuper_lowest(), mallPriceObj.getNew_lowest(), mallPriceObj.getIs_lowest());
    }

    private final boolean l(MallPriceObj mallPriceObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{mallPriceObj}, this, changeQuickRedirect, false, 41169, new Class[]{MallPriceObj.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        String initial_price = mallPriceObj.getInitial_price();
        return ((initial_price == null || initial_price.length() == 0) || f0.g(mallPriceObj.getInitial_price(), mallPriceObj.getFinal_price())) ? false : true;
    }

    private final void m(MallProductViewV2 mallProductViewV2, MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductViewV2, mallProductObj}, this, changeQuickRedirect, false, 41161, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        MallPriceObj price = mallProductObj.getPrice();
        if (price == null) {
            h(mallProductViewV2);
            return;
        }
        String sale_prefix = mallProductObj.getSale_prefix();
        r(mallProductViewV2, price);
        n(mallProductViewV2, price);
        q(mallProductViewV2, price);
        p(mallProductViewV2, price, sale_prefix);
    }

    private final void n(MallProductViewV2 mallProductViewV2, MallPriceObj mallPriceObj) {
        if (PatchProxy.proxy(new Object[]{mallProductViewV2, mallPriceObj}, this, changeQuickRedirect, false, 41168, new Class[]{MallProductViewV2.class, MallPriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!l(mallPriceObj)) {
            i(mallProductViewV2.getTvOriginalPrice());
            return;
        }
        Context context = mallProductViewV2.getContext();
        f0.o(context, "context");
        s(context, mallPriceObj, mallProductViewV2.getTvOriginalPrice());
    }

    private final void o(TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 41176, new Class[]{TextView.class}, Void.TYPE).isSupported || textView == null) {
            return;
        }
        textView.setBackground(com.max.xiaoheihe.accelworld.l.n(this.f89994a, R.color.discount_bg, 0.0f));
    }

    private final void p(MallProductViewV2 mallProductViewV2, MallPriceObj mallPriceObj, String str) {
        if (PatchProxy.proxy(new Object[]{mallProductViewV2, mallPriceObj, str}, this, changeQuickRedirect, false, 41163, new Class[]{MallProductViewV2.class, MallPriceObj.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        r1.j1(mallProductViewV2.getTvDiscount(), mallPriceObj, str);
        o(mallProductViewV2.getTvDiscount());
    }

    private final void q(MallProductViewV2 mallProductViewV2, MallPriceObj mallPriceObj) {
        if (PatchProxy.proxy(new Object[]{mallProductViewV2, mallPriceObj}, this, changeQuickRedirect, false, 41164, new Class[]{MallProductViewV2.class, MallPriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f89995b.a(mallPriceObj.getSuper_lowest(), mallPriceObj.getNew_lowest(), mallPriceObj.getIs_lowest());
        if (f().length() == 0) {
            j(mallProductViewV2);
        } else {
            t(mallProductViewV2, this.f89995b.c());
        }
    }

    private final void r(MallProductViewV2 mallProductViewV2, MallPriceObj mallPriceObj) {
        if (PatchProxy.proxy(new Object[]{mallProductViewV2, mallPriceObj}, this, changeQuickRedirect, false, 41162, new Class[]{MallProductViewV2.class, MallPriceObj.class}, Void.TYPE).isSupported) {
            return;
        }
        mallProductViewV2.getTvCurrentPrice().setVisibility(0);
        TextView tvCurrentPrice = mallProductViewV2.getTvCurrentPrice();
        Context context = mallProductViewV2.getContext();
        f0.o(context, "context");
        tvCurrentPrice.setText(c(context, mallPriceObj));
    }

    private final void s(Context context, MallPriceObj mallPriceObj, TextView textView) {
        if (PatchProxy.proxy(new Object[]{context, mallPriceObj, textView}, this, changeQuickRedirect, false, 41173, new Class[]{Context.class, MallPriceObj.class, TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        textView.setText(g(context, mallPriceObj));
        textView.setVisibility(0);
    }

    private final void t(MallProductViewV2 mallProductViewV2, c cVar) {
        GamePriceView.DiscountType discountType;
        if (PatchProxy.proxy(new Object[]{mallProductViewV2, cVar}, this, changeQuickRedirect, false, 41166, new Class[]{MallProductViewV2.class, c.class}, Void.TYPE).isSupported) {
            return;
        }
        PriceLowestTagView vLowestTagView = mallProductViewV2.getVLowestTagView();
        vLowestTagView.setVisibility(0);
        vLowestTagView.setMiniStyle();
        if (cVar instanceof s) {
            discountType = GamePriceView.DiscountType.SuperLowest;
        } else if (cVar instanceof k) {
            discountType = GamePriceView.DiscountType.NewLowest;
        } else {
            discountType = cVar instanceof e ? GamePriceView.DiscountType.Lowest : null;
        }
        vLowestTagView.setDiscountType(discountType);
    }

    public final void a(@dl.d MallProductViewV2 mallProductView, @dl.e MallProductObj mallProductObj) {
        if (PatchProxy.proxy(new Object[]{mallProductView, mallProductObj}, this, changeQuickRedirect, false, 41160, new Class[]{MallProductViewV2.class, MallProductObj.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(mallProductView, "mallProductView");
        if (mallProductObj == null) {
            h(mallProductView);
        } else {
            m(mallProductView, mallProductObj);
        }
    }

    @dl.d
    public final Context b() {
        return this.f89994a;
    }
}
