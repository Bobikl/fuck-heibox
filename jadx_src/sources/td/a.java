package td;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbutils.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogHeyboxBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class a implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final ConstraintLayout f140689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final CardView f140690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f140691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f140692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f140693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f140694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f140695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final View f140696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final LinearLayout f140697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final LinearLayout f140698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final RelativeLayout f140699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final LinearLayout f140700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final ConstraintLayout f140701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @n0
    public final LinearLayout f140702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @n0
    public final FrameLayout f140703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @n0
    public final RelativeLayout f140704p;

    private a(@n0 ConstraintLayout constraintLayout, @n0 CardView cardView, @n0 ImageView imageView, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 View view, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2, @n0 RelativeLayout relativeLayout, @n0 LinearLayout linearLayout3, @n0 ConstraintLayout constraintLayout2, @n0 LinearLayout linearLayout4, @n0 FrameLayout frameLayout, @n0 RelativeLayout relativeLayout2) {
        this.f140689a = constraintLayout;
        this.f140690b = cardView;
        this.f140691c = imageView;
        this.f140692d = textView;
        this.f140693e = textView2;
        this.f140694f = textView3;
        this.f140695g = textView4;
        this.f140696h = view;
        this.f140697i = linearLayout;
        this.f140698j = linearLayout2;
        this.f140699k = relativeLayout;
        this.f140700l = linearLayout3;
        this.f140701m = constraintLayout2;
        this.f140702n = linearLayout4;
        this.f140703o = frameLayout;
        this.f140704p = relativeLayout2;
    }

    @n0
    public static a a(@n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Rn, new Class[]{View.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_bg;
        CardView cardView = (CardView) l3.d.a(view, i10);
        if (cardView != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.tv_message;
                TextView textView = (TextView) l3.d.a(view, i10);
                if (textView != null) {
                    i10 = R.id.tv_negative_button;
                    TextView textView2 = (TextView) l3.d.a(view, i10);
                    if (textView2 != null) {
                        i10 = R.id.tv_positive_button;
                        TextView textView3 = (TextView) l3.d.a(view, i10);
                        if (textView3 != null) {
                            i10 = R.id.tv_title;
                            TextView textView4 = (TextView) l3.d.a(view, i10);
                            if (textView4 != null && (viewA = l3.d.a(view, (i10 = R.id.v_btn_divider))) != null) {
                                i10 = R.id.vg_bg;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_button_panel;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.vg_center_view;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_components;
                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, i10);
                                            if (linearLayout3 != null) {
                                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                i10 = R.id.vg_fixed_view;
                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, i10);
                                                if (linearLayout4 != null) {
                                                    i10 = R.id.vg_top_icon;
                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
                                                    if (frameLayout != null) {
                                                        i10 = R.id.vg_top_view;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, i10);
                                                        if (relativeLayout2 != null) {
                                                            return new a(constraintLayout, cardView, imageView, textView, textView2, textView3, textView4, viewA, linearLayout, linearLayout2, relativeLayout, linearLayout3, constraintLayout, linearLayout4, frameLayout, relativeLayout2);
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
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static a c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.Pn, new Class[]{LayoutInflater.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static a d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Qn, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_heybox, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public ConstraintLayout b() {
        return this.f140689a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Sn, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
