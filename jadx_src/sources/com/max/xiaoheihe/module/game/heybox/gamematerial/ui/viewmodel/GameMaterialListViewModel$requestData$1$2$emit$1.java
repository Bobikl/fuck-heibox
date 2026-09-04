package com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: compiled from: GameMaterialListViewModel.kt */
/* JADX INFO: loaded from: classes11.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.module.game.heybox.gamematerial.ui.viewmodel.GameMaterialListViewModel$requestData$1$2", f = "GameMaterialListViewModel.kt", i = {0}, l = {96, 109}, m = "emit", n = {"this"}, s = {"L$0"})
public final class GameMaterialListViewModel$requestData$1$2$emit$1 extends ContinuationImpl {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    Object f87701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    /* synthetic */ Object f87702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ GameMaterialListViewModel$requestData$1.AnonymousClass2 f87703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f87704e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GameMaterialListViewModel$requestData$1$2$emit$1(GameMaterialListViewModel$requestData$1.AnonymousClass2 anonymousClass2, kotlin.coroutines.c<? super GameMaterialListViewModel$requestData$1$2$emit$1> cVar) {
        super(cVar);
        this.f87703d = anonymousClass2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 37869, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        this.f87702c = obj;
        this.f87704e |= Integer.MIN_VALUE;
        return this.f87703d.a(null, this);
    }
}
