package xc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hblogistics.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HblogisticsItemSelectedRegionBinding.java */
/* JADX INFO: loaded from: classes11.dex */
public final class k implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f141238a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final TextView f141239b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f141240c;

    private k(@n0 LinearLayout linearLayout, @n0 TextView textView, @n0 TextView textView2) {
        this.f141238a = linearLayout;
        this.f141239b = textView;
        this.f141240c = textView2;
    }

    @n0
    public static k a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.g.Bi, new Class[]{View.class}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_desc;
        TextView textView = (TextView) l3.d.a(view, i10);
        if (textView != null) {
            i10 = R.id.tv_name;
            TextView textView2 = (TextView) l3.d.a(view, i10);
            if (textView2 != null) {
                return new k((LinearLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static k c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.g.f33240zi, new Class[]{LayoutInflater.class}, k.class);
        return patchProxyResultProxy.isSupported ? (k) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static k d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.g.Ai, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k.class);
        if (patchProxyResultProxy.isSupported) {
            return (k) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hblogistics_item_selected_region, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f141238a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.g.Ci, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
