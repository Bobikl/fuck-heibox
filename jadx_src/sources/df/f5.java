package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbcustomview.GradientTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogFragmentNewComerDiscountBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class f5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f110411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110412b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110413c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f110414d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110415e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110416f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final GradientTextView f110417g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110418h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110419i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f110420j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final BaseBottomButton f110421k;

    private f5(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 GradientTextView gradientTextView, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 BaseBottomButton baseBottomButton) {
        this.f110411a = linearLayout;
        this.f110412b = imageView;
        this.f110413c = imageView2;
        this.f110414d = imageView3;
        this.f110415e = textView;
        this.f110416f = textView2;
        this.f110417g = gradientTextView;
        this.f110418h = textView3;
        this.f110419i = textView4;
        this.f110420j = textView5;
        this.f110421k = baseBottomButton;
    }

    @androidx.annotation.n0
    public static f5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16884, new Class[]{View.class}, f5.class);
        if (patchProxyResultProxy.isSupported) {
            return (f5) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_game_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_img);
        if (imageView != null) {
            i10 = R.id.iv_line_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_line_img);
            if (imageView2 != null) {
                i10 = R.id.iv_top_img;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_top_img);
                if (imageView3 != null) {
                    i10 = R.id.tv_coupon_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_coupon_desc);
                    if (textView != null) {
                        i10 = R.id.tv_current_price;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_current_price);
                        if (textView2 != null) {
                            i10 = R.id.tv_discount;
                            GradientTextView gradientTextView = (GradientTextView) l3.d.a(view, R.id.tv_discount);
                            if (gradientTextView != null) {
                                i10 = R.id.tv_game_name;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_game_name);
                                if (textView3 != null) {
                                    i10 = R.id.tv_middle_title;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_middle_title);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_origin_price;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_origin_price);
                                        if (textView5 != null) {
                                            i10 = R.id.v_btn;
                                            BaseBottomButton baseBottomButton = (BaseBottomButton) l3.d.a(view, R.id.v_btn);
                                            if (baseBottomButton != null) {
                                                return new f5((LinearLayout) view, imageView, imageView2, imageView3, textView, textView2, gradientTextView, textView3, textView4, textView5, baseBottomButton);
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
    public static f5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16882, new Class[]{LayoutInflater.class}, f5.class);
        return patchProxyResultProxy.isSupported ? (f5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static f5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16883, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, f5.class);
        if (patchProxyResultProxy.isSupported) {
            return (f5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_fragment_new_comer_discount, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f110411a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16885, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
