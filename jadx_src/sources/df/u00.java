package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.BoxAutoPlayView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: ItemUserMedalV2Binding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u00 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final RelativeLayout f116107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final BoxAutoPlayView f116108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116110d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBLineHeightTextView f116111e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116112f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final TextView f116113g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116114h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116115i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116116j;

    private u00(@androidx.annotation.n0 RelativeLayout relativeLayout, @androidx.annotation.n0 BoxAutoPlayView boxAutoPlayView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 HBLineHeightTextView hBLineHeightTextView, @androidx.annotation.n0 TextView textView, @androidx.annotation.n0 TextView textView2, @androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 FrameLayout frameLayout2, @androidx.annotation.n0 FrameLayout frameLayout3) {
        this.f116107a = relativeLayout;
        this.f116108b = boxAutoPlayView;
        this.f116109c = imageView;
        this.f116110d = imageView2;
        this.f116111e = hBLineHeightTextView;
        this.f116112f = textView;
        this.f116113g = textView2;
        this.f116114h = frameLayout;
        this.f116115i = frameLayout2;
        this.f116116j = frameLayout3;
    }

    @androidx.annotation.n0
    public static u00 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 20156, new Class[]{View.class}, u00.class);
        if (patchProxyResultProxy.isSupported) {
            return (u00) patchProxyResultProxy.result;
        }
        int i10 = R.id.bv_level;
        BoxAutoPlayView boxAutoPlayView = (BoxAutoPlayView) l3.d.a(view, R.id.bv_level);
        if (boxAutoPlayView != null) {
            i10 = R.id.iv_icon;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_icon);
            if (imageView != null) {
                i10 = R.id.iv_wear_state;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_wear_state);
                if (imageView2 != null) {
                    i10 = R.id.tv_desc;
                    HBLineHeightTextView hBLineHeightTextView = (HBLineHeightTextView) l3.d.a(view, R.id.tv_desc);
                    if (hBLineHeightTextView != null) {
                        i10 = R.id.tv_level;
                        TextView textView = (TextView) l3.d.a(view, R.id.tv_level);
                        if (textView != null) {
                            i10 = R.id.tv_medal_name;
                            TextView textView2 = (TextView) l3.d.a(view, R.id.tv_medal_name);
                            if (textView2 != null) {
                                i10 = R.id.vg_bg;
                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_bg);
                                if (frameLayout != null) {
                                    i10 = R.id.vg_level;
                                    FrameLayout frameLayout2 = (FrameLayout) l3.d.a(view, R.id.vg_level);
                                    if (frameLayout2 != null) {
                                        i10 = R.id.vg_wear_state;
                                        FrameLayout frameLayout3 = (FrameLayout) l3.d.a(view, R.id.vg_wear_state);
                                        if (frameLayout3 != null) {
                                            return new u00((RelativeLayout) view, boxAutoPlayView, imageView, imageView2, hBLineHeightTextView, textView, textView2, frameLayout, frameLayout2, frameLayout3);
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
    public static u00 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 20154, new Class[]{LayoutInflater.class}, u00.class);
        return patchProxyResultProxy.isSupported ? (u00) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u00 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 20155, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u00.class);
        if (patchProxyResultProxy.isSupported) {
            return (u00) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.item_user_medal_v2, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public RelativeLayout b() {
        return this.f116107a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 20157, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
