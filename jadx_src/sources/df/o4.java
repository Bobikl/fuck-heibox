package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogBetaTestBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class o4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f114083a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114084b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114085c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114086d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114087e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114088f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114089g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114090h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f114091i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114092j;

    private o4(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f114083a = relativeLayout;
        this.f114084b = cardView;
        this.f114085c = imageView;
        this.f114086d = textView;
        this.f114087e = textView2;
        this.f114088f = textView3;
        this.f114089g = textView4;
        this.f114090h = linearLayout;
        this.f114091i = linearLayout2;
        this.f114092j = relativeLayout2;
    }

    @androidx.annotation.n0
    public static o4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16816, new Class[]{View.class}, o4.class);
        if (patchProxyResultProxy.isSupported) {
            return (o4) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_bg;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_bg);
        if (cardView != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.tv_message;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_message);
                if (textView != null) {
                    i10 = R.id.tv_positive_button;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_positive_button);
                    if (textView2 != null) {
                        i10 = R.id.tv_title;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView3 != null) {
                            i10 = R.id.tv_version_name;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_version_name);
                            if (textView4 != null) {
                                i10 = R.id.vg_bg;
                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bg);
                                if (linearLayout != null) {
                                    i10 = R.id.vg_button_panel;
                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_button_panel);
                                    if (linearLayout2 != null) {
                                        RelativeLayout relativeLayout = (RelativeLayout) view;
                                        return new o4(relativeLayout, cardView, imageView, textView, textView2, textView3, textView4, linearLayout, linearLayout2, relativeLayout);
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
    public static o4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16814, new Class[]{LayoutInflater.class}, o4.class);
        return patchProxyResultProxy.isSupported ? (o4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static o4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16815, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, o4.class);
        if (patchProxyResultProxy.isSupported) {
            return (o4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_beta_test, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f114083a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16817, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
