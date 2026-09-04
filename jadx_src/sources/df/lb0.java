package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutSwitchGameDataCardV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class lb0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f112976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f112978c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112979d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112980e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112981f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112982g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112983h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112984i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112985j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112986k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112987l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112988m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112989n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112990o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112991p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112992q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f112993r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112994s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112995t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112996u;

    private lb0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 TextView textView11, @androidx.annotation.n0 View view, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2) {
        this.f112976a = cardView;
        this.f112977b = imageView;
        this.f112978c = qMUIRadiusImageView;
        this.f112979d = imageView2;
        this.f112980e = imageView3;
        this.f112981f = linearLayout;
        this.f112982g = textView;
        this.f112983h = textView2;
        this.f112984i = textView3;
        this.f112985j = textView4;
        this.f112986k = textView5;
        this.f112987l = textView6;
        this.f112988m = textView7;
        this.f112989n = textView8;
        this.f112990o = textView9;
        this.f112991p = textView10;
        this.f112992q = textView11;
        this.f112993r = view;
        this.f112994s = linearLayout2;
        this.f112995t = relativeLayout;
        this.f112996u = relativeLayout2;
    }

    @androidx.annotation.n0
    public static lb0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21253, new Class[]{View.class}, lb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (lb0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_arrow;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_arrow);
        if (imageView != null) {
            i10 = R.id.iv_avatar;
            QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_avatar);
            if (qMUIRadiusImageView != null) {
                i10 = R.id.iv_bg;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_bg);
                if (imageView2 != null) {
                    i10 = R.id.iv_mask;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_mask);
                    if (imageView3 != null) {
                        i10 = R.id.ll_friends;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_friends);
                        if (linearLayout != null) {
                            i10 = R.id.tv_copy_friend_code;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_copy_friend_code);
                            if (textView != null) {
                                i10 = R.id.tv_friend_code;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_friend_code);
                                if (textView2 != null) {
                                    i10 = R.id.tv_key_0;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_key_0);
                                    if (textView3 != null) {
                                        i10 = R.id.tv_key_1;
                                        TextView textView4 = (TextView) l3.d.a(view, R.id.tv_key_1);
                                        if (textView4 != null) {
                                            i10 = R.id.tv_key_2;
                                            TextView textView5 = (TextView) l3.d.a(view, R.id.tv_key_2);
                                            if (textView5 != null) {
                                                i10 = R.id.tv_nickname;
                                                TextView textView6 = (TextView) l3.d.a(view, R.id.tv_nickname);
                                                if (textView6 != null) {
                                                    i10 = R.id.tv_no_friends;
                                                    TextView textView7 = (TextView) l3.d.a(view, R.id.tv_no_friends);
                                                    if (textView7 != null) {
                                                        i10 = R.id.tv_server;
                                                        TextView textView8 = (TextView) l3.d.a(view, R.id.tv_server);
                                                        if (textView8 != null) {
                                                            i10 = R.id.tv_value_0;
                                                            TextView textView9 = (TextView) l3.d.a(view, R.id.tv_value_0);
                                                            if (textView9 != null) {
                                                                i10 = R.id.tv_value_1;
                                                                TextView textView10 = (TextView) l3.d.a(view, R.id.tv_value_1);
                                                                if (textView10 != null) {
                                                                    i10 = R.id.tv_value_2;
                                                                    TextView textView11 = (TextView) l3.d.a(view, R.id.tv_value_2);
                                                                    if (textView11 != null) {
                                                                        i10 = R.id.v_placeholder;
                                                                        View viewA = l3.d.a(view, R.id.v_placeholder);
                                                                        if (viewA != null) {
                                                                            i10 = R.id.vg_data;
                                                                            LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_data);
                                                                            if (linearLayout2 != null) {
                                                                                i10 = R.id.vg_friends;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_friends);
                                                                                if (relativeLayout != null) {
                                                                                    i10 = R.id.vg_nick_name;
                                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_nick_name);
                                                                                    if (relativeLayout2 != null) {
                                                                                        return new lb0((CardView) view, imageView, qMUIRadiusImageView, imageView2, imageView3, linearLayout, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, viewA, linearLayout2, relativeLayout, relativeLayout2);
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
    public static lb0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21251, new Class[]{LayoutInflater.class}, lb0.class);
        return patchProxyResultProxy.isSupported ? (lb0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static lb0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21252, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, lb0.class);
        if (patchProxyResultProxy.isSupported) {
            return (lb0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_switch_game_data_card_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f112976a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21254, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
