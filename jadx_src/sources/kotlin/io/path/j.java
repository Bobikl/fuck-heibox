package kotlin.io.path;

import java.nio.file.Path;
import java.util.Iterator;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PathTreeWalk.kt */
/* JADX INFO: loaded from: classes5.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @dl.d
    private final Path f124852a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @dl.e
    private final Object f124853b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @dl.e
    private final j f124854c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.e
    private Iterator<j> f124855d;

    public j(@dl.d Path path, @dl.e Object obj, @dl.e j jVar) {
        f0.p(path, "path");
        this.f124852a = path;
        this.f124853b = obj;
        this.f124854c = jVar;
    }

    @dl.e
    public final Iterator<j> a() {
        return this.f124855d;
    }

    @dl.e
    public final Object b() {
        return this.f124853b;
    }

    @dl.e
    public final j c() {
        return this.f124854c;
    }

    @dl.d
    public final Path d() {
        return this.f124852a;
    }

    public final void e(@dl.e Iterator<j> it) {
        this.f124855d = it;
    }
}
