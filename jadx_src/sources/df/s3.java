package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ComponentGameGameListNormalBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f115429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.p f115430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115431c;

    private s3(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.p pVar, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f115429a = relativeLayout;
        this.f115430b = pVar;
        this.f115431c = relativeLayout2;
    }

    @androidx.annotation.n0
    public static s3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16728, new Class[]{View.class}, s3.class);
        if (patchProxyResultProxy.isSupported) {
            return (s3) patchProxyResultProxy.result;
        }
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.divider)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new s3(relativeLayout, mb.p.a(viewA), relativeLayout);
    }

    @androidx.annotation.n0
    public static s3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16726, new Class[]{LayoutInflater.class}, s3.class);
        return patchProxyResultProxy.isSupported ? (s3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16727, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s3.class);
        if (patchProxyResultProxy.isSupported) {
            return (s3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.component_game_game_list_normal, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f115429a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16729, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
