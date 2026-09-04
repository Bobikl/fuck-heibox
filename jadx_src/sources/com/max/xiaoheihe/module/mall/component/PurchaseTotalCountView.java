package com.max.xiaoheihe.module.mall.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.utils.c;
import com.max.hbcustomview.GradientTextView;
import com.max.hbutils.utils.n;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PurchaseTotalCountView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class PurchaseTotalCountView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f90547h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f90548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private LinearLayout f90549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private GradientTextView f90550d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private GradientTextView f90551e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f90552f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ImageView f90553g;

    public PurchaseTotalCountView(@e Context context) {
        this(context, null);
    }

    public PurchaseTotalCountView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PurchaseTotalCountView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PurchaseTotalCountView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41882, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.view_purchase_total_count, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.tv_final_price);
        f0.o(viewFindViewById, "findViewById(R.id.tv_final_price)");
        this.f90548b = (TextView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.vg_discount);
        f0.o(viewFindViewById2, "findViewById(R.id.vg_discount)");
        this.f90549c = (LinearLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.tv_discount_desc);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_discount_desc)");
        this.f90550d = (GradientTextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.tv_discount);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_discount)");
        this.f90551e = (GradientTextView) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.tv_coupon_desc);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_coupon_desc)");
        setTvCouponDesc((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.iv_arrow);
        f0.o(viewFindViewById6, "findViewById(R.id.iv_arrow)");
        this.f90553g = (ImageView) viewFindViewById6;
        int iE = d.E(R.color.store_gradient_free_lottery_start_color);
        int iE2 = d.E(R.color.store_gradient_free_lottery_end_color);
        GradientTextView gradientTextView = this.f90551e;
        GradientTextView gradientTextView2 = null;
        if (gradientTextView == null) {
            f0.S("tvDiscount");
            gradientTextView = null;
        }
        gradientTextView.setColors(iE, iE2);
        GradientTextView gradientTextView3 = this.f90550d;
        if (gradientTextView3 == null) {
            f0.S("tvDiscountDesc");
        } else {
            gradientTextView2 = gradientTextView3;
        }
        gradientTextView2.setColors(iE, iE2);
        getTvCouponDesc().setBackground(q.o(getContext(), R.color.gold_light, 3.0f));
    }

    public final void b(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 41883, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f90553g;
        if (imageView == null) {
            f0.S("ivArrow");
            imageView = null;
        }
        imageView.setRotation(z10 ? 0.0f : 180.0f);
    }

    @dl.d
    public final TextView getTvCouponDesc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41880, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f90552f;
        if (textView != null) {
            return textView;
        }
        f0.S("tvCouponDesc");
        return null;
    }

    public final void setData(@e String str, @e String str2, @e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 41884, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f90548b;
        LinearLayout linearLayout = null;
        GradientTextView gradientTextView = null;
        if (textView == null) {
            f0.S("tvFinalPrice");
            textView = null;
        }
        textView.setText(str);
        if (n.p(str2) > 0.0f) {
            LinearLayout linearLayout2 = this.f90549c;
            if (linearLayout2 == null) {
                f0.S("vgDiscount");
                linearLayout2 = null;
            }
            linearLayout2.setVisibility(0);
            GradientTextView gradientTextView2 = this.f90551e;
            if (gradientTextView2 == null) {
                f0.S("tvDiscount");
            } else {
                gradientTextView = gradientTextView2;
            }
            gradientTextView.setText(str2);
        } else {
            LinearLayout linearLayout3 = this.f90549c;
            if (linearLayout3 == null) {
                f0.S("vgDiscount");
            } else {
                linearLayout = linearLayout3;
            }
            linearLayout.setVisibility(8);
        }
        if (c.u(str3)) {
            getTvCouponDesc().setVisibility(8);
        } else {
            getTvCouponDesc().setVisibility(0);
            getTvCouponDesc().setText(str3);
        }
    }

    public final void setTvCouponDesc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 41881, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f90552f = textView;
    }
}
