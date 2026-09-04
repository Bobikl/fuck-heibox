package androidx.core.content;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.e1;
import kotlin.b2;

/* JADX INFO: compiled from: Context.kt */
/* JADX INFO: loaded from: classes.dex */
public final class l {
    public static final /* synthetic */ <T> T a(Context context) {
        kotlin.jvm.internal.f0.p(context, "<this>");
        kotlin.jvm.internal.f0.y(4, androidx.exifinterface.media.a.f23244d5);
        return (T) d.o(context, Object.class);
    }

    public static final void b(@dl.d Context context, @e1 int i10, @dl.d int[] attrs, @dl.d yh.l<? super TypedArray, b2> block) {
        kotlin.jvm.internal.f0.p(context, "<this>");
        kotlin.jvm.internal.f0.p(attrs, "attrs");
        kotlin.jvm.internal.f0.p(block, "block");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i10, attrs);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(resourceId, attrs)");
        block.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static final void c(@dl.d Context context, @dl.e AttributeSet attributeSet, @dl.d int[] attrs, @androidx.annotation.f int i10, @e1 int i11, @dl.d yh.l<? super TypedArray, b2> block) {
        kotlin.jvm.internal.f0.p(context, "<this>");
        kotlin.jvm.internal.f0.p(attrs, "attrs");
        kotlin.jvm.internal.f0.p(block, "block");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, attrs, i10, i11);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        block.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static /* synthetic */ void d(Context context, AttributeSet attributeSet, int[] attrs, int i10, int i11, yh.l block, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            attributeSet = null;
        }
        if ((i12 & 4) != 0) {
            i10 = 0;
        }
        if ((i12 & 8) != 0) {
            i11 = 0;
        }
        kotlin.jvm.internal.f0.p(context, "<this>");
        kotlin.jvm.internal.f0.p(attrs, "attrs");
        kotlin.jvm.internal.f0.p(block, "block");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, attrs, i10, i11);
        kotlin.jvm.internal.f0.o(typedArrayObtainStyledAttributes, "obtainStyledAttributes(s…efStyleAttr, defStyleRes)");
        block.invoke(typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
    }
}
