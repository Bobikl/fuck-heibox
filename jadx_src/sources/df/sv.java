package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.CustomHorizontalScrollView;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbview.text.HBTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendBoardMultiBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BannerViewPager f115696b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f115697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115700f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115701g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final SliceGradeView f115702h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBTextView f115703i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115704j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115705k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115706l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115707m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115708n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f115709o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final ConstraintLayout f115710p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115711q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f115712r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115713s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final CustomHorizontalScrollView f115714t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115715u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f115716v;

    private sv(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 BannerViewPager bannerViewPager, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 SliceGradeView sliceGradeView, @androidx.annotation.n0 HBTextView hBTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 ConstraintLayout constraintLayout2, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView2, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 CustomHorizontalScrollView customHorizontalScrollView, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 FrameLayout frameLayout) {
        this.f115695a = constraintLayout;
        this.f115696b = bannerViewPager;
        this.f115697c = barrier;
        this.f115698d = imageView;
        this.f115699e = imageView2;
        this.f115700f = imageView3;
        this.f115701g = imageView4;
        this.f115702h = sliceGradeView;
        this.f115703i = hBTextView;
        this.f115704j = textView;
        this.f115705k = textView2;
        this.f115706l = textView3;
        this.f115707m = textView4;
        this.f115708n = textView5;
        this.f115709o = cardView;
        this.f115710p = constraintLayout2;
        this.f115711q = linearLayout;
        this.f115712r = cardView2;
        this.f115713s = linearLayout2;
        this.f115714t = customHorizontalScrollView;
        this.f115715u = relativeLayout;
        this.f115716v = frameLayout;
    }

    @androidx.annotation.n0
    public static sv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19632, new Class[]{View.class}, sv.class);
        if (patchProxyResultProxy.isSupported) {
            return (sv) patchProxyResultProxy.result;
        }
        int i10 = R.id.banner_viewpager;
        BannerViewPager bannerViewPager = (BannerViewPager) l3.d.a(view, R.id.banner_viewpager);
        if (bannerViewPager != null) {
            i10 = R.id.barrier;
            Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier);
            if (barrier != null) {
                i10 = R.id.iv_avatar;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_avatar);
                if (imageView != null) {
                    i10 = R.id.iv_img;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_img);
                    if (imageView2 != null) {
                        i10 = R.id.iv_mini_img;
                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_mini_img);
                        if (imageView3 != null) {
                            i10 = R.id.iv_score;
                            ImageView imageView4 = (ImageView) l3.d.a(view, R.id.iv_score);
                            if (imageView4 != null) {
                                i10 = R.id.sgv;
                                SliceGradeView sliceGradeView = (SliceGradeView) l3.d.a(view, R.id.sgv);
                                if (sliceGradeView != null) {
                                    i10 = R.id.tv_content;
                                    HBTextView hBTextView = (HBTextView) l3.d.a(view, R.id.tv_content);
                                    if (hBTextView != null) {
                                        i10 = R.id.tv_game_name;
                                        TextView textView = (TextView) l3.d.a(view, R.id.tv_game_name);
                                        if (textView != null) {
                                            i10 = R.id.tv_score;
                                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_score);
                                            if (textView2 != null) {
                                                i10 = R.id.tv_score_detail;
                                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_score_detail);
                                                if (textView3 != null) {
                                                    i10 = R.id.tv_time;
                                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_time);
                                                    if (textView4 != null) {
                                                        i10 = R.id.tv_username;
                                                        TextView textView5 = (TextView) l3.d.a(view, R.id.tv_username);
                                                        if (textView5 != null) {
                                                            i10 = R.id.vg_header;
                                                            CardView cardView = (CardView) l3.d.a(view, R.id.vg_header);
                                                            if (cardView != null) {
                                                                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                                                                i10 = R.id.vg_platforms;
                                                                LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_platforms);
                                                                if (linearLayout != null) {
                                                                    i10 = R.id.vg_score;
                                                                    CardView cardView2 = (CardView) l3.d.a(view, R.id.vg_score);
                                                                    if (cardView2 != null) {
                                                                        i10 = R.id.vg_score_content;
                                                                        LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_score_content);
                                                                        if (linearLayout2 != null) {
                                                                            i10 = R.id.vg_tags;
                                                                            CustomHorizontalScrollView customHorizontalScrollView = (CustomHorizontalScrollView) l3.d.a(view, R.id.vg_tags);
                                                                            if (customHorizontalScrollView != null) {
                                                                                i10 = R.id.vg_video;
                                                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_video);
                                                                                if (relativeLayout != null) {
                                                                                    i10 = R.id.video_view_container;
                                                                                    FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.video_view_container);
                                                                                    if (frameLayout != null) {
                                                                                        return new sv(constraintLayout, bannerViewPager, barrier, imageView, imageView2, imageView3, imageView4, sliceGradeView, hBTextView, textView, textView2, textView3, textView4, textView5, cardView, constraintLayout, linearLayout, cardView2, linearLayout2, customHorizontalScrollView, relativeLayout, frameLayout);
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
    public static sv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19630, new Class[]{LayoutInflater.class}, sv.class);
        return patchProxyResultProxy.isSupported ? (sv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19631, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sv.class);
        if (patchProxyResultProxy.isSupported) {
            return (sv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_board_multi, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115695a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19633, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
