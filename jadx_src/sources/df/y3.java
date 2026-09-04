package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ComponentGameRecommendH126Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y3 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f117734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameRateStarView f117737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f117743j;

    private y3(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 GameRateStarView gameRateStarView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f117734a = cardView;
        this.f117735b = imageView;
        this.f117736c = imageView2;
        this.f117737d = gameRateStarView;
        this.f117738e = textView;
        this.f117739f = textView2;
        this.f117740g = textView3;
        this.f117741h = textView4;
        this.f117742i = textView5;
        this.f117743j = relativeLayout;
    }

    @androidx.annotation.n0
    public static y3 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16752, new Class[]{View.class}, y3.class);
        if (patchProxyResultProxy.isSupported) {
            return (y3) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_bg_img;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg_img);
        if (imageView != null) {
            i10 = R.id.iv_img;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
            if (imageView2 != null) {
                i10 = R.id.ll_rating;
                GameRateStarView gameRateStarView = (GameRateStarView) l3.d.a(view, R.id.ll_rating);
                if (gameRateStarView != null) {
                    i10 = R.id.tv_description;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_description);
                    if (textView != null) {
                        i10 = R.id.tv_game_name;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_game_name);
                        if (textView2 != null) {
                            i10 = R.id.tv_rec_cnt;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_rec_cnt);
                            if (textView3 != null) {
                                i10 = R.id.tv_time;
                                TextView textView4 = (TextView) l3.d.a(view, R.id.tv_time);
                                if (textView4 != null) {
                                    i10 = R.id.tv_username;
                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_username);
                                    if (textView5 != null) {
                                        i10 = R.id.vg_content;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_content);
                                        if (relativeLayout != null) {
                                            return new y3((CardView) view, imageView, imageView2, gameRateStarView, textView, textView2, textView3, textView4, textView5, relativeLayout);
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
    public static y3 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16750, new Class[]{LayoutInflater.class}, y3.class);
        return patchProxyResultProxy.isSupported ? (y3) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y3 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16751, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y3.class);
        if (patchProxyResultProxy.isSupported) {
            return (y3) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.component_game_recommend_h126, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f117734a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16753, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
