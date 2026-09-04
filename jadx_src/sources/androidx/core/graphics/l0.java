package androidx.core.graphics;

import android.annotation.SuppressLint;
import android.graphics.Path;
import java.util.Collection;

/* JADX INFO: compiled from: Path.kt */
/* JADX INFO: loaded from: classes.dex */
@kotlin.jvm.internal.t0({"SMAP\nPath.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n1#1,85:1\n44#1,3:86\n*S KotlinDebug\n*F\n+ 1 Path.kt\nandroidx/core/graphics/PathKt\n*L\n63#1:86,3\n*E\n"})
@SuppressLint({"ClassVerificationFailure"})
public final class l0 {
    @dl.d
    @androidx.annotation.w0(19)
    public static final Path a(@dl.d Path path, @dl.d Path p10) {
        kotlin.jvm.internal.f0.p(path, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        Path path2 = new Path();
        path2.op(path, p10, Path.Op.INTERSECT);
        return path2;
    }

    @dl.d
    @androidx.annotation.w0(26)
    public static final Iterable<n0> b(@dl.d Path path, float f10) {
        kotlin.jvm.internal.f0.p(path, "<this>");
        Collection<n0> collectionB = p0.b(path, f10);
        kotlin.jvm.internal.f0.o(collectionB, "flatten(this, error)");
        return collectionB;
    }

    public static /* synthetic */ Iterable c(Path path, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            f10 = 0.5f;
        }
        return b(path, f10);
    }

    @dl.d
    @androidx.annotation.w0(19)
    public static final Path d(@dl.d Path path, @dl.d Path p10) {
        kotlin.jvm.internal.f0.p(path, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        Path path2 = new Path(path);
        path2.op(p10, Path.Op.DIFFERENCE);
        return path2;
    }

    @dl.d
    @androidx.annotation.w0(19)
    public static final Path e(@dl.d Path path, @dl.d Path p10) {
        kotlin.jvm.internal.f0.p(path, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        Path path2 = new Path(path);
        path2.op(p10, Path.Op.UNION);
        return path2;
    }

    @dl.d
    @androidx.annotation.w0(19)
    public static final Path f(@dl.d Path path, @dl.d Path p10) {
        kotlin.jvm.internal.f0.p(path, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        Path path2 = new Path(path);
        path2.op(p10, Path.Op.UNION);
        return path2;
    }

    @dl.d
    @androidx.annotation.w0(19)
    public static final Path g(@dl.d Path path, @dl.d Path p10) {
        kotlin.jvm.internal.f0.p(path, "<this>");
        kotlin.jvm.internal.f0.p(p10, "p");
        Path path2 = new Path(path);
        path2.op(p10, Path.Op.XOR);
        return path2;
    }
}
