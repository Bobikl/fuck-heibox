package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class c extends SimpleFileVisitor<Path> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f124831a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private j f124832b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.d
    private kotlin.collections.i<j> f124833c = new kotlin.collections.i<>();

    public c(boolean z10) {
        this.f124831a = z10;
    }

    public final boolean a() {
        return this.f124831a;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @dl.d
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public FileVisitResult preVisitDirectory(@dl.d Path dir, @dl.d BasicFileAttributes attrs) throws IOException {
        f0.p(dir, "dir");
        f0.p(attrs, "attrs");
        this.f124833c.add(new j(dir, attrs.fileKey(), this.f124832b));
        FileVisitResult fileVisitResultPreVisitDirectory = super.preVisitDirectory(dir, attrs);
        f0.o(fileVisitResultPreVisitDirectory, "super.preVisitDirectory(dir, attrs)");
        return fileVisitResultPreVisitDirectory;
    }

    @dl.d
    public final List<j> c(@dl.d j directoryNode) throws IOException {
        f0.p(directoryNode, "directoryNode");
        this.f124832b = directoryNode;
        Files.walkFileTree(directoryNode.d(), i.f124847a.b(this.f124831a), 1, this);
        this.f124833c.removeFirst();
        kotlin.collections.i<j> iVar = this.f124833c;
        this.f124833c = new kotlin.collections.i<>();
        return iVar;
    }

    @Override // java.nio.file.SimpleFileVisitor, java.nio.file.FileVisitor
    @dl.d
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public FileVisitResult visitFile(@dl.d Path file, @dl.d BasicFileAttributes attrs) throws IOException {
        f0.p(file, "file");
        f0.p(attrs, "attrs");
        this.f124833c.add(new j(file, null, this.f124832b));
        FileVisitResult fileVisitResultVisitFile = super.visitFile(file, attrs);
        f0.o(fileVisitResultVisitFile, "super.visitFile(file, attrs)");
        return fileVisitResultVisitFile;
    }
}
