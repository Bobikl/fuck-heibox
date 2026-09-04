package com.umeng.socialize.net.dplus.cache1;

import android.util.Log;
import com.umeng.socialize.utils.SLog;
import com.umeng.socialize.utils.UmengText;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public class AtomicFile {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f106302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f106303b;

    public AtomicFile(File file) {
        this.f106302a = file;
        this.f106303b = new File(file.getPath() + ".bak");
    }

    private static void a(File file, File file2) throws Throwable {
        FileOutputStream fileOutputStream;
        long jCurrentTimeMillis = System.currentTimeMillis();
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(file);
            try {
                fileOutputStream = new FileOutputStream(file2);
                try {
                    byte[] bArr = new byte[8192];
                    while (true) {
                        int i10 = fileInputStream2.read(bArr);
                        if (i10 <= 0) {
                            fileInputStream2.close();
                            fileOutputStream.close();
                            Log.d("AtomicFile", "comsum time:" + (System.currentTimeMillis() - jCurrentTimeMillis));
                            return;
                        }
                        fileOutputStream.write(bArr, 0, i10);
                        Log.d("AtomicFile", i10 + "");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    fileInputStream = fileInputStream2;
                    if (fileInputStream != null) {
                        fileInputStream.close();
                    }
                    if (fileOutputStream != null) {
                        fileOutputStream.close();
                    }
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
                fileOutputStream = null;
            }
        } catch (Throwable th4) {
            th = th4;
            fileOutputStream = null;
        }
    }

    static boolean a(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return true;
        }
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException e10) {
            SLog.error(UmengText.CACHE.CACHEFILE, e10);
            return false;
        }
    }

    public void delete() {
        this.f106302a.delete();
        this.f106303b.delete();
    }

    public void failWrite(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            a(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f106302a.delete();
                this.f106303b.renameTo(this.f106302a);
            } catch (IOException e10) {
                SLog.error(UmengText.CACHE.CACHEFILE, e10);
            }
        }
    }

    public void finishWrite(FileOutputStream fileOutputStream) {
        if (fileOutputStream != null) {
            a(fileOutputStream);
            try {
                fileOutputStream.close();
                this.f106303b.delete();
            } catch (IOException e10) {
                SLog.error(UmengText.CACHE.CACHEFILE, e10);
            }
        }
    }

    public File getBaseFile() {
        return this.f106302a;
    }

    public FileInputStream openRead() throws FileNotFoundException {
        if (this.f106303b.exists()) {
            this.f106302a.delete();
            this.f106303b.renameTo(this.f106302a);
        }
        return new FileInputStream(this.f106302a);
    }

    public byte[] readFully() throws IOException {
        FileInputStream fileInputStreamOpenRead = openRead();
        try {
            byte[] bArr = new byte[fileInputStreamOpenRead.available()];
            int i10 = 0;
            while (true) {
                int i11 = fileInputStreamOpenRead.read(bArr, i10, bArr.length - i10);
                if (i11 <= 0) {
                    fileInputStreamOpenRead.close();
                    return bArr;
                }
                i10 += i11;
                int iAvailable = fileInputStreamOpenRead.available();
                if (iAvailable > bArr.length - i10) {
                    byte[] bArr2 = new byte[iAvailable + i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    bArr = bArr2;
                }
            }
        } catch (Throwable th2) {
            fileInputStreamOpenRead.close();
            throw th2;
        }
    }

    public FileOutputStream startWrite(boolean z10) throws Throwable {
        if (this.f106302a.exists()) {
            if (this.f106303b.exists()) {
                this.f106302a.delete();
            } else if (this.f106302a.renameTo(this.f106303b)) {
                a(this.f106303b, this.f106302a);
            } else {
                Log.w("AtomicFile", "Couldn't rename file " + this.f106302a + " to backup file " + this.f106303b);
            }
        }
        try {
            return new FileOutputStream(this.f106302a, z10);
        } catch (FileNotFoundException e10) {
            if (!this.f106302a.getParentFile().mkdirs()) {
                SLog.error(UmengText.CACHE.CACHEFILE, e10);
            }
            try {
                return new FileOutputStream(this.f106302a, z10);
            } catch (FileNotFoundException unused) {
                SLog.error(UmengText.CACHE.CACHEFILE, e10);
                return null;
            }
        }
    }
}
