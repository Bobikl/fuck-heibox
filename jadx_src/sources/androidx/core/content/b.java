package androidx.core.content;

import android.content.ContentResolver;
import android.database.Cursor;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.OperationCanceledException;

/* JADX INFO: compiled from: ContentResolverCompat.java */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: compiled from: ContentResolverCompat.java */
    @androidx.annotation.w0(16)
    public static class a {
        private a() {
        }

        @androidx.annotation.u
        static Cursor a(ContentResolver contentResolver, Uri uri, String[] strArr, String str, String[] strArr2, String str2, CancellationSignal cancellationSignal) {
            return contentResolver.query(uri, strArr, str, strArr2, str2, cancellationSignal);
        }
    }

    private b() {
    }

    @androidx.annotation.p0
    public static Cursor a(@androidx.annotation.n0 ContentResolver contentResolver, @androidx.annotation.n0 Uri uri, @androidx.annotation.p0 String[] strArr, @androidx.annotation.p0 String str, @androidx.annotation.p0 String[] strArr2, @androidx.annotation.p0 String str2, @androidx.annotation.p0 androidx.core.os.f fVar) throws Exception {
        Object objB;
        if (fVar != null) {
            try {
                objB = fVar.b();
            } catch (Exception e10) {
                if (e10 instanceof OperationCanceledException) {
                    throw new androidx.core.os.OperationCanceledException();
                }
                throw e10;
            }
        } else {
            objB = null;
        }
        return a.a(contentResolver, uri, strArr, str, strArr2, str2, (CancellationSignal) objB);
    }
}
