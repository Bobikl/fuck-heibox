package io.flutter.plugin.platform;

import android.content.Context;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.plugin.common.MessageCodec;

/* JADX INFO: loaded from: classes4.dex */
public abstract class PlatformViewFactory {
    private final MessageCodec<Object> createArgsCodec;

    public PlatformViewFactory(@p0 MessageCodec<Object> messageCodec) {
        this.createArgsCodec = messageCodec;
    }

    @n0
    public abstract PlatformView create(Context context, int i10, @p0 Object obj);

    @p0
    public final MessageCodec<Object> getCreateArgsCodec() {
        return this.createArgsCodec;
    }
}
