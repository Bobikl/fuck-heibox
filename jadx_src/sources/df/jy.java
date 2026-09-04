package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemSellerBargainOrderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jy implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f112302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112304c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112305d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112306e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112307f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112308g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112309h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f112310i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f112311j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112312k;

    private jy(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 Guideline guideline2, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f112302a = constraintLayout;
        this.f112303b = imageView;
        this.f112304c = textView;
        this.f112305d = textView2;
        this.f112306e = textView3;
        this.f112307f = textView4;
        this.f112308g = textView5;
        this.f112309h = textView6;
        this.f112310i = guideline;
        this.f112311j = guideline2;
        this.f112312k = linearLayout;
    }

    @androidx.annotation.n0
    public static jy a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19904, new Class[]{View.class}, jy.class);
        if (patchProxyResultProxy.isSupported) {
            return (jy) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_check;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_check);
        if (imageView != null) {
            i10 = R.id.tv_create_time;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_create_time);
            if (textView != null) {
                i10 = R.id.tv_price;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_price);
                if (textView2 != null) {
                    i10 = R.id.tv_profit;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_profit);
                    if (textView3 != null) {
                        i10 = R.id.tv_state_desc;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_state_desc);
                        if (textView4 != null) {
                            i10 = R.id.tv_time_left;
                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_time_left);
                            if (textView5 != null) {
                                i10 = R.id.tv_time_left_desc;
                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_time_left_desc);
                                if (textView6 != null) {
                                    i10 = R.id.v_divider_1;
                                    Guideline guideline = (Guideline) l3.d.a(view, R.id.v_divider_1);
                                    if (guideline != null) {
                                        i10 = R.id.v_divider_2;
                                        Guideline guideline2 = (Guideline) l3.d.a(view, R.id.v_divider_2);
                                        if (guideline2 != null) {
                                            i10 = R.id.vg_price;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_price);
                                            if (linearLayout != null) {
                                                return new jy((ConstraintLayout) view, imageView, textView, textView2, textView3, textView4, textView5, textView6, guideline, guideline2, linearLayout);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static jy c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19902, new Class[]{LayoutInflater.class}, jy.class);
        return patchProxyResultProxy.isSupported ? (jy) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jy d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19903, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jy.class);
        if (patchProxyResultProxy.isSupported) {
            return (jy) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_seller_bargain_order, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f112302a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19905, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
