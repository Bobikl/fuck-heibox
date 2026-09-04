package com.max.hbcommon.component;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: CheckButtonView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class CheckButtonView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private TextView f66964b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f66965c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f66966d;

    public CheckButtonView(@dl.e Context context) {
        this(context, null);
    }

    public CheckButtonView(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CheckButtonView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public CheckButtonView(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        b();
    }

    private final void b() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31501r6, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(17);
        this.f66965c = new ImageView(getContext());
        int iF = ViewUtils.f(getContext(), 16.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.rightMargin = ViewUtils.f(getContext(), 12.0f);
        View view = this.f66965c;
        View view2 = null;
        if (view == null) {
            kotlin.jvm.internal.f0.S("iv_check");
            view = null;
        }
        addView(view, layoutParams);
        TextView textView = new TextView(getContext());
        this.f66964b = textView;
        textView.setTextSize(1, 14.0f);
        TextView textView2 = this.f66964b;
        if (textView2 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView2 = null;
        }
        textView2.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
        TextView textView3 = this.f66964b;
        if (textView3 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView3 = null;
        }
        textView3.setEllipsize(TextUtils.TruncateAt.END);
        TextView textView4 = this.f66964b;
        if (textView4 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView4 = null;
        }
        textView4.setMaxLines(1);
        View view3 = this.f66964b;
        if (view3 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
        } else {
            view2 = view3;
        }
        addView(view2);
        setOnClickListener(new View.OnClickListener() { // from class: com.max.hbcommon.component.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                CheckButtonView.c(this.f67199b, view4);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(CheckButtonView this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, bb.c.d.f31567u6, new Class[]{CheckButtonView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(this$0, "this$0");
        this$0.setChecked(!this$0.f66966d);
    }

    public final boolean d() {
        return this.f66966d;
    }

    public final void setChecked(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31523s6, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f66966d = z10;
        ImageView imageView = this.f66965c;
        if (imageView == null) {
            kotlin.jvm.internal.f0.S("iv_check");
            imageView = null;
        }
        imageView.setImageResource(z10 ? R.drawable.account_cb_checked_16_16x16 : R.drawable.common_cb_unchecked);
    }

    public final void setText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.f31545t6, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f66964b;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView = null;
        }
        textView.setText(str);
    }
}
