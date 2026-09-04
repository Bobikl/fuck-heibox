package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MallComponentOrderStateHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nc0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113801c;

    private nc0(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2) {
        this.f113799a = relativeLayout;
        this.f113800b = textView;
        this.f113801c = textView2;
    }

    @androidx.annotation.n0
    public static nc0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21365, new Class[]{View.class}, nc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (nc0) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_order_state_desc;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_order_state_desc);
        if (textView != null) {
            i10 = R.id.tv_order_state_title;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_order_state_title);
            if (textView2 != null) {
                return new nc0((RelativeLayout) view, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static nc0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21363, new Class[]{LayoutInflater.class}, nc0.class);
        return patchProxyResultProxy.isSupported ? (nc0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static nc0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21364, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, nc0.class);
        if (patchProxyResultProxy.isSupported) {
            return (nc0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.mall_component_order_state_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113799a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21366, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
