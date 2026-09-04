package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameDetailDataValueView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameOverviewHeroMmrBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class yl implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117990a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameDetailDataValueView f117992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameDetailDataValueView f117993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117994e;

    private yl(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 GameDetailDataValueView gameDetailDataValueView, @androidx.annotation.n0 GameDetailDataValueView gameDetailDataValueView2, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f117990a = linearLayout;
        this.f117991b = recyclerView;
        this.f117992c = gameDetailDataValueView;
        this.f117993d = gameDetailDataValueView2;
        this.f117994e = linearLayout2;
    }

    @androidx.annotation.n0
    public static yl a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18620, new Class[]{View.class}, yl.class);
        if (patchProxyResultProxy.isSupported) {
            return (yl) patchProxyResultProxy.result;
        }
        int i10 = R.id.rv;
        RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
        if (recyclerView != null) {
            i10 = R.id.v_dv_mmr;
            GameDetailDataValueView gameDetailDataValueView = (GameDetailDataValueView) l3.d.a(view, R.id.v_dv_mmr);
            if (gameDetailDataValueView != null) {
                i10 = R.id.v_rank;
                GameDetailDataValueView gameDetailDataValueView2 = (GameDetailDataValueView) l3.d.a(view, R.id.v_rank);
                if (gameDetailDataValueView2 != null) {
                    i10 = R.id.vg_dan;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_dan);
                    if (linearLayout != null) {
                        return new yl((LinearLayout) view, recyclerView, gameDetailDataValueView, gameDetailDataValueView2, linearLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static yl c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18618, new Class[]{LayoutInflater.class}, yl.class);
        return patchProxyResultProxy.isSupported ? (yl) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static yl d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18619, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, yl.class);
        if (patchProxyResultProxy.isSupported) {
            return (yl) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_overview_hero_mmr, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117990a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18621, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
