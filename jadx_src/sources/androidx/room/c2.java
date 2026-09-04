package androidx.room;

import android.content.Context;
import android.util.Log;
import com.ss.bytertc.base.media.screen.RXScreenCaptureService;
import com.umeng.analytics.pro.ak;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.util.concurrent.Callable;
import kotlin.Metadata;

/* JADX INFO: compiled from: SQLiteCopyOpenHelper.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002BC\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u0006\u0010\"\u001a\u00020\u001f\u0012\u0006\u0010(\u001a\u00020\u0001¢\u0006\u0004\b5\u00106J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\u0010\u0010\f\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u0007H\u0002J\u0010\u0010\u000e\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u0003H\u0017J\b\u0010\u000f\u001a\u00020\u0005H\u0016J\u000e\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0010R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0017R\u0016\u0010\u001a\u001a\u0004\u0018\u00010\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0019R\u001c\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b#\u0010$R\u0016\u0010'\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&R\u001a\u0010(\u001a\u00020\u00018\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0016\u0010.\u001a\u0004\u0018\u00010\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u00102\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00104\u001a\u00020/8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b3\u00101¨\u00067"}, d2 = {"Landroidx/room/c2;", "Lj3/h;", "Landroidx/room/l;", "", "writable", "Lkotlin/b2;", "e", "Ljava/io/File;", "destinationFile", ak.av, "databaseFile", ak.aF, "b", "enabled", "setWriteAheadLoggingEnabled", "close", "Landroidx/room/j;", "databaseConfiguration", "d", "Landroid/content/Context;", "Landroid/content/Context;", com.umeng.analytics.pro.d.R, "", "Ljava/lang/String;", "copyFromAssetPath", "Ljava/io/File;", "copyFromFile", "Ljava/util/concurrent/Callable;", "Ljava/io/InputStream;", "Ljava/util/concurrent/Callable;", "copyFromInputStream", "", "f", "I", "databaseVersion", RXScreenCaptureService.KEY_HEIGHT, "Landroidx/room/j;", "i", "Z", "verified", "delegate", "Lj3/h;", "getDelegate", "()Lj3/h;", "getDatabaseName", "()Ljava/lang/String;", "databaseName", "Lj3/g;", "getWritableDatabase", "()Lj3/g;", "writableDatabase", "getReadableDatabase", "readableDatabase", "<init>", "(Landroid/content/Context;Ljava/lang/String;Ljava/io/File;Ljava/util/concurrent/Callable;ILj3/h;)V", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
public final class c2 implements j3.h, l {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    @dl.d
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final String copyFromAssetPath;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final File copyFromFile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    @dl.e
    private final Callable<InputStream> copyFromInputStream;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int databaseVersion;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @dl.d
    private final j3.h f27091g;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private j databaseConfiguration;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean verified;

    /* JADX INFO: compiled from: SQLiteCopyOpenHelper.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J \u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016J\u0010\u0010\n\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u000b"}, d2 = {"androidx/room/c2$a", "Lj3/h$a;", "Lj3/g;", "db", "Lkotlin/b2;", "d", "", "oldVersion", "newVersion", "g", "f", "room-runtime_release"}, k = 1, mv = {1, 7, 1})
    public static final class a extends j3.h.a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ int f27094d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(int i10, int i11) {
            super(i11);
            this.f27094d = i10;
        }

        @Override // j3.h.a
        public void d(@dl.d j3.g db2) {
            kotlin.jvm.internal.f0.p(db2, "db");
        }

        @Override // j3.h.a
        public void f(@dl.d j3.g db2) {
            kotlin.jvm.internal.f0.p(db2, "db");
            int i10 = this.f27094d;
            if (i10 < 1) {
                db2.p1(i10);
            }
        }

        @Override // j3.h.a
        public void g(@dl.d j3.g db2, int i10, int i11) {
            kotlin.jvm.internal.f0.p(db2, "db");
        }
    }

    public c2(@dl.d Context context, @dl.e String str, @dl.e File file, @dl.e Callable<InputStream> callable, int i10, @dl.d j3.h delegate) {
        kotlin.jvm.internal.f0.p(context, "context");
        kotlin.jvm.internal.f0.p(delegate, "delegate");
        this.context = context;
        this.copyFromAssetPath = str;
        this.copyFromFile = file;
        this.copyFromInputStream = callable;
        this.databaseVersion = i10;
        this.f27091g = delegate;
    }

    private final void a(File file, boolean z10) throws IOException {
        ReadableByteChannel readableByteChannelNewChannel;
        if (this.copyFromAssetPath != null) {
            readableByteChannelNewChannel = Channels.newChannel(this.context.getAssets().open(this.copyFromAssetPath));
            kotlin.jvm.internal.f0.o(readableByteChannelNewChannel, "newChannel(context.assets.open(copyFromAssetPath))");
        } else if (this.copyFromFile != null) {
            readableByteChannelNewChannel = new FileInputStream(this.copyFromFile).getChannel();
            kotlin.jvm.internal.f0.o(readableByteChannelNewChannel, "FileInputStream(copyFromFile).channel");
        } else {
            Callable<InputStream> callable = this.copyFromInputStream;
            if (callable == null) {
                throw new IllegalStateException("copyFromAssetPath, copyFromFile and copyFromInputStream are all null!");
            }
            try {
                readableByteChannelNewChannel = Channels.newChannel(callable.call());
                kotlin.jvm.internal.f0.o(readableByteChannelNewChannel, "newChannel(inputStream)");
            } catch (Exception e10) {
                throw new IOException("inputStreamCallable exception on call", e10);
            }
        }
        File intermediateFile = File.createTempFile("room-copy-helper", ".tmp", this.context.getCacheDir());
        intermediateFile.deleteOnExit();
        FileChannel output = new FileOutputStream(intermediateFile).getChannel();
        kotlin.jvm.internal.f0.o(output, "output");
        androidx.room.util.c.a(readableByteChannelNewChannel, output);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create directories for " + file.getAbsolutePath());
        }
        kotlin.jvm.internal.f0.o(intermediateFile, "intermediateFile");
        c(intermediateFile, z10);
        if (intermediateFile.renameTo(file)) {
            return;
        }
        throw new IOException("Failed to move intermediate file (" + intermediateFile.getAbsolutePath() + ") to destination (" + file.getAbsolutePath() + ").");
    }

    private final j3.h b(File databaseFile) {
        try {
            int iG = androidx.room.util.b.g(databaseFile);
            return new androidx.sqlite.db.framework.e().a(j3.h.b.f124214f.a(this.context).d(databaseFile.getAbsolutePath()).c(new a(iG, fi.u.u(iG, 1))).b());
        } catch (IOException e10) {
            throw new RuntimeException("Malformed database file, unable to read version.", e10);
        }
    }

    private final void c(File file, boolean z10) {
        j jVar = this.databaseConfiguration;
        if (jVar == null) {
            kotlin.jvm.internal.f0.S("databaseConfiguration");
            jVar = null;
        }
        if (jVar.prepackagedDatabaseCallback == null) {
            return;
        }
        j3.h hVarB = b(file);
        try {
            j3.g writableDatabase = z10 ? hVarB.getWritableDatabase() : hVarB.getReadableDatabase();
            j jVar2 = this.databaseConfiguration;
            if (jVar2 == null) {
                kotlin.jvm.internal.f0.S("databaseConfiguration");
                jVar2 = null;
            }
            RoomDatabase.e eVar = jVar2.prepackagedDatabaseCallback;
            kotlin.jvm.internal.f0.m(eVar);
            eVar.a(writableDatabase);
            kotlin.b2 b2Var = kotlin.b2.f124493a;
            kotlin.io.b.a(hVarB, null);
        } catch (Throwable th2) {
            try {
                throw th2;
            } catch (Throwable th3) {
                kotlin.io.b.a(hVarB, th2);
                throw th3;
            }
        }
    }

    private final void e(boolean z10) {
        String name = getName();
        if (name == null) {
            throw new IllegalStateException("Required value was null.".toString());
        }
        File databaseFile = this.context.getDatabasePath(name);
        j jVar = this.databaseConfiguration;
        j jVar2 = null;
        if (jVar == null) {
            kotlin.jvm.internal.f0.S("databaseConfiguration");
            jVar = null;
        }
        boolean z11 = jVar.multiInstanceInvalidation;
        File filesDir = this.context.getFilesDir();
        kotlin.jvm.internal.f0.o(filesDir, "context.filesDir");
        k3.a aVar = new k3.a(name, filesDir, z11);
        try {
            k3.a.c(aVar, false, 1, null);
            if (!databaseFile.exists()) {
                try {
                    kotlin.jvm.internal.f0.o(databaseFile, "databaseFile");
                    a(databaseFile, z10);
                    aVar.d();
                    return;
                } catch (IOException e10) {
                    throw new RuntimeException("Unable to copy database file.", e10);
                }
            }
            try {
                kotlin.jvm.internal.f0.o(databaseFile, "databaseFile");
                int iG = androidx.room.util.b.g(databaseFile);
                if (iG == this.databaseVersion) {
                    aVar.d();
                    return;
                }
                j jVar3 = this.databaseConfiguration;
                if (jVar3 == null) {
                    kotlin.jvm.internal.f0.S("databaseConfiguration");
                } else {
                    jVar2 = jVar3;
                }
                if (jVar2.a(iG, this.databaseVersion)) {
                    aVar.d();
                    return;
                }
                if (this.context.deleteDatabase(name)) {
                    try {
                        a(databaseFile, z10);
                    } catch (IOException e11) {
                        Log.w(t1.f27263b, "Unable to copy database file.", e11);
                    }
                } else {
                    Log.w(t1.f27263b, "Failed to delete database file (" + name + ") for a copy destructive migration.");
                }
                aVar.d();
                return;
            } catch (IOException e12) {
                Log.w(t1.f27263b, "Unable to read database version.", e12);
                aVar.d();
                return;
            }
        } catch (Throwable th2) {
            aVar.d();
            throw th2;
        }
        aVar.d();
        throw th2;
    }

    @Override // j3.h, java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        getF27091g().close();
        this.verified = false;
    }

    public final void d(@dl.d j databaseConfiguration) {
        kotlin.jvm.internal.f0.p(databaseConfiguration, "databaseConfiguration");
        this.databaseConfiguration = databaseConfiguration;
    }

    @Override // j3.h
    @dl.e
    /* JADX INFO: renamed from: getDatabaseName */
    public String getName() {
        return getF27091g().getName();
    }

    @Override // androidx.room.l
    @dl.d
    /* JADX INFO: renamed from: getDelegate, reason: from getter */
    public j3.h getF27091g() {
        return this.f27091g;
    }

    @Override // j3.h
    @dl.d
    public j3.g getReadableDatabase() {
        if (!this.verified) {
            e(false);
            this.verified = true;
        }
        return getF27091g().getReadableDatabase();
    }

    @Override // j3.h
    @dl.d
    public j3.g getWritableDatabase() {
        if (!this.verified) {
            e(true);
            this.verified = true;
        }
        return getF27091g().getWritableDatabase();
    }

    @Override // j3.h
    @androidx.annotation.w0(api = 16)
    public void setWriteAheadLoggingEnabled(boolean z10) {
        getF27091g().setWriteAheadLoggingEnabled(z10);
    }
}
