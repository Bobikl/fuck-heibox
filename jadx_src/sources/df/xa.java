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
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentPurchaseDetailDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class xa implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final CardView A;

    @androidx.annotation.n0
    public final ConstraintLayout B;

    @androidx.annotation.n0
    public final FrameLayout C;

    @androidx.annotation.n0
    public final LinearLayout D;

    @androidx.annotation.n0
    public final LinearLayout E;

    @androidx.annotation.n0
    public final LinearLayout F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117474a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f117475b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117476c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117477d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117478e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117479f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117480g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117481h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f117482i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117483j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117484k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117485l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117486m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117487n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117488o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117489p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117490q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117491r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117492s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117493t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117494u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117495v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117496w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117497x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f117498y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f117499z;

    private xa(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 View view, @androidx.annotation.n0 View view2, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ConstraintLayout constraintLayout3, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f117474a = relativeLayout;
        this.f117475b = oVar;
        this.f117476c = linearLayout;
        this.f117477d = imageView;
        this.f117478e = imageView2;
        this.f117479f = imageView3;
        this.f117480g = imageView4;
        this.f117481h = imageView5;
        this.f117482i = progressBar;
        this.f117483j = recyclerView;
        this.f117484k = textView;
        this.f117485l = textView2;
        this.f117486m = textView3;
        this.f117487n = textView4;
        this.f117488o = textView5;
        this.f117489p = textView6;
        this.f117490q = textView7;
        this.f117491r = textView8;
        this.f117492s = textView9;
        this.f117493t = textView10;
        this.f117494u = textView11;
        this.f117495v = textView12;
        this.f117496w = view;
        this.f117497x = view2;
        this.f117498y = constraintLayout;
        this.f117499z = constraintLayout2;
        this.A = cardView;
        this.B = constraintLayout3;
        this.C = frameLayout;
        this.D = linearLayout2;
        this.E = linearLayout3;
        this.F = linearLayout4;
    }

    @androidx.annotation.n0
    public static xa a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17476, new Class[]{View.class}, xa.class);
        if (patchProxyResultProxy.isSupported) {
            return (xa) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.empty_view;
            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.empty_view);
            if (linearLayout != null) {
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
                                            i10 = R.id.rv_title;
                                            TextView textView = (TextView) l3.d.a(view, R.id.rv_title);
                                            if (textView != null) {
                                                i10 = R.id.tv_action;
                                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_action);
                                                if (textView2 != null) {
                                                    i10 = R.id.tv_count;
                                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_count);
                                                    if (textView3 != null) {
                                                        i10 = R.id.tv_highest_price;
                                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_highest_price);
                                                        if (textView4 != null) {
                                                            i10 = R.id.tv_name;
                                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_name);
                                                            if (textView5 != null) {
                                                                i10 = R.id.tv_price;
                                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_price);
                                                                if (textView6 != null) {
                                                                    i10 = R.id.tv_price_desc;
                                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_price_desc);
                                                                    if (textView7 != null) {
                                                                        i10 = R.id.tv_price_symbol;
                                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_price_symbol);
                                                                        if (textView8 != null) {
                                                                            i10 = R.id.tv_record_state;
                                                                            TextView textView9 = (TextView) l3.d.a(view, R.id.tv_record_state);
                                                                            if (textView9 != null) {
                                                                                i10 = R.id.tv_supply_state;
                                                                                TextView textView10 = (TextView) l3.d.a(view, R.id.tv_supply_state);
                                                                                if (textView10 != null) {
                                                                                    i10 = R.id.tv_title;
                                                                                    TextView textView11 = (TextView) l3.d.a(view, R.id.tv_title);
                                                                                    if (textView11 != null) {
                                                                                        i10 = R.id.tv_total;
                                                                                        TextView textView12 = (TextView) l3.d.a(view, R.id.tv_total);
                                                                                        if (textView12 != null) {
                                                                                            i10 = R.id.v_supply_state;
                                                                                            View viewA2 = l3.d.a(view, R.id.v_supply_state);
                                                                                            if (viewA2 != null) {
                                                                                                i10 = R.id.vg_close;
                                                                                                View viewA3 = l3.d.a(view, R.id.vg_close);
                                                                                                if (viewA3 != null) {
                                                                                                    i10 = R.id.vg_content;
                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                                                                                                    if (constraintLayout != null) {
                                                                                                        i10 = R.id.vg_item;
                                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) l3.d.a(view, R.id.vg_item);
                                                                                                        if (constraintLayout2 != null) {
                                                                                                            i10 = R.id.vg_item_img;
                                                                                                            CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                                                                            if (cardView != null) {
                                                                                                                i10 = R.id.vg_price_info;
                                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) l3.d.a(view, R.id.vg_price_info);
                                                                                                                if (constraintLayout3 != null) {
                                                                                                                    i10 = R.id.vg_progress;
                                                                                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_progress);
                                                                                                                    if (frameLayout != null) {
                                                                                                                        i10 = R.id.vg_supply_info;
                                                                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_supply_info);
                                                                                                                        if (linearLayout2 != null) {
                                                                                                                            i10 = R.id.vg_supply_state;
                                                                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_supply_state);
                                                                                                                            if (linearLayout3 != null) {
                                                                                                                                i10 = R.id.vg_tag;
                                                                                                                                LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                                                                                if (linearLayout4 != null) {
                                                                                                                                    return new xa((RelativeLayout) view, oVarA, linearLayout, imageView, imageView2, imageView3, imageView4, imageView5, progressBar, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, viewA2, viewA3, constraintLayout, constraintLayout2, cardView, constraintLayout3, frameLayout, linearLayout2, linearLayout3, linearLayout4);
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
    public static xa c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17474, new Class[]{LayoutInflater.class}, xa.class);
        return patchProxyResultProxy.isSupported ? (xa) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static xa d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17475, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, xa.class);
        if (patchProxyResultProxy.isSupported) {
            return (xa) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_purchase_detail_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117474a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17477, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
