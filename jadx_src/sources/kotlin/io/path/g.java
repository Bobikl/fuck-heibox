package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.FileVisitor;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: FileVisitorBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@e
public final class g implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f124838a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> f124839b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private p<? super Path, ? super IOException, ? extends FileVisitResult> f124840c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private p<? super Path, ? super IOException, ? extends FileVisitResult> f124841d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f124842e;

    private final void f() {
        if (this.f124842e) {
            throw new IllegalStateException("This builder was already built");
        }
    }

    private final void g(Object obj, String str) {
        if (obj == null) {
            return;
        }
        throw new IllegalStateException(str + " was already defined");
    }

    @Override // kotlin.io.path.f
    public void a(@dl.d p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        f0.p(function, "function");
        f();
        g(this.f124841d, "onPostVisitDirectory");
        this.f124841d = function;
    }

    @Override // kotlin.io.path.f
    public void b(@dl.d p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        f0.p(function, "function");
        f();
        g(this.f124839b, "onVisitFile");
        this.f124839b = function;
    }

    @Override // kotlin.io.path.f
    public void c(@dl.d p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> function) {
        f0.p(function, "function");
        f();
        g(this.f124838a, "onPreVisitDirectory");
        this.f124838a = function;
    }

    @Override // kotlin.io.path.f
    public void d(@dl.d p<? super Path, ? super IOException, ? extends FileVisitResult> function) {
        f0.p(function, "function");
        f();
        g(this.f124840c, "onVisitFileFailed");
        this.f124840c = function;
    }

    @dl.d
    public final FileVisitor<Path> e() {
        f();
        this.f124842e = true;
        return new h(this.f124838a, this.f124839b, this.f124840c, this.f124841d);
    }
}
