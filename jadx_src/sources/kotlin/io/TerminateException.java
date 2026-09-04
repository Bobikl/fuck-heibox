package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Utils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class TerminateException extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TerminateException(@dl.d File file) {
        super(file, null, null, 6, null);
        f0.p(file, "file");
    }
}
