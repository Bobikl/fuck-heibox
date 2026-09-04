package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemActivateRechargeCardsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class wc implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f117128a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117129b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117130c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117131d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117132e;

    private wc(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4) {
        this.f117128a = linearLayout;
        this.f117129b = textView;
        this.f117130c = textView2;
        this.f117131d = textView3;
        this.f117132e = textView4;
    }

    @androidx.annotation.n0
    public static wc a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17680, new Class[]{View.class}, wc.class);
        if (patchProxyResultProxy.isSupported) {
            return (wc) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_activate_key;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_activate_key);
        if (textView != null) {
            i10 = R.id.tv_card_desc;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_card_desc);
            if (textView2 != null) {
                i10 = R.id.tv_copy_key;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_copy_key);
                if (textView3 != null) {
                    i10 = R.id.tv_key;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_key);
                    if (textView4 != null) {
                        return new wc((LinearLayout) view, textView, textView2, textView3, textView4);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static wc c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17678, new Class[]{LayoutInflater.class}, wc.class);
        return patchProxyResultProxy.isSupported ? (wc) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static wc d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17679, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, wc.class);
        if (patchProxyResultProxy.isSupported) {
            return (wc) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_activate_recharge_cards, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f117128a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17681, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
