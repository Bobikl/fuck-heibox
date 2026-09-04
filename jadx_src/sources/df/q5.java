package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogHcoinDeductionBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f114721b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114722c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114723d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114724e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114725f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114726g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114727h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f114728i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114729j;

    private q5(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout) {
        this.f114720a = relativeLayout;
        this.f114721b = editText;
        this.f114722c = imageView;
        this.f114723d = textView;
        this.f114724e = textView2;
        this.f114725f = textView3;
        this.f114726g = textView4;
        this.f114727h = textView5;
        this.f114728i = frameLayout;
        this.f114729j = linearLayout;
    }

    @androidx.annotation.n0
    public static q5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16928, new Class[]{View.class}, q5.class);
        if (patchProxyResultProxy.isSupported) {
            return (q5) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_hcoin;
        EditText editText = (EditText) l3.d.a(view, R.id.et_hcoin);
        if (editText != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.tv_confirm;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_confirm);
                if (textView != null) {
                    i10 = R.id.tv_faq;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_faq);
                    if (textView2 != null) {
                        i10 = R.id.tv_info;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_info);
                        if (textView3 != null) {
                            i10 = R.id.tv_order_price;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_order_price);
                            if (textView4 != null) {
                                i10 = R.id.tv_use_all;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_use_all);
                                if (textView5 != null) {
                                    i10 = R.id.vg_bg;
                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bg);
                                    if (frameLayout != null) {
                                        i10 = R.id.vg_bottom_bar;
                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                        if (linearLayout != null) {
                                            return new q5((RelativeLayout) view, editText, imageView, textView, textView2, textView3, textView4, textView5, frameLayout, linearLayout);
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
    public static q5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16926, new Class[]{LayoutInflater.class}, q5.class);
        return patchProxyResultProxy.isSupported ? (q5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16927, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q5.class);
        if (patchProxyResultProxy.isSupported) {
            return (q5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_hcoin_deduction, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114720a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16929, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
