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
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: VideoBasicTopPanelBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class d implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f141270a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f141271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f141272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final LinearLayout f141273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final LinearLayout f141274e;

    private d(@n0 LinearLayout linearLayout, @n0 ImageView imageView, @n0 TextView textView, @n0 LinearLayout linearLayout2, @n0 LinearLayout linearLayout3) {
        this.f141270a = linearLayout;
        this.f141271b = imageView;
        this.f141272c = textView;
        this.f141273d = linearLayout2;
        this.f141274e = linearLayout3;
    }

    @n0
    public static d a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.vw, new Class[]{View.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_backward;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.tv_title;
            TextView textView = (TextView) l3.d.a(view, i10);
            if (textView != null) {
                i10 = R.id.vg_ext;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                if (linearLayout != null) {
                    i10 = R.id.vg_title_bar;
                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                    if (linearLayout2 != null) {
                        return new d((LinearLayout) view, imageView, textView, linearLayout, linearLayout2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static d c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.tw, new Class[]{LayoutInflater.class}, d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static d d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.uw, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.video_basic_top_panel, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f141270a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.ww, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
