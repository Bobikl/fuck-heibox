package androidx.collection;

import io.flutter.embedding.android.KeyboardMap;

/* JADX INFO: compiled from: PackingUtils.kt */
/* JADX INFO: loaded from: classes.dex */
public final class g2 {
    public static final long a(float f10, float f11) {
        return (((long) Float.floatToRawIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToRawIntBits(f10) << 32);
    }

    public static final long b(int i10, int i11) {
        return (((long) i11) & KeyboardMap.kValueMask) | (((long) i10) << 32);
    }
}
