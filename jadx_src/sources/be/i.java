package be;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.annotation.n0;
import androidx.annotation.p0;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbwallet.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HbwalletDialogWalletBalanceDetailBinding.java */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @n0
    private final RelativeLayout f35310a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @n0
    public final BaseBottomButton f35311b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @n0
    public final BaseBottomButton f35312c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @n0
    public final BaseBottomButton f35313d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @n0
    public final QMUIRadiusImageView f35314e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @n0
    public final ImageView f35315f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @n0
    public final TextView f35316g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @n0
    public final TextView f35317h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @n0
    public final TextView f35318i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @n0
    public final TextView f35319j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @n0
    public final FrameLayout f35320k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @n0
    public final LinearLayout f35321l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @n0
    public final LinearLayout f35322m;

    private i(@n0 RelativeLayout relativeLayout, @n0 BaseBottomButton baseBottomButton, @n0 BaseBottomButton baseBottomButton2, @n0 BaseBottomButton baseBottomButton3, @n0 QMUIRadiusImageView qMUIRadiusImageView, @n0 ImageView imageView, @n0 TextView textView, @n0 TextView textView2, @n0 TextView textView3, @n0 TextView textView4, @n0 FrameLayout frameLayout, @n0 LinearLayout linearLayout, @n0 LinearLayout linearLayout2) {
        this.f35310a = relativeLayout;
        this.f35311b = baseBottomButton;
        this.f35312c = baseBottomButton2;
        this.f35313d = baseBottomButton3;
        this.f35314e = qMUIRadiusImageView;
        this.f35315f = imageView;
        this.f35316g = textView;
        this.f35317h = textView2;
        this.f35318i = textView3;
        this.f35319j = textView4;
        this.f35320k = frameLayout;
        this.f35321l = linearLayout;
        this.f35322m = linearLayout2;
    }

    @n0
    public static i a(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, bb.c.l.N4, new Class[]{View.class}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        int i10 = R.id.bb_charge;
        BaseBottomButton baseBottomButton = (BaseBottomButton) l3.d.a(view, i10);
        if (baseBottomButton != null) {
            i10 = R.id.bb_exchange;
            BaseBottomButton baseBottomButton2 = (BaseBottomButton) l3.d.a(view, i10);
            if (baseBottomButton2 != null) {
                i10 = R.id.bb_exchange_hcoin;
                BaseBottomButton baseBottomButton3 = (BaseBottomButton) l3.d.a(view, i10);
                if (baseBottomButton3 != null) {
                    i10 = R.id.iv_icon;
                    QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, i10);
                    if (qMUIRadiusImageView != null) {
                        i10 = R.id.iv_tag;
                        ImageView imageView = (ImageView) l3.d.a(view, i10);
                        if (imageView != null) {
                            i10 = R.id.tv_balance;
                            TextView textView = (TextView) l3.d.a(view, i10);
                            if (textView != null) {
                                i10 = R.id.tv_desc;
                                TextView textView2 = (TextView) l3.d.a(view, i10);
                                if (textView2 != null) {
                                    i10 = R.id.tv_history;
                                    TextView textView3 = (TextView) l3.d.a(view, i10);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_value;
                                        TextView textView4 = (TextView) l3.d.a(view, i10);
                                        if (textView4 != null) {
                                            i10 = R.id.vg_bg;
                                            FrameLayout frameLayout = (FrameLayout) l3.d.a(view, i10);
                                            if (frameLayout != null) {
                                                i10 = R.id.vg_bottom_bar;
                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, i10);
                                                if (linearLayout != null) {
                                                    i10 = R.id.vg_hcoin_tips;
                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, i10);
                                                    if (linearLayout2 != null) {
                                                        return new i((RelativeLayout) view, baseBottomButton, baseBottomButton2, baseBottomButton3, qMUIRadiusImageView, imageView, textView, textView2, textView3, textView4, frameLayout, linearLayout, linearLayout2);
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

    @n0
    public static i c(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, bb.c.l.L4, new Class[]{LayoutInflater.class}, i.class);
        return patchProxyResultProxy.isSupported ? (i) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @n0
    public static i d(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, bb.c.l.M4, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, i.class);
        if (patchProxyResultProxy.isSupported) {
            return (i) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.hbwallet_dialog_wallet_balance_detail, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @n0
    public RelativeLayout b() {
        return this.f35310a;
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.l.O4, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
