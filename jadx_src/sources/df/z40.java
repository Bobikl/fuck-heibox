package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionSmallView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFeedsConfigTopView4Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class z40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118202a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118203b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118204c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionSmallView f118205d;

    private z40(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 BBSUserSectionSmallView bBSUserSectionSmallView) {
        this.f118202a = relativeLayout;
        this.f118203b = imageView;
        this.f118204c = relativeLayout2;
        this.f118205d = bBSUserSectionSmallView;
    }

    @androidx.annotation.n0
    public static z40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20588, new Class[]{View.class}, z40.class);
        if (patchProxyResultProxy.isSupported) {
            return (z40) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_link_more;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_link_more);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            BBSUserSectionSmallView bBSUserSectionSmallView = (BBSUserSectionSmallView) l3.d.a(view, R.id.vg_user);
            if (bBSUserSectionSmallView != null) {
                return new z40(relativeLayout, imageView, relativeLayout, bBSUserSectionSmallView);
            }
            i10 = R.id.vg_user;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static z40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20586, new Class[]{LayoutInflater.class}, z40.class);
        return patchProxyResultProxy.isSupported ? (z40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static z40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20587, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, z40.class);
        if (patchProxyResultProxy.isSupported) {
            return (z40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_feeds_config_top_view_4, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118202a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20589, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
