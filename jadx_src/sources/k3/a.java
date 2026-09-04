package k3;

import android.annotation.SuppressLint;
import android.util.Log;
import androidx.annotation.RestrictTo;
import com.umeng.analytics.pro.ak;
import dl.d;
import dl.e;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: ProcessLock.kt */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(bv = {}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\rB\u001f\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0006\u001a\u00020\u0004¨\u0006\u000e"}, d2 = {"Lk3/a;", "", "", "processLock", "Lkotlin/b2;", "b", "d", "", "name", "Ljava/io/File;", "lockDir", "<init>", "(Ljava/lang/String;Ljava/io/File;Z)V", ak.av, "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class a {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @d
    private static final String f124423f = "SupportSQLiteLock";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f124425a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @d
    private final File f124426b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @d
    @SuppressLint({"SyntheticAccessor"})
    private final Lock f124427c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @e
    private FileChannel f124428d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @d
    public static final C1120a f124422e = new C1120a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @d
    private static final Map<String, Lock> f124424g = new HashMap();

    /* JADX INFO: renamed from: k3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ProcessLock.kt */
    @Metadata(bv = {}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002R\u0014\u0010\u0006\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lk3/a$a;", "", "", "key", "Ljava/util/concurrent/locks/Lock;", "b", "TAG", "Ljava/lang/String;", "", "threadLocksMap", "Ljava/util/Map;", "<init>", "()V", "sqlite-framework_release"}, k = 1, mv = {1, 7, 1})
    public static final class C1120a {
        private C1120a() {
        }

        public /* synthetic */ C1120a(u uVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final Lock b(String key) {
            Lock lock;
            synchronized (a.f124424g) {
                Map map = a.f124424g;
                Object reentrantLock = map.get(key);
                if (reentrantLock == null) {
                    reentrantLock = new ReentrantLock();
                    map.put(key, reentrantLock);
                }
                lock = (Lock) reentrantLock;
            }
            return lock;
        }
    }

    public a(@d String name, @d File lockDir, boolean z10) {
        f0.p(name, "name");
        f0.p(lockDir, "lockDir");
        this.f124425a = z10;
        File file = new File(lockDir, name + ".lck");
        this.f124426b = file;
        C1120a c1120a = f124422e;
        String absolutePath = file.getAbsolutePath();
        f0.o(absolutePath, "lockFile.absolutePath");
        this.f124427c = c1120a.b(absolutePath);
    }

    public static /* synthetic */ void c(a aVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = aVar.f124425a;
        }
        aVar.b(z10);
    }

    public final void b(boolean z10) {
        this.f124427c.lock();
        if (z10) {
            try {
                File parentFile = this.f124426b.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(this.f124426b).getChannel();
                channel.lock();
                this.f124428d = channel;
            } catch (IOException e10) {
                this.f124428d = null;
                Log.w(f124423f, "Unable to grab file lock.", e10);
            }
        }
    }

    public final void d() {
        try {
            FileChannel fileChannel = this.f124428d;
            if (fileChannel != null) {
                fileChannel.close();
            }
        } catch (IOException unused) {
        }
        this.f124427c.unlock();
    }
}
