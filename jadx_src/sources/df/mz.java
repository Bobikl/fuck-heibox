package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.google.android.material.tabs.TabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemTitleFilterMultiBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mz implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113552a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TabLayout f113553b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113554c;

    private mz(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TabLayout tabLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f113552a = relativeLayout;
        this.f113553b = tabLayout;
        this.f113554c = relativeLayout2;
    }

    @androidx.annotation.n0
    public static mz a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20020, new Class[]{View.class}, mz.class);
        if (patchProxyResultProxy.isSupported) {
            return (mz) patchProxyResultProxy.result;
        }
        TabLayout tabLayout = (TabLayout) l3.d.a(view, R.id.tab);
        if (tabLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tab)));
        }
        RelativeLayout relativeLayout = (RelativeLayout) view;
        return new mz(relativeLayout, tabLayout, relativeLayout);
    }

    @androidx.annotation.n0
    public static mz c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20018, new Class[]{LayoutInflater.class}, mz.class);
        return patchProxyResultProxy.isSupported ? (mz) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mz d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20019, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mz.class);
        if (patchProxyResultProxy.isSupported) {
            return (mz) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_title_filter_multi, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113552a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20021, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
