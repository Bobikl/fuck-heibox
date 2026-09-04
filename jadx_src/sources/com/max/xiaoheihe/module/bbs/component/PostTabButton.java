package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: PostTabButton.kt */
/* JADX INFO: loaded from: classes10.dex */
@t0({"SMAP\nPostTabButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PostTabButton.kt\ncom/max/xiaoheihe/module/bbs/component/PostTabButton\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,103:1\n177#2,2:104\n*S KotlinDebug\n*F\n+ 1 PostTabButton.kt\ncom/max/xiaoheihe/module/bbs/component/PostTabButton\n*L\n67#1:104,2\n*E\n"})
@o(parameters = 0)
public final class PostTabButton extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f80903h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f80904b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public LinearLayout f80905c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f80906d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f80907e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private Drawable f80908f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private Drawable f80909g;

    public PostTabButton(@e Context context) {
        this(context, null);
    }

    public PostTabButton(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PostTabButton(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PostTabButton(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
        b(attributeSet);
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27790, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        setGravity(49);
        setIv_triangle(new ImageView(getContext()));
        getIv_triangle().setImageResource(R.drawable.common_triangle);
        getIv_triangle().setColorFilter(getContext().getResources().getColor(R.color.background_layer_2_color));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(getContext(), 30.0f), ViewUtils.f(getContext(), 12.0f));
        layoutParams.bottomMargin = ViewUtils.f(getContext(), 8.0f);
        addView(getIv_triangle(), layoutParams);
        setVg_click(new LinearLayout(getContext()));
        getVg_click().setOrientation(1);
        getVg_click().setGravity(1);
        addView(getVg_click(), new LinearLayout.LayoutParams(-2, -2));
        setIv_icon(new ImageView(getContext()));
        ImageView iv_icon = getIv_icon();
        int iF = ViewUtils.f(getContext(), 9.0f);
        iv_icon.setPadding(iF, iF, iF, iF);
        getIv_icon().setBackgroundResource(R.drawable.bg_white_20dp);
        int iF2 = ViewUtils.f(getContext(), 40.0f);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iF2, iF2);
        layoutParams2.bottomMargin = ViewUtils.f(getContext(), 6.0f);
        getVg_click().addView(getIv_icon(), layoutParams2);
        setTv_name(new TextView(getContext()));
        getTv_name().setTextSize(1, 12.0f);
        getVg_click().addView(getTv_name(), new LinearLayout.LayoutParams(-2, -2));
    }

    private final void b(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 27791, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f76268b3);
        f0.o(typedArrayObtainStyledAttributes, "context.obtainStyledAttr…, R.styleable.PostButton)");
        this.f80908f = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f80909g = typedArrayObtainStyledAttributes.getDrawable(3);
        setText(typedArrayObtainStyledAttributes.getString(2));
        setChecked(typedArrayObtainStyledAttributes.getBoolean(1, false));
    }

    @e
    public final Drawable getCheckedDrawable() {
        return this.f80908f;
    }

    @d
    public final ImageView getIv_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27786, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80906d;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_icon");
        return null;
    }

    @d
    public final ImageView getIv_triangle() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27782, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80904b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_triangle");
        return null;
    }

    @d
    public final TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27788, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80907e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    @e
    public final Drawable getUnCheckedDrawable() {
        return this.f80909g;
    }

    @d
    public final LinearLayout getVg_click() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27784, new Class[0], LinearLayout.class);
        if (patchProxyResultProxy.isSupported) {
            return (LinearLayout) patchProxyResultProxy.result;
        }
        LinearLayout linearLayout = this.f80905c;
        if (linearLayout != null) {
            return linearLayout;
        }
        f0.S("vg_click");
        return null;
    }

    public final void setChecked(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27792, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            getIv_icon().setImageDrawable(this.f80908f);
            getTv_name().setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
            getIv_triangle().setVisibility(0);
        } else {
            getIv_icon().setImageDrawable(this.f80909g);
            getTv_name().setTextColor(getContext().getResources().getColor(R.color.text_primary_2_color));
            getIv_triangle().setVisibility(4);
        }
    }

    public final void setCheckedDrawable(@e Drawable drawable) {
        this.f80908f = drawable;
    }

    public final void setIv_icon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27787, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80906d = imageView;
    }

    public final void setIv_triangle(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27783, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80904b = imageView;
    }

    public final void setText(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27793, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_name().setText(str);
    }

    public final void setTv_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27789, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80907e = textView;
    }

    public final void setUnCheckedDrawable(@e Drawable drawable) {
        this.f80909g = drawable;
    }

    public final void setVg_click(@d LinearLayout linearLayout) {
        if (PatchProxy.proxy(new Object[]{linearLayout}, this, changeQuickRedirect, false, 27785, new Class[]{LinearLayout.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(linearLayout, "<set-?>");
        this.f80905c = linearLayout;
    }
}
