package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2DanView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2DanView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f87055d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f87056b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f87057c;

    public Dota2DanView(@e Context context) {
        this(context, null);
    }

    public Dota2DanView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Dota2DanView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Dota2DanView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37107, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setTv_top_num(new TextView(getContext()));
        getTv_top_num().setTextColor(d.E(R.color.white_alpha70));
        getTv_top_num().setTextSize(1, 7.0f);
        getTv_top_num().setBackground(ViewUtils.G(ViewUtils.o(getContext(), getTv_top_num()), d.E(R.color.white_alpha10)));
        getTv_top_num().setGravity(17);
        getTv_top_num().setPadding(ViewUtils.f(getContext(), 7.0f), 0, ViewUtils.f(getContext(), 2.0f), 0);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, ViewUtils.f(getContext(), 9.0f));
        layoutParams.addRule(15);
        layoutParams.addRule(17, R.id.iv_dan);
        layoutParams.setMarginStart(-ViewUtils.f(getContext(), 6.0f));
        getTv_top_num().setLayoutParams(layoutParams);
        addView(getTv_top_num());
        setIv_dan(new ImageView(getContext()));
        getIv_dan().setId(R.id.iv_dan);
        int iF = ViewUtils.f(getContext(), 14.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams2.addRule(15);
        getIv_dan().setLayoutParams(layoutParams2);
        addView(getIv_dan());
    }

    @dl.d
    public final ImageView getIv_dan() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37103, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87056b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_dan");
        return null;
    }

    @dl.d
    public final TextView getTv_top_num() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37105, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87057c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_top_num");
        return null;
    }

    public final void setIv_dan(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37104, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87056b = imageView;
    }

    public final void setTv_top_num(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37106, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87057c = textView;
    }
}
