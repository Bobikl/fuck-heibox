package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemGameWindowBgBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class nn implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final LinearLayout f113913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f113914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f113915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113918f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113919g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113920h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113921i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113922j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113923k;

    private nn(@androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 LinearLayout linearLayout3, @androidx.annotation.n0 LinearLayout linearLayout4) {
        this.f113913a = linearLayout;
        this.f113914b = cardView;
        this.f113915c = view;
        this.f113916d = imageView;
        this.f113917e = linearLayout2;
        this.f113918f = textView;
        this.f113919g = textView2;
        this.f113920h = textView3;
        this.f113921i = textView4;
        this.f113922j = linearLayout3;
        this.f113923k = linearLayout4;
    }

    @androidx.annotation.n0
    public static nn a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 18784, new Class[]{View.class}, nn.class);
        if (patchProxyResultProxy.isSupported) {
            return (nn) patchProxyResultProxy.result;
        }
        int i10 = R.id.cv_game_img;
        CardView cardView = (CardView) l3.d.a(view, R.id.cv_game_img);
        if (cardView != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                i10 = R.id.iv_img;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_img);
                if (imageView != null) {
                    i10 = R.id.ll_genres;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_genres);
                    if (linearLayout != null) {
                        i10 = R.id.tv_deadline_date;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_deadline_date);
                        if (textView != null) {
                            i10 = R.id.tv_follow_state;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_follow_state);
                            if (textView2 != null) {
                                i10 = R.id.tv_peak_user_num;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_peak_user_num);
                                if (textView3 != null) {
                                    i10 = R.id.tv_release_date;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_release_date);
                                    if (textView4 != null) {
                                        i10 = R.id.vg_is_owned;
                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_is_owned);
                                        if (linearLayout2 != null) {
                                            i10 = R.id.vg_name;
                                            LinearLayout linearLayout3 = (LinearLayout) l3.d.a(view, R.id.vg_name);
                                            if (linearLayout3 != null) {
                                                return new nn((LinearLayout) view, cardView, viewA, imageView, linearLayout, textView, textView2, textView3, textView4, linearLayout2, linearLayout3);
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
    public static nn c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 18782, new Class[]{LayoutInflater.class}, nn.class);
        return patchProxyResultProxy.isSupported ? (nn) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static nn d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 18783, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, nn.class);
        if (patchProxyResultProxy.isSupported) {
            return (nn) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_game_window_bg, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public LinearLayout b() {
        return this.f113913a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 18785, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
