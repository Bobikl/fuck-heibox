package io.flutter.embedding.engine.renderer;

import androidx.annotation.n0;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
public interface RenderSurface {
    void attachToRenderer(@n0 FlutterRenderer flutterRenderer);

    void detachFromRenderer();

    @p0
    FlutterRenderer getAttachedRenderer();

    void pause();

    void resume();
}
