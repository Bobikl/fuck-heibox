package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.bean.game.gameoverview.KDAObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: KDAView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class KDAView extends FrameLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f86915g = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f86916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f86918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TextView f86919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f86920f;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KDAView(@d Context context) {
        this(context, null);
        f0.p(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public KDAView(@d Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        f0.p(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KDAView(@d Context context, @e AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        f0.p(context, "context");
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36856, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.view_kda, (ViewGroup) null, false);
        f0.o(viewInflate, "from(context).inflate(R.…ut.view_kda, null, false)");
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        viewInflate.setLayoutParams(layoutParams);
        addView(viewInflate);
        View viewFindViewById = findViewById(R.id.tv_kill);
        f0.o(viewFindViewById, "findViewById(R.id.tv_kill)");
        setTv_kill((TextView) viewFindViewById);
        View viewFindViewById2 = findViewById(R.id.tv_death);
        f0.o(viewFindViewById2, "findViewById(R.id.tv_death)");
        setTv_death((TextView) viewFindViewById2);
        View viewFindViewById3 = findViewById(R.id.tv_assist);
        f0.o(viewFindViewById3, "findViewById(R.id.tv_assist)");
        setTv_assist((TextView) viewFindViewById3);
        View viewFindViewById4 = findViewById(R.id.div_1);
        f0.o(viewFindViewById4, "findViewById(R.id.div_1)");
        setDiv_1((TextView) viewFindViewById4);
        View viewFindViewById5 = findViewById(R.id.div_2);
        f0.o(viewFindViewById5, "findViewById(R.id.div_2)");
        setDiv_2((TextView) viewFindViewById5);
    }

    @d
    public final TextView getDiv_1() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36852, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86919e;
        if (textView != null) {
            return textView;
        }
        f0.S("div_1");
        return null;
    }

    @d
    public final TextView getDiv_2() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36854, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86920f;
        if (textView != null) {
            return textView;
        }
        f0.S("div_2");
        return null;
    }

    @d
    public final TextView getTv_assist() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36850, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86918d;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_assist");
        return null;
    }

    @d
    public final TextView getTv_death() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36848, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86917c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_death");
        return null;
    }

    @d
    public final TextView getTv_kill() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36846, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86916b;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_kill");
        return null;
    }

    public final void setColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 36859, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_kill().setTextColor(i10);
        getTv_death().setTextColor(i10);
        getTv_assist().setTextColor(i10);
    }

    public final void setDiv_1(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36853, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86919e = textView;
    }

    public final void setDiv_2(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36855, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86920f = textView;
    }

    public final void setKDA(@e KDAObj kDAObj) {
        if (PatchProxy.proxy(new Object[]{kDAObj}, this, changeQuickRedirect, false, 36857, new Class[]{KDAObj.class}, Void.TYPE).isSupported || kDAObj == null) {
            return;
        }
        setKDA(kDAObj.getKill(), kDAObj.getDeath(), kDAObj.getAssist());
    }

    public final void setKDA(@e String str, @e String str2, @e String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 36858, new Class[]{String.class, String.class, String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_kill().setText(str);
        getTv_death().setText(str2);
        getTv_assist().setText(str3);
    }

    public final void setLightStyle() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36861, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setColor(com.max.xiaoheihe.utils.d.E(R.color.text_primary_2_color));
        getDiv_1().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
        getDiv_2().setTextColor(com.max.xiaoheihe.utils.d.E(R.color.text_secondary_1_color));
    }

    public final void setTv_assist(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36851, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86918d = textView;
    }

    public final void setTv_death(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36849, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86917c = textView;
    }

    public final void setTv_kill(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36847, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86916b = textView;
    }

    public final void setTypeFace(@e Typeface typeface) {
        if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, 36860, new Class[]{Typeface.class}, Void.TYPE).isSupported || typeface == null) {
            return;
        }
        getTv_kill().setTypeface(typeface);
        getTv_death().setTypeface(typeface);
        getTv_assist().setTypeface(typeface);
    }
}
