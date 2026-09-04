package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import androidx.annotation.f1;
import androidx.annotation.w0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TypedArray.kt */
/* JADX INFO: loaded from: classes.dex */
public final class p {
    private static final void a(TypedArray typedArray, @f1 int i10) {
        if (!typedArray.hasValue(i10)) {
            throw new IllegalArgumentException("Attribute not defined in set.");
        }
    }

    public static final boolean b(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getBoolean(i10, false);
    }

    @androidx.annotation.l
    public static final int c(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getColor(i10, 0);
    }

    @dl.d
    public static final ColorStateList d(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        ColorStateList colorStateList = typedArray.getColorStateList(i10);
        if (colorStateList != null) {
            return colorStateList;
        }
        throw new IllegalStateException("Attribute value was not a color or color state list.".toString());
    }

    public static final float e(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getDimension(i10, 0.0f);
    }

    @androidx.annotation.r
    public static final int f(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getDimensionPixelOffset(i10, 0);
    }

    @androidx.annotation.r
    public static final int g(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getDimensionPixelSize(i10, 0);
    }

    @dl.d
    public static final Drawable h(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        Drawable drawable = typedArray.getDrawable(i10);
        f0.m(drawable);
        return drawable;
    }

    public static final float i(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getFloat(i10, 0.0f);
    }

    @dl.d
    @w0(26)
    public static final Typeface j(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        return o.a(typedArray, i10);
    }

    public static final int k(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getInt(i10, 0);
    }

    public static final int l(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getInteger(i10, 0);
    }

    @androidx.annotation.c
    public static final int m(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        return typedArray.getResourceId(i10, 0);
    }

    @dl.d
    public static final String n(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        String string = typedArray.getString(i10);
        if (string != null) {
            return string;
        }
        throw new IllegalStateException("Attribute value could not be coerced to String.".toString());
    }

    @dl.d
    public static final CharSequence[] o(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        CharSequence[] textArray = typedArray.getTextArray(i10);
        f0.o(textArray, "getTextArray(index)");
        return textArray;
    }

    @dl.d
    public static final CharSequence p(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "<this>");
        a(typedArray, i10);
        CharSequence text = typedArray.getText(i10);
        if (text != null) {
            return text;
        }
        throw new IllegalStateException("Attribute value could not be coerced to CharSequence.".toString());
    }

    public static final <R> R q(@dl.d TypedArray typedArray, @dl.d yh.l<? super TypedArray, ? extends R> block) {
        f0.p(typedArray, "<this>");
        f0.p(block, "block");
        R rInvoke = block.invoke(typedArray);
        typedArray.recycle();
        return rInvoke;
    }
}
