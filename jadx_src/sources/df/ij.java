package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.hbcommon.component.FilterCheckedListView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemFilterCheckedListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ij implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111821a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final FilterCheckedListView f111822b;

    private ij(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FilterCheckedListView filterCheckedListView) {
        this.f111821a = linearLayout;
        this.f111822b = filterCheckedListView;
    }

    @androidx.annotation.n0
    public static ij a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18351, new Class[]{View.class}, ij.class);
        if (patchProxyResultProxy.isSupported) {
            return (ij) patchProxyResultProxy.result;
        }
        FilterCheckedListView filterCheckedListView = (FilterCheckedListView) l3.d.a(view, R.id.fclv);
        if (filterCheckedListView != null) {
            return new ij((LinearLayout) view, filterCheckedListView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.fclv)));
    }

    @androidx.annotation.n0
    public static ij c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18349, new Class[]{LayoutInflater.class}, ij.class);
        return patchProxyResultProxy.isSupported ? (ij) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ij d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18350, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ij.class);
        if (patchProxyResultProxy.isSupported) {
            return (ij) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_filter_checked_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111821a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18352, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
