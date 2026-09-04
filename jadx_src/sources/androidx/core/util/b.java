package androidx.core.util;

import android.util.Log;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: compiled from: AtomicFile.java */
/* JADX INFO: loaded from: classes.dex */
public class b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f21231d = "AtomicFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f21232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f21233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final File f21234c;

    public b(@n0 File file) {
        this.f21232a = file;
        this.f21233b = new File(file.getPath() + ".new");
        this.f21234c = new File(file.getPath() + ".bak");
    }

    private static void g(@n0 File file, @n0 File file2) {
        if (file2.isDirectory() && !file2.delete()) {
            Log.e(f21231d, "Failed to delete file which is a directory " + file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        Log.e(f21231d, "Failed to rename " + file + " to " + file2);
    }

    private static boolean i(@n0 FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
            return true;
        } catch (IOException unused) {
            return false;
        }
    }

    public void a() {
        this.f21232a.delete();
        this.f21233b.delete();
        this.f21234c.delete();
    }

    public void b(@p0 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e(f21231d, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e(f21231d, "Failed to close file output stream", e10);
        }
        if (this.f21233b.delete()) {
            return;
        }
        Log.e(f21231d, "Failed to delete new file " + this.f21233b);
    }

    public void c(@p0 FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        if (!i(fileOutputStream)) {
            Log.e(f21231d, "Failed to sync file output stream");
        }
        try {
            fileOutputStream.close();
        } catch (IOException e10) {
            Log.e(f21231d, "Failed to close file output stream", e10);
        }
        g(this.f21233b, this.f21232a);
    }

    @n0
    public File d() {
        return this.f21232a;
    }

    @n0
    public FileInputStream e() throws FileNotFoundException {
        if (this.f21234c.exists()) {
            g(this.f21234c, this.f21232a);
        }
        if (this.f21233b.exists() && this.f21232a.exists() && !this.f21233b.delete()) {
            Log.e(f21231d, "Failed to delete outdated new file " + this.f21233b);
        }
        return new FileInputStream(this.f21232a);
    }

    @n0
    public byte[] f() throws IOException {
        FileInputStream fileInputStreamE = e();
        try {
            byte[] bArr = new byte[fileInputStreamE.available()];
            int i10 = 0;
            while (true) {
                int i11 = fileInputStreamE.read(bArr, i10, bArr.length - i10);
                if (i11 <= 0) {
                    fileInputStreamE.close();
                    return bArr;
                }
                i10 += i11;
                int iAvailable = fileInputStreamE.available();
                if (iAvailable > bArr.length - i10) {
                    byte[] bArr2 = new byte[iAvailable + i10];
                    System.arraycopy(bArr, 0, bArr2, 0, i10);
                    bArr = bArr2;
                }
            }
        } catch (Throwable th2) {
            fileInputStreamE.close();
            throw th2;
        }
    }

    @n0
    public FileOutputStream h() throws IOException {
        if (this.f21234c.exists()) {
            g(this.f21234c, this.f21232a);
        }
        try {
            return new FileOutputStream(this.f21233b);
        } catch (FileNotFoundException unused) {
            if (!this.f21233b.getParentFile().mkdirs()) {
                throw new IOException("Failed to create directory for " + this.f21233b);
            }
            try {
                return new FileOutputStream(this.f21233b);
            } catch (FileNotFoundException e10) {
                throw new IOException("Failed to create new file " + this.f21233b, e10);
            }
        }
    }
}
