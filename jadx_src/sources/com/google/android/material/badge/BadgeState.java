package com.google.android.material.badge;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import androidx.annotation.RestrictTo;
import androidx.annotation.d1;
import androidx.annotation.e1;
import androidx.annotation.f;
import androidx.annotation.f1;
import androidx.annotation.l;
import androidx.annotation.l1;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.r;
import androidx.annotation.s0;
import com.google.android.material.R;
import com.google.android.material.internal.c0;
import com.google.android.material.resources.d;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class BadgeState {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f53063m = 4;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f53064n = "badge";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final State f53065a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final State f53066b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final float f53067c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final float f53068d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final float f53069e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final float f53070f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final float f53071g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final float f53072h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final float f53073i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final int f53074j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final int f53075k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    int f53076l;

    public static final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new a();

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        private static final int f53077y = -1;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final int f53078z = -2;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @l1
        private int f53079b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @l
        private Integer f53080c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @l
        private Integer f53081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @e1
        private Integer f53082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @e1
        private Integer f53083f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @e1
        private Integer f53084g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @e1
        private Integer f53085h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @e1
        private Integer f53086i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f53087j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f53088k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f53089l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private Locale f53090m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        @p0
        private CharSequence f53091n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        @s0
        private int f53092o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        @d1
        private int f53093p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private Integer f53094q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        private Boolean f53095r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        @r(unit = 1)
        private Integer f53096s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        @r(unit = 1)
        private Integer f53097t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        @r(unit = 1)
        private Integer f53098u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        @r(unit = 1)
        private Integer f53099v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        @r(unit = 1)
        private Integer f53100w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        @r(unit = 1)
        private Integer f53101x;

        public class a implements Parcelable.Creator<State> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public State createFromParcel(@n0 Parcel parcel) {
                return new State(parcel);
            }

            @Override // android.os.Parcelable.Creator
            @n0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public State[] newArray(int i10) {
                return new State[i10];
            }
        }

        public State() {
            this.f53087j = 255;
            this.f53088k = -2;
            this.f53089l = -2;
            this.f53095r = Boolean.TRUE;
        }

        State(@n0 Parcel parcel) {
            this.f53087j = 255;
            this.f53088k = -2;
            this.f53089l = -2;
            this.f53095r = Boolean.TRUE;
            this.f53079b = parcel.readInt();
            this.f53080c = (Integer) parcel.readSerializable();
            this.f53081d = (Integer) parcel.readSerializable();
            this.f53082e = (Integer) parcel.readSerializable();
            this.f53083f = (Integer) parcel.readSerializable();
            this.f53084g = (Integer) parcel.readSerializable();
            this.f53085h = (Integer) parcel.readSerializable();
            this.f53086i = (Integer) parcel.readSerializable();
            this.f53087j = parcel.readInt();
            this.f53088k = parcel.readInt();
            this.f53089l = parcel.readInt();
            this.f53091n = parcel.readString();
            this.f53092o = parcel.readInt();
            this.f53094q = (Integer) parcel.readSerializable();
            this.f53096s = (Integer) parcel.readSerializable();
            this.f53097t = (Integer) parcel.readSerializable();
            this.f53098u = (Integer) parcel.readSerializable();
            this.f53099v = (Integer) parcel.readSerializable();
            this.f53100w = (Integer) parcel.readSerializable();
            this.f53101x = (Integer) parcel.readSerializable();
            this.f53095r = (Boolean) parcel.readSerializable();
            this.f53090m = (Locale) parcel.readSerializable();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@n0 Parcel parcel, int i10) {
            parcel.writeInt(this.f53079b);
            parcel.writeSerializable(this.f53080c);
            parcel.writeSerializable(this.f53081d);
            parcel.writeSerializable(this.f53082e);
            parcel.writeSerializable(this.f53083f);
            parcel.writeSerializable(this.f53084g);
            parcel.writeSerializable(this.f53085h);
            parcel.writeSerializable(this.f53086i);
            parcel.writeInt(this.f53087j);
            parcel.writeInt(this.f53088k);
            parcel.writeInt(this.f53089l);
            CharSequence charSequence = this.f53091n;
            parcel.writeString(charSequence == null ? null : charSequence.toString());
            parcel.writeInt(this.f53092o);
            parcel.writeSerializable(this.f53094q);
            parcel.writeSerializable(this.f53096s);
            parcel.writeSerializable(this.f53097t);
            parcel.writeSerializable(this.f53098u);
            parcel.writeSerializable(this.f53099v);
            parcel.writeSerializable(this.f53100w);
            parcel.writeSerializable(this.f53101x);
            parcel.writeSerializable(this.f53095r);
            parcel.writeSerializable(this.f53090m);
        }
    }

    BadgeState(Context context, @l1 int i10, @f int i11, @e1 int i12, @p0 State state) {
        State state2 = new State();
        this.f53066b = state2;
        state = state == null ? new State() : state;
        if (i10 != 0) {
            state.f53079b = i10;
        }
        TypedArray typedArrayB = b(context, state.f53079b, i11, i12);
        Resources resources = context.getResources();
        this.f53067c = typedArrayB.getDimensionPixelSize(R.styleable.Badge_badgeRadius, -1);
        this.f53073i = typedArrayB.getDimensionPixelSize(R.styleable.Badge_badgeWidePadding, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        this.f53074j = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.f53075k = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.f53068d = typedArrayB.getDimensionPixelSize(R.styleable.Badge_badgeWithTextRadius, -1);
        int i13 = R.styleable.Badge_badgeWidth;
        int i14 = R.dimen.m3_badge_size;
        this.f53069e = typedArrayB.getDimension(i13, resources.getDimension(i14));
        int i15 = R.styleable.Badge_badgeWithTextWidth;
        int i16 = R.dimen.m3_badge_with_text_size;
        this.f53071g = typedArrayB.getDimension(i15, resources.getDimension(i16));
        this.f53070f = typedArrayB.getDimension(R.styleable.Badge_badgeHeight, resources.getDimension(i14));
        this.f53072h = typedArrayB.getDimension(R.styleable.Badge_badgeWithTextHeight, resources.getDimension(i16));
        boolean z10 = true;
        this.f53076l = typedArrayB.getInt(R.styleable.Badge_offsetAlignmentMode, 1);
        state2.f53087j = state.f53087j == -2 ? 255 : state.f53087j;
        state2.f53091n = state.f53091n == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : state.f53091n;
        state2.f53092o = state.f53092o == 0 ? R.plurals.mtrl_badge_content_description : state.f53092o;
        state2.f53093p = state.f53093p == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : state.f53093p;
        if (state.f53095r != null && !state.f53095r.booleanValue()) {
            z10 = false;
        }
        state2.f53095r = Boolean.valueOf(z10);
        state2.f53089l = state.f53089l == -2 ? typedArrayB.getInt(R.styleable.Badge_maxCharacterCount, 4) : state.f53089l;
        if (state.f53088k != -2) {
            state2.f53088k = state.f53088k;
        } else {
            int i17 = R.styleable.Badge_number;
            if (typedArrayB.hasValue(i17)) {
                state2.f53088k = typedArrayB.getInt(i17, 0);
            } else {
                state2.f53088k = -1;
            }
        }
        state2.f53083f = Integer.valueOf(state.f53083f == null ? typedArrayB.getResourceId(R.styleable.Badge_badgeShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f53083f.intValue());
        state2.f53084g = Integer.valueOf(state.f53084g == null ? typedArrayB.getResourceId(R.styleable.Badge_badgeShapeAppearanceOverlay, 0) : state.f53084g.intValue());
        state2.f53085h = Integer.valueOf(state.f53085h == null ? typedArrayB.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearance, R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full) : state.f53085h.intValue());
        state2.f53086i = Integer.valueOf(state.f53086i == null ? typedArrayB.getResourceId(R.styleable.Badge_badgeWithTextShapeAppearanceOverlay, 0) : state.f53086i.intValue());
        state2.f53080c = Integer.valueOf(state.f53080c == null ? A(context, typedArrayB, R.styleable.Badge_backgroundColor) : state.f53080c.intValue());
        state2.f53082e = Integer.valueOf(state.f53082e == null ? typedArrayB.getResourceId(R.styleable.Badge_badgeTextAppearance, R.style.TextAppearance_MaterialComponents_Badge) : state.f53082e.intValue());
        if (state.f53081d != null) {
            state2.f53081d = state.f53081d;
        } else {
            int i18 = R.styleable.Badge_badgeTextColor;
            if (typedArrayB.hasValue(i18)) {
                state2.f53081d = Integer.valueOf(A(context, typedArrayB, i18));
            } else {
                state2.f53081d = Integer.valueOf(new d(context, state2.f53082e.intValue()).i().getDefaultColor());
            }
        }
        state2.f53094q = Integer.valueOf(state.f53094q == null ? typedArrayB.getInt(R.styleable.Badge_badgeGravity, 8388661) : state.f53094q.intValue());
        state2.f53096s = Integer.valueOf(state.f53096s == null ? typedArrayB.getDimensionPixelOffset(R.styleable.Badge_horizontalOffset, 0) : state.f53096s.intValue());
        state2.f53097t = Integer.valueOf(state.f53097t == null ? typedArrayB.getDimensionPixelOffset(R.styleable.Badge_verticalOffset, 0) : state.f53097t.intValue());
        state2.f53098u = Integer.valueOf(state.f53098u == null ? typedArrayB.getDimensionPixelOffset(R.styleable.Badge_horizontalOffsetWithText, state2.f53096s.intValue()) : state.f53098u.intValue());
        state2.f53099v = Integer.valueOf(state.f53099v == null ? typedArrayB.getDimensionPixelOffset(R.styleable.Badge_verticalOffsetWithText, state2.f53097t.intValue()) : state.f53099v.intValue());
        state2.f53100w = Integer.valueOf(state.f53100w == null ? 0 : state.f53100w.intValue());
        state2.f53101x = Integer.valueOf(state.f53101x != null ? state.f53101x.intValue() : 0);
        typedArrayB.recycle();
        if (state.f53090m == null) {
            state2.f53090m = Build.VERSION.SDK_INT >= 24 ? Locale.getDefault(Locale.Category.FORMAT) : Locale.getDefault();
        } else {
            state2.f53090m = state.f53090m;
        }
        this.f53065a = state;
    }

    private static int A(Context context, @n0 TypedArray typedArray, @f1 int i10) {
        return com.google.android.material.resources.c.a(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray b(Context context, @l1 int i10, @f int i11, @e1 int i12) {
        AttributeSet attributeSet;
        int styleAttribute;
        if (i10 != 0) {
            AttributeSet attributeSetG = e9.a.g(context, i10, f53064n);
            styleAttribute = attributeSetG.getStyleAttribute();
            attributeSet = attributeSetG;
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        return c0.k(context, attributeSet, R.styleable.f52875t, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    void B(@r(unit = 1) int i10) {
        this.f53065a.f53100w = Integer.valueOf(i10);
        this.f53066b.f53100w = Integer.valueOf(i10);
    }

    void C(@r(unit = 1) int i10) {
        this.f53065a.f53101x = Integer.valueOf(i10);
        this.f53066b.f53101x = Integer.valueOf(i10);
    }

    void D(int i10) {
        this.f53065a.f53087j = i10;
        this.f53066b.f53087j = i10;
    }

    void E(@l int i10) {
        this.f53065a.f53080c = Integer.valueOf(i10);
        this.f53066b.f53080c = Integer.valueOf(i10);
    }

    void F(int i10) {
        this.f53065a.f53094q = Integer.valueOf(i10);
        this.f53066b.f53094q = Integer.valueOf(i10);
    }

    void G(int i10) {
        this.f53065a.f53084g = Integer.valueOf(i10);
        this.f53066b.f53084g = Integer.valueOf(i10);
    }

    void H(int i10) {
        this.f53065a.f53083f = Integer.valueOf(i10);
        this.f53066b.f53083f = Integer.valueOf(i10);
    }

    void I(@l int i10) {
        this.f53065a.f53081d = Integer.valueOf(i10);
        this.f53066b.f53081d = Integer.valueOf(i10);
    }

    void J(int i10) {
        this.f53065a.f53086i = Integer.valueOf(i10);
        this.f53066b.f53086i = Integer.valueOf(i10);
    }

    void K(int i10) {
        this.f53065a.f53085h = Integer.valueOf(i10);
        this.f53066b.f53085h = Integer.valueOf(i10);
    }

    void L(@d1 int i10) {
        this.f53065a.f53093p = i10;
        this.f53066b.f53093p = i10;
    }

    void M(CharSequence charSequence) {
        this.f53065a.f53091n = charSequence;
        this.f53066b.f53091n = charSequence;
    }

    void N(@s0 int i10) {
        this.f53065a.f53092o = i10;
        this.f53066b.f53092o = i10;
    }

    void O(@r(unit = 1) int i10) {
        this.f53065a.f53098u = Integer.valueOf(i10);
        this.f53066b.f53098u = Integer.valueOf(i10);
    }

    void P(@r(unit = 1) int i10) {
        this.f53065a.f53096s = Integer.valueOf(i10);
        this.f53066b.f53096s = Integer.valueOf(i10);
    }

    void Q(int i10) {
        this.f53065a.f53089l = i10;
        this.f53066b.f53089l = i10;
    }

    void R(int i10) {
        this.f53065a.f53088k = i10;
        this.f53066b.f53088k = i10;
    }

    void S(Locale locale) {
        this.f53065a.f53090m = locale;
        this.f53066b.f53090m = locale;
    }

    void T(@e1 int i10) {
        this.f53065a.f53082e = Integer.valueOf(i10);
        this.f53066b.f53082e = Integer.valueOf(i10);
    }

    void U(@r(unit = 1) int i10) {
        this.f53065a.f53099v = Integer.valueOf(i10);
        this.f53066b.f53099v = Integer.valueOf(i10);
    }

    void V(@r(unit = 1) int i10) {
        this.f53065a.f53097t = Integer.valueOf(i10);
        this.f53066b.f53097t = Integer.valueOf(i10);
    }

    void W(boolean z10) {
        this.f53065a.f53095r = Boolean.valueOf(z10);
        this.f53066b.f53095r = Boolean.valueOf(z10);
    }

    void a() {
        R(-1);
    }

    @r(unit = 1)
    int c() {
        return this.f53066b.f53100w.intValue();
    }

    @r(unit = 1)
    int d() {
        return this.f53066b.f53101x.intValue();
    }

    int e() {
        return this.f53066b.f53087j;
    }

    @l
    int f() {
        return this.f53066b.f53080c.intValue();
    }

    int g() {
        return this.f53066b.f53094q.intValue();
    }

    int h() {
        return this.f53066b.f53084g.intValue();
    }

    int i() {
        return this.f53066b.f53083f.intValue();
    }

    @l
    int j() {
        return this.f53066b.f53081d.intValue();
    }

    int k() {
        return this.f53066b.f53086i.intValue();
    }

    int l() {
        return this.f53066b.f53085h.intValue();
    }

    @d1
    int m() {
        return this.f53066b.f53093p;
    }

    CharSequence n() {
        return this.f53066b.f53091n;
    }

    @s0
    int o() {
        return this.f53066b.f53092o;
    }

    @r(unit = 1)
    int p() {
        return this.f53066b.f53098u.intValue();
    }

    @r(unit = 1)
    int q() {
        return this.f53066b.f53096s.intValue();
    }

    int r() {
        return this.f53066b.f53089l;
    }

    int s() {
        return this.f53066b.f53088k;
    }

    Locale t() {
        return this.f53066b.f53090m;
    }

    State u() {
        return this.f53065a;
    }

    @e1
    int v() {
        return this.f53066b.f53082e.intValue();
    }

    @r(unit = 1)
    int w() {
        return this.f53066b.f53099v.intValue();
    }

    @r(unit = 1)
    int x() {
        return this.f53066b.f53097t.intValue();
    }

    boolean y() {
        return this.f53066b.f53088k != -1;
    }

    boolean z() {
        return this.f53066b.f53095r.booleanValue();
    }
}
