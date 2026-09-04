package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.account.component.FollowButton;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: RecommendUserView.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class RecommendUserView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f80910g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f80911b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f80912c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f80913d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f80914e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public FollowButton f80915f;

    public RecommendUserView(@e Context context) {
        this(context, null);
    }

    public RecommendUserView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public RecommendUserView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public RecommendUserView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27804, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setIv_cancel(new ImageView(getContext()));
        int iF = ViewUtils.f(getContext(), 14.0f);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(iF, iF);
        layoutParams.addRule(11);
        layoutParams.topMargin = ViewUtils.f(getContext(), 4.0f);
        getIv_cancel().setImageResource(R.drawable.ic_close_square_14);
        getIv_cancel().setColorFilter(d.E(R.color.divider_secondary_1_color));
        addView(getIv_cancel(), layoutParams);
        setIv_avatar(new ImageView(getContext()));
        getIv_avatar().setId(R.id.iv_avatar);
        int iF2 = ViewUtils.f(getContext(), 34.0f);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(iF2, iF2);
        layoutParams2.addRule(14);
        layoutParams2.topMargin = ViewUtils.f(getContext(), 10.0f);
        addView(getIv_avatar(), layoutParams2);
        setTv_name(new TextView(getContext()));
        getTv_name().setId(R.id.tv_name);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(3, R.id.iv_avatar);
        layoutParams3.addRule(14);
        layoutParams3.topMargin = ViewUtils.f(getContext(), 5.0f);
        getTv_name().setEllipsize(TextUtils.TruncateAt.END);
        getTv_name().setMaxLines(1);
        getTv_name().setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        getTv_name().setTextSize(1, 12.0f);
        addView(getTv_name(), layoutParams3);
        setTv_desc(new TextView(getContext()));
        RelativeLayout.LayoutParams layoutParams4 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams4.addRule(3, R.id.tv_name);
        layoutParams4.addRule(14);
        layoutParams4.topMargin = ViewUtils.f(getContext(), 1.0f);
        getTv_desc().setEllipsize(TextUtils.TruncateAt.END);
        getTv_desc().setMaxLines(1);
        getTv_desc().setTextColor(getContext().getResources().getColor(R.color.text_secondary_1_color));
        getTv_desc().setTextSize(1, 10.0f);
        addView(getTv_desc(), layoutParams4);
        setFb_action(new FollowButton(getContext()));
        RelativeLayout.LayoutParams layoutParams5 = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 60.0f), ViewUtils.f(getContext(), 24.0f));
        getFb_action().setRadiusDp(ViewUtils.m(getContext(), layoutParams5.width, layoutParams5.height));
        layoutParams5.addRule(12);
        layoutParams5.addRule(14);
        layoutParams5.topMargin = ViewUtils.f(getContext(), 6.0f);
        addView(getFb_action(), layoutParams5);
    }

    @dl.d
    public final FollowButton getFb_action() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27802, new Class[0], FollowButton.class);
        if (patchProxyResultProxy.isSupported) {
            return (FollowButton) patchProxyResultProxy.result;
        }
        FollowButton followButton = this.f80915f;
        if (followButton != null) {
            return followButton;
        }
        f0.S("fb_action");
        return null;
    }

    @dl.d
    public final ImageView getIv_avatar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27796, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80912c;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_avatar");
        return null;
    }

    @dl.d
    public final ImageView getIv_cancel() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27794, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f80911b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_cancel");
        return null;
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27800, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80914e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    @dl.d
    public final TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27798, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f80913d;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    public final void setFb_action(@dl.d FollowButton followButton) {
        if (PatchProxy.proxy(new Object[]{followButton}, this, changeQuickRedirect, false, 27803, new Class[]{FollowButton.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(followButton, "<set-?>");
        this.f80915f = followButton;
    }

    public final void setIv_avatar(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27797, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80912c = imageView;
    }

    public final void setIv_cancel(@dl.d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 27795, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f80911b = imageView;
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27801, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80914e = textView;
    }

    public final void setTv_name(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 27799, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f80913d = textView;
    }
}
