package com.tencent.qmsp.sdk.f;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

/* JADX INFO: loaded from: classes4.dex */
public class j {
    public static int a(String str, File file) {
        ZipInputStream zipInputStream;
        byte[] bArr = new byte[1024];
        int i10 = -1;
        try {
            try {
                zipInputStream = new ZipInputStream(new FileInputStream(str));
                loop0: while (true) {
                    try {
                        ZipEntry nextEntry = zipInputStream.getNextEntry();
                        while (true) {
                            if (nextEntry != null) {
                                String name = nextEntry.getName();
                                if (name != null && !name.contains("../")) {
                                    break;
                                }
                            } else {
                                zipInputStream.closeEntry();
                                zipInputStream.close();
                                zipInputStream.close();
                                i10 = 0;
                                break loop0;
                            }
                        }
                        File fileA = a(file, nextEntry);
                        if (!nextEntry.isDirectory()) {
                            File parentFile = fileA.getParentFile();
                            if (!parentFile.isDirectory() && !parentFile.mkdirs()) {
                                throw new IOException("Failed to create directory " + parentFile);
                            }
                            FileOutputStream fileOutputStream = new FileOutputStream(fileA);
                            while (true) {
                                int i11 = zipInputStream.read(bArr);
                                if (i11 <= 0) {
                                    break;
                                }
                                fileOutputStream.write(bArr, 0, i11);
                            }
                            fileOutputStream.close();
                        } else if (!fileA.isDirectory() && !fileA.mkdirs()) {
                            throw new IOException("Failed to create directory " + fileA);
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        try {
                            th.printStackTrace();
                            if (zipInputStream != null) {
                                zipInputStream.close();
                            }
                            return i10;
                        } catch (Throwable th3) {
                            if (zipInputStream != null) {
                                try {
                                    zipInputStream.close();
                                } catch (IOException e10) {
                                    e10.printStackTrace();
                                }
                            }
                            throw th3;
                        }
                    }
                }
            } catch (IOException e11) {
                e11.printStackTrace();
            }
        } catch (Throwable th4) {
            th = th4;
            zipInputStream = null;
        }
        return i10;
    }

    public static File a(File file, ZipEntry zipEntry) {
        File file2;
        try {
            file2 = new File(file, zipEntry.getName());
            try {
                String canonicalPath = file.getCanonicalPath();
                if (!file2.getCanonicalPath().startsWith(canonicalPath + File.separator)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("Entry is outside of the target dir: ");
                    sb2.append(zipEntry.getName());
                    throw new IOException(sb2.toString());
                }
            } catch (Throwable th2) {
                th = th2;
                th.printStackTrace();
            }
        } catch (Throwable th3) {
            th = th3;
            file2 = null;
        }
        return file2;
    }
}
