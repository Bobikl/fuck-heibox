package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentNewsListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ia implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f111720e;

    private ia(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 mb.o oVar) {
        this.f111716a = relativeLayout;
        this.f111717b = imageView;
        this.f111718c = textView;
        this.f111719d = linearLayout;
        this.f111720e = oVar;
    }

    @androidx.annotation.n0
    public static ia a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17416, new Class[]{View.class}, ia.class);
        if (patchProxyResultProxy.isSupported) {
            return (ia) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_write_post;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_write_post);
        if (imageView != null) {
            i10 = R.id.tv_update_tips;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_update_tips);
            if (textView != null) {
                i10 = R.id.v_gradient;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.v_gradient);
                if (linearLayout != null) {
                    i10 = R.id.v_scroll_container_divier;
                    View viewA = l3.d.a(view, R.id.v_scroll_container_divier);
                    if (viewA != null) {
                        return new ia((RelativeLayout) view, imageView, textView, linearLayout, mb.o.a(viewA));
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ia c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17414, new Class[]{LayoutInflater.class}, ia.class);
        return patchProxyResultProxy.isSupported ? (ia) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ia d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17415, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ia.class);
        if (patchProxyResultProxy.isSupported) {
            return (ia) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_news_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111716a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17417, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
