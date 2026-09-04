package com.max.hbcustomview;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.OvershootInterpolator;
import android.view.inputmethod.InputMethodManager;
import androidx.annotation.p0;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.core.view.j1;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;

/* JADX INFO: loaded from: classes10.dex */
public class PinEntryEditText extends AppCompatEditText {
    private static final String J = "http://schemas.android.com/apk/res/android";
    public static final String K = "●";
    public static ChangeQuickRedirect changeQuickRedirect;
    protected float A;
    protected float B;
    protected Paint C;
    protected boolean D;
    protected boolean E;
    protected ColorStateList F;
    protected int[][] G;
    protected int[] H;
    protected ColorStateList I;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected String f68548g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected StringBuilder f68549h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    protected String f68550i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected int f68551j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected float f68552k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    protected float f68553l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    protected float f68554m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    protected float f68555n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    protected int f68556o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    protected RectF[] f68557p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    protected float[] f68558q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    protected Paint f68559r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected Paint f68560s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    protected Paint f68561t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    protected Drawable f68562u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    protected Rect f68563v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    protected boolean f68564w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    protected boolean f68565x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    protected View.OnClickListener f68566y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    protected i f68567z;

    public class a implements ActionMode.Callback {
        public static ChangeQuickRedirect changeQuickRedirect;

        a() {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }

        @Override // android.view.ActionMode.Callback
        public void onDestroyActionMode(ActionMode actionMode) {
        }

