package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGroupBarTitleBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class w60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ListSectionHeader f117059a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f117060b;

    private w60(@androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 ListSectionHeader listSectionHeader2) {
        this.f117059a = listSectionHeader;
        this.f117060b = listSectionHeader2;
    }

    @androidx.annotation.n0
    public static w60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20784, new Class[]{View.class}, w60.class);
        if (patchProxyResultProxy.isSupported) {
            return (w60) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        ListSectionHeader listSectionHeader = (ListSectionHeader) view;
        return new w60(listSectionHeader, listSectionHeader);
    }

    @androidx.annotation.n0
    public static w60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20782, new Class[]{LayoutInflater.class}, w60.class);
        return patchProxyResultProxy.isSupported ? (w60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static w60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20783, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, w60.class);
        if (patchProxyResultProxy.isSupported) {
            return (w60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_group_bar_title, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ListSectionHeader b() {
        return this.f117059a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20785, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
