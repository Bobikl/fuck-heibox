package u1;

import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;
import kotlin.jvm.internal.y;

/* JADX INFO: compiled from: InlineClassHelper.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0018\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0019\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0086\b\u001a\u0011\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a\u0019\u0010\t\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\b2\u0006\u0010\u0002\u001a\u00020\bH\u0086\b\u001a\u0011\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\b\u001a\u0011\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0003H\u0086\b¨\u0006\f"}, d2 = {"", "val1", "val2", "", ak.av, "value", ak.aF, "d", "", "b", "e", "f", "ui-util_release"}, k = 2, mv = {1, 7, 1})
public final class b {
    public static final long a(float f10, float f11) {
        return (((long) Float.floatToIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToIntBits(f10) << 32);
    }

    public static final long b(int i10, int i11) {
        return (((long) i11) & KeyboardMap.kValueMask) | (((long) i10) << 32);
    }

    public static final float c(long j10) {
        y yVar = y.f124996a;
        return Float.intBitsToFloat((int) (j10 >> 32));
    }

    public static final float d(long j10) {
        y yVar = y.f124996a;
        return Float.intBitsToFloat((int) (j10 & KeyboardMap.kValueMask));
    }

    public static final int e(long j10) {
        return (int) (j10 >> 32);
    }

    public static final int f(long j10) {
        return (int) (j10 & KeyboardMap.kValueMask);
    }
}
