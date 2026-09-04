package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutNewcomerGameBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class n80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f113732a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113733b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f113734c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113735d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113736e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113737f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113738g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113739h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113740i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113741j;

    private n80(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f113732a = constraintLayout;
        this.f113733b = imageView;
        this.f113734c = qMUIRadiusImageView;
        this.f113735d = textView;
        this.f113736e = textView2;
        this.f113737f = textView3;
        this.f113738g = textView4;
        this.f113739h = textView5;
        this.f113740i = view;
        this.f113741j = relativeLayout;
    }

    @androidx.annotation.n0
    public static n80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20954, new Class[]{View.class}, n80.class);
        if (patchProxyResultProxy.isSupported) {
            return (n80) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_chart;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_chart);
        if (imageView != null) {
            i10 = R.id.iv_img;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_img);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.tv_name;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_name);
                if (textView != null) {
                    i10 = R.id.tv_price;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_price);
                    if (textView2 != null) {
                        i10 = R.id.tv_price_left;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_price_left);
                        if (textView3 != null) {
                            i10 = R.id.tv_price_right;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_price_right);
                            if (textView4 != null) {
                                i10 = R.id.tv_unit;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_unit);
                                if (textView5 != null) {
                                    i10 = R.id.v_triangle;
                                    View viewA = l3.d.a(view, R.id.v_triangle);
                                    if (viewA != null) {
                                        i10 = R.id.vg_new_price;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_new_price);
                                        if (relativeLayout != null) {
                                            return new n80((ConstraintLayout) view, imageView, qMUIRadiusImageView, textView, textView2, textView3, textView4, textView5, viewA, relativeLayout);
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
    public static n80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20952, new Class[]{LayoutInflater.class}, n80.class);
        return patchProxyResultProxy.isSupported ? (n80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static n80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20953, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, n80.class);
        if (patchProxyResultProxy.isSupported) {
            return (n80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_newcomer_game, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f113732a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20955, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
