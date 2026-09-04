package df;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcustomview.RadiusCardView;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.view.uikit.HBUiKitView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: DialogCustomBottomBinding.java */
/* JADX INFO: loaded from: classes3.dex */
public final class u4 implements l3.c {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.n0
    private final FrameLayout f116174a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @androidx.annotation.n0
    public final RadiusCardView f116175b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116176c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @androidx.annotation.n0
    public final ImageView f116177d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @androidx.annotation.n0
    public final BottomButtonLeftItemView f116178e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @androidx.annotation.n0
    public final HBUiKitView f116179f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @androidx.annotation.n0
    public final NestedScrollView f116180g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @androidx.annotation.n0
    public final FrameLayout f116181h;

    private u4(@androidx.annotation.n0 FrameLayout frameLayout, @androidx.annotation.n0 RadiusCardView radiusCardView, @androidx.annotation.n0 ImageView imageView, @androidx.annotation.n0 ImageView imageView2, @androidx.annotation.n0 BottomButtonLeftItemView bottomButtonLeftItemView, @androidx.annotation.n0 HBUiKitView hBUiKitView, @androidx.annotation.n0 NestedScrollView nestedScrollView, @androidx.annotation.n0 FrameLayout frameLayout2) {
        this.f116174a = frameLayout;
        this.f116175b = radiusCardView;
        this.f116176c = imageView;
        this.f116177d = imageView2;
        this.f116178e = bottomButtonLeftItemView;
        this.f116179f = hBUiKitView;
        this.f116180g = nestedScrollView;
        this.f116181h = frameLayout2;
    }

    @androidx.annotation.n0
    public static u4 a(@androidx.annotation.n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 16840, new Class[]{View.class}, u4.class);
        if (patchProxyResultProxy.isSupported) {
            return (u4) patchProxyResultProxy.result;
        }
        int i10 = R.id.card_content;
        RadiusCardView radiusCardView = (RadiusCardView) l3.d.a(view, R.id.card_content);
        if (radiusCardView != null) {
            i10 = R.id.iv_close;
            ImageView imageView = (ImageView) l3.d.a(view, R.id.iv_close);
            if (imageView != null) {
                i10 = R.id.iv_top_icon;
                ImageView imageView2 = (ImageView) l3.d.a(view, R.id.iv_top_icon);
                if (imageView2 != null) {
                    i10 = R.id.v_bottom_button;
                    BottomButtonLeftItemView bottomButtonLeftItemView = (BottomButtonLeftItemView) l3.d.a(view, R.id.v_bottom_button);
                    if (bottomButtonLeftItemView != null) {
                        i10 = R.id.v_hb_ui;
                        HBUiKitView hBUiKitView = (HBUiKitView) l3.d.a(view, R.id.v_hb_ui);
                        if (hBUiKitView != null) {
                            i10 = R.id.vg_scroll_kit;
                            NestedScrollView nestedScrollView = (NestedScrollView) l3.d.a(view, R.id.vg_scroll_kit);
                            if (nestedScrollView != null) {
                                i10 = R.id.vg_top_icon;
                                FrameLayout frameLayout = (FrameLayout) l3.d.a(view, R.id.vg_top_icon);
                                if (frameLayout != null) {
                                    return new u4((FrameLayout) view, radiusCardView, imageView, imageView2, bottomButtonLeftItemView, hBUiKitView, nestedScrollView, frameLayout);
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
    public static u4 c(@androidx.annotation.n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 16838, new Class[]{LayoutInflater.class}, u4.class);
        return patchProxyResultProxy.isSupported ? (u4) patchProxyResultProxy.result : d(layoutInflater, null, false);
    }

    @androidx.annotation.n0
    public static u4 d(@androidx.annotation.n0 LayoutInflater layoutInflater, @androidx.annotation.p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 16839, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, u4.class);
        if (patchProxyResultProxy.isSupported) {
            return (u4) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.dialog_custom_bottom, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return a(viewInflate);
    }

    @androidx.annotation.n0
    public FrameLayout b() {
        return this.f116174a;
    }

    @Override // l3.c
    @androidx.annotation.n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16841, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : b();
    }
}
