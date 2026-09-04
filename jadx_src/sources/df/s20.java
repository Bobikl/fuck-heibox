package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.ViewAnimator;
import androidx.cardview.widget.CardView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBindCardPsnBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class s20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f115415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CircularProgressIndicator f115416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115417c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115418d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115419e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f115420f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115421g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115422h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115423i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115424j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115425k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115426l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115427m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final ViewAnimator f115428n;

    private s20(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CircularProgressIndicator circularProgressIndicator, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view, @androidx.annotation.n0 ViewAnimator viewAnimator) {
        this.f115415a = cardView;
        this.f115416b = circularProgressIndicator;
        this.f115417c = imageView;
        this.f115418d = imageView2;
        this.f115419e = linearLayout;
        this.f115420f = editText;
        this.f115421g = relativeLayout;
        this.f115422h = textView;
        this.f115423i = textView2;
        this.f115424j = textView3;
        this.f115425k = textView4;
        this.f115426l = textView5;
        this.f115427m = view;
        this.f115428n = viewAnimator;
    }

    @androidx.annotation.n0
    public static s20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20354, new Class[]{View.class}, s20.class);
        if (patchProxyResultProxy.isSupported) {
            return (s20) patchProxyResultProxy.result;
        }
        int i10 = R.id.cp_loading;
        CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) l3.d.a(view, R.id.cp_loading);
        if (circularProgressIndicator != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.iv_mask;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_mask);
                if (imageView2 != null) {
                    i10 = R.id.ll_desc;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_desc);
                    if (linearLayout != null) {
                        i10 = R.id.name_edit_text;
                        EditText editText = (EditText) l3.d.a(view, R.id.name_edit_text);
                        if (editText != null) {
                            i10 = R.id.rl_bg;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_bg);
                            if (relativeLayout != null) {
                                i10 = R.id.tv_bind_btn;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_bind_btn);
                                if (textView != null) {
                                    i10 = R.id.tv_desc;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_desc);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_help;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_help);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_oversea;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_oversea);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_replace;
                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_replace);
                                                if (textView5 != null) {
                                                    i10 = R.id.v_vertical_divider;
                                                    View viewA = l3.d.a(view, R.id.v_vertical_divider);
                                                    if (viewA != null) {
                                                        i10 = R.id.va_desc;
                                                        ViewAnimator viewAnimator = (ViewAnimator) l3.d.a(view, R.id.va_desc);
                                                        if (viewAnimator != null) {
                                                            return new s20((CardView) view, circularProgressIndicator, imageView, imageView2, linearLayout, editText, relativeLayout, textView, textView2, textView3, textView4, textView5, viewA, viewAnimator);
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
    public static s20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20352, new Class[]{LayoutInflater.class}, s20.class);
        return patchProxyResultProxy.isSupported ? (s20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static s20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20353, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, s20.class);
        if (patchProxyResultProxy.isSupported) {
            return (s20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bind_card_psn, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f115415a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20355, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
