package com.ss.bytertc.engine.flutter.render;

import android.content.Context;
import androidx.annotation.RestrictTo;
import androidx.annotation.n0;
import androidx.annotation.p0;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.StandardMessageCodec;
import io.flutter.plugin.platform.PlatformView;
import io.flutter.plugin.platform.PlatformViewFactory;

/* JADX INFO: loaded from: classes4.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY})
public class RTCSurfaceViewFactory extends PlatformViewFactory {
    private final BinaryMessenger messenger;

    public RTCSurfaceViewFactory(BinaryMessenger binaryMessenger) {
        super(StandardMessageCodec.INSTANCE);
        this.messenger = binaryMessenger;
    }

    @Override // io.flutter.plugin.platform.PlatformViewFactory
    @n0
    public PlatformView create(@p0 Context context, int i10, @p0 Object obj) {
        return new RTCSurfaceView(this.messenger, context, i10, obj);
    }
}
