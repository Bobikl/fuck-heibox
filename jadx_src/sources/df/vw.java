package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.richtext.RichStackModelView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRichStackBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vw implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f116943a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RichStackModelView f116944b;

    private vw(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RichStackModelView richStackModelView) {
        this.f116943a = frameLayout;
        this.f116944b = richStackModelView;
    }

    @androidx.annotation.n0
    public static vw a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19748, new Class[]{View.class}, vw.class);
        if (patchProxyResultProxy.isSupported) {
            return (vw) patchProxyResultProxy.result;
        }
        RichStackModelView richStackModelView = (RichStackModelView) l3.d.a(view, R.id.rich_view);
        if (richStackModelView != null) {
            return new vw((FrameLayout) view, richStackModelView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.rich_view)));
    }

    @androidx.annotation.n0
    public static vw c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19746, new Class[]{LayoutInflater.class}, vw.class);
        return patchProxyResultProxy.isSupported ? (vw) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vw d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19747, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vw.class);
        if (patchProxyResultProxy.isSupported) {
            return (vw) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_rich_stack, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f116943a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19749, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
