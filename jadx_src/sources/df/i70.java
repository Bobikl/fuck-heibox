package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutIndicatorBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class i70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f111665a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f111666b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111667c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111668d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111669e;

    private i70(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f111665a = constraintLayout;
        this.f111666b = constraintLayout2;
        this.f111667c = imageView;
        this.f111668d = textView;
        this.f111669e = textView2;
    }

    @androidx.annotation.n0
    public static i70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20832, new Class[]{View.class}, i70.class);
        if (patchProxyResultProxy.isSupported) {
            return (i70) patchProxyResultProxy.result;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i10 = R.id.iv_save;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_save);
        if (imageView != null) {
            i10 = R.id.tv_index;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_index);
            if (textView != null) {
                i10 = R.id.tv_original;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_original);
                if (textView2 != null) {
                    return new i70(constraintLayout, constraintLayout, imageView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static i70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20830, new Class[]{LayoutInflater.class}, i70.class);
        return patchProxyResultProxy.isSupported ? (i70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static i70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20831, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i70.class);
        if (patchProxyResultProxy.isSupported) {
            return (i70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_indicator, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f111665a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20833, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
