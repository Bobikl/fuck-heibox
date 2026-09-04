package com.google.android.exoplayer2.upstream.cache;

import android.annotation.SuppressLint;
import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import androidx.annotation.j1;
import androidx.annotation.k1;
import androidx.annotation.p0;
import com.google.android.exoplayer2.database.DatabaseIOException;
import com.google.android.exoplayer2.util.u0;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.b3;
import com.tencent.cos.xml.crypto.JceEncryptionConstants;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: compiled from: CachedContentIndex.java */
/* JADX INFO: loaded from: classes7.dex */
public class k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final String f51026g = "cached_content_index.exi";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f51027h = 10485760;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final HashMap<String, j> f51028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SparseArray<String> f51029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final SparseBooleanArray f51030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final SparseBooleanArray f51031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private c f51032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private c f51033f;

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static final class a implements c {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final String f51034e = "ExoPlayerCacheIndex";

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private static final int f51035f = 1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final String f51036g = "id";

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final String f51037h = "key";

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final String f51038i = "metadata";

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f51039j = 0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private static final int f51040k = 1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private static final int f51041l = 2;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private static final String f51042m = "id = ?";

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static final String[] f51043n = {"id", "key", "metadata"};

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private static final String f51044o = "(id INTEGER PRIMARY KEY NOT NULL,key TEXT NOT NULL,metadata BLOB NOT NULL)";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final o8.b f51045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SparseArray<j> f51046b = new SparseArray<>();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private String f51047c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private String f51048d;

        public a(o8.b bVar) {
            this.f51045a = bVar;
        }

        private void a(SQLiteDatabase sQLiteDatabase, j jVar) throws IOException {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            k.v(jVar.d(), new DataOutputStream(byteArrayOutputStream));
            byte[] byteArray = byteArrayOutputStream.toByteArray();
            ContentValues contentValues = new ContentValues();
            contentValues.put("id", Integer.valueOf(jVar.f51019a));
            contentValues.put("key", jVar.f51020b);
            contentValues.put("metadata", byteArray);
            sQLiteDatabase.replaceOrThrow((String) com.google.android.exoplayer2.util.a.g(this.f51048d), null, contentValues);
        }

        public static void j(o8.b bVar, long j10) throws DatabaseIOException {
            k(bVar, Long.toHexString(j10));
        }

        private static void k(o8.b bVar, String str) throws DatabaseIOException {
            try {
                String strO = o(str);
                SQLiteDatabase writableDatabase = bVar.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    o8.g.c(writableDatabase, 1, str);
                    m(writableDatabase, strO);
                    writableDatabase.setTransactionSuccessful();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        private void l(SQLiteDatabase sQLiteDatabase, int i10) {
            sQLiteDatabase.delete((String) com.google.android.exoplayer2.util.a.g(this.f51048d), f51042m, new String[]{Integer.toString(i10)});
        }

        private static void m(SQLiteDatabase sQLiteDatabase, String str) {
            String strValueOf = String.valueOf(str);
            sQLiteDatabase.execSQL(strValueOf.length() != 0 ? "DROP TABLE IF EXISTS ".concat(strValueOf) : new String("DROP TABLE IF EXISTS "));
        }

        private Cursor n() {
            return this.f51045a.getReadableDatabase().query((String) com.google.android.exoplayer2.util.a.g(this.f51048d), f51043n, null, null, null, null, null);
        }

        private static String o(String str) {
            String strValueOf = String.valueOf(str);
            return strValueOf.length() != 0 ? f51034e.concat(strValueOf) : new String(f51034e);
        }

        private void p(SQLiteDatabase sQLiteDatabase) throws DatabaseIOException {
            o8.g.d(sQLiteDatabase, 1, (String) com.google.android.exoplayer2.util.a.g(this.f51047c), 1);
            m(sQLiteDatabase, (String) com.google.android.exoplayer2.util.a.g(this.f51048d));
            String str = this.f51048d;
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 88);
            sb2.append("CREATE TABLE ");
            sb2.append(str);
            sb2.append(" ");
            sb2.append(f51044o);
            sQLiteDatabase.execSQL(sb2.toString());
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void b() throws DatabaseIOException {
            k(this.f51045a, (String) com.google.android.exoplayer2.util.a.g(this.f51047c));
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void c(long j10) {
            String hexString = Long.toHexString(j10);
            this.f51047c = hexString;
            this.f51048d = o(hexString);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void d(HashMap<String, j> map) throws IOException {
            try {
                SQLiteDatabase writableDatabase = this.f51045a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                try {
                    p(writableDatabase);
                    Iterator<j> it = map.values().iterator();
                    while (it.hasNext()) {
                        a(writableDatabase, it.next());
                    }
                    writableDatabase.setTransactionSuccessful();
                    this.f51046b.clear();
                } finally {
                    writableDatabase.endTransaction();
                }
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void e(j jVar, boolean z10) {
            if (z10) {
                this.f51046b.delete(jVar.f51019a);
            } else {
                this.f51046b.put(jVar.f51019a, null);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public boolean f() throws DatabaseIOException {
            return o8.g.b(this.f51045a.getReadableDatabase(), 1, (String) com.google.android.exoplayer2.util.a.g(this.f51047c)) != -1;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void g(HashMap<String, j> map) throws IOException {
            if (this.f51046b.size() == 0) {
                return;
            }
            try {
                SQLiteDatabase writableDatabase = this.f51045a.getWritableDatabase();
                writableDatabase.beginTransactionNonExclusive();
                for (int i10 = 0; i10 < this.f51046b.size(); i10++) {
                    try {
                        j jVarValueAt = this.f51046b.valueAt(i10);
                        if (jVarValueAt == null) {
                            l(writableDatabase, this.f51046b.keyAt(i10));
                        } else {
                            a(writableDatabase, jVarValueAt);
                        }
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                writableDatabase.setTransactionSuccessful();
                this.f51046b.clear();
                writableDatabase.endTransaction();
            } catch (SQLException e10) {
                throw new DatabaseIOException(e10);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void h(j jVar) {
            this.f51046b.put(jVar.f51019a, jVar);
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void i(HashMap<String, j> map, SparseArray<String> sparseArray) throws IOException {
            com.google.android.exoplayer2.util.a.i(this.f51046b.size() == 0);
            try {
                if (o8.g.b(this.f51045a.getReadableDatabase(), 1, (String) com.google.android.exoplayer2.util.a.g(this.f51047c)) != 1) {
                    SQLiteDatabase writableDatabase = this.f51045a.getWritableDatabase();
                    writableDatabase.beginTransactionNonExclusive();
                    try {
                        p(writableDatabase);
                        writableDatabase.setTransactionSuccessful();
                        writableDatabase.endTransaction();
                    } catch (Throwable th2) {
                        writableDatabase.endTransaction();
                        throw th2;
                    }
                }
                Cursor cursorN = n();
                while (cursorN.moveToNext()) {
                    try {
                        j jVar = new j(cursorN.getInt(0), (String) com.google.android.exoplayer2.util.a.g(cursorN.getString(1)), k.s(new DataInputStream(new ByteArrayInputStream(cursorN.getBlob(2)))));
                        map.put(jVar.f51020b, jVar);
                        sparseArray.put(jVar.f51019a, jVar.f51020b);
                    } catch (Throwable th3) {
                        if (cursorN != null) {
                            try {
                                cursorN.close();
                            } catch (Throwable th4) {
                                th3.addSuppressed(th4);
                            }
                        }
                        throw th3;
                    }
                }
                cursorN.close();
            } catch (SQLiteException e10) {
                map.clear();
                sparseArray.clear();
                throw new DatabaseIOException(e10);
            }
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public static class b implements c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final int f51049h = 2;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final int f51050i = 2;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private static final int f51051j = 1;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f51052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @p0
        private final Cipher f51053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        private final SecretKeySpec f51054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @p0
        private final SecureRandom f51055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final com.google.android.exoplayer2.util.b f51056e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f51057f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @p0
        private s f51058g;

        public b(File file, @p0 byte[] bArr, boolean z10) {
            Cipher cipherJ;
            SecretKeySpec secretKeySpec;
            com.google.android.exoplayer2.util.a.i((bArr == null && z10) ? false : true);
            if (bArr != null) {
                com.google.android.exoplayer2.util.a.a(bArr.length == 16);
                try {
                    cipherJ = k.j();
                    secretKeySpec = new SecretKeySpec(bArr, JceEncryptionConstants.SYMMETRIC_KEY_ALGORITHM);
                } catch (NoSuchAlgorithmException | NoSuchPaddingException e10) {
                    throw new IllegalStateException(e10);
                }
            } else {
                com.google.android.exoplayer2.util.a.a(!z10);
                cipherJ = null;
                secretKeySpec = null;
            }
            this.f51052a = z10;
            this.f51053b = cipherJ;
            this.f51054c = secretKeySpec;
            this.f51055d = z10 ? new SecureRandom() : null;
            this.f51056e = new com.google.android.exoplayer2.util.b(file);
        }

        private int a(j jVar, int i10) {
            int i11;
            int iHashCode;
            int iHashCode2 = (jVar.f51019a * 31) + jVar.f51020b.hashCode();
            if (i10 < 2) {
                long jA = l.a(jVar.d());
                i11 = iHashCode2 * 31;
                iHashCode = (int) (jA ^ (jA >>> 32));
            } else {
                i11 = iHashCode2 * 31;
                iHashCode = jVar.d().hashCode();
            }
            return i11 + iHashCode;
        }

        private j j(int i10, DataInputStream dataInputStream) throws IOException {
            o oVarS;
            int i11 = dataInputStream.readInt();
            String utf = dataInputStream.readUTF();
            if (i10 < 2) {
                long j10 = dataInputStream.readLong();
                n nVar = new n();
                n.h(nVar, j10);
                oVarS = o.f51064f.f(nVar);
            } else {
                oVarS = k.s(dataInputStream);
            }
            return new j(i11, utf, oVarS);
        }

        private boolean k(HashMap<String, j> map, SparseArray<String> sparseArray) throws Throwable {
            if (!this.f51056e.c()) {
                return true;
            }
            DataInputStream dataInputStream = null;
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(this.f51056e.d());
                DataInputStream dataInputStream2 = new DataInputStream(bufferedInputStream);
                try {
                    int i10 = dataInputStream2.readInt();
                    if (i10 >= 0 && i10 <= 2) {
                        if ((dataInputStream2.readInt() & 1) != 0) {
                            if (this.f51053b == null) {
                                u0.p(dataInputStream2);
                                return false;
                            }
                            byte[] bArr = new byte[16];
                            dataInputStream2.readFully(bArr);
                            try {
                                this.f51053b.init(2, (Key) u0.k(this.f51054c), new IvParameterSpec(bArr));
                                dataInputStream2 = new DataInputStream(new CipherInputStream(bufferedInputStream, this.f51053b));
                            } catch (InvalidAlgorithmParameterException e10) {
                                e = e10;
                                throw new IllegalStateException(e);
                            } catch (InvalidKeyException e11) {
                                e = e11;
                                throw new IllegalStateException(e);
                            }
                        } else if (this.f51052a) {
                            this.f51057f = true;
                        }
                        int i11 = dataInputStream2.readInt();
                        int iA = 0;
                        for (int i12 = 0; i12 < i11; i12++) {
                            j jVarJ = j(i10, dataInputStream2);
                            map.put(jVarJ.f51020b, jVarJ);
                            sparseArray.put(jVarJ.f51019a, jVarJ.f51020b);
                            iA += a(jVarJ, i10);
                        }
                        int i13 = dataInputStream2.readInt();
                        boolean z10 = dataInputStream2.read() == -1;
                        if (i13 == iA && z10) {
                            u0.p(dataInputStream2);
                            return true;
                        }
                        u0.p(dataInputStream2);
                        return false;
                    }
                    u0.p(dataInputStream2);
                    return false;
                } catch (IOException unused) {
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        u0.p(dataInputStream);
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    dataInputStream = dataInputStream2;
                    if (dataInputStream != null) {
                        u0.p(dataInputStream);
                    }
                    throw th;
                }
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                th = th3;
            }
        }

        private void l(j jVar, DataOutputStream dataOutputStream) throws IOException {
            dataOutputStream.writeInt(jVar.f51019a);
            dataOutputStream.writeUTF(jVar.f51020b);
            k.v(jVar.d(), dataOutputStream);
        }

        private void m(HashMap<String, j> map) throws Throwable {
            DataOutputStream dataOutputStream = null;
            try {
                OutputStream outputStreamF = this.f51056e.f();
                s sVar = this.f51058g;
                if (sVar == null) {
                    this.f51058g = new s(outputStreamF);
                } else {
                    sVar.a(outputStreamF);
                }
                s sVar2 = this.f51058g;
                DataOutputStream dataOutputStream2 = new DataOutputStream(sVar2);
                try {
                    dataOutputStream2.writeInt(2);
                    int iA = 0;
                    dataOutputStream2.writeInt(this.f51052a ? 1 : 0);
                    if (this.f51052a) {
                        byte[] bArr = new byte[16];
                        ((SecureRandom) u0.k(this.f51055d)).nextBytes(bArr);
                        dataOutputStream2.write(bArr);
                        try {
                            ((Cipher) u0.k(this.f51053b)).init(1, (Key) u0.k(this.f51054c), new IvParameterSpec(bArr));
                            dataOutputStream2.flush();
                            dataOutputStream2 = new DataOutputStream(new CipherOutputStream(sVar2, this.f51053b));
                        } catch (InvalidAlgorithmParameterException e10) {
                            e = e10;
                            throw new IllegalStateException(e);
                        } catch (InvalidKeyException e11) {
                            e = e11;
                            throw new IllegalStateException(e);
                        }
                    }
                    dataOutputStream2.writeInt(map.size());
                    for (j jVar : map.values()) {
                        l(jVar, dataOutputStream2);
                        iA += a(jVar, 2);
                    }
                    dataOutputStream2.writeInt(iA);
                    this.f51056e.b(dataOutputStream2);
                    u0.p(null);
                } catch (Throwable th2) {
                    th = th2;
                    dataOutputStream = dataOutputStream2;
                    u0.p(dataOutputStream);
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void b() {
            this.f51056e.a();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void c(long j10) {
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void d(HashMap<String, j> map) throws Throwable {
            m(map);
            this.f51057f = false;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void e(j jVar, boolean z10) {
            this.f51057f = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public boolean f() {
            return this.f51056e.c();
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void g(HashMap<String, j> map) throws Throwable {
            if (this.f51057f) {
                d(map);
            }
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void h(j jVar) {
            this.f51057f = true;
        }

        @Override // com.google.android.exoplayer2.upstream.cache.k.c
        public void i(HashMap<String, j> map, SparseArray<String> sparseArray) {
            com.google.android.exoplayer2.util.a.i(!this.f51057f);
            if (k(map, sparseArray)) {
                return;
            }
            map.clear();
            sparseArray.clear();
            this.f51056e.a();
        }
    }

    /* JADX INFO: compiled from: CachedContentIndex.java */
    public interface c {
        void b() throws IOException;

        void c(long j10);

        void d(HashMap<String, j> map) throws IOException;

        void e(j jVar, boolean z10);

        boolean f() throws IOException;

        void g(HashMap<String, j> map) throws IOException;

        void h(j jVar);

        void i(HashMap<String, j> map, SparseArray<String> sparseArray) throws IOException;
    }

    public k(o8.b bVar) {
        this(bVar, null, null, false, false);
    }

    public k(@p0 o8.b bVar, @p0 File file, @p0 byte[] bArr, boolean z10, boolean z11) {
        com.google.android.exoplayer2.util.a.i((bVar == null && file == null) ? false : true);
        this.f51028a = new HashMap<>();
        this.f51029b = new SparseArray<>();
        this.f51030c = new SparseBooleanArray();
        this.f51031d = new SparseBooleanArray();
        a aVar = bVar != null ? new a(bVar) : null;
        b bVar2 = file != null ? new b(new File(file, f51026g), bArr, z10) : null;
        if (aVar == null || (bVar2 != null && z11)) {
            this.f51032e = (c) u0.k(bVar2);
            this.f51033f = aVar;
        } else {
            this.f51032e = aVar;
            this.f51033f = bVar2;
        }
    }

    private j d(String str) {
        int iN = n(this.f51029b);
        j jVar = new j(iN, str);
        this.f51028a.put(str, jVar);
        this.f51029b.put(iN, str);
        this.f51031d.put(iN, true);
        this.f51032e.h(jVar);
        return jVar;
    }

    @k1
    public static void g(o8.b bVar, long j10) throws DatabaseIOException {
        a.j(bVar, j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"GetInstance"})
    public static Cipher j() throws NoSuchPaddingException, NoSuchAlgorithmException {
        if (u0.f51536a == 18) {
            try {
                return Cipher.getInstance("AES/CBC/PKCS5PADDING", "BC");
            } catch (Throwable unused) {
            }
        }
        return Cipher.getInstance("AES/CBC/PKCS5PADDING");
    }

    @j1
    static int n(SparseArray<String> sparseArray) {
        int size = sparseArray.size();
        int i10 = 0;
        int iKeyAt = size == 0 ? 0 : sparseArray.keyAt(size - 1) + 1;
        if (iKeyAt >= 0) {
            return iKeyAt;
        }
        while (i10 < size && i10 == sparseArray.keyAt(i10)) {
            i10++;
        }
        return i10;
    }

    public static boolean q(String str) {
        return str.startsWith(f51026g);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static o s(DataInputStream dataInputStream) throws IOException {
        int i10 = dataInputStream.readInt();
        HashMap map = new HashMap();
        for (int i11 = 0; i11 < i10; i11++) {
            String utf = dataInputStream.readUTF();
            int i12 = dataInputStream.readInt();
            if (i12 < 0) {
                StringBuilder sb2 = new StringBuilder(31);
                sb2.append("Invalid value size: ");
                sb2.append(i12);
                throw new IOException(sb2.toString());
            }
            int iMin = Math.min(i12, 10485760);
            byte[] bArrCopyOf = u0.f51541f;
            int i13 = 0;
            while (i13 != i12) {
                int i14 = i13 + iMin;
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i14);
                dataInputStream.readFully(bArrCopyOf, i13, iMin);
                iMin = Math.min(i12 - i14, 10485760);
                i13 = i14;
            }
            map.put(utf, bArrCopyOf);
        }
        return new o(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void v(o oVar, DataOutputStream dataOutputStream) throws IOException {
        Set<Map.Entry<String, byte[]>> setG = oVar.g();
        dataOutputStream.writeInt(setG.size());
        for (Map.Entry<String, byte[]> entry : setG) {
            dataOutputStream.writeUTF(entry.getKey());
            byte[] value = entry.getValue();
            dataOutputStream.writeInt(value.length);
            dataOutputStream.write(value);
        }
    }

    public void e(String str, n nVar) {
        j jVarO = o(str);
        if (jVarO.b(nVar)) {
            this.f51032e.h(jVarO);
        }
    }

    public int f(String str) {
        return o(str).f51019a;
    }

    @p0
    public j h(String str) {
        return this.f51028a.get(str);
    }

    public Collection<j> i() {
        return Collections.unmodifiableCollection(this.f51028a.values());
    }

    public m k(String str) {
        j jVarH = h(str);
        return jVarH != null ? jVarH.d() : o.f51064f;
    }

    @p0
    public String l(int i10) {
        return this.f51029b.get(i10);
    }

    public Set<String> m() {
        return this.f51028a.keySet();
    }

    public j o(String str) {
        j jVar = this.f51028a.get(str);
        return jVar == null ? d(str) : jVar;
    }

    @k1
    public void p(long j10) throws IOException {
        c cVar;
        this.f51032e.c(j10);
        c cVar2 = this.f51033f;
        if (cVar2 != null) {
            cVar2.c(j10);
        }
        if (this.f51032e.f() || (cVar = this.f51033f) == null || !cVar.f()) {
            this.f51032e.i(this.f51028a, this.f51029b);
        } else {
            this.f51033f.i(this.f51028a, this.f51029b);
            this.f51032e.d(this.f51028a);
        }
        c cVar3 = this.f51033f;
        if (cVar3 != null) {
            cVar3.b();
            this.f51033f = null;
        }
    }

    public void r(String str) {
        j jVar = this.f51028a.get(str);
        if (jVar != null && jVar.g() && jVar.i()) {
            this.f51028a.remove(str);
            int i10 = jVar.f51019a;
            boolean z10 = this.f51031d.get(i10);
            this.f51032e.e(jVar, z10);
            if (z10) {
                this.f51029b.remove(i10);
                this.f51031d.delete(i10);
            } else {
                this.f51029b.put(i10, null);
                this.f51030c.put(i10, true);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void t() {
        b3 it = ImmutableSet.w(this.f51028a.keySet()).iterator();
        while (it.hasNext()) {
            r((String) it.next());
        }
    }

    @k1
    public void u() throws IOException {
        this.f51032e.g(this.f51028a);
        int size = this.f51030c.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f51029b.remove(this.f51030c.keyAt(i10));
        }
        this.f51030c.clear();
        this.f51031d.clear();
    }
}
