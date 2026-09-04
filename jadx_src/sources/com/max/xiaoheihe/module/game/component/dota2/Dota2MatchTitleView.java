package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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

/* JADX INFO: compiled from: Dota2MatchTitleView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2MatchTitleView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f87183h = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f87184b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ImageView f87185c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f87186d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f87187e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f87188f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public TextView f87189g;

    public Dota2MatchTitleView(@e Context context) {
        this(context, null);
    }

    public Dota2MatchTitleView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Dota2MatchTitleView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Dota2MatchTitleView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37316, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(16);
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.layout_dota2_match_title, (ViewGroup) null, false);
        viewInflate.setLayoutParams(new LinearLayout.LayoutParams(-1, ViewUtils.f(getContext(), 30.0f)));
        addView(viewInflate);
        View viewFindViewById = findViewById(R.id.v_top_line);
        f0.o(viewFindViewById, "findViewById(R.id.v_top_line)");
        setV_top_line(viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.iv_title);
        f0.o(viewFindViewById2, "findViewById(R.id.iv_title)");
        setIv_title((ImageView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_name);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_name)");
        setTv_name((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.tv_win);
        f0.o(viewFindViewById4, "findViewById(R.id.tv_win)");
        setTv_win((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.tv_kill);
        f0.o(viewFindViewById5, "findViewById(R.id.tv_kill)");
        setTv_kill((TextView) viewFindViewById5);
        View viewFindViewById6 = findViewById(R.id.tv_gold);
        f0.o(viewFindViewById6, "findViewById(R.id.tv_gold)");
        setTv_gold((TextView) viewFindViewById6);
    }

    @d
    public final ImageView getIv_title() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37306, new Class[0], ImageView.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageView) patchProxyResultProxy.result;
        }
        ImageView imageView = this.f87185c;
        if (imageView != null) {
            return imageView;
        }
        f0.S("iv_title");
        return null;
    }

    @d
    public final TextView getTv_gold() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37314, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87189g;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_gold");
        return null;
    }

    @d
    public final TextView getTv_kill() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37312, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87188f;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_kill");
        return null;
    }

    @d
    public final TextView getTv_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37308, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87186d;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_name");
        return null;
    }

    @d
    public final TextView getTv_win() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37310, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87187e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_win");
        return null;
    }

    @d
    public final View getV_top_line() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37304, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f87184b;
        if (view != null) {
            return view;
        }
        f0.S("v_top_line");
        return null;
    }

    public final void setColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37317, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getV_top_line().setBackgroundColor(i10);
        getIv_title().setColorFilter(i10);
    }

    public final void setGold(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37320, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_gold().setText(str);
    }

    public final void setIv_title(@d ImageView imageView) {
        if (PatchProxy.proxy(new Object[]{imageView}, this, changeQuickRedirect, false, 37307, new Class[]{ImageView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(imageView, "<set-?>");
        this.f87185c = imageView;
    }

    public final void setTv_gold(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37315, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87189g = textView;
    }

    public final void setTv_kill(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37313, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87188f = textView;
    }

    public final void setTv_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37309, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87186d = textView;
    }

    public final void setTv_win(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37311, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87187e = textView;
    }

    public final void setV_top_line(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37305, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f87184b = view;
    }

    public final void setWin(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37318, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_win().setText(z10 ? "胜利" : "失败");
    }

    public final void setname(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37319, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_name().setText(str);
    }
}
