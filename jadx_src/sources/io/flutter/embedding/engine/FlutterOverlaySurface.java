package io.flutter.embedding.engine;

import android.view.Surface;
import androidx.annotation.Keep;
import androidx.annotation.n0;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class FlutterOverlaySurface {

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private final int f119419id;

    @n0
    private final Surface surface;

    public FlutterOverlaySurface(int i10, @n0 Surface surface) {
        this.f119419id = i10;
        this.surface = surface;
    }

    public int getId() {
        return this.f119419id;
    }

    public Surface getSurface() {
        return this.surface;
    }
}
