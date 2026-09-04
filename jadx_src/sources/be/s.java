package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletLayoutHeaderWalletHistoryBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f35400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f35401b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f35402c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f35403d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f35404e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f35405f;

    private s(@n0 LinearLayout linearLayout, @n0 ImageView imageView, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4) {
        this.f35400a = linearLayout;
        this.f35401b = imageView;
        this.f35402c = textView;
        this.f35403d = textView2;
        this.f35404e = textView3;
        this.f35405f = textView4;
    }

    @n0
    public static s a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.B5, new Class[]{View.class}, s.class);
        if (patchProxyResultProxy.isSupported) {
            return (s) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_tag;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.tv_desc;
            TextView textView = (TextView) l3.d.a(view, i10);
            if (textView != null) {
                i10 = R.id.tv_recharge;
                TextView textView2 = (TextView) l3.d.a(view, i10);
                if (textView2 != null) {
                    i10 = R.id.tv_title;
                    TextView textView3 = (TextView) l3.d.a(view, i10);
                    if (textView3 != null) {
                        i10 = R.id.tv_withdraw_record;
                        TextView textView4 = (TextView) l3.d.a(view, i10);
                        if (textView4 != null) {
                            return new s((LinearLayout) view, imageView, textView, textView2, textView3, textView4);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static s c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34580z5, new Class[]{LayoutInflater.class}, s.class);
        return patchProxyResultProxy.isSupported ? (s) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static s d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.A5, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s.class);
        if (patchProxyResultProxy.isSupported) {
            return (s) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_layout_header_wallet_history, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f35400a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 10240, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
