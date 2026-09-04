package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.flyco.tablayout.CommonTabLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewFriendRankingCardXBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mf0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f113438a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CommonTabLayout f113439b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113440c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final i20 f113441d;

    private mf0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CommonTabLayout commonTabLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 i20 i20Var) {
        this.f113438a = cardView;
        this.f113439b = commonTabLayout;
        this.f113440c = recyclerView;
        this.f113441d = i20Var;
    }

    @androidx.annotation.n0
    public static mf0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21670, new Class[]{View.class}, mf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (mf0) patchProxyResultProxy.result;
        }
        int i10 = R.id.ctl_friend_ranking_card_x;
        CommonTabLayout commonTabLayout = (CommonTabLayout) l3.d.a(view, R.id.ctl_friend_ranking_card_x);
        if (commonTabLayout != null) {
            i10 = R.id.rv_friend_ranking_card_x;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_friend_ranking_card_x);
            if (recyclerView != null) {
                i10 = R.id.vg_friend_ranking_card_x_bottom;
                View viewA = l3.d.a(view, R.id.vg_friend_ranking_card_x_bottom);
                if (viewA != null) {
                    return new mf0((CardView) view, commonTabLayout, recyclerView, i20.a(viewA));
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static mf0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21668, new Class[]{LayoutInflater.class}, mf0.class);
        return patchProxyResultProxy.isSupported ? (mf0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mf0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21669, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mf0.class);
        if (patchProxyResultProxy.isSupported) {
            return (mf0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_friend_ranking_card_x, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f113438a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21671, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
