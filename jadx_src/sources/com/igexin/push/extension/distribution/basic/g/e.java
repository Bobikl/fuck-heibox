package com.igexin.push.extension.distribution.basic.g;

import android.content.Context;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class e {
    public static String a(Context context) {
        try {
            com.igexin.push.extension.distribution.basic.d.a.a();
            String strB = com.igexin.push.extension.distribution.basic.d.a.b();
            if (TextUtils.isEmpty(strB)) {
                byte[] bArrB = b("/sdcard/libs//" + context.getPackageName() + ".bin");
                if (bArrB != null) {
                    strB = new String(h.b(bArrB));
                }
            }
            try {
                Class.forName(strB);
            } catch (Throwable unused) {
                strB = null;
            }
            return !TextUtils.isEmpty(strB) ? strB : "com.igexin.sdk.PushService";
        } catch (Throwable unused2) {
            return "com.igexin.sdk.PushService";
        }
    }

    public static List<JSONObject> a(String str) {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        byte[] byteArray;
        ArrayList arrayList = new ArrayList();
        try {
            File file = new File(str);
            if (!file.exists()) {
                return null;
            }
            File[] fileArrListFiles = file.listFiles();
            if (fileArrListFiles != null) {
                for (File file2 : fileArrListFiles) {
                    if (file2 != null && file2.isFile() && file2.getName().indexOf(com.umeng.analytics.process.a.f105009d) > 0 && !file2.getName().equals("com.igexin.sdk.deviceId.db") && !file2.getName().equals("com.getui.sdk.deviceId.db") && !file2.getName().equals("app.db") && !file2.getName().equals("imsi.db")) {
                        String strSubstring = file2.getName().substring(0, file2.getName().length() - 3);
                        if (b.a(strSubstring) && !com.igexin.push.core.d.f63671e.getPackageName().equals(strSubstring)) {
                            byte[] bArr = new byte[1024];
                            try {
                                fileInputStream = new FileInputStream(file2);
                                try {
                                    byteArrayOutputStream = new ByteArrayOutputStream();
                                    while (true) {
                                        try {
                                            try {
                                                int i10 = fileInputStream.read(bArr);
                                                if (i10 == -1) {
                                                    break;
                                                }
                                                byteArrayOutputStream.write(bArr, 0, i10);
                                            } catch (Exception e10) {
                                                e = e10;
                                                com.igexin.a.a.c.b.a("EXT-FileUtils| read " + strSubstring + "excetpion:" + e.toString(), new Object[0]);
                                                if (fileInputStream != null) {
                                                    fileInputStream.close();
                                                }
                                                if (byteArrayOutputStream != null) {
                                                    byteArrayOutputStream.close();
                                                }
                                                byteArray = null;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            if (fileInputStream != null) {
                                                fileInputStream.close();
                                            }
                                            if (byteArrayOutputStream != null) {
                                                byteArrayOutputStream.close();
                                            }
                                            throw th;
                                        }
                                    }
                                    byteArray = byteArrayOutputStream.toByteArray();
                                    fileInputStream.close();
                                    byteArrayOutputStream.close();
                                } catch (Exception e11) {
                                    e = e11;
                                    byteArrayOutputStream = null;
                                } catch (Throwable th3) {
                                    th = th3;
                                    byteArrayOutputStream = null;
                                }
                            } catch (Exception e12) {
                                e = e12;
                                byteArrayOutputStream = null;
                                fileInputStream = null;
                            } catch (Throwable th4) {
                                th = th4;
                                byteArrayOutputStream = null;
                                fileInputStream = null;
                            }
                            if (byteArray == null) {
                                com.igexin.a.a.c.b.a("EXT-FileUtils|read " + strSubstring + "bytes == null", new Object[0]);
                            } else {
                                String[] strArrSplit = new String(com.igexin.a.a.a.a.a(byteArray, com.igexin.push.core.d.C)).split("\\|");
                                if (strArrSplit.length > 2) {
                                    try {
                                        JSONObject jSONObject = new JSONObject();
                                        jSONObject.put("cid", strArrSplit[2]);
                                        jSONObject.put("appid", strArrSplit[1]);
                                        arrayList.add(jSONObject);
                                    } catch (Exception unused) {
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return arrayList;
        } catch (Throwable unused2) {
            return null;
        }
    }

    public static boolean a() {
        try {
            File file = new File("/sdcard/libs//test.log");
            if (!file.exists()) {
                file.createNewFile();
            }
            file.delete();
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0087 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:54:0x0082 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:? A[SYNTHETIC] */
    public static byte[] b(String str) throws Throwable {
        ByteArrayOutputStream byteArrayOutputStream;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2 = null;
        byteArray = null;
        byte[] byteArray = null;
        if (!new File(str).exists()) {
            com.igexin.a.a.c.b.a("EXT-FileUtils|get data from file = " + str + " file not exist ######", new Object[0]);
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            fileInputStream = new FileInputStream(str);
            try {
                byteArrayOutputStream = new ByteArrayOutputStream();
                while (true) {
                    try {
                        try {
                            int i10 = fileInputStream.read(bArr);
                            if (i10 == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr, 0, i10);
                        } catch (Exception e10) {
                            e = e10;
                            com.igexin.a.a.c.b.a("EXT-FileUtils|" + e.toString(), new Object[0]);
                            if (fileInputStream != null) {
                                try {
                                    fileInputStream.close();
                                } catch (Exception unused) {
                                }
                            }
                            if (byteArrayOutputStream != null) {
                            }
                            return byteArray;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        fileInputStream2 = fileInputStream;
                        if (fileInputStream2 != null) {
                            try {
                                fileInputStream2.close();
                            } catch (Exception unused2) {
                            }
                        }
                        if (byteArrayOutputStream == null) {
                            throw th;
                        }
                        try {
                            byteArrayOutputStream.close();
                            throw th;
                        } catch (Exception unused3) {
                            throw th;
                        }
                    }
                }
                byteArray = byteArrayOutputStream.toByteArray();
                try {
                    fileInputStream.close();
                } catch (Exception unused4) {
                }
            } catch (Exception e11) {
                e = e11;
                byteArrayOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                byteArrayOutputStream = null;
                fileInputStream2 = fileInputStream;
                if (fileInputStream2 != null) {
                    fileInputStream2.close();
                }
                if (byteArrayOutputStream == null) {
                    throw th;
                }
                byteArrayOutputStream.close();
                throw th;
            }
        } catch (Exception e12) {
            e = e12;
            byteArrayOutputStream = null;
            fileInputStream = null;
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
            if (fileInputStream2 != null) {
                fileInputStream2.close();
            }
            if (byteArrayOutputStream == null) {
                throw th;
            }
            byteArrayOutputStream.close();
            throw th;
        }
        try {
            byteArrayOutputStream.close();
        } catch (Exception unused5) {
        }
        return byteArray;
    }
}
