package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameGlobalPriceV3Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class vk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116870a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final tk f116871b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final uk f116872c;

    private vk(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 tk tkVar, @androidx.annotation.n0 uk ukVar) {
        this.f116870a = linearLayout;
        this.f116871b = tkVar;
        this.f116872c = ukVar;
    }

    @androidx.annotation.n0
    public static vk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18505, new Class[]{View.class}, vk.class);
        if (patchProxyResultProxy.isSupported) {
            return (vk) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_expand;
        View viewA = l3.d.a(view, R.id.vg_expand);
        if (viewA != null) {
            tk tkVarA = tk.a(viewA);
            View viewA2 = l3.d.a(view, R.id.vg_static);
            if (viewA2 != null) {
                return new vk((LinearLayout) view, tkVarA, uk.a(viewA2));
            }
            i10 = R.id.vg_static;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static vk c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18503, new Class[]{LayoutInflater.class}, vk.class);
        return patchProxyResultProxy.isSupported ? (vk) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static vk d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18504, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, vk.class);
        if (patchProxyResultProxy.isSupported) {
            return (vk) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_global_price_v3, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116870a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18506, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
