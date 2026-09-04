package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.bbs.component.bottomeditorbar.BottomEditorBar;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutStoryCommentEditorBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f108894a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f108895b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomEditorBar f108896c;

    private bb0(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 BottomEditorBar bottomEditorBar) {
        this.f108894a = constraintLayout;
        this.f108895b = constraintLayout2;
        this.f108896c = bottomEditorBar;
    }

    @androidx.annotation.n0
    public static bb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21217, new Class[]{View.class}, bb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (bb0) patchProxyResultProxy.result;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        BottomEditorBar bottomEditorBar = (BottomEditorBar) l3.d.a(view, R.id.story_comment_et_edit_comment);
        if (bottomEditorBar != null) {
            return new bb0(constraintLayout, constraintLayout, bottomEditorBar);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.story_comment_et_edit_comment)));
    }

    @androidx.annotation.n0
    public static bb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21215, new Class[]{LayoutInflater.class}, bb0.class);
        return patchProxyResultProxy.isSupported ? (bb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21216, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (bb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_story_comment_editor, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f108894a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21218, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
