package com.max.xiaoheihe.module.game;

import com.max.xiaoheihe.okflutter.containers.FlutterActivityLaunchConfigs;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment", f = "GameShotPictureSelectorFragment.kt", i = {0, 0}, l = {bb.c.b.f30558c7}, m = "saveImage", n = {FlutterActivityLaunchConfigs.EXTRA_PATH, "get"}, s = {"L$0", "L$1"})
public final class GameShotPictureSelectorFragment$saveImage$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f84831b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f84832c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f84833d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ GameShotPictureSelectorFragment f84834e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f84835f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameShotPictureSelectorFragment$saveImage$1(GameShotPictureSelectorFragment gameShotPictureSelectorFragment, kotlin.coroutines.c<? super GameShotPictureSelectorFragment$saveImage$1> cVar) {
        super(cVar);
        this.f84834e = gameShotPictureSelectorFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33765, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f84833d = obj;
        this.f84835f |= Integer.MIN_VALUE;
        return GameShotPictureSelectorFragment.a4(this.f84834e, null, this);
    }
}
