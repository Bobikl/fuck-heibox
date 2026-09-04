package androidx.compose.ui.graphics;

import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: TransformOrigin.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0010\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000ø\u0001\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"", "pivotFractionX", "pivotFractionY", "Landroidx/compose/ui/graphics/o2;", ak.av, "(FF)J", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class p2 {
    public static final long a(float f10, float f11) {
        return o2.e((((long) Float.floatToIntBits(f11)) & KeyboardMap.kValueMask) | (Float.floatToIntBits(f10) << 32));
    }
}
