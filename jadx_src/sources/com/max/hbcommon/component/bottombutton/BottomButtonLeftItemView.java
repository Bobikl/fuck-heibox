package com.max.hbcommon.component.bottombutton;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bb.c;
import com.max.hbcommon.R;
import com.max.hbcommon.component.bottombutton.BottomButtonLeftItemView;
import com.max.hbcommon.component.bottombutton.base.BaseBottomButton;
import com.max.hbutils.utils.ViewUtils;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: BottomButtonLeftItemView.kt */
/* JADX INFO: loaded from: classes9.dex */
public final class BottomButtonLeftItemView extends LinearLayout {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @e
    private ViewGroup f67204b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @e
    private TextView f67205c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private ImageView f67206d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @e
    private BaseBottomButton f67207e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @e
    private BaseBottomButton f67208f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @e
    private LinearLayout f67209g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @e
    private View f67210h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f67211i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @e
    private a f67212j;

    /* JADX INFO: compiled from: BottomButtonLeftItemView.kt */
    public interface a {
        void a(boolean z10);
    }

    public BottomButtonLeftItemView(@e Context context) {
        this(context, null);
    }

    public BottomButtonLeftItemView(@e Context context, @e AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public BottomButtonLeftItemView(@e Context context, @e AttributeSet attributeSet, int i10) {
        this(context, attributeSet, i10, 0);
    }

    public BottomButtonLeftItemView(@e Context context, @e AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        d(attributeSet);
    }

    private final void d(AttributeSet attributeSet) {
        BaseBottomButton baseBottomButton;
        BaseBottomButton baseBottomButton2;
        BaseBottomButton baseBottomButton3;
        BaseBottomButton baseBottomButton4;
        BaseBottomButton baseBottomButton5;
        BaseBottomButton baseBottomButton6;
        BaseBottomButton baseBottomButton7;
        BaseBottomButton baseBottomButton8;
        BaseBottomButton baseBottomButton9;
        BaseBottomButton baseBottomButton10;
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, c.d.f31144bh, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.G);
        f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(...)");
        int color = typedArrayObtainStyledAttributes.getColor(R.styleable.BottomButtonLeftItemView_leftTextColor, -1);
        int color2 = typedArrayObtainStyledAttributes.getColor(R.styleable.BottomButtonLeftItemView_rightTextColor, -1);
        int color3 = typedArrayObtainStyledAttributes.getColor(R.styleable.BottomButtonLeftItemView_leftIconColor, -1);
        int color4 = typedArrayObtainStyledAttributes.getColor(R.styleable.BottomButtonLeftItemView_rightIconColor, -1);
        CharSequence text = typedArrayObtainStyledAttributes.getText(R.styleable.BottomButtonLeftItemView_leftText);
        CharSequence text2 = typedArrayObtainStyledAttributes.getText(R.styleable.BottomButtonLeftItemView_rightText);
        boolean z10 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomButtonLeftItemView_boldleft, false);
        boolean z11 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomButtonLeftItemView_boldright, false);
        CharSequence text3 = typedArrayObtainStyledAttributes.getText(R.styleable.BottomButtonLeftItemView_checkboxText);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BottomButtonLeftItemView_leftBackground, -1);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BottomButtonLeftItemView_rightBackground, -1);
        boolean z12 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomButtonLeftItemView_isShowLeftIcon, false);
        boolean z13 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomButtonLeftItemView_isShowRightIcon, false);
        boolean z14 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomButtonLeftItemView_isShowCheckbox, false);
        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BottomButtonLeftItemView_leftIcon, -1);
        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(R.styleable.BottomButtonLeftItemView_rightIcon, -1);
        boolean z15 = typedArrayObtainStyledAttributes.getBoolean(R.styleable.BottomButtonLeftItemView_isShowLeftButton, true);
        int i10 = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomButtonLeftItemView_leftButtonStyle, -1);
        int i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.BottomButtonLeftItemView_rightButtonStyle, -1);
        LayoutInflater.from(getContext()).inflate(R.layout.layout_left_check_box_bottom_double_button, this);
        this.f67204b = (ViewGroup) findViewById(R.id.vg_checkbox);
        this.f67205c = (TextView) findViewById(R.id.tv_checkbox);
        this.f67206d = (ImageView) findViewById(R.id.iv_cb);
        this.f67207e = (BaseBottomButton) findViewById(R.id.button_left);
        this.f67208f = (BaseBottomButton) findViewById(R.id.button_right);
        this.f67209g = (LinearLayout) findViewById(R.id.ll_left_view);
        this.f67210h = findViewById(R.id.view_between_button);
        if (color3 != -1 && (baseBottomButton10 = this.f67207e) != null) {
            baseBottomButton10.setIconColor(color3);
        }
        if (color4 != -1 && (baseBottomButton9 = this.f67208f) != null) {
            baseBottomButton9.setIconColor(color4);
        }
        TextView textView = this.f67205c;
        if (textView != null) {
            textView.setText(text3);
        }
        if (z14) {
            ViewGroup viewGroup = this.f67204b;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
            }
        } else {
            ViewGroup viewGroup2 = this.f67204b;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(8);
            }
        }
        if (text != null && !com.max.hbcommon.utils.c.u(text.toString()) && (baseBottomButton8 = this.f67207e) != null) {
            baseBottomButton8.setText(text.toString());
        }
        if (z10) {
            BaseBottomButton baseBottomButton11 = this.f67207e;
            if (baseBottomButton11 != null) {
                baseBottomButton11.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            }
        } else {
            BaseBottomButton baseBottomButton12 = this.f67207e;
            if (baseBottomButton12 != null) {
                baseBottomButton12.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            }
        }
        if (z11) {
            BaseBottomButton baseBottomButton13 = this.f67208f;
            if (baseBottomButton13 != null) {
                baseBottomButton13.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71895c));
            }
        } else {
            BaseBottomButton baseBottomButton14 = this.f67208f;
            if (baseBottomButton14 != null) {
                baseBottomButton14.setTypeface(com.max.hbresource.a.f71893a.a(com.max.hbresource.a.f71894b));
            }
        }
        if (color != -1 && (baseBottomButton7 = this.f67207e) != null) {
            baseBottomButton7.setTextColor(color);
        }
        if (resourceId != -1 && (baseBottomButton6 = this.f67207e) != null) {
            baseBottomButton6.setBackgroundResource(resourceId);
        }
        BaseBottomButton baseBottomButton15 = this.f67207e;
        if (baseBottomButton15 != null) {
            baseBottomButton15.setIconVisible(z12);
        }
        if (resourceId3 != -1) {
            BaseBottomButton baseBottomButton16 = this.f67207e;
            if (baseBottomButton16 != null) {
                baseBottomButton16.setIcon(resourceId3);
            }
            BaseBottomButton baseBottomButton17 = this.f67207e;
            if (baseBottomButton17 != null) {
                baseBottomButton17.setIconVisible(true);
            }
        }
        if (text2 != null && !com.max.hbcommon.utils.c.u(text2.toString()) && (baseBottomButton5 = this.f67208f) != null) {
            baseBottomButton5.setText(text2.toString());
        }
        if (color2 != -1 && (baseBottomButton4 = this.f67208f) != null) {
            baseBottomButton4.setTextColor(color2);
        }
        if (resourceId2 != -1 && (baseBottomButton3 = this.f67208f) != null) {
            baseBottomButton3.setBackgroundResource(resourceId2);
        }
        BaseBottomButton baseBottomButton18 = this.f67208f;
        if (baseBottomButton18 != null) {
            baseBottomButton18.setIconVisible(z13);
        }
        if (resourceId4 != -1) {
            BaseBottomButton baseBottomButton19 = this.f67208f;
            if (baseBottomButton19 != null) {
                baseBottomButton19.setIcon(resourceId4);
            }
            BaseBottomButton baseBottomButton20 = this.f67208f;
            if (baseBottomButton20 != null) {
                baseBottomButton20.setIconVisible(true);
            }
        }
        setShowLeftButton(z15);
        if (i10 != -1 && (baseBottomButton2 = this.f67207e) != null) {
            baseBottomButton2.setButtonStyle(i10);
        }
        if (i11 == -1 || (baseBottomButton = this.f67208f) == null) {
            return;
        }
        baseBottomButton.setButtonStyle(i11);
    }

    private final void f() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Dh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        if (e()) {
            TextView textView = this.f67205c;
            if (textView != null) {
                textView.setTextColor(getContext().getResources().getColor(R.color.text_primary_1_color));
            }
            ImageView imageView = this.f67206d;
            if (imageView != null) {
                imageView.setBackgroundResource(R.drawable.account_cb_checked_16_16x16);
                return;
            }
            return;
        }
        TextView textView2 = this.f67205c;
        if (textView2 != null) {
            textView2.setTextColor(getContext().getResources().getColor(R.color.text_primary_2_color));
        }
        ImageView imageView2 = this.f67206d;
        if (imageView2 != null) {
            imageView2.setBackgroundResource(R.drawable.common_cb_unchecked);
        }
    }

    private final void g() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.f31214eh, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BaseBottomButton baseBottomButton = this.f67207e;
        if (baseBottomButton != null && baseBottomButton.getVisibility() == 0) {
            BaseBottomButton baseBottomButton2 = this.f67208f;
            if (baseBottomButton2 != null && baseBottomButton2.getVisibility() == 0) {
                View view = this.f67210h;
                if (view == null) {
                    return;
                }
                view.setVisibility(0);
                return;
            }
        }
        View view2 = this.f67210h;
        if (view2 == null) {
            return;
        }
        view2.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(BottomButtonLeftItemView this$0, View view) {
        if (PatchProxy.proxy(new Object[]{this$0, view}, null, changeQuickRedirect, true, c.d.Ph, new Class[]{BottomButtonLeftItemView.class, View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(this$0, "this$0");
        boolean z10 = !this$0.f67211i;
        this$0.f67211i = z10;
        this$0.setChecked(z10);
    }

    public final void b(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 3002, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        LinearLayout linearLayout = this.f67209g;
        if (linearLayout != null) {
            linearLayout.addView(view);
        }
    }

    public final void c(@d View view, int i10) {
        if (PatchProxy.proxy(new Object[]{view, new Integer(i10)}, this, changeQuickRedirect, false, 3003, new Class[]{View.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        LinearLayout linearLayout = this.f67209g;
        if (linearLayout != null) {
            linearLayout.addView(view, i10);
        }
    }

    public final boolean e() {
        return this.f67211i;
    }

    @e
    public final BaseBottomButton getLeftButton() {
        return this.f67207e;
    }

    @e
    public final LinearLayout getLeftView() {
        return this.f67209g;
    }

    @e
    public final BaseBottomButton getRightbutton() {
        return this.f67208f;
    }

    public final void h() {
        LinearLayout linearLayout;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3005, new Class[0], Void.TYPE).isSupported || (linearLayout = this.f67209g) == null) {
            return;
        }
        linearLayout.removeAllViews();
    }

    public final void i(@d View view) {
        if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, 3004, new Class[]{View.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(view, "view");
        LinearLayout linearLayout = this.f67209g;
        if (linearLayout != null) {
            linearLayout.removeView(view);
        }
    }

    @qa.a(note = "设置是否显示选择框")
    public final void k(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.Eh, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            ViewGroup viewGroup = this.f67204b;
            if (viewGroup == null) {
                return;
            }
            viewGroup.setVisibility(0);
            return;
        }
        ViewGroup viewGroup2 = this.f67204b;
        if (viewGroup2 == null) {
            return;
        }
        viewGroup2.setVisibility(8);
    }

    public final void setCheckboxInvisiable() {
        ViewGroup viewGroup;
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.d.Fh, new Class[0], Void.TYPE).isSupported || (viewGroup = this.f67204b) == null) {
            return;
        }
        viewGroup.setVisibility(4);
    }

    public final void setCheckboxListener(@d a clickListener) {
        if (PatchProxy.proxy(new Object[]{clickListener}, this, changeQuickRedirect, false, c.d.Ah, new Class[]{a.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(clickListener, "clickListener");
        this.f67212j = clickListener;
        ViewGroup viewGroup = this.f67204b;
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new View.OnClickListener() { // from class: eb.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    BottomButtonLeftItemView.j(this.f118610b, view);
                }
            });
        }
    }

    public final void setCheckboxText(@e String str) {
        TextView textView;
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, c.d.f31644xh, new Class[]{String.class}, Void.TYPE).isSupported || (textView = this.f67205c) == null) {
            return;
        }
        textView.setText(str);
    }

    public final void setChecked(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.Bh, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        setChecked(z10, true);
    }

    public final void setChecked(boolean z10, boolean z11) {
        a aVar;
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, c.d.Ch, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        this.f67211i = z10;
        f();
        if (!z11 || (aVar = this.f67212j) == null) {
            return;
        }
        aVar.a(this.f67211i);
    }

    public final void setLeftBackground(@d Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.d.f31329jh, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(drawable, "drawable");
        BaseBottomButton baseBottomButton = this.f67207e;
        if (baseBottomButton == null) {
            return;
        }
        baseBottomButton.setBackground(drawable);
    }

    public final void setLeftButtonClickable(boolean z10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.f31421nh, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67207e) == null) {
            return;
        }
        baseBottomButton.setClickable(z10);
    }

    public final void setLeftButtonEnabled(boolean z10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.f31237fh, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67207e) == null) {
            return;
        }
        baseBottomButton.setEnabled(z10);
    }

    @qa.a(note = "设置左按钮的style 0-7")
    public final void setLeftButtonStyle(int i10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.Hh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67207e) == null) {
            return;
        }
        baseBottomButton.setButtonStyle(i10);
    }

    public final void setLeftButtonStyle(@d BaseBottomButton.BaseBottomButtonStyle style) {
        if (PatchProxy.proxy(new Object[]{style}, this, changeQuickRedirect, false, c.d.Gh, new Class[]{BaseBottomButton.BaseBottomButtonStyle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(style, "style");
        BaseBottomButton baseBottomButton = this.f67207e;
        if (baseBottomButton != null) {
            baseBottomButton.setButtonStyle(style);
        }
    }

    public final void setLeftClickListener(@e View.OnClickListener onClickListener) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, c.d.f31375lh, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported || (baseBottomButton = this.f67207e) == null) {
            return;
        }
        baseBottomButton.setOnClickListener(onClickListener);
    }

    public final void setLeftIcon(@d Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.d.f31556th, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(drawable, "drawable");
        BaseBottomButton baseBottomButton = this.f67207e;
        if (baseBottomButton != null) {
            baseBottomButton.setIcon(drawable);
        }
    }

    public final void setLeftIconColor(int i10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.f31666yh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67207e) == null) {
            return;
        }
        baseBottomButton.setIconColor(i10);
    }

    @qa.a(note = "设置左按钮图标是否显示")
    public final void setLeftIconVisible(boolean z10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.f31283hh, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67207e) == null) {
            return;
        }
        baseBottomButton.setIconVisible(z10);
    }

    @qa.a(note = "设置左按钮文字")
    public final void setLeftText(@e CharSequence charSequence) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, c.d.f31467ph, new Class[]{CharSequence.class}, Void.TYPE).isSupported || (baseBottomButton = this.f67207e) == null) {
            return;
        }
        baseBottomButton.setText(charSequence);
    }

    public final void setLeftTextColor(int i10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.f31600vh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67207e) == null) {
            return;
        }
        baseBottomButton.setTextColor(i10);
    }

    public final void setLeftTypeface(@e Typeface typeface) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, c.d.f31512rh, new Class[]{Typeface.class}, Void.TYPE).isSupported || (baseBottomButton = this.f67207e) == null) {
            return;
        }
        baseBottomButton.setTypeface(typeface);
    }

    public final void setRightBackground(@d Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.d.f31352kh, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(drawable, "drawable");
        BaseBottomButton baseBottomButton = this.f67208f;
        if (baseBottomButton == null) {
            return;
        }
        baseBottomButton.setBackground(drawable);
    }

    public final void setRightButtonClickable(boolean z10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.f31444oh, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67208f) == null) {
            return;
        }
        baseBottomButton.setClickable(z10);
    }

    public final void setRightButtonEnabled(boolean z10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.f31260gh, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67208f) == null) {
            return;
        }
        baseBottomButton.setEnabled(z10);
    }

    public final void setRightButtonFixWidth() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 3001, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        BaseBottomButton baseBottomButton = this.f67208f;
        ViewGroup.LayoutParams layoutParams = baseBottomButton != null ? baseBottomButton.getLayoutParams() : null;
        f0.n(layoutParams, "null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
        LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
        layoutParams2.width = ViewUtils.f(getContext(), 140.0f);
        layoutParams2.weight = 0.0f;
    }

    @qa.a(note = "设置右按钮的style 0-7")
    public final void setRightButtonStyle(int i10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 3000, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67208f) == null) {
            return;
        }
        baseBottomButton.setButtonStyle(i10);
    }

    public final void setRightButtonStyle(@d BaseBottomButton.BaseBottomButtonStyle style) {
        if (PatchProxy.proxy(new Object[]{style}, this, changeQuickRedirect, false, c.d.Ih, new Class[]{BaseBottomButton.BaseBottomButtonStyle.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(style, "style");
        BaseBottomButton baseBottomButton = this.f67208f;
        if (baseBottomButton != null) {
            baseBottomButton.setButtonStyle(style);
        }
    }

    public final void setRightClickListener(@e View.OnClickListener onClickListener) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{onClickListener}, this, changeQuickRedirect, false, c.d.f31398mh, new Class[]{View.OnClickListener.class}, Void.TYPE).isSupported || (baseBottomButton = this.f67208f) == null) {
            return;
        }
        baseBottomButton.setOnClickListener(onClickListener);
    }

    public final void setRightIcon(@d Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, c.d.f31578uh, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(drawable, "drawable");
        BaseBottomButton baseBottomButton = this.f67208f;
        if (baseBottomButton != null) {
            baseBottomButton.setIcon(drawable);
        }
    }

    public final void setRightIconColor(int i10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.f31688zh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67208f) == null) {
            return;
        }
        baseBottomButton.setIconColor(i10);
    }

    @qa.a(note = "设置右按钮图标是否显示")
    public final void setRightIconVisible(boolean z10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.f31305ih, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67208f) == null) {
            return;
        }
        baseBottomButton.setIconVisible(z10);
    }

    @qa.a(note = "设置右按钮文字")
    public final void setRightText(@e CharSequence charSequence) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{charSequence}, this, changeQuickRedirect, false, c.d.f31490qh, new Class[]{CharSequence.class}, Void.TYPE).isSupported || (baseBottomButton = this.f67208f) == null) {
            return;
        }
        baseBottomButton.setText(charSequence);
    }

    public final void setRightTextColor(int i10) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, c.d.f31622wh, new Class[]{Integer.TYPE}, Void.TYPE).isSupported || (baseBottomButton = this.f67208f) == null) {
            return;
        }
        baseBottomButton.setTextColor(i10);
    }

    public final void setRightTypeface(@e Typeface typeface) {
        BaseBottomButton baseBottomButton;
        if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, c.d.f31534sh, new Class[]{Typeface.class}, Void.TYPE).isSupported || (baseBottomButton = this.f67208f) == null) {
            return;
        }
        baseBottomButton.setTypeface(typeface);
    }

    @qa.a(note = "设置是否显示左侧按钮")
    public final void setShowLeftButton(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.f31167ch, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            BaseBottomButton baseBottomButton = this.f67207e;
            if (baseBottomButton != null) {
                baseBottomButton.setVisibility(0);
            }
        } else {
            BaseBottomButton baseBottomButton2 = this.f67207e;
            if (baseBottomButton2 != null) {
                baseBottomButton2.setVisibility(8);
            }
        }
        g();
    }

    @qa.a(note = "设置是否显示右侧按钮")
    public final void setShowRightButton(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, c.d.f31191dh, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (z10) {
            BaseBottomButton baseBottomButton = this.f67208f;
            if (baseBottomButton != null) {
                baseBottomButton.setVisibility(0);
            }
        } else {
            BaseBottomButton baseBottomButton2 = this.f67208f;
            if (baseBottomButton2 != null) {
                baseBottomButton2.setVisibility(8);
            }
        }
        g();
    }
}
