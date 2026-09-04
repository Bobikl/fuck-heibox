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

/* JADX INFO: compiled from: LayoutMaxOnlineNumBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class a80 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108429c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f108430d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f108431e;

    private a80(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f108427a = linearLayout;
        this.f108428b = textView;
        this.f108429c = textView2;
        this.f108430d = textView3;
        this.f108431e = linearLayout2;
    }

    @androidx.annotation.n0
    public static a80 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20902, new Class[]{View.class}, a80.class);
        if (patchProxyResultProxy.isSupported) {
            return (a80) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_max_online_num;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_max_online_num);
        if (textView != null) {
            i10 = R.id.tv_max_online_num_unit;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_max_online_num_unit);
            if (textView2 != null) {
                i10 = R.id.tv_max_online_time;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_max_online_time);
                if (textView3 != null) {
                    LinearLayout linearLayout = (LinearLayout) view;
                    return new a80(linearLayout, textView, textView2, textView3, linearLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static a80 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20900, new Class[]{LayoutInflater.class}, a80.class);
        return patchProxyResultProxy.isSupported ? (a80) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static a80 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20901, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a80.class);
        if (patchProxyResultProxy.isSupported) {
            return (a80) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_max_online_num, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108427a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20903, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
