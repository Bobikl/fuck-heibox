package com.tencent.thumbplayer.tcmedia.utils;

import android.content.Context;
import android.os.Process;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.io.Serializable;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static Map<String, a> f103129a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C1028a f103130b;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.utils.a$a, reason: collision with other inner class name */
    public static class C1028a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected File f103131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final AtomicLong f103132b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f103133c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final long f103134d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f103135e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Map<File, Long> f103136f;

        private C1028a(File file, long j10, int i10) {
            this.f103136f = Collections.synchronizedMap(new HashMap());
            this.f103131a = file;
            this.f103134d = j10;
            this.f103135e = i10;
            this.f103132b = new AtomicLong();
            this.f103133c = new AtomicInteger();
            a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File a(String str) {
            File fileB = b(str);
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            fileB.setLastModified(lValueOf.longValue());
            this.f103136f.put(fileB, lValueOf);
            return fileB;
        }

        private void a() {
            o.a().d().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.utils.a.a.1
                @Override // java.lang.Runnable
                public void run() {
                    File[] fileArrListFiles = C1028a.this.f103131a.listFiles();
                    if (fileArrListFiles != null) {
                        int iB = 0;
                        int i10 = 0;
                        for (File file : fileArrListFiles) {
                            iB = (int) (((long) iB) + C1028a.this.b(file));
                            i10++;
                            C1028a.this.f103136f.put(file, Long.valueOf(file.lastModified()));
                        }
                        C1028a.this.f103132b.set(iB);
                        C1028a.this.f103133c.set(i10);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void a(File file) {
            int iAddAndGet = this.f103133c.get();
            while (iAddAndGet + 1 > this.f103135e) {
                this.f103132b.addAndGet(-c());
                iAddAndGet = this.f103133c.addAndGet(-1);
            }
            this.f103133c.addAndGet(1);
            long jB = b(file);
            long jAddAndGet = this.f103132b.get();
            while (jAddAndGet + jB > this.f103134d) {
                jAddAndGet = this.f103132b.addAndGet(-c());
            }
            this.f103132b.addAndGet(jB);
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            file.setLastModified(lValueOf.longValue());
            this.f103136f.put(file, lValueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long b(File file) {
            if (file == null) {
                return 0L;
            }
            return file.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File b(String str) {
            File file = this.f103131a;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.hashCode());
            return new File(file, sb2.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b() {
            this.f103136f.clear();
            this.f103132b.set(0L);
            this.f103133c.set(0);
            File[] fileArrListFiles = this.f103131a.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        }

        private long c() {
            File key;
            if (this.f103136f.isEmpty()) {
                return 0L;
            }
            Set<Map.Entry<File, Long>> setEntrySet = this.f103136f.entrySet();
            synchronized (this.f103136f) {
                key = null;
                Long value = null;
                for (Map.Entry<File, Long> entry : setEntrySet) {
                    if (key == null) {
                        key = entry.getKey();
                        value = entry.getValue();
                    } else {
                        Long value2 = entry.getValue();
                        if (value2.longValue() < value.longValue()) {
                            key = entry.getKey();
                            value = value2;
                        }
                    }
                }
            }
            if (key == null) {
                return 0L;
            }
            long jB = b(key);
            if (key.delete()) {
                this.f103136f.remove(key);
            }
            return jB;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean c(String str) {
            File fileA = a(str);
            long jB = b(fileA);
            if (!fileA.delete()) {
                return false;
            }
            this.f103133c.addAndGet(-1);
            this.f103132b.addAndGet(-jB);
            return true;
        }
    }

    public static class b {
        private static int a(byte[] bArr, char c10) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] == c10) {
                    return i10;
                }
            }
            return -1;
        }

        private static String a(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            String string = sb2.toString();
            while (string.length() < 13) {
                string = "0".concat(string);
            }
            return string + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i10 + ' ';
        }

        private static byte[] a(byte[] bArr, int i10, int i11) {
            int i12 = i11 - i10;
            if (i12 >= 0) {
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, Math.min(bArr.length - i10, i12));
                return bArr2;
            }
            throw new IllegalArgumentException(i10 + " > " + i11);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] b(int i10, byte[] bArr) {
            byte[] bytes = a(i10).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean c(byte[] bArr) {
            String[] strArrF = f(bArr);
            if (strArrF != null && strArrF.length == 2) {
                String strSubstring = strArrF[0];
                while (strSubstring.startsWith("0")) {
                    strSubstring = strSubstring.substring(1, strSubstring.length());
                }
                try {
                    if (System.currentTimeMillis() > Long.valueOf(strSubstring).longValue() + (Long.valueOf(strArrF[1]).longValue() * 1000)) {
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] d(byte[] bArr) {
            return e(bArr) ? a(bArr, a(bArr, ' ') + 1, bArr.length) : bArr;
        }

        private static boolean e(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && a(bArr, ' ') > 14;
        }

        private static String[] f(byte[] bArr) {
            if (e(bArr)) {
                return new String[]{new String(a(bArr, 0, 13)), new String(a(bArr, 14, a(bArr, ' ')))};
            }
            return null;
        }
    }

    private a(File file, long j10, int i10) {
        if (file.exists() || file.mkdirs()) {
            this.f103130b = new C1028a(file, j10, i10);
        } else {
            this.f103130b = null;
        }
    }

    public static a a(Context context, String str) {
        return a(new File(context.getCacheDir(), str), 50000000L, Integer.MAX_VALUE);
    }

    public static a a(File file, long j10, int i10) {
        a aVar;
        try {
            aVar = f103129a.get(file.getAbsoluteFile() + b());
        } catch (Exception unused) {
            aVar = null;
        }
        if (aVar != null) {
            return aVar;
        }
        try {
            a aVar2 = new a(file, j10, i10);
            try {
                f103129a.put(file.getAbsolutePath() + b(), aVar2);
            } catch (Throwable unused2) {
            }
            return aVar2;
        } catch (Throwable unused3) {
            return aVar;
        }
    }

    private static String b() {
        return lg.a.f131412e + Process.myPid();
    }

    public void a() {
        C1028a c1028a = this.f103130b;
        if (c1028a == null) {
            return;
        }
        c1028a.b();
    }

    public void a(String str, Serializable serializable) {
        a(str, serializable, -1);
    }

    public void a(String str, Serializable serializable, int i10) {
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(serializable);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (i10 != -1) {
                        a(str, byteArray, i10);
                    } else {
                        a(str, byteArray);
                    }
                    try {
                        objectOutputStream2.close();
                    } catch (Throwable unused) {
                    }
                } catch (Exception e10) {
                    e = e10;
                    objectOutputStream = objectOutputStream2;
                    e.printStackTrace();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable unused2) {
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    objectOutputStream = objectOutputStream2;
                    th.printStackTrace();
                    if (objectOutputStream != null) {
                        try {
                            objectOutputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                }
            } catch (Throwable th3) {
                if (0 != 0) {
                    try {
                        objectOutputStream.close();
                    } catch (Throwable unused4) {
                    }
                }
                throw th3;
            }
        } catch (Exception e11) {
            e = e11;
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public void a(String str, byte[] bArr) throws Throwable {
        C1028a c1028a = this.f103130b;
        if (c1028a == null) {
            return;
        }
        File fileB = c1028a.b(str);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileB);
                try {
                    fileOutputStream2.write(bArr);
                    try {
                        fileOutputStream2.flush();
                        fileOutputStream2.close();
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                    }
                } catch (Exception e11) {
                    e = e11;
                    fileOutputStream = fileOutputStream2;
                    e.printStackTrace();
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e12) {
                            e = e12;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream = fileOutputStream2;
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.flush();
                            fileOutputStream.close();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                    }
                    this.f103130b.a(fileB);
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
            this.f103130b.a(fileB);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void a(String str, byte[] bArr, int i10) throws Throwable {
        a(str, b.b(i10, bArr));
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0063: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:44:0x0063 */
    public byte[] a(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        C1028a c1028a = this.f103130b;
        RandomAccessFile randomAccessFile3 = null;
        try {
            if (c1028a == null) {
                return null;
            }
            try {
                File fileA = c1028a.a(str);
                if (!fileA.exists()) {
                    return null;
                }
                randomAccessFile2 = new RandomAccessFile(fileA, "r");
                try {
                    byte[] bArr = new byte[(int) randomAccessFile2.length()];
                    if (randomAccessFile2.read(bArr) <= 0) {
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        return null;
                    }
                    if (b.c(bArr)) {
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        c(str);
                        return null;
                    }
                    byte[] bArrD = b.d(bArr);
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    return bArrD;
                } catch (Exception e13) {
                    e = e13;
                }
            } catch (Exception e14) {
                e = e14;
                randomAccessFile2 = null;
            } catch (Throwable th2) {
                th = th2;
                if (randomAccessFile3 != null) {
                    try {
                        randomAccessFile3.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                throw th;
            }
            e.printStackTrace();
            if (randomAccessFile2 != null) {
                try {
                    randomAccessFile2.close();
                } catch (IOException e16) {
                    e16.printStackTrace();
                }
            }
            return null;
        } catch (Throwable th3) {
            th = th3;
            randomAccessFile3 = randomAccessFile;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public Object b(String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        ?? A = a(str);
        try {
            if (A == 0) {
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(A);
                try {
                    objectInputStream = new ObjectInputStream(byteArrayInputStream);
                    try {
                        Object object = objectInputStream.readObject();
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                        }
                        try {
                            objectInputStream.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        return object;
                    } catch (Exception e12) {
                        e = e12;
                        e.printStackTrace();
                        if (byteArrayInputStream != null) {
                            try {
                                byteArrayInputStream.close();
                            } catch (IOException e13) {
                                e13.printStackTrace();
                            }
                        }
                        if (objectInputStream != null) {
                            try {
                                objectInputStream.close();
                            } catch (IOException e14) {
                                e14.printStackTrace();
                            }
                        }
                        return null;
                    }
                } catch (Exception e15) {
                    e = e15;
                    objectInputStream = null;
                } catch (Throwable th2) {
                    th = th2;
                    A = 0;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                    }
                    if (A == 0) {
                        throw th;
                    }
                    try {
                        A.close();
                        throw th;
                    } catch (IOException e17) {
                        e17.printStackTrace();
                        throw th;
                    }
                }
            } catch (Exception e18) {
                e = e18;
                objectInputStream = null;
                byteArrayInputStream = null;
            } catch (Throwable th3) {
                byteArrayInputStream = null;
                th = th3;
                A = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    public boolean c(String str) {
        C1028a c1028a = this.f103130b;
        if (c1028a == null) {
            return false;
        }
        return c1028a.c(str);
    }
}
