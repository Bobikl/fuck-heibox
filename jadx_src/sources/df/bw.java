package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hblayout.hbgame.GameSingleCardFrameLayout;
import com.max.hbview.CountDownTextView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendNewcomerCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class bw implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f109049a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CountDownTextView f109050b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameSingleCardFrameLayout f109051c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109052d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f109053e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109054f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109055g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109056h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f109057i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109058j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f109059k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final QMUIRadiusImageView f109060l;

    private bw(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 CountDownTextView countDownTextView, @androidx.annotation.n0 GameSingleCardFrameLayout gameSingleCardFrameLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 QMUIRadiusImageView qMUIRadiusImageView2) {
        this.f109049a = frameLayout;
        this.f109050b = countDownTextView;
        this.f109051c = gameSingleCardFrameLayout;
        this.f109052d = imageView;
        this.f109053e = recyclerView;
        this.f109054f = textView;
        this.f109055g = textView2;
        this.f109056h = textView3;
        this.f109057i = qMUIRadiusImageView;
        this.f109058j = imageView2;
        this.f109059k = linearLayout;
        this.f109060l = qMUIRadiusImageView2;
    }

    @androidx.annotation.n0
    public static bw a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19668, new Class[]{View.class}, bw.class);
        if (patchProxyResultProxy.isSupported) {
            return (bw) patchProxyResultProxy.result;
        }
        int i10 = R.id.cdtv_left;
        CountDownTextView countDownTextView = (CountDownTextView) l3.d.a(view, R.id.cdtv_left);
        if (countDownTextView != null) {
            i10 = R.id.fl_single_game_container;
            GameSingleCardFrameLayout gameSingleCardFrameLayout = (GameSingleCardFrameLayout) l3.d.a(view, R.id.fl_single_game_container);
            if (gameSingleCardFrameLayout != null) {
                i10 = R.id.iv_card_title;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_card_title);
                if (imageView != null) {
                    i10 = R.id.rv_games;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_games);
                    if (recyclerView != null) {
                        i10 = R.id.tv_card_title;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_card_title);
                        if (textView != null) {
                            i10 = R.id.tv_day;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_day);
                            if (textView2 != null) {
                                i10 = R.id.tv_day_unit;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_day_unit);
                                if (textView3 != null) {
                                    i10 = R.id.vg_bg;
                                    QMUIRadiusImageView qMUIRadiusImageView = (QMUIRadiusImageView) l3.d.a(view, R.id.vg_bg);
                                    if (qMUIRadiusImageView != null) {
                                        i10 = R.id.vg_stroke;
                                        ImageView imageView2 = (ImageView) l3.d.a(view, R.id.vg_stroke);
                                        if (imageView2 != null) {
                                            i10 = R.id.vg_time_left;
                                            LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_time_left);
                                            if (linearLayout != null) {
                                                i10 = R.id.vg_white_bg;
                                                QMUIRadiusImageView qMUIRadiusImageView2 = (QMUIRadiusImageView) l3.d.a(view, R.id.vg_white_bg);
                                                if (qMUIRadiusImageView2 != null) {
                                                    return new bw((FrameLayout) view, countDownTextView, gameSingleCardFrameLayout, imageView, recyclerView, textView, textView2, textView3, qMUIRadiusImageView, imageView2, linearLayout, qMUIRadiusImageView2);
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
    public static bw c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19666, new Class[]{LayoutInflater.class}, bw.class);
        return patchProxyResultProxy.isSupported ? (bw) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static bw d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19667, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, bw.class);
        if (patchProxyResultProxy.isSupported) {
            return (bw) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_newcomer_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f109049a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19669, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
