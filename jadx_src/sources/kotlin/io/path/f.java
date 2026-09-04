package kotlin.io.path;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Path;
import java.nio.file.attribute.BasicFileAttributes;
import kotlin.u0;
import org.apache.tools.ant.util.s0;
import yh.p;

/* JADX INFO: compiled from: FileVisitorBuilder.kt */
/* JADX INFO: loaded from: classes5.dex */
@u0(version = s0.f136932w)
@e
public interface f {
    void a(@dl.d p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);

    void b(@dl.d p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void c(@dl.d p<? super Path, ? super BasicFileAttributes, ? extends FileVisitResult> pVar);

    void d(@dl.d p<? super Path, ? super IOException, ? extends FileVisitResult> pVar);
}
