package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcustomview.QMUIRadiusImageView;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameAvatarView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameAvatarView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameAvatarView.kt\ncom/max/xiaoheihe/module/game/component/GameAvatarView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,80:1\n262#2,2:81\n*S KotlinDebug\n*F\n+ 1 GameAvatarView.kt\ncom/max/xiaoheihe/module/game/component/GameAvatarView\n*L\n78#1:81,2\n*E\n"})
@o(parameters = 0)
public final class GameAvatarView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f86628e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public QMUIRadiusImageView f86629b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f86630c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f86631d;

    public GameAvatarView(@e Context context) {
        this(context, null);
    }

    public GameAvatarView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameAvatarView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameAvatarView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36365, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setIv_avatar(new QMUIRadiusImageView(getContext()));
        getIv_avatar().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        getIv_avatar().setScaleType(ImageView.ScaleType.CENTER_CROP);
        addView(getIv_avatar());
        setV_inner_border(new View(getContext()));
        getV_inner_border().setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        addView(getV_inner_border());
        setTv_auth(new TextView(getContext()));
        getTv_auth().setVisibility(8);
        getTv_auth().setTextSize(1, 8.0f);
        getTv_auth().setTextColor(d.F(getContext(), R.color.white_alpha60));
        getTv_auth().setText(R.string.already_certified);
        getTv_auth().setGravity(17);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewUtils.f(getContext(), 32.0f), ViewUtils.f(getContext(), 14.0f));
        layoutParams.addRule(21);
        layoutParams.addRule(12);
        getTv_auth().setLayoutParams(layoutParams);
        addView(getTv_auth());
        setRadius(ViewUtils.p(getContext(), this, ViewUtils.ViewType.IMAGE));
    }

    @dl.d
    public final QMUIRadiusImageView getIv_avatar() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36359, new Class[0], QMUIRadiusImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (QMUIRadiusImageView) patchProxyResultProxy.result;
        }
        QMUIRadiusImageView qMUIRadiusImageView = this.f86629b;
        if (qMUIRadiusImageView != null) {
            return qMUIRadiusImageView;
        }
        f0.S("iv_avatar");
        return null;
    }

    @dl.d
    public final TextView getTv_auth() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36363, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86631d;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_auth");
        return null;
    }

    @dl.d
    public final View getV_inner_border() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36361, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f86630c;
        if (view != null) {
            return view;
        }
        f0.S("v_inner_border");
        return null;
    }

    public final void setAuth(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36367, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_auth().setVisibility(z10 ? 0 : 8);
    }

    public final void setIv_avatar(@dl.d QMUIRadiusImageView qMUIRadiusImageView) {
        if (PatchProxy.proxy(new Object[]{qMUIRadiusImageView}, this, changeQuickRedirect, false, 36360, new Class[]{QMUIRadiusImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(qMUIRadiusImageView, "<set-?>");
        this.f86629b = qMUIRadiusImageView;
    }

    public final void setRadius(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36366, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getIv_avatar().setCornerRadius(i10);
        float fH0 = ViewUtils.h0(getContext(), i10);
        getV_inner_border().setBackground(q.L(getContext(), R.color.white_alpha10, 2.0f, fH0));
        getTv_auth().setBackground(q.p(getContext(), R.color.black_alpha50, fH0, 0.0f, fH0, 0.0f));
    }

    public final void setTv_auth(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36364, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86631d = textView;
    }

    public final void setV_inner_border(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 36362, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f86630c = view;
    }
}
