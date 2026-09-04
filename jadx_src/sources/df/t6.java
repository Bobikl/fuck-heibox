package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogTradeOfferConfirmBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class t6 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115859b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f115860c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115861d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f115862e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115863f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f115864g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115865h;

    private t6(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 EditText editText2, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 EditText editText3, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f115858a = constraintLayout;
        this.f115859b = imageView;
        this.f115860c = editText;
        this.f115861d = textView;
        this.f115862e = editText2;
        this.f115863f = textView2;
        this.f115864g = editText3;
        this.f115865h = linearLayout;
    }

    @androidx.annotation.n0
    public static t6 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17044, new Class[]{View.class}, t6.class);
        if (patchProxyResultProxy.isSupported) {
            return (t6) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bg;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
        if (imageView != null) {
            i10 = R.id.tv_day_desc;
            EditText editText = (EditText) l3.d.a(view, R.id.tv_day_desc);
            if (editText != null) {
                i10 = R.id.tv_desc;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                if (textView != null) {
                    i10 = R.id.tv_month_desc;
                    EditText editText2 = (EditText) l3.d.a(view, R.id.tv_month_desc);
                    if (editText2 != null) {
                        i10 = R.id.tv_title;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView2 != null) {
                            i10 = R.id.tv_year_desc;
                            EditText editText3 = (EditText) l3.d.a(view, R.id.tv_year_desc);
                            if (editText3 != null) {
                                i10 = R.id.vg_time;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_time);
                                if (linearLayout != null) {
                                    return new t6((ConstraintLayout) view, imageView, editText, textView, editText2, textView2, editText3, linearLayout);
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
    public static t6 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17042, new Class[]{LayoutInflater.class}, t6.class);
        return patchProxyResultProxy.isSupported ? (t6) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static t6 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17043, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, t6.class);
        if (patchProxyResultProxy.isSupported) {
            return (t6) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_trade_offer_confirm, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115858a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17045, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
