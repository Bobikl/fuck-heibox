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

/* JADX INFO: compiled from: ItemGameBundlesV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class gk implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f111019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final mb.o f111020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final x3 f111021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f111022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f111030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f111032n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111033o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f111034p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111035q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f111036r;

    private gk(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 mb.o oVar, @androidx.annotation.n0 x3 x3Var, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout4, @androidx.annotation.n0 LinearLayout linearLayout5) {
        this.f111019a = linearLayout;
        this.f111020b = oVar;
        this.f111021c = x3Var;
        this.f111022d = imageView;
        this.f111023e = textView;
        this.f111024f = textView2;
        this.f111025g = textView3;
        this.f111026h = textView4;
        this.f111027i = textView5;
        this.f111028j = textView6;
        this.f111029k = textView7;
        this.f111030l = textView8;
        this.f111031m = linearLayout2;
        this.f111032n = cardView;
        this.f111033o = linearLayout3;
        this.f111034p = relativeLayout;
        this.f111035q = linearLayout4;
        this.f111036r = linearLayout5;
    }

    @androidx.annotation.n0
    public static gk a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18447, new Class[]{View.class}, gk.class);
        if (patchProxyResultProxy.isSupported) {
            return (gk) patchProxyResultProxy.result;
        }
        int i10 = R.id.divider;
        View viewA = l3.d.a(view, R.id.divider);
        if (viewA != null) {
            mb.o oVarA = mb.o.a(viewA);
            i10 = R.id.gpv;
            View viewA2 = l3.d.a(view, R.id.gpv);
            if (viewA2 != null) {
                x3 x3VarA = x3.a(viewA2);
                i10 = R.id.iv_image;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_image);
                if (imageView != null) {
                    i10 = R.id.tv_deadline_date;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_deadline_date);
                    if (textView != null) {
                        i10 = R.id.tv_deadline_date_unit;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_deadline_date_unit);
                        if (textView2 != null) {
                            i10 = R.id.tv_discount;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_discount);
                            if (textView3 != null) {
                                i10 = R.id.tv_game_count;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_game_count);
                                if (textView4 != null) {
                                    i10 = R.id.tv_name;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_name);
                                    if (textView5 != null) {
                                        i10 = R.id.tv_own_rate;
                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_own_rate);
                                        if (textView6 != null) {
                                            i10 = R.id.tv_owned;
                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_owned);
                                            if (textView7 != null) {
                                                i10 = R.id.tv_publish_date;
                                                TextView textView8 = (TextView) l3.d.a(view, R.id.tv_publish_date);
                                                if (textView8 != null) {
                                                    i10 = R.id.vg_discount_deadline;
                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_discount_deadline);
                                                    if (linearLayout != null) {
                                                        i10 = R.id.vg_image;
                                                        CardView cardView = (CardView) l3.d.a(view, R.id.vg_image);
                                                        if (cardView != null) {
                                                            i10 = R.id.vg_is_owned;
                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_is_owned);
                                                            if (linearLayout2 != null) {
                                                                i10 = R.id.vg_item;
                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_item);
                                                                if (relativeLayout != null) {
                                                                    i10 = R.id.vg_own_rate;
                                                                    LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_own_rate);
                                                                    if (linearLayout3 != null) {
                                                                        i10 = R.id.vg_publish_date;
                                                                        LinearLayout linearLayout4 = (LinearLayout) l3.d.a(view, R.id.vg_publish_date);
                                                                        if (linearLayout4 != null) {
                                                                            return new gk((LinearLayout) view, oVarA, x3VarA, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, linearLayout, cardView, linearLayout2, relativeLayout, linearLayout3, linearLayout4);
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
    public static gk c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18445, new Class[]{LayoutInflater.class}, gk.class);
        return patchProxyResultProxy.isSupported ? (gk) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static gk d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18446, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, gk.class);
        if (patchProxyResultProxy.isSupported) {
            return (gk) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_bundles_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f111019a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18448, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
