package androidx.core.graphics;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.PorterDuffXfermode;

/* JADX INFO: compiled from: PorterDuff.kt */
/* JADX INFO: loaded from: classes.dex */
public final class s0 {
    @dl.d
    public static final PorterDuffColorFilter a(@dl.d PorterDuff.Mode mode, int i10) {
        kotlin.jvm.internal.f0.p(mode, "<this>");
        return new PorterDuffColorFilter(i10, mode);
    }

    @dl.d
    public static final PorterDuffXfermode b(@dl.d PorterDuff.Mode mode) {
        kotlin.jvm.internal.f0.p(mode, "<this>");
        return new PorterDuffXfermode(mode);
    }
}
