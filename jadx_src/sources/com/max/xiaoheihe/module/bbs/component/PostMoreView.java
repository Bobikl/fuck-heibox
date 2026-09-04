package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
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

/* JADX INFO: compiled from: PostMoreView.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class PostMoreView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f80900d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f80901b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f80902c;

    public PostMoreView(@e Context context) {
        this(context, null);
    }

    public PostMoreView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public PostMoreView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public PostMoreView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27780, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        setGravity(17);
        setIv_img(new ImageView(getContext()));
        int iF = ViewUtils.f(getContext(), 24.0f);
        addView(getIv_img(), new LinearLayout.LayoutParams(iF, iF));
        setTv_content(new TextView(getContext()));
        getTv_content().setTextSize(1, 10.0f);
        getTv_content().setMaxLines(1);
        getTv_content().setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = ViewUtils.f(getContext(), 4.0f);
        addView(getTv_content(), layoutParams);
        setChecked(false);
    }

    @d
    public final ImageView getIv_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27776, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80901b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_img");
        return null;
    }

    @d
    public final TextView getTv_content() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27778, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80902c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_content");
        return null;
    }

    public final void setChecked(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 27781, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView iv_img = getIv_img();
        Resources resources = getContext().getResources();
        int i10 = R.color.text_primary_1_color;
        iv_img.setColorFilter(resources.getColor(z10 ? R.color.text_primary_1_color : R.color.text_secondary_1_color));
        TextView tv_content = getTv_content();
        Resources resources2 = getContext().getResources();
        if (!z10) {
            i10 = R.color.text_secondary_1_color;
        }
        tv_content.setTextColor(resources2.getColor(i10));
    }

    public final void setIv_img(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27777, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80901b = imageView;
    }

    public final void setTv_content(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27779, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80902c = textView;
    }
}
