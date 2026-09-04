package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: Exceptions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class AccessDeniedException extends FileSystemException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AccessDeniedException(@dl.d File file, @dl.e File file2, @dl.e String str) {
        super(file, file2, str);
        f0.p(file, "file");
    }

    public /* synthetic */ AccessDeniedException(File file, File file2, String str, int i10, u uVar) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }
}
