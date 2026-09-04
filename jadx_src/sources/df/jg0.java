package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.flexbox.FlexboxLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewMallProductBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f112182a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FlexboxLayout f112184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f112189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112194m;

    private jg0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 FlexboxLayout flexboxLayout, @androidx.annotation.n0 View view2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 View view3) {
        this.f112182a = constraintLayout;
        this.f112183b = view;
        this.f112184c = flexboxLayout;
        this.f112185d = view2;
        this.f112186e = imageView;
        this.f112187f = linearLayout;
        this.f112188g = linearLayout2;
        this.f112189h = barrier;
        this.f112190i = textView;
        this.f112191j = textView2;
        this.f112192k = textView3;
        this.f112193l = textView4;
        this.f112194m = view3;
    }

    @androidx.annotation.n0
    public static jg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21758, new Class[]{View.class}, jg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (jg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom;
        View viewA = l3.d.a(view, R.id.bottom);
        if (viewA != null) {
            i10 = R.id.fl_tags;
            FlexboxLayout flexboxLayout = (FlexboxLayout) l3.d.a(view, R.id.fl_tags);
            if (flexboxLayout != null) {
                i10 = R.id.img_divider;
                View viewA2 = l3.d.a(view, R.id.img_divider);
                if (viewA2 != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView != null) {
                        i10 = R.id.ll_htag;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_htag);
                        if (linearLayout != null) {
                            i10 = R.id.ll_price;
                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.ll_price);
                            if (linearLayout2 != null) {
                                i10 = R.id.top_barrier;
                                Barrier barrier = (Barrier) l3.d.a(view, R.id.top_barrier);
                                if (barrier != null) {
                                    i10 = R.id.tv_current_price;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_current_price);
                                    if (textView != null) {
                                        i10 = R.id.tv_discount;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_discount);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_name;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_original_price;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_original_price);
                                                if (textView4 != null) {
                                                    i10 = R.id.v_img_background;
                                                    View viewA3 = l3.d.a(view, R.id.v_img_background);
                                                    if (viewA3 != null) {
                                                        return new jg0((ConstraintLayout) view, viewA, flexboxLayout, viewA2, imageView, linearLayout, linearLayout2, barrier, textView, textView2, textView3, textView4, viewA3);
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
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static jg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21756, new Class[]{LayoutInflater.class}, jg0.class);
        return patchProxyResultProxy.isSupported ? (jg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21757, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (jg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_mall_product, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f112182a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21759, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
