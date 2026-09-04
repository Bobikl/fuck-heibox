package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletActivityAliWithdrawBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final LinearLayout f35221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final EditText f35222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final TextView f35223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final TextView f35224d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final TextView f35225e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final TextView f35226f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f35227g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f35228h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final TextView f35229i;

    private a(@n0 LinearLayout linearLayout, @n0 EditText editText, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 TextView textView5, @n0 TextView textView6, @n0 TextView textView7) {
        this.f35221a = linearLayout;
        this.f35222b = editText;
        this.f35223c = textView;
        this.f35224d = textView2;
        this.f35225e = textView3;
        this.f35226f = textView4;
        this.f35227g = textView5;
        this.f35228h = textView6;
        this.f35229i = textView7;
    }

    @n0
    public static a a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.f34175h4, new Class[]{View.class}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_withdraw;
        EditText editText = (EditText) l3.d.a(view, i10);
        if (editText != null) {
            i10 = R.id.tv_account_action;
            TextView textView = (TextView) l3.d.a(view, i10);
            if (textView != null) {
                i10 = R.id.tv_alipay_logon_id;
                TextView textView2 = (TextView) l3.d.a(view, i10);
                if (textView2 != null) {
                    i10 = R.id.tv_confirm;
                    TextView textView3 = (TextView) l3.d.a(view, i10);
                    if (textView3 != null) {
                        i10 = R.id.tv_desc;
                        TextView textView4 = (TextView) l3.d.a(view, i10);
                        if (textView4 != null) {
                            i10 = R.id.tv_info;
                            TextView textView5 = (TextView) l3.d.a(view, i10);
                            if (textView5 != null) {
                                i10 = R.id.tv_use_all;
                                TextView textView6 = (TextView) l3.d.a(view, i10);
                                if (textView6 != null) {
                                    i10 = R.id.tv_withdraw_agreement;
                                    TextView textView7 = (TextView) l3.d.a(view, i10);
                                    if (textView7 != null) {
                                        return new a((LinearLayout) view, editText, textView, textView2, textView3, textView4, textView5, textView6, textView7);
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

    @n0
    public static a c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.f34129f4, new Class[]{LayoutInflater.class}, a.class);
        return patchProxyResultProxy.isSupported ? (a) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static a d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.f34152g4, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, a.class);
        if (patchProxyResultProxy.isSupported) {
            return (a) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_activity_ali_withdraw, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public LinearLayout b() {
        return this.f35221a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.f34198i4, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
