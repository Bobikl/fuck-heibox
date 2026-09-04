package io.flutter.embedding.engine.plugins.lifecycle;

import androidx.annotation.Keep;
import androidx.annotation.n0;
import androidx.lifecycle.Lifecycle;

/* JADX INFO: loaded from: classes4.dex */
@Keep
public class HiddenLifecycleReference {

    @n0
    private final Lifecycle lifecycle;

    public HiddenLifecycleReference(@n0 Lifecycle lifecycle) {
        this.lifecycle = lifecycle;
    }

    @n0
    public Lifecycle getLifecycle() {
        return this.lifecycle;
    }
}
