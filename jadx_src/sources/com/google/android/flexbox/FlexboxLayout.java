package com.google.android.flexbox;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.p0;
import androidx.core.view.j1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class FlexboxLayout extends ViewGroup implements d {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f52135s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f52136t = 1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f52137u = 2;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f52138v = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f52139b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f52140c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f52141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f52142e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f52143f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f52144g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private Drawable f52145h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private Drawable f52146i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f52147j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f52148k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f52149l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f52150m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int[] f52151n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private SparseIntArray f52152o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private h f52153p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private List<f> f52154q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private h.b f52155r;

    public static class LayoutParams extends ViewGroup.MarginLayoutParams implements FlexItem {
        public static final Parcelable.Creator<LayoutParams> CREATOR = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f52156b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f52157c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f52158d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f52159e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f52160f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f52161g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f52162h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private int f52163i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f52164j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f52165k;

        public static final class a implements Parcelable.Creator<LayoutParams> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public LayoutParams createFromParcel(Parcel parcel) {
                return new LayoutParams(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public LayoutParams[] newArray(int i10) {
                return new LayoutParams[i10];
            }
        }

        public LayoutParams(int i10, int i11) {
            super(new ViewGroup.LayoutParams(i10, i11));
            this.f52156b = 1;
            this.f52157c = 0.0f;
            this.f52158d = 1.0f;
            this.f52159e = -1;
            this.f52160f = -1.0f;
            this.f52161g = -1;
            this.f52162h = -1;
            this.f52163i = 16777215;
            this.f52164j = 16777215;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f52156b = 1;
            this.f52157c = 0.0f;
            this.f52158d = 1.0f;
            this.f52159e = -1;
            this.f52160f = -1.0f;
            this.f52161g = -1;
            this.f52162h = -1;
            this.f52163i = 16777215;
            this.f52164j = 16777215;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f52226b);
            this.f52156b = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_order, 1);
            this.f52157c = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexGrow, 0.0f);
            this.f52158d = typedArrayObtainStyledAttributes.getFloat(R.styleable.FlexboxLayout_Layout_layout_flexShrink, 1.0f);
            this.f52159e = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_Layout_layout_alignSelf, -1);
            this.f52160f = typedArrayObtainStyledAttributes.getFraction(R.styleable.FlexboxLayout_Layout_layout_flexBasisPercent, 1, 1, -1.0f);
            this.f52161g = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minWidth, -1);
            this.f52162h = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_minHeight, -1);
            this.f52163i = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxWidth, 16777215);
            this.f52164j = typedArrayObtainStyledAttributes.getDimensionPixelSize(R.styleable.FlexboxLayout_Layout_layout_maxHeight, 16777215);
            this.f52165k = typedArrayObtainStyledAttributes.getBoolean(R.styleable.FlexboxLayout_Layout_layout_wrapBefore, false);
            typedArrayObtainStyledAttributes.recycle();
        }

        protected LayoutParams(Parcel parcel) {
            super(0, 0);
            this.f52156b = 1;
            this.f52157c = 0.0f;
            this.f52158d = 1.0f;
            this.f52159e = -1;
            this.f52160f = -1.0f;
            this.f52161g = -1;
            this.f52162h = -1;
            this.f52163i = 16777215;
            this.f52164j = 16777215;
            this.f52156b = parcel.readInt();
            this.f52157c = parcel.readFloat();
            this.f52158d = parcel.readFloat();
            this.f52159e = parcel.readInt();
            this.f52160f = parcel.readFloat();
            this.f52161g = parcel.readInt();
            this.f52162h = parcel.readInt();
            this.f52163i = parcel.readInt();
            this.f52164j = parcel.readInt();
            this.f52165k = parcel.readByte() != 0;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).leftMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).rightMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).topMargin = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).height = parcel.readInt();
            ((ViewGroup.MarginLayoutParams) this).width = parcel.readInt();
        }

        public LayoutParams(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f52156b = 1;
            this.f52157c = 0.0f;
            this.f52158d = 1.0f;
            this.f52159e = -1;
            this.f52160f = -1.0f;
            this.f52161g = -1;
            this.f52162h = -1;
            this.f52163i = 16777215;
            this.f52164j = 16777215;
        }

        public LayoutParams(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f52156b = 1;
            this.f52157c = 0.0f;
            this.f52158d = 1.0f;
            this.f52159e = -1;
            this.f52160f = -1.0f;
            this.f52161g = -1;
            this.f52162h = -1;
            this.f52163i = 16777215;
            this.f52164j = 16777215;
        }

        public LayoutParams(LayoutParams layoutParams) {
            super((ViewGroup.MarginLayoutParams) layoutParams);
            this.f52156b = 1;
            this.f52157c = 0.0f;
            this.f52158d = 1.0f;
            this.f52159e = -1;
            this.f52160f = -1.0f;
            this.f52161g = -1;
            this.f52162h = -1;
            this.f52163i = 16777215;
            this.f52164j = 16777215;
            this.f52156b = layoutParams.f52156b;
            this.f52157c = layoutParams.f52157c;
            this.f52158d = layoutParams.f52158d;
            this.f52159e = layoutParams.f52159e;
            this.f52160f = layoutParams.f52160f;
            this.f52161g = layoutParams.f52161g;
            this.f52162h = layoutParams.f52162h;
            this.f52163i = layoutParams.f52163i;
            this.f52164j = layoutParams.f52164j;
            this.f52165k = layoutParams.f52165k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int A1() {
            return ((ViewGroup.MarginLayoutParams) this).leftMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void B0(int i10) {
            this.f52156b = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int E0() {
            return this.f52159e;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void G1(int i10) {
            ((ViewGroup.MarginLayoutParams) this).height = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float H0() {
            return this.f52158d;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void J(int i10) {
            this.f52164j = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int K1() {
            return ((ViewGroup.MarginLayoutParams) this).rightMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int L1() {
            return this.f52162h;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int R() {
            return ((ViewGroup.MarginLayoutParams) this).topMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void R0(int i10) {
            this.f52162h = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int S1() {
            return this.f52164j;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void U1(int i10) {
            this.f52159e = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void V(float f10) {
            this.f52157c = f10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float X0() {
            return this.f52157c;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void Y(float f10) {
            this.f52160f = f10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public float Z0() {
            return this.f52160f;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // com.google.android.flexbox.FlexItem
        public boolean e1() {
            return this.f52165k;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void g(int i10) {
            this.f52163i = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getHeight() {
            return ((ViewGroup.MarginLayoutParams) this).height;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getOrder() {
            return this.f52156b;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int getWidth() {
            return ((ViewGroup.MarginLayoutParams) this).width;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int h0() {
            return ((ViewGroup.MarginLayoutParams) this).bottomMargin;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void i(boolean z10) {
            this.f52165k = z10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public int m1() {
            return this.f52163i;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void t0(int i10) {
            ((ViewGroup.MarginLayoutParams) this).width = i10;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void w1(float f10) {
            this.f52158d = f10;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f52156b);
            parcel.writeFloat(this.f52157c);
            parcel.writeFloat(this.f52158d);
            parcel.writeInt(this.f52159e);
            parcel.writeFloat(this.f52160f);
            parcel.writeInt(this.f52161g);
            parcel.writeInt(this.f52162h);
            parcel.writeInt(this.f52163i);
            parcel.writeInt(this.f52164j);
            parcel.writeByte(this.f52165k ? (byte) 1 : (byte) 0);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).bottomMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).leftMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).rightMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).topMargin);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).height);
            parcel.writeInt(((ViewGroup.MarginLayoutParams) this).width);
        }

        @Override // com.google.android.flexbox.FlexItem
        public int x() {
            return this.f52161g;
        }

        @Override // com.google.android.flexbox.FlexItem
        public void z1(int i10) {
            this.f52161g = i10;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    public @interface a {
    }

    public FlexboxLayout(Context context) {
        this(context, null);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public FlexboxLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f52144g = -1;
        this.f52153p = new h(this);
        this.f52154q = new ArrayList();
        this.f52155r = new h.b();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.f52225a, i10, 0);
        this.f52139b = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexDirection, 0);
        this.f52140c = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_flexWrap, 0);
        this.f52141d = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_justifyContent, 0);
        this.f52142e = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignItems, 0);
        this.f52143f = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_alignContent, 0);
        this.f52144g = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_maxLine, -1);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawable);
        if (drawable != null) {
            setDividerDrawableHorizontal(drawable);
            setDividerDrawableVertical(drawable);
        }
        Drawable drawable2 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableHorizontal);
        if (drawable2 != null) {
            setDividerDrawableHorizontal(drawable2);
        }
        Drawable drawable3 = typedArrayObtainStyledAttributes.getDrawable(R.styleable.FlexboxLayout_dividerDrawableVertical);
        if (drawable3 != null) {
            setDividerDrawableVertical(drawable3);
        }
        int i11 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDivider, 0);
        if (i11 != 0) {
            this.f52148k = i11;
            this.f52147j = i11;
        }
        int i12 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerVertical, 0);
        if (i12 != 0) {
            this.f52148k = i12;
        }
        int i13 = typedArrayObtainStyledAttributes.getInt(R.styleable.FlexboxLayout_showDividerHorizontal, 0);
        if (i13 != 0) {
            this.f52147j = i13;
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    private void A() {
        if (this.f52145h == null && this.f52146i == null) {
            setWillNotDraw(true);
        } else {
            setWillNotDraw(false);
        }
    }

    private boolean g(int i10) {
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f52154q.get(i11).d() > 0) {
                return false;
            }
        }
        return true;
    }

    private boolean l(int i10, int i11) {
        for (int i12 = 1; i12 <= i11; i12++) {
            View viewR = r(i10 - i12);
            if (viewR != null && viewR.getVisibility() != 8) {
                return false;
            }
        }
        return true;
    }

    private void m(Canvas canvas, boolean z10, boolean z11) {
        int paddingLeft = getPaddingLeft();
        int iMax = Math.max(0, (getWidth() - getPaddingRight()) - paddingLeft);
        int size = this.f52154q.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.f52154q.get(i10);
            for (int i11 = 0; i11 < fVar.f52240h; i11++) {
                int i12 = fVar.f52247o + i11;
                View viewR = r(i12);
                if (viewR != null && viewR.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                    if (s(i12, i11)) {
                        p(canvas, z10 ? viewR.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin : (viewR.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f52150m, fVar.f52234b, fVar.f52239g);
                    }
                    if (i11 == fVar.f52240h - 1 && (this.f52148k & 4) > 0) {
                        p(canvas, z10 ? (viewR.getLeft() - ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin) - this.f52150m : viewR.getRight() + ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin, fVar.f52234b, fVar.f52239g);
                    }
                }
            }
            if (t(i10)) {
                o(canvas, paddingLeft, z11 ? fVar.f52236d : fVar.f52234b - this.f52149l, iMax);
            }
            if (u(i10) && (this.f52147j & 4) > 0) {
                o(canvas, paddingLeft, z11 ? fVar.f52234b - this.f52149l : fVar.f52236d, iMax);
            }
        }
    }

    private void n(Canvas canvas, boolean z10, boolean z11) {
        int paddingTop = getPaddingTop();
        int iMax = Math.max(0, (getHeight() - getPaddingBottom()) - paddingTop);
        int size = this.f52154q.size();
        for (int i10 = 0; i10 < size; i10++) {
            f fVar = this.f52154q.get(i10);
            for (int i11 = 0; i11 < fVar.f52240h; i11++) {
                int i12 = fVar.f52247o + i11;
                View viewR = r(i12);
                if (viewR != null && viewR.getVisibility() != 8) {
                    LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                    if (s(i12, i11)) {
                        o(canvas, fVar.f52233a, z11 ? viewR.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin : (viewR.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f52149l, fVar.f52239g);
                    }
                    if (i11 == fVar.f52240h - 1 && (this.f52147j & 4) > 0) {
                        o(canvas, fVar.f52233a, z11 ? (viewR.getTop() - ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) - this.f52149l : viewR.getBottom() + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin, fVar.f52239g);
                    }
                }
            }
            if (t(i10)) {
                p(canvas, z10 ? fVar.f52235c : fVar.f52233a - this.f52150m, paddingTop, iMax);
            }
            if (u(i10) && (this.f52148k & 4) > 0) {
                p(canvas, z10 ? fVar.f52233a - this.f52150m : fVar.f52235c, paddingTop, iMax);
            }
        }
    }

    private void o(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f52145h;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, i12 + i10, this.f52149l + i11);
        this.f52145h.draw(canvas);
    }

    private void p(Canvas canvas, int i10, int i11, int i12) {
        Drawable drawable = this.f52146i;
        if (drawable == null) {
            return;
        }
        drawable.setBounds(i10, i11, this.f52150m + i10, i12 + i11);
        this.f52146i.draw(canvas);
    }

    private boolean s(int i10, int i11) {
        if (l(i10, i11)) {
            if (k()) {
                return (this.f52148k & 1) != 0;
            }
            return (this.f52147j & 1) != 0;
        }
        if (k()) {
            return (this.f52148k & 2) != 0;
        }
        return (this.f52147j & 2) != 0;
    }

    private boolean t(int i10) {
        if (i10 < 0 || i10 >= this.f52154q.size()) {
            return false;
        }
        if (g(i10)) {
            if (k()) {
                return (this.f52147j & 1) != 0;
            }
            return (this.f52148k & 1) != 0;
        }
        if (k()) {
            return (this.f52147j & 2) != 0;
        }
        return (this.f52148k & 2) != 0;
    }

    private boolean u(int i10) {
        if (i10 < 0 || i10 >= this.f52154q.size()) {
            return false;
        }
        for (int i11 = i10 + 1; i11 < this.f52154q.size(); i11++) {
            if (this.f52154q.get(i11).d() > 0) {
                return false;
            }
        }
        if (k()) {
            return (this.f52147j & 4) != 0;
        }
        return (this.f52148k & 4) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00de  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x0107  */
    /* JADX WARN: Code duplicated, block: B:49:0x0111  */
    /* JADX WARN: Code duplicated, block: B:52:0x011a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0122  */
    /* JADX WARN: Code duplicated, block: B:55:0x0127  */
    /* JADX WARN: Code duplicated, block: B:59:0x0130 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x0132  */
    /* JADX WARN: Code duplicated, block: B:61:0x0163  */
    /* JADX WARN: Code duplicated, block: B:62:0x018d  */
    /* JADX WARN: Code duplicated, block: B:64:0x019a  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:68:0x01f0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:71:0x020c  */
    private void v(boolean z10, int i10, int i11, int i12, int i13) {
        float measuredWidth;
        float f10;
        float f11;
        float fMax;
        int i14;
        int i15;
        View viewR;
        int i16;
        int i17;
        int i18;
        char c10;
        LayoutParams layoutParams;
        float f12;
        float f13;
        float f14;
        int i19;
        char c11;
        int i20;
        LayoutParams layoutParams2;
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int i21 = i12 - i10;
        int paddingBottom = (i13 - i11) - getPaddingBottom();
        int paddingTop = getPaddingTop();
        int size = this.f52154q.size();
        int i22 = 0;
        while (i22 < size) {
            f fVar = this.f52154q.get(i22);
            if (t(i22)) {
                int i23 = this.f52149l;
                paddingBottom -= i23;
                paddingTop += i23;
            }
            int i24 = this.f52141d;
            char c12 = 4;
            int i25 = 1;
            if (i24 == 0) {
                measuredWidth = paddingLeft;
                f10 = i21 - paddingRight;
            } else if (i24 != 1) {
                if (i24 == 2) {
                    int i26 = fVar.f52237e;
                    measuredWidth = paddingLeft + ((i21 - i26) / 2.0f);
                    f10 = (i21 - paddingRight) - ((i21 - i26) / 2.0f);
                } else if (i24 == 3) {
                    measuredWidth = paddingLeft;
                    int iD = fVar.d();
                    f11 = (i21 - fVar.f52237e) / (iD != 1 ? iD - 1 : 1.0f);
                    f10 = i21 - paddingRight;
                } else if (i24 == 4) {
                    int iD2 = fVar.d();
                    f11 = iD2 != 0 ? (i21 - fVar.f52237e) / iD2 : 0.0f;
                    float f15 = f11 / 2.0f;
                    measuredWidth = paddingLeft + f15;
                    f10 = (i21 - paddingRight) - f15;
                } else {
                    if (i24 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f52141d);
                    }
                    int iD3 = fVar.d();
                    f11 = iD3 != 0 ? (i21 - fVar.f52237e) / (iD3 + 1) : 0.0f;
                    measuredWidth = paddingLeft + f11;
                    f10 = (i21 - paddingRight) - f11;
                }
                fMax = Math.max(f11, 0.0f);
                i14 = 0;
                while (i14 < fVar.f52240h) {
                    i15 = fVar.f52247o + i14;
                    viewR = r(i15);
                    if (viewR != null) {
                        i16 = paddingLeft;
                        i17 = i25;
                        i18 = i14;
                        c10 = c12;
                    } else if (viewR.getVisibility() == 8) {
                        i16 = paddingLeft;
                        i17 = i25;
                        i18 = i14;
                        c10 = 4;
                    } else {
                        layoutParams = (LayoutParams) viewR.getLayoutParams();
                        f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                        f13 = f10 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                        if (s(i15, i14)) {
                            int i27 = this.f52150m;
                            float f16 = i27;
                            f12 += f16;
                            i19 = i27;
                            f14 = f13 - f16;
                        } else {
                            f14 = f13;
                            i19 = 0;
                        }
                        if (i14 == fVar.f52240h - i25) {
                            c11 = 4;
                            i20 = (this.f52148k & 4) > 0 ? this.f52150m : 0;
                            if (this.f52140c == 2) {
                                i16 = paddingLeft;
                                i17 = i25;
                                i18 = i14;
                                layoutParams2 = layoutParams;
                                c10 = c11;
                                if (z10) {
                                    this.f52153p.Q(viewR, fVar, Math.round(f14) - viewR.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + viewR.getMeasuredHeight());
                                } else {
                                    this.f52153p.Q(viewR, fVar, Math.round(f12), paddingTop, Math.round(f12) + viewR.getMeasuredWidth(), paddingTop + viewR.getMeasuredHeight());
                                }
                            } else if (z10) {
                                i17 = i25;
                                i18 = i14;
                                i16 = paddingLeft;
                                layoutParams2 = layoutParams;
                                c10 = c11;
                                this.f52153p.Q(viewR, fVar, Math.round(f14) - viewR.getMeasuredWidth(), paddingBottom - viewR.getMeasuredHeight(), Math.round(f14), paddingBottom);
                            } else {
                                i16 = paddingLeft;
                                i17 = i25;
                                i18 = i14;
                                layoutParams2 = layoutParams;
                                c10 = c11;
                                this.f52153p.Q(viewR, fVar, Math.round(f12), paddingBottom - viewR.getMeasuredHeight(), Math.round(f12) + viewR.getMeasuredWidth(), paddingBottom);
                            }
                            measuredWidth = f12 + viewR.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                            float measuredWidth2 = f14 - ((viewR.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                            if (z10) {
                                fVar.h(viewR, i20, 0, i19, 0);
                            } else {
                                fVar.h(viewR, i19, 0, i20, 0);
                            }
                            f10 = measuredWidth2;
                        } else {
                            c11 = 4;
                        }
                        if (this.f52140c == 2) {
                            i16 = paddingLeft;
                            i17 = i25;
                            i18 = i14;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            if (z10) {
                                this.f52153p.Q(viewR, fVar, Math.round(f14) - viewR.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + viewR.getMeasuredHeight());
                            } else {
                                this.f52153p.Q(viewR, fVar, Math.round(f12), paddingTop, Math.round(f12) + viewR.getMeasuredWidth(), paddingTop + viewR.getMeasuredHeight());
                            }
                        } else if (z10) {
                            i17 = i25;
                            i18 = i14;
                            i16 = paddingLeft;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            this.f52153p.Q(viewR, fVar, Math.round(f14) - viewR.getMeasuredWidth(), paddingBottom - viewR.getMeasuredHeight(), Math.round(f14), paddingBottom);
                        } else {
                            i16 = paddingLeft;
                            i17 = i25;
                            i18 = i14;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            this.f52153p.Q(viewR, fVar, Math.round(f12), paddingBottom - viewR.getMeasuredHeight(), Math.round(f12) + viewR.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f12 + viewR.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth3 = f14 - ((viewR.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z10) {
                            fVar.h(viewR, i20, 0, i19, 0);
                        } else {
                            fVar.h(viewR, i19, 0, i20, 0);
                        }
                        f10 = measuredWidth3;
                    }
                    i14 = i18 + 1;
                    paddingLeft = i16;
                    i25 = i17;
                    c12 = c10;
                }
                int i28 = paddingLeft;
                int i29 = fVar.f52239g;
                paddingTop += i29;
                paddingBottom -= i29;
                i22++;
                paddingLeft = i28;
            } else {
                int i30 = fVar.f52237e;
                f10 = i30 - paddingLeft;
                measuredWidth = (i21 - i30) + paddingRight;
            }
            f11 = 0.0f;
            fMax = Math.max(f11, 0.0f);
            i14 = 0;
            while (i14 < fVar.f52240h) {
                i15 = fVar.f52247o + i14;
                viewR = r(i15);
                if (viewR != null) {
                    i16 = paddingLeft;
                    i17 = i25;
                    i18 = i14;
                    c10 = c12;
                } else if (viewR.getVisibility() == 8) {
                    i16 = paddingLeft;
                    i17 = i25;
                    i18 = i14;
                    c10 = 4;
                } else {
                    layoutParams = (LayoutParams) viewR.getLayoutParams();
                    f12 = measuredWidth + ((ViewGroup.MarginLayoutParams) layoutParams).leftMargin;
                    f13 = f10 - ((ViewGroup.MarginLayoutParams) layoutParams).rightMargin;
                    if (s(i15, i14)) {
                        int i210 = this.f52150m;
                        float f17 = i210;
                        f12 += f17;
                        i19 = i210;
                        f14 = f13 - f17;
                    } else {
                        f14 = f13;
                        i19 = 0;
                    }
                    if (i14 == fVar.f52240h - i25) {
                        c11 = 4;
                        if ((this.f52148k & 4) > 0) {
                        }
                        if (this.f52140c == 2) {
                            i16 = paddingLeft;
                            i17 = i25;
                            i18 = i14;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            if (z10) {
                                this.f52153p.Q(viewR, fVar, Math.round(f14) - viewR.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + viewR.getMeasuredHeight());
                            } else {
                                this.f52153p.Q(viewR, fVar, Math.round(f12), paddingTop, Math.round(f12) + viewR.getMeasuredWidth(), paddingTop + viewR.getMeasuredHeight());
                            }
                        } else if (z10) {
                            i17 = i25;
                            i18 = i14;
                            i16 = paddingLeft;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            this.f52153p.Q(viewR, fVar, Math.round(f14) - viewR.getMeasuredWidth(), paddingBottom - viewR.getMeasuredHeight(), Math.round(f14), paddingBottom);
                        } else {
                            i16 = paddingLeft;
                            i17 = i25;
                            i18 = i14;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            this.f52153p.Q(viewR, fVar, Math.round(f12), paddingBottom - viewR.getMeasuredHeight(), Math.round(f12) + viewR.getMeasuredWidth(), paddingBottom);
                        }
                        measuredWidth = f12 + viewR.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                        float measuredWidth4 = f14 - ((viewR.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                        if (z10) {
                            fVar.h(viewR, i20, 0, i19, 0);
                        } else {
                            fVar.h(viewR, i19, 0, i20, 0);
                        }
                        f10 = measuredWidth4;
                    } else {
                        c11 = 4;
                    }
                    if (this.f52140c == 2) {
                        i16 = paddingLeft;
                        i17 = i25;
                        i18 = i14;
                        layoutParams2 = layoutParams;
                        c10 = c11;
                        if (z10) {
                            this.f52153p.Q(viewR, fVar, Math.round(f14) - viewR.getMeasuredWidth(), paddingTop, Math.round(f14), paddingTop + viewR.getMeasuredHeight());
                        } else {
                            this.f52153p.Q(viewR, fVar, Math.round(f12), paddingTop, Math.round(f12) + viewR.getMeasuredWidth(), paddingTop + viewR.getMeasuredHeight());
                        }
                    } else if (z10) {
                        i17 = i25;
                        i18 = i14;
                        i16 = paddingLeft;
                        layoutParams2 = layoutParams;
                        c10 = c11;
                        this.f52153p.Q(viewR, fVar, Math.round(f14) - viewR.getMeasuredWidth(), paddingBottom - viewR.getMeasuredHeight(), Math.round(f14), paddingBottom);
                    } else {
                        i16 = paddingLeft;
                        i17 = i25;
                        i18 = i14;
                        layoutParams2 = layoutParams;
                        c10 = c11;
                        this.f52153p.Q(viewR, fVar, Math.round(f12), paddingBottom - viewR.getMeasuredHeight(), Math.round(f12) + viewR.getMeasuredWidth(), paddingBottom);
                    }
                    measuredWidth = f12 + viewR.getMeasuredWidth() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams2).rightMargin;
                    float measuredWidth5 = f14 - ((viewR.getMeasuredWidth() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams2).leftMargin);
                    if (z10) {
                        fVar.h(viewR, i20, 0, i19, 0);
                    } else {
                        fVar.h(viewR, i19, 0, i20, 0);
                    }
                    f10 = measuredWidth5;
                }
                i14 = i18 + 1;
                paddingLeft = i16;
                i25 = i17;
                c12 = c10;
            }
            int i211 = paddingLeft;
            int i212 = fVar.f52239g;
            paddingTop += i212;
            paddingBottom -= i212;
            i22++;
            paddingLeft = i211;
        }
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:46:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:47:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:49:0x0101  */
    /* JADX WARN: Code duplicated, block: B:50:0x010d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0119  */
    /* JADX WARN: Code duplicated, block: B:55:0x0121  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x012c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x012e  */
    /* JADX WARN: Code duplicated, block: B:61:0x015d  */
    /* JADX WARN: Code duplicated, block: B:62:0x0185  */
    /* JADX WARN: Code duplicated, block: B:64:0x018f  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:68:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:71:0x0206  */
    private void w(boolean z10, boolean z11, int i10, int i11, int i12, int i13) {
        float f10;
        int i14;
        float f11;
        float f12;
        float fMax;
        int i15;
        int i16;
        View viewR;
        int i17;
        boolean z12;
        char c10;
        LayoutParams layoutParams;
        float f13;
        float f14;
        float f15;
        float f16;
        int i18;
        char c11;
        int i19;
        LayoutParams layoutParams2;
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int paddingRight = getPaddingRight();
        int paddingLeft = getPaddingLeft();
        int i20 = i13 - i11;
        int i21 = (i12 - i10) - paddingRight;
        int size = this.f52154q.size();
        for (int i22 = 0; i22 < size; i22++) {
            f fVar = this.f52154q.get(i22);
            if (t(i22)) {
                int i23 = this.f52150m;
                paddingLeft += i23;
                i21 -= i23;
            }
            int i24 = this.f52141d;
            char c12 = 4;
            boolean z13 = true;
            if (i24 != 0) {
                if (i24 == 1) {
                    int i25 = fVar.f52237e;
                    f10 = (i20 - i25) + paddingBottom;
                    i14 = i25 - paddingTop;
                } else if (i24 == 2) {
                    int i26 = fVar.f52237e;
                    f11 = (i20 - paddingBottom) - ((i20 - i26) / 2.0f);
                    f10 = paddingTop + ((i20 - i26) / 2.0f);
                    f12 = 0.0f;
                } else if (i24 == 3) {
                    f10 = paddingTop;
                    int iD = fVar.d();
                    f12 = (i20 - fVar.f52237e) / (iD != 1 ? iD - 1 : 1.0f);
                    f11 = i20 - paddingBottom;
                } else if (i24 == 4) {
                    int iD2 = fVar.d();
                    f12 = iD2 != 0 ? (i20 - fVar.f52237e) / iD2 : 0.0f;
                    float f17 = f12 / 2.0f;
                    f10 = paddingTop + f17;
                    f11 = (i20 - paddingBottom) - f17;
                } else {
                    if (i24 != 5) {
                        throw new IllegalStateException("Invalid justifyContent is set: " + this.f52141d);
                    }
                    int iD3 = fVar.d();
                    f12 = iD3 != 0 ? (i20 - fVar.f52237e) / (iD3 + 1) : 0.0f;
                    f10 = paddingTop + f12;
                    f11 = (i20 - paddingBottom) - f12;
                }
                fMax = Math.max(f12, 0.0f);
                i15 = 0;
                while (i15 < fVar.f52240h) {
                    i16 = fVar.f52247o + i15;
                    viewR = r(i16);
                    if (viewR != null) {
                        i17 = i15;
                        z12 = z13;
                        c10 = c12;
                    } else if (viewR.getVisibility() == 8) {
                        i17 = i15;
                        z12 = true;
                        c10 = 4;
                    } else {
                        layoutParams = (LayoutParams) viewR.getLayoutParams();
                        f13 = f10 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                        f14 = f11 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                        if (s(i16, i15)) {
                            int i27 = this.f52149l;
                            float f18 = i27;
                            f15 = f13 + f18;
                            i18 = i27;
                            f16 = f14 - f18;
                        } else {
                            f15 = f13;
                            f16 = f14;
                            i18 = 0;
                        }
                        if (i15 == fVar.f52240h - 1) {
                            c11 = 4;
                            i19 = (this.f52147j & 4) > 0 ? this.f52149l : 0;
                            if (z10) {
                                i17 = i15;
                                z12 = true;
                                layoutParams2 = layoutParams;
                                c10 = c11;
                                if (z11) {
                                    this.f52153p.R(viewR, fVar, false, paddingLeft, Math.round(f16) - viewR.getMeasuredHeight(), paddingLeft + viewR.getMeasuredWidth(), Math.round(f16));
                                } else {
                                    this.f52153p.R(viewR, fVar, false, paddingLeft, Math.round(f15), paddingLeft + viewR.getMeasuredWidth(), Math.round(f15) + viewR.getMeasuredHeight());
                                }
                            } else if (z11) {
                                i17 = i15;
                                z12 = true;
                                layoutParams2 = layoutParams;
                                c10 = c11;
                                this.f52153p.R(viewR, fVar, true, i21 - viewR.getMeasuredWidth(), Math.round(f16) - viewR.getMeasuredHeight(), i21, Math.round(f16));
                            } else {
                                i17 = i15;
                                z12 = true;
                                layoutParams2 = layoutParams;
                                c10 = c11;
                                this.f52153p.R(viewR, fVar, true, i21 - viewR.getMeasuredWidth(), Math.round(f15), i21, Math.round(f15) + viewR.getMeasuredHeight());
                            }
                            LayoutParams layoutParams3 = layoutParams2;
                            float measuredHeight = f15 + viewR.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams3).bottomMargin;
                            float measuredHeight2 = f16 - ((viewR.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams3).topMargin);
                            if (z11) {
                                fVar.h(viewR, 0, i19, 0, i18);
                            } else {
                                fVar.h(viewR, 0, i18, 0, i19);
                            }
                            f10 = measuredHeight;
                            f11 = measuredHeight2;
                        } else {
                            c11 = 4;
                        }
                        if (z10) {
                            i17 = i15;
                            z12 = true;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            if (z11) {
                                this.f52153p.R(viewR, fVar, false, paddingLeft, Math.round(f16) - viewR.getMeasuredHeight(), paddingLeft + viewR.getMeasuredWidth(), Math.round(f16));
                            } else {
                                this.f52153p.R(viewR, fVar, false, paddingLeft, Math.round(f15), paddingLeft + viewR.getMeasuredWidth(), Math.round(f15) + viewR.getMeasuredHeight());
                            }
                        } else if (z11) {
                            i17 = i15;
                            z12 = true;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            this.f52153p.R(viewR, fVar, true, i21 - viewR.getMeasuredWidth(), Math.round(f16) - viewR.getMeasuredHeight(), i21, Math.round(f16));
                        } else {
                            i17 = i15;
                            z12 = true;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            this.f52153p.R(viewR, fVar, true, i21 - viewR.getMeasuredWidth(), Math.round(f15), i21, Math.round(f15) + viewR.getMeasuredHeight());
                        }
                        LayoutParams layoutParams4 = layoutParams2;
                        float measuredHeight3 = f15 + viewR.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams4).bottomMargin;
                        float measuredHeight4 = f16 - ((viewR.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams4).topMargin);
                        if (z11) {
                            fVar.h(viewR, 0, i19, 0, i18);
                        } else {
                            fVar.h(viewR, 0, i18, 0, i19);
                        }
                        f10 = measuredHeight3;
                        f11 = measuredHeight4;
                    }
                    i15 = i17 + 1;
                    z13 = z12;
                    c12 = c10;
                }
                int i28 = fVar.f52239g;
                paddingLeft += i28;
                i21 -= i28;
            } else {
                f10 = paddingTop;
                i14 = i20 - paddingBottom;
            }
            f11 = i14;
            f12 = 0.0f;
            fMax = Math.max(f12, 0.0f);
            i15 = 0;
            while (i15 < fVar.f52240h) {
                i16 = fVar.f52247o + i15;
                viewR = r(i16);
                if (viewR != null) {
                    i17 = i15;
                    z12 = z13;
                    c10 = c12;
                } else if (viewR.getVisibility() == 8) {
                    i17 = i15;
                    z12 = true;
                    c10 = 4;
                } else {
                    layoutParams = (LayoutParams) viewR.getLayoutParams();
                    f13 = f10 + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin;
                    f14 = f11 - ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin;
                    if (s(i16, i15)) {
                        int i29 = this.f52149l;
                        float f19 = i29;
                        f15 = f13 + f19;
                        i18 = i29;
                        f16 = f14 - f19;
                    } else {
                        f15 = f13;
                        f16 = f14;
                        i18 = 0;
                    }
                    if (i15 == fVar.f52240h - 1) {
                        c11 = 4;
                        if ((this.f52147j & 4) > 0) {
                        }
                        if (z10) {
                            i17 = i15;
                            z12 = true;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            if (z11) {
                                this.f52153p.R(viewR, fVar, false, paddingLeft, Math.round(f16) - viewR.getMeasuredHeight(), paddingLeft + viewR.getMeasuredWidth(), Math.round(f16));
                            } else {
                                this.f52153p.R(viewR, fVar, false, paddingLeft, Math.round(f15), paddingLeft + viewR.getMeasuredWidth(), Math.round(f15) + viewR.getMeasuredHeight());
                            }
                        } else if (z11) {
                            i17 = i15;
                            z12 = true;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            this.f52153p.R(viewR, fVar, true, i21 - viewR.getMeasuredWidth(), Math.round(f16) - viewR.getMeasuredHeight(), i21, Math.round(f16));
                        } else {
                            i17 = i15;
                            z12 = true;
                            layoutParams2 = layoutParams;
                            c10 = c11;
                            this.f52153p.R(viewR, fVar, true, i21 - viewR.getMeasuredWidth(), Math.round(f15), i21, Math.round(f15) + viewR.getMeasuredHeight());
                        }
                        LayoutParams layoutParams5 = layoutParams2;
                        float measuredHeight5 = f15 + viewR.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams5).bottomMargin;
                        float measuredHeight6 = f16 - ((viewR.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams5).topMargin);
                        if (z11) {
                            fVar.h(viewR, 0, i19, 0, i18);
                        } else {
                            fVar.h(viewR, 0, i18, 0, i19);
                        }
                        f10 = measuredHeight5;
                        f11 = measuredHeight6;
                    } else {
                        c11 = 4;
                    }
                    if (z10) {
                        i17 = i15;
                        z12 = true;
                        layoutParams2 = layoutParams;
                        c10 = c11;
                        if (z11) {
                            this.f52153p.R(viewR, fVar, false, paddingLeft, Math.round(f16) - viewR.getMeasuredHeight(), paddingLeft + viewR.getMeasuredWidth(), Math.round(f16));
                        } else {
                            this.f52153p.R(viewR, fVar, false, paddingLeft, Math.round(f15), paddingLeft + viewR.getMeasuredWidth(), Math.round(f15) + viewR.getMeasuredHeight());
                        }
                    } else if (z11) {
                        i17 = i15;
                        z12 = true;
                        layoutParams2 = layoutParams;
                        c10 = c11;
                        this.f52153p.R(viewR, fVar, true, i21 - viewR.getMeasuredWidth(), Math.round(f16) - viewR.getMeasuredHeight(), i21, Math.round(f16));
                    } else {
                        i17 = i15;
                        z12 = true;
                        layoutParams2 = layoutParams;
                        c10 = c11;
                        this.f52153p.R(viewR, fVar, true, i21 - viewR.getMeasuredWidth(), Math.round(f15), i21, Math.round(f15) + viewR.getMeasuredHeight());
                    }
                    LayoutParams layoutParams6 = layoutParams2;
                    float measuredHeight7 = f15 + viewR.getMeasuredHeight() + fMax + ((ViewGroup.MarginLayoutParams) layoutParams6).bottomMargin;
                    float measuredHeight8 = f16 - ((viewR.getMeasuredHeight() + fMax) + ((ViewGroup.MarginLayoutParams) layoutParams6).topMargin);
                    if (z11) {
                        fVar.h(viewR, 0, i19, 0, i18);
                    } else {
                        fVar.h(viewR, 0, i18, 0, i19);
                    }
                    f10 = measuredHeight7;
                    f11 = measuredHeight8;
                }
                i15 = i17 + 1;
                z13 = z12;
                c12 = c10;
            }
            int i210 = fVar.f52239g;
            paddingLeft += i210;
            i21 -= i210;
        }
    }

    private void x(int i10, int i11) {
        this.f52154q.clear();
        this.f52155r.a();
        this.f52153p.c(this.f52155r, i10, i11);
        this.f52154q = this.f52155r.f52262a;
        this.f52153p.p(i10, i11);
        if (this.f52142e == 3) {
            for (f fVar : this.f52154q) {
                int iMax = Integer.MIN_VALUE;
                for (int i12 = 0; i12 < fVar.f52240h; i12++) {
                    View viewR = r(fVar.f52247o + i12);
                    if (viewR != null && viewR.getVisibility() != 8) {
                        LayoutParams layoutParams = (LayoutParams) viewR.getLayoutParams();
                        iMax = this.f52140c != 2 ? Math.max(iMax, viewR.getMeasuredHeight() + Math.max(fVar.f52244l - viewR.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).topMargin) + ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin) : Math.max(iMax, viewR.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) layoutParams).topMargin + Math.max((fVar.f52244l - viewR.getMeasuredHeight()) + viewR.getBaseline(), ((ViewGroup.MarginLayoutParams) layoutParams).bottomMargin));
                    }
                }
                fVar.f52239g = iMax;
            }
        }
        this.f52153p.o(i10, i11, getPaddingTop() + getPaddingBottom());
        this.f52153p.X();
        z(this.f52139b, i10, i11, this.f52155r.f52263b);
    }

    private void y(int i10, int i11) {
        this.f52154q.clear();
        this.f52155r.a();
        this.f52153p.f(this.f52155r, i10, i11);
        this.f52154q = this.f52155r.f52262a;
        this.f52153p.p(i10, i11);
        this.f52153p.o(i10, i11, getPaddingLeft() + getPaddingRight());
        this.f52153p.X();
        z(this.f52139b, i10, i11, this.f52155r.f52263b);
    }

    private void z(int i10, int i11, int i12, int i13) {
        int sumOfCrossSize;
        int largestMainSize;
        int iResolveSizeAndState;
        int iResolveSizeAndState2;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        if (i10 == 0 || i10 == 1) {
            sumOfCrossSize = getSumOfCrossSize() + getPaddingTop() + getPaddingBottom();
            largestMainSize = getLargestMainSize();
        } else {
            if (i10 != 2 && i10 != 3) {
                throw new IllegalArgumentException("Invalid flex direction: " + i10);
            }
            sumOfCrossSize = getLargestMainSize();
            largestMainSize = getSumOfCrossSize() + getPaddingLeft() + getPaddingRight();
        }
        if (mode == Integer.MIN_VALUE) {
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            } else {
                size = largestMainSize;
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        } else if (mode == 0) {
            iResolveSizeAndState = View.resolveSizeAndState(largestMainSize, i11, i13);
        } else {
            if (mode != 1073741824) {
                throw new IllegalStateException("Unknown width mode is set: " + mode);
            }
            if (size < largestMainSize) {
                i13 = View.combineMeasuredStates(i13, 16777216);
            }
            iResolveSizeAndState = View.resolveSizeAndState(size, i11, i13);
        }
        if (mode2 == Integer.MIN_VALUE) {
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            } else {
                size2 = sumOfCrossSize;
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        } else if (mode2 == 0) {
            iResolveSizeAndState2 = View.resolveSizeAndState(sumOfCrossSize, i12, i13);
        } else {
            if (mode2 != 1073741824) {
                throw new IllegalStateException("Unknown height mode is set: " + mode2);
            }
            if (size2 < sumOfCrossSize) {
                i13 = View.combineMeasuredStates(i13, 256);
            }
            iResolveSizeAndState2 = View.resolveSizeAndState(size2, i12, i13);
        }
        setMeasuredDimension(iResolveSizeAndState, iResolveSizeAndState2);
    }

    @Override // com.google.android.flexbox.d
    public void a(View view, int i10, int i11, f fVar) {
        if (s(i10, i11)) {
            if (k()) {
                int i12 = fVar.f52237e;
                int i13 = this.f52150m;
                fVar.f52237e = i12 + i13;
                fVar.f52238f += i13;
                return;
            }
            int i14 = fVar.f52237e;
            int i15 = this.f52149l;
            fVar.f52237e = i14 + i15;
            fVar.f52238f += i15;
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f52152o == null) {
            this.f52152o = new SparseIntArray(getChildCount());
        }
        this.f52151n = this.f52153p.n(view, i10, layoutParams, this.f52152o);
        super.addView(view, i10, layoutParams);
    }

    @Override // com.google.android.flexbox.d
    public View b(int i10) {
        return getChildAt(i10);
    }

    @Override // com.google.android.flexbox.d
    public int c(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    @Override // com.google.android.flexbox.d
    public int d(View view) {
        return 0;
    }

    @Override // com.google.android.flexbox.d
    public View e(int i10) {
        return r(i10);
    }

    @Override // com.google.android.flexbox.d
    public int f(View view, int i10, int i11) {
        int i12;
        int i13;
        if (k()) {
            i12 = s(i10, i11) ? 0 + this.f52150m : 0;
            if ((this.f52148k & 4) <= 0) {
                return i12;
            }
            i13 = this.f52150m;
        } else {
            i12 = s(i10, i11) ? 0 + this.f52149l : 0;
            if ((this.f52147j & 4) <= 0) {
                return i12;
            }
            i13 = this.f52149l;
        }
        return i12 + i13;
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof LayoutParams) {
            return new LayoutParams((LayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new LayoutParams((ViewGroup.MarginLayoutParams) layoutParams) : new LayoutParams(layoutParams);
    }

    @Override // com.google.android.flexbox.d
    public int getAlignContent() {
        return this.f52143f;
    }

    @Override // com.google.android.flexbox.d
    public int getAlignItems() {
        return this.f52142e;
    }

    @p0
    public Drawable getDividerDrawableHorizontal() {
        return this.f52145h;
    }

    @p0
    public Drawable getDividerDrawableVertical() {
        return this.f52146i;
    }

    @Override // com.google.android.flexbox.d
    public int getFlexDirection() {
        return this.f52139b;
    }

    @Override // com.google.android.flexbox.d
    public int getFlexItemCount() {
        return getChildCount();
    }

    @Override // com.google.android.flexbox.d
    public List<f> getFlexLines() {
        ArrayList arrayList = new ArrayList(this.f52154q.size());
        for (f fVar : this.f52154q) {
            if (fVar.d() != 0) {
                arrayList.add(fVar);
            }
        }
        return arrayList;
    }

    @Override // com.google.android.flexbox.d
    public List<f> getFlexLinesInternal() {
        return this.f52154q;
    }

    @Override // com.google.android.flexbox.d
    public int getFlexWrap() {
        return this.f52140c;
    }

    @Override // com.google.android.flexbox.d
    public int getJustifyContent() {
        return this.f52141d;
    }

    @Override // com.google.android.flexbox.d
    public int getLargestMainSize() {
        Iterator<f> it = this.f52154q.iterator();
        int iMax = Integer.MIN_VALUE;
        while (it.hasNext()) {
            iMax = Math.max(iMax, it.next().f52237e);
        }
        return iMax;
    }

    @Override // com.google.android.flexbox.d
    public int getMaxLine() {
        return this.f52144g;
    }

    public int getShowDividerHorizontal() {
        return this.f52147j;
    }

    public int getShowDividerVertical() {
        return this.f52148k;
    }

    @Override // com.google.android.flexbox.d
    public int getSumOfCrossSize() {
        int size = this.f52154q.size();
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            f fVar = this.f52154q.get(i11);
            if (t(i11)) {
                i10 += k() ? this.f52149l : this.f52150m;
            }
            if (u(i11)) {
                i10 += k() ? this.f52149l : this.f52150m;
            }
            i10 += fVar.f52239g;
        }
        return i10;
    }

    @Override // com.google.android.flexbox.d
    public int h(int i10, int i11, int i12) {
        return ViewGroup.getChildMeasureSpec(i10, i11, i12);
    }

    @Override // com.google.android.flexbox.d
    public void i(f fVar) {
        if (k()) {
            if ((this.f52148k & 4) > 0) {
                int i10 = fVar.f52237e;
                int i11 = this.f52150m;
                fVar.f52237e = i10 + i11;
                fVar.f52238f += i11;
                return;
            }
            return;
        }
        if ((this.f52147j & 4) > 0) {
            int i12 = fVar.f52237e;
            int i13 = this.f52149l;
            fVar.f52237e = i12 + i13;
            fVar.f52238f += i13;
        }
    }

    @Override // com.google.android.flexbox.d
    public void j(int i10, View view) {
    }

    @Override // com.google.android.flexbox.d
    public boolean k() {
        int i10 = this.f52139b;
        return i10 == 0 || i10 == 1;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.f52146i == null && this.f52145h == null) {
            return;
        }
        if (this.f52147j == 0 && this.f52148k == 0) {
            return;
        }
        int iZ = j1.Z(this);
        int i10 = this.f52139b;
        if (i10 == 0) {
            m(canvas, iZ == 1, this.f52140c == 2);
            return;
        }
        if (i10 == 1) {
            m(canvas, iZ != 1, this.f52140c == 2);
            return;
        }
        if (i10 == 2) {
            boolean z10 = iZ == 1;
            if (this.f52140c == 2) {
                z10 = !z10;
            }
            n(canvas, z10, false);
            return;
        }
        if (i10 != 3) {
            return;
        }
        boolean z11 = iZ == 1;
        if (this.f52140c == 2) {
            z11 = !z11;
        }
        n(canvas, z11, true);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        int iZ = j1.Z(this);
        int i14 = this.f52139b;
        if (i14 == 0) {
            v(iZ == 1, i10, i11, i12, i13);
            return;
        }
        if (i14 == 1) {
            v(iZ != 1, i10, i11, i12, i13);
            return;
        }
        if (i14 == 2) {
            z11 = iZ == 1;
            w(this.f52140c == 2 ? !z11 : z11, false, i10, i11, i12, i13);
        } else if (i14 == 3) {
            z11 = iZ == 1;
            w(this.f52140c == 2 ? !z11 : z11, true, i10, i11, i12, i13);
        } else {
            throw new IllegalStateException("Invalid flex direction is set: " + this.f52139b);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f52152o == null) {
            this.f52152o = new SparseIntArray(getChildCount());
        }
        if (this.f52153p.O(this.f52152o)) {
            this.f52151n = this.f52153p.m(this.f52152o);
        }
        int i12 = this.f52139b;
        if (i12 == 0 || i12 == 1) {
            x(i10, i11);
            return;
        }
        if (i12 == 2 || i12 == 3) {
            y(i10, i11);
            return;
        }
        throw new IllegalStateException("Invalid value for the flex direction is set: " + this.f52139b);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    public View r(int i10) {
        if (i10 < 0) {
            return null;
        }
        int[] iArr = this.f52151n;
        if (i10 >= iArr.length) {
            return null;
        }
        return getChildAt(iArr[i10]);
    }

    @Override // com.google.android.flexbox.d
    public void setAlignContent(int i10) {
        if (this.f52143f != i10) {
            this.f52143f = i10;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void setAlignItems(int i10) {
        if (this.f52142e != i10) {
            this.f52142e = i10;
            requestLayout();
        }
    }

    public void setDividerDrawable(Drawable drawable) {
        setDividerDrawableHorizontal(drawable);
        setDividerDrawableVertical(drawable);
    }

    public void setDividerDrawableHorizontal(@p0 Drawable drawable) {
        if (drawable == this.f52145h) {
            return;
        }
        this.f52145h = drawable;
        if (drawable != null) {
            this.f52149l = drawable.getIntrinsicHeight();
        } else {
            this.f52149l = 0;
        }
        A();
        requestLayout();
    }

    public void setDividerDrawableVertical(@p0 Drawable drawable) {
        if (drawable == this.f52146i) {
            return;
        }
        this.f52146i = drawable;
        if (drawable != null) {
            this.f52150m = drawable.getIntrinsicWidth();
        } else {
            this.f52150m = 0;
        }
        A();
        requestLayout();
    }

    @Override // com.google.android.flexbox.d
    public void setFlexDirection(int i10) {
        if (this.f52139b != i10) {
            this.f52139b = i10;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void setFlexLines(List<f> list) {
        this.f52154q = list;
    }

    @Override // com.google.android.flexbox.d
    public void setFlexWrap(int i10) {
        if (this.f52140c != i10) {
            this.f52140c = i10;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void setJustifyContent(int i10) {
        if (this.f52141d != i10) {
            this.f52141d = i10;
            requestLayout();
        }
    }

    @Override // com.google.android.flexbox.d
    public void setMaxLine(int i10) {
        if (this.f52144g != i10) {
            this.f52144g = i10;
            requestLayout();
        }
    }

    public void setShowDivider(int i10) {
        setShowDividerVertical(i10);
        setShowDividerHorizontal(i10);
    }

    public void setShowDividerHorizontal(int i10) {
        if (i10 != this.f52147j) {
            this.f52147j = i10;
            requestLayout();
        }
    }

    public void setShowDividerVertical(int i10) {
        if (i10 != this.f52148k) {
            this.f52148k = i10;
            requestLayout();
        }
    }
}
