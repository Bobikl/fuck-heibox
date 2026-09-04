package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.max.hbcustomview.simplevideo.SimpleVideoPlayerView;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import eightbitlab.com.blurview.BlurView;

/* JADX INFO: compiled from: ActivityAdsBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class e implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final ConstraintLayout f109932a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BlurView f109933b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final Guideline f109934c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109935d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109936e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f109937f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109938g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109939h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f109940i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final SimpleVideoPlayerView f109941j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final CardView f109942k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f109943l;

    private e(@androidx.annotation.n0 ConstraintLayout constraintLayout, @androidx.annotation.n0 BlurView blurView, @androidx.annotation.n0 Guideline guideline, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 ImageView imageView3, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 SimpleVideoPlayerView simpleVideoPlayerView, @androidx.annotation.n0 CardView cardView, @androidx.annotation.n0 RelativeLayout relativeLayout) {
        this.f109932a = constraintLayout;
        this.f109933b = blurView;
        this.f109934c = guideline;
        this.f109935d = imageView;
        this.f109936e = imageView2;
        this.f109937f = imageView3;
        this.f109938g = textView;
        this.f109939h = textView2;
        this.f109940i = textView3;
        this.f109941j = simpleVideoPlayerView;
        this.f109942k = cardView;
        this.f109943l = relativeLayout;
    }

    @androidx.annotation.n0
    public static e a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16256, new Class[]{View.class}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        int i10 = R.id.blurView;
        BlurView blurView = (BlurView) l3.d.a(view, R.id.blurView);
        if (blurView != null) {
            i10 = R.id.guardline_1;
            Guideline guideline = (Guideline) l3.d.a(view, R.id.guardline_1);
            if (guideline != null) {
                i10 = R.id.iv_bg;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_bg);
                if (imageView != null) {
                    i10 = R.id.iv_mask;
                    ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_mask);
                    if (imageView2 != null) {
                        i10 = R.id.iv_stroke;
                        ImageView imageView3 = (ImageView) l3.d.a(view, R.id.iv_stroke);
                        if (imageView3 != null) {
                            i10 = R.id.tv_btn_text;
                            TextView textView = (TextView) l3.d.a(view, R.id.tv_btn_text);
                            if (textView != null) {
                                i10 = R.id.tv_skip_ads;
                                TextView textView2 = (TextView) l3.d.a(view, R.id.tv_skip_ads);
                                if (textView2 != null) {
                                    i10 = R.id.tv_tips;
                                    TextView textView3 = (TextView) l3.d.a(view, R.id.tv_tips);
                                    if (textView3 != null) {
                                        i10 = R.id.v_video;
                                        SimpleVideoPlayerView simpleVideoPlayerView = (SimpleVideoPlayerView) l3.d.a(view, R.id.v_video);
                                        if (simpleVideoPlayerView != null) {
                                            i10 = R.id.vg_btn;
                                            CardView cardView = (CardView) l3.d.a(view, R.id.vg_btn);
                                            if (cardView != null) {
                                                i10 = R.id.vg_video;
                                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_video);
                                                if (relativeLayout != null) {
                                                    return new e((ConstraintLayout) view, blurView, guideline, imageView, imageView2, imageView3, textView, textView2, textView3, simpleVideoPlayerView, cardView, relativeLayout);
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
    public static e c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16254, new Class[]{LayoutInflater.class}, e.class);
        return patchProxyResultProxy.isSupported ? (e) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static e d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16255, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, e.class);
        if (patchProxyResultProxy.isSupported) {
            return (e) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.activity_ads, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public ConstraintLayout b() {
        return this.f109932a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16257, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
