package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

/* JADX INFO: compiled from: HbwalletDialogChoosePaytypeBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class f implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f35271a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f35272b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f35273c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f35274d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final ImageView f35275e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final ImageView f35276f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final ImageView f35277g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f35278h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final TextView f35279i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final TextView f35280j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final LinearLayout f35281k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final RelativeLayout f35282l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final RelativeLayout f35283m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @n0
    public final RelativeLayout f35284n;

    private f(@n0 LinearLayout linearLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 ImageView imageView3, @n0 ImageView imageView4, @n0 ImageView imageView5, @n0 ImageView imageView6, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 LinearLayout linearLayout2, @n0 RelativeLayout relativeLayout, @n0 RelativeLayout relativeLayout2, @n0 RelativeLayout relativeLayout3) {
        this.f35271a = linearLayout;
        this.f35272b = imageView;
        this.f35273c = imageView2;
        this.f35274d = imageView3;
        this.f35275e = imageView4;
        this.f35276f = imageView5;
        this.f35277g = imageView6;
        this.f35278h = textView;
        this.f35279i = textView2;
        this.f35280j = textView3;
        this.f35281k = linearLayout2;
        this.f35282l = relativeLayout;
        this.f35283m = relativeLayout2;
        this.f35284n = relativeLayout3;
    }

    @n0
    public static f a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.B4, new Class[]{View.class}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_checkmark_ali;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_checkmark_h5;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.iv_checkmark_weixin;
                ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                if (imageView3 != null) {
                    i10 = R.id.iv_icon_ali;
                    ImageView imageView4 = (ImageView) l3.d.a(view, i10);
                    if (imageView4 != null) {
                        i10 = R.id.iv_icon_h5;
                        ImageView imageView5 = (ImageView) l3.d.a(view, i10);
                        if (imageView5 != null) {
                            i10 = R.id.iv_icon_weixin;
                            ImageView imageView6 = (ImageView) l3.d.a(view, i10);
                            if (imageView6 != null) {
                                i10 = R.id.tv_ali_pay;
                                TextView textView = (TextView) l3.d.a(view, i10);
                                if (textView != null) {
                                    i10 = R.id.tv_h5_pay;
                                    TextView textView2 = (TextView) l3.d.a(view, i10);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_weixin_pay;
                                        TextView textView3 = (TextView) l3.d.a(view, i10);
                                        if (textView3 != null) {
                                            LinearLayout linearLayout = (LinearLayout) view;
                                            i10 = R.id.vg_pay_ali;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                            if (relativeLayout != null) {
                                                i10 = R.id.vg_pay_h5;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, i10);
                                                if (relativeLayout2 != null) {
                                                    i10 = R.id.vg_pay_weixin;
                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, i10);
                                                    if (relativeLayout3 != null) {
                                                        return new f(linearLayout, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, textView, textView2, textView3, linearLayout, relativeLayout, relativeLayout2, relativeLayout3);
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
    public static f c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34579z4, new Class[]{LayoutInflater.class}, f.class);
        return patchProxyResultProxy.isSupported ? (f) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static f d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.A4, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f.class);
        if (patchProxyResultProxy.isSupported) {
            return (f) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_dialog_choose_paytype, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f35271a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.C4, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
