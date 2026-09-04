package com.max.xiaoheihe.module.voice.audio;

import com.max.hbuikit.bean.param.UiKitSpanObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: AudioBuffer.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.voice.audio.AudioBuffer", f = "AudioBuffer.kt", i = {0, 0}, l = {138}, m = UiKitSpanObj.TYPE_SIZE, n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
public final class AudioBuffer$size$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f93998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f93999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f94000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ AudioBuffer f94001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f94002f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioBuffer$size$1(AudioBuffer audioBuffer, c<? super AudioBuffer$size$1> cVar) {
        super(cVar);
        this.f94001e = audioBuffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46707, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f94000d = obj;
        this.f94002f |= Integer.MIN_VALUE;
        return this.f94001e.p(this);
    }
}
