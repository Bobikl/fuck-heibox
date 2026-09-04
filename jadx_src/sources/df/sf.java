package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.CProgressButton;
import com.max.hbcustomview.video.VideoViewX;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemConceptFeedsMobileVideoBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class sf implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f115612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CProgressButton f115613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final id0 f115614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f115615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f115618g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115619h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f115620i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final VideoViewX f115621j;

    private sf(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 CProgressButton cProgressButton, @androidx.annotation.n0 id0 id0Var, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 VideoViewX videoViewX) {
        this.f115612a = frameLayout;
        this.f115613b = cProgressButton;
        this.f115614c = id0Var;
        this.f115615d = imageView;
        this.f115616e = textView;
        this.f115617f = textView2;
        this.f115618g = textView3;
        this.f115619h = relativeLayout;
        this.f115620i = relativeLayout2;
        this.f115621j = videoViewX;
    }

    @androidx.annotation.n0
    public static sf a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 17976, new Class[]{View.class}, sf.class);
        if (patchProxyResultProxy.isSupported) {
            return (sf) patchProxyResultProxy.result;
        }
        int i10 = R.id.cpb_download;
        CProgressButton cProgressButton = (CProgressButton) l3.d.a(view, R.id.cpb_download);
        if (cProgressButton != null) {
            i10 = R.id.divider;
            View viewA = l3.d.a(view, R.id.divider);
            if (viewA != null) {
                id0 id0VarA = id0.a(viewA);
                i10 = R.id.iv_video_scrim;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_video_scrim);
                if (imageView != null) {
                    i10 = R.id.tv_desc;
                    TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                    if (textView != null) {
                        i10 = R.id.tv_download;
                        TextView textView2 = (TextView) l3.d.a(view, R.id.tv_download);
                        if (textView2 != null) {
                            i10 = R.id.tv_name;
                            TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                            if (textView3 != null) {
                                i10 = R.id.vg_game_desc;
                                RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_game_desc);
                                if (relativeLayout != null) {
                                    i10 = R.id.vg_screenshots;
                                    RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_screenshots);
                                    if (relativeLayout2 != null) {
                                        i10 = R.id.video_view;
                                        VideoViewX videoViewX = (VideoViewX) l3.d.a(view, R.id.video_view);
                                        if (videoViewX != null) {
                                            return new sf((FrameLayout) view, cProgressButton, id0VarA, imageView, textView, textView2, textView3, relativeLayout, relativeLayout2, videoViewX);
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
    public static sf c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 17974, new Class[]{LayoutInflater.class}, sf.class);
        return patchProxyResultProxy.isSupported ? (sf) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static sf d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 17975, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, sf.class);
        if (patchProxyResultProxy.isSupported) {
            return (sf) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_concept_feeds_mobile_video, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f115612a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 17977, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
