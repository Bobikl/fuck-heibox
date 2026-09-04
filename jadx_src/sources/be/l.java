package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletItemCategoryBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class l implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f35347a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final TextView f35348b;

    private l(@n0 RelativeLayout relativeLayout, @n0 TextView textView) {
        this.f35347a = relativeLayout;
        this.f35348b = textView;
    }

    @n0
    public static l a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.Z4, new Class[]{View.class}, l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_name;
        TextView textView = (TextView) l3.d.a(view, i10);
        if (textView != null) {
            return new l((RelativeLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static l c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.X4, new Class[]{LayoutInflater.class}, l.class);
        return patchProxyResultProxy.isSupported ? (l) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static l d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.Y4, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l.class);
        if (patchProxyResultProxy.isSupported) {
            return (l) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_item_category, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f35347a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34015a5, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
