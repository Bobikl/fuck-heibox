package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutInterestInitRadiogroupBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112465c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112466d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112467e;

    private k70(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f112463a = linearLayout;
        this.f112464b = textView;
        this.f112465c = textView2;
        this.f112466d = linearLayout2;
        this.f112467e = linearLayout3;
    }

    @androidx.annotation.n0
    public static k70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20840, new Class[]{View.class}, k70.class);
        if (patchProxyResultProxy.isSupported) {
            return (k70) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_type_desc;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_type_desc);
        if (textView != null) {
            i10 = R.id.tv_type_title;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_type_title);
            if (textView2 != null) {
                i10 = R.id.vg_options;
                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_options);
                if (linearLayout != null) {
                    LinearLayout linearLayout2 = (LinearLayout) view;
                    return new k70(linearLayout2, textView, textView2, linearLayout, linearLayout2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static k70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20838, new Class[]{LayoutInflater.class}, k70.class);
        return patchProxyResultProxy.isSupported ? (k70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20839, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k70.class);
        if (patchProxyResultProxy.isSupported) {
            return (k70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_interest_init_radiogroup, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112463a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20841, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
