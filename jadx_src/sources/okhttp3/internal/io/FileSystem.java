package okhttp3.internal.io;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import dl.d;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;
import okio.Okio;
import okio.Okio__JvmOkioKt;
import okio.Sink;
import okio.Source;
import org.apache.tools.ant.taskdefs.optional.ejb.g;
import org.apache.tools.ant.taskdefs.optional.j2ee.c;
import xh.e;

/* JADX INFO: compiled from: FileSystem.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(bv = {}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\b\bf\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H&J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H&J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H&¨\u0006\u0015"}, d2 = {"Lokhttp3/internal/io/FileSystem;", "", "Ljava/io/File;", "file", "Lokio/Source;", "source", "Lokio/Sink;", "sink", "appendingSink", "Lkotlin/b2;", c.f135155a, "", "exists", "", UiKitSpanObj.TYPE_SIZE, "from", "to", "rename", g.d.f134963d, "deleteContents", "Companion", "okhttp"}, k = 1, mv = {1, 4, 0})
public interface FileSystem {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    @d
    @e
    public static final FileSystem SYSTEM = new Companion.SystemFileSystem();

    /* JADX INFO: compiled from: FileSystem.kt */
    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0005B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004ø\u0001\u0000¢\u0006\u0002\n\u0000¨\u0006\u0001\u0082\u0002\u0007\n\u0005\b\u0091F0\u0001¨\u0006\u0006"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion;", "", "()V", "SYSTEM", "Lokhttp3/internal/io/FileSystem;", "SystemFileSystem", "okhttp"}, k = 1, mv = {1, 4, 0})
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = null;

        /* JADX INFO: compiled from: FileSystem.kt */
        @Metadata(bv = {}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016J\u0018\u0010\u0011\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\u0010\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016J\b\u0010\u0015\u001a\u00020\u0014H\u0016¨\u0006\u0018"}, d2 = {"Lokhttp3/internal/io/FileSystem$Companion$SystemFileSystem;", "Lokhttp3/internal/io/FileSystem;", "Ljava/io/File;", "file", "Lokio/Source;", "source", "Lokio/Sink;", "sink", "appendingSink", "Lkotlin/b2;", c.f135155a, "", "exists", "", UiKitSpanObj.TYPE_SIZE, "from", "to", "rename", g.d.f134963d, "deleteContents", "", "toString", "<init>", "()V", "okhttp"}, k = 1, mv = {1, 4, 0})
        public static final class SystemFileSystem implements FileSystem {
            @Override // okhttp3.internal.io.FileSystem
            @d
            public Sink appendingSink(@d File file) throws FileNotFoundException {
                f0.p(file, "file");
                try {
                    return Okio.appendingSink(file);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio.appendingSink(file);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public void delete(@d File file) throws IOException {
                f0.p(file, "file");
                if (file.delete() || !file.exists()) {
                    return;
                }
                throw new IOException("failed to delete " + file);
            }

            @Override // okhttp3.internal.io.FileSystem
            public void deleteContents(@d File directory) throws IOException {
                f0.p(directory, "directory");
                File[] fileArrListFiles = directory.listFiles();
                if (fileArrListFiles == null) {
                    throw new IOException("not a readable directory: " + directory);
                }
                for (File file : fileArrListFiles) {
                    f0.o(file, "file");
                    if (file.isDirectory()) {
                        deleteContents(file);
                    }
                    if (!file.delete()) {
                        throw new IOException("failed to delete " + file);
                    }
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public boolean exists(@d File file) {
                f0.p(file, "file");
                return file.exists();
            }

            @Override // okhttp3.internal.io.FileSystem
            public void rename(@d File from, @d File to) throws IOException {
                f0.p(from, "from");
                f0.p(to, "to");
                delete(to);
                if (from.renameTo(to)) {
                    return;
                }
                throw new IOException("failed to rename " + from + " to " + to);
            }

            @Override // okhttp3.internal.io.FileSystem
            @d
            public Sink sink(@d File file) throws FileNotFoundException {
                f0.p(file, "file");
                try {
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                } catch (FileNotFoundException unused) {
                    file.getParentFile().mkdirs();
                    return Okio__JvmOkioKt.sink$default(file, false, 1, null);
                }
            }

            @Override // okhttp3.internal.io.FileSystem
            public long size(@d File file) {
                f0.p(file, "file");
                return file.length();
            }

            @Override // okhttp3.internal.io.FileSystem
            @d
            public Source source(@d File file) throws FileNotFoundException {
                f0.p(file, "file");
                return Okio.source(file);
            }

            @d
            public String toString() {
                return "FileSystem.SYSTEM";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    @d
    Sink appendingSink(@d File file) throws FileNotFoundException;

    void delete(@d File file) throws IOException;

    void deleteContents(@d File file) throws IOException;

    boolean exists(@d File file);

    void rename(@d File file, @d File file2) throws IOException;

    @d
    Sink sink(@d File file) throws FileNotFoundException;

    long size(@d File file);

    @d
    Source source(@d File file) throws FileNotFoundException;
}
