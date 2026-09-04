package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentMallPurchaseMobileBundleDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class x9 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117457a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f117458b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117459c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117460d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f117461e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117462f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117463g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117464h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117465i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117466j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117467k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117468l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117469m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117470n;

    private x9(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f117457a = relativeLayout;
        this.f117458b = cardView;
        this.f117459c = imageView;
        this.f117460d = imageView2;
        this.f117461e = progressBar;
        this.f117462f = textView;
        this.f117463g = textView2;
        this.f117464h = textView3;
        this.f117465i = textView4;
        this.f117466j = textView5;
        this.f117467k = textView6;
        this.f117468l = textView7;
        this.f117469m = linearLayout;
        this.f117470n = linearLayout2;
    }

    @androidx.annotation.n0
    public static x9 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17372, new Class[]{View.class}, x9.class);
        if (patchProxyResultProxy.isSupported) {
            return (x9) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_content;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_content);
        if (cardView != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.iv_window_close;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_window_close);
                if (imageView2 != null) {
                    i10 = R.id.progress;
                    ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
                    if (progressBar != null) {
                        i10 = R.id.tv_bundle_desc;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_bundle_desc);
                        if (textView != null) {
                            i10 = R.id.tv_copy;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_copy);
                            if (textView2 != null) {
                                i10 = R.id.tv_desc;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_desc);
                                if (textView3 != null) {
                                    i10 = R.id.tv_key;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_key);
                                    if (textView4 != null) {
                                        i10 = R.id.tv_option;
                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_option);
                                        if (textView5 != null) {
                                            i10 = R.id.tv_time_desc;
                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_time_desc);
                                            if (textView6 != null) {
                                                i10 = R.id.tv_title;
                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_title);
                                                if (textView7 != null) {
                                                    i10 = R.id.vg_content;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_content);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.vg_key;
                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_key);
                                                        if (linearLayout2 != null) {
                                                            return new x9((RelativeLayout) view, cardView, imageView, imageView2, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, linearLayout, linearLayout2);
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
    public static x9 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17370, new Class[]{LayoutInflater.class}, x9.class);
        return patchProxyResultProxy.isSupported ? (x9) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static x9 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17371, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, x9.class);
        if (patchProxyResultProxy.isSupported) {
            return (x9) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_mall_purchase_mobile_bundle_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117457a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17373, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
