package xd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbvideo.R;
import com.max.video.ui.widget.TopStatusView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: VideoStatusTopPanelBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class g implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f141280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f141281b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TopStatusView f141282c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f141283d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final LinearLayout f141284e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final LinearLayout f141285f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final LinearLayout f141286g;

    private g(@n0 LinearLayout linearLayout, @n0 ImageView imageView, @n0 TopStatusView topStatusView, @n0 TextView textView, @n0 LinearLayout linearLayout2, @n0 LinearLayout linearLayout3, @n0 LinearLayout linearLayout4) {
        this.f141280a = linearLayout;
        this.f141281b = imageView;
        this.f141282c = topStatusView;
        this.f141283d = textView;
        this.f141284e = linearLayout2;
        this.f141285f = linearLayout3;
        this.f141286g = linearLayout4;
    }

    @n0
    public static g a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Hw, new Class[]{View.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_backward;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.top_status_view;
            TopStatusView topStatusView = (TopStatusView) l3.d.a(view, i10);
            if (topStatusView != null) {
                i10 = R.id.tv_title;
                TextView textView = (TextView) l3.d.a(view, i10);
                if (textView != null) {
                    i10 = R.id.vg_ext;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                    if (linearLayout != null) {
                        i10 = R.id.vg_title_bar;
                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                        if (linearLayout2 != null) {
                            LinearLayout linearLayout3 = (LinearLayout) view;
                            return new g(linearLayout3, imageView, topStatusView, textView, linearLayout, linearLayout2, linearLayout3);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static g c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.Fw, new Class[]{LayoutInflater.class}, g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static g d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Gw, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.video_status_top_panel, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f141280a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Iw, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
