package a9;

import android.os.Handler;
import android.os.Looper;
import androidx.annotation.n0;
import com.google.android.gms.internal.common.p;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.1.0 */
/* JADX INFO: loaded from: classes7.dex */
@v8.a
public class a implements Executor {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f1184b;

    @v8.a
    public a(@n0 Looper looper) {
        this.f1184b = new p(looper);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(@n0 Runnable runnable) {
        this.f1184b.post(runnable);
    }
}
