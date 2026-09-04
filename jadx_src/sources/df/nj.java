package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemFooterCleanerInvalidFavorLinkBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nj implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f113856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113857b;

    private nj(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 TextView textView) {
        this.f113856a = frameLayout;
        this.f113857b = textView;
    }

    @androidx.annotation.n0
    public static nj a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18371, new Class[]{View.class}, nj.class);
        if (patchProxyResultProxy.isSupported) {
            return (nj) patchProxyResultProxy.result;
        }
        TextView textView = (TextView) l3.d.a(view, R.id.tv_clear_invalid_favor_link);
        if (textView != null) {
            return new nj((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_clear_invalid_favor_link)));
    }

    @androidx.annotation.n0
    public static nj c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18369, new Class[]{LayoutInflater.class}, nj.class);
        return patchProxyResultProxy.isSupported ? (nj) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static nj d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18370, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, nj.class);
        if (patchProxyResultProxy.isSupported) {
            return (nj) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_footer_cleaner_invalid_favor_link, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f113856a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18372, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
