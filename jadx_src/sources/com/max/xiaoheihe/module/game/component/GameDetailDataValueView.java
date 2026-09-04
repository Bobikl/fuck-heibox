package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: GameDetailDataValueView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameDetailDataValueView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86715d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f86716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86717c;

    public GameDetailDataValueView(@e Context context) {
        this(context, null);
    }

    public GameDetailDataValueView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameDetailDataValueView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameDetailDataValueView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36524, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        setGravity(17);
        setTv_value(new TextView(getContext()));
        getTv_value().setTextSize(1, 14.0f);
        getTv_value().setTextColor(d.E(R.color.white));
        getTv_value().setTypeface(bb.d.a().b(5));
        getTv_value().setGravity(17);
        addView(getTv_value());
        setTv_desc(new TextView(getContext()));
        getTv_desc().setTextSize(1, 9.0f);
        getTv_desc().setTextColor(d.E(R.color.white_alpha50));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.topMargin = ViewUtils.f(getContext(), 3.0f);
        getTv_desc().setLayoutParams(layoutParams);
        getTv_desc().setGravity(17);
        addView(getTv_desc());
    }

    @dl.d
    public final TextView getTv_desc() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36522, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86717c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_desc");
        return null;
    }

    @dl.d
    public final TextView getTv_value() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36520, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86716b;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_value");
        return null;
    }

    public final void setData(@e KeyDescObj keyDescObj) {
        if (PatchProxy.proxy(new Object[]{keyDescObj}, this, changeQuickRedirect, false, 36525, new Class[]{KeyDescObj.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_value().setText(keyDescObj != null ? keyDescObj.getValue() : null);
        getTv_desc().setText(keyDescObj != null ? keyDescObj.getDesc() : null);
    }

    public final void setTv_desc(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36523, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86717c = textView;
    }

    public final void setTv_value(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36521, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86716b = textView;
    }
}
