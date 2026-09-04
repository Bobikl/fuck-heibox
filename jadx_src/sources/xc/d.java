package xc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hblogistics.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HblogisticsFragmentLogisticsDialogBinding.java */
/* JADX INFO: loaded from: classes11.dex */
public final class d implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f141199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f141200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f141201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ProgressBar f141202d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final RecyclerView f141203e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f141204f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f141205g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f141206h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final TextView f141207i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final LinearLayout f141208j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final LinearLayout f141209k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final RelativeLayout f141210l;

    private d(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 ProgressBar progressBar, @n0 RecyclerView recyclerView, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2, @n0 RelativeLayout relativeLayout2) {
        this.f141199a = relativeLayout;
        this.f141200b = imageView;
        this.f141201c = imageView2;
        this.f141202d = progressBar;
        this.f141203e = recyclerView;
        this.f141204f = textView;
        this.f141205g = textView2;
        this.f141206h = textView3;
        this.f141207i = textView4;
        this.f141208j = linearLayout;
        this.f141209k = linearLayout2;
        this.f141210l = relativeLayout2;
    }

    @n0
    public static d a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.g.Zh, new Class[]{View.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_window_close;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.progress;
                ProgressBar progressBar = (ProgressBar) l3.d.a(view, i10);
                if (progressBar != null) {
                    i10 = R.id.rv_list;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, i10);
                    if (recyclerView != null) {
                        i10 = R.id.tv_copy;
                        TextView textView = (TextView) l3.d.a(view, i10);
                        if (textView != null) {
                            i10 = R.id.tv_express;
                            TextView textView2 = (TextView) l3.d.a(view, i10);
                            if (textView2 != null) {
                                i10 = R.id.tv_name;
                                TextView textView3 = (TextView) l3.d.a(view, i10);
                                if (textView3 != null) {
                                    i10 = R.id.tv_number;
                                    TextView textView4 = (TextView) l3.d.a(view, i10);
                                    if (textView4 != null) {
                                        i10 = R.id.vg_content;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                        if (linearLayout != null) {
                                            i10 = R.id.vg_img;
                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                            if (linearLayout2 != null) {
                                                i10 = R.id.vg_preview;
                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                                if (relativeLayout != null) {
                                                    return new d((RelativeLayout) view, imageView, imageView2, progressBar, recyclerView, textView, textView2, textView3, textView4, linearLayout, linearLayout2, relativeLayout);
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
    public static d c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.g.Xh, new Class[]{LayoutInflater.class}, d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static d d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.Yh, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hblogistics_fragment_logistics_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f141199a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.f32741ai, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
