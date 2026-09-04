package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutBindCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class l20 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f112815a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final EditText f112816b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112817c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112818d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112819e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112820f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f112821g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ProgressBar f112822h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112823i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112824j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112825k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112826l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112827m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112828n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112829o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112830p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112831q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f112832r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112833s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112834t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112835u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f112836v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f112837w;

    private l20(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 EditText editText, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 ImageView imageView5, @androidx.annotation.n0 ProgressBar progressBar, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 TextView textView6, @androidx.annotation.n0 TextView textView7, @androidx.annotation.n0 TextView textView8, @androidx.annotation.n0 TextView textView9, @androidx.annotation.n0 TextView textView10, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 LinearLayout linearLayout3) {
        this.f112815a = cardView;
        this.f112816b = editText;
        this.f112817c = imageView;
        this.f112818d = imageView2;
        this.f112819e = imageView3;
        this.f112820f = imageView4;
        this.f112821g = imageView5;
        this.f112822h = progressBar;
        this.f112823i = textView;
        this.f112824j = textView2;
        this.f112825k = textView3;
        this.f112826l = textView4;
        this.f112827m = textView5;
        this.f112828n = textView6;
        this.f112829o = textView7;
        this.f112830p = textView8;
        this.f112831q = textView9;
        this.f112832r = textView10;
        this.f112833s = linearLayout;
        this.f112834t = relativeLayout;
        this.f112835u = linearLayout2;
        this.f112836v = relativeLayout2;
        this.f112837w = linearLayout3;
    }

    @androidx.annotation.n0
    public static l20 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20326, new Class[]{View.class}, l20.class);
        if (patchProxyResultProxy.isSupported) {
            return (l20) patchProxyResultProxy.result;
        }
        int i10 = R.id.et_name;
        EditText editText = (EditText) l3.d.a(view, R.id.et_name);
        if (editText != null) {
            i10 = R.id.iv_bg_img;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg_img);
            if (imageView != null) {
                i10 = R.id.iv_expand;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_expand);
                if (imageView2 != null) {
                    i10 = R.id.iv_game_logo;
                    ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_game_logo);
                    if (imageView3 != null) {
                        i10 = R.id.iv_server;
                        ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_server);
                        if (imageView4 != null) {
                            i10 = R.id.iv_slogan_img;
                            ImageView imageView5 = (ImageView) l3.d.a(view, R.id.iv_slogan_img);
                            if (imageView5 != null) {
                                i10 = R.id.pb_loading;
                                ProgressBar progressBar = (ProgressBar) l3.d.a(view, R.id.pb_loading);
                                if (progressBar != null) {
                                    i10 = R.id.tv_bind;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_bind);
                                    if (textView != null) {
                                        i10 = R.id.tv_bind_tips;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_bind_tips);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_code;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_code);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_collapse;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_collapse);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_dont_display;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_dont_display);
                                                    if (textView5 != null) {
                                                        i10 = R.id.tv_dont_display_tiny;
                                                        TextView textView6 = (TextView) l3.d.a(view, R.id.tv_dont_display_tiny);
                                                        if (textView6 != null) {
                                                            i10 = R.id.tv_game_name;
                                                            TextView textView7 = (TextView) l3.d.a(view, R.id.tv_game_name);
                                                            if (textView7 != null) {
                                                                i10 = R.id.tv_help;
                                                                TextView textView8 = (TextView) l3.d.a(view, R.id.tv_help);
                                                                if (textView8 != null) {
                                                                    i10 = R.id.tv_server;
                                                                    TextView textView9 = (TextView) l3.d.a(view, R.id.tv_server);
                                                                    if (textView9 != null) {
                                                                        i10 = R.id.tv_to_expand;
                                                                        TextView textView10 = (TextView) l3.d.a(view, R.id.tv_to_expand);
                                                                        if (textView10 != null) {
                                                                            i10 = R.id.vg_bind;
                                                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_bind);
                                                                            if (linearLayout != null) {
                                                                                i10 = R.id.vg_collapsed_card;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_collapsed_card);
                                                                                if (relativeLayout != null) {
                                                                                    i10 = R.id.vg_edit;
                                                                                    LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_edit);
                                                                                    if (linearLayout2 != null) {
                                                                                        i10 = R.id.vg_expanded_card;
                                                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_expanded_card);
                                                                                        if (relativeLayout2 != null) {
                                                                                            i10 = R.id.vg_servers;
                                                                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_servers);
                                                                                            if (linearLayout3 != null) {
                                                                                                return new l20((CardView) view, editText, imageView, imageView2, imageView3, imageView4, imageView5, progressBar, textView, textView2, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, linearLayout, relativeLayout, linearLayout2, relativeLayout2, linearLayout3);
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
    public static l20 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20324, new Class[]{LayoutInflater.class}, l20.class);
        return patchProxyResultProxy.isSupported ? (l20) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static l20 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20325, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, l20.class);
        if (patchProxyResultProxy.isSupported) {
            return (l20) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_bind_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f112815a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20327, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
