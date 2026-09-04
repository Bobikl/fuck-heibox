package androidx.core.graphics.drawable;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import androidx.annotation.w0;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ColorDrawable.kt */
/* JADX INFO: loaded from: classes.dex */
public final class c {
    @dl.d
    public static final ColorDrawable a(@androidx.annotation.l int i10) {
        return new ColorDrawable(i10);
    }

    @dl.d
    @w0(26)
    @SuppressLint({"ClassVerificationFailure"})
    public static final ColorDrawable b(@dl.d Color color) {
        f0.p(color, "<this>");
        return new ColorDrawable(color.toArgb());
    }
}
