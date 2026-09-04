package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.QRCodeShareView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.expression.widget.ExpressionTextView;
import com.max.xiaoheihe.module.game.component.GameRateStarView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameCommentsShareBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class y50 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f117775a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117776b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117777c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f117778d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameRateStarView f117779e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117780f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f117781g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117782h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117783i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117784j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117785k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final ExpressionTextView f117786l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f117787m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f117788n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final QRCodeShareView f117789o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117790p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f117791q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f117792r;

    private y50(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 GameRateStarView gameRateStarView, @androidx.annotation.n0 View view, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 ExpressionTextView expressionTextView, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 View view2, @androidx.annotation.n0 QRCodeShareView qRCodeShareView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 LinearLayout linearLayout2) {
        this.f117775a = relativeLayout;
        this.f117776b = imageView;
        this.f117777c = imageView2;
        this.f117778d = imageView3;
        this.f117779e = gameRateStarView;
        this.f117780f = view;
        this.f117781g = recyclerView;
        this.f117782h = textView;
        this.f117783i = textView2;
        this.f117784j = textView3;
        this.f117785k = textView4;
        this.f117786l = expressionTextView;
        this.f117787m = textView5;
        this.f117788n = view2;
        this.f117789o = qRCodeShareView;
        this.f117790p = linearLayout;
        this.f117791q = frameLayout;
        this.f117792r = linearLayout2;
    }

    @androidx.annotation.n0
    public static y50 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20688, new Class[]{View.class}, y50.class);
        if (patchProxyResultProxy.isSupported) {
            return (y50) patchProxyResultProxy.result;
        }
        int i10 = R.id.iv_game_logo;
        ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_game_logo);
        if (imageView != null) {
            i10 = R.id.iv_game_score;
            ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_game_score);
            if (imageView2 != null) {
                i10 = R.id.iv_user_avatar;
                ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_user_avatar);
                if (imageView3 != null) {
                    i10 = R.id.ll_user_rating;
                    GameRateStarView gameRateStarView = (GameRateStarView) l3.d.a(view, R.id.ll_user_rating);
                    if (gameRateStarView != null) {
                        i10 = R.id.name_divider;
                        View viewA = l3.d.a(view, R.id.name_divider);
                        if (viewA != null) {
                            i10 = R.id.rv_game_impression;
                            RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_game_impression);
                            if (recyclerView != null) {
                                i10 = R.id.tv_game_name;
                                TextView textView = (TextView) l3.d.a(view, R.id.tv_game_name);
                                if (textView != null) {
                                    i10 = R.id.tv_game_name_en;
                                    TextView textView2 = (TextView) l3.d.a(view, R.id.tv_game_name_en);
                                    if (textView2 != null) {
                                        i10 = R.id.tv_game_score;
                                        TextView textView3 = (TextView) l3.d.a(view, R.id.tv_game_score);
                                        if (textView3 != null) {
                                            i10 = R.id.tv_user_comment_desc;
                                            TextView textView4 = (TextView) l3.d.a(view, R.id.tv_user_comment_desc);
                                            if (textView4 != null) {
                                                i10 = R.id.tv_user_comments;
                                                ExpressionTextView expressionTextView = (ExpressionTextView) l3.d.a(view, R.id.tv_user_comments);
                                                if (expressionTextView != null) {
                                                    i10 = R.id.tv_user_name;
                                                    TextView textView5 = (TextView) l3.d.a(view, R.id.tv_user_name);
                                                    if (textView5 != null) {
                                                        i10 = R.id.v_game_logo_mask;
                                                        View viewA2 = l3.d.a(view, R.id.v_game_logo_mask);
                                                        if (viewA2 != null) {
                                                            i10 = R.id.v_qr_code;
                                                            QRCodeShareView qRCodeShareView = (QRCodeShareView) l3.d.a(view, R.id.v_qr_code);
                                                            if (qRCodeShareView != null) {
                                                                i10 = R.id.vg_game_impression;
                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_game_impression);
                                                                if (linearLayout != null) {
                                                                    i10 = R.id.vg_game_logo;
                                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_game_logo);
                                                                    if (frameLayout != null) {
                                                                        i10 = R.id.vg_game_score;
                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_game_score);
                                                                        if (linearLayout2 != null) {
                                                                            return new y50((RelativeLayout) view, imageView, imageView2, imageView3, gameRateStarView, viewA, recyclerView, textView, textView2, textView3, textView4, expressionTextView, textView5, viewA2, qRCodeShareView, linearLayout, frameLayout, linearLayout2);
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
    public static y50 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20686, new Class[]{LayoutInflater.class}, y50.class);
        return patchProxyResultProxy.isSupported ? (y50) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static y50 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20687, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, y50.class);
        if (patchProxyResultProxy.isSupported) {
            return (y50) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_comments_share, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f117775a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20689, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
