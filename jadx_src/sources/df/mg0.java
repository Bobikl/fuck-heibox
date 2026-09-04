package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewModeCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mg0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f113445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113450f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113451g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f113452h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113453i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113454j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113455k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113456l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113457m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113458n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113459o;

    private mg0(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3) {
        this.f113445a = cardView;
        this.f113446b = imageView;
        this.f113447c = imageView2;
        this.f113448d = imageView3;
        this.f113449e = imageView4;
        this.f113450f = linearLayout;
        this.f113451g = relativeLayout;
        this.f113452h = recyclerView;
        this.f113453i = textView;
        this.f113454j = textView2;
        this.f113455k = textView3;
        this.f113456l = textView4;
        this.f113457m = textView5;
        this.f113458n = relativeLayout2;
        this.f113459o = relativeLayout3;
    }

    @androidx.annotation.n0
    public static mg0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21770, new Class[]{View.class}, mg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (mg0) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_layout_all_action;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_layout_all_action);
        if (imageView != null) {
            i10 = R.id.iv_mode_card_sign;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_mode_card_sign);
            if (imageView2 != null) {
                i10 = R.id.iv_mode_icon;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_mode_icon);
                if (imageView3 != null) {
                    i10 = R.id.iv_rating_img;
                    ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_rating_img);
                    if (imageView4 != null) {
                        i10 = R.id.ll_mode_card_all_wrapper;
                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_mode_card_all_wrapper);
                        if (linearLayout != null) {
                            i10 = R.id.rl_mode_card_title;
                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.rl_mode_card_title);
                            if (relativeLayout != null) {
                                i10 = R.id.rv_mode_card_list;
                                RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_mode_card_list);
                                if (recyclerView != null) {
                                    i10 = R.id.tv_layout_all_action_text;
                                    TextView textView = (TextView) l3.d.a(view, R.id.tv_layout_all_action_text);
                                    if (textView != null) {
                                        i10 = R.id.tv_mode_card_game_count;
                                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_mode_card_game_count);
                                        if (textView2 != null) {
                                            i10 = R.id.tv_mode_card_no_data;
                                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_mode_card_no_data);
                                            if (textView3 != null) {
                                                i10 = R.id.tv_mode_card_title;
                                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_mode_card_title);
                                                if (textView4 != null) {
                                                    i10 = R.id.tv_rating_desc;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_rating_desc);
                                                    if (textView5 != null) {
                                                        i10 = R.id.vg_mode_card_no_data;
                                                        RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_mode_card_no_data);
                                                        if (relativeLayout2 != null) {
                                                            i10 = R.id.vg_mode_count;
                                                            RelativeLayout relativeLayout3 = (RelativeLayout) l3.d.a(view, R.id.vg_mode_count);
                                                            if (relativeLayout3 != null) {
                                                                return new mg0((CardView) view, imageView, imageView2, imageView3, imageView4, linearLayout, relativeLayout, recyclerView, textView, textView2, textView3, textView4, textView5, relativeLayout2, relativeLayout3);
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
    public static mg0 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 21768, new Class[]{LayoutInflater.class}, mg0.class);
        return patchProxyResultProxy.isSupported ? (mg0) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mg0 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 21769, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mg0.class);
        if (patchProxyResultProxy.isSupported) {
            return (mg0) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.view_mode_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f113445a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 21771, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
