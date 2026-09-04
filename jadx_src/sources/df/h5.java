package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogFragmentRestorePostEditBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111252a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111253b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f111254c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111255d;

    private h5(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 View view) {
        this.f111252a = constraintLayout;
        this.f111253b = imageView;
        this.f111254c = expressionTextView;
        this.f111255d = view;
    }

    @androidx.annotation.n0
    public static h5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16892, new Class[]{View.class}, h5.class);
        if (patchProxyResultProxy.isSupported) {
            return (h5) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
        if (imageView != null) {
            i10 = R.id.tv_content;
            ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_content);
            if (expressionTextView != null) {
                i10 = R.id.v_content_background;
                View viewA = l3.d.a(view, R.id.v_content_background);
                if (viewA != null) {
                    return new h5((ConstraintLayout) view, imageView, expressionTextView, viewA);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16890, new Class[]{LayoutInflater.class}, h5.class);
        return patchProxyResultProxy.isSupported ? (h5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16891, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h5.class);
        if (patchProxyResultProxy.isSupported) {
            return (h5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_restore_post_edit, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111252a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16893, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
