package kotlin.io.path;

import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes5.dex */
@e
public final class b implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final b f124830a = new b();

    private b() {
    }

    @Override // kotlin.io.path.a
    @dl.d
    public CopyActionResult a(@dl.d Path path, @dl.d Path target, boolean z10) {
        f0.p(path, "<this>");
        f0.p(target, "target");
        LinkOption[] linkOptionArrA = i.f124847a.a(z10);
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrA, linkOptionArrA.length);
        if (!Files.isDirectory(path, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length)) || !Files.isDirectory(target, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            CopyOption[] copyOptionArr = (CopyOption[]) Arrays.copyOf(linkOptionArrA, linkOptionArrA.length);
            f0.o(Files.copy(path, target, (CopyOption[]) Arrays.copyOf(copyOptionArr, copyOptionArr.length)), "copy(this, target, *options)");
        }
        return CopyActionResult.CONTINUE;
    }
}
