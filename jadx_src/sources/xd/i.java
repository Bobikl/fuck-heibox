package xd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbvideo.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: VideoUiLayoutBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class i implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final FrameLayout f141297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final FrameLayout f141298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final FrameLayout f141299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final ImageView f141300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final ImageView f141301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final ImageView f141302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final ImageView f141303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final ImageView f141304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final ProgressBar f141305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final FrameLayout f141306j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final TextView f141307k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final FrameLayout f141308l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final FrameLayout f141309m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @n0
    public final LinearLayout f141310n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @n0
    public final RelativeLayout f141311o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @n0
    public final RelativeLayout f141312p;

    private i(@n0 FrameLayout frameLayout, @n0 FrameLayout frameLayout2, @n0 FrameLayout frameLayout3, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 ImageView imageView3, @n0 ImageView imageView4, @n0 ImageView imageView5, @n0 ProgressBar progressBar, @n0 FrameLayout frameLayout4, @n0 TextView textView, @n0 FrameLayout frameLayout5, @n0 FrameLayout frameLayout6, @n0 LinearLayout linearLayout, @n0 RelativeLayout relativeLayout, @n0 RelativeLayout relativeLayout2) {
        this.f141297a = frameLayout;
        this.f141298b = frameLayout2;
        this.f141299c = frameLayout3;
        this.f141300d = imageView;
        this.f141301e = imageView2;
        this.f141302f = imageView3;
        this.f141303g = imageView4;
        this.f141304h = imageView5;
        this.f141305i = progressBar;
        this.f141306j = frameLayout4;
        this.f141307k = textView;
        this.f141308l = frameLayout5;
        this.f141309m = frameLayout6;
        this.f141310n = linearLayout;
        this.f141311o = relativeLayout;
        this.f141312p = relativeLayout2;
    }

    @n0
    public static i a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Pw, new Class[]{View.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_panel;
        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
        if (frameLayout != null) {
            i10 = R.id.center_panel;
            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, i10);
            if (frameLayout2 != null) {
                i10 = R.id.iv_brightness_icon;
                ImageView imageView = (ImageView) l3.d.a(view, i10);
                if (imageView != null) {
                    i10 = R.id.iv_cover;
                    ImageView imageView2 = (ImageView) l3.d.a(view, i10);
                    if (imageView2 != null) {
                        i10 = R.id.iv_lock;
                        ImageView imageView3 = (ImageView) l3.d.a(view, i10);
                        if (imageView3 != null) {
                            i10 = R.id.iv_volume_icon_left;
                            ImageView imageView4 = (ImageView) l3.d.a(view, i10);
                            if (imageView4 != null) {
                                i10 = R.id.iv_volume_icon_right;
                                ImageView imageView5 = (ImageView) l3.d.a(view, i10);
                                if (imageView5 != null) {
                                    i10 = R.id.pb_sys_info;
                                    ProgressBar progressBar = (ProgressBar) l3.d.a(view, i10);
                                    if (progressBar != null) {
                                        i10 = R.id.top_panel;
                                        FrameLayout frameLayout3 = (FrameLayout) l3.d.a(view, i10);
                                        if (frameLayout3 != null) {
                                            i10 = R.id.tv_error_message;
                                            TextView textView = (TextView) l3.d.a(view, i10);
                                            if (textView != null) {
                                                i10 = R.id.vg_completed;
                                                FrameLayout frameLayout4 = (FrameLayout) l3.d.a(view, i10);
                                                if (frameLayout4 != null) {
                                                    i10 = R.id.vg_error;
                                                    FrameLayout frameLayout5 = (FrameLayout) l3.d.a(view, i10);
                                                    if (frameLayout5 != null) {
                                                        i10 = R.id.vg_sys_info;
                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                                        if (linearLayout != null) {
                                                            i10 = R.id.vg_ui;
                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                                            if (relativeLayout != null) {
                                                                i10 = R.id.vg_volume_icon;
                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, i10);
                                                                if (relativeLayout2 != null) {
                                                                    return new i((FrameLayout) view, frameLayout, frameLayout2, imageView, imageView2, imageView3, imageView4, imageView5, progressBar, frameLayout3, textView, frameLayout4, frameLayout5, linearLayout, relativeLayout, relativeLayout2);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static i c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.Nw, new Class[]{LayoutInflater.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static i d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Ow, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.video_ui_layout, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public FrameLayout b() {
        return this.f141297a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Qw, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
