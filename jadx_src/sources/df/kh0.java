package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewR6WeaponsCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class kh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f112637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112638b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final qu f112639c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112640d;

    private kh0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 qu quVar, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f112637a = cardView;
        this.f112638b = linearLayout;
        this.f112639c = quVar;
        this.f112640d = linearLayout2;
    }

    @androidx.annotation.n0
    public static kh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21866, new Class[]{View.class}, kh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.ll_all_weapons;
        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_all_weapons);
        if (linearLayout != null) {
            i10 = R.id.vg_card_title;
            View viewA = l3.d.a(view, R.id.vg_card_title);
            if (viewA != null) {
                qu quVarA = qu.a(viewA);
                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_weapons_list);
                if (linearLayout2 != null) {
                    return new kh0((CardView) view, linearLayout, quVarA, linearLayout2);
                }
                i10 = R.id.vg_weapons_list;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static kh0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21864, new Class[]{LayoutInflater.class}, kh0.class);
        return patchProxyResultProxy.isSupported ? (kh0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static kh0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21865, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, kh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (kh0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_r6_weapons_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f112637a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21867, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
