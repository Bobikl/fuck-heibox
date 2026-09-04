package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameCard;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptGameCardV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f117560a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameCard f117561b;

    private xf(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 GameCard gameCard) {
        this.f117560a = frameLayout;
        this.f117561b = gameCard;
    }

    @androidx.annotation.n0
    public static xf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17996, new Class[]{View.class}, xf.class);
        if (patchProxyResultProxy.isSupported) {
            return (xf) patchProxyResultProxy.result;
        }
        GameCard gameCard = (GameCard) l3.d.a(view, R.id.game_card_concept_link);
        if (gameCard != null) {
            return new xf((FrameLayout) view, gameCard);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.game_card_concept_link)));
    }

    @androidx.annotation.n0
    public static xf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17994, new Class[]{LayoutInflater.class}, xf.class);
        return patchProxyResultProxy.isSupported ? (xf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17995, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xf.class);
        if (patchProxyResultProxy.isSupported) {
            return (xf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_game_card_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f117560a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17997, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
