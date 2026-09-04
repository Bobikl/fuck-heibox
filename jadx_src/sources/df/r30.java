package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutDanmakuBottomOptionsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115069a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115070b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115071c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115072d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115073e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115074f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115075g;

    private r30(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f115069a = relativeLayout;
        this.f115070b = imageView;
        this.f115071c = imageView2;
        this.f115072d = textView;
        this.f115073e = textView2;
        this.f115074f = textView3;
        this.f115075g = relativeLayout2;
    }

    @androidx.annotation.n0
    public static r30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20454, new Class[]{View.class}, r30.class);
        if (patchProxyResultProxy.isSupported) {
            return (r30) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_danmaku_setting;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_danmaku_setting);
        if (imageView != null) {
            i10 = R.id.iv_danmaku_switcher;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_danmaku_switcher);
            if (imageView2 != null) {
                i10 = R.id.tv_bitrate;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_bitrate);
                if (textView != null) {
                    i10 = R.id.tv_send_danmaku;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_send_danmaku);
                    if (textView2 != null) {
                        i10 = R.id.tv_speed;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_speed);
                        if (textView3 != null) {
                            RelativeLayout relativeLayout = (RelativeLayout) view;
                            return new r30(relativeLayout, imageView, imageView2, textView, textView2, textView3, relativeLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static r30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20452, new Class[]{LayoutInflater.class}, r30.class);
        return patchProxyResultProxy.isSupported ? (r30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20453, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r30.class);
        if (patchProxyResultProxy.isSupported) {
            return (r30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_danmaku_bottom_options, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115069a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20455, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
