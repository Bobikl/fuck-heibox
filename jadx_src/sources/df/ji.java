package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemDota2MatchPlayerBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ji implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f112203a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final bf0 f112205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final cf0 f112206d;

    private ji(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 bf0 bf0Var, @androidx.annotation.n0 cf0 cf0Var) {
        this.f112203a = linearLayout;
        this.f112204b = view;
        this.f112205c = bf0Var;
        this.f112206d = cf0Var;
    }

    @androidx.annotation.n0
    public static ji a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18251, new Class[]{View.class}, ji.class);
        if (patchProxyResultProxy.isSupported) {
            return (ji) patchProxyResultProxy.result;
        }
        int i10 = R.id.v_div;
        View viewA = l3.d.a(view, R.id.v_div);
        if (viewA != null) {
            i10 = R.id.vg_expand;
            View viewA2 = l3.d.a(view, R.id.vg_expand);
            if (viewA2 != null) {
                bf0 bf0VarA = bf0.a(viewA2);
                View viewA3 = l3.d.a(view, R.id.vg_item);
                if (viewA3 != null) {
                    return new ji((LinearLayout) view, viewA, bf0VarA, cf0.a(viewA3));
                }
                i10 = R.id.vg_item;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ji c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18249, new Class[]{LayoutInflater.class}, ji.class);
        return patchProxyResultProxy.isSupported ? (ji) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ji d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18250, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ji.class);
        if (patchProxyResultProxy.isSupported) {
            return (ji) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_dota2_match_player, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f112203a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18252, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
