package com.alipay.android.fintech.log;

import android.text.TextUtils;
import com.tencent.qcloud.core.util.IOUtils;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/* JADX INFO: loaded from: classes6.dex */
public class ZipUtil {
    private static final int BUFFER_LENGTH = 8192;

    public interface ZipFileHandler {
        String handleFileNameInZip(File file);
    }

    private static String getAbsFileName(File file, File file2, ZipFileHandler zipFileHandler) {
        String strHandleFileNameInZip = null;
        if (file2 == null) {
            return null;
        }
        if (file == null) {
            file = file2.getParentFile();
        }
        if (zipFileHandler != null) {
            try {
                strHandleFileNameInZip = zipFileHandler.handleFileNameInZip(file2);
            } catch (Throwable unused) {
            }
        }
        if (TextUtils.isEmpty(strHandleFileNameInZip)) {
            strHandleFileNameInZip = file2.getName();
        }
        while (true) {
            file2 = file2.getParentFile();
            if (file2 == null || file2.equals(file)) {
                break;
            }
            String name = file2.getName();
            if (TextUtils.isEmpty(name)) {
                break;
            }
            strHandleFileNameInZip = name + IOUtils.DIR_SEPARATOR_UNIX + strHandleFileNameInZip;
        }
        return strHandleFileNameInZip;
    }

    public static byte[] unCompressGzip(InputStream inputStream) {
        GZIPInputStream gZIPInputStream = null;
        if (inputStream == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                GZIPInputStream gZIPInputStream2 = new GZIPInputStream(inputStream);
                try {
                    byte[] bArr = new byte[256];
                    while (true) {
                        int i10 = gZIPInputStream2.read(bArr);
                        if (i10 >= 0) {
                            byteArrayOutputStream.write(bArr, 0, i10);
                        } else {
                            try {
                                break;
                            } catch (Throwable unused) {
                            }
                        }
                    }
                    byteArrayOutputStream.close();
                    gZIPInputStream2.close();
                } catch (Throwable unused2) {
                    gZIPInputStream = gZIPInputStream2;
                    try {
                        byteArrayOutputStream.close();
                    } catch (Throwable unused3) {
                    }
                    if (gZIPInputStream != null) {
                        gZIPInputStream.close();
                    }
                    return byteArrayOutputStream.toByteArray();
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static void zipFile(List<File> list, String str, File file, ZipFileHandler zipFileHandler) throws Exception {
        ZipOutputStream zipOutputStream;
        if (list == null || list.isEmpty()) {
            throw new Exception("willZipList is empty");
        }
        if (str == null || str.length() == 0) {
            throw new Exception("zipFilePath is none");
        }
        File file2 = new File(str);
        if (file2.isDirectory()) {
            throw new Exception("zipFilePath is directory: " + str);
        }
        try {
            File parentFile = file2.getParentFile();
            if (parentFile != null && !parentFile.exists()) {
                parentFile.mkdirs();
            }
        } catch (Throwable unused) {
        }
        BufferedInputStream bufferedInputStream = null;
        try {
            zipOutputStream = new ZipOutputStream(new FileOutputStream(str));
            try {
                byte[] bArr = new byte[8192];
                for (int i10 = 0; i10 < list.size(); i10++) {
                    File file3 = list.get(i10);
                    if (file3 != null && file3.exists() && file3.isFile() && file3.length() != 0) {
                        ZipEntry zipEntry = new ZipEntry(getAbsFileName(file, file3, zipFileHandler));
                        zipEntry.setSize(file3.length());
                        zipEntry.setTime(file3.lastModified());
                        zipOutputStream.putNextEntry(zipEntry);
                        BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file3));
                        while (true) {
                            try {
                                int i11 = bufferedInputStream2.read(bArr);
                                if (i11 != -1) {
                                    zipOutputStream.write(bArr, 0, i11);
                                } else {
                                    try {
                                        break;
                                    } catch (Throwable unused2) {
                                    }
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                bufferedInputStream = bufferedInputStream2;
                                try {
                                    throw new Exception(th);
                                } catch (Throwable th3) {
                                    if (bufferedInputStream != null) {
                                        try {
                                            bufferedInputStream.close();
                                        } catch (Throwable unused3) {
                                        }
                                    }
                                    if (zipOutputStream == null) {
                                        throw th3;
                                    }
                                    try {
                                        zipOutputStream.close();
                                        throw th3;
                                    } catch (Throwable unused4) {
                                        throw th3;
                                    }
                                }
                            }
                        }
                        bufferedInputStream2.close();
                        try {
                            zipOutputStream.flush();
                        } catch (Throwable unused5) {
                        }
                        try {
                            zipOutputStream.closeEntry();
                        } catch (Throwable unused6) {
                        }
                        bufferedInputStream = bufferedInputStream2;
                    }
                }
                if (bufferedInputStream != null) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable unused7) {
                    }
                }
                try {
                    zipOutputStream.close();
                } catch (Throwable unused8) {
                }
            } catch (Throwable th4) {
                th = th4;
            }
        } catch (Throwable th5) {
            th = th5;
            zipOutputStream = null;
        }
    }
}
