package androidx.core.provider;

import android.content.ContentResolver;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.provider.DocumentsContract;
import androidx.annotation.n0;
import androidx.annotation.p0;
import androidx.annotation.u;
import androidx.annotation.w0;
import java.io.FileNotFoundException;
import java.util.List;

/* JADX INFO: compiled from: DocumentsContractCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f21004a = "tree";

    /* JADX INFO: compiled from: DocumentsContractCompat.java */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final int f21005a = 512;

        private a() {
        }
    }

    /* JADX INFO: compiled from: DocumentsContractCompat.java */
    @w0(19)
    public static class b {
        private b() {
        }

        @u
        public static Uri a(String str, String str2) {
            return DocumentsContract.buildDocumentUri(str, str2);
        }

        @u
        static boolean b(ContentResolver contentResolver, Uri uri) throws FileNotFoundException {
            return DocumentsContract.deleteDocument(contentResolver, uri);
        }

        @u
        static String c(Uri uri) {
            return DocumentsContract.getDocumentId(uri);
        }

        @u
        static boolean d(Context context, @p0 Uri uri) {
            return DocumentsContract.isDocumentUri(context, uri);
        }
    }

    /* JADX INFO: renamed from: androidx.core.provider.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: DocumentsContractCompat.java */
    @w0(21)
    public static class C0137c {
        private C0137c() {
        }

        @u
        static Uri a(String str, String str2) {
            return DocumentsContract.buildChildDocumentsUri(str, str2);
        }

        @u
        static Uri b(Uri uri, String str) {
            return DocumentsContract.buildChildDocumentsUriUsingTree(uri, str);
        }

        @u
        static Uri c(Uri uri, String str) {
            return DocumentsContract.buildDocumentUriUsingTree(uri, str);
        }

        @u
        public static Uri d(String str, String str2) {
            return DocumentsContract.buildTreeDocumentUri(str, str2);
        }

        @u
        static Uri e(ContentResolver contentResolver, Uri uri, String str, String str2) throws FileNotFoundException {
            return DocumentsContract.createDocument(contentResolver, uri, str, str2);
        }

        @u
        static String f(Uri uri) {
            return DocumentsContract.getTreeDocumentId(uri);
        }

        @u
        static Uri g(@n0 ContentResolver contentResolver, @n0 Uri uri, @n0 String str) throws FileNotFoundException {
            return DocumentsContract.renameDocument(contentResolver, uri, str);
        }
    }

    /* JADX INFO: compiled from: DocumentsContractCompat.java */
    @w0(24)
    public static class d {
        private d() {
        }

        @u
        static boolean a(@n0 Uri uri) {
            return DocumentsContract.isTreeUri(uri);
        }

        @u
        static boolean b(ContentResolver contentResolver, Uri uri, Uri uri2) throws FileNotFoundException {
            return DocumentsContract.removeDocument(contentResolver, uri, uri2);
        }
    }

    private c() {
    }

    @p0
    public static Uri a(@n0 String str, @p0 String str2) {
        return C0137c.a(str, str2);
    }

    @p0
    public static Uri b(@n0 Uri uri, @n0 String str) {
        return C0137c.b(uri, str);
    }

    @p0
    public static Uri c(@n0 String str, @n0 String str2) {
        return b.a(str, str2);
    }

    @p0
    public static Uri d(@n0 Uri uri, @n0 String str) {
        return C0137c.c(uri, str);
    }

    @p0
    public static Uri e(@n0 String str, @n0 String str2) {
        return C0137c.d(str, str2);
    }

    @p0
    public static Uri f(@n0 ContentResolver contentResolver, @n0 Uri uri, @n0 String str, @n0 String str2) throws FileNotFoundException {
        return C0137c.e(contentResolver, uri, str, str2);
    }

    @p0
    public static String g(@n0 Uri uri) {
        return b.c(uri);
    }

    @p0
    public static String h(@n0 Uri uri) {
        return C0137c.f(uri);
    }

    public static boolean i(@n0 Context context, @p0 Uri uri) {
        return b.d(context, uri);
    }

    public static boolean j(@n0 Uri uri) {
        if (Build.VERSION.SDK_INT >= 24) {
            return d.a(uri);
        }
        List<String> pathSegments = uri.getPathSegments();
        return pathSegments.size() >= 2 && f21004a.equals(pathSegments.get(0));
    }

    public static boolean k(@n0 ContentResolver contentResolver, @n0 Uri uri, @n0 Uri uri2) throws FileNotFoundException {
        return Build.VERSION.SDK_INT >= 24 ? d.b(contentResolver, uri, uri2) : b.b(contentResolver, uri);
    }

    @p0
    public static Uri l(@n0 ContentResolver contentResolver, @n0 Uri uri, @n0 String str) throws FileNotFoundException {
        return C0137c.g(contentResolver, uri, str);
    }
}
