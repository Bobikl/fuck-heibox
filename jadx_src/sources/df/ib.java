package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentSellBargainOrderDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class ib implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final LinearLayout A;

    @androidx.annotation.n0
    public final View B;

    @androidx.annotation.n0
    public final ConstraintLayout C;

    @androidx.annotation.n0
    public final CardView D;

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final FrameLayout F;

    @androidx.annotation.n0
    public final LinearLayout G;

    @androidx.annotation.n0
    public final LinearLayout H;

    @androidx.annotation.n0
    public final LinearLayout I;

    @androidx.annotation.n0
    public final LinearLayout J;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f111723a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f111724b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f111725c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111726d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111727e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111728f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111729g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111730h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111731i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f111732j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f111733k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111734l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final Switch f111735m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111736n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111737o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111738p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111739q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111740r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111741s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111742t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111743u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111744v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final ub0 f111745w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111746x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f111747y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111748z;

    private ib(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 View view2, @androidx.annotation.n0 Switch r15, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 ub0 ub0Var, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 View view3, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 View view4, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5, @androidx.annotation.n0 LinearLayout linearLayout6) {
        this.f111723a = relativeLayout;
        this.f111724b = checkBox;
        this.f111725c = constraintLayout;
        this.f111726d = view;
        this.f111727e = imageView;
        this.f111728f = imageView2;
        this.f111729g = imageView3;
        this.f111730h = imageView4;
        this.f111731i = imageView5;
        this.f111732j = progressBar;
        this.f111733k = recyclerView;
        this.f111734l = view2;
        this.f111735m = r15;
        this.f111736n = textView;
        this.f111737o = textView2;
        this.f111738p = textView3;
        this.f111739q = textView4;
        this.f111740r = textView5;
        this.f111741s = textView6;
        this.f111742t = textView7;
        this.f111743u = textView8;
        this.f111744v = textView9;
        this.f111745w = ub0Var;
        this.f111746x = imageView6;
        this.f111747y = view3;
        this.f111748z = relativeLayout2;
        this.A = linearLayout;
        this.B = view4;
        this.C = constraintLayout2;
        this.D = cardView;
        this.E = linearLayout2;
        this.F = frameLayout;
        this.G = linearLayout3;
        this.H = linearLayout4;
        this.I = linearLayout5;
        this.J = linearLayout6;
    }

    @androidx.annotation.n0
    public static ib a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17520, new Class[]{View.class}, ib.class);
        if (patchProxyResultProxy.isSupported) {
            return (ib) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_all;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_all);
        if (checkBox != null) {
            i10 = R.id.cl_root;
            ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.cl_root);
            if (constraintLayout != null) {
                i10 = R.id.divider;
                View viewA = l3.d.a(view, R.id.divider);
                if (viewA != null) {
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
                                            i10 = R.id.rv;
                                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                                            if (recyclerView != null) {
                                                i10 = R.id.rv_divider;
                                                View viewA2 = l3.d.a(view, R.id.rv_divider);
                                                if (viewA2 != null) {
                                                    i10 = R.id.sb_bargain;
                                                    Switch r16 = (Switch) l3.d.a(view, R.id.sb_bargain);
                                                    if (r16 != null) {
                                                        i10 = R.id.tv_accept;
                                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_accept);
                                                        if (textView != null) {
                                                            i10 = R.id.tv_change_price;
                                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_change_price);
                                                            if (textView2 != null) {
                                                                i10 = R.id.tv_check_order;
                                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_check_order);
                                                                if (textView3 != null) {
                                                                    i10 = R.id.tv_float_value;
                                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_float_value);
                                                                    if (textView4 != null) {
                                                                        i10 = R.id.tv_item_price;
                                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_item_price);
                                                                        if (textView5 != null) {
                                                                            i10 = R.id.tv_name;
                                                                            TextView textView6 = (TextView) l3.d.a(view, R.id.tv_name);
                                                                            if (textView6 != null) {
                                                                                i10 = R.id.tv_reject;
                                                                                TextView textView7 = (TextView) l3.d.a(view, R.id.tv_reject);
                                                                                if (textView7 != null) {
                                                                                    i10 = R.id.tv_switch_desc;
                                                                                    TextView textView8 = (TextView) l3.d.a(view, R.id.tv_switch_desc);
                                                                                    if (textView8 != null) {
                                                                                        i10 = R.id.tv_title;
                                                                                        TextView textView9 = (TextView) l3.d.a(view, R.id.tv_title);
                                                                                        if (textView9 != null) {
                                                                                            i10 = R.id.v_float_bar;
                                                                                            View viewA3 = l3.d.a(view, R.id.v_float_bar);
                                                                                            if (viewA3 != null) {
                                                                                                ub0 ub0VarA = ub0.a(viewA3);
                                                                                                i10 = R.id.v_float_cursor;
                                                                                                ImageView imageView6 = (ImageView) l3.d.a(view, R.id.v_float_cursor);
                                                                                                if (imageView6 != null) {
                                                                                                    i10 = R.id.v_progress;
                                                                                                    View viewA4 = l3.d.a(view, R.id.v_progress);
                                                                                                    if (viewA4 != null) {
                                                                                                        i10 = R.id.vg_bottom_bar;
                                                                                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                                                                                        if (relativeLayout != null) {
                                                                                                            i10 = R.id.vg_check_all;
                                                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_check_all);
                                                                                                            if (linearLayout != null) {
                                                                                                                i10 = R.id.vg_close;
                                                                                                                View viewA5 = l3.d.a(view, R.id.vg_close);
                                                                                                                if (viewA5 != null) {
                                                                                                                    i10 = R.id.vg_content;
                                                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                                                                                                                    if (constraintLayout2 != null) {
                                                                                                                        i10 = R.id.vg_item_img;
                                                                                                                        CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                                                                                        if (cardView != null) {
                                                                                                                            i10 = R.id.vg_price_info;
                                                                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_price_info);
                                                                                                                            if (linearLayout2 != null) {
                                                                                                                                i10 = R.id.vg_progress;
                                                                                                                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_progress);
                                                                                                                                if (frameLayout != null) {
                                                                                                                                    i10 = R.id.vg_rv_title;
                                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_rv_title);
                                                                                                                                    if (linearLayout3 != null) {
                                                                                                                                        i10 = R.id.vg_stickers;
                                                                                                                                        LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_stickers);
                                                                                                                                        if (linearLayout4 != null) {
                                                                                                                                            i10 = R.id.vg_switch;
                                                                                                                                            LinearLayout linearLayout5 = (LinearLayout) l3.d.a(view, R.id.vg_switch);
                                                                                                                                            if (linearLayout5 != null) {
                                                                                                                                                i10 = R.id.vg_tag;
                                                                                                                                                LinearLayout linearLayout6 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                                                                                                if (linearLayout6 != null) {
                                                                                                                                                    return new ib((RelativeLayout) view, checkBox, constraintLayout, viewA, imageView, imageView2, imageView3, imageView4, imageView5, progressBar, recyclerView, viewA2, r16, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, ub0VarA, imageView6, viewA4, relativeLayout, linearLayout, viewA5, constraintLayout2, cardView, linearLayout2, frameLayout, linearLayout3, linearLayout4, linearLayout5, linearLayout6);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @androidx.annotation.n0
    public static ib c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17518, new Class[]{LayoutInflater.class}, ib.class);
        return patchProxyResultProxy.isSupported ? (ib) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static ib d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17519, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, ib.class);
        if (patchProxyResultProxy.isSupported) {
            return (ib) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sell_bargain_order_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f111723a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17521, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
