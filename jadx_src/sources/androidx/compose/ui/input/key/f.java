package androidx.compose.ui.input.key;

import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: Key.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0018\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0001\u001a\u00020\u0000*\u00020\u00028Fø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"", "nativeKeyCode", "Landroidx/compose/ui/input/key/a;", ak.av, "(I)J", "b", "(J)I", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class f {
    public static final long a(int i10) {
        return a.C4((((long) i10) << 32) | (((long) 0) & KeyboardMap.kValueMask));
    }

    public static final int b(long j10) {
        return (int) (j10 >> 32);
    }
}
