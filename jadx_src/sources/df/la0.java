package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSearchHeaderViewBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class la0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112966a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f112967b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112968c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f112969d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112970e;

    private la0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f112966a = relativeLayout;
        this.f112967b = editText;
        this.f112968c = imageView;
        this.f112969d = oVar;
        this.f112970e = relativeLayout2;
    }

    @androidx.annotation.n0
    public static la0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21154, new Class[]{View.class}, la0.class);
        if (patchProxyResultProxy.isSupported) {
            return (la0) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_search;
        EditText editText = (EditText) l3.d.a(view, R.id.et_search);
        if (editText != null) {
            i10 = R.id.iv_del;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_del);
            if (imageView != null) {
                i10 = R.id.v_divider;
                View viewA = l3.d.a(view, R.id.v_divider);
                if (viewA != null) {
                    RelativeLayout relativeLayout = (RelativeLayout) view;
                    return new la0(relativeLayout, editText, imageView, mb.o.a(viewA), relativeLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static la0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21152, new Class[]{LayoutInflater.class}, la0.class);
        return patchProxyResultProxy.isSupported ? (la0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static la0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21153, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, la0.class);
        if (patchProxyResultProxy.isSupported) {
            return (la0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_search_header_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112966a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21155, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
