package xd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbvideo.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: VideoBasicCenterPanelBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class b implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final FrameLayout f141252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f141253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f141254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f141255d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f141256e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f141257f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f141258g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final LinearLayout f141259h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final LinearLayout f141260i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final FrameLayout f141261j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final LinearLayout f141262k;

    private b(@n0 FrameLayout frameLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 ImageView imageView3, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2, @n0 FrameLayout frameLayout2, @n0 LinearLayout linearLayout3) {
        this.f141252a = frameLayout;
        this.f141253b = imageView;
        this.f141254c = imageView2;
        this.f141255d = imageView3;
        this.f141256e = textView;
        this.f141257f = textView2;
        this.f141258g = textView3;
        this.f141259h = linearLayout;
        this.f141260i = linearLayout2;
        this.f141261j = frameLayout2;
        this.f141262k = linearLayout3;
    }

    @n0
    public static b a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.nw, new Class[]{View.class}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_loading;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_speed_up_left;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.iv_speed_up_right;
                ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                if (imageView3 != null) {
                    i10 = R.id.tv_loading_info;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.tv_loading_speed;
                        TextView textView2 = (TextView) l3.d.a(view, i10);
                        if (textView2 != null) {
                            i10 = R.id.tv_seeking_info;
                            TextView textView3 = (TextView) l3.d.a(view, i10);
                            if (textView3 != null) {
                                i10 = R.id.vg_fast_play;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_loading;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                    if (linearLayout2 != null) {
                                        i10 = R.id.vg_loading_container;
                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
                                        if (frameLayout != null) {
                                            i10 = R.id.vg_seeking_info;
                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, i10);
                                            if (linearLayout3 != null) {
                                                return new b((FrameLayout) view, imageView, imageView2, imageView3, textView, textView2, textView3, linearLayout, linearLayout2, frameLayout, linearLayout3);
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
    public static b c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.lw, new Class[]{LayoutInflater.class}, b.class);
        return patchProxyResultProxy.isSupported ? (b) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static b d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.mw, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, b.class);
        if (patchProxyResultProxy.isSupported) {
            return (b) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.video_basic_center_panel, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public FrameLayout b() {
        return this.f141252a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.ow, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
