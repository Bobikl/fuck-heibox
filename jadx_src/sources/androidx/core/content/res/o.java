package androidx.core.content.res;

import android.content.res.TypedArray;
import android.graphics.Typeface;
import androidx.annotation.f1;
import androidx.annotation.u;
import androidx.annotation.w0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TypedArray.kt */
/* JADX INFO: loaded from: classes.dex */
@w0(26)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final o f20601a = new o();

    private o() {
    }

    @u
    @dl.d
    @xh.m
    public static final Typeface a(@dl.d TypedArray typedArray, @f1 int i10) {
        f0.p(typedArray, "typedArray");
        Typeface font = typedArray.getFont(i10);
        f0.m(font);
        return font;
    }
}
