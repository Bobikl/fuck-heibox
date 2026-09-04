package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameDurationDataView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameDurationDataView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86725d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f86726b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86727c;

    public GameDurationDataView(@e Context context) {
        this(context, null);
    }

    public GameDurationDataView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameDurationDataView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameDurationDataView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36540, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        setGravity(17);
        setBackground(q.i(getContext(), R.color.divider_secondary_2_color, R.color.divider_secondary_1_color, 0.5f, 5.0f));
        setTv_data(new TextView(getContext()));
        getTv_data().setTextColor(d.F(getContext(), R.color.text_primary_1_color));
        getTv_data().setTextSize(1, 17.0f);
        bb.d.d(getTv_data(), 2);
        addView(getTv_data(), new LinearLayout.LayoutParams(-2, -2));
        setTv_desc(new TextView(getContext()));
        getTv_desc().setTextColor(d.F(getContext(), R.color.text_primary_2_color));
        getTv_desc().setTextSize(1, 10.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = ViewUtils.f(getContext(), 4.0f);
        getTv_desc().setLayoutParams(layoutParams);
        addView(getTv_desc());
    }

    @dl.d
    public final TextView getTv_data() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36536, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86726b;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_data");
        return null;
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36538, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86727c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    public final void setData(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36541, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_data().setText(str);
    }

    public final void setDesc(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36542, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_desc().setText(str);
    }

    public final void setTv_data(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36537, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86726b = textView;
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36539, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86727c = textView;
    }
}
