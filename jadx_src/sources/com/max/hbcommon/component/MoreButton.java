package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: compiled from: MoreButton.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class MoreButton extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f67147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ImageView f67148c;

    public MoreButton(@dl.e Context context) {
        this(context, null);
    }

    public MoreButton(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MoreButton(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public MoreButton(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        a(attributeSet);
    }

    private final void a(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.d.f31163cd, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        setOrientation(0);
        setGravity(17);
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.f66367b2);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.MoreButton_moreColor, getContext().getResources().getColor(R.color.text_secondary_1_color));
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.MoreButton_moreText);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.MoreButton_showMoreText, true);
        setTv_more(new TextView(getContext()));
        getTv_more().setTextSize(ViewUtils.g(getContext(), 12.0f));
        getTv_more().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        addView(getTv_more());
        this.f67148c = new ImageView(getContext());
        int iF = ViewUtils.f(getContext(), 12.0f);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        layoutParams.leftMargin = ViewUtils.f(getContext(), 2.0f);
        ImageView imageView = this.f67148c;
        View view = null;
        if (imageView == null) {
            kotlin.jvm.internal.f0.S("iv_more");
            imageView = null;
        }
        imageView.setImageResource(R.drawable.common_arrow_right_line_24x24);
        View view2 = this.f67148c;
        if (view2 == null) {
            kotlin.jvm.internal.f0.S("iv_more");
        } else {
            view = view2;
        }
        addView(view, layoutParams);
        setColor(color);
        setText(string);
        setTextVisible(z10);
    }

    @dl.d
    public final TextView getTv_more() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.f31117ad, new Class[0], TextView.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextView) patchProxyResultProxy.result;
        }
        TextView textView = this.f67147b;
        if (textView != null) {
            return textView;
        }
        kotlin.jvm.internal.f0.S("tv_more");
        return null;
    }

    public final void setArrowColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31210ed, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = this.f67148c;
        if (imageView == null) {
            kotlin.jvm.internal.f0.S("iv_more");
            imageView = null;
        }
        imageView.setColorFilter(i10);
    }

    @qa.a
    public final void setArrowVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31325jd, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        ImageView imageView = null;
        if (z10) {
            ImageView imageView2 = this.f67148c;
            if (imageView2 == null) {
                kotlin.jvm.internal.f0.S("iv_more");
            } else {
                imageView = imageView2;
            }
            imageView.setVisibility(0);
            return;
        }
        ImageView imageView3 = this.f67148c;
        if (imageView3 == null) {
            kotlin.jvm.internal.f0.S("iv_more");
        } else {
            imageView = imageView3;
        }
        imageView.setVisibility(8);
    }

    @qa.a(note = "设置文字以及箭头颜色")
    public final void setColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31187dd, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_more().setTextColor(i10);
        ImageView imageView = this.f67148c;
        if (imageView == null) {
            kotlin.jvm.internal.f0.S("iv_more");
            imageView = null;
        }
        imageView.setColorFilter(i10);
    }

    @qa.a
    public final void setText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.f31256gd, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        getTv_more().setText(str);
    }

    public final void setTextColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.f31233fd, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        getTv_more().setTextColor(i10);
    }

    public final void setTextFontBold(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31279hd, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            getTv_more().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
        } else {
            getTv_more().setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
        }
    }

    @qa.a
    public final void setTextVisible(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.f31302id, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            getTv_more().setVisibility(0);
        } else {
            getTv_more().setVisibility(8);
        }
    }

    public final void setTv_more(@dl.d TextView textView) {
        if (PatchProxy.proxy(new Object[]{textView}, this, changeQuickRedirect, false, bb.c.d.f31140bd, new Class[]{TextView.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(textView, "<set-?>");
        this.f67147b = textView;
    }
}
