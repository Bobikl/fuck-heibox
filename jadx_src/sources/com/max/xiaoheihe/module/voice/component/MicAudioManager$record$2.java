package com.max.xiaoheihe.module.voice.component;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: MicAudioManager.kt */
/* JADX INFO: loaded from: classes12.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.voice.component.MicAudioManager", f = "MicAudioManager.kt", i = {0, 0}, l = {66}, m = "record", n = {"this", "audioBuffer"}, s = {"L$0", "L$1"})
public final class MicAudioManager$record$2 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f94078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f94079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f94080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ MicAudioManager f94081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f94082f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    MicAudioManager$record$2(MicAudioManager micAudioManager, kotlin.coroutines.c<? super MicAudioManager$record$2> cVar) {
        super(cVar);
        this.f94081e = micAudioManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 46790, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f94080d = obj;
        this.f94082f |= Integer.MIN_VALUE;
        return this.f94081e.b(null, this);
    }
}
