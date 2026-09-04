package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.ListSectionHeader;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameShotHorListBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f115482a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ListSectionHeader f115483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f115484c;

    private s60(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ListSectionHeader listSectionHeader, @androidx.annotation.n0 RecyclerView recyclerView) {
        this.f115482a = linearLayout;
        this.f115483b = listSectionHeader;
        this.f115484c = recyclerView;
    }

    @androidx.annotation.n0
    public static s60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20768, new Class[]{View.class}, s60.class);
        if (patchProxyResultProxy.isSupported) {
            return (s60) patchProxyResultProxy.result;
        }
        int i10 = R.id.lsh_game_shot;
        ListSectionHeader listSectionHeader = (ListSectionHeader) l3.d.a(view, R.id.lsh_game_shot);
        if (listSectionHeader != null) {
            i10 = R.id.rv_game_shot_hor;
            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_game_shot_hor);
            if (recyclerView != null) {
                return new s60((LinearLayout) view, listSectionHeader, recyclerView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static s60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20766, new Class[]{LayoutInflater.class}, s60.class);
        return patchProxyResultProxy.isSupported ? (s60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20767, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s60.class);
        if (patchProxyResultProxy.isSupported) {
            return (s60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_shot_hor_list, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f115482a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20769, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
