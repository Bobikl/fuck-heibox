package androidx.compose.ui.platform;

import android.os.Looper;
import kotlin.Metadata;

/* JADX INFO: compiled from: AndroidUiDispatcher.android.kt */
/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {}, d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u001a\b\u0010\u0001\u001a\u00020\u0000H\u0002¨\u0006\u0002"}, d2 = {"", "b", "ui_release"}, k = 2, mv = {1, 7, 1})
public final class b0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean b() {
        return Looper.myLooper() == Looper.getMainLooper();
    }
}
