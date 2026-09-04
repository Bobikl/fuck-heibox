package com.tencent.thumbplayer.tcmedia.core.thirdparties;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import com.tencent.thumbplayer.tcmedia.core.utils.TPThreadPool;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
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
import lg.a;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class LocalCache {
    private static final int MAX_COUNT = Integer.MAX_VALUE;
    private static final int MAX_SIZE = 50000000;
    public static final int TIME_DAY = 86400;
    public static final int TIME_HOUR = 3600;
    private static Map<String, LocalCache> mInstanceMap = new HashMap();
    private ACacheManager mCache;

    public class ACacheManager {
        private final AtomicInteger cacheCount;
        protected File cacheDir;
        private final AtomicLong cacheSize;
        private final int countLimit;
        private final Map<File, Long> lastUsageDates;
        private final long sizeLimit;

        private ACacheManager(File file, long j10, int i10) {
            this.lastUsageDates = Collections.synchronizedMap(new HashMap());
            this.cacheDir = file;
            this.sizeLimit = j10;
            this.countLimit = i10;
            this.cacheSize = new AtomicLong();
            this.cacheCount = new AtomicInteger();
            calculateCacheSizeAndCacheCount();
        }

        private void calculateCacheSizeAndCacheCount() {
            TPThreadPool.getInstance().obtainThreadExecutor().execute(new Runnable() { // from class: com.tencent.thumbplayer.tcmedia.core.thirdparties.LocalCache.ACacheManager.1
                @Override // java.lang.Runnable
                public void run() {
                    File[] fileArrListFiles = ACacheManager.this.cacheDir.listFiles();
                    if (fileArrListFiles != null) {
                        int iCalculateSize = 0;
                        int i10 = 0;
                        for (File file : fileArrListFiles) {
                            iCalculateSize = (int) (((long) iCalculateSize) + ACacheManager.this.calculateSize(file));
                            i10++;
                            ACacheManager.this.lastUsageDates.put(file, Long.valueOf(file.lastModified()));
                        }
                        ACacheManager.this.cacheSize.set(iCalculateSize);
                        ACacheManager.this.cacheCount.set(i10);
                    }
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long calculateSize(File file) {
            if (file == null) {
                return 0L;
            }
            return file.length();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void clear() {
            this.lastUsageDates.clear();
            this.cacheSize.set(0L);
            File[] fileArrListFiles = this.cacheDir.listFiles();
            if (fileArrListFiles != null) {
                for (File file : fileArrListFiles) {
                    file.delete();
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File get(String str) {
            File fileNewFile = newFile(str);
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            fileNewFile.setLastModified(lValueOf.longValue());
            this.lastUsageDates.put(fileNewFile, lValueOf);
            return fileNewFile;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public File newFile(String str) {
            File file = this.cacheDir;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str.hashCode());
            return new File(file, sb2.toString());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void put(File file) {
            int iAddAndGet = this.cacheCount.get();
            while (iAddAndGet + 1 > this.countLimit) {
                this.cacheSize.addAndGet(-removeNext());
                iAddAndGet = this.cacheCount.addAndGet(-1);
            }
            this.cacheCount.addAndGet(1);
            long jCalculateSize = calculateSize(file);
            long jAddAndGet = this.cacheSize.get();
            while (jAddAndGet + jCalculateSize > this.sizeLimit) {
                jAddAndGet = this.cacheSize.addAndGet(-removeNext());
            }
            this.cacheSize.addAndGet(jCalculateSize);
            Long lValueOf = Long.valueOf(System.currentTimeMillis());
            file.setLastModified(lValueOf.longValue());
            this.lastUsageDates.put(file, lValueOf);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean remove(String str) {
            return get(str).delete();
        }

        private long removeNext() {
            File key;
            if (this.lastUsageDates.isEmpty()) {
                return 0L;
            }
            Set<Map.Entry<File, Long>> setEntrySet = this.lastUsageDates.entrySet();
            synchronized (this.lastUsageDates) {
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
            long jCalculateSize = calculateSize(key);
            if (key.delete()) {
                this.lastUsageDates.remove(key);
            }
            return jCalculateSize;
        }
    }

    public static class Utils {
        private static final char mSeparator = ' ';

        private Utils() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] Bitmap2Bytes(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Bitmap Bytes2Bimap(byte[] bArr) {
            int length = bArr.length;
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Drawable bitmap2Drawable(Bitmap bitmap) {
            if (bitmap == null) {
                return null;
            }
            return new BitmapDrawable(bitmap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String clearDateInfo(String str) {
            return (str == null || !hasDateInfo(str.getBytes())) ? str : str.substring(str.indexOf(32) + 1, str.length());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] clearDateInfo(byte[] bArr) {
            return hasDateInfo(bArr) ? copyOfRange(bArr, indexOf(bArr, mSeparator) + 1, bArr.length) : bArr;
        }

        private static byte[] copyOfRange(byte[] bArr, int i10, int i11) {
            int i12 = i11 - i10;
            if (i12 >= 0) {
                byte[] bArr2 = new byte[i12];
                System.arraycopy(bArr, i10, bArr2, 0, Math.min(bArr.length - i10, i12));
                return bArr2;
            }
            throw new IllegalArgumentException(i10 + " > " + i11);
        }

        private static String createDateInfo(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(System.currentTimeMillis());
            String string = sb2.toString();
            while (string.length() < 13) {
                string = "0".concat(string);
            }
            return string + Constants.ACCEPT_TIME_SEPARATOR_SERVER + i10 + mSeparator;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Bitmap drawable2Bitmap(Drawable drawable) {
            if (drawable == null) {
                return null;
            }
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(intrinsicWidth, intrinsicHeight, drawable.getOpacity() != -1 ? Bitmap.Config.ARGB_8888 : Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, intrinsicWidth, intrinsicHeight);
            drawable.draw(canvas);
            return bitmapCreateBitmap;
        }

        private static String[] getDateInfoFromDate(byte[] bArr) {
            if (hasDateInfo(bArr)) {
                return new String[]{new String(copyOfRange(bArr, 0, 13)), new String(copyOfRange(bArr, 14, indexOf(bArr, mSeparator)))};
            }
            return null;
        }

        private static boolean hasDateInfo(byte[] bArr) {
            return bArr != null && bArr.length > 15 && bArr[13] == 45 && indexOf(bArr, mSeparator) > 14;
        }

        private static int indexOf(byte[] bArr, char c10) {
            for (int i10 = 0; i10 < bArr.length; i10++) {
                if (bArr[i10] == c10) {
                    return i10;
                }
            }
            return -1;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isDue(String str) {
            return isDue(str.getBytes());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static boolean isDue(byte[] bArr) {
            String[] dateInfoFromDate = getDateInfoFromDate(bArr);
            if (dateInfoFromDate != null && dateInfoFromDate.length == 2) {
                String strSubstring = dateInfoFromDate[0];
                while (strSubstring.startsWith("0")) {
                    strSubstring = strSubstring.substring(1, strSubstring.length());
                }
                try {
                    if (System.currentTimeMillis() > Long.valueOf(strSubstring).longValue() + (Long.valueOf(dateInfoFromDate[1]).longValue() * 1000)) {
                        return true;
                    }
                } catch (Exception unused) {
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static byte[] newByteArrayWithDateInfo(int i10, byte[] bArr) {
            byte[] bytes = createDateInfo(i10).getBytes();
            byte[] bArr2 = new byte[bytes.length + bArr.length];
            System.arraycopy(bytes, 0, bArr2, 0, bytes.length);
            System.arraycopy(bArr, 0, bArr2, bytes.length, bArr.length);
            return bArr2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static String newStringWithDateInfo(int i10, String str) {
            return createDateInfo(i10) + str;
        }
    }

    private LocalCache(File file, long j10, int i10) {
        if (file.exists() || file.mkdirs()) {
            this.mCache = new ACacheManager(file, j10, i10);
        } else {
            this.mCache = null;
        }
    }

    public static LocalCache get(Context context) {
        return get(context, "LocalCache");
    }

    public static LocalCache get(Context context, long j10, int i10) {
        return get(new File(context.getCacheDir(), "LocalCache"), j10, i10);
    }

    public static LocalCache get(Context context, String str) {
        return get(new File(context.getCacheDir(), str), 50000000L, Integer.MAX_VALUE);
    }

    public static LocalCache get(File file) {
        return get(file, 50000000L, Integer.MAX_VALUE);
    }

    public static LocalCache get(File file, long j10, int i10) {
        LocalCache localCache;
        try {
            localCache = mInstanceMap.get(file.getAbsoluteFile() + myPid());
        } catch (Exception unused) {
            localCache = null;
        }
        if (localCache != null) {
            return localCache;
        }
        try {
            LocalCache localCache2 = new LocalCache(file, j10, i10);
            try {
                mInstanceMap.put(file.getAbsolutePath() + myPid(), localCache2);
            } catch (Throwable unused2) {
            }
            return localCache2;
        } catch (Throwable unused3) {
            return localCache;
        }
    }

    private static String myPid() {
        return a.f131412e + Process.myPid();
    }

    public void clear() {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return;
        }
        aCacheManager.clear();
    }

    public File file(String str) {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return null;
        }
        File fileNewFile = aCacheManager.newFile(str);
        if (fileNewFile.exists()) {
            return fileNewFile;
        }
        return null;
    }

    /* JADX WARN: Not initialized variable reg: 2, insn: 0x0063: MOVE (r1 I:??[OBJECT, ARRAY]) = (r2 I:??[OBJECT, ARRAY]), block:B:44:0x0063 */
    public byte[] getAsBinary(String str) throws Throwable {
        RandomAccessFile randomAccessFile;
        RandomAccessFile randomAccessFile2;
        ACacheManager aCacheManager = this.mCache;
        RandomAccessFile randomAccessFile3 = null;
        try {
            if (aCacheManager == null) {
                return null;
            }
            try {
                File file = aCacheManager.get(str);
                if (!file.exists()) {
                    return null;
                }
                randomAccessFile2 = new RandomAccessFile(file, "r");
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
                    if (Utils.isDue(bArr)) {
                        try {
                            randomAccessFile2.close();
                        } catch (IOException e11) {
                            e11.printStackTrace();
                        }
                        remove(str);
                        return null;
                    }
                    byte[] bArrClearDateInfo = Utils.clearDateInfo(bArr);
                    try {
                        randomAccessFile2.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    return bArrClearDateInfo;
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

    public Bitmap getAsBitmap(String str) {
        if (getAsBinary(str) == null) {
            return null;
        }
        return Utils.Bytes2Bimap(getAsBinary(str));
    }

    public Drawable getAsDrawable(String str) {
        if (getAsBinary(str) == null) {
            return null;
        }
        return Utils.bitmap2Drawable(Utils.Bytes2Bimap(getAsBinary(str)));
    }

    public JSONArray getAsJSONArray(String str) {
        try {
            return new JSONArray(getAsString(str));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public JSONObject getAsJSONObject(String str) {
        try {
            return new JSONObject(getAsString(str));
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v2, types: [java.io.ObjectInputStream] */
    /* JADX WARN: Type inference failed for: r5v5 */
    public Object getAsObject(String str) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        ObjectInputStream objectInputStream;
        ?? asBinary = getAsBinary(str);
        try {
            if (asBinary == 0) {
                return null;
            }
            try {
                byteArrayInputStream = new ByteArrayInputStream(asBinary);
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
                    asBinary = 0;
                    if (byteArrayInputStream != null) {
                        try {
                            byteArrayInputStream.close();
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                    }
                    if (asBinary == 0) {
                        throw th;
                    }
                    try {
                        asBinary.close();
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
                asBinary = 0;
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v0, types: [boolean] */
    public String getAsString(String str) throws Throwable {
        BufferedReader bufferedReader;
        ACacheManager aCacheManager = this.mCache;
        ?? r10 = 0;
        if (aCacheManager == null) {
            return null;
        }
        File file = aCacheManager.get(str);
        ?? Exists = file.exists();
        try {
            if (Exists == 0) {
                return null;
            }
            try {
                bufferedReader = new BufferedReader(new FileReader(file));
                String str2 = "";
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        str2 = str2 + line;
                    } catch (IOException e10) {
                        e = e10;
                        e.printStackTrace();
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (IOException e11) {
                                e11.printStackTrace();
                            }
                        }
                        return null;
                    }
                }
                if (Utils.isDue(str2)) {
                    try {
                        bufferedReader.close();
                    } catch (IOException e12) {
                        e12.printStackTrace();
                    }
                    remove(str);
                    return null;
                }
                String strClearDateInfo = Utils.clearDateInfo(str2);
                try {
                    bufferedReader.close();
                } catch (IOException e13) {
                    e13.printStackTrace();
                }
                return strClearDateInfo;
            } catch (IOException e14) {
                e = e14;
                bufferedReader = null;
            } catch (Throwable th2) {
                th = th2;
                if (r10 != 0) {
                    try {
                        r10.close();
                    } catch (IOException e15) {
                        e15.printStackTrace();
                    }
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            r10 = Exists;
        }
    }

    public void put(String str, Bitmap bitmap) throws Throwable {
        put(str, Utils.Bitmap2Bytes(bitmap));
    }

    public void put(String str, Bitmap bitmap, int i10) throws Throwable {
        put(str, Utils.Bitmap2Bytes(bitmap), i10);
    }

    public void put(String str, Drawable drawable) throws Throwable {
        put(str, Utils.drawable2Bitmap(drawable));
    }

    public void put(String str, Drawable drawable, int i10) throws Throwable {
        put(str, Utils.drawable2Bitmap(drawable), i10);
    }

    public void put(String str, Serializable serializable) {
        put(str, serializable, -1);
    }

    public void put(String str, Serializable serializable, int i10) {
        ObjectOutputStream objectOutputStream = null;
        try {
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                ObjectOutputStream objectOutputStream2 = new ObjectOutputStream(byteArrayOutputStream);
                try {
                    objectOutputStream2.writeObject(serializable);
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    if (i10 != -1) {
                        put(str, byteArray, i10);
                    } else {
                        put(str, byteArray);
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

    public void put(String str, String str2) throws Throwable {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return;
        }
        File fileNewFile = aCacheManager.newFile(str);
        BufferedWriter bufferedWriter = null;
        try {
            try {
                BufferedWriter bufferedWriter2 = new BufferedWriter(new FileWriter(fileNewFile), 1024);
                try {
                    bufferedWriter2.write(str2);
                    try {
                        bufferedWriter2.flush();
                    } catch (IOException e10) {
                        e10.printStackTrace();
                    }
                    try {
                        bufferedWriter2.close();
                    } catch (IOException e11) {
                        e = e11;
                        e.printStackTrace();
                    }
                } catch (IOException e12) {
                    e = e12;
                    bufferedWriter = bufferedWriter2;
                    e.printStackTrace();
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.flush();
                        } catch (IOException e13) {
                            e13.printStackTrace();
                        }
                        try {
                            bufferedWriter.close();
                        } catch (IOException e14) {
                            e = e14;
                            e.printStackTrace();
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedWriter = bufferedWriter2;
                    if (bufferedWriter != null) {
                        try {
                            bufferedWriter.flush();
                        } catch (IOException e15) {
                            e15.printStackTrace();
                        }
                        try {
                            bufferedWriter.close();
                        } catch (IOException e16) {
                            e16.printStackTrace();
                        }
                    }
                    this.mCache.put(fileNewFile);
                    throw th;
                }
            } catch (IOException e17) {
                e = e17;
            }
            this.mCache.put(fileNewFile);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void put(String str, String str2, int i10) throws Throwable {
        put(str, Utils.newStringWithDateInfo(i10, str2));
    }

    public void put(String str, JSONArray jSONArray) throws Throwable {
        put(str, jSONArray.toString());
    }

    public void put(String str, JSONArray jSONArray, int i10) throws Throwable {
        put(str, jSONArray.toString(), i10);
    }

    public void put(String str, JSONObject jSONObject) throws Throwable {
        put(str, jSONObject.toString());
    }

    public void put(String str, JSONObject jSONObject, int i10) throws Throwable {
        put(str, jSONObject.toString(), i10);
    }

    public void put(String str, byte[] bArr) throws Throwable {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return;
        }
        File fileNewFile = aCacheManager.newFile(str);
        FileOutputStream fileOutputStream = null;
        try {
            try {
                FileOutputStream fileOutputStream2 = new FileOutputStream(fileNewFile);
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
                    this.mCache.put(fileNewFile);
                    throw th;
                }
            } catch (Exception e14) {
                e = e14;
            }
            this.mCache.put(fileNewFile);
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public void put(String str, byte[] bArr, int i10) throws Throwable {
        put(str, Utils.newByteArrayWithDateInfo(i10, bArr));
    }

    public boolean remove(String str) {
        ACacheManager aCacheManager = this.mCache;
        if (aCacheManager == null) {
            return false;
        }
        return aCacheManager.remove(str);
    }
}
