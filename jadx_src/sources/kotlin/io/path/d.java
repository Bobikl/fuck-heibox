package kotlin.io.path;

import java.nio.file.FileSystemException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PathRecursiveFunctions.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f124834a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f124835b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private final List<Exception> f124836c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Path f124837d;

    public d() {
        this(0, 1, null);
    }

    public d(int i10) {
        this.f124834a = i10;
        this.f124836c = new ArrayList();
    }

    public /* synthetic */ d(int i10, int i11, u uVar) {
        this((i11 & 1) != 0 ? 64 : i10);
    }

    public final void a(@dl.d Exception exception) {
        f0.p(exception, "exception");
        this.f124835b++;
        if (this.f124836c.size() < this.f124834a) {
            if (this.f124837d != null) {
                Throwable thInitCause = new FileSystemException(String.valueOf(this.f124837d)).initCause(exception);
                f0.n(thInitCause, "null cannot be cast to non-null type java.nio.file.FileSystemException");
                exception = (FileSystemException) thInitCause;
            }
            this.f124836c.add(exception);
        }
    }

    public final void b(@dl.d Path name) {
        f0.p(name, "name");
        Path path = this.f124837d;
        this.f124837d = path != null ? path.resolve(name) : null;
    }

    public final void c(@dl.d Path name) {
        f0.p(name, "name");
        Path path = this.f124837d;
        if (!f0.g(name, path != null ? path.getFileName() : null)) {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
        Path path2 = this.f124837d;
        this.f124837d = path2 != null ? path2.getParent() : null;
    }

    @dl.d
    public final List<Exception> d() {
        return this.f124836c;
    }

    @dl.e
    public final Path e() {
        return this.f124837d;
    }

    public final int f() {
        return this.f124835b;
    }

    public final void g(@dl.e Path path) {
        this.f124837d = path;
    }
}
