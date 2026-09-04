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

/* JADX INFO: compiled from: ItemSteamRechargeCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class zy implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f118483a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f118484b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f118485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118486d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118489g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118490h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118491i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118492j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118493k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118494l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118495m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118496n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f118497o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118498p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f118499q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f118500r;

    private zy(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 TextView textView12, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f118483a = relativeLayout;
        this.f118484b = cardView;
        this.f118485c = imageView;
        this.f118486d = textView;
        this.f118487e = textView2;
        this.f118488f = textView3;
        this.f118489g = textView4;
        this.f118490h = textView5;
        this.f118491i = textView6;
        this.f118492j = textView7;
        this.f118493k = textView8;
        this.f118494l = textView9;
        this.f118495m = textView10;
        this.f118496n = textView11;
        this.f118497o = textView12;
        this.f118498p = relativeLayout2;
        this.f118499q = linearLayout;
        this.f118500r = relativeLayout3;
    }

    @androidx.annotation.n0
    public static zy a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19968, new Class[]{View.class}, zy.class);
        if (patchProxyResultProxy.isSupported) {
            return (zy) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_img;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_img);
        if (cardView != null) {
            i10 = R.id.iv_img;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView != null) {
                i10 = R.id.tv_activate;
                TextView textView = (TextView) l3.d.a(view, R.id.tv_activate);
                if (textView != null) {
                    i10 = R.id.tv_activate_state;
                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_activate_state);
                    if (textView2 != null) {
                        i10 = R.id.tv_claim;
                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_claim);
                        if (textView3 != null) {
                            i10 = R.id.tv_copy;
                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_copy);
                            if (textView4 != null) {
                                i10 = R.id.tv_current_rmb;
                                TextView textView5 = (TextView) l3.d.a(view, R.id.tv_current_rmb);
                                if (textView5 != null) {
                                    i10 = R.id.tv_discount;
                                    TextView textView6 = (TextView) l3.d.a(view, R.id.tv_discount);
                                    if (textView6 != null) {
                                        i10 = R.id.tv_key;
                                        TextView textView7 = (TextView) l3.d.a(view, R.id.tv_key);
                                        if (textView7 != null) {
                                            i10 = R.id.tv_name_and_cnt;
                                            TextView textView8 = (TextView) l3.d.a(view, R.id.tv_name_and_cnt);
                                            if (textView8 != null) {
                                                i10 = R.id.tv_name_top;
                                                TextView textView9 = (TextView) l3.d.a(view, R.id.tv_name_top);
                                                if (textView9 != null) {
                                                    i10 = R.id.tv_name_waiting;
                                                    TextView textView10 = (TextView) l3.d.a(view, R.id.tv_name_waiting);
                                                    if (textView10 != null) {
                                                        i10 = R.id.tv_original_rmb;
                                                        TextView textView11 = (TextView) l3.d.a(view, R.id.tv_original_rmb);
                                                        if (textView11 != null) {
                                                            i10 = R.id.tv_waiting;
                                                            TextView textView12 = (TextView) l3.d.a(view, R.id.tv_waiting);
                                                            if (textView12 != null) {
                                                                i10 = R.id.vg_activate_state;
                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_activate_state);
                                                                if (relativeLayout != null) {
                                                                    i10 = R.id.vg_price;
                                                                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_price);
                                                                    if (linearLayout != null) {
                                                                        i10 = R.id.vg_waiting;
                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_waiting);
                                                                        if (relativeLayout2 != null) {
                                                                            return new zy((RelativeLayout) view, cardView, imageView, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, relativeLayout, linearLayout, relativeLayout2);
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
    public static zy c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19966, new Class[]{LayoutInflater.class}, zy.class);
        return patchProxyResultProxy.isSupported ? (zy) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static zy d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19967, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, zy.class);
        if (patchProxyResultProxy.isSupported) {
            return (zy) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_steam_recharge_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f118483a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19969, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
