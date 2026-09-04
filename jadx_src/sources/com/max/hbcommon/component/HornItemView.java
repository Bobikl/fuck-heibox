package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.max.hbcommon.R;
import com.max.hbcustomview.MarqueeTextView;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: HornItemView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class HornItemView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f67132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public MarqueeTextView f67133c;

    public HornItemView(@dl.e Context context) {
        this(context, null);
    }

    public HornItemView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public HornItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public HornItemView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
        b(attributeSet);
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Ob, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setIv_horn(new ImageView(getContext()));
        int iF = ViewUtils.f(getContext(), 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.leftMargin = ViewUtils.f(getContext(), 12.0f);
        addView(getIv_horn(), layoutParams);
        setTv_horn(new MarqueeTextView(getContext()));
        getTv_horn().setTextSize(1, 12.0f);
        getTv_horn().setEllipsize(TextUtils.TruncateAt.MARQUEE);
        getTv_horn().setMarqueeRepeatLimit(-1);
        getTv_horn().setMaxLines(1);
        getTv_horn().setHorizontallyScrolling(true);
        getTv_horn().setFocusable(true);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 10.0f);
        layoutParams2.rightMargin = ViewUtils.f(getContext(), 12.0f);
        addView(getTv_horn(), layoutParams2);
    }

    private final void b(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.d.Pb, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(16);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f66391g1);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.HornItemView_hivIconColor, getContext().getResources().getColor(R.color.text_secondary_1_color));
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.HornItemView_hivTextColor, getContext().getResources().getColor(R.color.text_primary_2_color));
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.HornItemView_hivIcon, R.drawable.mall_horn_filled_24x24);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.HornItemView_hivText);
        setIconColor(color);
        setTextColor(color2);
        getIv_horn().setImageResource(resourceId);
        setText(string);
    }

    @dl.d
    public final ImageView getIv_horn() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Kb, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f67132b;
        if (imageView != null) {
            return imageView;
        }
        kotlin.jvm.internal.f0.S("iv_horn");
        return null;
    }

    @dl.d
    public final MarqueeTextView getTv_horn() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.Mb, new Class[0], MarqueeTextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (MarqueeTextView) patchProxyResultProxy.result;
        }
        MarqueeTextView marqueeTextView = this.f67133c;
        if (marqueeTextView != null) {
            return marqueeTextView;
        }
        kotlin.jvm.internal.f0.S("tv_horn");
        return null;
    }

    public final void setIconColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Rb, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getIv_horn().setColorFilter(i10);
    }

    public final void setIconDrawable(@dl.d Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.Qb, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(drawable, "drawable");
        getIv_horn().setImageDrawable(drawable);
    }

    public final void setIv_horn(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, bb.c.d.Lb, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(imageView, "<set-?>");
        this.f67132b = imageView;
    }

    public final void setText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.Sb, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_horn().setText(str);
    }

    public final void setTextColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.Tb, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_horn().setTextColor(i10);
    }

    public final void setTv_horn(@dl.d MarqueeTextView marqueeTextView) {
        if (PatchProxy.proxy(new Object[]{marqueeTextView}, this, changeQuickRedirect, false, bb.c.d.Nb, new Class[]{MarqueeTextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(marqueeTextView, "<set-?>");
        this.f67133c = marqueeTextView;
    }
}
