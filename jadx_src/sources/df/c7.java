package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FixedTaskLineBlockBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class c7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f109199a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109200b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109201c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f109202d;

    private c7(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2) {
        this.f109199a = linearLayout;
        this.f109200b = recyclerView;
        this.f109201c = view;
        this.f109202d = view2;
    }

    @androidx.annotation.n0
    public static c7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17080, new Class[]{View.class}, c7.class);
        if (patchProxyResultProxy.isSupported) {
            return (c7) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_task_line;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_task_line);
        if (recyclerView != null) {
            i10 = R.id.v_divider_bottom;
            View viewA = l3.d.a(view, R.id.v_divider_bottom);
            if (viewA != null) {
                i10 = R.id.v_divider_top;
                View viewA2 = l3.d.a(view, R.id.v_divider_top);
                if (viewA2 != null) {
                    return new c7((LinearLayout) view, recyclerView, viewA, viewA2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static c7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17078, new Class[]{LayoutInflater.class}, c7.class);
        return patchProxyResultProxy.isSupported ? (c7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static c7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17079, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, c7.class);
        if (patchProxyResultProxy.isSupported) {
            return (c7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fixed_task_line_block, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f109199a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17081, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
