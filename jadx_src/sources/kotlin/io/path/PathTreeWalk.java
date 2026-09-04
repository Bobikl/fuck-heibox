package kotlin.io.path;

import java.nio.file.FileSystemLoopException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.b2;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.jvm.internal.c0;
import kotlin.jvm.internal.f0;
import kotlin.sequences.q;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
@e
public final class PathTreeWalk implements kotlin.sequences.m<Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Path f124788a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final PathWalkOption[] f124789b;

    public PathTreeWalk(@dl.d Path start, @dl.d PathWalkOption[] options) {
        f0.p(start, "start");
        f0.p(options, "options");
        this.f124788a = start;
        this.f124789b = options;
    }

    private final Iterator<Path> g() {
        return q.a(new PathTreeWalk$bfsIterator$1(this, null));
    }

    private final Iterator<Path> h() {
        return q.a(new PathTreeWalk$dfsIterator$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean i() {
        return ArraysKt___ArraysKt.T8(this.f124789b, PathWalkOption.FOLLOW_LINKS);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean j() {
        return ArraysKt___ArraysKt.T8(this.f124789b, PathWalkOption.INCLUDE_DIRECTORIES);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LinkOption[] k() {
        return i.f124847a.a(i());
    }

    private final boolean l() {
        return ArraysKt___ArraysKt.T8(this.f124789b, PathWalkOption.BREADTH_FIRST);
    }

    private final Object m(kotlin.sequences.o<? super Path> oVar, j jVar, c cVar, yh.l<? super List<j>, b2> lVar, kotlin.coroutines.c<? super b2> cVar2) throws FileSystemLoopException {
        Path pathD = jVar.d();
        LinkOption[] linkOptionArrK = k();
        LinkOption[] linkOptionArr = (LinkOption[]) Arrays.copyOf(linkOptionArrK, linkOptionArrK.length);
        if (Files.isDirectory(pathD, (LinkOption[]) Arrays.copyOf(linkOptionArr, linkOptionArr.length))) {
            if (l.c(jVar)) {
                throw new FileSystemLoopException(pathD.toString());
            }
            if (j()) {
                c0.e(0);
                oVar.a(pathD, cVar2);
                c0.e(1);
            }
            LinkOption[] linkOptionArrK2 = k();
            LinkOption[] linkOptionArr2 = (LinkOption[]) Arrays.copyOf(linkOptionArrK2, linkOptionArrK2.length);
            if (Files.isDirectory(pathD, (LinkOption[]) Arrays.copyOf(linkOptionArr2, linkOptionArr2.length))) {
                lVar.invoke(cVar.c(jVar));
            }
        } else if (Files.exists(pathD, (LinkOption[]) Arrays.copyOf(new LinkOption[]{LinkOption.NOFOLLOW_LINKS}, 1))) {
            c0.e(0);
            oVar.a(pathD, cVar2);
            c0.e(1);
            return b2.f124493a;
        }
        return b2.f124493a;
    }

    @Override // kotlin.sequences.m
    @dl.d
    public Iterator<Path> iterator() {
        return l() ? g() : h();
    }
}
