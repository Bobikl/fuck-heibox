package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.utils.widget.ImageFilterView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogFragmentSteamDirectPurchasePaymentBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class k5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f112425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageFilterView f112427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f112429e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadioButton f112430f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112431g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112432h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112433i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112434j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112435k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112436l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112437m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112438n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112439o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f112440p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final j5 f112441q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112442r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112443s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112444t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112445u;

    private k5(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageFilterView imageFilterView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 RadioButton radioButton, @androidx.annotation.n0 RadioButton radioButton2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 j5 j5Var, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5) {
        this.f112425a = relativeLayout;
        this.f112426b = imageView;
        this.f112427c = imageFilterView;
        this.f112428d = imageView2;
        this.f112429e = radioButton;
        this.f112430f = radioButton2;
        this.f112431g = textView;
        this.f112432h = textView2;
        this.f112433i = textView3;
        this.f112434j = textView4;
        this.f112435k = textView5;
        this.f112436l = textView6;
        this.f112437m = textView7;
        this.f112438n = textView8;
        this.f112439o = linearLayout;
        this.f112440p = constraintLayout;
        this.f112441q = j5Var;
        this.f112442r = linearLayout2;
        this.f112443s = linearLayout3;
        this.f112444t = linearLayout4;
        this.f112445u = linearLayout5;
    }

    @androidx.annotation.n0
    public static k5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16904, new Class[]{View.class}, k5.class);
        if (patchProxyResultProxy.isSupported) {
            return (k5) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_close;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
        if (imageView != null) {
            i10 = R.id.iv_game;
            ImageFilterView imageFilterView = (ImageFilterView) l3.d.a(view, R.id.iv_game);
            if (imageFilterView != null) {
                i10 = R.id.iv_logo;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_logo);
                if (imageView2 != null) {
                    i10 = R.id.rb_alipay;
                    RadioButton radioButton = (RadioButton) l3.d.a(view, R.id.rb_alipay);
                    if (radioButton != null) {
                        i10 = R.id.rb_steam_balance;
                        RadioButton radioButton2 = (RadioButton) l3.d.a(view, R.id.rb_steam_balance);
                        if (radioButton2 != null) {
                            i10 = R.id.tv_balance;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_balance);
                            if (textView != null) {
                                i10 = R.id.tv_cny;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_cny);
                                if (textView2 != null) {
                                    i10 = R.id.tv_game_name;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_game_name);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_hint;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_hint);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_hint_sub;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_hint_sub);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_menu_title;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_menu_title);
                                                if (textView6 != null) {
                                                    i10 = R.id.tv_purchase;
                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_purchase);
                                                    if (textView7 != null) {
                                                        i10 = R.id.tv_title;
                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_title);
                                                        if (textView8 != null) {
                                                            i10 = R.id.vg_alipay;
                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_alipay);
                                                            if (linearLayout != null) {
                                                                i10 = R.id.vg_content;
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                                                                if (constraintLayout != null) {
                                                                    i10 = R.id.vg_current_account;
                                                                    View viewA = l3.d.a(view, R.id.vg_current_account);
                                                                    if (viewA != null) {
                                                                        j5 j5VarA = j5.a(viewA);
                                                                        i10 = R.id.vg_game;
                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_game);
                                                                        if (linearLayout2 != null) {
                                                                            i10 = R.id.vg_hint;
                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_hint);
                                                                            if (linearLayout3 != null) {
                                                                                i10 = R.id.vg_payment;
                                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_payment);
                                                                                if (linearLayout4 != null) {
                                                                                    i10 = R.id.vg_steam_balance;
                                                                                    LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_steam_balance);
                                                                                    if (linearLayout5 != null) {
                                                                                        return new k5((RelativeLayout) view, imageView, imageFilterView, imageView2, radioButton, radioButton2, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, linearLayout, constraintLayout, j5VarA, linearLayout2, linearLayout3, linearLayout4, linearLayout5);
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
    public static k5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16902, new Class[]{LayoutInflater.class}, k5.class);
        return patchProxyResultProxy.isSupported ? (k5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static k5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16903, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, k5.class);
        if (patchProxyResultProxy.isSupported) {
            return (k5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_steam_direct_purchase_payment, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f112425a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16905, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
