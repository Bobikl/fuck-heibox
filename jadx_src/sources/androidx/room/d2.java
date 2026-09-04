package androidx.room;

import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.Metadata;

/* JADX INFO: compiled from: SQLiteCopyOpenHelperFactory.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B3\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\f\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0012\u001a\u00020\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016R\u0016\u0010\b\u001a\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0007R\u0016\u0010\f\u001a\u0004\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, d2 = {"Landroidx/room/d2;", "Lj3/h$c;", "Lj3/h$b;", "configuration", "Lj3/h;", ak.av, "", "Ljava/lang/String;", "mCopyFromAssetPath", "Ljava/io/File;", "b", "Ljava/io/File;", "mCopyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", ak.aF, "Ljava/util/concurrent/Callable;", "mCopyFromInputStream", "mDelegate", "<init>", "(Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;Lj3/h$c;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class d2 implements j3.h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String mCopyFromAssetPath;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final File mCopyFromFile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Callable<InputStream> mCopyFromInputStream;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @dl.d
    private final j3.h.c f27105d;

    public d2(@dl.e String str, @dl.e File file, @dl.e Callable<InputStream> callable, @dl.d j3.h.c mDelegate) {
        kotlin.jvm.internal.f0.p(mDelegate, "mDelegate");
        this.mCopyFromAssetPath = str;
        this.mCopyFromFile = file;
        this.mCopyFromInputStream = callable;
        this.f27105d = mDelegate;
    }

    @Override // j3.h.c
    @dl.d
    public j3.h a(@dl.d j3.h.b configuration) {
        kotlin.jvm.internal.f0.p(configuration, "configuration");
        return new c2(configuration.f124215a, this.mCopyFromAssetPath, this.mCopyFromFile, this.mCopyFromInputStream, configuration.f124217c.f124213a, this.f27105d.a(configuration));
    }
}
