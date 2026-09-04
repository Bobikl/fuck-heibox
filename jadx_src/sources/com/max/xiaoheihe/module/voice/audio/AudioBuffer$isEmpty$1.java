package com.max.xiaoheihe.module.voice.audio;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.e;
import kotlin.coroutines.c;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.d;

/* JADX INFO: compiled from: AudioBuffer.kt */
/* JADX INFO: loaded from: classes12.dex */
@d(c = "com.max.xiaoheihe.module.voice.audio.AudioBuffer", f = "AudioBuffer.kt", i = {0, 0}, l = {138}, m = "isEmpty", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
public final class AudioBuffer$isEmpty$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f93978b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f93979c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f93980d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ AudioBuffer f93981e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f93982f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AudioBuffer$isEmpty$1(AudioBuffer audioBuffer, c<? super AudioBuffer$isEmpty$1> cVar) {
        super(cVar);
        this.f93981e = audioBuffer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46703, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f93980d = obj;
        this.f93982f |= Integer.MIN_VALUE;
        return this.f93981e.j(this);
    }
}
