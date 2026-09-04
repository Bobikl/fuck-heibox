package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemCurrentCommentHeaderV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f118364a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118365b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final NestedScrollView f118366c;

    private zg(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 NestedScrollView nestedScrollView2) {
        this.f118364a = nestedScrollView;
        this.f118365b = linearLayout;
        this.f118366c = nestedScrollView2;
    }

    @androidx.annotation.n0
    public static zg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18107, new Class[]{View.class}, zg.class);
        if (patchProxyResultProxy.isSupported) {
            return (zg) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_current_comment);
        if (linearLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.vg_current_comment)));
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        return new zg(nestedScrollView, linearLayout, nestedScrollView);
    }

    @androidx.annotation.n0
    public static zg c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18105, new Class[]{LayoutInflater.class}, zg.class);
        return patchProxyResultProxy.isSupported ? (zg) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zg d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18106, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zg.class);
        if (patchProxyResultProxy.isSupported) {
            return (zg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_current_comment_header_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f118364a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18108, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
