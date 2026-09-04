package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.game.component.ShineMvpView;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2HeroImageView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2HeroImageView extends CardView {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f87093o = 8;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public ImageView f87094k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public TextView f87095l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f87096m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public ShineMvpView f87097n;

    public Dota2HeroImageView(@e Context context) {
        this(context, null);
    }

    public Dota2HeroImageView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Dota2HeroImageView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        h();
    }

    private final void h() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37159, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setCardElevation(0.0f);
        setCardBackgroundColor(0);
        setRadius(ViewUtils.m(getContext(), ViewUtils.f(getContext(), 71.0f), ViewUtils.f(getContext(), 42.0f)));
        setIv_image(new ImageView(getContext()));
        getIv_image().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        getIv_image().setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(getIv_image());
        setTv_level(new TextView(getContext()));
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, ViewUtils.f(getContext(), 15.0f));
        layoutParams.gravity = 8388691;
        getTv_level().setLayoutParams(layoutParams);
        getTv_level().setGravity(17);
        int iF = ViewUtils.f(getContext(), 3.0f);
        getTv_level().setPadding(iF, 0, iF, 0);
        getTv_level().setBackground(q.H(getContext(), R.color.black_alpha60, 3.0f));
        getTv_level().setTextColor(d.F(getContext(), R.color.white));
        getTv_level().setTextSize(1, 10.0f);
        getTv_level().setTypeface(bb.d.a().b(5));
        addView(getTv_level());
        setIv_icon(new ImageView(getContext()));
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(ViewUtils.f(getContext(), 16.0f), ViewUtils.f(getContext(), 15.0f));
        layoutParams2.gravity = 8388693;
        ImageView iv_icon = getIv_icon();
        iv_icon.setLayoutParams(layoutParams2);
        iv_icon.setScaleType(ImageView.ScaleType.CENTER_CROP);
        iv_icon.setVisibility(8);
        addView(getIv_icon());
        setV_mvp(new ShineMvpView(getContext()));
        getV_mvp().setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        addView(getV_mvp());
    }

    @dl.d
    public final ImageView getIv_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37155, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87096m;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_icon");
        return null;
    }

    @dl.d
    public final ImageView getIv_image() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37151, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87094k;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_image");
        return null;
    }

    @dl.d
    public final TextView getTv_level() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37153, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87095l;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_level");
        return null;
    }

    @dl.d
    public final ShineMvpView getV_mvp() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37157, new Class[0], ShineMvpView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ShineMvpView) patchProxyResultProxy.result;
        }
        ShineMvpView shineMvpView = this.f87097n;
        if (shineMvpView != null) {
            return shineMvpView;
        }
        f0.S("v_mvp");
        return null;
    }

    public final void setIv_icon(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37156, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87096m = imageView;
    }

    public final void setIv_image(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37152, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87094k = imageView;
    }

    public final void setTv_level(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37154, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87095l = textView;
    }

    public final void setV_mvp(@dl.d ShineMvpView shineMvpView) {
        if (PatchProxy.proxy(new Object[]{shineMvpView}, this, changeQuickRedirect, false, 37158, new Class[]{ShineMvpView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(shineMvpView, "<set-?>");
        this.f87097n = shineMvpView;
    }
}
