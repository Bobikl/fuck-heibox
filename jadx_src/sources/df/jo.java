package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemHeyboxPopmenuBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class jo implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f112226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112227b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112228c;

    private jo(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 View view) {
        this.f112226a = frameLayout;
        this.f112227b = textView;
        this.f112228c = view;
    }

    @androidx.annotation.n0
    public static jo a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18872, new Class[]{View.class}, jo.class);
        if (patchProxyResultProxy.isSupported) {
            return (jo) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_menu;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_menu);
        if (textView != null) {
            i10 = R.id.v_divider;
            View viewA = l3.d.a(view, R.id.v_divider);
            if (viewA != null) {
                return new jo((FrameLayout) view, textView, viewA);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static jo c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18870, new Class[]{LayoutInflater.class}, jo.class);
        return patchProxyResultProxy.isSupported ? (jo) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static jo d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18871, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, jo.class);
        if (patchProxyResultProxy.isSupported) {
            return (jo) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_heybox_popmenu, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f112226a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18873, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
