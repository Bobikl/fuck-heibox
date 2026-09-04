package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutFeedsConfigContentView1Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q40 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f114718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final lr f114719d;

    private q40(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 ExpressionTextView expressionTextView2, @androidx.annotation.n0 lr lrVar) {
        this.f114716a = linearLayout;
        this.f114717b = expressionTextView;
        this.f114718c = expressionTextView2;
        this.f114719d = lrVar;
    }

    @androidx.annotation.n0
    public static q40 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20552, new Class[]{View.class}, q40.class);
        if (patchProxyResultProxy.isSupported) {
            return (q40) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_content;
        ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_content);
        if (expressionTextView != null) {
            i10 = R.id.tv_title;
            ExpressionTextView expressionTextView2 = (ExpressionTextView) l3.d.a(view, R.id.tv_title);
            if (expressionTextView2 != null) {
                i10 = R.id.vg_img;
                View viewA = l3.d.a(view, R.id.vg_img);
                if (viewA != null) {
                    return new q40((LinearLayout) view, expressionTextView, expressionTextView2, lr.a(viewA));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static q40 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20550, new Class[]{LayoutInflater.class}, q40.class);
        return patchProxyResultProxy.isSupported ? (q40) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q40 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20551, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q40.class);
        if (patchProxyResultProxy.isSupported) {
            return (q40) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_feeds_config_content_view_1, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114716a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20553, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
