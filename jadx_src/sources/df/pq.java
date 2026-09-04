package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RadioGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemMenuContainerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class pq implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f114596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioGroup f114598c;

    private pq(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 RadioGroup radioGroup) {
        this.f114596a = frameLayout;
        this.f114597b = recyclerView;
        this.f114598c = radioGroup;
    }

    @androidx.annotation.n0
    public static pq a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19104, new Class[]{View.class}, pq.class);
        if (patchProxyResultProxy.isSupported) {
            return (pq) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_menu_container;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.ll_menu_container);
        if (recyclerView != null) {
            i10 = R.id.vg_indicator;
            RadioGroup radioGroup = (RadioGroup) l3.d.a(view, R.id.vg_indicator);
            if (radioGroup != null) {
                return new pq((FrameLayout) view, recyclerView, radioGroup);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static pq c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19102, new Class[]{LayoutInflater.class}, pq.class);
        return patchProxyResultProxy.isSupported ? (pq) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static pq d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19103, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, pq.class);
        if (patchProxyResultProxy.isSupported) {
            return (pq) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_menu_container, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f114596a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19105, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
