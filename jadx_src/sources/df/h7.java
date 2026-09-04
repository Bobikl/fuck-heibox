package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentBargainOrderDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class h7 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final RelativeLayout A;

    @androidx.annotation.n0
    public final CardView B;

    @androidx.annotation.n0
    public final LinearLayout C;

    @androidx.annotation.n0
    public final FrameLayout D;

    @androidx.annotation.n0
    public final RelativeLayout E;

    @androidx.annotation.n0
    public final LinearLayout F;

    @androidx.annotation.n0
    public final LinearLayout G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111291a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f111292b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111293c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111294d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111295e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111296f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111297g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f111298h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111299i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111300j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111301k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111302l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111303m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111304n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111305o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111306p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111307q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111308r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111309s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final ub0 f111310t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111311u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111312v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111313w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111314x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111315y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f111316z;

    private h7(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 ub0 ub0Var, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 View view, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 View view2, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout4, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RelativeLayout relativeLayout5, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f111291a = relativeLayout;
        this.f111292b = constraintLayout;
        this.f111293c = imageView;
        this.f111294d = imageView2;
        this.f111295e = imageView3;
        this.f111296f = imageView4;
        this.f111297g = imageView5;
        this.f111298h = progressBar;
        this.f111299i = textView;
        this.f111300j = textView2;
        this.f111301k = textView3;
        this.f111302l = textView4;
        this.f111303m = textView5;
        this.f111304n = textView6;
        this.f111305o = textView7;
        this.f111306p = textView8;
        this.f111307q = textView9;
        this.f111308r = textView10;
        this.f111309s = textView11;
        this.f111310t = ub0Var;
        this.f111311u = imageView6;
        this.f111312v = view;
        this.f111313w = relativeLayout2;
        this.f111314x = relativeLayout3;
        this.f111315y = view2;
        this.f111316z = constraintLayout2;
        this.A = relativeLayout4;
        this.B = cardView;
        this.C = linearLayout;
        this.D = frameLayout;
        this.E = relativeLayout5;
        this.F = linearLayout2;
        this.G = linearLayout3;
    }

    @androidx.annotation.n0
    public static h7 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17100, new Class[]{View.class}, h7.class);
        if (patchProxyResultProxy.isSupported) {
            return (h7) patchProxyResultProxy.result;
        }
        int i10 = R.id.cl_root;
        ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.cl_root);
        if (constraintLayout != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.iv_item_bg;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_item_bg);
                if (imageView2 != null) {
                    i10 = R.id.iv_item_img;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_item_img);
                    if (imageView3 != null) {
                        i10 = R.id.iv_rarity_tag;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_rarity_tag);
                        if (imageView4 != null) {
                            i10 = R.id.iv_special;
                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_special);
                            if (imageView5 != null) {
                                i10 = R.id.progress;
                                ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
                                if (progressBar != null) {
                                    i10 = R.id.tv_bargain_price;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_bargain_price);
                                    if (textView != null) {
                                        i10 = R.id.tv_btn_confirm;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_btn_confirm);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_check_order;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_check_order);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_create_time;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_create_time);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_float_value;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_float_value);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_name;
                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_name);
                                                        if (textView6 != null) {
                                                            i10 = R.id.tv_price1;
                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_price1);
                                                            if (textView7 != null) {
                                                                i10 = R.id.tv_price2;
                                                                TextView textView8 = (TextView) l3.d.a(view, R.id.tv_price2);
                                                                if (textView8 != null) {
                                                                    i10 = R.id.tv_state;
                                                                    TextView textView9 = (TextView) l3.d.a(view, R.id.tv_state);
                                                                    if (textView9 != null) {
                                                                        i10 = R.id.tv_title;
                                                                        TextView textView10 = (TextView) l3.d.a(view, R.id.tv_title);
                                                                        if (textView10 != null) {
                                                                            i10 = R.id.tv_trade_price;
                                                                            TextView textView11 = (TextView) l3.d.a(view, R.id.tv_trade_price);
                                                                            if (textView11 != null) {
                                                                                i10 = R.id.v_float_bar;
                                                                                View viewA = l3.d.a(view, R.id.v_float_bar);
                                                                                if (viewA != null) {
                                                                                    ub0 ub0VarA = ub0.a(viewA);
                                                                                    i10 = R.id.v_float_cursor;
                                                                                    ImageView imageView6 = (ImageView) l3.d.a(view, R.id.v_float_cursor);
                                                                                    if (imageView6 != null) {
                                                                                        i10 = R.id.v_progress;
                                                                                        View viewA2 = l3.d.a(view, R.id.v_progress);
                                                                                        if (viewA2 != null) {
                                                                                            i10 = R.id.vg_bargain_price;
                                                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_bargain_price);
                                                                                            if (relativeLayout != null) {
                                                                                                i10 = R.id.vg_bottom_bar;
                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                                                                                if (relativeLayout2 != null) {
                                                                                                    i10 = R.id.vg_close;
                                                                                                    View viewA3 = l3.d.a(view, R.id.vg_close);
                                                                                                    if (viewA3 != null) {
                                                                                                        i10 = R.id.vg_content;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i10 = R.id.vg_current_price;
                                                                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_current_price);
                                                                                                            if (relativeLayout3 != null) {
                                                                                                                i10 = R.id.vg_item_img;
                                                                                                                CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                                                                                if (cardView != null) {
                                                                                                                    i10 = R.id.vg_price_info;
                                                                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_price_info);
                                                                                                                    if (linearLayout != null) {
                                                                                                                        i10 = R.id.vg_progress;
                                                                                                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_progress);
                                                                                                                        if (frameLayout != null) {
                                                                                                                            i10 = R.id.vg_state;
                                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) l3.d.a(view, R.id.vg_state);
                                                                                                                            if (relativeLayout4 != null) {
                                                                                                                                i10 = R.id.vg_stickers;
                                                                                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_stickers);
                                                                                                                                if (linearLayout2 != null) {
                                                                                                                                    i10 = R.id.vg_tag;
                                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                                                                                    if (linearLayout3 != null) {
                                                                                                                                        return new h7((RelativeLayout) view, constraintLayout, imageView, imageView2, imageView3, imageView4, imageView5, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, ub0VarA, imageView6, viewA2, relativeLayout, relativeLayout2, viewA3, constraintLayout2, relativeLayout3, cardView, linearLayout, frameLayout, relativeLayout4, linearLayout2, linearLayout3);
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
    public static h7 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17098, new Class[]{LayoutInflater.class}, h7.class);
        return patchProxyResultProxy.isSupported ? (h7) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static h7 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17099, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, h7.class);
        if (patchProxyResultProxy.isSupported) {
            return (h7) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_bargain_order_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111291a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17101, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
