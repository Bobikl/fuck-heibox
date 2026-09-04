package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewDestiny2GuardianCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class re0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f115207a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final uh f115208b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final uh f115209c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final uh f115210d;

    private re0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 uh uhVar, @androidx.annotation.n0 uh uhVar2, @androidx.annotation.n0 uh uhVar3) {
        this.f115207a = cardView;
        this.f115208b = uhVar;
        this.f115209c = uhVar2;
        this.f115210d = uhVar3;
    }

    @androidx.annotation.n0
    public static re0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21586, new Class[]{View.class}, re0.class);
        if (patchProxyResultProxy.isSupported) {
            return (re0) patchProxyResultProxy.result;
        }
        int i10 = R.id.vg_operators_card_item_0;
        View viewA = l3.d.a(view, R.id.vg_operators_card_item_0);
        if (viewA != null) {
            uh uhVarA = uh.a(viewA);
            View viewA2 = l3.d.a(view, R.id.vg_operators_card_item_1);
            if (viewA2 != null) {
                uh uhVarA2 = uh.a(viewA2);
                View viewA3 = l3.d.a(view, R.id.vg_operators_card_item_2);
                if (viewA3 != null) {
                    return new re0((CardView) view, uhVarA, uhVarA2, uh.a(viewA3));
                }
                i10 = R.id.vg_operators_card_item_2;
            } else {
                i10 = R.id.vg_operators_card_item_1;
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static re0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21584, new Class[]{LayoutInflater.class}, re0.class);
        return patchProxyResultProxy.isSupported ? (re0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static re0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21585, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, re0.class);
        if (patchProxyResultProxy.isSupported) {
            return (re0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_destiny2_guardian_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f115207a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21587, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
