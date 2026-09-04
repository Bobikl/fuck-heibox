package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutNewcomerCouponBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f112471a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f112472b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112473c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112474d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112475e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112476f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112477g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112478h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f112479i;

    private k80(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 ConstraintLayout constraintLayout) {
        this.f112471a = cardView;
        this.f112472b = guideline;
        this.f112473c = textView;
        this.f112474d = textView2;
        this.f112475e = textView3;
        this.f112476f = textView4;
        this.f112477g = textView5;
        this.f112478h = textView6;
        this.f112479i = constraintLayout;
    }

    @androidx.annotation.n0
    public static k80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20942, new Class[]{View.class}, k80.class);
        if (patchProxyResultProxy.isSupported) {
            return (k80) patchProxyResultProxy.result;
        }
        int i10 = R.id.line_divider;
        Guideline guideline = (Guideline) l3.d.a(view, R.id.line_divider);
        if (guideline != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView != null) {
                i10 = R.id.tv_discount;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_discount);
                if (textView2 != null) {
                    i10 = R.id.tv_name;
                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                    if (textView3 != null) {
                        i10 = R.id.tv_price;
                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_price);
                        if (textView4 != null) {
                            i10 = R.id.tv_tag;
                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_tag);
                            if (textView5 != null) {
                                i10 = R.id.tv_unit;
                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_unit);
                                if (textView6 != null) {
                                    i10 = R.id.vg_price;
                                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_price);
                                    if (constraintLayout != null) {
                                        return new k80((CardView) view, guideline, textView, textView2, textView3, textView4, textView5, textView6, constraintLayout);
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
    public static k80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20940, new Class[]{LayoutInflater.class}, k80.class);
        return patchProxyResultProxy.isSupported ? (k80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20941, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k80.class);
        if (patchProxyResultProxy.isSupported) {
            return (k80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_newcomer_coupon, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f112471a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20943, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
