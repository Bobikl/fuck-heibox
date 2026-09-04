package com.max.xiaoheihe.module.mall.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.google.android.flexbox.FlexboxLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: MallProductView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class MallProductView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f90533v = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f90534k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f90535l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public LinearLayout f90536m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f90537n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public FlexboxLayout f90538o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LinearLayout f90539p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public TextView f90540q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public TextView f90541r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public TextView f90542s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public View f90543t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public View f90544u;

    public MallProductView(@e Context context) {
        this(context, null);
    }

    public MallProductView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MallProductView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        h();
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41867, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View.inflate(getContext(), R.layout.view_mall_product, this);
        View viewFindViewById = findViewById(R.id.iv_img);
        f0.o(viewFindViewById, "findViewById(R.id.iv_img)");
        setIv_img((ImageView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.img_divider);
        f0.o(viewFindViewById2, "findViewById(R.id.img_divider)");
        setImg_divider(viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.ll_htag);
        f0.o(viewFindViewById3, "findViewById(R.id.ll_htag)");
        setLl_htag((LinearLayout) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_name);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_name)");
        setTv_name((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.fl_tags);
        f0.o(viewFindViewById5, "findViewById(R.id.fl_tags)");
        setFl_tags((FlexboxLayout) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.ll_price);
        f0.o(viewFindViewById6, "findViewById(R.id.ll_price)");
        setLl_price((LinearLayout) viewFindViewById6);
        View viewFindViewById7 = findViewById(R.id.tv_current_price);
        f0.o(viewFindViewById7, "findViewById(R.id.tv_current_price)");
        setTv_current_price((TextView) viewFindViewById7);
        View viewFindViewById8 = findViewById(R.id.tv_original_price);
        f0.o(viewFindViewById8, "findViewById(R.id.tv_original_price)");
        setTv_original_price((TextView) viewFindViewById8);
        View viewFindViewById9 = findViewById(R.id.tv_discount);
        f0.o(viewFindViewById9, "findViewById(R.id.tv_discount)");
        setTv_discount((TextView) viewFindViewById9);
        View viewFindViewById10 = findViewById(R.id.bottom);
        f0.o(viewFindViewById10, "findViewById(R.id.bottom)");
        setBottom(viewFindViewById10);
        View viewFindViewById11 = findViewById(R.id.v_img_background);
        f0.o(viewFindViewById11, "findViewById(R.id.v_img_background)");
        setVImgBackground(viewFindViewById11);
    }

    @Override // android.view.View
    @d
    public final View getBottom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41863, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f90543t;
        if (view != null) {
            return view;
        }
        f0.S("bottom");
        return null;
    }

    @d
    public final FlexboxLayout getFl_tags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41853, new Class[0], FlexboxLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlexboxLayout) patchProxyResultProxy.result;
        }
        FlexboxLayout flexboxLayout = this.f90538o;
        if (flexboxLayout != null) {
            return flexboxLayout;
        }
        f0.S("fl_tags");
        return null;
    }

    @d
    public final View getImg_divider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41847, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f90535l;
        if (view != null) {
            return view;
        }
        f0.S("img_divider");
        return null;
    }

    @d
    public final ImageView getIv_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41845, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f90534k;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_img");
        return null;
    }

    @d
    public final LinearLayout getLl_htag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41849, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f90536m;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_htag");
        return null;
    }

    @d
    public final LinearLayout getLl_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41855, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f90539p;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("ll_price");
        return null;
    }

    @d
    public final TextView getTv_current_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41857, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f90540q;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_current_price");
        return null;
    }

    @d
    public final TextView getTv_discount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41861, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f90542s;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_discount");
        return null;
    }

    @d
    public final TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41851, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f90537n;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    @d
    public final TextView getTv_original_price() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41859, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f90541r;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_original_price");
        return null;
    }

    @d
    public final View getVImgBackground() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41865, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f90544u;
        if (view != null) {
            return view;
        }
        f0.S("vImgBackground");
        return null;
    }

    public final void setBottom(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41864, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f90543t = view;
    }

    public final void setFl_tags(@d FlexboxLayout flexboxLayout) {
        if (PatchProxy.proxy(new Object[]{flexboxLayout}, this, changeQuickRedirect, false, 41854, new Class[]{FlexboxLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(flexboxLayout, "<set-?>");
        this.f90538o = flexboxLayout;
    }

    public final void setImg_divider(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41848, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f90535l = view;
    }

    public final void setIv_img(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 41846, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f90534k = imageView;
    }

    public final void setLl_htag(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 41850, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f90536m = linearLayout;
    }

    public final void setLl_price(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 41856, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f90539p = linearLayout;
    }

    public final void setName(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 41868, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_name().setText(str);
    }

    public final void setTv_current_price(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 41858, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f90540q = textView;
    }

    public final void setTv_discount(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 41862, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f90542s = textView;
    }

    public final void setTv_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 41852, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f90537n = textView;
    }

    public final void setTv_original_price(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 41860, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f90541r = textView;
    }

    public final void setVImgBackground(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 41866, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f90544u = view;
    }
}
