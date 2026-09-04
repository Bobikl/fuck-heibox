package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MenuShareBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gd0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110942a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110943b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110944c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110945d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110946e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110947f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110948g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110949h;

    private gd0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6, @androidx.annotation.n0 LinearLayout linearLayout7, @androidx.annotation.n0 LinearLayout linearLayout8) {
        this.f110942a = linearLayout;
        this.f110943b = linearLayout2;
        this.f110944c = linearLayout3;
        this.f110945d = linearLayout4;
        this.f110946e = linearLayout5;
        this.f110947f = linearLayout6;
        this.f110948g = linearLayout7;
        this.f110949h = linearLayout8;
    }

    @androidx.annotation.n0
    public static gd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21441, new Class[]{View.class}, gd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gd0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_share_link;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_share_link);
        if (linearLayout != null) {
            i10 = R.id.vg_share_qq;
            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_share_qq);
            if (linearLayout2 != null) {
                i10 = R.id.vg_share_qzone;
                LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_share_qzone);
                if (linearLayout3 != null) {
                    i10 = R.id.vg_share_sina;
                    LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_share_sina);
                    if (linearLayout4 != null) {
                        i10 = R.id.vg_share_timeline;
                        LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_share_timeline);
                        if (linearLayout5 != null) {
                            i10 = R.id.vg_share_wechat;
                            LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_share_wechat);
                            if (linearLayout6 != null) {
                                i10 = R.id.vg_share_wechat_timeline;
                                LinearLayout linearLayout7 = (LinearLayout) l3.d.a(view, R.id.vg_share_wechat_timeline);
                                if (linearLayout7 != null) {
                                    return new gd0((LinearLayout) view, linearLayout, linearLayout2, linearLayout3, linearLayout4, linearLayout5, linearLayout6, linearLayout7);
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
    public static gd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21439, new Class[]{LayoutInflater.class}, gd0.class);
        return patchProxyResultProxy.isSupported ? (gd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21440, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (gd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.menu_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110942a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21442, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
