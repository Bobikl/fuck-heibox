package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbimage.b;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.accelworld.l;
import com.max.xiaoheihe.bean.bbs.webwithnative.WebWithNativeRecommendItemObj;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: NativeCommentRecommendView.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class NativeCommentRecommendView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f80889i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f80890b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f80891c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f80892d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f80893e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f80894f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f80895g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f80896h;

    public NativeCommentRecommendView(@e Context context) {
        this(context, null);
    }

    public NativeCommentRecommendView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public NativeCommentRecommendView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public NativeCommentRecommendView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f80892d = -1;
        this.f80893e = -1;
        this.f80894f = -1;
        this.f80895g = -1;
        this.f80896h = 3.0f;
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27763, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(17);
        setIvIcon(new ImageView(getContext()));
        getIvIcon().setScaleType(ImageView.ScaleType.CENTER_CROP);
        int iF = ViewUtils.f(getContext(), 14.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.setMarginEnd(ViewUtils.f(getContext(), 3.0f));
        getIvIcon().setLayoutParams(layoutParams);
        addView(getIvIcon());
        setTvDesc(new TextView(getContext()));
        getTvDesc().setTextSize(1, 12.0f);
        addView(getTvDesc());
        this.f80892d = l.h(getContext(), R.color.native_recommend_color);
        this.f80892d = d.I(0.1f, l.h(getContext(), R.color.native_recommend_color));
        this.f80894f = l.h(getContext(), R.color.white_alpha90);
        this.f80895g = l.h(getContext(), R.color.white_alpha10);
        setCheck(false);
    }

    public final void b(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27765, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        b.K(str, getIvIcon());
    }

    @dl.d
    public final ImageView getIvIcon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27759, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80890b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("ivIcon");
        return null;
    }

    public final float getRadiusDp() {
        return this.f80896h;
    }

    @dl.d
    public final TextView getTvDesc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27761, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80891c;
        if (textView != null) {
            return textView;
        }
        f0.S("tvDesc");
        return null;
    }

    public final void setCheck(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27764, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        int i10 = z10 ? this.f80894f : this.f80895g;
        int i11 = z10 ? this.f80892d : this.f80893e;
        getIvIcon().setAlpha(d.x(i10));
        getIvIcon().setColorFilter(d.J(i10));
        getTvDesc().setTextColor(i10);
        l.s(this, i11, this.f80896h);
    }

    public final void setDesc(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27766, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTvDesc().setText(str);
    }

    public final void setInfo(@e WebWithNativeRecommendItemObj webWithNativeRecommendItemObj) {
        if (PatchProxy.proxy(new Object[]{webWithNativeRecommendItemObj}, this, changeQuickRedirect, false, 27767, new Class[]{WebWithNativeRecommendItemObj.class}, Void.TYPE).isSupported || webWithNativeRecommendItemObj == null) {
            return;
        }
        String bg_check_color = webWithNativeRecommendItemObj.getBg_check_color();
        if (bg_check_color != null) {
            this.f80892d = com.max.hbutils.utils.a.d(bg_check_color);
        }
        String bg_uncheck_color = webWithNativeRecommendItemObj.getBg_uncheck_color();
        if (bg_uncheck_color != null) {
            this.f80893e = com.max.hbutils.utils.a.d(bg_uncheck_color);
        }
        String text_check_color = webWithNativeRecommendItemObj.getText_check_color();
        if (text_check_color != null) {
            this.f80894f = com.max.hbutils.utils.a.d(text_check_color);
        }
        String text_uncheck_color = webWithNativeRecommendItemObj.getText_uncheck_color();
        if (text_uncheck_color != null) {
            this.f80895g = com.max.hbutils.utils.a.d(text_uncheck_color);
        }
        b(webWithNativeRecommendItemObj.getIcon());
        setDesc(webWithNativeRecommendItemObj.getDesc());
    }

    public final void setIvIcon(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27760, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80890b = imageView;
    }

    public final void setRadiusDp(float f10) {
        this.f80896h = f10;
    }

    public final void setTvDesc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27762, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80891c = textView;
    }
}
