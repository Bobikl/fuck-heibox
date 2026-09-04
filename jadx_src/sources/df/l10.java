package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemViewDetailBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l10 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112806a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112807b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112808c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112809d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f112810e;

    private l10(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 mb.o oVar) {
        this.f112806a = relativeLayout;
        this.f112807b = imageView;
        this.f112808c = textView;
        this.f112809d = relativeLayout2;
        this.f112810e = oVar;
    }

    @androidx.annotation.n0
    public static l10 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20224, new Class[]{View.class}, l10.class);
        if (patchProxyResultProxy.isSupported) {
            return (l10) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_view_detail;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_view_detail);
        if (imageView != null) {
            i10 = R.id.tv_view_detail;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_view_detail);
            if (textView != null) {
                RelativeLayout relativeLayout = (RelativeLayout) view;
                i10 = R.id.view_detail_divider;
                View viewA = l3.d.a(view, R.id.view_detail_divider);
                if (viewA != null) {
                    return new l10(relativeLayout, imageView, textView, relativeLayout, mb.o.a(viewA));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static l10 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20222, new Class[]{LayoutInflater.class}, l10.class);
        return patchProxyResultProxy.isSupported ? (l10) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l10 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20223, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l10.class);
        if (patchProxyResultProxy.isSupported) {
            return (l10) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_view_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112806a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20225, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
