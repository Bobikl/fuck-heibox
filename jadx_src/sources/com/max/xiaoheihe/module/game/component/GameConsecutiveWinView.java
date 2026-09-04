package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.ConsecutiveInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.t0;

/* JADX INFO: compiled from: GameConsecutiveWinView.kt */
/* JADX INFO: loaded from: classes11.dex */
@t0({"SMAP\nGameConsecutiveWinView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GameConsecutiveWinView.kt\ncom/max/xiaoheihe/module/game/component/GameConsecutiveWinView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,62:1\n262#2,2:63\n*S KotlinDebug\n*F\n+ 1 GameConsecutiveWinView.kt\ncom/max/xiaoheihe/module/game/component/GameConsecutiveWinView\n*L\n50#1:63,2\n*E\n"})
@o(parameters = 0)
public final class GameConsecutiveWinView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f86667f = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f86668b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86669c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f86670d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ViewGroup f86671e;

    public GameConsecutiveWinView(@e Context context) {
        this(context, null);
    }

    public GameConsecutiveWinView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameConsecutiveWinView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameConsecutiveWinView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        f0.m(context);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36443, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.view_game_consecutive_win, this);
        View viewFindViewById = findViewById(R.id.iv_icon);
        f0.o(viewFindViewById, "findViewById(R.id.iv_icon)");
        setIv_icon((ImageView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_num);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_num)");
        setTv_num((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_desc);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_desc)");
        setTv_desc((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.vg_rect);
        f0.o(viewFindViewById4, "findViewById(R.id.vg_rect)");
        setVg_rect((ViewGroup) viewFindViewById4);
    }

    @d
    public final ImageView getIv_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36435, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86668b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_icon");
        return null;
    }

    @d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36439, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86670d;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    @d
    public final TextView getTv_num() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36437, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86669c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_num");
        return null;
    }

    @d
    public final ViewGroup getVg_rect() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36441, new Class[0], ViewGroup.class);
        if (patchProxyResultProxy.isSupported) {
            return (ViewGroup) patchProxyResultProxy.result;
        }
        ViewGroup viewGroup = this.f86671e;
        if (viewGroup != null) {
            return viewGroup;
        }
        f0.S("vg_rect");
        return null;
    }

    public final void setData(@e ConsecutiveInfoObj consecutiveInfoObj) {
        if (PatchProxy.proxy(new Object[]{consecutiveInfoObj}, this, changeQuickRedirect, false, 36444, new Class[]{ConsecutiveInfoObj.class}, Void.TYPE).isSupported) {
            return;
        }
        setVisibility(consecutiveInfoObj != null ? 0 : 8);
        if (consecutiveInfoObj != null) {
            com.max.hbimage.b.K(consecutiveInfoObj.getConsecutive_icon(), getIv_icon());
            getTv_num().setText(consecutiveInfoObj.getConsecutive_num());
            getTv_desc().setText(consecutiveInfoObj.getConsecutive_desc());
            getVg_rect().setBackground(ViewUtils.G(ViewUtils.o(getContext(), this), com.max.xiaoheihe.utils.d.e1(consecutiveInfoObj.getConsecutive_color())));
        }
    }

    public final void setIv_icon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36436, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86668b = imageView;
    }

    public final void setTv_desc(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36440, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86670d = textView;
    }

    public final void setTv_num(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36438, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86669c = textView;
    }

    public final void setVg_rect(@d ViewGroup viewGroup) {
        if (PatchProxy.proxy(new Object[]{viewGroup}, this, changeQuickRedirect, false, 36442, new Class[]{ViewGroup.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(viewGroup, "<set-?>");
        this.f86671e = viewGroup;
    }
}
