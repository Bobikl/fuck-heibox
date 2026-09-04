package xd;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextClock;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbvideo.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: VideoTopStatusBinding.java */
/* JADX INFO: loaded from: classes13.dex */
public final class h implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f141287a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final ImageView f141288b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f141289c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextClock f141290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f141291e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f141292f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final View f141293g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final LinearLayout f141294h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final RelativeLayout f141295i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final LinearLayout f141296j;

    private h(@n0 RelativeLayout relativeLayout, @n0 ImageView imageView, @n0 ImageView imageView2, @n0 TextClock textClock, @n0 TextView textView, @n0 TextView textView2, @n0 View view, @n0 LinearLayout linearLayout, @n0 RelativeLayout relativeLayout2, @n0 LinearLayout linearLayout2) {
        this.f141287a = relativeLayout;
        this.f141288b = imageView;
        this.f141289c = imageView2;
        this.f141290d = textClock;
        this.f141291e = textView;
        this.f141292f = textView2;
        this.f141293g = view;
        this.f141294h = linearLayout;
        this.f141295i = relativeLayout2;
        this.f141296j = linearLayout2;
    }

    @n0
    public static h a(@n0 View view) {
        View viewA;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.k.Lw, new Class[]{View.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_charging;
        ImageView imageView = (ImageView) l3.d.a(view, i10);
        if (imageView != null) {
            i10 = R.id.iv_isp;
            ImageView imageView2 = (ImageView) l3.d.a(view, i10);
            if (imageView2 != null) {
                i10 = R.id.tc_clock;
                TextClock textClock = (TextClock) l3.d.a(view, i10);
                if (textClock != null) {
                    i10 = R.id.tv_battery_remain;
                    TextView textView = (TextView) l3.d.a(view, i10);
                    if (textView != null) {
                        i10 = R.id.tv_clock;
                        TextView textView2 = (TextView) l3.d.a(view, i10);
                        if (textView2 != null && (viewA = l3.d.a(view, (i10 = R.id.v_battery_content))) != null) {
                            i10 = R.id.vg_battery;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                            if (linearLayout != null) {
                                i10 = R.id.vg_battery_icon;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, i10);
                                if (relativeLayout != null) {
                                    i10 = R.id.vg_clock;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                    if (linearLayout2 != null) {
                                        return new h((RelativeLayout) view, imageView, imageView2, textClock, textView, textView2, viewA, linearLayout, relativeLayout, linearLayout2);
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
    public static h c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.k.Jw, new Class[]{LayoutInflater.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static h d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.k.Kw, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.video_top_status, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f141287a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.k.Mw, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
