package com.max.xiaoheihe.module.game;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GameShotPictureSelectorFragment.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.GameShotPictureSelectorFragment", f = "GameShotPictureSelectorFragment.kt", i = {0, 0}, l = {bb.c.b.f30946t6}, m = "getCacheImgList", n = {"cacheGameShotObj", "get"}, s = {"L$0", "L$1"})
public final class GameShotPictureSelectorFragment$getCacheImgList$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f84785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    Object f84786c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    /* synthetic */ Object f84787d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ GameShotPictureSelectorFragment f84788e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f84789f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameShotPictureSelectorFragment$getCacheImgList$1(GameShotPictureSelectorFragment gameShotPictureSelectorFragment, kotlin.coroutines.c<? super GameShotPictureSelectorFragment$getCacheImgList$1> cVar) {
        super(cVar);
        this.f84788e = gameShotPictureSelectorFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 33727, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f84787d = obj;
        this.f84789f |= Integer.MIN_VALUE;
        return GameShotPictureSelectorFragment.O3(this.f84788e, this);
    }
}
