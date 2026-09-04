package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.LinearLayout;
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

/* JADX INFO: compiled from: Dota2MatchListTitleView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2MatchListTitleView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f87173g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f87174b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f87175c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f87176d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f87177e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f87178f;

    public Dota2MatchListTitleView(@e Context context) {
        this(context, null);
    }

    public Dota2MatchListTitleView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Dota2MatchListTitleView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Dota2MatchListTitleView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37292, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(16);
        setTv_result(b("结果", ViewUtils.f(getContext(), 54.0f), 0.0f));
        getTv_result().setPadding(ViewUtils.f(getContext(), 12.0f), 0, 0, 0);
        addView(getTv_result());
        setTv_hero(b("英雄", 0, 107.0f));
        addView(getTv_hero());
        setTv_kda(b("KDA", 0, 67.0f));
        addView(getTv_kda());
        setTv_module_time(b("模式/时长", 0, 70.0f));
        addView(getTv_module_time());
        setTv_dan(b("对局段位", ViewUtils.f(getContext(), 77.0f), 0.0f));
        addView(getTv_dan());
    }

    private final TextView b(String str, int i10, float f10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, 37293, new Class[]{String.class, Integer.TYPE, Float.TYPE}, TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = new TextView(getContext());
        textView.setText(str);
        textView.setTextColor(d.F(getContext(), R.color.white_alpha50));
        textView.setTextSize(1, 11.0f);
        textView.setMaxLines(1);
        textView.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i10, -2);
        if (f10 > 0.0f) {
            layoutParams.weight = f10;
            textView.setGravity(17);
        }
        textView.setLayoutParams(layoutParams);
        return textView;
    }

    @dl.d
    public final TextView getTv_dan() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37290, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87178f;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_dan");
        return null;
    }

    @dl.d
    public final TextView getTv_hero() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37284, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87175c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_hero");
        return null;
    }

    @dl.d
    public final TextView getTv_kda() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37286, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87176d;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_kda");
        return null;
    }

    @dl.d
    public final TextView getTv_module_time() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37288, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87177e;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_module_time");
        return null;
    }

    @dl.d
    public final TextView getTv_result() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37282, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87174b;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_result");
        return null;
    }

    public final void setTv_dan(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37291, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87178f = textView;
    }

    public final void setTv_hero(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37285, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87175c = textView;
    }

    public final void setTv_kda(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37287, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87176d = textView;
    }

    public final void setTv_module_time(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37289, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87177e = textView;
    }

    public final void setTv_result(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37283, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87174b = textView;
    }
}
