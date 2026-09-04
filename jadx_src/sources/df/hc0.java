package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutWebviewEditorBarBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class hc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final BottomEditorBar f111398a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomEditorBar f111399b;

    private hc0(@androidx.annotation.n0 BottomEditorBar bottomEditorBar, @androidx.annotation.n0 BottomEditorBar bottomEditorBar2) {
        this.f111398a = bottomEditorBar;
        this.f111399b = bottomEditorBar2;
    }

    @androidx.annotation.n0
    public static hc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21341, new Class[]{View.class}, hc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hc0) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BottomEditorBar bottomEditorBar = (BottomEditorBar) view;
        return new hc0(bottomEditorBar, bottomEditorBar);
    }

    @androidx.annotation.n0
    public static hc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21339, new Class[]{LayoutInflater.class}, hc0.class);
        return patchProxyResultProxy.isSupported ? (hc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static hc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21340, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, hc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (hc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_webview_editor_bar, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public BottomEditorBar b() {
        return this.f111398a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21342, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
