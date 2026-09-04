package androidx.compose.ui.input.pointer;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: compiled from: SuspendingPointerInputFilter.kt */
/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.o(parameters = 0)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "time", "", "(J)V", "ui_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class PointerEventTimeoutCancellationException extends CancellationException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f14660b = 0;

    public PointerEventTimeoutCancellationException(long j10) {
        super("Timed out waiting for " + j10 + " ms");
    }
}
