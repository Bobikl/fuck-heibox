package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemEmptyContentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pi implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114568a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114569b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114570c;

    private pi(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f114568a = linearLayout;
        this.f114569b = textView;
        this.f114570c = linearLayout2;
    }

    @androidx.annotation.n0
    public static pi a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18275, new Class[]{View.class}, pi.class);
        if (patchProxyResultProxy.isSupported) {
            return (pi) patchProxyResultProxy.result;
        }
        TextView textView = (TextView) l3.d.a(view, R.id.tv_empty_status);
        if (textView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_empty_status)));
        }
        LinearLayout linearLayout = (LinearLayout) view;
        return new pi(linearLayout, textView, linearLayout);
    }

    @androidx.annotation.n0
    public static pi c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18273, new Class[]{LayoutInflater.class}, pi.class);
        return patchProxyResultProxy.isSupported ? (pi) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pi d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18274, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pi.class);
        if (patchProxyResultProxy.isSupported) {
            return (pi) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_empty_content, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114568a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18276, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
