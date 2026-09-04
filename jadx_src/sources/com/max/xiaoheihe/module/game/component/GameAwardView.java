package com.max.xiaoheihe.module.game.component;

import android.content.Context;
import android.util.AttributeSet;
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

/* JADX INFO: compiled from: GameAwardView.kt */
/* JADX INFO: loaded from: classes11.dex */
@o(parameters = 0)
public final class GameAwardView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f86632d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f86633b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f86634c;

    public GameAwardView(@e Context context) {
        this(context, null);
    }

    public GameAwardView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GameAwardView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public GameAwardView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36372, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(17);
        int iF = ViewUtils.f(getContext(), 31.0f);
        int iF2 = ViewUtils.f(getContext(), 13.0f);
        ImageView imageView = new ImageView(getContext());
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF2, iF);
        imageView.setImageResource(R.drawable.game_awards_left_13x31);
        addView(imageView, layoutParams);
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        addView(linearLayout, new LinearLayout.LayoutParams(-2, -2));
        setTv_award_time(new TextView(getContext()));
        getTv_award_time().setMaxLines(1);
        getTv_award_time().setIncludeFontPadding(false);
        getTv_award_time().setGravity(17);
        getTv_award_time().setTextSize(1, 10.0f);
        getTv_award_time().setTextColor(getContext().getResources().getColor(R.color.divider_color));
        linearLayout.addView(getTv_award_time(), new LinearLayout.LayoutParams(-2, ViewUtils.f(getContext(), 14.0f)));
        setTv_award_name(new TextView(getContext()));
        getTv_award_name().setMaxLines(1);
        getTv_award_name().setIncludeFontPadding(false);
        getTv_award_name().setGravity(17);
        getTv_award_name().setTextSize(1, 12.0f);
        getTv_award_name().setTextColor(getContext().getResources().getColor(R.color.white));
        linearLayout.addView(getTv_award_name(), new LinearLayout.LayoutParams(-2, ViewUtils.f(getContext(), 17.0f)));
        ImageView imageView2 = new ImageView(getContext());
        ViewGroup.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(iF2, iF);
        imageView2.setImageResource(R.drawable.game_awards_right_13x31);
        addView(imageView2, layoutParams2);
    }

    @d
    public final TextView getTv_award_name() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36370, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86634c;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_award_name");
        return null;
    }

    @d
    public final TextView getTv_award_time() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 36368, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f86633b;
        if (textView != null) {
            return textView;
        }
        f0.S("tv_award_time");
        return null;
    }

    public final void setAwardName(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36374, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_award_name().setText(str);
    }

    public final void setAwardTime(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 36373, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_award_time().setText(str);
    }

    public final void setTv_award_name(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36371, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86634c = textView;
    }

    public final void setTv_award_time(@d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, 36369, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(textView, "<set-?>");
        this.f86633b = textView;
    }
}
