package com.max.xiaoheihe.module.expression.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;
import com.max.hbcustomview.HBLineHeightTextView;
import com.max.hbutils.utils.ViewUtils;
import com.max.xiaoheihe.R;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class ExpressionTextView extends HBLineHeightTextView {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f83615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f83616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f83617f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SpannableString f83618g;

    public class a implements View.OnTouchListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view, motionEvent}, this, changeQuickRedirect, false, 31520, new Class[]{View.class, MotionEvent.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            TextView textView = (TextView) view;
            Spannable spannableNewSpannable = Spannable.Factory.getInstance().newSpannable(textView.getText());
            int action = motionEvent.getAction();
            if (action != 1 && action != 0) {
                return false;
            }
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            int totalPaddingLeft = x10 - textView.getTotalPaddingLeft();
            int totalPaddingTop = y10 - textView.getTotalPaddingTop();
            int scrollX = totalPaddingLeft + textView.getScrollX();
            int scrollY = totalPaddingTop + textView.getScrollY();
            Layout layout = textView.getLayout();
            int offsetForHorizontal = layout.getOffsetForHorizontal(layout.getLineForVertical(scrollY), scrollX);
            ClickableSpan[] clickableSpanArr = (ClickableSpan[]) spannableNewSpannable.getSpans(offsetForHorizontal, offsetForHorizontal, ClickableSpan.class);
            if (clickableSpanArr.length == 0) {
                return false;
            }
            if (action == 1) {
                clickableSpanArr[0].onClick(textView);
            }
            return true;
        }
    }

    public ExpressionTextView(Context context) {
        super(context);
        this.f83616e = true;
        this.f83617f = true;
        h(null);
    }

    public ExpressionTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f83616e = true;
        this.f83617f = true;
        h(attributeSet);
    }

    public ExpressionTextView(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f83616e = true;
        this.f83617f = true;
        h(attributeSet);
    }

    private void h(AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{attributeSet}, this, changeQuickRedirect, false, 31516, new Class[]{AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        if (attributeSet == null) {
            this.f83615d = (int) getTextSize();
        } else {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.O0);
            this.f83615d = (int) typedArrayObtainStyledAttributes.getDimension(8, getTextSize());
            typedArrayObtainStyledAttributes.recycle();
        }
        setText(getText());
        if (this.f83616e) {
            setOnTouchListener(new a());
        }
    }

    public void setClickableAt(boolean z10) {
        this.f83617f = z10;
    }

    public void setExpressionSize(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, 31519, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f83615d = i10;
        super.setText(getText());
    }

    public void setShowAt(boolean z10) {
        this.f83616e = z10;
    }

    public void setSpannableString(SpannableString spannableString) {
        this.f83618g = spannableString;
    }

    @Override // com.max.hbcustomview.HBLineHeightTextView, android.widget.TextView
    public void setText(CharSequence charSequence, TextView.BufferType bufferType) {
        if (PatchProxy.proxy(new Object[]{charSequence, bufferType}, this, changeQuickRedirect, false, 31518, new Class[]{CharSequence.class, TextView.BufferType.class}, Void.TYPE).isSupported) {
            return;
        }
        if (!TextUtils.isEmpty(charSequence) && this.f83618g == null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
            com.max.xiaoheihe.module.expression.core.a.g(getContext(), spannableStringBuilder, this.f83615d, this.f83616e, true, true, this.f83617f, this);
            charSequence = spannableStringBuilder;
        } else if (this.f83618g != null) {
            com.max.xiaoheihe.module.expression.core.a.g(getContext(), this.f83618g, this.f83615d, this.f83616e, true, true, this.f83617f, this);
            charSequence = this.f83618g;
        }
        super.setText(charSequence, bufferType);
    }

    @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView
    public void setTextSize(int i10, float f10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10), new Float(f10)}, this, changeQuickRedirect, false, 31517, new Class[]{Integer.TYPE, Float.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (i10 == 0) {
            this.f83615d = (int) f10;
        } else {
            this.f83615d = ViewUtils.f(getContext(), f10);
        }
        super.setTextSize(i10, f10);
    }
}
