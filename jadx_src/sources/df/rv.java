package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.max.hbcustomview.CustomHorizontalScrollView;
import com.max.hbcustomview.RadiusCardViewV2;
import com.max.hbcustomview.bannerview.BannerViewPager;
import com.max.hbcustomview.video.VideoViewX;
import com.max.hbview.text.HBTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.slicegradeview.SliceGradeView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecommendBoardBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class rv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f115311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BannerViewPager f115312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f115313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final Barrier f115314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final View f115315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadiusCardViewV2 f115320j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final SliceGradeView f115321k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBTextView f115322l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115323m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115324n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115325o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115326p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115327q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115328r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f115329s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f115330t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @androidx.annotation.n0
    public final CustomHorizontalScrollView f115331u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadiusCardViewV2 f115332v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @androidx.annotation.n0
    public final VideoViewX f115333w;

    private rv(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 BannerViewPager bannerViewPager, @androidx.annotation.n0 Barrier barrier, @androidx.annotation.n0 Barrier barrier2, @androidx.annotation.n0 View view, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 ImageView imageView4, @androidx.annotation.n0 RadiusCardViewV2 radiusCardViewV2, @androidx.annotation.n0 SliceGradeView sliceGradeView, @androidx.annotation.n0 HBTextView hBTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 TextView textView5, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 LinearLayout linearLayout2, @androidx.annotation.n0 CustomHorizontalScrollView customHorizontalScrollView, @androidx.annotation.n0 RadiusCardViewV2 radiusCardViewV3, @androidx.annotation.n0 VideoViewX videoViewX) {
        this.f115311a = constraintLayout;
        this.f115312b = bannerViewPager;
        this.f115313c = barrier;
        this.f115314d = barrier2;
        this.f115315e = view;
        this.f115316f = imageView;
        this.f115317g = imageView2;
        this.f115318h = imageView3;
        this.f115319i = imageView4;
        this.f115320j = radiusCardViewV2;
        this.f115321k = sliceGradeView;
        this.f115322l = hBTextView;
        this.f115323m = textView;
        this.f115324n = textView2;
        this.f115325o = textView3;
        this.f115326p = textView4;
        this.f115327q = textView5;
        this.f115328r = linearLayout;
        this.f115329s = cardView;
        this.f115330t = linearLayout2;
        this.f115331u = customHorizontalScrollView;
        this.f115332v = radiusCardViewV3;
        this.f115333w = videoViewX;
    }

    @androidx.annotation.n0
    public static rv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19628, new Class[]{View.class}, rv.class);
        if (patchProxyResultProxy.isSupported) {
            return (rv) patchProxyResultProxy.result;
        }
        int i10 = R.id.banner_viewpager;
        BannerViewPager bannerViewPager = (BannerViewPager) l3.d.a(view, R.id.banner_viewpager);
        if (bannerViewPager != null) {
            i10 = R.id.barrier;
            Barrier barrier = (Barrier) l3.d.a(view, R.id.barrier);
            if (barrier != null) {
                i10 = R.id.barrier_bottom;
                Barrier barrier2 = (Barrier) l3.d.a(view, R.id.barrier_bottom);
                if (barrier2 != null) {
                    i10 = R.id.divider;
                    View viewA = l3.d.a(view, R.id.divider);
                    if (viewA != null) {
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
                                        i10 = R.id.rcv_img_container;
                                        RadiusCardViewV2 radiusCardViewV2 = (RadiusCardViewV2) l3.d.a(view, R.id.rcv_img_container);
                                        if (radiusCardViewV2 != null) {
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
                                                                        i10 = R.id.vg_platforms;
                                                                        LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.vg_platforms);
                                                                        if (linearLayout != null) {
                                                                            i10 = R.id.vg_score;
                                                                            CardView cardView = (CardView) l3.d.a(view, R.id.vg_score);
                                                                            if (cardView != null) {
                                                                                i10 = R.id.vg_score_content;
                                                                                LinearLayout linearLayout2 = (LinearLayout) l3.d.a(view, R.id.vg_score_content);
                                                                                if (linearLayout2 != null) {
                                                                                    i10 = R.id.vg_tags;
                                                                                    CustomHorizontalScrollView customHorizontalScrollView = (CustomHorizontalScrollView) l3.d.a(view, R.id.vg_tags);
                                                                                    if (customHorizontalScrollView != null) {
                                                                                        i10 = R.id.vg_video;
                                                                                        RadiusCardViewV2 radiusCardViewV3 = (RadiusCardViewV2) l3.d.a(view, R.id.vg_video);
                                                                                        if (radiusCardViewV3 != null) {
                                                                                            i10 = R.id.video_view;
                                                                                            VideoViewX videoViewX = (VideoViewX) l3.d.a(view, R.id.video_view);
                                                                                            if (videoViewX != null) {
                                                                                                return new rv((ConstraintLayout) view, bannerViewPager, barrier, barrier2, viewA, imageView, imageView2, imageView3, imageView4, radiusCardViewV2, sliceGradeView, hBTextView, textView, textView2, textView3, textView4, textView5, linearLayout, cardView, linearLayout2, customHorizontalScrollView, radiusCardViewV3, videoViewX);
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
    public static rv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19626, new Class[]{LayoutInflater.class}, rv.class);
        return patchProxyResultProxy.isSupported ? (rv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static rv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19627, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, rv.class);
        if (patchProxyResultProxy.isSupported) {
            return (rv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_recommend_board, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f115311a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19629, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
