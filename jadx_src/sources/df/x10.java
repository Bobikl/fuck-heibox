package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemWikiApplyAdditionBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f117347a;

    private x10(@androidx.annotation.n0 FrameLayout frameLayout) {
        this.f117347a = frameLayout;
    }

    @androidx.annotation.n0
    public static x10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20272, new Class[]{View.class}, x10.class);
        if (patchProxyResultProxy.isSupported) {
            return (x10) patchProxyResultProxy.result;
        }
        if (view != null) {
            return new x10((FrameLayout) view);
        }
        throw new NullPointerException("rootView");
    }

    @androidx.annotation.n0
    public static x10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20270, new Class[]{LayoutInflater.class}, x10.class);
        return patchProxyResultProxy.isSupported ? (x10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20271, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x10.class);
        if (patchProxyResultProxy.isSupported) {
            return (x10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_wiki_apply_addition, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f117347a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20273, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
