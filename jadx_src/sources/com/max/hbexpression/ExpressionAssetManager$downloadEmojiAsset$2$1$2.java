package com.max.hbexpression;

import com.max.hbexpression.bean.EmojiGroupObj;
import com.max.network.holder.ServiceHolder;
import com.max.network.interfaces.ApiService;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.f0;
import kotlin.t0;
import okhttp3.d0;

/* JADX INFO: compiled from: ExpressionAssetManager.kt */
/* JADX INFO: loaded from: classes10.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.hbexpression.ExpressionAssetManager$downloadEmojiAsset$2$1$2", f = "ExpressionAssetManager.kt", i = {}, l = {126}, m = "invokeSuspend", n = {}, s = {})
public final class ExpressionAssetManager$downloadEmojiAsset$2$1$2 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super d0>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f69940b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ EmojiGroupObj f69941c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ExpressionAssetManager$downloadEmojiAsset$2$1$2(EmojiGroupObj emojiGroupObj, kotlin.coroutines.c<? super ExpressionAssetManager$downloadEmojiAsset$2$1$2> cVar) {
        super(1, cVar);
        this.f69941c = emojiGroupObj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.sC, new Class[]{kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new ExpressionAssetManager$downloadEmojiAsset$2$1$2(this.f69941c, cVar);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super d0> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.uC, new Class[]{Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.e kotlin.coroutines.c<? super d0> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, bb.c.f.tC, new Class[]{kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((ExpressionAssetManager$downloadEmojiAsset$2$1$2) create(cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.f.rC, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.f69940b;
        if (i10 == 0) {
            t0.n(obj);
            ApiService apiService = ServiceHolder.Companion.getInstance().getApiService(ob.a.k().d());
            String source_url = this.f69941c.getSource_url();
            f0.m(source_url);
            this.f69940b = 1;
            obj = apiService.downloadFile(source_url, this);
            if (obj == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return obj;
    }
}
