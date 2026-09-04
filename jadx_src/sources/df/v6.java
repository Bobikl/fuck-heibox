package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogTradePutonInfoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f116645a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116646b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116647c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116648d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116649e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116650f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116651g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116652h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116653i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116654j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116655k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116656l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116657m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116658n;

    private v6(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f116645a = linearLayout;
        this.f116646b = textView;
        this.f116647c = textView2;
        this.f116648d = textView3;
        this.f116649e = textView4;
        this.f116650f = textView5;
        this.f116651g = textView6;
        this.f116652h = textView7;
        this.f116653i = textView8;
        this.f116654j = textView9;
        this.f116655k = textView10;
        this.f116656l = linearLayout2;
        this.f116657m = linearLayout3;
        this.f116658n = relativeLayout;
    }

    @androidx.annotation.n0
    public static v6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17052, new Class[]{View.class}, v6.class);
        if (patchProxyResultProxy.isSupported) {
            return (v6) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_count;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_count);
        if (textView != null) {
            i10 = R.id.tv_count_desc;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_count_desc);
            if (textView2 != null) {
                i10 = R.id.tv_fee_rate;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_fee_rate);
                if (textView3 != null) {
                    i10 = R.id.tv_fee_rate_symbol;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_fee_rate_symbol);
                    if (textView4 != null) {
                        i10 = R.id.tv_hcash;
                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_hcash);
                        if (textView5 != null) {
                            i10 = R.id.tv_profit;
                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_profit);
                            if (textView6 != null) {
                                i10 = R.id.tv_profit_desc;
                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_profit_desc);
                                if (textView7 != null) {
                                    i10 = R.id.tv_profit_symbol;
                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_profit_symbol);
                                    if (textView8 != null) {
                                        i10 = R.id.tv_rate_desc;
                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_rate_desc);
                                        if (textView9 != null) {
                                            i10 = R.id.tv_unit;
                                            TextView textView10 = (TextView) l3.d.a(view, R.id.tv_unit);
                                            if (textView10 != null) {
                                                i10 = R.id.vg_hcash_info;
                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_hcash_info);
                                                if (linearLayout != null) {
                                                    i10 = R.id.vg_item;
                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_item);
                                                    if (linearLayout2 != null) {
                                                        i10 = R.id.vg_item_profit;
                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_item_profit);
                                                        if (relativeLayout != null) {
                                                            return new v6((LinearLayout) view, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, linearLayout, linearLayout2, relativeLayout);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static v6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17050, new Class[]{LayoutInflater.class}, v6.class);
        return patchProxyResultProxy.isSupported ? (v6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17051, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v6.class);
        if (patchProxyResultProxy.isSupported) {
            return (v6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_trade_puton_info, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f116645a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17053, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
