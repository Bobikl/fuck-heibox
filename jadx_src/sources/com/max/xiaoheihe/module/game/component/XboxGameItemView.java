package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.module.search.SearchHelper;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: XboxGameItemView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class XboxGameItemView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f87017i = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f87018b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f87019c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ProgressBar f87020d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f87021e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f87022f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f87023g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f87024h;

    public XboxGameItemView(@e Context context) {
        this(context, null);
    }

    public XboxGameItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public XboxGameItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public XboxGameItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37080, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View.inflate(getContext(), R.layout.view_xbox_game_item, this);
        setDivider(new View(getContext()));
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, ViewUtils.f(getContext(), 0.5f));
        layoutParams.addRule(12);
        layoutParams.leftMargin = ViewUtils.f(getContext(), 142.0f);
        getDivider().setBackgroundResource(R.color.divider_secondary_1_color);
        addView(getDivider(), layoutParams);
        View viewFindViewById = findViewById(R.id.iv_game_img);
        f0.o(viewFindViewById, "findViewById(R.id.iv_game_img)");
        setIv_game_img((ImageView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_game_name);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_game_name)");
        setTv_game_name((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.pb_game);
        f0.o(viewFindViewById3, "findViewById(R.id.pb_game)");
        setPb_game((ProgressBar) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_achievement);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_achievement)");
        setTv_achievement((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_g_point_count);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_g_point_count)");
        setTv_g_point_count((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.tv_time_played);
        f0.o(viewFindViewById6, "findViewById(R.id.tv_time_played)");
        setTv_time_played((TextView) viewFindViewById6);
    }

    @d
    public final View getDivider() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37078, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f87024h;
        if (view != null) {
            return view;
        }
        f0.S(SearchHelper.E);
        return null;
    }

    @d
    public final ImageView getIv_game_img() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37066, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87018b;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_game_img");
        return null;
    }

    @d
    public final ProgressBar getPb_game() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37070, new Class[0], ProgressBar.class);
        if (patchProxyResultProxy.isSupported) {
            return (ProgressBar) patchProxyResultProxy.result;
        }
        ProgressBar progressBar = this.f87020d;
        if (progressBar != null) {
            return progressBar;
        }
        f0.S("pb_game");
        return null;
    }

    @d
    public final TextView getTv_achievement() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37072, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87021e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_achievement");
        return null;
    }

    @d
    public final TextView getTv_g_point_count() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37074, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87022f;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_g_point_count");
        return null;
    }

    @d
    public final TextView getTv_game_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37068, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87019c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_game_name");
        return null;
    }

    @d
    public final TextView getTv_time_played() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37076, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87023g;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_time_played");
        return null;
    }

    public final void setDivider(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37079, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f87024h = view;
    }

    public final void setIv_game_img(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37067, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87018b = imageView;
    }

    public final void setPb_game(@d ProgressBar progressBar) {
        if (PatchProxy.proxy(new Object[]{progressBar}, this, changeQuickRedirect, false, 37071, new Class[]{ProgressBar.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(progressBar, "<set-?>");
        this.f87020d = progressBar;
    }

    public final void setTv_achievement(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37073, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87021e = textView;
    }

    public final void setTv_g_point_count(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37075, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87022f = textView;
    }

    public final void setTv_game_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37069, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87019c = textView;
    }

    public final void setTv_time_played(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37077, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87023g = textView;
    }
}
