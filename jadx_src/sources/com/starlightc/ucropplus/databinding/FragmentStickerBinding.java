package com.starlightc.ucropplus.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.viewpager2.widget.ViewPager2;
import com.max.hbcommon.component.HBSecondaryMenuWindowTabLayout;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.R;
import l3.c;
import l3.d;

/* JADX INFO: loaded from: classes4.dex */
public final class FragmentStickerBinding implements c {
    public static ChangeQuickRedirect changeQuickRedirect;

    @n0
    private final LinearLayout rootView;

    @n0
    public final HBSecondaryMenuWindowTabLayout tlStickerGroup;

    @n0
    public final ViewPager2 vpSticker;

    private FragmentStickerBinding(@n0 LinearLayout linearLayout, @n0 HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout, @n0 ViewPager2 viewPager2) {
        this.rootView = linearLayout;
        this.tlStickerGroup = hBSecondaryMenuWindowTabLayout;
        this.vpSticker = viewPager2;
    }

    @n0
    public static FragmentStickerBinding bind(@n0 View view) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 49929, new Class[]{View.class}, FragmentStickerBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentStickerBinding) patchProxyResultProxy.result;
        }
        int i10 = R.id.tl_sticker_group;
        HBSecondaryMenuWindowTabLayout hBSecondaryMenuWindowTabLayout = (HBSecondaryMenuWindowTabLayout) d.a(view, i10);
        if (hBSecondaryMenuWindowTabLayout != null) {
            i10 = R.id.vp_sticker;
            ViewPager2 viewPager2 = (ViewPager2) d.a(view, i10);
            if (viewPager2 != null) {
                return new FragmentStickerBinding((LinearLayout) view, hBSecondaryMenuWindowTabLayout, viewPager2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i10)));
    }

    @n0
    public static FragmentStickerBinding inflate(@n0 LayoutInflater layoutInflater) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater}, null, changeQuickRedirect, true, 49927, new Class[]{LayoutInflater.class}, FragmentStickerBinding.class);
        return patchProxyResultProxy.isSupported ? (FragmentStickerBinding) patchProxyResultProxy.result : inflate(layoutInflater, null, false);
    }

    @n0
    public static FragmentStickerBinding inflate(@n0 LayoutInflater layoutInflater, @p0 ViewGroup viewGroup, boolean z10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{layoutInflater, viewGroup, new Byte(z10 ? (byte) 1 : (byte) 0)}, null, changeQuickRedirect, true, 49928, new Class[]{LayoutInflater.class, ViewGroup.class, Boolean.TYPE}, FragmentStickerBinding.class);
        if (patchProxyResultProxy.isSupported) {
            return (FragmentStickerBinding) patchProxyResultProxy.result;
        }
        View viewInflate = layoutInflater.inflate(R.layout.fragment_sticker, viewGroup, false);
        if (z10) {
            viewGroup.addView(viewInflate);
        }
        return bind(viewInflate);
    }

    @Override // l3.c
    @n0
    public /* bridge */ /* synthetic */ View getRoot() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 49930, new Class[0], View.class);
        return patchProxyResultProxy.isSupported ? (View) patchProxyResultProxy.result : getRoot();
    }

    @Override // l3.c
    @n0
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
