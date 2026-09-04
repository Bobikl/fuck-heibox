package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ActivityHeyboxSsoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f115007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f115008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115009c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115010d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115011e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115013g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115014h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115015i;

    private r0(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f115007a = frameLayout;
        this.f115008b = qMUIRadiusImageView;
        this.f115009c = imageView;
        this.f115010d = imageView2;
        this.f115011e = textView;
        this.f115012f = textView2;
        this.f115013g = textView3;
        this.f115014h = textView4;
        this.f115015i = frameLayout2;
    }

    @androidx.annotation.n0
    public static r0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16412, new Class[]{View.class}, r0.class);
        if (patchProxyResultProxy.isSupported) {
            return (r0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_app_icon;
        QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_app_icon);
        if (qMUIRadiusImageView != null) {
            i10 = R.id.iv_avartar;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avartar);
            if (imageView != null) {
                i10 = R.id.iv_bg;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bg);
                if (imageView2 != null) {
                    i10 = R.id.tv_app_name;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_app_name);
                    if (textView != null) {
                        i10 = R.id.tv_auth_btn;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_auth_btn);
                        if (textView2 != null) {
                            i10 = R.id.tv_auth_title;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_auth_title);
                            if (textView3 != null) {
                                i10 = R.id.tv_username;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_username);
                                if (textView4 != null) {
                                    i10 = R.id.vg_avartar;
                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_avartar);
                                    if (frameLayout != null) {
                                        return new r0((FrameLayout) view, qMUIRadiusImageView, imageView, imageView2, textView, textView2, textView3, textView4, frameLayout);
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

    @androidx.annotation.n0
    public static r0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16410, new Class[]{LayoutInflater.class}, r0.class);
        return patchProxyResultProxy.isSupported ? (r0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16411, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r0.class);
        if (patchProxyResultProxy.isSupported) {
            return (r0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_heybox_sso, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f115007a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16413, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
