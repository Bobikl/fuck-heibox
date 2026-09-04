package com.max.hbcommon.component;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.max.hbcommon.R;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;

/* JADX INFO: compiled from: FloatingButton.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class FloatingButton extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ImageView f67004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private TextView f67005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f67006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f67007e;

    public FloatingButton(@dl.e Context context) {
        this(context, null);
    }

    public FloatingButton(@dl.e Context context, @dl.e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FloatingButton(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public FloatingButton(@dl.e Context context, @dl.e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f67007e = R.color.text_primary_1_color_alpha90;
        a();
        b(attributeSet);
    }

    private final void a() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.d.K7, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        setOrientation(1);
        setGravity(17);
        this.f67004b = new ImageView(getContext());
        int iF = ViewUtils.f(getContext(), 32.0f);
        ViewGroup.LayoutParams layoutParams = new LinearLayout.LayoutParams(iF, iF);
        ImageView imageView = this.f67004b;
        View view = null;
        if (imageView == null) {
            kotlin.jvm.internal.f0.S("iv_icon");
            imageView = null;
        }
        Resources resources = getContext().getResources();
        int i10 = R.color.background_layer_2_color;
        imageView.setColorFilter(resources.getColor(i10));
        ImageView imageView2 = this.f67004b;
        if (imageView2 == null) {
            kotlin.jvm.internal.f0.S("iv_icon");
            imageView2 = null;
        }
        imageView2.setImageResource(R.drawable.special_add_small_line_24x24);
        View view2 = this.f67004b;
        if (view2 == null) {
            kotlin.jvm.internal.f0.S("iv_icon");
            view2 = null;
        }
        addView(view2, layoutParams);
        TextView textView = new TextView(getContext());
        this.f67005c = textView;
        textView.setTextColor(getContext().getResources().getColor(i10));
        TextView textView2 = this.f67005c;
        if (textView2 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView2 = null;
        }
        textView2.setTextSize(1, 10.0f);
        TextView textView3 = this.f67005c;
        if (textView3 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView3 = null;
        }
        textView3.setGravity(17);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, ViewUtils.f(getContext(), 14.0f));
        layoutParams2.topMargin = -ViewUtils.f(getContext(), 3.0f);
        View view3 = this.f67005c;
        if (view3 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
        } else {
            view = view3;
        }
        addView(view, layoutParams2);
    }

    private final void b(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, bb.c.d.L7, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.I0);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.FloatingButton_fbIcon, R.drawable.special_add_small_line_24x24);
        String string = typedArrayObtainStyledAttributes.getString(R.styleable.FloatingButton_fbText);
        ImageView imageView = this.f67004b;
        TextView textView = null;
        if (imageView == null) {
            kotlin.jvm.internal.f0.S("iv_icon");
            imageView = null;
        }
        imageView.setImageResource(resourceId);
        if (string == null) {
            string = getContext().getResources().getString(R.string.post);
        }
        TextView textView2 = this.f67005c;
        if (textView2 == null) {
            kotlin.jvm.internal.f0.S("tv_text");
        } else {
            textView = textView2;
        }
        textView.setText(string);
        c(typedArrayObtainStyledAttributes.getBoolean(R.styleable.FloatingButton_fbShowText, true));
    }

    public final void c(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.d.Q7, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f67005c;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView = null;
        }
        textView.setVisibility(z10 ? 0 : 8);
    }

    public final int getBgColorId() {
        return this.f67007e;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        float f10;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.d.M7, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onMeasure(i10, i11);
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode == 1073741824 && mode2 == 1073741824) {
            if (size <= size2) {
                f10 = size2;
            }
            this.f67006d = f10;
            setMeasuredDimension((int) f10, (int) f10);
            setBackground(com.max.hbutils.utils.q.o(getContext(), this.f67007e, this.f67006d / 2));
        }
        size = ViewUtils.f(getContext(), 54.0f);
        f10 = size;
        this.f67006d = f10;
        setMeasuredDimension((int) f10, (int) f10);
        setBackground(com.max.hbutils.utils.q.o(getContext(), this.f67007e, this.f67006d / 2));
    }

    public final void setBgColorId(int i10) {
        this.f67007e = i10;
    }

    public final void setColor(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.R7, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f67005c;
        ImageView imageView = null;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView = null;
        }
        textView.setTextColor(i10);
        ImageView imageView2 = this.f67004b;
        if (imageView2 == null) {
            kotlin.jvm.internal.f0.S("iv_icon");
        } else {
            imageView = imageView2;
        }
        imageView.setColorFilter(i10);
    }

    public final void setIcon(@dl.d Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.d.P7, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        kotlin.jvm.internal.f0.p(drawable, "drawable");
        ImageView imageView = this.f67004b;
        if (imageView == null) {
            kotlin.jvm.internal.f0.S("iv_icon");
            imageView = null;
        }
        imageView.setImageDrawable(drawable);
    }

    public final void setText(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.d.O7, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f67005c;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView = null;
        }
        textView.setText(i10);
    }

    public final void setText(@dl.e String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.d.N7, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        TextView textView = this.f67005c;
        if (textView == null) {
            kotlin.jvm.internal.f0.S("tv_text");
            textView = null;
        }
        textView.setText(str);
    }
}
