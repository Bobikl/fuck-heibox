package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.max.hbcommon.component.segmentfilters.SegmentFilterView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.GameDetailScore;
import com.max.xiaoheihe.module.game.component.GameGradeCommentCardView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: LayoutGameRatingCardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class q60 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final CardView f114743a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f114744b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameDetailScore f114745c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114746d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f114747e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final RecyclerView f114748f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final SegmentFilterView f114749g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114750h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114751i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f114752j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final GameGradeCommentCardView f114753k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f114754l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final el f114755m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final mn f114756n;

    private q60(@androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 GameDetailScore gameDetailScore, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 RecyclerView recyclerView, @androidx.annotation.n0 SegmentFilterView segmentFilterView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 GameGradeCommentCardView gameGradeCommentCardView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 el elVar, @androidx.annotation.n0 mn mnVar) {
        this.f114743a = cardView;
        this.f114744b = cardView2;
        this.f114745c = gameDetailScore;
        this.f114746d = imageView;
        this.f114747e = imageView2;
        this.f114748f = recyclerView;
        this.f114749g = segmentFilterView;
        this.f114750h = textView;
        this.f114751i = textView2;
        this.f114752j = textView3;
        this.f114753k = gameGradeCommentCardView;
        this.f114754l = relativeLayout;
        this.f114755m = elVar;
        this.f114756n = mnVar;
    }

    @androidx.annotation.n0
    public static q60 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20760, new Class[]{View.class}, q60.class);
        if (patchProxyResultProxy.isSupported) {
            return (q60) patchProxyResultProxy.result;
        }
        CardView cardView = (CardView) view;
        int i10 = R.id.game_detail_score;
        GameDetailScore gameDetailScore = (GameDetailScore) l3.d.a(view, R.id.game_detail_score);
        if (gameDetailScore != null) {
            i10 = R.id.iv_multi_dimension_point;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_multi_dimension_point);
            if (imageView != null) {
                i10 = R.id.iv_title_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_title_icon);
                if (imageView2 != null) {
                    i10 = R.id.rv_game_impression;
                    RecyclerView recyclerView = (RecyclerView) l3.d.a(view, R.id.rv_game_impression);
                    if (recyclerView != null) {
                        i10 = R.id.sfv;
                        SegmentFilterView segmentFilterView = (SegmentFilterView) l3.d.a(view, R.id.sfv);
                        if (segmentFilterView != null) {
                            i10 = R.id.tv_no_impression;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_no_impression);
                            if (textView != null) {
                                i10 = R.id.tv_subtitle;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_subtitle);
                                if (textView2 != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_title);
                                    if (textView3 != null) {
                                        i10 = R.id.vg_add_grade;
                                        GameGradeCommentCardView gameGradeCommentCardView = (GameGradeCommentCardView) l3.d.a(view, R.id.vg_add_grade);
                                        if (gameGradeCommentCardView != null) {
                                            i10 = R.id.vg_game_impression;
                                            RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_game_impression);
                                            if (relativeLayout != null) {
                                                i10 = R.id.vg_radar;
                                                View viewA = l3.d.a(view, R.id.vg_radar);
                                                if (viewA != null) {
                                                    el elVarA = el.a(viewA);
                                                    i10 = R.id.vg_trend;
                                                    View viewA2 = l3.d.a(view, R.id.vg_trend);
                                                    if (viewA2 != null) {
                                                        return new q60(cardView, cardView, gameDetailScore, imageView, imageView2, recyclerView, segmentFilterView, textView, textView2, textView3, gameGradeCommentCardView, relativeLayout, elVarA, mn.a(viewA2));
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
    public static q60 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20758, new Class[]{LayoutInflater.class}, q60.class);
        return patchProxyResultProxy.isSupported ? (q60) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static q60 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20759, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, q60.class);
        if (patchProxyResultProxy.isSupported) {
            return (q60) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.layout_game_rating_card, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public CardView b() {
        return this.f114743a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20761, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
