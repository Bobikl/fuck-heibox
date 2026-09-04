package com.bumptech.glide.disklrucache;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.StrictMode;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: DiskLruCache.java */
/* JADX INFO: loaded from: classes6.dex */
public final class b implements Closeable {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    static final String f40605p = "journal";

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    static final String f40606q = "journal.tmp";

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    static final String f40607r = "journal.bkp";

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    static final String f40608s = "libcore.io.DiskLruCache";

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    static final String f40609t = "1";

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    static final long f40610u = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f40611v = "CLEAN";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f40612w = "DIRTY";

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final String f40613x = "REMOVE";

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private static final String f40614y = "READ";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f40615b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f40616c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final File f40617d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final File f40618e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f40619f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f40620g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f40621h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Writer f40623j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f40625l;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f40622i = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final LinkedHashMap<String, d> f40624k = new LinkedHashMap<>(0, 0.75f, true);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f40626m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final ThreadPoolExecutor f40627n = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC0322b(null));

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Callable<Void> f40628o = new a();

    /* JADX INFO: compiled from: DiskLruCache.java */
    public class a implements Callable<Void> {
        a() {
        }

        @Override // java.util.concurrent.Callable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() throws Exception {
            synchronized (b.this) {
                if (b.this.f40623j == null) {
                    return null;
                }
                b.this.S();
                if (b.this.J()) {
                    b.this.O();
                    b.this.f40625l = 0;
                }
                return null;
            }
        }
    }

    /* JADX INFO: renamed from: com.bumptech.glide.disklrucache.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DiskLruCache.java */
    public static final class ThreadFactoryC0322b implements ThreadFactory {
        private ThreadFactoryC0322b() {
        }

        /* synthetic */ ThreadFactoryC0322b(a aVar) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            Thread thread;
            thread = new Thread(runnable, "glide-disk-lru-cache-thread");
            thread.setPriority(1);
            return thread;
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d f40630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean[] f40631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f40632c;

        private c(d dVar) {
            this.f40630a = dVar;
            this.f40631b = dVar.f40638e ? null : new boolean[b.this.f40621h];
        }

        /* synthetic */ c(b bVar, d dVar, a aVar) {
            this(dVar);
        }

        private InputStream h(int i10) throws IOException {
            synchronized (b.this) {
                if (this.f40630a.f40639f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f40630a.f40638e) {
                    return null;
                }
                try {
                    return new FileInputStream(this.f40630a.j(i10));
                } catch (FileNotFoundException unused) {
                    return null;
                }
            }
        }

        public void a() throws IOException {
            b.this.p(this, false);
        }

        public void b() {
            if (this.f40632c) {
                return;
            }
            try {
                a();
            } catch (IOException unused) {
            }
        }

        public void e() throws IOException {
            b.this.p(this, true);
            this.f40632c = true;
        }

        public File f(int i10) throws IOException {
            File fileK;
            synchronized (b.this) {
                if (this.f40630a.f40639f != this) {
                    throw new IllegalStateException();
                }
                if (!this.f40630a.f40638e) {
                    this.f40631b[i10] = true;
                }
                fileK = this.f40630a.k(i10);
                b.this.f40615b.mkdirs();
            }
            return fileK;
        }

        public String g(int i10) throws IOException {
            InputStream inputStreamH = h(i10);
            if (inputStreamH != null) {
                return b.I(inputStreamH);
            }
            return null;
        }

        public void i(int i10, String str) throws Throwable {
            OutputStreamWriter outputStreamWriter = null;
            try {
                OutputStreamWriter outputStreamWriter2 = new OutputStreamWriter(new FileOutputStream(f(i10)), com.bumptech.glide.disklrucache.d.f40656b);
                try {
                    outputStreamWriter2.write(str);
                    com.bumptech.glide.disklrucache.d.a(outputStreamWriter2);
                } catch (Throwable th2) {
                    th = th2;
                    outputStreamWriter = outputStreamWriter2;
                    com.bumptech.glide.disklrucache.d.a(outputStreamWriter);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f40634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long[] f40635b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        File[] f40636c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        File[] f40637d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f40638e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private c f40639f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f40640g;

        private d(String str) {
            this.f40634a = str;
            this.f40635b = new long[b.this.f40621h];
            this.f40636c = new File[b.this.f40621h];
            this.f40637d = new File[b.this.f40621h];
            StringBuilder sb2 = new StringBuilder(str);
            sb2.append(lg.a.f131414g);
            int length = sb2.length();
            for (int i10 = 0; i10 < b.this.f40621h; i10++) {
                sb2.append(i10);
                this.f40636c[i10] = new File(b.this.f40615b, sb2.toString());
                sb2.append(".tmp");
                this.f40637d[i10] = new File(b.this.f40615b, sb2.toString());
                sb2.setLength(length);
            }
        }

        /* synthetic */ d(b bVar, String str, a aVar) {
            this(str);
        }

        private IOException m(String[] strArr) throws IOException {
            throw new IOException("unexpected journal line: " + Arrays.toString(strArr));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void n(String[] strArr) throws IOException {
            if (strArr.length != b.this.f40621h) {
                throw m(strArr);
            }
            for (int i10 = 0; i10 < strArr.length; i10++) {
                try {
                    this.f40635b[i10] = Long.parseLong(strArr[i10]);
                } catch (NumberFormatException unused) {
                    throw m(strArr);
                }
            }
        }

        public File j(int i10) {
            return this.f40636c[i10];
        }

        public File k(int i10) {
            return this.f40637d[i10];
        }

        public String l() throws IOException {
            StringBuilder sb2 = new StringBuilder();
            for (long j10 : this.f40635b) {
                sb2.append(' ');
                sb2.append(j10);
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: compiled from: DiskLruCache.java */
    public final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f40642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final long f40643b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final long[] f40644c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final File[] f40645d;

        private e(String str, long j10, File[] fileArr, long[] jArr) {
            this.f40642a = str;
            this.f40643b = j10;
            this.f40645d = fileArr;
            this.f40644c = jArr;
        }

        /* synthetic */ e(b bVar, String str, long j10, File[] fileArr, long[] jArr, a aVar) {
            this(str, j10, fileArr, jArr);
        }

        public c a() throws IOException {
            return b.this.t(this.f40642a, this.f40643b);
        }

        public File b(int i10) {
            return this.f40645d[i10];
        }

        public long c(int i10) {
            return this.f40644c[i10];
        }

        public String d(int i10) throws IOException {
            return b.I(new FileInputStream(this.f40645d[i10]));
        }
    }

    private b(File file, int i10, int i11, long j10) {
        this.f40615b = file;
        this.f40619f = i10;
        this.f40616c = new File(file, f40605p);
        this.f40617d = new File(file, f40606q);
        this.f40618e = new File(file, f40607r);
        this.f40621h = i11;
        this.f40620g = j10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String I(InputStream inputStream) throws IOException {
        return com.bumptech.glide.disklrucache.d.c(new InputStreamReader(inputStream, com.bumptech.glide.disklrucache.d.f40656b));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean J() {
        int i10 = this.f40625l;
        return i10 >= 2000 && i10 >= this.f40624k.size();
    }

    public static b K(File file, int i10, int i11, long j10) throws IOException {
        if (j10 <= 0) {
            throw new IllegalArgumentException("maxSize <= 0");
        }
        if (i11 <= 0) {
            throw new IllegalArgumentException("valueCount <= 0");
        }
        File file2 = new File(file, f40607r);
        if (file2.exists()) {
            File file3 = new File(file, f40605p);
            if (file3.exists()) {
                file2.delete();
            } else {
                Q(file2, file3, false);
            }
        }
        b bVar = new b(file, i10, i11, j10);
        if (bVar.f40616c.exists()) {
            try {
                bVar.M();
                bVar.L();
                return bVar;
            } catch (IOException e10) {
                System.out.println("DiskLruCache " + file + " is corrupt: " + e10.getMessage() + ", removing");
                bVar.q();
            }
        }
        file.mkdirs();
        b bVar2 = new b(file, i10, i11, j10);
        bVar2.O();
        return bVar2;
    }

    private void L() throws IOException {
        r(this.f40617d);
        Iterator<d> it = this.f40624k.values().iterator();
        while (it.hasNext()) {
            d next = it.next();
            int i10 = 0;
            if (next.f40639f == null) {
                while (i10 < this.f40621h) {
                    this.f40622i += next.f40635b[i10];
                    i10++;
                }
            } else {
                next.f40639f = null;
                while (i10 < this.f40621h) {
                    r(next.j(i10));
                    r(next.k(i10));
                    i10++;
                }
                it.remove();
            }
        }
    }

    private void M() throws IOException {
        com.bumptech.glide.disklrucache.c cVar = new com.bumptech.glide.disklrucache.c(new FileInputStream(this.f40616c), com.bumptech.glide.disklrucache.d.f40655a);
        try {
            String strD = cVar.d();
            String strD2 = cVar.d();
            String strD3 = cVar.d();
            String strD4 = cVar.d();
            String strD5 = cVar.d();
            if (!f40608s.equals(strD) || !"1".equals(strD2) || !Integer.toString(this.f40619f).equals(strD3) || !Integer.toString(this.f40621h).equals(strD4) || !"".equals(strD5)) {
                throw new IOException("unexpected journal header: [" + strD + ", " + strD2 + ", " + strD4 + ", " + strD5 + "]");
            }
            int i10 = 0;
            while (true) {
                try {
                    N(cVar.d());
                    i10++;
                } catch (EOFException unused) {
                    this.f40625l = i10 - this.f40624k.size();
                    if (cVar.c()) {
                        O();
                    } else {
                        this.f40623j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f40616c, true), com.bumptech.glide.disklrucache.d.f40655a));
                    }
                    com.bumptech.glide.disklrucache.d.a(cVar);
                    return;
                }
            }
        } catch (Throwable th2) {
            com.bumptech.glide.disklrucache.d.a(cVar);
            throw th2;
        }
    }

    private void N(String str) throws IOException {
        String strSubstring;
        int iIndexOf = str.indexOf(32);
        if (iIndexOf == -1) {
            throw new IOException("unexpected journal line: " + str);
        }
        int i10 = iIndexOf + 1;
        int iIndexOf2 = str.indexOf(32, i10);
        if (iIndexOf2 == -1) {
            strSubstring = str.substring(i10);
            if (iIndexOf == 6 && str.startsWith(f40613x)) {
                this.f40624k.remove(strSubstring);
                return;
            }
        } else {
            strSubstring = str.substring(i10, iIndexOf2);
        }
        d dVar = this.f40624k.get(strSubstring);
        a aVar = null;
        if (dVar == null) {
            dVar = new d(this, strSubstring, aVar);
            this.f40624k.put(strSubstring, dVar);
        }
        if (iIndexOf2 != -1 && iIndexOf == 5 && str.startsWith(f40611v)) {
            String[] strArrSplit = str.substring(iIndexOf2 + 1).split(" ");
            dVar.f40638e = true;
            dVar.f40639f = null;
            dVar.n(strArrSplit);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 5 && str.startsWith(f40612w)) {
            dVar.f40639f = new c(this, dVar, aVar);
            return;
        }
        if (iIndexOf2 == -1 && iIndexOf == 4 && str.startsWith(f40614y)) {
            return;
        }
        throw new IOException("unexpected journal line: " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void O() throws IOException {
        Writer writer = this.f40623j;
        if (writer != null) {
            o(writer);
        }
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f40617d), com.bumptech.glide.disklrucache.d.f40655a));
        try {
            bufferedWriter.write(f40608s);
            bufferedWriter.write("\n");
            bufferedWriter.write("1");
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f40619f));
            bufferedWriter.write("\n");
            bufferedWriter.write(Integer.toString(this.f40621h));
            bufferedWriter.write("\n");
            bufferedWriter.write("\n");
            for (d dVar : this.f40624k.values()) {
                if (dVar.f40639f != null) {
                    bufferedWriter.write("DIRTY " + dVar.f40634a + '\n');
                } else {
                    bufferedWriter.write("CLEAN " + dVar.f40634a + dVar.l() + '\n');
                }
            }
            o(bufferedWriter);
            if (this.f40616c.exists()) {
                Q(this.f40616c, this.f40618e, true);
            }
            Q(this.f40617d, this.f40616c, false);
            this.f40618e.delete();
            this.f40623j = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.f40616c, true), com.bumptech.glide.disklrucache.d.f40655a));
        } catch (Throwable th2) {
            o(bufferedWriter);
            throw th2;
        }
    }

    private static void Q(File file, File file2, boolean z10) throws IOException {
        if (z10) {
            r(file2);
        }
        if (!file.renameTo(file2)) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void S() throws IOException {
        while (this.f40622i > this.f40620g) {
            P(this.f40624k.entrySet().iterator().next().getKey());
        }
    }

    private void n() {
        if (this.f40623j == null) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @TargetApi(26)
    private static void o(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void p(c cVar, boolean z10) throws IOException {
        d dVar = cVar.f40630a;
        if (dVar.f40639f != cVar) {
            throw new IllegalStateException();
        }
        if (z10 && !dVar.f40638e) {
            for (int i10 = 0; i10 < this.f40621h; i10++) {
                if (!cVar.f40631b[i10]) {
                    cVar.a();
                    throw new IllegalStateException("Newly created entry didn't create value for index " + i10);
                }
                if (!dVar.k(i10).exists()) {
                    cVar.a();
                    return;
                }
            }
        }
        for (int i11 = 0; i11 < this.f40621h; i11++) {
            File fileK = dVar.k(i11);
            if (!z10) {
                r(fileK);
            } else if (fileK.exists()) {
                File fileJ = dVar.j(i11);
                fileK.renameTo(fileJ);
                long j10 = dVar.f40635b[i11];
                long length = fileJ.length();
                dVar.f40635b[i11] = length;
                this.f40622i = (this.f40622i - j10) + length;
            }
        }
        this.f40625l++;
        dVar.f40639f = null;
        if (dVar.f40638e || z10) {
            dVar.f40638e = true;
            this.f40623j.append((CharSequence) f40611v);
            this.f40623j.append(' ');
            this.f40623j.append((CharSequence) dVar.f40634a);
            this.f40623j.append((CharSequence) dVar.l());
            this.f40623j.append('\n');
            if (z10) {
                long j11 = this.f40626m;
                this.f40626m = 1 + j11;
                dVar.f40640g = j11;
            }
        } else {
            this.f40624k.remove(dVar.f40634a);
            this.f40623j.append((CharSequence) f40613x);
            this.f40623j.append(' ');
            this.f40623j.append((CharSequence) dVar.f40634a);
            this.f40623j.append('\n');
        }
        x(this.f40623j);
        if (this.f40622i > this.f40620g || J()) {
            this.f40627n.submit(this.f40628o);
        }
    }

    private static void r(File file) throws IOException {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized c t(String str, long j10) throws IOException {
        n();
        d dVar = this.f40624k.get(str);
        a aVar = null;
        if (j10 != -1 && (dVar == null || dVar.f40640g != j10)) {
            return null;
        }
        if (dVar == null) {
            dVar = new d(this, str, aVar);
            this.f40624k.put(str, dVar);
        } else if (dVar.f40639f != null) {
            return null;
        }
        c cVar = new c(this, dVar, aVar);
        dVar.f40639f = cVar;
        this.f40623j.append((CharSequence) f40612w);
        this.f40623j.append(' ');
        this.f40623j.append((CharSequence) str);
        this.f40623j.append('\n');
        x(this.f40623j);
        return cVar;
    }

    @TargetApi(26)
    private static void x(Writer writer) throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo().build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public File A() {
        return this.f40615b;
    }

    public synchronized long C() {
        return this.f40620g;
    }

    public synchronized boolean P(String str) throws IOException {
        n();
        d dVar = this.f40624k.get(str);
        if (dVar != null && dVar.f40639f == null) {
            for (int i10 = 0; i10 < this.f40621h; i10++) {
                File fileJ = dVar.j(i10);
                if (fileJ.exists() && !fileJ.delete()) {
                    throw new IOException("failed to delete " + fileJ);
                }
                this.f40622i -= dVar.f40635b[i10];
                dVar.f40635b[i10] = 0;
            }
            this.f40625l++;
            this.f40623j.append((CharSequence) f40613x);
            this.f40623j.append(' ');
            this.f40623j.append((CharSequence) str);
            this.f40623j.append('\n');
            this.f40624k.remove(str);
            if (J()) {
                this.f40627n.submit(this.f40628o);
            }
            return true;
        }
        return false;
    }

    public synchronized void R(long j10) {
        this.f40620g = j10;
        this.f40627n.submit(this.f40628o);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        if (this.f40623j == null) {
            return;
        }
        for (d dVar : new ArrayList(this.f40624k.values())) {
            if (dVar.f40639f != null) {
                dVar.f40639f.a();
            }
        }
        S();
        o(this.f40623j);
        this.f40623j = null;
    }

    public synchronized void flush() throws IOException {
        n();
        S();
        x(this.f40623j);
    }

    public synchronized boolean isClosed() {
        return this.f40623j == null;
    }

    public void q() throws IOException {
        close();
        com.bumptech.glide.disklrucache.d.b(this.f40615b);
    }

    public c s(String str) throws IOException {
        return t(str, -1L);
    }

    public synchronized long size() {
        return this.f40622i;
    }

    public synchronized e z(String str) throws IOException {
        n();
        d dVar = this.f40624k.get(str);
        if (dVar == null) {
            return null;
        }
        if (!dVar.f40638e) {
            return null;
        }
        for (File file : dVar.f40636c) {
            if (!file.exists()) {
                return null;
            }
        }
        this.f40625l++;
        this.f40623j.append((CharSequence) f40614y);
        this.f40623j.append(' ');
        this.f40623j.append((CharSequence) str);
        this.f40623j.append('\n');
        if (J()) {
            this.f40627n.submit(this.f40628o);
        }
        return new e(this, str, dVar.f40640g, dVar.f40636c, dVar.f40635b, null);
    }
}
