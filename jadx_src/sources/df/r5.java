package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogHeyboxVoiceBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class r5 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115082a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f115083b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115084c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115085d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115086e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115087f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115088g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115089h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115090i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115091j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f115092k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115093l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115094m;

    private r5(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f115082a = constraintLayout;
        this.f115083b = cardView;
        this.f115084c = imageView;
        this.f115085d = textView;
        this.f115086e = textView2;
        this.f115087f = textView3;
        this.f115088g = linearLayout;
        this.f115089h = linearLayout2;
        this.f115090i = relativeLayout;
        this.f115091j = linearLayout3;
        this.f115092k = constraintLayout2;
        this.f115093l = linearLayout4;
        this.f115094m = relativeLayout2;
    }

    @androidx.annotation.n0
    public static r5 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16932, new Class[]{View.class}, r5.class);
        if (patchProxyResultProxy.isSupported) {
            return (r5) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_bg;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_bg);
        if (cardView != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.tv_left_button;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_left_button);
                if (textView != null) {
                    i10 = R.id.tv_right_button;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_right_button);
                    if (textView2 != null) {
                        i10 = R.id.tv_title;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                        if (textView3 != null) {
                            i10 = R.id.vg_bg;
                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bg);
                            if (linearLayout != null) {
                                i10 = R.id.vg_button_panel;
                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_button_panel);
                                if (linearLayout2 != null) {
                                    i10 = R.id.vg_center_view;
                                    RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_center_view);
                                    if (relativeLayout != null) {
                                        i10 = R.id.vg_components;
                                        LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_components);
                                        if (linearLayout3 != null) {
                                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                            i10 = R.id.vg_fixed_view;
                                            LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_fixed_view);
                                            if (linearLayout4 != null) {
                                                i10 = R.id.vg_top_view;
                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_top_view);
                                                if (relativeLayout2 != null) {
                                                    return new r5(constraintLayout, cardView, imageView, textView, textView2, textView3, linearLayout, linearLayout2, relativeLayout, linearLayout3, constraintLayout, linearLayout4, relativeLayout2);
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
    public static r5 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16930, new Class[]{LayoutInflater.class}, r5.class);
        return patchProxyResultProxy.isSupported ? (r5) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static r5 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16931, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, r5.class);
        if (patchProxyResultProxy.isSupported) {
            return (r5) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_heybox_voice, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115082a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16933, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
