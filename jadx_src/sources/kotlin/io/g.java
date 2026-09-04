package kotlin.io;

import java.io.File;
import java.util.List;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: FilePathComponents.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final File f124752a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.d
    private final List<File> f124753b;

    /* JADX WARN: Multi-variable type inference failed */
    public g(@dl.d File root, @dl.d List<? extends File> segments) {
        f0.p(root, "root");
        f0.p(segments, "segments");
        this.f124752a = root;
        this.f124753b = segments;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ g d(g gVar, File file, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            file = gVar.f124752a;
        }
        if ((i10 & 2) != 0) {
            list = gVar.f124753b;
        }
        return gVar.c(file, list);
    }

    @dl.d
    public final File a() {
        return this.f124752a;
    }

    @dl.d
    public final List<File> b() {
        return this.f124753b;
    }

    @dl.d
    public final g c(@dl.d File root, @dl.d List<? extends File> segments) {
        f0.p(root, "root");
        f0.p(segments, "segments");
        return new g(root, segments);
    }

    @dl.d
    public final File e() {
        return this.f124752a;
    }

    public boolean equals(@dl.e Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return f0.g(this.f124752a, gVar.f124752a) && f0.g(this.f124753b, gVar.f124753b);
    }

    @dl.d
    public final String f() {
        String path = this.f124752a.getPath();
        f0.o(path, "root.path");
        return path;
    }

    @dl.d
    public final List<File> g() {
        return this.f124753b;
    }

    public final int h() {
        return this.f124753b.size();
    }

    public int hashCode() {
        return (this.f124752a.hashCode() * 31) + this.f124753b.hashCode();
    }

    public final boolean i() {
        String path = this.f124752a.getPath();
        f0.o(path, "root.path");
        return path.length() > 0;
    }

    @dl.d
    public final File j(int i10, int i11) {
        if (i10 < 0 || i10 > i11 || i11 > h()) {
            throw new IllegalArgumentException();
        }
        List<File> listSubList = this.f124753b.subList(i10, i11);
        String separator = File.separator;
        f0.o(separator, "separator");
        return new File(CollectionsKt___CollectionsKt.h3(listSubList, separator, null, null, 0, null, null, 62, null));
    }

    @dl.d
    public String toString() {
        return "FilePathComponents(root=" + this.f124752a + ", segments=" + this.f124753b + ')';
    }
}
