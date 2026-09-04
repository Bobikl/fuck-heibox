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
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: FragmentPurchaseInventoryDialogBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class za implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @androidx.annotation.n0
    public final ConstraintLayout A;

    @androidx.annotation.n0
    public final CardView B;

    @androidx.annotation.n0
    public final LinearLayout C;

    @androidx.annotation.n0
    public final ConstraintLayout D;

    @androidx.annotation.n0
    public final FrameLayout E;

    @androidx.annotation.n0
    public final RelativeLayout F;

    @androidx.annotation.n0
    public final LinearLayout G;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118267a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CheckBox f118268b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f118269c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118270d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118271e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118272f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118273g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118274h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118275i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f118276j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f118277k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118278l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118279m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118280n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118281o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118282p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118283q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118284r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118285s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118286t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118287u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118288v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118289w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f118290x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f118291y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f118292z;

    private za(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CheckBox checkBox, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ImageView imageView6, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 View view2, @androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 ConstraintLayout constraintLayout3, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f118267a = relativeLayout;
        this.f118268b = checkBox;
        this.f118269c = view;
        this.f118270d = imageView;
        this.f118271e = imageView2;
        this.f118272f = imageView3;
        this.f118273g = imageView4;
        this.f118274h = imageView5;
        this.f118275i = imageView6;
        this.f118276j = progressBar;
        this.f118277k = recyclerView;
        this.f118278l = textView;
        this.f118279m = textView2;
        this.f118280n = textView3;
        this.f118281o = textView4;
        this.f118282p = textView5;
        this.f118283q = textView6;
        this.f118284r = textView7;
        this.f118285s = textView8;
        this.f118286t = textView9;
        this.f118287u = textView10;
        this.f118288v = textView11;
        this.f118289w = relativeLayout2;
        this.f118290x = view2;
        this.f118291y = constraintLayout;
        this.f118292z = frameLayout;
        this.A = constraintLayout2;
        this.B = cardView;
        this.C = linearLayout;
        this.D = constraintLayout3;
        this.E = frameLayout2;
        this.F = relativeLayout3;
        this.G = linearLayout2;
    }

    @androidx.annotation.n0
    public static za a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17484, new Class[]{View.class}, za.class);
        if (patchProxyResultProxy.isSupported) {
            return (za) patchProxyResultProxy.result;
        }
        int i10 = R.id.cb_all_supply;
        CheckBox checkBox = (CheckBox) l3.d.a(view, R.id.cb_all_supply);
        if (checkBox != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                i10 = R.id.iv_close;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
                if (imageView != null) {
                    i10 = R.id.iv_format;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_format);
                    if (imageView2 != null) {
                        i10 = R.id.iv_item_bg;
                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_item_bg);
                        if (imageView3 != null) {
                            i10 = R.id.iv_item_img;
                            ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_item_img);
                            if (imageView4 != null) {
                                i10 = R.id.iv_rarity_tag;
                                ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_rarity_tag);
                                if (imageView5 != null) {
                                    i10 = R.id.iv_special;
                                    ImageView imageView6 = (ImageView) l3.d.a(view, R.id.iv_special);
                                    if (imageView6 != null) {
                                        i10 = R.id.progress;
                                        ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.progress);
                                        if (progressBar != null) {
                                            i10 = R.id.rv;
                                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv);
                                            if (recyclerView != null) {
                                                i10 = R.id.rv_title;
                                                TextView textView = (TextView) l3.d.a(view, R.id.rv_title);
                                                if (textView != null) {
                                                    i10 = R.id.tv_all_supply;
                                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_all_supply);
                                                    if (textView2 != null) {
                                                        i10 = R.id.tv_btn_confirm;
                                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_btn_confirm);
                                                        if (textView3 != null) {
                                                            i10 = R.id.tv_count;
                                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_count);
                                                            if (textView4 != null) {
                                                                i10 = R.id.tv_fee_rate;
                                                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_fee_rate);
                                                                if (textView5 != null) {
                                                                    i10 = R.id.tv_name;
                                                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_name);
                                                                    if (textView6 != null) {
                                                                        i10 = R.id.tv_price;
                                                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_price);
                                                                        if (textView7 != null) {
                                                                            i10 = R.id.tv_price_symbol;
                                                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_price_symbol);
                                                                            if (textView8 != null) {
                                                                                i10 = R.id.tv_profit;
                                                                                TextView textView9 = (TextView) l3.d.a(view, R.id.tv_profit);
                                                                                if (textView9 != null) {
                                                                                    i10 = R.id.tv_profit_symbol;
                                                                                    TextView textView10 = (TextView) l3.d.a(view, R.id.tv_profit_symbol);
                                                                                    if (textView10 != null) {
                                                                                        i10 = R.id.tv_title;
                                                                                        TextView textView11 = (TextView) l3.d.a(view, R.id.tv_title);
                                                                                        if (textView11 != null) {
                                                                                            i10 = R.id.vg_bottom_bar;
                                                                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_bottom_bar);
                                                                                            if (relativeLayout != null) {
                                                                                                i10 = R.id.vg_close;
                                                                                                View viewA2 = l3.d.a(view, R.id.vg_close);
                                                                                                if (viewA2 != null) {
                                                                                                    i10 = R.id.vg_content;
                                                                                                    ConstraintLayout constraintLayout = (ConstraintLayout) l3.d.a(view, R.id.vg_content);
                                                                                                    if (constraintLayout != null) {
                                                                                                        i10 = R.id.vg_format;
                                                                                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_format);
                                                                                                        if (frameLayout != null) {
                                                                                                            i10 = R.id.vg_item;
                                                                                                            ConstraintLayout constraintLayout2 = (ConstraintLayout) l3.d.a(view, R.id.vg_item);
                                                                                                            if (constraintLayout2 != null) {
                                                                                                                i10 = R.id.vg_item_img;
                                                                                                                CardView cardView = (CardView) l3.d.a(view, R.id.vg_item_img);
                                                                                                                if (cardView != null) {
                                                                                                                    i10 = R.id.vg_merge;
                                                                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_merge);
                                                                                                                    if (linearLayout != null) {
                                                                                                                        i10 = R.id.vg_price;
                                                                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) l3.d.a(view, R.id.vg_price);
                                                                                                                        if (constraintLayout3 != null) {
                                                                                                                            i10 = R.id.vg_progress;
                                                                                                                            FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_progress);
                                                                                                                            if (frameLayout2 != null) {
                                                                                                                                i10 = R.id.vg_rv_title;
                                                                                                                                RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_rv_title);
                                                                                                                                if (relativeLayout2 != null) {
                                                                                                                                    i10 = R.id.vg_tag;
                                                                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_tag);
                                                                                                                                    if (linearLayout2 != null) {
                                                                                                                                        return new za((RelativeLayout) view, checkBox, viewA, imageView, imageView2, imageView3, imageView4, imageView5, imageView6, progressBar, recyclerView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, relativeLayout, viewA2, constraintLayout, frameLayout, constraintLayout2, cardView, linearLayout, constraintLayout3, frameLayout2, relativeLayout2, linearLayout2);
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
    public static za c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17482, new Class[]{LayoutInflater.class}, za.class);
        return patchProxyResultProxy.isSupported ? (za) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static za d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17483, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, za.class);
        if (patchProxyResultProxy.isSupported) {
            return (za) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_purchase_inventory_dialog, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118267a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17485, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
