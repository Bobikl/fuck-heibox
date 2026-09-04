package cn.fly.verify;

import android.os.Build;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.attribute.BasicFileAttributes;

/* JADX INFO: loaded from: classes6.dex */
public class gc {
    public static long a(String str) {
        if (Build.VERSION.SDK_INT < 26) {
            return -1L;
        }
        try {
            File file = new File(str);
            if (file.exists()) {
                return Files.readAttributes(FileSystems.getDefault().getPath(file.getAbsolutePath(), new String[0]), BasicFileAttributes.class, new LinkOption[0]).lastAccessTime().toMillis();
            }
            return -1L;
        } catch (Throwable th2) {
            es.a().a(th2);
            return -1L;
        }
    }

    public static boolean a(File file) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile()) {
                    if (!file2.delete()) {
                        return false;
                    }
                } else if (file2.isDirectory() && !a(file2)) {
                    return false;
                }
            }
        }
        return file.delete();
    }

    public static boolean a(File file, File file2) {
        BufferedOutputStream bufferedOutputStream;
        BufferedInputStream bufferedInputStream = null;
        try {
            BufferedInputStream bufferedInputStream2 = new BufferedInputStream(new FileInputStream(file));
            try {
                bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file2));
                try {
                    byte[] bArr = new byte[1024];
                    while (true) {
                        int i10 = bufferedInputStream2.read(bArr);
                        if (i10 <= 0) {
                            el.a(bufferedInputStream2, bufferedOutputStream);
                            return true;
                        }
                        bufferedOutputStream.write(bArr, 0, i10);
                    }
                } catch (Throwable th2) {
                    th = th2;
                    bufferedInputStream = bufferedInputStream2;
                    try {
                        es.a().a(th);
                        el.a(bufferedInputStream, bufferedOutputStream);
                        return false;
                    } catch (Throwable th3) {
                        el.a(bufferedInputStream, bufferedOutputStream);
                        throw th3;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                bufferedOutputStream = null;
            }
        } catch (Throwable th5) {
            th = th5;
            bufferedOutputStream = null;
        }
    }

    public static boolean a(File file, FileFilter fileFilter) {
        if (file == null) {
            return false;
        }
        if (!file.exists()) {
            return true;
        }
        if (!file.isDirectory()) {
            return false;
        }
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null && fileArrListFiles.length != 0) {
            for (File file2 : fileArrListFiles) {
                if (fileFilter.accept(file2)) {
                    if (file2.isFile()) {
                        if (!file2.delete()) {
                            return false;
                        }
                    } else if (file2.isDirectory() && !a(file2)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
