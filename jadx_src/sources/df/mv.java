package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbcustomview.CProgressButton;
import com.max.hbcustomview.video.VideoViewX;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemRecHeaderGameBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class mv implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f113532a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final CProgressButton f113533b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final FlexboxLayout f113534c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f113535d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final LinearLayout f113536e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113537f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113538g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113539h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f113540i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113541j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @androidx.annotation.n0
    public final RelativeLayout f113542k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @androidx.annotation.n0
    public final VideoViewX f113543l;

    private mv(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 CProgressButton cProgressButton, @androidx.annotation.n0 FlexboxLayout flexboxLayout, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 LinearLayout linearLayout, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 TextView textView3, @androidx.annotation.n0 TextView textView4, @androidx.annotation.n0 RelativeLayout relativeLayout2, @androidx.annotation.n0 RelativeLayout relativeLayout3, @androidx.annotation.n0 VideoViewX videoViewX) {
        this.f113532a = relativeLayout;
        this.f113533b = cProgressButton;
        this.f113534c = flexboxLayout;
        this.f113535d = imageView;
        this.f113536e = linearLayout;
        this.f113537f = textView;
        this.f113538g = textView2;
        this.f113539h = textView3;
        this.f113540i = textView4;
        this.f113541j = relativeLayout2;
        this.f113542k = relativeLayout3;
        this.f113543l = videoViewX;
    }

    @androidx.annotation.n0
    public static mv a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 19608, new Class[]{View.class}, mv.class);
        if (patchProxyResultProxy.isSupported) {
            return (mv) patchProxyResultProxy.result;
        }
        int i10 = R.id.cpb_download;
        CProgressButton cProgressButton = (CProgressButton) l3.d.a(view, R.id.cpb_download);
        if (cProgressButton != null) {
            i10 = R.id.fl_tags;
            FlexboxLayout flexboxLayout = (FlexboxLayout) l3.d.a(view, R.id.fl_tags);
            if (flexboxLayout != null) {
                i10 = R.id.iv_icon;
                ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
                if (imageView != null) {
                    i10 = R.id.ll_container;
                    LinearLayout linearLayout = (LinearLayout) l3.d.a(view, R.id.ll_container);
                    if (linearLayout != null) {
                        i10 = R.id.tv_desc;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_desc);
                        if (textView != null) {
                            i10 = R.id.tv_download;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_download);
                            if (textView2 != null) {
                                i10 = R.id.tv_name;
                                TextView textView3 = (TextView) l3.d.a(view, R.id.tv_name);
                                if (textView3 != null) {
                                    i10 = R.id.tv_title;
                                    TextView textView4 = (TextView) l3.d.a(view, R.id.tv_title);
                                    if (textView4 != null) {
                                        i10 = R.id.vg_game_desc;
                                        RelativeLayout relativeLayout = (RelativeLayout) l3.d.a(view, R.id.vg_game_desc);
                                        if (relativeLayout != null) {
                                            i10 = R.id.vg_screenshots;
                                            RelativeLayout relativeLayout2 = (RelativeLayout) l3.d.a(view, R.id.vg_screenshots);
                                            if (relativeLayout2 != null) {
                                                i10 = R.id.video_view;
                                                VideoViewX videoViewX = (VideoViewX) l3.d.a(view, R.id.video_view);
                                                if (videoViewX != null) {
                                                    return new mv((RelativeLayout) view, cProgressButton, flexboxLayout, imageView, linearLayout, textView, textView2, textView3, textView4, relativeLayout, relativeLayout2, videoViewX);
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
    public static mv c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 19606, new Class[]{LayoutInflater.class}, mv.class);
        return patchProxyResultProxy.isSupported ? (mv) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static mv d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 19607, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, mv.class);
        if (patchProxyResultProxy.isSupported) {
            return (mv) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_rec_header_game, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f113532a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 19609, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
