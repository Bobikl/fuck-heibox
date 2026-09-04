package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.HorizontalNestedScrollView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutHorGameBindCardListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f70 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final HorizontalNestedScrollView f110476a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f110477b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f110478c;

    private f70(@androidx.annotation.n0 HorizontalNestedScrollView horizontalNestedScrollView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f110476a = horizontalNestedScrollView;
        this.f110477b = recyclerView;
        this.f110478c = linearLayout;
    }

    @androidx.annotation.n0
    public static f70 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20820, new Class[]{View.class}, f70.class);
        if (patchProxyResultProxy.isSupported) {
            return (f70) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv_game_bind_list;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_game_bind_list);
        if (recyclerView != null) {
            i10 = R.id.vg_change_to_list;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_change_to_list);
            if (linearLayout != null) {
                return new f70((HorizontalNestedScrollView) view, recyclerView, linearLayout);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static f70 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20818, new Class[]{LayoutInflater.class}, f70.class);
        return patchProxyResultProxy.isSupported ? (f70) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f70 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20819, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f70.class);
        if (patchProxyResultProxy.isSupported) {
            return (f70) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_hor_game_bind_card_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public HorizontalNestedScrollView b() {
        return this.f110476a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20821, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
