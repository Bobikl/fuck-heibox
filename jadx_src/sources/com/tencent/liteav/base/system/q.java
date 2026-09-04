package com.tencent.liteav.base.system;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.security.MessageDigest;
import java.util.UUID;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final char[] f99682a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX WARN: Code duplicated, block: B:102:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:95:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x01e2: MOVE (r3 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]), block:B:86:0x01e2 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r0v35, types: [android.content.SharedPreferences$Editor] */
    /* JADX WARN: Type inference failed for: r0v39 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r10v10 */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r10v6 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v21, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r3v24, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v30 */
    /* JADX WARN: Type inference failed for: r3v31 */
    /* JADX WARN: Type inference failed for: r3v32 */
    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.String] */
    public static String a(String str) throws Throwable {
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        ?? r10;
        ?? r11;
        int i10;
        File file;
        ?? string;
        FileOutputStream fileOutputStream;
        String str2;
        Context applicationContext = ContextUtils.getApplicationContext();
        String string2 = "";
        if (applicationContext == null) {
            return "";
        }
        FileInputStream fileInputStream3 = null;
        ?? r12 = 0;
        File externalFilesDir = applicationContext.getExternalFilesDir(null);
        if (externalFilesDir == null) {
            Log.e("UUID", "getDeviceUuid: sdcardDir is null.", new Object[0]);
            return "";
        }
        SharedPreferences sharedPreferences = applicationContext.getSharedPreferences("com.tencent.liteav.dev_uuid", 0);
        ?? string3 = sharedPreferences.getString("com.tencent.liteav.key_dev_uuid", "");
        try {
            try {
                File file2 = new File(externalFilesDir.getAbsolutePath() + "/liteav/spuid");
                if (file2.exists()) {
                    fileInputStream = new FileInputStream(file2);
                    try {
                        int iAvailable = fileInputStream.available();
                        if (iAvailable > 0) {
                            byte[] bArr = new byte[iAvailable];
                            fileInputStream.read(bArr);
                            str2 = new String(bArr, "UTF-8");
                        } else {
                            r10 = 0;
                        }
                    } catch (Exception e10) {
                        e = e10;
                        Log.e("UUID", "Read UUID from file failed." + e.getMessage(), new Object[0]);
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                            } catch (Exception unused) {
                            }
                        }
                        r10 = 0;
                    }
                } else {
                    r10 = 0;
                    fileInputStream = null;
                }
                if (fileInputStream != null) {
                    try {
                        r10 = str2;
                        fileInputStream.close();
                    } catch (Exception unused2) {
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                fileInputStream3 = fileInputStream2;
                if (fileInputStream3 != null) {
                    try {
                        fileInputStream3.close();
                    } catch (Exception unused3) {
                    }
                }
                throw th;
            }
        } catch (Exception e11) {
            e = e11;
            fileInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (fileInputStream3 != null) {
                fileInputStream3.close();
            }
            throw th;
        }
        if (string3 == 0 || string3.length() <= 0) {
            r11 = (r10 == 0 || r10.length() <= 0) ? 0 : r10;
        } else {
            r11 = string3;
        }
        if (r11 == 0 || r11.length() == 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jUptimeMillis = SystemClock.uptimeMillis();
            int i11 = 5;
            while (true) {
                i10 = 1;
                if (i11 < 0) {
                    break;
                }
                string2 = string2 + String.format("%02x", Byte.valueOf((byte) ((jCurrentTimeMillis >> (i11 * 8)) & 255)));
                i11--;
                jCurrentTimeMillis = jCurrentTimeMillis;
            }
            int i12 = 3;
            while (i12 >= 0) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(string2);
                Object[] objArr = new Object[i10];
                objArr[0] = Byte.valueOf((byte) ((jUptimeMillis >> (i12 * 8)) & 255));
                sb2.append(String.format("%02x", objArr));
                string2 = sb2.toString();
                i12--;
                externalFilesDir = externalFilesDir;
                i10 = 1;
            }
            file = externalFilesDir;
            StringBuilder sb3 = new StringBuilder();
            sb3.append(string2);
            StringBuilder sb4 = new StringBuilder();
            sb4.append(str);
            String string4 = UUID.randomUUID().toString();
            sb4.append(string4);
            sb3.append(b(sb4.toString()));
            string = sb3.toString();
            r12 = string4;
        } else {
            string = r11;
            file = externalFilesDir;
        }
        if (r10 == 0 || !r10.equals(string)) {
            try {
                try {
                    File file3 = new File(file.getAbsolutePath() + "/liteav");
                    if (!file3.exists()) {
                        file3.mkdir();
                    }
                    File file4 = new File(file.getAbsolutePath() + "/liteav/spuid");
                    if (!file4.exists()) {
                        file4.createNewFile();
                    }
                    fileOutputStream = new FileOutputStream(file4);
                    try {
                        fileOutputStream.write(string.getBytes());
                        r12 = fileOutputStream;
                    } catch (Exception e12) {
                        e = e12;
                        Log.e("UUID", "Write UUID to file failed." + e.getMessage(), new Object[0]);
                        r12 = fileOutputStream;
                        if (fileOutputStream != null) {
                        }
                        if (string3 != 0) {
                            ?? Edit = sharedPreferences.edit();
                            Edit.putString("com.tencent.liteav.key_dev_uuid", string);
                            Edit.commit();
                        } else {
                            ?? Edit2 = sharedPreferences.edit();
                            Edit2.putString("com.tencent.liteav.key_dev_uuid", string);
                            Edit2.commit();
                        }
                        return string;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    if (r12 != 0) {
                        try {
                            r12.close();
                        } catch (Exception unused4) {
                        }
                    }
                    throw th;
                }
            } catch (Exception e13) {
                e = e13;
                fileOutputStream = null;
            } catch (Throwable th5) {
                th = th5;
                r12 = 0;
                if (r12 != 0) {
                    r12.close();
                }
                throw th;
            }
            try {
                r12.close();
            } catch (Exception unused5) {
            }
        }
        if (string3 != 0 || !string3.equals(string)) {
            ?? Edit3 = sharedPreferences.edit();
            Edit3.putString("com.tencent.liteav.key_dev_uuid", string);
            Edit3.commit();
        }
        return string;
    }

    private static String b(String str) {
        if (str == null) {
            return "";
        }
        try {
            byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            char[] cArr = new char[bArrDigest.length << 1];
            int i10 = 0;
            for (byte b10 : bArrDigest) {
                int i11 = i10 + 1;
                char[] cArr2 = f99682a;
                cArr[i10] = cArr2[(b10 & 240) >>> 4];
                i10 = i11 + 1;
                cArr[i11] = cArr2[b10 & 15];
            }
            return new String(cArr);
        } catch (Exception e10) {
            Log.e("UUID", "stringToMd5 failed.", e10);
            return "";
        }
    }
}
