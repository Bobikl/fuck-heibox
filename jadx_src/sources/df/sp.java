package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemListSectionHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sp implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ListSectionHeader f115676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f115677b;

    private sp(@androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 ListSectionHeader listSectionHeader2) {
        this.f115676a = listSectionHeader;
        this.f115677b = listSectionHeader2;
    }

    @androidx.annotation.n0
    public static sp a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19012, new Class[]{View.class}, sp.class);
        if (patchProxyResultProxy.isSupported) {
            return (sp) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ListSectionHeader listSectionHeader = (ListSectionHeader) view;
        return new sp(listSectionHeader, listSectionHeader);
    }

    @androidx.annotation.n0
    public static sp c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19010, new Class[]{LayoutInflater.class}, sp.class);
        return patchProxyResultProxy.isSupported ? (sp) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sp d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19011, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sp.class);
        if (patchProxyResultProxy.isSupported) {
            return (sp) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_list_section_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ListSectionHeader b() {
        return this.f115676a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19013, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
