package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.BBSLinkListTopView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemChannelsLinkTopBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class af implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f108533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f108534b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BBSLinkListTopView f108535c;

    private af(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 BBSLinkListTopView bBSLinkListTopView) {
        this.f108533a = relativeLayout;
        this.f108534b = id0Var;
        this.f108535c = bBSLinkListTopView;
    }

    @androidx.annotation.n0
    public static af a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17904, new Class[]{View.class}, af.class);
        if (patchProxyResultProxy.isSupported) {
            return (af) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            id0 id0VarA = id0.a(viewA);
            BBSLinkListTopView bBSLinkListTopView = (BBSLinkListTopView) l3.d.a(view, R.id.llt);
            if (bBSLinkListTopView != null) {
                return new af((RelativeLayout) view, id0VarA, bBSLinkListTopView);
            }
            i10 = R.id.llt;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static af c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17902, new Class[]{LayoutInflater.class}, af.class);
        return patchProxyResultProxy.isSupported ? (af) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static af d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17903, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, af.class);
        if (patchProxyResultProxy.isSupported) {
            return (af) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_channels_link_top, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f108533a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17905, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
