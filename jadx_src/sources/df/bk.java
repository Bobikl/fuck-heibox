package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameAchievementsHeaderBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f108985a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final xf0 f108986b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final vc f108987c;

    private bk(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 xf0 xf0Var, @androidx.annotation.n0 vc vcVar) {
        this.f108985a = linearLayout;
        this.f108986b = xf0Var;
        this.f108987c = vcVar;
    }

    @androidx.annotation.n0
    public static bk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18427, new Class[]{View.class}, bk.class);
        if (patchProxyResultProxy.isSupported) {
            return (bk) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_fragment_game_achievement_game_info;
        View viewA = l3.d.a(view, R.id.vg_fragment_game_achievement_game_info);
        if (viewA != null) {
            xf0 xf0VarA = xf0.a(viewA);
            View viewA2 = l3.d.a(view, R.id.vg_fragment_game_achievement_title);
            if (viewA2 != null) {
                return new bk((LinearLayout) view, xf0VarA, vc.a(viewA2));
            }
            i10 = R.id.vg_fragment_game_achievement_title;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static bk c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18425, new Class[]{LayoutInflater.class}, bk.class);
        return patchProxyResultProxy.isSupported ? (bk) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bk d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18426, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bk.class);
        if (patchProxyResultProxy.isSupported) {
            return (bk) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_achievements_header, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f108985a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18428, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
