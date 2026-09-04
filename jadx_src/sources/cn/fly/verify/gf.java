package cn.fly.verify;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.text.TextUtils;
import com.meituan.robust.Constants;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* JADX INFO: loaded from: classes6.dex */
public class gf {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f36695h = Process.myPid();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f36696a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f36697b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<String, l> f36698c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ReentrantReadWriteLock f36699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ReentrantReadWriteLock.WriteLock f36700e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ReentrantReadWriteLock.ReadLock f36701f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h f36702g;

    public static final class a<T> implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T f36706b;

        public String a() {
            return this.f36705a;
        }

        public T b() {
            return this.f36706b;
        }
    }

    public static class b extends Exception {
        public b() {
            this(bq.a("019Ifheljgee-ehVejedjgedUeje4jgfgeleh3fEed"));
        }

        public b(String str) {
            super(str);
        }
    }

    public static final class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T f36708b;

        public c(String str, T t10) {
            this.f36707a = str;
            this.f36708b = t10;
        }

        public static <T> c<T> a(HashMap<Byte, Object> map) {
            if (map != null) {
                return new c<>((String) map.get((byte) 0), map.get((byte) 1));
            }
            return null;
        }

        public T a() {
            return this.f36708b;
        }

        public HashMap<Byte, Object> b() {
            HashMap<Byte, Object> map = new HashMap<>();
            map.put((byte) 0, this.f36707a);
            map.put((byte) 1, this.f36708b);
            return map;
        }
    }

    public static final class d<T extends Parcelable> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Class<T> f36709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private byte[] f36710b;

        public d(Parcelable parcelable) {
            this.f36709a = (Class<T>) parcelable.getClass();
            this.f36710b = b(parcelable);
        }

        public d(Class<T> cls, byte[] bArr) {
            this.f36709a = cls;
            this.f36710b = bArr;
        }

        private T a(byte[] bArr, Class<T> cls, T t10) {
            if (bArr != null && bArr.length != 0) {
                try {
                    Parcel parcelObtain = Parcel.obtain();
                    parcelObtain.unmarshall(bArr, 0, bArr.length);
                    parcelObtain.setDataPosition(0);
                    return (T) ((Parcelable.Creator) cls.getDeclaredField(bq.a("007$fehkhjgegdhihk")).get(null)).createFromParcel(parcelObtain);
                } catch (Throwable th2) {
                    es.a().a(th2);
                }
            }
            return t10;
        }

        public static <T extends Parcelable> d<T> a(HashMap<Byte, Object> map) {
            if (map != null) {
                return new d<>((Class) map.get((byte) 0), (byte[]) map.get((byte) 1));
            }
            return null;
        }

        private byte[] b(Parcelable parcelable) {
            if (parcelable == null) {
                return new byte[0];
            }
            Parcel parcelObtain = Parcel.obtain();
            parcelable.writeToParcel(parcelObtain, 0);
            return parcelObtain.marshall();
        }

        public T a(T t10) {
            return (T) a(this.f36710b, this.f36709a, t10);
        }

        public HashMap<Byte, Object> a() {
            HashMap<Byte, Object> map = new HashMap<>();
            map.put((byte) 0, this.f36709a);
            map.put((byte) 1, this.f36710b);
            return map;
        }
    }

    public static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f36711a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f36712b;

        private e(long j10, Object obj) {
            this.f36711a = j10;
            this.f36712b = obj;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a() {
            long j10 = this.f36711a;
            return j10 != 0 && j10 <= System.currentTimeMillis();
        }
    }

    public class f implements Runnable {
        private f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ArrayList arrayList;
            Throwable th2;
            try {
                try {
                    gf.this.f36700e.lock();
                    ArrayList arrayList2 = null;
                    try {
                        if (!gf.this.f36698c.isEmpty()) {
                            arrayList = new ArrayList(gf.this.f36698c.values());
                            try {
                                gf.this.f36698c.clear();
                                if (!arrayList.isEmpty()) {
                                    gf.this.f36696a.b().lock();
                                }
                                arrayList2 = arrayList;
                            } catch (Throwable th3) {
                                th2 = th3;
                                try {
                                    gf.b(th2, gf.this.f36696a.f36730j);
                                    try {
                                        gf.this.f36700e.unlock();
                                    } catch (Throwable th4) {
                                        gf.b(th4, gf.this.f36696a.f36730j);
                                    }
                                    arrayList2 = arrayList;
                                } catch (Throwable th5) {
                                    try {
                                        gf.this.f36700e.unlock();
                                    } catch (Throwable th6) {
                                        gf.b(th6, gf.this.f36696a.f36730j);
                                    }
                                    throw th5;
                                }
                            }
                        }
                        try {
                            gf.this.f36700e.unlock();
                        } catch (Throwable th7) {
                            gf.b(th7, gf.this.f36696a.f36730j);
                        }
                    } catch (Throwable th8) {
                        arrayList = null;
                        th2 = th8;
                    }
                    if (arrayList2 != null && !arrayList2.isEmpty()) {
                        try {
                            List<l> listA = gf.this.f36696a.a(arrayList2);
                            if (!listA.isEmpty()) {
                                gf.this.f36700e.lock();
                                try {
                                    for (l lVar : listA) {
                                        gf.this.f36698c.put(lVar.f36754a, lVar);
                                    }
                                    gf.this.f36700e.unlock();
                                } catch (Throwable th9) {
                                    gf.this.f36700e.unlock();
                                    throw th9;
                                }
                            }
                            gf.this.f36696a.b().unlock();
                        } catch (Throwable th10) {
                            gf.this.f36696a.b().unlock();
                            throw th10;
                        }
                    }
                    gf.this.f36697b.schedule(this, 3000L, TimeUnit.MILLISECONDS);
                } catch (Throwable th11) {
                    try {
                        gf.b(th11, gf.this.f36696a.f36730j);
                        gf.this.f36697b.schedule(this, 3000L, TimeUnit.MILLISECONDS);
                    } catch (Throwable th12) {
                        try {
                            gf.this.f36697b.schedule(this, 3000L, TimeUnit.MILLISECONDS);
                        } catch (Throwable th13) {
                            gf.b(th13, gf.this.f36696a.f36730j);
                        }
                        throw th12;
                    }
                }
            } catch (Throwable th14) {
                gf.b(th14, gf.this.f36696a.f36730j);
            }
        }
    }

    public static class g<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36714a;

        public g(String str) {
            this.f36714a = str;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public T a(Object obj) {
            return obj;
        }

        public String a() {
            return this.f36714a;
        }
    }

    public static final class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private byte[] f36715a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f36716b;

        private h(String str) {
            if (TextUtils.isEmpty(str)) {
                this.f36716b = false;
                return;
            }
            this.f36716b = true;
            try {
                this.f36715a = str.getBytes("utf-8");
            } catch (Throwable unused) {
            }
        }

        private Object a(byte[] bArr) throws Throwable {
            if (bArr == null || bArr.length == 0) {
                return null;
            }
            if (this.f36716b && bArr.length % 16 == 0) {
                try {
                    return b(ga.d(this.f36715a, bArr));
                } catch (Throwable unused) {
                    gf.d("decode fail ", "ENCIPER");
                    return b(bArr);
                }
            }
            return b(bArr);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Object a(byte[] bArr, Object obj) {
            try {
                return a(bArr);
            } catch (Throwable th2) {
                es.a().a(th2);
                return obj;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] a(Object obj) throws Throwable {
            ByteArrayOutputStream byteArrayOutputStream;
            if (obj == null) {
                return new byte[0];
            }
            ObjectOutputStream objectOutputStream = null;
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                try {
                    ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                    try {
                        objectOutputStream2.writeObject(obj);
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        if (!this.f36716b) {
                            el.a(objectOutputStream2, byteArrayOutputStream);
                            return byteArray;
                        }
                        byte[] bArrA = ga.a(this.f36715a, byteArray);
                        el.a(objectOutputStream2, byteArrayOutputStream);
                        return bArrA;
                    } catch (Throwable th2) {
                        th = th2;
                        objectOutputStream = objectOutputStream2;
                        el.a(objectOutputStream, byteArrayOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                byteArrayOutputStream = null;
            }
        }

        private static Object b(byte[] bArr) throws Throwable {
            ByteArrayInputStream byteArrayInputStream;
            Throwable th2;
            ObjectInputStream objectInputStream;
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        Object object = objectInputStream.readObject();
                        el.a(objectInputStream, byteArrayInputStream);
                        return object;
                    } catch (Throwable th3) {
                        th2 = th3;
                        el.a(objectInputStream, byteArrayInputStream);
                        throw th2;
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                    objectInputStream = null;
                }
            } catch (Throwable th5) {
                byteArrayInputStream = null;
                th2 = th5;
                objectInputStream = null;
            }
        }
    }

    public static final class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final byte[] f36717a;

        public i(byte[] bArr) {
            this.f36717a = bArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || i.class != obj.getClass()) {
                return false;
            }
            return Arrays.equals(this.f36717a, ((i) obj).f36717a);
        }

        public int hashCode() {
            return Arrays.hashCode(this.f36717a);
        }
    }

    public static final class j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f36718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile LinkedHashMap<i, e> f36719b;

        private j(int i10) {
            this.f36718a = i10;
            this.f36719b = new LinkedHashMap<i, e>(i10, 0.75f, true) { // from class: cn.fly.verify.gf.j.1
                @Override // java.util.LinkedHashMap
                protected boolean removeEldestEntry(Map.Entry<i, e> entry) {
                    return size() > j.this.f36718a;
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public e a(i iVar) {
            return this.f36719b.get(iVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a() {
            this.f36719b.clear();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(i iVar, e eVar) {
            this.f36719b.put(iVar, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(i iVar) {
            this.f36719b.remove(iVar);
        }
    }

    public static class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ReentrantReadWriteLock f36721a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ReentrantReadWriteLock.WriteLock f36722b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ReentrantReadWriteLock.ReadLock f36723c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private File f36724d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile RandomAccessFile f36725e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private volatile long f36726f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private volatile LinkedList<a> f36727g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private volatile HashMap<i, a> f36728h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private final Context f36729i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private final String f36730j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private final File f36731k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final h f36732l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private final j f36733m;

        public static class a implements Comparable<a> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private int f36747a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private byte f36748b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            private byte[] f36749c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private long f36750d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            private long f36751e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private long f36752f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            private long f36753g;

            public a(int i10) {
                this.f36747a = i10;
                this.f36753g = (((long) i10) * 41) + 1024;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(byte b10) {
                this.f36748b = b10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(long j10) {
                this.f36750d = j10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void a(byte[] bArr) {
                this.f36749c = bArr;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void b(long j10) {
                this.f36751e = j10;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public void c(long j10) {
                this.f36752f = j10;
            }

            @Override // java.lang.Comparable
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public int compareTo(a aVar) {
                return Long.compare(b(), aVar.b());
            }

            public long a() {
                return this.f36753g;
            }

            public void a(byte b10, byte[] bArr, long j10, long j11) {
                this.f36748b = b10;
                this.f36749c = bArr;
                this.f36751e = j10;
                this.f36752f = j11;
            }

            public long b() {
                return this.f36750d;
            }

            public long c() {
                return this.f36751e;
            }

            public long d() {
                return this.f36752f;
            }

            public boolean e() {
                return d() != 0 && d() <= System.currentTimeMillis();
            }

            public void f() {
                this.f36748b = (byte) 1;
                this.f36749c = null;
                this.f36752f = -1L;
                this.f36750d = 0L;
                this.f36751e = 0L;
            }
        }

        public k(Context context, String str, h hVar) {
            ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
            this.f36721a = reentrantReadWriteLock;
            this.f36722b = reentrantReadWriteLock.writeLock();
            this.f36723c = reentrantReadWriteLock.readLock();
            this.f36729i = context;
            this.f36730j = str;
            this.f36731k = ef.a(ef.f36251h + str);
            this.f36732l = hVar;
            this.f36733m = new j(60);
            d();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public a a(i iVar) throws Throwable {
            a aVar = this.f36728h.get(iVar);
            if (aVar != null) {
                return aVar;
            }
            if (this.f36727g.isEmpty()) {
                h();
            }
            a aVarRemoveFirst = this.f36727g.removeFirst();
            aVarRemoveFirst.a((byte) 0);
            this.f36728h.put(iVar, aVarRemoveFirst);
            return aVarRemoveFirst;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List<l> a(final List<l> list) {
            this.f36722b.lock();
            final ArrayList arrayList = new ArrayList();
            try {
                ef.a(this.f36731k.getAbsolutePath(), true, 2000L, 50L, new ee() { // from class: cn.fly.verify.gf.k.2
                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v24, types: [java.io.Closeable[]] */
                    /* JADX WARN: Type inference failed for: r10v0, types: [cn.fly.verify.gf$1] */
                    /* JADX WARN: Type inference failed for: r10v1 */
                    /* JADX WARN: Type inference failed for: r10v2 */
                    /* JADX WARN: Type inference failed for: r10v8 */
                    /* JADX WARN: Type inference failed for: r2v18, types: [java.io.Closeable[]] */
                    @Override // cn.fly.verify.ee
                    public boolean a(gb gbVar) {
                        long j10;
                        ?? r10;
                        FileOutputStream fileOutputStream;
                        boolean z10;
                        try {
                            long jCurrentTimeMillis = System.currentTimeMillis();
                            k.this.g();
                            if (list.size() > 1) {
                                LinkedList<a> linkedList = new LinkedList();
                                int size = list.size();
                                byte[][] bArr = new byte[size][];
                                int size2 = list.size();
                                int i10 = 0;
                                while (true) {
                                    r10 = 0;
                                    r10 = 0;
                                    if (i10 >= size2) {
                                        break;
                                    }
                                    l lVar = (l) list.get(i10);
                                    i iVar = new i(lVar.f36757d);
                                    byte[] bArrA = k.this.f36732l.a(new c(lVar.a(), lVar.c()).b());
                                    a aVarA = k.this.a(iVar);
                                    aVarA.a((byte) 0, lVar.f36757d, bArrA.length, lVar.f36756c);
                                    k.this.f36733m.a(new i(lVar.f()), new e(lVar.f36756c, lVar.f36755b));
                                    linkedList.add(aVarA);
                                    bArr[i10] = bArrA;
                                    i10++;
                                    jCurrentTimeMillis = jCurrentTimeMillis;
                                }
                                j10 = jCurrentTimeMillis;
                                long length = k.this.f36725e.length();
                                try {
                                    fileOutputStream = new FileOutputStream(k.this.f36725e.getFD());
                                    try {
                                        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
                                        try {
                                            k.this.f36725e.seek(k.this.f36725e.length());
                                            for (int i11 = 0; i11 < size; i11++) {
                                                byte[] bArr2 = bArr[i11];
                                                bufferedOutputStream.write(bArr2, 0, bArr2.length);
                                            }
                                            bufferedOutputStream.flush();
                                            el.a(bufferedOutputStream, fileOutputStream);
                                            z10 = true;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            r10 = bufferedOutputStream;
                                            try {
                                                gf.b(th, k.this.f36730j);
                                                gf.c("sta err sz " + list.size(), k.this.f36730j);
                                                for (a aVar : linkedList) {
                                                    if (aVar.f36748b == 0) {
                                                        k.this.d(aVar);
                                                    }
                                                }
                                                arrayList.addAll(list);
                                                el.a((Closeable[]) new Closeable[]{r10, fileOutputStream});
                                                z10 = false;
                                            } catch (Throwable th3) {
                                                el.a((Closeable[]) new Closeable[]{r10, fileOutputStream});
                                                throw th3;
                                            }
                                        }
                                    } catch (Throwable th4) {
                                        th = th4;
                                    }
                                } catch (Throwable th5) {
                                    th = th5;
                                    fileOutputStream = null;
                                }
                                if (z10) {
                                    for (int i12 = 0; i12 < size2; i12++) {
                                        a aVar2 = (a) linkedList.get(i12);
                                        aVar2.f36750d = length;
                                        if (k.this.c(aVar2)) {
                                            length += (long) bArr[i12].length;
                                        } else {
                                            k.this.d(aVar2);
                                            arrayList.add(list.get(i12));
                                        }
                                    }
                                }
                                linkedList.clear();
                            } else {
                                j10 = jCurrentTimeMillis;
                                l lVar2 = (l) list.get(0);
                                a aVarA2 = k.this.a(new i(lVar2.f36757d));
                                try {
                                    k.this.a(aVarA2, lVar2);
                                } catch (Throwable th6) {
                                    gf.d("set fail " + th6, k.this.f36730j);
                                    k.this.d(aVarA2);
                                    arrayList.add(lVar2);
                                }
                            }
                            k.this.i();
                            gf.d(" all cost " + (System.currentTimeMillis() - j10) + " size " + list.size(), k.this.f36730j);
                            return false;
                        } catch (Throwable th7) {
                            gf.b(th7, k.this.f36730j);
                            return false;
                        }
                    }
                });
                return arrayList;
            } finally {
                this.f36722b.unlock();
            }
        }

        private void a(int i10, int i11) {
            while (i10 < i11) {
                a aVar = new a(i10);
                this.f36727g.add(aVar);
                a(aVar.f36753g, (byte) 1);
                i10++;
            }
        }

        private void a(long j10, byte[] bArr, int i10) {
            for (int i11 = i10 + 7; i11 >= i10; i11--) {
                bArr[i11] = (byte) (255 & j10);
                j10 >>= 8;
            }
        }

        private void a(a aVar, long j10) throws Throwable {
            byte[] bArr = new byte[(int) aVar.f36751e];
            this.f36725e.seek(aVar.f36750d);
            this.f36725e.readFully(bArr);
            this.f36725e.seek(j10);
            this.f36725e.write(bArr);
            this.f36725e.seek(aVar.f36753g + 17);
            this.f36725e.writeLong(j10);
            aVar.a(j10);
            this.f36728h.put(new i(aVar.f36749c), aVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(a aVar, l lVar) throws Throwable {
            FileOutputStream fileOutputStream;
            byte[] bArrA = this.f36732l.a(new c(lVar.a(), lVar.c()).b());
            long length = this.f36725e.length();
            BufferedOutputStream bufferedOutputStream = null;
            try {
                fileOutputStream = new FileOutputStream(this.f36725e.getFD());
                try {
                    BufferedOutputStream bufferedOutputStream2 = new BufferedOutputStream(fileOutputStream);
                    try {
                        this.f36725e.seek(length);
                        bufferedOutputStream2.write(bArrA);
                        bufferedOutputStream2.flush();
                        el.a(bufferedOutputStream2, fileOutputStream);
                        aVar.a((byte) 0, lVar.f36757d, bArrA.length, lVar.f36756c);
                        aVar.f36750d = length;
                        c(aVar);
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedOutputStream = bufferedOutputStream2;
                        el.a(bufferedOutputStream, fileOutputStream);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (Throwable th4) {
                th = th4;
                fileOutputStream = null;
            }
        }

        private byte[] a(long j10) throws Throwable {
            byte[] bArr = new byte[16];
            this.f36725e.seek(j10 + 1);
            this.f36725e.read(bArr, 0, 16);
            return bArr;
        }

        private long b(long j10) throws Throwable {
            try {
                this.f36725e.seek(j10 + 17);
                return this.f36725e.readLong();
            } catch (Throwable th2) {
                gf.b(th2, a());
                return -1L;
            }
        }

        private String b(int i10, int i11) {
            return "Index: " + i10 + ", Size: " + i11;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(int i10) throws Throwable {
            this.f36727g = new LinkedList<>();
            this.f36728h = new HashMap<>();
            a(0, i10);
            a(i10);
            this.f36726f = System.currentTimeMillis();
            this.f36725e.seek(0L);
            this.f36725e.writeLong(this.f36726f);
            gf.d("new a " + this.f36727g.size() + " u " + this.f36728h.size(), this.f36730j);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean b(i iVar) {
            try {
                g();
                a aVar = this.f36728h.get(iVar);
                if (aVar != null) {
                    d(aVar);
                }
                this.f36733m.b(iVar);
                return true;
            } catch (Throwable th2) {
                gf.b(th2, a());
                return false;
            }
        }

        private long c(long j10) throws Throwable {
            try {
                this.f36725e.seek(j10 + 25);
                return this.f36725e.readLong();
            } catch (Throwable th2) {
                gf.b(th2, a());
                return -1L;
            }
        }

        private void c(int i10) {
            if (i10 >= 0) {
                int iC = c();
                if (i10 >= iC) {
                    throw new IndexOutOfBoundsException(b(i10, iC));
                }
            } else {
                throw new IllegalArgumentException("index : " + i10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c(a aVar) {
            try {
                byte[] bArr = new byte[41];
                bArr[0] = 0;
                System.arraycopy(aVar.f36749c, 0, bArr, 1, 16);
                a(aVar.f36750d, bArr, 17);
                a(aVar.f36751e, bArr, 25);
                a(aVar.f36752f, bArr, 33);
                this.f36725e.seek(aVar.f36753g);
                this.f36725e.write(bArr);
                return true;
            } catch (Throwable th2) {
                gf.b(th2, this.f36730j);
                return false;
            }
        }

        private long d(long j10) throws Throwable {
            try {
                this.f36725e.seek(j10 + 33);
                return this.f36725e.readLong();
            } catch (Throwable th2) {
                gf.b(th2, a());
                return 0L;
            }
        }

        private void d() {
            this.f36722b.lock();
            try {
                ef.a(this.f36731k.getAbsolutePath(), true, 1500L, 50L, new ee() { // from class: cn.fly.verify.gf.k.1
                    @Override // cn.fly.verify.ee
                    public boolean a(gb gbVar) {
                        try {
                            if (k.this.f36729i == null) {
                                return false;
                            }
                            k.this.f36724d = new File(gf.a(k.this.f36729i), k.this.f36730j);
                            if (!k.this.f36724d.getParentFile().exists()) {
                                k.this.f36724d.getParentFile().mkdirs();
                            }
                            if (k.this.f36724d.exists() && k.this.f36724d.length() < 43008) {
                                gf.c("Del dirty, size: " + k.this.f36724d.length() + ", min: 43008", k.this.f36730j);
                                k.this.f36724d.delete();
                            }
                            if (!k.this.f36724d.exists()) {
                                k.this.f36724d.createNewFile();
                                k.this.f36725e = new RandomAccessFile(k.this.f36724d, bq.a("002Oekgh"));
                                k.this.b(1024);
                                return false;
                            }
                            k.this.f36725e = new RandomAccessFile(k.this.f36724d, bq.a("002Sekgh"));
                            k.this.g();
                            gf.d("ava sz " + k.this.f36727g.size() + " useds " + k.this.f36728h.size(), k.this.f36730j);
                            return false;
                        } catch (Throwable th2) {
                            gf.b(th2, k.this.f36730j);
                            return false;
                        }
                    }
                });
            } finally {
                this.f36722b.unlock();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(a aVar) throws Throwable {
            this.f36722b.lock();
            try {
                e(aVar);
                i();
            } finally {
                this.f36722b.unlock();
            }
        }

        private void e() throws Throwable {
            gf.d(" [trim] try ", this.f36730j);
            long size = (((long) (this.f36728h.size() + this.f36727g.size())) * 41) + 1024;
            long length = this.f36725e.length();
            Iterator<a> it = this.f36728h.values().iterator();
            double dC = 0.0d;
            while (it.hasNext()) {
                dC += it.next().c();
            }
            long j10 = length - size;
            if (dC / j10 <= 0.5d) {
                long jC = size;
                for (a aVar : f()) {
                    if (aVar.e()) {
                        e(aVar);
                    } else {
                        if (aVar.b() != jC) {
                            if (aVar.b() > jC) {
                                a(aVar, jC);
                            }
                        }
                        jC += aVar.c();
                    }
                }
                this.f36725e.setLength(jC);
                gf.d(" [trim] real over  before dataBlockSize " + j10 + " cur " + (jC - size), this.f36730j);
            }
        }

        private void e(a aVar) throws Throwable {
            this.f36728h.remove(new i(aVar.f36749c));
            this.f36725e.seek(aVar.a());
            this.f36725e.writeByte(1);
            this.f36727g.add(aVar);
            aVar.f();
        }

        private ArrayList<a> f() {
            ArrayList<a> arrayList = new ArrayList<>(this.f36728h.values());
            Collections.sort(arrayList);
            return arrayList;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] f(a aVar) throws Throwable {
            this.f36725e.seek(aVar.b());
            byte[] bArr = new byte[(int) aVar.f36751e];
            this.f36725e.readFully(bArr);
            return bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean g() throws Throwable {
            boolean[] zArr = {false};
            long j10 = j();
            if (j10 != this.f36726f) {
                this.f36722b.lock();
                try {
                    this.f36733m.a();
                    this.f36726f = j10;
                    this.f36727g = new LinkedList<>();
                    this.f36728h = new HashMap<>();
                    int iC = c();
                    for (int i10 = 0; i10 < iC; i10++) {
                        a aVar = new a(i10);
                        if (b(aVar) == 1) {
                            this.f36727g.add(aVar);
                        } else {
                            a(aVar);
                            this.f36728h.put(new i(aVar.f36749c), aVar);
                        }
                    }
                    gf.d("update lstt " + this.f36726f + " a " + this.f36727g.size() + " u " + this.f36728h.size(), this.f36730j);
                    zArr[0] = true;
                } finally {
                    this.f36722b.unlock();
                }
            }
            return zArr[0];
        }

        private void h() throws Throwable {
            int iC = c();
            int i10 = iC + 1024;
            gf.d("[exp] old " + iC + " new " + i10, this.f36730j);
            long j10 = (((long) i10) * 41) + 1024;
            if ((((long) (this.f36728h.size() + this.f36727g.size())) * 41) + 1024 < j10) {
                for (a aVar : f()) {
                    if (aVar.b() >= j10) {
                        break;
                    }
                    long jB = aVar.b() + aVar.c();
                    if (aVar.e()) {
                        e(aVar);
                    } else {
                        a(aVar, this.f36725e.length());
                    }
                    if (jB >= j10) {
                        break;
                    }
                }
            }
            this.f36725e.seek(j10);
            for (int i11 = iC - 1; i11 < i10; i11++) {
                a aVar2 = new a(i11);
                this.f36727g.add(aVar2);
                a(aVar2.f36753g, (byte) 1);
            }
            gf.d("[exp] ovr", this.f36730j);
            a(i10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void i() throws Throwable {
            if (new Random().nextInt(10) < 1) {
                e();
            }
            this.f36726f = System.currentTimeMillis();
            this.f36725e.seek(0L);
            this.f36725e.writeLong(this.f36726f);
        }

        private long j() throws Throwable {
            this.f36725e.seek(0L);
            return this.f36725e.readLong();
        }

        public <T> T a(final i iVar, g<T> gVar) throws Throwable {
            c cVarA;
            final byte[][] bArr = new byte[1][];
            final long[] jArr = new long[1];
            final int[] iArr = new int[1];
            final Object[] objArr = new Object[1];
            this.f36722b.lock();
            try {
                ef.a(this.f36731k.getAbsolutePath(), true, 1500L, 50L, new ee() { // from class: cn.fly.verify.gf.k.3
                    @Override // cn.fly.verify.ee
                    public boolean a(gb gbVar) {
                        e eVarA;
                        try {
                            if (!k.this.g() && (eVarA = k.this.f36733m.a(iVar)) != null && eVarA.f36712b != null) {
                                if (eVarA.a()) {
                                    k.this.a(iVar, false);
                                    iArr[0] = 2;
                                } else {
                                    iArr[0] = 4;
                                    objArr[0] = eVarA.f36712b;
                                }
                            }
                            a aVar = (a) k.this.f36728h.get(iVar);
                            if (aVar == null) {
                                iArr[0] = 1;
                            } else if (aVar.e()) {
                                k.this.d(aVar);
                                iArr[0] = 2;
                            } else {
                                jArr[0] = aVar.f36752f;
                                bArr[0] = k.this.f(aVar);
                                iArr[0] = 3;
                            }
                        } catch (Throwable th2) {
                            gf.b(th2, k.this.f36730j);
                        }
                        return false;
                    }
                });
                this.f36722b.unlock();
                int i10 = iArr[0];
                if (i10 == 4) {
                    return (T) objArr[0];
                }
                if (i10 != 3) {
                    throw new b();
                }
                Object objA = this.f36732l.a(bArr[0], (Object) null);
                if (objA instanceof a) {
                    a aVar = (a) objA;
                    cVarA = new c(aVar.a(), aVar.b());
                } else {
                    cVarA = c.a((HashMap) objA);
                }
                if (cVarA == null) {
                    throw new b();
                }
                T tA = gVar.a(cVarA.a());
                this.f36733m.a(iVar, new e(Long.valueOf(jArr[0]).longValue(), tA));
                return tA;
            } catch (Throwable th2) {
                this.f36722b.unlock();
                throw th2;
            }
        }

        public String a() {
            return this.f36730j;
        }

        public void a(int i10) {
            if (i10 <= 0) {
                throw new IllegalArgumentException("indexNum : " + i10);
            }
            try {
                this.f36725e.seek(8L);
                this.f36725e.writeInt(i10);
            } catch (Throwable th2) {
                try {
                    gf.b(th2, this.f36730j);
                } catch (Throwable th3) {
                    gf.b(th3, this.f36730j);
                }
            }
        }

        public void a(long j10, byte b10) {
            try {
                this.f36725e.seek(j10);
                this.f36725e.writeByte(b10);
            } catch (Throwable unused) {
            }
        }

        public void a(a aVar) {
            try {
                c(aVar.f36747a);
                this.f36725e.seek(aVar.a());
                aVar.a(this.f36725e.readByte());
                aVar.a(a(aVar.f36753g));
                aVar.a(b(aVar.f36753g));
                aVar.b(c(aVar.f36753g));
                aVar.c(d(aVar.f36753g));
            } catch (Throwable th2) {
                gf.b(th2, this.f36730j);
            }
        }

        public boolean a(final i iVar, boolean z10) {
            this.f36722b.lock();
            final boolean[] zArr = new boolean[1];
            try {
                if (z10) {
                    ef.a(this.f36731k.getAbsolutePath(), true, 1500L, 50L, new ee() { // from class: cn.fly.verify.gf.k.4
                        @Override // cn.fly.verify.ee
                        public boolean a(gb gbVar) {
                            zArr[0] = k.this.b(iVar);
                            return false;
                        }
                    });
                } else {
                    zArr[0] = b(iVar);
                }
                this.f36722b.unlock();
                return zArr[0];
            } catch (Throwable th2) {
                this.f36722b.unlock();
                throw th2;
            }
        }

        public byte b(a aVar) throws Throwable {
            try {
                this.f36725e.seek(aVar.f36753g);
                return this.f36725e.readByte();
            } catch (Throwable th2) {
                gf.b(th2, this.f36730j);
                return (byte) 0;
            }
        }

        public ReentrantReadWriteLock.WriteLock b() {
            return this.f36722b;
        }

        public int c() {
            try {
                this.f36725e.seek(8L);
                return this.f36725e.readInt();
            } catch (Throwable th2) {
                gf.b(th2, this.f36730j);
                return 0;
            }
        }
    }

    public static class l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f36754a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Object f36755b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f36756c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private byte[] f36757d;

        public l(String str, Object obj, long j10) {
            this.f36754a = str;
            this.f36755b = obj;
            this.f36756c = j10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(byte[] bArr) {
            this.f36757d = bArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public byte[] f() {
            return this.f36757d;
        }

        public String a() {
            return this.f36754a;
        }

        public Object b() {
            return this.f36755b;
        }

        public Object c() {
            return this.f36755b;
        }

        public long d() {
            return this.f36756c;
        }

        public boolean e() {
            return d() != 0 && d() <= System.currentTimeMillis();
        }
    }

    public gf(Context context, final String str, String str2) {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f36699d = reentrantReadWriteLock;
        this.f36700e = reentrantReadWriteLock.writeLock();
        this.f36701f = reentrantReadWriteLock.readLock();
        h hVar = new h(str2);
        this.f36702g = hVar;
        this.f36696a = new k(context, str, hVar);
        if (str != null && str.startsWith(".") && str.length() > 1) {
            str = str.substring(1);
        }
        ScheduledExecutorService scheduledExecutorServiceNewSingleThreadScheduledExecutor = Executors.newSingleThreadScheduledExecutor(new ThreadFactory() { // from class: cn.fly.verify.gf.1
            @Override // java.util.concurrent.ThreadFactory
            public Thread newThread(Runnable runnable) {
                return new Thread(runnable, ep.f36339b + "MP-" + str);
            }
        });
        this.f36697b = scheduledExecutorServiceNewSingleThreadScheduledExecutor;
        scheduledExecutorServiceNewSingleThreadScheduledExecutor.schedule(new f(), 3000L, TimeUnit.MILLISECONDS);
    }

    public static synchronized File a(Context context) {
        return new File(context.getFilesDir(), bq.a("0049hm^gFekgj"));
    }

    private static void a(String str, boolean z10, String str2) {
        if (z10) {
            String str3 = "[MPF][" + f36695h + "]";
            if (str2 != null) {
                str3 = str3 + Constants.ARRAY_TYPE + str2 + "]";
            }
            es.a().a(str3 + str, new Object[0]);
        }
    }

    private static void a(Throwable th2, boolean z10, String str) {
        if (z10) {
            String str2 = "[MPF][" + f36695h + "]";
            if (str != null) {
                str2 = str2 + Constants.ARRAY_TYPE + str + "]";
            }
            es.a().a(th2, str2, new Object[0]);
        }
    }

    public static synchronized boolean a(Context context, String str) {
        File file;
        file = new File(a(context), str);
        return file.exists() && file.length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Throwable th2, String str) {
        a(th2, true, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str, String str2) {
        a(str, true, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void d(String str, String str2) {
        a(str, false, str2);
    }

    public <T> T a(g<T> gVar) throws b {
        if (gVar == null) {
            throw new IllegalArgumentException("deserializer is null");
        }
        String strA = gVar.a();
        if (TextUtils.isEmpty(strA)) {
            throw new IllegalArgumentException("Key: " + strA);
        }
        this.f36701f.lock();
        try {
            try {
                if (!this.f36698c.isEmpty() && this.f36698c.containsKey(strA)) {
                    l lVar = this.f36698c.get(strA);
                    if (!lVar.e()) {
                        T t10 = (T) lVar.b();
                        this.f36701f.unlock();
                        return t10;
                    }
                    this.f36698c.remove(strA);
                    d("Get done, exp-m: " + strA, this.f36696a.f36730j);
                    throw new b();
                }
            } catch (Throwable th2) {
                this.f36701f.unlock();
                throw th2;
            }
        } catch (b e10) {
            throw e10;
        } catch (Throwable th3) {
            b(th3, this.f36696a.f36730j);
        }
        this.f36701f.unlock();
        try {
            return (T) this.f36696a.a(new i(ga.c(strA)), gVar);
        } catch (Throwable unused) {
            throw new b();
        }
    }

    public void a(l lVar) {
        if (lVar == null) {
            throw new IllegalArgumentException("dataEntry is null");
        }
        String strA = lVar.a();
        long jD = lVar.d();
        if (TextUtils.isEmpty(strA) || jD < 0) {
            throw new IllegalArgumentException("Key: " + strA + ", expAt: " + jD);
        }
        lVar.a(ga.c(strA));
        this.f36700e.lock();
        try {
            this.f36698c.put(strA, lVar);
        } catch (Throwable th2) {
            try {
                b(th2, this.f36696a.f36730j);
            } finally {
                this.f36700e.unlock();
            }
        }
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("Key: " + str);
        }
        byte[] bArrC = ga.c(str);
        boolean[] zArr = {false};
        String[] strArr = {"f"};
        this.f36700e.lock();
        try {
            if (!this.f36698c.isEmpty() && this.f36698c.containsKey(str)) {
                this.f36698c.remove(str);
                zArr[0] = true;
                strArr[0] = "m";
            }
        } catch (Throwable th2) {
            try {
                b(th2, this.f36696a.f36730j);
            } catch (Throwable th3) {
                this.f36700e.unlock();
                throw th3;
            }
        }
        this.f36700e.unlock();
        zArr[0] = this.f36696a.a(new i(bArrC), true);
        d("rmv: " + str + ", from: " + strArr[0] + ", succ is " + zArr[0], this.f36696a.f36730j);
        return zArr[0];
    }
}
