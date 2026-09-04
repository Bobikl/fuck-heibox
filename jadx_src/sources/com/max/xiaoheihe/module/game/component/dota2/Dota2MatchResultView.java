package com.max.xiaoheihe.module.game.component.dota2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbresource.a;
import com.max.hbutils.utils.ViewUtils;
import com.max.hbutils.utils.q;
import com.max.xiaoheihe.R;
import com.max.xiaoheihe.utils.d;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Dota2MatchResultView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class Dota2MatchResultView extends RelativeLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f87179e = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f87180b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f87181c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f87182d;

    public Dota2MatchResultView(@e Context context) {
        this(context, null);
    }

    public Dota2MatchResultView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public Dota2MatchResultView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public Dota2MatchResultView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37300, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        View view = new View(getContext());
        view.setId(R.id.v_left);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(ViewUtils.f(view.getContext(), 4.0f), -1);
        layoutParams.addRule(15);
        layoutParams.setMargins(0, ViewUtils.f(view.getContext(), 4.0f), ViewUtils.f(view.getContext(), 8.0f), ViewUtils.f(view.getContext(), 4.0f));
        view.setLayoutParams(layoutParams);
        setViewLeft(view);
        TextView textView = new TextView(getContext());
        textView.setId(R.id.tv_result);
        RelativeLayout.LayoutParams layoutParams2 = new RelativeLayout.LayoutParams(ViewUtils.f(textView.getContext(), 32.0f), ViewUtils.f(textView.getContext(), 19.0f));
        layoutParams2.addRule(6, R.id.v_left);
        layoutParams2.setMargins(0, ViewUtils.f(textView.getContext(), 7.0f), 0, 0);
        layoutParams2.addRule(17, R.id.v_left);
        textView.setLayoutParams(layoutParams2);
        textView.setGravity(17);
        textView.setTextSize(ViewUtils.g(textView.getContext(), 11.0f));
        setTvResult(textView);
        getTvResult().setTypeface(a.f71893a.a(a.f71895c));
        getTvResult().setTextColor(d.E(R.color.black));
        TextView textView2 = new TextView(getContext());
        textView2.setId(R.id.tv_time);
        RelativeLayout.LayoutParams layoutParams3 = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams3.addRule(8, R.id.v_left);
        layoutParams3.setMargins(0, 0, 0, ViewUtils.f(textView2.getContext(), 5.0f));
        layoutParams3.addRule(17, R.id.v_left);
        textView2.setLayoutParams(layoutParams3);
        textView2.setGravity(17);
        textView2.setTextSize(ViewUtils.g(textView2.getContext(), 8.0f));
        setTvTime(textView2);
        getTvTime().setTextColor(d.E(R.color.white_alpha50));
        addView(getViewLeft());
        addView(getTvResult());
        addView(getTvTime());
    }

    @dl.d
    public final TextView getTvResult() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37296, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87181c;
        if (textView != null) {
            return textView;
        }
        f0.S("tvResult");
        return null;
    }

    @dl.d
    public final TextView getTvTime() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37298, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f87182d;
        if (textView != null) {
            return textView;
        }
        f0.S("tvTime");
        return null;
    }

    @dl.d
    public final View getViewLeft() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 37294, new Class[0], View.class);
        if (patchProxyResultProxy.isSupported) {
            return (View) patchProxyResultProxy.result;
        }
        View view = this.f87180b;
        if (view != null) {
            return view;
        }
        f0.S("viewLeft");
        return null;
    }

    public final void setColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 37301, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getViewLeft().setBackground(q.B(getContext(), i10, 5.0f));
        getTvResult().setBackground(ViewUtils.G(ViewUtils.o(getContext(), getTvResult()), i10));
    }

    public final void setTime(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 37303, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTvTime().setText(str);
    }

    public final void setTvResult(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37297, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87181c = textView;
    }

    public final void setTvTime(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 37299, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f87182d = textView;
    }

    public final void setViewLeft(@dl.d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 37295, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "<set-?>");
        this.f87180b = view;
    }

    public final void setWin(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, 37302, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTvResult().setText(z10 ? "胜利" : "失败");
    }
}
