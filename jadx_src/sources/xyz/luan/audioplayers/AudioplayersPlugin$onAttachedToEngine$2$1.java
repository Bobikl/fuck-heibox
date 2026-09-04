package xyz.luan.audioplayers;

import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import kotlin.Metadata;
import kotlin.b2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.f0;
import yh.p;

/* JADX INFO: compiled from: AudioplayersPlugin.kt */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public final /* synthetic */ class AudioplayersPlugin$onAttachedToEngine$2$1 extends FunctionReferenceImpl implements p<MethodCall, MethodChannel.Result, b2> {
    AudioplayersPlugin$onAttachedToEngine$2$1(Object obj) {
        super(2, obj, AudioplayersPlugin.class, "globalMethodHandler", "globalMethodHandler(Lio/flutter/plugin/common/MethodCall;Lio/flutter/plugin/common/MethodChannel$Result;)V", 0);
    }

    public final void i(@dl.d MethodCall p10, @dl.d MethodChannel.Result p11) {
        f0.p(p10, "p0");
        f0.p(p11, "p1");
        ((AudioplayersPlugin) this.receiver).h(p10, p11);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ b2 invoke(MethodCall methodCall, MethodChannel.Result result) {
        i(methodCall, result);
        return b2.f124493a;
    }
}
