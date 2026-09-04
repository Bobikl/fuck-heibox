package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameFollowWithNumView;
import com.max.xiaoheihe.module.game.component.GamePriceView;
import com.max.xiaoheihe.module.game.component.GameScoreWithNumView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ViewSearchInnerGameItemBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class uh0 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final View f116442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameScoreWithNumView f116443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final GamePriceView f116444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f116446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameFollowWithNumView f116449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f116450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116451j;

    private uh0(@androidx.annotation.n0 View view, @androidx.annotation.n0 GameScoreWithNumView gameScoreWithNumView, @androidx.annotation.n0 GamePriceView gamePriceView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 GameFollowWithNumView gameFollowWithNumView, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f116442a = view;
        this.f116443b = gameScoreWithNumView;
        this.f116444c = gamePriceView;
        this.f116445d = imageView;
        this.f116446e = qMUIRadiusImageView;
        this.f116447f = textView;
        this.f116448g = textView2;
        this.f116449h = gameFollowWithNumView;
        this.f116450i = cardView;
        this.f116451j = frameLayout;
    }

    @androidx.annotation.n0
    public static uh0 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 21905, new Class[]{View.class}, uh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (uh0) patchProxyResultProxy.result;
        }
        int i10 = R.id.game_detail_score;
        GameScoreWithNumView gameScoreWithNumView = (GameScoreWithNumView) l3.d.a(view, R.id.game_detail_score);
        if (gameScoreWithNumView != null) {
            i10 = R.id.gpv;
            GamePriceView gamePriceView = (GamePriceView) l3.d.a(view, R.id.gpv);
            if (gamePriceView != null) {
                i10 = R.id.iv_game_icon;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_icon);
                if (imageView != null) {
                    i10 = R.id.iv_platform_icon;
                    QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.iv_platform_icon);
                    if (qMUIRadiusImageView != null) {
                        i10 = R.id.tv_coupon_desc;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_coupon_desc);
                        if (textView != null) {
                            i10 = R.id.tv_game_name;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_game_name);
                            if (textView2 != null) {
                                i10 = R.id.v_game_follow;
                                GameFollowWithNumView gameFollowWithNumView = (GameFollowWithNumView) l3.d.a(view, R.id.v_game_follow);
                                if (gameFollowWithNumView != null) {
                                    i10 = R.id.vg_game_icon;
                                    CardView cardView = (CardView) l3.d.a(view, R.id.vg_game_icon);
                                    if (cardView != null) {
                                        i10 = R.id.vg_right;
                                        FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_right);
                                        if (frameLayout != null) {
                                            return new uh0(view, gameScoreWithNumView, gamePriceView, imageView, qMUIRadiusImageView, textView, textView2, gameFollowWithNumView, cardView, frameLayout);
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
    public static uh0 b(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.n0 ViewGroup viewGroup) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup}, null, changeQuickRedirect, true, 21904, new Class[]{LayoutInflater.class, ViewGroup.class}, uh0.class);
        if (patchProxyResultProxy.isSupported) {
            return (uh0) patchProxyResultProxy.result;
        }
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R.layout.view_search_inner_game_item, viewGroup);
        return a(viewGroup);
    }

    @Override // l3.c
    @androidx.annotation.n0
    public View getRoot() {
        return this.f116442a;
    }
}
