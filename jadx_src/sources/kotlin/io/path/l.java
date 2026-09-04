package kotlin.io.path;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class l {
    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean c(j jVar) {
        for (j jVarC = jVar.c(); jVarC != null; jVarC = jVarC.c()) {
            if (jVarC.b() == null || jVar.b() == null) {
                try {
                    if (Files.isSameFile(jVarC.d(), jVar.d())) {
                        return true;
                    }
                } catch (IOException | SecurityException unused) {
                    continue;
                }
            } else if (f0.g(jVarC.b(), jVar.b())) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object d(Path path, LinkOption[] linkOptionArr) {
        try {
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length);
            BasicFileAttributes attributes = Files.readAttributes(path, (Class<BasicFileAttributes>) BasicFileAttributes.class, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length));
            f0.o(attributes, "readAttributes(this, A::class.java, *options)");
            return attributes.fileKey();
        } catch (Throwable unused) {
            return null;
        }
    }
}
