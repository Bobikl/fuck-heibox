package io.flutter.embedding.engine.plugins.contentprovider;

import androidx.annotation.n0;

/* JADX INFO: loaded from: classes4.dex */
public interface ContentProviderAware {
    void onAttachedToContentProvider(@n0 ContentProviderPluginBinding contentProviderPluginBinding);

    void onDetachedFromContentProvider();
}
