package bc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbcustomviewPriceCamelViewBinding.java */
/* JADX INFO: loaded from: classes10.dex */
public final class g implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final ConstraintLayout f35208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final TextView f35209b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f35210c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f35211d;

    private g(@n0 ConstraintLayout constraintLayout, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3) {
        this.f35208a = constraintLayout;
        this.f35209b = textView;
        this.f35210c = textView2;
        this.f35211d = textView3;
    }

    @n0
    public static g a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.f.Vi, new Class[]{View.class}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_current_price;
        TextView textView = (TextView) l3.d.a(view, i10);
        if (textView != null) {
            i10 = R.id.tv_price_fee;
            TextView textView2 = (TextView) l3.d.a(view, i10);
            if (textView2 != null) {
                i10 = R.id.tv_rmb_symbol;
                TextView textView3 = (TextView) l3.d.a(view, i10);
                if (textView3 != null) {
                    return new g((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static g c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.f.Ti, new Class[]{LayoutInflater.class}, g.class);
        return patchProxyResultProxy.isSupported ? (g) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static g d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.f.Ui, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, g.class);
        if (patchProxyResultProxy.isSupported) {
            return (g) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbcustomview_price_camel_view, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public ConstraintLayout b() {
        return this.f35208a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.Wi, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
