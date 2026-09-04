package com.google.android.exoplayer2.upstream.cache;

import android.os.ConditionVariable;
import androidx.annotation.k1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.util.u0;
import java.io.File;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/* JADX INFO: compiled from: SimpleCache.java */
/* JADX INFO: loaded from: classes7.dex */
public final class t implements Cache {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f51071m = "SimpleCache";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f51072n = 10;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final String f51073o = ".uid";

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final HashSet<File> f51074p = new HashSet<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f51075b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b f51076c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final k f51077d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private final d f51078e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HashMap<String, ArrayList<Cache.a>> f51079f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Random f51080g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final boolean f51081h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f51082i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f51083j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f51084k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Cache.CacheException f51085l;

    /* JADX INFO: compiled from: SimpleCache.java */
    public class a extends Thread {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ConditionVariable f51086b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String str, ConditionVariable conditionVariable) {
            super(str);
            this.f51086b = conditionVariable;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            synchronized (t.this) {
                this.f51086b.open();
                t.this.i();
                t.this.f51076c.d();
            }
        }
    }

    @Deprecated
    public t(File file, b bVar) {
        this(file, bVar, (byte[]) null, false);
    }

    t(File file, b bVar, k kVar, @p0 d dVar) {
        if (!D(file)) {
            String strValueOf = String.valueOf(file);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 46);
            sb2.append("Another SimpleCache instance uses the folder: ");
            sb2.append(strValueOf);
            throw new IllegalStateException(sb2.toString());
        }
        this.f51075b = file;
        this.f51076c = bVar;
        this.f51077d = kVar;
        this.f51078e = dVar;
        this.f51079f = new HashMap<>();
        this.f51080g = new Random();
        this.f51081h = bVar.b();
        this.f51082i = -1L;
        ConditionVariable conditionVariable = new ConditionVariable();
        new a("ExoPlayer:SimpleCacheInit", conditionVariable).start();
        conditionVariable.block();
    }

    public t(File file, b bVar, o8.b bVar2) {
        this(file, bVar, bVar2, null, false, false);
    }

    public t(File file, b bVar, @p0 o8.b bVar2, @p0 byte[] bArr, boolean z10, boolean z11) {
        this(file, bVar, new k(bVar2, file, bArr, z10, z11), (bVar2 == null || z11) ? null : new d(bVar2));
    }

    @Deprecated
    public t(File file, b bVar, @p0 byte[] bArr) {
        this(file, bVar, bArr, bArr != null);
    }

    @Deprecated
    public t(File file, b bVar, @p0 byte[] bArr, boolean z10) {
        this(file, bVar, null, bArr, z10, true);
    }

    private static synchronized boolean D(File file) {
        return f51074p.add(file.getAbsoluteFile());
    }

    private void E(u uVar) {
        ArrayList<Cache.a> arrayList = this.f51079f.get(uVar.f51001b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).a(this, uVar);
            }
        }
        this.f51076c.a(this, uVar);
    }

    private void F(h hVar) {
        ArrayList<Cache.a> arrayList = this.f51079f.get(hVar.f51001b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).e(this, hVar);
            }
        }
        this.f51076c.e(this, hVar);
    }

    private void G(u uVar, h hVar) {
        ArrayList<Cache.a> arrayList = this.f51079f.get(uVar.f51001b);
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                arrayList.get(size).f(this, uVar, hVar);
            }
        }
        this.f51076c.f(this, uVar, hVar);
    }

    private static long H(String str) {
        return Long.parseLong(str.substring(0, str.indexOf(46)), 16);
    }

    private void I(h hVar) {
        j jVarH = this.f51077d.h(hVar.f51001b);
        if (jVarH == null || !jVarH.k(hVar)) {
            return;
        }
        this.f51083j -= hVar.f51003d;
        if (this.f51078e != null) {
            String name = hVar.f51005f.getName();
            try {
                this.f51078e.g(name);
            } catch (IOException unused) {
                String strValueOf = String.valueOf(name);
                com.google.android.exoplayer2.util.u.m(f51071m, strValueOf.length() != 0 ? "Failed to remove file index entry for: ".concat(strValueOf) : new String("Failed to remove file index entry for: "));
            }
        }
        this.f51077d.r(jVarH.f51020b);
        F(hVar);
    }

    private void J() {
        ArrayList arrayList = new ArrayList();
        Iterator<j> it = this.f51077d.i().iterator();
        while (it.hasNext()) {
            for (u uVar : it.next().f()) {
                if (uVar.f51005f.length() != uVar.f51003d) {
                    arrayList.add(uVar);
                }
            }
        }
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            I((h) arrayList.get(i10));
        }
    }

    private u K(String str, u uVar) {
        if (!this.f51081h) {
            return uVar;
        }
        String name = ((File) com.google.android.exoplayer2.util.a.g(uVar.f51005f)).getName();
        long j10 = uVar.f51003d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        boolean z10 = false;
        d dVar = this.f51078e;
        if (dVar != null) {
            try {
                dVar.i(name, j10, jCurrentTimeMillis);
            } catch (IOException unused) {
                com.google.android.exoplayer2.util.u.m(f51071m, "Failed to update index with new touch timestamp.");
            }
        } else {
            z10 = true;
        }
        u uVarL = this.f51077d.h(str).l(uVar, jCurrentTimeMillis, z10);
        G(uVar, uVarL);
        return uVarL;
    }

    private static synchronized void L(File file) {
        f51074p.remove(file.getAbsoluteFile());
    }

    private void c(u uVar) {
        this.f51077d.o(uVar.f51001b).a(uVar);
        this.f51083j += uVar.f51003d;
        E(uVar);
    }

    private static void e(File file) throws Cache.CacheException {
        if (file.mkdirs() || file.isDirectory()) {
            return;
        }
        String strValueOf = String.valueOf(file);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 34);
        sb2.append("Failed to create cache directory: ");
        sb2.append(strValueOf);
        String string = sb2.toString();
        com.google.android.exoplayer2.util.u.d(f51071m, string);
        throw new Cache.CacheException(string);
    }

    private static long f(File file) throws IOException {
        long jNextLong = new SecureRandom().nextLong();
        long jAbs = jNextLong == Long.MIN_VALUE ? 0L : Math.abs(jNextLong);
        String strValueOf = String.valueOf(Long.toString(jAbs, 16));
        File file2 = new File(file, f51073o.length() != 0 ? strValueOf.concat(f51073o) : new String(strValueOf));
        if (file2.createNewFile()) {
            return jAbs;
        }
        String strValueOf2 = String.valueOf(file2);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 27);
        sb2.append("Failed to create UID file: ");
        sb2.append(strValueOf2);
        throw new IOException(sb2.toString());
    }

    @k1
    public static void g(File file, @p0 o8.b bVar) {
        if (file.exists()) {
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles == null) {
                file.delete();
                return;
            }
            if (bVar != null) {
                long jL = l(fileArrListFiles);
                if (jL != -1) {
                    try {
                        d.a(bVar, jL);
                    } catch (DatabaseIOException unused) {
                        StringBuilder sb2 = new StringBuilder(52);
                        sb2.append("Failed to delete file metadata: ");
                        sb2.append(jL);
                        com.google.android.exoplayer2.util.u.m(f51071m, sb2.toString());
                    }
                    try {
                        k.g(bVar, jL);
                    } catch (DatabaseIOException unused2) {
                        StringBuilder sb3 = new StringBuilder(52);
                        sb3.append("Failed to delete file metadata: ");
                        sb3.append(jL);
                        com.google.android.exoplayer2.util.u.m(f51071m, sb3.toString());
                    }
                }
            }
            u0.g1(file);
        }
    }

    private u h(String str, long j10, long j11) {
        u uVarE;
        j jVarH = this.f51077d.h(str);
        if (jVarH == null) {
            return u.g(str, j10, j11);
        }
        while (true) {
            uVarE = jVarH.e(j10, j11);
            if (!uVarE.f51004e || uVarE.f51005f.length() == uVarE.f51003d) {
                break;
            }
            J();
        }
        return uVarE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i() {
        if (!this.f51075b.exists()) {
            try {
                e(this.f51075b);
            } catch (Cache.CacheException e10) {
                this.f51085l = e10;
                return;
            }
        }
        File[] fileArrListFiles = this.f51075b.listFiles();
        if (fileArrListFiles == null) {
            String strValueOf = String.valueOf(this.f51075b);
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 38);
            sb2.append("Failed to list cache directory files: ");
            sb2.append(strValueOf);
            String string = sb2.toString();
            com.google.android.exoplayer2.util.u.d(f51071m, string);
            this.f51085l = new Cache.CacheException(string);
            return;
        }
        long jL = l(fileArrListFiles);
        this.f51082i = jL;
        if (jL == -1) {
            try {
                this.f51082i = f(this.f51075b);
            } catch (IOException e11) {
                String strValueOf2 = String.valueOf(this.f51075b);
                StringBuilder sb3 = new StringBuilder(strValueOf2.length() + 28);
                sb3.append("Failed to create cache UID: ");
                sb3.append(strValueOf2);
                String string2 = sb3.toString();
                com.google.android.exoplayer2.util.u.e(f51071m, string2, e11);
                this.f51085l = new Cache.CacheException(string2, e11);
                return;
            }
        }
        try {
            this.f51077d.p(this.f51082i);
            d dVar = this.f51078e;
            if (dVar != null) {
                dVar.f(this.f51082i);
                Map<String, c> mapC = this.f51078e.c();
                k(this.f51075b, true, fileArrListFiles, mapC);
                this.f51078e.h(mapC.keySet());
            } else {
                k(this.f51075b, true, fileArrListFiles, null);
            }
            this.f51077d.t();
            try {
                this.f51077d.u();
            } catch (IOException e12) {
                com.google.android.exoplayer2.util.u.e(f51071m, "Storing index file failed", e12);
            }
        } catch (IOException e13) {
            String strValueOf3 = String.valueOf(this.f51075b);
            StringBuilder sb4 = new StringBuilder(strValueOf3.length() + 36);
            sb4.append("Failed to initialize cache indices: ");
            sb4.append(strValueOf3);
            String string3 = sb4.toString();
            com.google.android.exoplayer2.util.u.e(f51071m, string3, e13);
            this.f51085l = new Cache.CacheException(string3, e13);
        }
    }

    public static synchronized boolean j(File file) {
        return f51074p.contains(file.getAbsoluteFile());
    }

    private void k(File file, boolean z10, @p0 File[] fileArr, @p0 Map<String, c> map) {
        if (fileArr == null || fileArr.length == 0) {
            if (z10) {
                return;
            }
            file.delete();
            return;
        }
        for (File file2 : fileArr) {
            String name = file2.getName();
            if (z10 && name.indexOf(46) == -1) {
                k(file2, false, file2.listFiles(), map);
            } else if (!z10 || (!k.q(name) && !name.endsWith(f51073o))) {
                long j10 = -1;
                long j11 = com.google.android.exoplayer2.j.f46377b;
                c cVarRemove = map != null ? map.remove(name) : null;
                if (cVarRemove != null) {
                    j10 = cVarRemove.f50985a;
                    j11 = cVarRemove.f50986b;
                }
                u uVarE = u.e(file2, j10, j11, this.f51077d);
                if (uVarE != null) {
                    c(uVarE);
                } else {
                    file2.delete();
                }
            }
        }
    }

    private static long l(File[] fileArr) {
        int length = fileArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            File file = fileArr[i10];
            String name = file.getName();
            if (name.endsWith(f51073o)) {
                try {
                    return H(name);
                } catch (NumberFormatException unused) {
                    String strValueOf = String.valueOf(file);
                    StringBuilder sb2 = new StringBuilder(strValueOf.length() + 20);
                    sb2.append("Malformed UID file: ");
                    sb2.append(strValueOf);
                    com.google.android.exoplayer2.util.u.d(f51071m, sb2.toString());
                    file.delete();
                }
            }
        }
        return -1L;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void A(h hVar) {
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        j jVar = (j) com.google.android.exoplayer2.util.a.g(this.f51077d.h(hVar.f51001b));
        jVar.m(hVar.f51002c);
        this.f51077d.r(jVar.f51020b);
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void B(File file, long j10) throws Cache.CacheException {
        boolean z10 = true;
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        if (file.exists()) {
            if (j10 == 0) {
                file.delete();
                return;
            }
            u uVar = (u) com.google.android.exoplayer2.util.a.g(u.f(file, j10, this.f51077d));
            j jVar = (j) com.google.android.exoplayer2.util.a.g(this.f51077d.h(uVar.f51001b));
            com.google.android.exoplayer2.util.a.i(jVar.h(uVar.f51002c, uVar.f51003d));
            long jA = l.a(jVar.d());
            if (jA != -1) {
                if (uVar.f51002c + uVar.f51003d > jA) {
                    z10 = false;
                }
                com.google.android.exoplayer2.util.a.i(z10);
            }
            if (this.f51078e == null) {
                c(uVar);
                this.f51077d.u();
                notifyAll();
                return;
            }
            try {
                this.f51078e.i(file.getName(), uVar.f51003d, uVar.f51006g);
                c(uVar);
                try {
                    this.f51077d.u();
                    notifyAll();
                    return;
                } catch (IOException e10) {
                    throw new Cache.CacheException(e10);
                }
            } catch (IOException e11) {
                throw new Cache.CacheException(e11);
            }
            throw th;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<h> C(String str) {
        j jVarH;
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        jVarH = this.f51077d.h(str);
        return (jVarH == null || jVarH.g()) ? new TreeSet() : new TreeSet((Collection) jVarH.f());
    }

    public synchronized void d() throws Cache.CacheException {
        Cache.CacheException cacheException = this.f51085l;
        if (cacheException != null) {
            throw cacheException;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long getUid() {
        return this.f51082i;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized Set<String> m() {
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        return new HashSet(this.f51077d.m());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized m n(String str) {
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        return this.f51077d.k(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void o(String str, n nVar) throws Cache.CacheException {
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        d();
        this.f51077d.e(str, nVar);
        try {
            this.f51077d.u();
        } catch (IOException e10) {
            throw new Cache.CacheException(e10);
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void p(h hVar) {
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        I(hVar);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized h q(String str, long j10, long j11) throws InterruptedException, Cache.CacheException {
        h hVarX;
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        d();
        while (true) {
            hVarX = x(str, j10, j11);
            if (hVarX == null) {
                wait();
            }
        }
        return hVarX;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void r(String str) {
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        Iterator<h> it = C(str).iterator();
        while (it.hasNext()) {
            I(it.next());
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void release() {
        if (this.f51084k) {
            return;
        }
        this.f51079f.clear();
        J();
        try {
            try {
                this.f51077d.u();
                L(this.f51075b);
            } catch (IOException e10) {
                com.google.android.exoplayer2.util.u.e(f51071m, "Storing index file failed", e10);
                L(this.f51075b);
            }
            this.f51084k = true;
        } catch (Throwable th2) {
            L(this.f51075b);
            this.f51084k = true;
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized boolean s(String str, long j10, long j11) {
        j jVarH;
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        jVarH = this.f51077d.h(str);
        return jVarH != null && jVarH.c(j10, j11) >= j11;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized NavigableSet<h> t(String str, Cache.a aVar) {
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        com.google.android.exoplayer2.util.a.g(str);
        com.google.android.exoplayer2.util.a.g(aVar);
        ArrayList<Cache.a> arrayList = this.f51079f.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.f51079f.put(str, arrayList);
        }
        arrayList.add(aVar);
        return C(str);
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized void u(String str, Cache.a aVar) {
        if (this.f51084k) {
            return;
        }
        ArrayList<Cache.a> arrayList = this.f51079f.get(str);
        if (arrayList != null) {
            arrayList.remove(aVar);
            if (arrayList.isEmpty()) {
                this.f51079f.remove(str);
            }
        }
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized File v(String str, long j10, long j11) throws Cache.CacheException {
        j jVarH;
        File file;
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        d();
        jVarH = this.f51077d.h(str);
        com.google.android.exoplayer2.util.a.g(jVarH);
        com.google.android.exoplayer2.util.a.i(jVarH.h(j10, j11));
        if (!this.f51075b.exists()) {
            e(this.f51075b);
            J();
        }
        this.f51076c.c(this, str, j10, j11);
        file = new File(this.f51075b, Integer.toString(this.f51080g.nextInt(10)));
        if (!file.exists()) {
            e(file);
        }
        return u.i(file, jVarH.f51019a, j10, System.currentTimeMillis());
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long w(String str, long j10, long j11) {
        long j12;
        long j13 = j11 == -1 ? Long.MAX_VALUE : j10 + j11;
        long j14 = j13 < 0 ? Long.MAX_VALUE : j13;
        long j15 = j10;
        j12 = 0;
        while (j15 < j14) {
            long jY = y(str, j15, j14 - j15);
            if (jY > 0) {
                j12 += jY;
            } else {
                jY = -jY;
            }
            j15 += jY;
        }
        return j12;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    @p0
    public synchronized h x(String str, long j10, long j11) throws Cache.CacheException {
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        d();
        u uVarH = h(str, j10, j11);
        if (uVarH.f51004e) {
            return K(str, uVarH);
        }
        if (this.f51077d.o(str).j(j10, uVarH.f51003d)) {
            return uVarH;
        }
        return null;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long y(String str, long j10, long j11) {
        j jVarH;
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        if (j11 == -1) {
            j11 = Long.MAX_VALUE;
        }
        jVarH = this.f51077d.h(str);
        return jVarH != null ? jVarH.c(j10, j11) : -j11;
    }

    @Override // com.google.android.exoplayer2.upstream.cache.Cache
    public synchronized long z() {
        com.google.android.exoplayer2.util.a.i(!this.f51084k);
        return this.f51083j;
    }
}
