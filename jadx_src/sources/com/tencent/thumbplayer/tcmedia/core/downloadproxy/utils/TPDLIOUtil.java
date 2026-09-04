package com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils;

import android.content.Context;
import android.os.Environment;
import com.tencent.thumbplayer.tcmedia.core.downloadproxy.api.ITPDLProxyLogListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: classes4.dex */
public class TPDLIOUtil {
    private static final String FILE_NAME = "TPDLIOUtil";
    private static final String PROTOCOL_ASSET = "asset";
    private static final String PROTOCOL_FILE = "file";
    private static final String PROTOCOL_HTTP = "http";
    private static final String PROTOCOL_HTTPS = "https";
    private static Pattern PROTOCOL_PATTERN = Pattern.compile("^(\\w+):/{2,3}");
    private static Pattern PATH_PATTERN = Pattern.compile("^(\\w+):/{2,3}(.*)");

    public static File compare(File file, File file2) {
        if (file == null) {
            return file2;
        }
        if (file2 == null || !file2.exists()) {
            return file;
        }
        return (file.exists() && file.lastModified() > file2.lastModified()) ? file : file2;
    }

    public static int copy(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        if (file == null || file2 == null || !file.exists()) {
            return 0;
        }
        if (!file2.exists()) {
            File parentFile = file2.getParentFile();
            if (parentFile == null) {
                return 0;
            }
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                return 0;
            }
        }
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    int iCopy = copy(fileInputStream2, fileOutputStream);
                    try {
                        fileInputStream2.close();
                    } catch (IOException unused) {
                    }
                    try {
                        fileOutputStream.close();
                    } catch (IOException unused2) {
                    }
                    return iCopy;
                } catch (FileNotFoundException unused3) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused4) {
                        }
                    }
                    if (fileOutputStream != null) {
                        try {
                            fileOutputStream.close();
                        } catch (IOException unused5) {
                        }
                    }
                    return 0;
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (IOException unused6) {
                        }
                    }
                    if (fileOutputStream == null) {
                        throw th;
                    }
                    try {
                        fileOutputStream.close();
                        throw th;
                    } catch (IOException unused7) {
                        throw th;
                    }
                }
            } catch (FileNotFoundException unused8) {
                fileOutputStream = null;
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (FileNotFoundException unused9) {
            fileOutputStream = null;
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    public static int copy(InputStream inputStream, OutputStream outputStream) {
        if (inputStream == null || outputStream == null) {
            return 0;
        }
        byte[] bArr = new byte[1024];
        int i10 = 0;
        while (true) {
            try {
                int i11 = inputStream.read(bArr);
                if (i11 <= 0) {
                    break;
                }
                outputStream.write(bArr, 0, i11);
                i10 += i11;
            } catch (IOException unused) {
            }
        }
        return i10;
    }

    public static boolean createFile(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return true;
        }
        if (!createParentDirectories(file)) {
            return false;
        }
        try {
            return file.createNewFile();
        } catch (IOException unused) {
            return false;
        }
    }

    public static boolean createFile(String str) {
        if (str == null || str.length() <= 0) {
            return false;
        }
        return createFile(new File(str));
    }

    public static boolean createParentDirectories(File file) {
        if (file == null) {
            return false;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || parentFile.exists()) {
            return true;
        }
        return parentFile.mkdirs();
    }

    public static boolean createParentDirectories(String str) {
        return createParentDirectories(new File(str));
    }

    public static String getPath(String str) {
        if (str == null) {
            return null;
        }
        Matcher matcher = PATH_PATTERN.matcher(str);
        return (matcher.find() && matcher.group(1).equals(PROTOCOL_ASSET)) ? matcher.group(2) : str;
    }

    public static String getProtocol(String str) {
        if (str != null && str.length() > 0) {
            Matcher matcher = PROTOCOL_PATTERN.matcher(str);
            if (matcher.find()) {
                return matcher.group(1);
            }
        }
        return "file";
    }

    public static boolean isExternalStorageMounted() {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean isRemoteFile(String str) {
        String protocol = getProtocol(str);
        return protocol.equals("https") || protocol.equals("http");
    }

    public static InputStream open(Context context, String str) {
        String protocol = getProtocol(str);
        if (protocol.equals(PROTOCOL_ASSET)) {
            try {
                return context.getAssets().open(getPath(str));
            } catch (IOException unused) {
                return null;
            }
        }
        if (protocol.equals("file")) {
            try {
                return new FileInputStream(getPath(str));
            } catch (Exception unused2) {
                return null;
            }
        }
        if (!protocol.equals("http") && !protocol.equals("https")) {
            return null;
        }
        try {
            return new URL(str).openStream();
        } catch (Exception unused3) {
            return null;
        }
    }

    public static InputStream openInputStream(File file) {
        if (file == null) {
            return null;
        }
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    public static InputStream openInputStream(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return openInputStream(new File(str));
    }

    public static OutputStream openOutputStream(File file) {
        if (file != null && createFile(file)) {
            try {
                return new FileOutputStream(file);
            } catch (FileNotFoundException unused) {
            }
        }
        return null;
    }

    public static OutputStream openOutputStream(String str) {
        if (str == null || str.length() <= 0) {
            return null;
        }
        return openOutputStream(new File(str));
    }

    public static void recursiveDelete(File file) {
        if (file != null) {
            try {
                if (file.exists()) {
                    if (file.isDirectory()) {
                        File[] fileArrListFiles = file.listFiles();
                        if (fileArrListFiles == null) {
                            return;
                        }
                        for (File file2 : fileArrListFiles) {
                            recursiveDelete(file2);
                        }
                    }
                    TPDLProxyLog.d(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "recursiveDelete: delete=".concat(String.valueOf(file.delete())));
                }
            } catch (Exception e10) {
                TPDLProxyLog.d(FILE_NAME, 0, ITPDLProxyLogListener.COMMON_TAG, "recursiveDelete failed, error:" + e10.toString());
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0029, code lost:
    
        if (r6.createNewFile() == false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean write(java.io.File r6, byte[] r7, int r8, int r9) throws java.lang.Throwable {
        /*
            java.lang.String r0 = "write error:"
            java.lang.String r1 = "tpdlnative"
            java.lang.String r2 = "TPDLIOUtil"
            r3 = 0
            if (r6 == 0) goto L8a
            if (r7 == 0) goto L8a
            int r4 = r7.length
            if (r4 > 0) goto L12
            goto L8a
        L12:
            boolean r4 = r6.exists()
            if (r4 != 0) goto L2c
            java.io.File r4 = r6.getParentFile()
            if (r4 == 0) goto L25
            boolean r4 = r4.mkdirs()
            if (r4 != 0) goto L25
            return r3
        L25:
            boolean r4 = r6.createNewFile()     // Catch: java.io.IOException -> L2b
            if (r4 != 0) goto L2c
        L2b:
            return r3
        L2c:
            r4 = 0
            java.io.FileOutputStream r5 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L70
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L54 java.lang.Exception -> L70
            r5.write(r7, r8, r9)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L52
            r5.close()     // Catch: java.io.IOException -> L39
            goto L4d
        L39:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog.e(r2, r3, r1, r6)
        L4d:
            r6 = 1
            return r6
        L4f:
            r6 = move-exception
            r4 = r5
            goto L55
        L52:
            r4 = r5
            goto L70
        L54:
            r6 = move-exception
        L55:
            if (r4 == 0) goto L6f
            r4.close()     // Catch: java.io.IOException -> L5b
            goto L6f
        L5b:
            r7 = move-exception
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>(r0)
            java.lang.String r7 = r7.toString()
            r8.append(r7)
            java.lang.String r7 = r8.toString()
            com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog.e(r2, r3, r1, r7)
        L6f:
            throw r6
        L70:
            if (r4 == 0) goto L8a
            r4.close()     // Catch: java.io.IOException -> L76
            goto L8a
        L76:
            r6 = move-exception
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>(r0)
            java.lang.String r6 = r6.toString()
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLProxyLog.e(r2, r3, r1, r6)
        L8a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.thumbplayer.tcmedia.core.downloadproxy.utils.TPDLIOUtil.write(java.io.File, byte[], int, int):boolean");
    }
}
