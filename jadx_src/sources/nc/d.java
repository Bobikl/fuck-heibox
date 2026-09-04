package nc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbexpression.R;
import com.max.hbexpression.widget.CustomGridView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbexpressionMyGridviewBinding.java */
/* JADX INFO: loaded from: classes10.dex */
public final class d implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final FrameLayout f132045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final CustomGridView f132046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final ImageView f132047c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final FrameLayout f132048d;

    private d(@n0 FrameLayout frameLayout, @n0 CustomGridView customGridView, @n0 ImageView imageView, @n0 FrameLayout frameLayout2) {
        this.f132045a = frameLayout;
        this.f132046b = customGridView;
        this.f132047c = imageView;
        this.f132048d = frameLayout2;
    }

    @n0
    public static d a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.g.L2, new Class[]{View.class}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        int i10 = R.id.gv_expression;
        CustomGridView customGridView = (CustomGridView) l3.d.a(view, i10);
        if (customGridView != null) {
            i10 = R.id.iv_dlt_emoji;
            ImageView imageView = (ImageView) l3.d.a(view, i10);
            if (imageView != null) {
                FrameLayout frameLayout = (FrameLayout) view;
                return new d(frameLayout, customGridView, imageView, frameLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static d c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.g.J2, new Class[]{LayoutInflater.class}, d.class);
        return patchProxyResultProxy.isSupported ? (d) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static d d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.K2, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, d.class);
        if (patchProxyResultProxy.isSupported) {
            return (d) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbexpression_my_gridview, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public FrameLayout b() {
        return this.f132045a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.M2, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
