package mb;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: EmptyViewBinding.java */
/* JADX INFO: loaded from: classes9.dex */
public final class q implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f131706a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final m0 f131707b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f131708c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f131709d;

    private q(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 m0 m0Var, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView) {
        this.f131706a = linearLayout;
        this.f131707b = m0Var;
        this.f131708c = imageView;
        this.f131709d = textView;
    }

    @androidx.annotation.n0
    public static q a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.e.H6, new Class[]{View.class}, q.class);
        if (patchProxyResultProxy.isSupported) {
            return (q) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_logo;
        View viewA = l3.d.a(view, i10);
        if (viewA != null) {
            m0 m0VarA = m0.a(viewA);
            int i11 = R.id.iv_empty;
            ImageView imageView = (ImageView) l3.d.a(view, i11);
            if (imageView != null) {
                i11 = R.id.tv_empty;
                TextView textView = (TextView) l3.d.a(view, i11);
                if (textView != null) {
                    return new q((LinearLayout) view, m0VarA, imageView, textView);
                }
            }
            i10 = i11;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static q c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.e.F6, new Class[]{LayoutInflater.class}, q.class);
        return patchProxyResultProxy.isSupported ? (q) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.e.G6, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q.class);
        if (patchProxyResultProxy.isSupported) {
            return (q) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.empty_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f131706a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.e.I6, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
