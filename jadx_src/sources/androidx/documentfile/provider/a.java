package androidx.documentfile.provider;

import android.content.Context;
import android.net.Uri;
import android.provider.DocumentsContract;
import androidx.annotation.n0;
import androidx.annotation.p0;
import java.io.File;

/* JADX INFO: compiled from: DocumentFile.java */
/* JADX INFO: loaded from: classes6.dex */
public abstract class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final String f22779b = "DocumentFile";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @p0
    private final a f22780a;

    a(@p0 a aVar) {
        this.f22780a = aVar;
    }

    @n0
    public static a h(@n0 File file) {
        return new c(null, file);
    }

    @p0
    public static a i(@n0 Context context, @n0 Uri uri) {
        return new d(null, context, uri);
    }

    @p0
    public static a j(@n0 Context context, @n0 Uri uri) {
        return new e(null, context, DocumentsContract.buildDocumentUriUsingTree(uri, DocumentsContract.getTreeDocumentId(uri)));
    }

    public static boolean p(@n0 Context context, @p0 Uri uri) {
        return DocumentsContract.isDocumentUri(context, uri);
    }

    public abstract boolean a();

    public abstract boolean b();

    @p0
    public abstract a c(@n0 String str);

    @p0
    public abstract a d(@n0 String str, @n0 String str2);

    public abstract boolean e();

    public abstract boolean f();

    @p0
    public a g(@n0 String str) {
        for (a aVar : u()) {
            if (str.equals(aVar.k())) {
                return aVar;
            }
        }
        return null;
    }

    @p0
    public abstract String k();

    @p0
    public a l() {
        return this.f22780a;
    }

    @p0
    public abstract String m();

    @n0
    public abstract Uri n();

    public abstract boolean o();

    public abstract boolean q();

    public abstract boolean r();

    public abstract long s();

    public abstract long t();

    @n0
    public abstract a[] u();

    public abstract boolean v(@n0 String str);
}
