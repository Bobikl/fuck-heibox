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

/* JADX INFO: compiled from: ItemCurrentCommentHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yg implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final NestedScrollView f117968a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117969b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final NestedScrollView f117970c;

    private yg(@androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 NestedScrollView nestedScrollView2) {
        this.f117968a = nestedScrollView;
        this.f117969b = linearLayout;
        this.f117970c = nestedScrollView2;
    }

    @androidx.annotation.n0
    public static yg a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18103, new Class[]{View.class}, yg.class);
        if (patchProxyResultProxy.isSupported) {
            return (yg) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_current_comment);
        if (linearLayout == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.vg_current_comment)));
        }
        NestedScrollView nestedScrollView = (NestedScrollView) view;
        return new yg(nestedScrollView, linearLayout, nestedScrollView);
    }

    @androidx.annotation.n0
    public static yg c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18101, new Class[]{LayoutInflater.class}, yg.class);
        return patchProxyResultProxy.isSupported ? (yg) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yg d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18102, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yg.class);
        if (patchProxyResultProxy.isSupported) {
            return (yg) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_current_comment_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public NestedScrollView b() {
        return this.f117968a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18104, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
