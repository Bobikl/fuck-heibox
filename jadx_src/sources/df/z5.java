package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogMissonEventBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118207b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f118208c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118209d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118210e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118211f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118212g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118213h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118214i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118215j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118216k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118217l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118218m;

    private z5(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 View view, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f118206a = relativeLayout;
        this.f118207b = imageView;
        this.f118208c = view;
        this.f118209d = textView;
        this.f118210e = textView2;
        this.f118211f = textView3;
        this.f118212g = textView4;
        this.f118213h = textView5;
        this.f118214i = textView6;
        this.f118215j = linearLayout;
        this.f118216k = linearLayout2;
        this.f118217l = linearLayout3;
        this.f118218m = linearLayout4;
    }

    @androidx.annotation.n0
    public static z5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16964, new Class[]{View.class}, z5.class);
        if (patchProxyResultProxy.isSupported) {
            return (z5) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.line_v;
            View viewA = l3.d.a(view, R.id.line_v);
            if (viewA != null) {
                i10 = R.id.tv_award_coin;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_award_coin);
                if (textView != null) {
                    i10 = R.id.tv_award_exp;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_award_exp);
                    if (textView2 != null) {
                        i10 = R.id.tv_mission_msg;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_mission_msg);
                        if (textView3 != null) {
                            i10 = R.id.tv_negative_button;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_negative_button);
                            if (textView4 != null) {
                                i10 = R.id.tv_positive_button;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_positive_button);
                                if (textView5 != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_title);
                                    if (textView6 != null) {
                                        i10 = R.id.vg_award_coin;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_award_coin);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_award_exp;
                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_award_exp);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.vg_button_panel;
                                                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_button_panel);
                                                if (linearLayout3 != null) {
                                                    i10 = R.id.vg_text;
                                                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_text);
                                                    if (linearLayout4 != null) {
                                                        return new z5((RelativeLayout) view, imageView, viewA, textView, textView2, textView3, textView4, textView5, textView6, linearLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static z5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16962, new Class[]{LayoutInflater.class}, z5.class);
        return patchProxyResultProxy.isSupported ? (z5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16963, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z5.class);
        if (patchProxyResultProxy.isSupported) {
            return (z5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_misson_event, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118206a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16965, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
