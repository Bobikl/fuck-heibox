package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: FileVisitorBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class h extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.e
    private final p<Path, BasicFileAttributes, FileVisitResult> f124843a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final p<Path, BasicFileAttributes, FileVisitResult> f124844b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final p<Path, IOException, FileVisitResult> f124845c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private final p<Path, IOException, FileVisitResult> f124846d;

    /* JADX WARN: Multi-variable type inference failed */
    public h(@dl.e p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar, @dl.e p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar2, @dl.e p<? super Path, ? super IOException, ? extends FileVisitResult> pVar3, @dl.e p<? super Path, ? super IOException, ? extends FileVisitResult> pVar4) {
        this.f124843a = pVar;
        this.f124844b = pVar2;
        this.f124845c = pVar3;
        this.f124846d = pVar4;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @dl.d
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public FileVisitResult postVisitDirectory(@dl.d Path dir, @dl.e IOException iOException) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        f0.p(dir, "dir");
        p<Path, IOException, FileVisitResult> pVar = this.f124846d;
        if (pVar != null && (fileVisitResultInvoke = pVar.invoke(dir, iOException)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPostVisitDirectory = super.postVisitDirectory(dir, iOException);
        f0.o(fileVisitResultPostVisitDirectory, "super.postVisitDirectory(dir, exc)");
        return fileVisitResultPostVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @dl.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@dl.d Path dir, @dl.d BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        f0.p(dir, "dir");
        f0.p(attrs, "attrs");
        p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f124843a;
        if (pVar != null && (fileVisitResultInvoke = pVar.invoke(dir, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        f0.o(fileVisitResultPreVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return fileVisitResultPreVisitDirectory;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @dl.d
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@dl.d Path file, @dl.d BasicFileAttributes attrs) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        f0.p(file, "file");
        f0.p(attrs, "attrs");
        p<Path, BasicFileAttributes, FileVisitResult> pVar = this.f124844b;
        if (pVar != null && (fileVisitResultInvoke = pVar.invoke(file, attrs)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        f0.o(fileVisitResultVisitFile, "super.visitFile(file, attrs)");
        return fileVisitResultVisitFile;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFileFailed(@dl.d Path file, @dl.d IOException exc) throws IOException {
        FileVisitResult fileVisitResultInvoke;
        f0.p(file, "file");
        f0.p(exc, "exc");
        p<Path, IOException, FileVisitResult> pVar = this.f124845c;
        if (pVar != null && (fileVisitResultInvoke = pVar.invoke(file, exc)) != null) {
            return fileVisitResultInvoke;
        }
        FileVisitResult fileVisitResultVisitFileFailed = super.visitFileFailed(file, exc);
        f0.o(fileVisitResultVisitFileFailed, "super.visitFileFailed(file, exc)");
        return fileVisitResultVisitFileFailed;
    }
}
