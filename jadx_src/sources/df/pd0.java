package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: TableRowSubCommentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pd0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114517a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114518b;

    private pd0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ExpressionTextView expressionTextView) {
        this.f114517a = relativeLayout;
        this.f114518b = expressionTextView;
    }

    @androidx.annotation.n0
    public static pd0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21476, new Class[]{View.class}, pd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (pd0) patchProxyResultProxy.result;
        }
        ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_sub_comment_content);
        if (expressionTextView != null) {
            return new pd0((RelativeLayout) view, expressionTextView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.tv_sub_comment_content)));
    }

    @androidx.annotation.n0
    public static pd0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21474, new Class[]{LayoutInflater.class}, pd0.class);
        return patchProxyResultProxy.isSupported ? (pd0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pd0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21475, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pd0.class);
        if (patchProxyResultProxy.isSupported) {
            return (pd0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.table_row_sub_comment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114517a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21477, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
