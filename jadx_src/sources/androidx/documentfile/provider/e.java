package androidx.documentfile.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.provider.DocumentsContract;
import android.util.Log;
import androidx.annotation.p0;
import androidx.annotation.w0;
import java.util.ArrayList;

/* JADX INFO: compiled from: TreeDocumentFile.java */
/* JADX INFO: loaded from: classes6.dex */
@w0(21)
public class e extends a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f22786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Uri f22787d;

    e(@p0 a aVar, Context context, Uri uri) {
        super(aVar);
        this.f22786c = context;
        this.f22787d = uri;
    }

    private static void w(@p0 AutoCloseable autoCloseable) {
        if (autoCloseable != null) {
            try {
                autoCloseable.close();
            } catch (RuntimeException e10) {
                throw e10;
            } catch (Exception unused) {
            }
        }
    }

    @p0
    private static Uri x(Context context, Uri uri, String str, String str2) {
        try {
            return DocumentsContract.createDocument(context.getContentResolver(), uri, str, str2);
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean a() {
        return b.a(this.f22786c, this.f22787d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean b() {
        return b.b(this.f22786c, this.f22787d);
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public a c(String str) {
        Uri uriX = x(this.f22786c, this.f22787d, "vnd.android.document/directory", str);
        if (uriX != null) {
            return new e(this, this.f22786c, uriX);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public a d(String str, String str2) {
        Uri uriX = x(this.f22786c, this.f22787d, str, str2);
        if (uriX != null) {
            return new e(this, this.f22786c, uriX);
        }
        return null;
    }

    @Override // androidx.documentfile.provider.a
    public boolean e() {
        try {
            return DocumentsContract.deleteDocument(this.f22786c.getContentResolver(), this.f22787d);
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean f() {
        return b.d(this.f22786c, this.f22787d);
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public String k() {
        return b.f(this.f22786c, this.f22787d);
    }

    @Override // androidx.documentfile.provider.a
    @p0
    public String m() {
        return b.h(this.f22786c, this.f22787d);
    }

    @Override // androidx.documentfile.provider.a
    public Uri n() {
        return this.f22787d;
    }

    @Override // androidx.documentfile.provider.a
    public boolean o() {
        return b.i(this.f22786c, this.f22787d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean q() {
        return b.j(this.f22786c, this.f22787d);
    }

    @Override // androidx.documentfile.provider.a
    public boolean r() {
        return b.k(this.f22786c, this.f22787d);
    }

    @Override // androidx.documentfile.provider.a
    public long s() {
        return b.l(this.f22786c, this.f22787d);
    }

    @Override // androidx.documentfile.provider.a
    public long t() {
        return b.m(this.f22786c, this.f22787d);
    }

    @Override // androidx.documentfile.provider.a
    public a[] u() {
        ContentResolver contentResolver = this.f22786c.getContentResolver();
        Uri uri = this.f22787d;
        Uri uriBuildChildDocumentsUriUsingTree = DocumentsContract.buildChildDocumentsUriUsingTree(uri, DocumentsContract.getDocumentId(uri));
        ArrayList arrayList = new ArrayList();
        Cursor cursorQuery = null;
        try {
            try {
                cursorQuery = contentResolver.query(uriBuildChildDocumentsUriUsingTree, new String[]{"document_id"}, null, null, null);
                while (cursorQuery.moveToNext()) {
                    arrayList.add(DocumentsContract.buildDocumentUriUsingTree(this.f22787d, cursorQuery.getString(0)));
                }
            } catch (Exception e10) {
                Log.w("DocumentFile", "Failed query: " + e10);
            }
            w(cursorQuery);
            Uri[] uriArr = (Uri[]) arrayList.toArray(new Uri[arrayList.size()]);
            a[] aVarArr = new a[uriArr.length];
            for (int i10 = 0; i10 < uriArr.length; i10++) {
                aVarArr[i10] = new e(this, this.f22786c, uriArr[i10]);
            }
            return aVarArr;
        } catch (Throwable th2) {
            w(cursorQuery);
            throw th2;
        }
    }

    @Override // androidx.documentfile.provider.a
    public boolean v(String str) {
        try {
            Uri uriRenameDocument = DocumentsContract.renameDocument(this.f22786c.getContentResolver(), this.f22787d, str);
            if (uriRenameDocument != null) {
                this.f22787d = uriRenameDocument;
                return true;
            }
        } catch (Exception unused) {
        }
        return false;
    }
}