        @Override // android.view.ActionMode.Callback
        public boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
            return false;
        }
    }

    public class b implements View.OnClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        b() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.N8, new Class[]{View.class}, Void.TYPE).isSupported) {
                return;
            }
            PinEntryEditText pinEntryEditText = PinEntryEditText.this;
            pinEntryEditText.setSelection(pinEntryEditText.getText().length());
            View.OnClickListener onClickListener = PinEntryEditText.this.f68566y;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    public class c implements View.OnLongClickListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        c() {
        }

        @Override // android.view.View.OnLongClickListener
        public boolean onLongClick(View view) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{view}, this, changeQuickRedirect, false, bb.c.f.O8, new Class[]{View.class}, Boolean.TYPE);
            if (patchProxyResultProxy.isSupported) {
                return ((Boolean) patchProxyResultProxy.result).booleanValue();
            }
            PinEntryEditText pinEntryEditText = PinEntryEditText.this;
            pinEntryEditText.setSelection(pinEntryEditText.getText().length());
            return true;
        }
    }

    public class d implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.P8, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            PinEntryEditText.this.f68560s.setTextSize(((Float) valueAnimator.getAnimatedValue()).floatValue());
            PinEntryEditText.this.invalidate();
        }
    }

    public class e implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        e() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.Q8, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            PinEntryEditText pinEntryEditText = PinEntryEditText.this;
            pinEntryEditText.f68567z.a(pinEntryEditText.getText());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public class f implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f68573b;

        f(int i10) {
            this.f68573b = i10;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.R8, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            PinEntryEditText.this.f68558q[this.f68573b] = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            PinEntryEditText.this.invalidate();
        }
    }

    public class g implements ValueAnimator.AnimatorUpdateListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        g() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (PatchProxy.proxy(new Object[]{valueAnimator}, this, changeQuickRedirect, false, bb.c.f.S8, new Class[]{ValueAnimator.class}, Void.TYPE).isSupported) {
                return;
            }
            PinEntryEditText.this.f68560s.setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
        }
    }

    public class h implements Animator.AnimatorListener {
        public static ChangeQuickRedirect changeQuickRedirect;

        h() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (PatchProxy.proxy(new Object[]{animator}, this, changeQuickRedirect, false, bb.c.f.T8, new Class[]{Animator.class}, Void.TYPE).isSupported) {
                return;
            }
            PinEntryEditText pinEntryEditText = PinEntryEditText.this;
            pinEntryEditText.f68567z.a(pinEntryEditText.getText());
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }

    public interface i {
        void a(CharSequence charSequence);
    }

    public PinEntryEditText(Context context) {
        super(context);
        this.f68548g = null;
        this.f68549h = null;
        this.f68550i = null;
        this.f68551j = 0;
        this.f68552k = 24.0f;
        this.f68554m = 4.0f;
        this.f68555n = 8.0f;
        this.f68556o = 4;
        this.f68563v = new Rect();
        this.f68564w = false;
        this.f68565x = false;
        this.f68567z = null;
        this.A = 1.0f;
        this.B = 2.0f;
        this.D = false;
        this.E = false;
        this.G = new int[][]{new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842908}};
        this.H = new int[]{-16711936, y1.a.f141526c, j1.f21601t, -7829368};
        this.I = new ColorStateList(this.G, this.H);
    }

    public PinEntryEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f68548g = null;
        this.f68549h = null;
        this.f68550i = null;
        this.f68551j = 0;
        this.f68552k = 24.0f;
        this.f68554m = 4.0f;
        this.f68555n = 8.0f;
        this.f68556o = 4;
        this.f68563v = new Rect();
        this.f68564w = false;
        this.f68565x = false;
        this.f68567z = null;
        this.A = 1.0f;
        this.B = 2.0f;
        this.D = false;
        this.E = false;
        this.G = new int[][]{new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842908}};
        this.H = new int[]{-16711936, y1.a.f141526c, j1.f21601t, -7829368};
        this.I = new ColorStateList(this.G, this.H);
        g(context, attributeSet);
    }

    public PinEntryEditText(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f68548g = null;
        this.f68549h = null;
        this.f68550i = null;
        this.f68551j = 0;
        this.f68552k = 24.0f;
        this.f68554m = 4.0f;
        this.f68555n = 8.0f;
        this.f68556o = 4;
        this.f68563v = new Rect();
        this.f68564w = false;
        this.f68565x = false;
        this.f68567z = null;
        this.A = 1.0f;
        this.B = 2.0f;
        this.D = false;
        this.E = false;
        this.G = new int[][]{new int[]{android.R.attr.state_selected}, new int[]{android.R.attr.state_active}, new int[]{android.R.attr.state_focused}, new int[]{-16842908}};
        this.H = new int[]{-16711936, y1.a.f141526c, j1.f21601t, -7829368};
        this.I = new ColorStateList(this.G, this.H);
        g(context, attributeSet);
    }

    private void c(CharSequence charSequence, int i10) {
        if (PatchProxy.proxy(new Object[]{charSequence, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.M8, new Class[]{CharSequence.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        float[] fArr = this.f68558q;
        float f10 = this.f68557p[i10].bottom - this.f68555n;
        fArr[i10] = f10;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f10 + getPaint().getTextSize(), this.f68558q[i10]);
        valueAnimatorOfFloat.setDuration(300L);
        valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new f(i10));
        this.f68560s.setAlpha(255);
        ValueAnimator valueAnimatorOfInt = ValueAnimator.ofInt(0, 255);
        valueAnimatorOfInt.setDuration(300L);
        valueAnimatorOfInt.addUpdateListener(new g());
        AnimatorSet animatorSet = new AnimatorSet();
        if (charSequence.length() == this.f68556o && this.f68567z != null) {
            animatorSet.addListener(new h());
        }
        animatorSet.playTogether(valueAnimatorOfFloat, valueAnimatorOfInt);
        animatorSet.start();
    }

    private void d() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.L8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f, getPaint().getTextSize());
        valueAnimatorOfFloat.setDuration(200L);
        valueAnimatorOfFloat.setInterpolator(new OvershootInterpolator());
        valueAnimatorOfFloat.addUpdateListener(new d());
        if (getText().length() == this.f68556o && this.f68567z != null) {
            valueAnimatorOfFloat.addListener(new e());
        }
        valueAnimatorOfFloat.start();
    }

    private int f(int... iArr) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{iArr}, this, changeQuickRedirect, false, bb.c.f.A8, new Class[]{int[].class}, Integer.TYPE);
        return patchProxyResultProxy.isSupported ? ((Integer) patchProxyResultProxy.result).intValue() : this.I.getColorForState(iArr, -7829368);
    }

    private void g(Context context, AttributeSet attributeSet) {
        if (PatchProxy.proxy(new Object[]{context, attributeSet}, this, changeQuickRedirect, false, bb.c.f.f32555s8, new Class[]{Context.class, AttributeSet.class}, Void.TYPE).isSupported) {
            return;
        }
        float f10 = context.getResources().getDisplayMetrics().density;
        this.A *= f10;
        this.B *= f10;
        this.f68552k *= f10;
        this.f68555n = f10 * this.f68555n;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f68682m2, 0, 0);
        try {
            TypedValue typedValue = new TypedValue();
            typedArrayObtainStyledAttributes.getValue(R.styleable.PinEntryEditText_pinAnimationType, typedValue);
            this.f68551j = typedValue.data;
            this.f68548g = typedArrayObtainStyledAttributes.getString(R.styleable.PinEntryEditText_pinCharacterMask);
            this.f68550i = typedArrayObtainStyledAttributes.getString(R.styleable.PinEntryEditText_pinRepeatedHint);
            this.A = typedArrayObtainStyledAttributes.getDimension(R.styleable.PinEntryEditText_pinLineStroke, this.A);
            this.B = typedArrayObtainStyledAttributes.getDimension(R.styleable.PinEntryEditText_pinLineStrokeSelected, this.B);
            this.f68552k = typedArrayObtainStyledAttributes.getDimension(R.styleable.PinEntryEditText_pinCharacterSpacing, this.f68552k);
            this.f68555n = typedArrayObtainStyledAttributes.getDimension(R.styleable.PinEntryEditText_pinTextBottomPadding, this.f68555n);
            this.f68564w = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PinEntryEditText_pinBackgroundIsSquare, this.f68564w);
            this.f68565x = typedArrayObtainStyledAttributes.getBoolean(R.styleable.PinEntryEditText_pinTextCenterVertical, this.f68565x);
            this.f68562u = typedArrayObtainStyledAttributes.getDrawable(R.styleable.PinEntryEditText_pinBackgroundDrawable);
            ColorStateList colorStateList = typedArrayObtainStyledAttributes.getColorStateList(R.styleable.PinEntryEditText_pinLineColors);
            if (colorStateList != null) {
                this.I = colorStateList;
            }
            typedArrayObtainStyledAttributes.recycle();
            this.f68559r = new Paint(getPaint());
            this.f68560s = new Paint(getPaint());
            this.f68561t = new Paint(getPaint());
            Paint paint = new Paint(getPaint());
            this.C = paint;
            paint.setStrokeWidth(this.A);
            TypedValue typedValue2 = new TypedValue();
            context.getTheme().resolveAttribute(R.attr.colorControlActivated, typedValue2, true);
            this.H[0] = typedValue2.data;
            this.H[1] = isInEditMode() ? -7829368 : androidx.core.content.d.f(context, R.color.divider_color);
            this.H[2] = isInEditMode() ? -7829368 : androidx.core.content.d.f(context, R.color.divider_color);
            setBackgroundResource(0);
            int attributeIntValue = attributeSet.getAttributeIntValue(J, "maxLength", 4);
            this.f68556o = attributeIntValue;
            this.f68554m = attributeIntValue;
            super.setCustomSelectionActionModeCallback(new a());
            super.setOnClickListener(new b());
            super.setOnLongClickListener(new c());
            if ((getInputType() & 128) == 128 && TextUtils.isEmpty(this.f68548g)) {
                this.f68548g = K;
            } else if ((getInputType() & 16) == 16 && TextUtils.isEmpty(this.f68548g)) {
                this.f68548g = K;
            }
            if (!TextUtils.isEmpty(this.f68548g)) {
                this.f68549h = getMaskChars();
            }
            getPaint().getTextBounds("|", 0, 1, this.f68563v);
            this.D = this.f68551j > -1;
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private CharSequence getFullText() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32687y8, new Class[0], CharSequence.class);
        if (patchProxyResultProxy.isSupported) {
            return (CharSequence) patchProxyResultProxy.result;
        }
        return TextUtils.isEmpty(this.f68548g) ? getText() : getMaskChars();
    }

    private StringBuilder getMaskChars() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.f32709z8, new Class[0], StringBuilder.class);
        if (patchProxyResultProxy.isSupported) {
            return (StringBuilder) patchProxyResultProxy.result;
        }
        if (this.f68549h == null) {
            this.f68549h = new StringBuilder();
        }
        int length = getText().length();
        while (this.f68549h.length() != length) {
            if (this.f68549h.length() < length) {
                this.f68549h.append(this.f68548g);
            } else {
                StringBuilder sb2 = this.f68549h;
                sb2.deleteCharAt(sb2.length() - 1);
            }
        }
        return this.f68549h;
    }

    private void setCustomTypeface(@p0 Typeface typeface) {
        Paint paint;
        if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, bb.c.f.H8, new Class[]{Typeface.class}, Void.TYPE).isSupported || (paint = this.f68559r) == null) {
            return;
        }
        paint.setTypeface(typeface);
        this.f68560s.setTypeface(typeface);
        this.f68561t.setTypeface(typeface);
        this.C.setTypeface(typeface);
    }

    public void e() {
        if (PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, bb.c.f.E8, new Class[0], Void.TYPE).isSupported) {
            return;
        }
        requestFocus();
        ((InputMethodManager) getContext().getSystemService("input_method")).showSoftInput(this, 0);
    }

    public boolean h() {
        return this.E;
    }

    public void i(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.B8, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        if (this.E) {
            this.C.setColor(f(android.R.attr.state_active));
            return;
        }
        if (!isFocused()) {
            this.C.setStrokeWidth(this.A);
            this.C.setColor(f(-16842908));
            return;
        }
        this.C.setStrokeWidth(this.B);
        this.C.setColor(f(android.R.attr.state_focused));
        if (z10) {
            this.C.setColor(f(android.R.attr.state_selected));
        }
    }

    public void j(boolean z10, boolean z11) {
        Object[] objArr = {new Byte(z10 ? (byte) 1 : (byte) 0), new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.C8, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (this.E) {
            this.f68562u.setState(new int[]{android.R.attr.state_active});
            return;
        }
        if (!isFocused()) {
            if (z10) {
                this.f68562u.setState(new int[]{-16842908, android.R.attr.state_checked});
                return;
            } else {
                this.f68562u.setState(new int[]{-16842908});
                return;
            }
        }
        this.f68562u.setState(new int[]{android.R.attr.state_focused});
        if (z11) {
            this.f68562u.setState(new int[]{android.R.attr.state_selected});
        } else if (z10) {
            this.f68562u.setState(new int[]{android.R.attr.state_focused, android.R.attr.state_checked});
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onDraw(Canvas canvas) {
        if (PatchProxy.proxy(new Object[]{canvas}, this, changeQuickRedirect, false, bb.c.f.f32665x8, new Class[]{Canvas.class}, Void.TYPE).isSupported) {
            return;
        }
        CharSequence fullText = getFullText();
        int length = fullText.length();
        float[] fArr = new float[length];
        getPaint().getTextWidths(fullText, 0, length, fArr);
        float f10 = 0.0f;
        String str = this.f68550i;
        if (str != null) {
            int length2 = str.length();
            float[] fArr2 = new float[length2];
            getPaint().getTextWidths(this.f68550i, fArr2);
            for (int i10 = 0; i10 < length2; i10++) {
                f10 += fArr2[i10];
            }
        }
        float f11 = f10;
        int i11 = 0;
        while (i11 < this.f68554m) {
            if (this.f68562u != null) {
                j(i11 < length, i11 == length);
                Drawable drawable = this.f68562u;
                RectF rectF = this.f68557p[i11];
                drawable.setBounds((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom);
                this.f68562u.draw(canvas);
            }
            float f12 = this.f68557p[i11].left + (this.f68553l / 2.0f);
            if (length <= i11) {
                String str2 = this.f68550i;
                if (str2 != null) {
                    canvas.drawText(str2, f12 - (f11 / 2.0f), this.f68558q[i11], this.f68561t);
                }
            } else if (this.D && i11 == length - 1) {
                canvas.drawText(fullText, i11, i11 + 1, f12 - (fArr[i11] / 2.0f), this.f68558q[i11], this.f68560s);
            } else {
                canvas.drawText(fullText, i11, i11 + 1, f12 - (fArr[i11] / 2.0f), this.f68558q[i11], this.f68559r);
            }
            if (this.f68562u == null) {
                i(i11 <= length);
                RectF rectF2 = this.f68557p[i11];
                canvas.drawLine(rectF2.left, rectF2.top, rectF2.right, rectF2.bottom, this.C);
            }
            i11++;
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i10, int i11) {
        int paddingLeft;
        float f10;
        float f11;
        float f12;
        int size;
        float f13;
        float f14;
        float f15;
        Object[] objArr = {new Integer(i10), new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32621v8, new Class[]{cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        if (!this.f68564w) {
            super.onMeasure(i10, i11);
            return;
        }
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (mode != 1073741824) {
            if (mode2 == 1073741824) {
                size = View.MeasureSpec.getSize(i11);
                f13 = this.f68554m;
                f14 = size * f13;
                f15 = this.f68552k;
            } else if (mode == Integer.MIN_VALUE) {
                paddingLeft = View.MeasureSpec.getSize(i10);
                f10 = paddingLeft;
                f11 = this.f68554m;
                f12 = this.f68552k;
            } else if (mode2 == Integer.MIN_VALUE) {
                size = View.MeasureSpec.getSize(i11);
                f13 = this.f68554m;
                f14 = size * f13;
                f15 = this.f68552k;
            } else {
                paddingLeft = getPaddingLeft() + getPaddingRight() + getSuggestedMinimumWidth();
                f10 = paddingLeft;
                f11 = this.f68554m;
                f12 = this.f68552k;
            }
            paddingLeft = (int) (f14 + ((f15 * f13) - 1.0f));
            setMeasuredDimension(View.resolveSizeAndState(paddingLeft, i10, 1), View.resolveSizeAndState(size, i11, 0));
        }
        paddingLeft = View.MeasureSpec.getSize(i10);
        f10 = paddingLeft;
        f11 = this.f68554m;
        f12 = this.f68552k;
        size = (int) ((f10 - (f11 - (f12 * 1.0f))) / f11);
        setMeasuredDimension(View.resolveSizeAndState(paddingLeft, i10, 1), View.resolveSizeAndState(size, i11, 0));
    }

    @Override // android.view.View
    public void onSizeChanged(int i10, int i11, int i12, int i13) {
        int iK0;
        int i14 = 1;
        Object[] objArr = {new Integer(i10), new Integer(i11), new Integer(i12), new Integer(i13)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.f32599u8, new Class[]{cls, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        super.onSizeChanged(i10, i11, i12, i13);
        ColorStateList textColors = getTextColors();
        this.F = textColors;
        if (textColors != null) {
            this.f68560s.setColor(textColors.getDefaultColor());
            this.f68559r.setColor(this.F.getDefaultColor());
            this.f68561t.setColor(getCurrentHintTextColor());
        }
        int width = (getWidth() - j1.j0(this)) - j1.k0(this);
        float f10 = this.f68552k;
        if (f10 < 0.0f) {
            this.f68553l = width / ((this.f68554m * 2.0f) - 1.0f);
        } else {
            float f11 = this.f68554m;
            this.f68553l = (width - (f10 * (f11 - 1.0f))) / f11;
        }
        float f12 = this.f68554m;
        this.f68557p = new RectF[(int) f12];
        this.f68558q = new float[(int) f12];
        int height = getHeight() - getPaddingBottom();
        if (j1.Z(this) == 1) {
            i14 = -1;
            iK0 = (int) ((getWidth() - j1.k0(this)) - this.f68553l);
        } else {
            iK0 = j1.k0(this);
        }
        for (int i15 = 0; i15 < this.f68554m; i15++) {
            float f13 = iK0;
            float f14 = height;
            this.f68557p[i15] = new RectF(f13, f14, this.f68553l + f13, f14);
            if (this.f68562u != null) {
                if (this.f68564w) {
                    this.f68557p[i15].top = getPaddingTop();
                    RectF rectF = this.f68557p[i15];
                    rectF.right = rectF.width() + f13;
                } else {
                    this.f68557p[i15].top = getPaddingTop();
                }
            }
            float f15 = this.f68552k;
            iK0 = (int) (f15 < 0.0f ? f13 + (i14 * this.f68553l * 2.0f) : f13 + (i14 * (this.f68553l + f15)));
            if (this.f68565x) {
                this.f68558q[i15] = (this.f68557p[i15].bottom / 2.0f) + (this.f68563v.height() / 2);
            } else {
                this.f68558q[i15] = this.f68557p[i15].bottom - this.f68555n;
            }
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        Object[] objArr = {charSequence, new Integer(i10), new Integer(i11), new Integer(i12)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        if (PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, bb.c.f.K8, new Class[]{CharSequence.class, cls, cls, cls}, Void.TYPE).isSupported) {
            return;
        }
        setError(false);
        if (this.f68557p == null || !this.D) {
            if (this.f68567z == null || charSequence.length() != this.f68556o) {
                return;
            }
            this.f68567z.a(charSequence);
            return;
        }
        int i13 = this.f68551j;
        if (i13 == -1) {
            invalidate();
        } else if (i12 > i11) {
            if (i13 == 0) {
                d();
            } else {
                c(charSequence, i10);
            }
        }
    }

    public void setAnimateText(boolean z10) {
        this.D = z10;
    }

    @Override // androidx.appcompat.widget.AppCompatEditText, android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        if (!PatchProxy.proxy(new Object[]{callback}, this, changeQuickRedirect, false, bb.c.f.f32643w8, new Class[]{ActionMode.Callback.class}, Void.TYPE).isSupported) {
            throw new RuntimeException("setCustomSelectionActionModeCallback() not supported.");
        }
    }

    public void setError(boolean z10) {
        if (PatchProxy.proxy(new Object[]{new Byte(z10 ? (byte) 1 : (byte) 0)}, this, changeQuickRedirect, false, bb.c.f.D8, new Class[]{Boolean.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.E = z10;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setInputType(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32577t8, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setInputType(i10);
        if ((i10 & 128) != 128 && (i10 & 16) != 16) {
            setMask(null);
        } else if (TextUtils.isEmpty(this.f68548g)) {
            setMask(K);
        }
    }

    public void setMask(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.f32511q8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68548g = str;
        this.f68549h = null;
        invalidate();
    }

    public void setMaxLength(int i10) {
        if (PatchProxy.proxy(new Object[]{new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.f32488p8, new Class[]{Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        this.f68556o = i10;
        this.f68554m = i10;
        setFilters(new InputFilter[]{new InputFilter.LengthFilter(i10)});
        setText((CharSequence) null);
        invalidate();
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f68566y = onClickListener;
    }

    public void setOnPinEnteredListener(i iVar) {
        this.f68567z = iVar;
    }

    public void setPinBackground(Drawable drawable) {
        if (PatchProxy.proxy(new Object[]{drawable}, this, changeQuickRedirect, false, bb.c.f.J8, new Class[]{Drawable.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68562u = drawable;
        invalidate();
    }

    public void setPinLineColors(ColorStateList colorStateList) {
        if (PatchProxy.proxy(new Object[]{colorStateList}, this, changeQuickRedirect, false, bb.c.f.I8, new Class[]{ColorStateList.class}, Void.TYPE).isSupported) {
            return;
        }
        this.I = colorStateList;
        invalidate();
    }

    public void setSingleCharHint(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, bb.c.f.f32533r8, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        this.f68550i = str;
        invalidate();
    }

    @Override // android.widget.TextView
    public void setTypeface(@p0 Typeface typeface) {
        if (PatchProxy.proxy(new Object[]{typeface}, this, changeQuickRedirect, false, bb.c.f.F8, new Class[]{Typeface.class}, Void.TYPE).isSupported) {
            return;
        }
        super.setTypeface(typeface);
        setCustomTypeface(typeface);
    }

    @Override // android.widget.TextView
    public void setTypeface(@p0 Typeface typeface, int i10) {
        if (PatchProxy.proxy(new Object[]{typeface, new Integer(i10)}, this, changeQuickRedirect, false, bb.c.f.G8, new Class[]{Typeface.class, Integer.TYPE}, Void.TYPE).isSupported) {
            return;
        }
        super.setTypeface(typeface, i10);
        setCustomTypeface(typeface);
    }
}
