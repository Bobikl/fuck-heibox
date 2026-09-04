package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.account.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: EpicGameItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class EpicGameItemView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f86594g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f86595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f86597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f86598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ProgressBar f86599f;

    public EpicGameItemView(@e Context context) {
        this(context, null);
    }

    public EpicGameItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public EpicGameItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public EpicGameItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36311, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        setGravity(16);
        View.inflate(getContext(), R.layout.view_epic_game_item_content, this);
        View viewFindViewById = findViewById(R.id.iv_game_icon);
        f0.o(viewFindViewById, "findViewById(R.id.iv_game_icon)");
        setIv_game_icon((ImageView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_game_name);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_game_name)");
        setTv_game_name((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_free_get);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_free_get)");
        setTv_free_get((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_play_time);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_play_time)");
        setTv_play_time((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.f76248pb);
        f0.o(viewFindViewById5, "findViewById(R.id.pb)");
        setPb((ProgressBar) viewFindViewById5);
        View viewInflate = View.inflate(getContext(), R.layout.divider, null);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, ViewUtils.f(getContext(), 0.5f));
        layoutParams.leftMargin = ViewUtils.f(getContext(), 140.0f);
        layoutParams.rightMargin = ViewUtils.f(getContext(), 10.0f);
        layoutParams.gravity = 80;
        addView(viewInflate, layoutParams);
    }

    @d
    public final ImageView getIv_game_icon() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36301, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f86595b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_game_icon");
        return null;
    }

    @d
    public final ProgressBar getPb() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36309, new Class[0], ProgressBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProgressBar) patchProxyResultProxy.result;
        }
        ProgressBar progressBar = this.f86599f;
        if (progressBar != null) {
            return progressBar;
        }
        f0.S("pb");
        return null;
    }

    @d
    public final TextView getTv_free_get() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36305, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86597d;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_free_get");
        return null;
    }

    @d
    public final TextView getTv_game_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36303, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86596c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_game_name");
        return null;
    }

    @d
    public final TextView getTv_play_time() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36307, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86598e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_play_time");
        return null;
    }

    public final void setFreeToGet(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 36313, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_free_get().setVisibility(z10 ? 0 : 8);
    }

    public final void setIv_game_icon(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 36302, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f86595b = imageView;
    }

    public final void setName(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36312, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_game_name().setText(str);
    }

    public final void setPb(@d ProgressBar progressBar) {
        if (PatchProxy.proxy(new Object[]{progressBar}, this, changeQuickRedirect, false, 36310, new Class[]{ProgressBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(progressBar, "<set-?>");
        this.f86599f = progressBar;
    }

    public final void setPlayTime(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36314, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_play_time().setText(str);
    }

    public final void setProgressStyle(@e GameObj gameObj) {
        if (PatchProxy.proxy(new Object[]{gameObj}, this, changeQuickRedirect, false, 36315, new Class[]{GameObj.class}, Void.TYPE).isSupported || gameObj == null) {
            return;
        }
        l.f0(gameObj.getPlaytime_percent(), getPb());
        l.Q(getPb(), gameObj);
    }

    public final void setTv_free_get(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36306, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86597d = textView;
    }

    public final void setTv_game_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36304, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86596c = textView;
    }

    public final void setTv_play_time(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36308, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86598e = textView;
    }
}
