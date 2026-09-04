package kotlin.io.path;

import java.nio.file.Path;
import java.nio.file.Paths;
import kotlin.jvm.internal.f0;
import kotlin.text.StringsKt___StringsKt;
import kotlin.text.u;

/* JADX INFO: compiled from: PathUtils.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final k f124856a = new k();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Path f124857b = Paths.get("", new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Path f124858c = Paths.get("..", new String[0]);

    private k() {
    }

    @dl.d
    public final Path a(@dl.d Path path, @dl.d Path base) {
        f0.p(path, "path");
        f0.p(base, "base");
        Path pathNormalize = base.normalize();
        Path r10 = path.normalize();
        Path pathRelativize = pathNormalize.relativize(r10);
        int iMin = Math.min(pathNormalize.getNameCount(), r10.getNameCount());
        for (int i10 = 0; i10 < iMin; i10++) {
            Path name = pathNormalize.getName(i10);
            Path path2 = f124858c;
            if (!f0.g(name, path2)) {
                break;
            }
            if (!f0.g(r10.getName(i10), path2)) {
                throw new IllegalArgumentException("Unable to compute relative path");
            }
        }
        if (f0.g(r10, pathNormalize) || !f0.g(pathNormalize, f124857b)) {
            String string = pathRelativize.toString();
            String separator = pathRelativize.getFileSystem().getSeparator();
            f0.o(separator, "rn.fileSystem.separator");
            r10 = u.K1(string, separator, false, 2, null) ? pathRelativize.getFileSystem().getPath(StringsKt___StringsKt.D6(string, pathRelativize.getFileSystem().getSeparator().length()), new String[0]) : pathRelativize;
        }
        f0.o(r10, "r");
        return r10;
    }
}
