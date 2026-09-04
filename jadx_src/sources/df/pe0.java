package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcustomview.CircleProgressView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewCircleProcessBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pe0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f114525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircleProgressView f114526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114528d;

    private pe0(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CircleProgressView circleProgressView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f114525a = linearLayout;
        this.f114526b = circleProgressView;
        this.f114527c = textView;
        this.f114528d = textView2;
    }

    @androidx.annotation.n0
    public static pe0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21578, new Class[]{View.class}, pe0.class);
        if (patchProxyResultProxy.isSupported) {
            return (pe0) patchProxyResultProxy.result;
        }
        int i10 = R.id.cpv_view_circle_process;
        CircleProgressView circleProgressView = (CircleProgressView) l3.d.a(view, R.id.cpv_view_circle_process);
        if (circleProgressView != null) {
            i10 = R.id.tv_view_circle_process_title;
            TextView textView = (TextView) l3.d.a(view, R.id.tv_view_circle_process_title);
            if (textView != null) {
                i10 = R.id.tv_view_circle_process_value;
                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_view_circle_process_value);
                if (textView2 != null) {
                    return new pe0((LinearLayout) view, circleProgressView, textView, textView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static pe0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21576, new Class[]{LayoutInflater.class}, pe0.class);
        return patchProxyResultProxy.isSupported ? (pe0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pe0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21577, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pe0.class);
        if (patchProxyResultProxy.isSupported) {
            return (pe0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_circle_process, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f114525a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21579, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
