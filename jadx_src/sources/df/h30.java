package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutCartEmptyViewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h30 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111230a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.m0 f111231b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111232c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111233d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111234e;

    private h30(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 mb.m0 m0Var, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f111230a = linearLayout;
        this.f111231b = m0Var;
        this.f111232c = imageView;
        this.f111233d = textView;
        this.f111234e = textView2;
    }

    @androidx.annotation.n0
    public static h30 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20414, new Class[]{View.class}, h30.class);
        if (patchProxyResultProxy.isSupported) {
            return (h30) patchProxyResultProxy.result;
        }
        int i10 = R.id.bottom_logo;
        View viewA = l3.d.a(view, R.id.bottom_logo);
        if (viewA != null) {
            mb.m0 m0VarA = mb.m0.a(viewA);
            i10 = R.id.iv_empty;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_empty);
            if (imageView != null) {
                i10 = R.id.tv_btn;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_btn);
                if (textView != null) {
                    i10 = R.id.tv_empty;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_empty);
                    if (textView2 != null) {
                        return new h30((LinearLayout) view, m0VarA, imageView, textView, textView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static h30 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20412, new Class[]{LayoutInflater.class}, h30.class);
        return patchProxyResultProxy.isSupported ? (h30) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h30 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20413, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h30.class);
        if (patchProxyResultProxy.isSupported) {
            return (h30) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_cart_empty_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111230a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20415, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
