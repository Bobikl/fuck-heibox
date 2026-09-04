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
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameOverviewRecentStatsView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameOverviewRecentStatsView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f86789g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f86790b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f86791c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageView f86792d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f86793e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f86794f;

    public GameOverviewRecentStatsView(@e Context context) {
        this(context, null);
    }

    public GameOverviewRecentStatsView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GameOverviewRecentStatsView(@e Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.m(context);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36638, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        LayoutInflater.from(getContext()).inflate(R.layout.item_user_game_data, (ViewGroup) this, true);
        View viewFindViewById = findViewById(R.id.tv_title);
        f0.o(viewFindViewById, "findViewById(R.id.tv_title)");
        setTextViewTitle((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.iv_arrow);
        f0.o(viewFindViewById2, "findViewById(R.id.iv_arrow)");
        setImageViewArrow((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.iv_icon);
        f0.o(viewFindViewById3, "findViewById(R.id.iv_icon)");
        setImageViewIcon((ImageView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_desc);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_desc)");
        setTextViewDesc((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_value);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_value)");
        setTextViewValue((TextView) viewFindViewById5);
    }

    @d
    public final ImageView getImageViewArrow() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36630, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86791c;
        if (imageView != null) {
            return imageView;
        }
        f0.S("imageViewArrow");
        return null;
    }

    @d
    public final ImageView getImageViewIcon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36632, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86792d;
        if (imageView != null) {
            return imageView;
        }
        f0.S("imageViewIcon");
        return null;
    }

    @d
    public final TextView getTextViewDesc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36634, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86793e;
        if (textView != null) {
            return textView;
        }
        f0.S("textViewDesc");
        return null;
    }

    @d
    public final TextView getTextViewTitle() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36628, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86790b;
        if (textView != null) {
            return textView;
        }
        f0.S("textViewTitle");
        return null;
    }

    @d
    public final TextView getTextViewValue() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36636, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86794f;
        if (textView != null) {
            return textView;
        }
        f0.S("textViewValue");
        return null;
    }

    public final void setData(@e KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 36639, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported || keyDescObj == null) {
            return;
        }
        getTextViewTitle().setText(keyDescObj.getTitle());
        getTextViewDesc().setText(keyDescObj.getDesc());
        getTextViewValue().setText(keyDescObj.getValue());
        if (com.max.hbcommon.utils.c.u(keyDescObj.getIcon())) {
            getImageViewIcon().setVisibility(8);
        } else {
            com.max.hbimage.b.K(keyDescObj.getIcon(), getImageViewIcon());
            getImageViewIcon().setVisibility(0);
        }
    }

    public final void setImageViewArrow(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36631, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86791c = imageView;
    }

    public final void setImageViewIcon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36633, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86792d = imageView;
    }

    public final void setTextViewDesc(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36635, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86793e = textView;
    }

    public final void setTextViewTitle(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36629, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86790b = textView;
    }

    public final void setTextViewValue(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36637, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86794f = textView;
    }
}
