package androidx.compose.ui.node;

import com.umeng.analytics.pro.ak;
import io.flutter.embedding.android.KeyboardMap;
import kotlin.Metadata;

/* JADX INFO: compiled from: HitTestResult.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\"\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"", "distance", "", "isInLayer", "Landroidx/compose/ui/node/f;", ak.av, "(FZ)J", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final long a(float f10, boolean z10) {
        return f.c(((z10 ? 1L : 0L) & KeyboardMap.kValueMask) | (((long) Float.floatToIntBits(f10)) << 32));
    }
}
