package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewSingleAchievementCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f116859a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final qy f116860b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final h20 f116861c;

    private vh0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 qy qyVar, @androidx.annotation.n0 h20 h20Var) {
        this.f116859a = cardView;
        this.f116860b = qyVar;
        this.f116861c = h20Var;
    }

    @androidx.annotation.n0
    public static vh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21908, new Class[]{View.class}, vh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_single_achievement_card_content;
        View viewA = l3.d.a(view, R.id.vg_single_achievement_card_content);
        if (viewA != null) {
            qy qyVarA = qy.a(viewA);
            View viewA2 = l3.d.a(view, R.id.vg_single_achievement_card_title);
            if (viewA2 != null) {
                return new vh0((CardView) view, qyVarA, h20.a(viewA2));
            }
            i10 = R.id.vg_single_achievement_card_title;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21906, new Class[]{LayoutInflater.class}, vh0.class);
        return patchProxyResultProxy.isSupported ? (vh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21907, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (vh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_single_achievement_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f116859a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21909, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
