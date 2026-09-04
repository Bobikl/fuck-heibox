package g8;

import android.net.Uri;

/* JADX INFO: compiled from: BigImageViewer.java */
/* JADX INFO: loaded from: classes6.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static volatile a f118988b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k8.a f118989a;

    private a(k8.a aVar) {
        this.f118989a = aVar;
    }

    public static k8.a a() {
        if (f118988b != null) {
            return f118988b.f118989a;
        }
        throw new IllegalStateException("You must initialize BigImageViewer before use it!");
    }

    public static void b(k8.a aVar) {
        f118988b = new a(aVar);
    }

    public static void c(Uri... uriArr) {
        if (uriArr == null) {
            return;
        }
        k8.a aVarA = a();
        for (Uri uri : uriArr) {
            aVarA.c(uri);
        }
    }
}
