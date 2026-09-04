package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogTradeOfferTokenConfirmBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f116197a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116199c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116200d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116201e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116202f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116203g;

    private u6(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f116197a = constraintLayout;
        this.f116198b = textView;
        this.f116199c = textView2;
        this.f116200d = textView3;
        this.f116201e = textView4;
        this.f116202f = textView5;
        this.f116203g = linearLayout;
    }

    @androidx.annotation.n0
    public static u6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17048, new Class[]{View.class}, u6.class);
        if (patchProxyResultProxy.isSupported) {
            return (u6) patchProxyResultProxy.result;
        }
        int i10 = R.id.tv_day_desc;
        TextView textView = (TextView) l3.d.a(view, R.id.tv_day_desc);
        if (textView != null) {
            i10 = R.id.tv_desc;
            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
            if (textView2 != null) {
                i10 = R.id.tv_month_desc;
                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_month_desc);
                if (textView3 != null) {
                    i10 = R.id.tv_title;
                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title);
                    if (textView4 != null) {
                        i10 = R.id.tv_year_desc;
                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_year_desc);
                        if (textView5 != null) {
                            i10 = R.id.vg_time;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_time);
                            if (linearLayout != null) {
                                return new u6((ConstraintLayout) view, textView, textView2, textView3, textView4, textView5, linearLayout);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static u6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17046, new Class[]{LayoutInflater.class}, u6.class);
        return patchProxyResultProxy.isSupported ? (u6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17047, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u6.class);
        if (patchProxyResultProxy.isSupported) {
            return (u6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_trade_offer_token_confirm, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f116197a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17049, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
