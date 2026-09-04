package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSUserSectionView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFeedsConfigTopView5Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f108369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f108370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSUserSectionView f108371d;

    private a50(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 BBSUserSectionView bBSUserSectionView) {
        this.f108368a = relativeLayout;
        this.f108369b = imageView;
        this.f108370c = relativeLayout2;
        this.f108371d = bBSUserSectionView;
    }

    @androidx.annotation.n0
    public static a50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20592, new Class[]{View.class}, a50.class);
        if (patchProxyResultProxy.isSupported) {
            return (a50) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_link_more;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_link_more);
        if (imageView != null) {
            RelativeLayout relativeLayout = (RelativeLayout) view;
            BBSUserSectionView bBSUserSectionView = (BBSUserSectionView) l3.d.a(view, R.id.vg_user);
            if (bBSUserSectionView != null) {
                return new a50(relativeLayout, imageView, relativeLayout, bBSUserSectionView);
            }
            i10 = R.id.vg_user;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static a50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20590, new Class[]{LayoutInflater.class}, a50.class);
        return patchProxyResultProxy.isSupported ? (a50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20591, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a50.class);
        if (patchProxyResultProxy.isSupported) {
            return (a50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_feeds_config_top_view_5, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108368a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20593, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
