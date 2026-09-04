package cd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbqrcode.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import l3.c;
import l3.d;

/* JADX INFO: compiled from: HbqrcodeCustomBarcodeScannerBinding.java */
/* JADX INFO: loaded from: classes12.dex */
public final class b implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f35641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f35642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final FrameLayout f35643c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final RelativeLayout f35644d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f35645e;

    private b(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 FrameLayout frameLayout, @n0 RelativeLayout relativeLayout2, @n0 TextView textView) {
        this.f35641a = relativeLayout;
        this.f35642b = imageView;
        this.f35643c = frameLayout;
        this.f35644d = relativeLayout2;
        this.f35645e = textView;
    }

    @n0
    public static b a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.S0, new Class[]{View.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_laser;
        ImageView imageView = (ImageView) d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.rim;
            FrameLayout frameLayout = (FrameLayout) d.a(view, i10);
            if (frameLayout != null) {
                i10 = R.id.v_mask;
                RelativeLayout relativeLayout = (RelativeLayout) d.a(view, i10);
                if (relativeLayout != null) {
                    i10 = R.id.zxing_status_view;
                    TextView textView = (TextView) d.a(view, i10);
                    if (textView != null) {
                        return new b((RelativeLayout) view, imageView, frameLayout, relativeLayout, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static b c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.Q0, new Class[]{LayoutInflater.class}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static b d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.R0, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbqrcode_custom_barcode_scanner, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f35641a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.T0, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
