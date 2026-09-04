package kotlin.io;

import java.io.File;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FileTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
public class k extends FilesKt__FileReadWriteKt {
    @dl.d
    public static final h J(@dl.d File file, @dl.d FileWalkDirection direction) {
        f0.p(file, "<this>");
        f0.p(direction, "direction");
        return new h(file, direction);
    }

    public static /* synthetic */ h K(File file, FileWalkDirection fileWalkDirection, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            fileWalkDirection = FileWalkDirection.TOP_DOWN;
        }
        return J(file, fileWalkDirection);
    }

    @dl.d
    public static final h L(@dl.d File file) {
        f0.p(file, "<this>");
        return J(file, FileWalkDirection.BOTTOM_UP);
    }

    @dl.d
    public static final h M(@dl.d File file) {
        f0.p(file, "<this>");
        return J(file, FileWalkDirection.TOP_DOWN);
    }
}
