package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.GridLayout;
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

/* JADX INFO: compiled from: DialogCustomCheckInBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class v4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116609a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f116610b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f116611c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116612d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final GridLayout f116613e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116614f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116615g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116616h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116617i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116618j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116619k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116620l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116621m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116622n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116623o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116624p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116625q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f116626r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f116627s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116628t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116629u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f116630v;

    private v4(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 GridLayout gridLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout4) {
        this.f116609a = relativeLayout;
        this.f116610b = checkBox;
        this.f116611c = constraintLayout;
        this.f116612d = cardView;
        this.f116613e = gridLayout;
        this.f116614f = imageView;
        this.f116615g = imageView2;
        this.f116616h = imageView3;
        this.f116617i = linearLayout;
        this.f116618j = textView;
        this.f116619k = textView2;
        this.f116620l = textView3;
        this.f116621m = textView4;
        this.f116622n = textView5;
        this.f116623o = textView6;
        this.f116624p = textView7;
        this.f116625q = view;
        this.f116626r = view2;
        this.f116627s = linearLayout2;
        this.f116628t = relativeLayout2;
        this.f116629u = relativeLayout3;
        this.f116630v = relativeLayout4;
    }

    @androidx.annotation.n0
    public static v4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16844, new Class[]{View.class}, v4.class);
        if (patchProxyResultProxy.isSupported) {
            return (v4) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_check_in_hint;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_check_in_hint);
        if (checkBox != null) {
            i10 = R.id.container;
            ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.container);
            if (constraintLayout != null) {
                i10 = R.id.cv_confirm;
                CardView cardView = (CardView) l3.d.a(view, R.id.cv_confirm);
                if (cardView != null) {
                    i10 = R.id.grid;
                    GridLayout gridLayout = (GridLayout) l3.d.a(view, R.id.grid);
                    if (gridLayout != null) {
                        i10 = R.id.iv_7th_img;
                        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_7th_img);
                        if (imageView != null) {
                            i10 = R.id.iv_close;
                            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_close);
                            if (imageView2 != null) {
                                i10 = R.id.iv_icon;
                                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_icon);
                                if (imageView3 != null) {
                                    i10 = R.id.ll_content;
                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_content);
                                    if (linearLayout != null) {
                                        i10 = R.id.tv_7th_desc;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_7th_desc);
                                        if (textView != null) {
                                            i10 = R.id.tv_7th_title;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_7th_title);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_check_in;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_check_in);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_check_in_hint;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_check_in_hint);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_confirm;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_confirm);
                                                        if (textView5 != null) {
                                                            i10 = R.id.tv_desc;
                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_desc);
                                                            if (textView6 != null) {
                                                                i10 = R.id.tv_title;
                                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_title);
                                                                if (textView7 != null) {
                                                                    i10 = R.id.v_body_bg;
                                                                    View viewA = l3.d.a(view, R.id.v_body_bg);
                                                                    if (viewA != null) {
                                                                        i10 = R.id.v_mask;
                                                                        View viewA2 = l3.d.a(view, R.id.v_mask);
                                                                        if (viewA2 != null) {
                                                                            i10 = R.id.vg_check;
                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_check);
                                                                            if (linearLayout2 != null) {
                                                                                i10 = R.id.vg_check_in_hint;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_check_in_hint);
                                                                                if (relativeLayout != null) {
                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) view;
                                                                                    i10 = R.id.vg_sunday;
                                                                                    RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_sunday);
                                                                                    if (relativeLayout3 != null) {
                                                                                        return new v4(relativeLayout2, checkBox, constraintLayout, cardView, gridLayout, imageView, imageView2, imageView3, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, viewA, viewA2, linearLayout2, relativeLayout, relativeLayout2, relativeLayout3);
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
    public static v4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16842, new Class[]{LayoutInflater.class}, v4.class);
        return patchProxyResultProxy.isSupported ? (v4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static v4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16843, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, v4.class);
        if (patchProxyResultProxy.isSupported) {
            return (v4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_custom_check_in, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116609a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16845, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
