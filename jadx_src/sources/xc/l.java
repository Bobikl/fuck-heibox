package xc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hblogistics.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HblogisticsPreviewBinding.java */
/* JADX INFO: loaded from: classes11.dex */
public final class l implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f141241a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f141242b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f141243c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f141244d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f141245e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f141246f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final LinearLayout f141247g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final LinearLayout f141248h;

    private l(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2) {
        this.f141241a = relativeLayout;
        this.f141242b = imageView;
        this.f141243c = imageView2;
        this.f141244d = textView;
        this.f141245e = textView2;
        this.f141246f = textView3;
        this.f141247g = linearLayout;
        this.f141248h = linearLayout2;
    }

    @n0
    public static l a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.g.Fi, new Class[]{View.class}, l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_status;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.tv_status;
                TextView textView = (TextView) l3.d.a(view, i10);
                if (textView != null) {
                    i10 = R.id.tv_time;
                    TextView textView2 = (TextView) l3.d.a(view, i10);
                    if (textView2 != null) {
                        i10 = R.id.tv_title;
                        TextView textView3 = (TextView) l3.d.a(view, i10);
                        if (textView3 != null) {
                            i10 = R.id.vg_img;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                            if (linearLayout != null) {
                                i10 = R.id.vg_status;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                if (linearLayout2 != null) {
                                    return new l((RelativeLayout) view, imageView, imageView2, textView, textView2, textView3, linearLayout, linearLayout2);
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
    public static l c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.g.Di, new Class[]{LayoutInflater.class}, l.class);
        return patchProxyResultProxy.isSupported ? (l) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static l d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.Ei, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hblogistics_preview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f141241a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Gi, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
