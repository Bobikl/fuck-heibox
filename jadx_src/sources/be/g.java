package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
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

/* JADX INFO: compiled from: HbwalletDialogHcashExchangeBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f35285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final EditText f35286b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f35287c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f35288d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final ImageView f35289e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f35290f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f35291g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f35292h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final TextView f35293i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final TextView f35294j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final TextView f35295k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final FrameLayout f35296l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final LinearLayout f35297m;

    private g(@n0 RelativeLayout relativeLayout, @n0 EditText editText, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 ImageView imageView3, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 TextView textView5, @n0 TextView textView6, @n0 FrameLayout frameLayout, @n0 LinearLayout linearLayout) {
        this.f35285a = relativeLayout;
        this.f35286b = editText;
        this.f35287c = imageView;
        this.f35288d = imageView2;
        this.f35289e = imageView3;
        this.f35290f = textView;
        this.f35291g = textView2;
        this.f35292h = textView3;
        this.f35293i = textView4;
        this.f35294j = textView5;
        this.f35295k = textView6;
        this.f35296l = frameLayout;
        this.f35297m = linearLayout;
    }

    @n0
    public static g a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.F4, new Class[]{View.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_hcash;
        EditText editText = (EditText) l3.d.a(view, i10);
        if (editText != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                i10 = R.id.iv_desc_tag;
                ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                if (imageView2 != null) {
                    i10 = R.id.iv_exchange_tag;
                    ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                    if (imageView3 != null) {
                        i10 = R.id.tv_all_exchange;
                        TextView textView = (TextView) l3.d.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.tv_can_exchange;
                            TextView textView2 = (TextView) l3.d.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.tv_confirm;
                                TextView textView3 = (TextView) l3.d.a(view, i10);
                                if (textView3 != null) {
                                    i10 = R.id.tv_exchange_desc;
                                    TextView textView4 = (TextView) l3.d.a(view, i10);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_type_desc;
                                        TextView textView5 = (TextView) l3.d.a(view, i10);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_value;
                                            TextView textView6 = (TextView) l3.d.a(view, i10);
                                            if (textView6 != null) {
                                                i10 = R.id.vg_bg;
                                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
                                                if (frameLayout != null) {
                                                    i10 = R.id.vg_bottom_bar;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                                    if (linearLayout != null) {
                                                        return new g((RelativeLayout) view, editText, imageView, imageView2, imageView3, textView, textView2, textView3, textView4, textView5, textView6, frameLayout, linearLayout);
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
    public static g c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.D4, new Class[]{LayoutInflater.class}, g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static g d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.E4, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_dialog_hcash_exchange, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f35285a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.G4, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
