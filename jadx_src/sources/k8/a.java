package k8;

import android.net.Uri;
import androidx.annotation.i1;
import java.io.File;

/* JADX INFO: compiled from: ImageLoader.java */
/* JADX INFO: loaded from: classes6.dex */
public interface a {

    /* JADX INFO: renamed from: k8.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: ImageLoader.java */
    @i1
    public interface InterfaceC1122a {
        void onCacheHit(int i10, File file);

        void onCacheMiss(int i10, File file);

        void onFail(Exception exc);

        void onFinish();

        void onProgress(int i10);

        void onStart();

        void onSuccess(File file);
    }

    void a(int i10, Uri uri, InterfaceC1122a interfaceC1122a);

    void b(int i10);

    void c(Uri uri);

    void cancelAll();
}
