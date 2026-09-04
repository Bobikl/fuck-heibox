package kotlin.io.path;

import java.nio.file.FileVisitOption;
import java.nio.file.LinkOption;
import java.util.Set;
import kotlin.collections.c1;
import kotlin.collections.d1;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    public static final i f124847a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private static final LinkOption[] f124848b = {LinkOption.NOFOLLOW_LINKS};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private static final LinkOption[] f124849c = new LinkOption[0];

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private static final Set<FileVisitOption> f124850d = d1.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @dl.d
    private static final Set<FileVisitOption> f124851e = c1.f(FileVisitOption.FOLLOW_LINKS);

    private i() {
    }

    @dl.d
    public final LinkOption[] a(boolean z10) {
        return z10 ? f124849c : f124848b;
    }

    @dl.d
    public final Set<FileVisitOption> b(boolean z10) {
        return z10 ? f124851e : f124850d;
    }
}
