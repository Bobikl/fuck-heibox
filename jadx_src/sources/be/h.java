package be;

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
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletDialogRefundDetailBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f35298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f35299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f35300c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f35301d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f35302e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f35303f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f35304g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f35305h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final TextView f35306i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final FrameLayout f35307j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final LinearLayout f35308k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final LinearLayout f35309l;

    private h(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 TextView textView5, @n0 TextView textView6, @n0 FrameLayout frameLayout, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2) {
        this.f35298a = relativeLayout;
        this.f35299b = imageView;
        this.f35300c = imageView2;
        this.f35301d = textView;
        this.f35302e = textView2;
        this.f35303f = textView3;
        this.f35304g = textView4;
        this.f35305h = textView5;
        this.f35306i = textView6;
        this.f35307j = frameLayout;
        this.f35308k = linearLayout;
        this.f35309l = linearLayout2;
    }

    @n0
    public static h a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.J4, new Class[]{View.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_close;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_refund_way;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.tv_cancel;
                TextView textView = (TextView) l3.d.a(view, i10);
                if (textView != null) {
                    i10 = R.id.tv_confirm;
                    TextView textView2 = (TextView) l3.d.a(view, i10);
                    if (textView2 != null) {
                        i10 = R.id.tv_fee_title;
                        TextView textView3 = (TextView) l3.d.a(view, i10);
                        if (textView3 != null) {
                            i10 = R.id.tv_price;
                            TextView textView4 = (TextView) l3.d.a(view, i10);
                            if (textView4 != null) {
                                i10 = R.id.tv_refund_way;
                                TextView textView5 = (TextView) l3.d.a(view, i10);
                                if (textView5 != null) {
                                    i10 = R.id.tv_tips;
                                    TextView textView6 = (TextView) l3.d.a(view, i10);
                                    if (textView6 != null) {
                                        i10 = R.id.vg_bg;
                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
                                        if (frameLayout != null) {
                                            i10 = R.id.vg_bottom_bar;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                            if (linearLayout != null) {
                                                i10 = R.id.vg_fee_title;
                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                                if (linearLayout2 != null) {
                                                    return new h((RelativeLayout) view, imageView, imageView2, textView, textView2, textView3, textView4, textView5, textView6, frameLayout, linearLayout, linearLayout2);
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
    public static h c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.H4, new Class[]{LayoutInflater.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static h d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.I4, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_dialog_refund_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f35298a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.K4, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
