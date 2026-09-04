package io.flutter.embedding.engine.plugins.contentprovider;

import android.content.ContentProvider;
import androidx.annotation.n0;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes4.dex */
public interface ContentProviderControlSurface {
    void attachToContentProvider(@n0 ContentProvider contentProvider, @n0 Lifecycle lifecycle);

    void detachFromContentProvider();
}
