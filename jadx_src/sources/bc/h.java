package bc;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.hbcustomview.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutDialogLoadingBinding.java */
/* JADX INFO: loaded from: classes10.dex */
public final class h implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f35212a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final CircularProgressIndicator f35213b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f35214c;

    private h(@n0 LinearLayout linearLayout, @n0 CircularProgressIndicator circularProgressIndicator, @n0 TextView textView) {
        this.f35212a = linearLayout;
        this.f35213b = circularProgressIndicator;
        this.f35214c = textView;
    }

    @n0
    public static h a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.f.Zi, new Class[]{View.class}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        int i10 = R.id.progress_loading;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, i10);
        if (circularProgressIndicator != null) {
            i10 = R.id.tv_loading_description;
            TextView textView = (TextView) l3.d.a(view, i10);
            if (textView != null) {
                return new h((LinearLayout) view, circularProgressIndicator, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static h c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.f.Xi, new Class[]{LayoutInflater.class}, h.class);
        return patchProxyResultProxy.isSupported ? (h) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static h d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.f.Yi, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h.class);
        if (patchProxyResultProxy.isSupported) {
            return (h) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_dialog_loading, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f35212a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32153aj, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
