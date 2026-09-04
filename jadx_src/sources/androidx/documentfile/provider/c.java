package androidx.documentfile.provider;

import android.net.Uri;
import android.util.Log;
import android.webkit.MimeTypeMap;
import androidx.annotation.p0;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: compiled from: RawDocumentFile.java */
/* JADX INFO: loaded from: classes6.dex */
public class c extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private File f22783c;

    c(@p0 a aVar, File file) {
        super(aVar);
        this.f22783c = file;
    }

    private static boolean w(File file) {
        File[] fileArrListFiles = file.listFiles();
        boolean zW = true;
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isDirectory()) {
                    zW &= w(file2);
                }
                if (!file2.delete()) {
                    Log.w("DocumentFile", "Failed to delete " + file2);
                    zW = false;
                }
            }
        }
        return zW;
    }

    private static String x(String str) {
        int iLastIndexOf = str.lastIndexOf(46);
        if (iLastIndexOf < 0) {
            return COSRequestHeaderKey.APPLICATION_OCTET_STREAM;
        }
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(str.substring(iLastIndexOf + 1).toLowerCase());
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : COSRequestHeaderKey.APPLICATION_OCTET_STREAM;
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return this.f22783c.canRead();
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return this.f22783c.canWrite();
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public a c(String str) {
        File file = new File(this.f22783c, str);
        if (file.isDirectory() || file.mkdir()) {
            return new c(this, file);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public a d(String str, String str2) {
        String extensionFromMimeType = MimeTypeMap.getSingleton().getExtensionFromMimeType(str);
        if (extensionFromMimeType != null) {
            str2 = str2 + "." + extensionFromMimeType;
        }
        File file = new File(this.f22783c, str2);
        try {
            file.createNewFile();
            return new c(this, file);
        } catch (IOException e10) {
            Log.w("DocumentFile", "Failed to createFile: " + e10);
            return null;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        w(this.f22783c);
        return this.f22783c.delete();
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return this.f22783c.exists();
    }

    @Override // androidx.documentfile.provider.a
    public String k() {
        return this.f22783c.getName();
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public String m() {
        if (this.f22783c.isDirectory()) {
            return null;
        }
        return x(this.f22783c.getName());
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return Uri.fromFile(this.f22783c);
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return this.f22783c.isDirectory();
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return this.f22783c.isFile();
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return false;
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return this.f22783c.lastModified();
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return this.f22783c.length();
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = this.f22783c.listFiles();
        if (fileArrListFiles != null) {
            for (File file : fileArrListFiles) {
                arrayList.add(new c(this, file));
            }
        }
        return (a[]) arrayList.toArray(new a[arrayList.size()]);
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        File file = new File(this.f22783c.getParentFile(), str);
        if (!this.f22783c.renameTo(file)) {
            return false;
        }
        this.f22783c = file;
        return true;
    }
}
