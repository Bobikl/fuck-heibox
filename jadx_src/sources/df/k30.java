package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutCommentEditorBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final BottomEditorBar f112400a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomEditorBar f112401b;

    private k30(@androidx.annotation.n0 BottomEditorBar bottomEditorBar, @androidx.annotation.n0 BottomEditorBar bottomEditorBar2) {
        this.f112400a = bottomEditorBar;
        this.f112401b = bottomEditorBar2;
    }

    @androidx.annotation.n0
    public static k30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20426, new Class[]{View.class}, k30.class);
        if (patchProxyResultProxy.isSupported) {
            return (k30) patchProxyResultProxy.result;
        }
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        BottomEditorBar bottomEditorBar = (BottomEditorBar) view;
        return new k30(bottomEditorBar, bottomEditorBar);
    }

    @androidx.annotation.n0
    public static k30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20424, new Class[]{LayoutInflater.class}, k30.class);
        return patchProxyResultProxy.isSupported ? (k30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20425, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k30.class);
        if (patchProxyResultProxy.isSupported) {
            return (k30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_comment_editor, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public BottomEditorBar b() {
        return this.f112400a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20427, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
