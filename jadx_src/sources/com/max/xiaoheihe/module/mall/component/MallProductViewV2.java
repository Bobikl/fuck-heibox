package com.max.xiaoheihe.module.mall.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.google.android.flexbox.FlexboxLayout;
import com.max.hbcustomview.textview.AutoLineTextView;
import com.max.xiaoheihe.module.game.component.PriceLowestTagView;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import df.kg0;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import xh.i;

/* JADX INFO: compiled from: MallProductViewV2.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class MallProductViewV2 extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f90545l = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @d
    private final kg0 f90546k;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public MallProductViewV2(@d Context context) {
        this(context, null, 0, 6, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @i
    public MallProductViewV2(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @i
    public MallProductViewV2(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        kg0 kg0VarD = kg0.d(LayoutInflater.from(context), this, true);
        f0.o(kg0VarD, "inflate(LayoutInflater.from(context), this, true)");
        this.f90546k = kg0VarD;
    }

    public /* synthetic */ MallProductViewV2(Context context, AttributeSet attributeSet, int i10, int i11, u uVar) {
        this(context, (i11 & 2) != 0 ? null : attributeSet, (i11 & 4) != 0 ? 0 : i10);
    }

    @Override // android.view.View
    @d
    public final View getBottom() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41878, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f90546k.f112623b;
        f0.o(view, "binding.bottom");
        return view;
    }

    @d
    public final FlexboxLayout getFlTags() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41873, new Class[0], FlexboxLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (FlexboxLayout) patchProxyResultProxy.result;
        }
        FlexboxLayout flexboxLayout = this.f90546k.f112624c;
        f0.o(flexboxLayout, "binding.flTags");
        return flexboxLayout;
    }

    @d
    public final View getImgDivider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41870, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f90546k.f112625d;
        f0.o(view, "binding.imgDivider");
        return view;
    }

    @d
    public final ImageView getIvImg() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41869, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f90546k.f112626e;
        f0.o(imageView, "binding.ivImg");
        return imageView;
    }

    @d
    public final LinearLayout getLlHTag() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41871, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f90546k.f112627f;
        f0.o(linearLayout, "binding.llHTag");
        return linearLayout;
    }

    @d
    public final LinearLayout getLlPrice() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41874, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f90546k.f112628g;
        f0.o(linearLayout, "binding.llPrice");
        return linearLayout;
    }

    @d
    public final TextView getTvCurrentPrice() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41875, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f90546k.f112629h;
        f0.o(textView, "binding.tvCurrentPrice");
        return textView;
    }

    @d
    public final TextView getTvDiscount() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41877, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f90546k.f112630i;
        f0.o(textView, "binding.tvDiscount");
        return textView;
    }

    @d
    public final AutoLineTextView getTvName() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41872, new Class[0], AutoLineTextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (AutoLineTextView) patchProxyResultProxy.result;
        }
        AutoLineTextView autoLineTextView = this.f90546k.f112631j;
        f0.o(autoLineTextView, "binding.tvName");
        return autoLineTextView;
    }

    @d
    public final TextView getTvOriginalPrice() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41876, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f90546k.f112632k;
        f0.o(textView, "binding.tvOriginalPrice");
        return textView;
    }

    @d
    public final PriceLowestTagView getVLowestTagView() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 41879, new Class[0], PriceLowestTagView.class);
        if (patchProxyResultProxy.isSupported) {
            return (PriceLowestTagView) patchProxyResultProxy.result;
        }
        PriceLowestTagView priceLowestTagView = this.f90546k.f112633l;
        f0.o(priceLowestTagView, "binding.vPriceTag");
        return priceLowestTagView;
    }
}
