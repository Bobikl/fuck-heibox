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

/* JADX INFO: compiled from: ItemSearchRecommendBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wx implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117273b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117274c;

    private wx(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView) {
        this.f117272a = linearLayout;
        this.f117273b = view;
        this.f117274c = recyclerView;
    }

    @androidx.annotation.n0
    public static wx a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19856, new Class[]{View.class}, wx.class);
        if (patchProxyResultProxy.isSupported) {
            return (wx) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider_recommend;
        View viewA = l3.d.a(view, R.id.divider_recommend);
        if (viewA != null) {
            i10 = R.id.rv_rec;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_rec);
            if (recyclerView != null) {
                return new wx((LinearLayout) view, viewA, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wx c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19854, new Class[]{LayoutInflater.class}, wx.class);
        return patchProxyResultProxy.isSupported ? (wx) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wx d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19855, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wx.class);
        if (patchProxyResultProxy.isSupported) {
            return (wx) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_search_recommend, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117272a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19857, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
