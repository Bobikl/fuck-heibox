package com.max.xiaoheihe.module.bbs.component;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.o;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BBSLinkListTopView.kt */
/* JADX INFO: loaded from: classes10.dex */
@o(parameters = 0)
public final class BBSLinkListTopView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f80810d = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f80811b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f80812c;

    public BBSLinkListTopView(@e Context context) {
        this(context, null);
    }

    public BBSLinkListTopView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BBSLinkListTopView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BBSLinkListTopView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a();
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 27614, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(16);
        int iF = ViewUtils.f(getContext(), 12.0f);
        setPadding(iF, 0, iF, 0);
        TextView textView = new TextView(getContext());
        this.f80811b = textView;
        textView.setText(R.string.post_stick_tag);
        TextView textView2 = this.f80811b;
        View view = null;
        if (textView2 == null) {
            f0.S("tv_top");
            textView2 = null;
        }
        textView2.setTextSize(1, 9.0f);
        TextView textView3 = this.f80811b;
        if (textView3 == null) {
            f0.S("tv_top");
            textView3 = null;
        }
        textView3.setGravity(17);
        TextView textView4 = this.f80811b;
        if (textView4 == null) {
            f0.S("tv_top");
            textView4 = null;
        }
        textView4.setTextColor(getContext().getResources().getColor(R.color.white));
        TextView textView5 = this.f80811b;
        if (textView5 == null) {
            f0.S("tv_top");
            textView5 = null;
        }
        textView5.setBackgroundResource(R.drawable.text_primary_1dp);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(ViewUtils.f(getContext(), 26.0f), ViewUtils.f(getContext(), 14.0f));
        View view2 = this.f80811b;
        if (view2 == null) {
            f0.S("tv_top");
            view2 = null;
        }
        addView(view2, layoutParams);
        TextView textView6 = new TextView(getContext());
        this.f80812c = textView6;
        textView6.setTextSize(1, 14.0f);
        TextView textView7 = this.f80812c;
        if (textView7 == null) {
            f0.S("tv_title");
            textView7 = null;
        }
        textView7.setMaxLines(1);
        TextView textView8 = this.f80812c;
        if (textView8 == null) {
            f0.S("tv_title");
            textView8 = null;
        }
        textView8.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        TextView textView9 = this.f80812c;
        if (textView9 == null) {
            f0.S("tv_title");
            textView9 = null;
        }
        textView9.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        TextView textView10 = this.f80812c;
        if (textView10 == null) {
            f0.S("tv_title");
            textView10 = null;
        }
        textView10.setEllipsize(TextUtils.TruncateAt.END);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
        layoutParams2.leftMargin = ViewUtils.f(getContext(), 6.0f);
        View view3 = this.f80812c;
        if (view3 == null) {
            f0.S("tv_title");
        } else {
            view = view3;
        }
        addView(view, layoutParams2);
    }

    public final void setTitle(@e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 27615, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f80812c;
        if (textView == null) {
            f0.S("tv_title");
            textView = null;
        }
        textView.setText(str);
    }
}
