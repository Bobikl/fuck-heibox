package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewInventoryPrivateCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class fg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f110573a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110574b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final h20 f110575c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f110576d;

    private fg0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 h20 h20Var, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f110573a = cardView;
        this.f110574b = relativeLayout;
        this.f110575c = h20Var;
        this.f110576d = relativeLayout2;
    }

    @androidx.annotation.n0
    public static fg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21744, new Class[]{View.class}, fg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_inventory_private;
        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_inventory_private);
        if (relativeLayout != null) {
            i10 = R.id.vg_inventory_private_title;
            View viewA = l3.d.a(view, R.id.vg_inventory_private_title);
            if (viewA != null) {
                h20 h20VarA = h20.a(viewA);
                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_inventory_private_update);
                if (relativeLayout2 != null) {
                    return new fg0((CardView) view, relativeLayout, h20VarA, relativeLayout2);
                }
                i10 = R.id.vg_inventory_private_update;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static fg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21742, new Class[]{LayoutInflater.class}, fg0.class);
        return patchProxyResultProxy.isSupported ? (fg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static fg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21743, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, fg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (fg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_inventory_private_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f110573a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21745, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
