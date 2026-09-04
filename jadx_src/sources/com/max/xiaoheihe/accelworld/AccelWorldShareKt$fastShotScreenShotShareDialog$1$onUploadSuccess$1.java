package com.max.xiaoheihe.accelworld;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.max.hbminiprogram.bean.ScreenStyleInfoObj;
import com.max.xiaoheihe.bean.share.ScreenShareInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.t0;
import kotlinx.coroutines.q0;

/* JADX INFO: compiled from: AccelWorldShare.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.max.xiaoheihe.accelworld.AccelWorldShareKt$fastShotScreenShotShareDialog$1$onUploadSuccess$1", f = "AccelWorldShare.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class AccelWorldShareKt$fastShotScreenShotShareDialog$1$onUploadSuccess$1 extends SuspendLambda implements yh.p<q0, kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f76479b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ WeakReference<Context> f76480c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ String[] f76481d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ boolean f76482e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ ScreenShareInfoObj f76483f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ ScreenStyleInfoObj f76484g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ List<Bitmap> f76485h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    final /* synthetic */ com.max.hbshare.c.b f76486i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccelWorldShareKt$fastShotScreenShotShareDialog$1$onUploadSuccess$1(WeakReference<Context> weakReference, String[] strArr, boolean z10, ScreenShareInfoObj screenShareInfoObj, ScreenStyleInfoObj screenStyleInfoObj, List<Bitmap> list, com.max.hbshare.c.b bVar, kotlin.coroutines.c<? super AccelWorldShareKt$fastShotScreenShotShareDialog$1$onUploadSuccess$1> cVar) {
        super(2, cVar);
        this.f76480c = weakReference;
        this.f76481d = strArr;
        this.f76482e = z10;
        this.f76483f = screenShareInfoObj;
        this.f76484g = screenStyleInfoObj;
        this.f76485h = list;
        this.f76486i = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.e Object obj, @dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj, cVar}, this, changeQuickRedirect, false, bb.c.m.ky, new Class[]{Object.class, kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new AccelWorldShareKt$fastShotScreenShotShareDialog$1$onUploadSuccess$1(this.f76480c, this.f76481d, this.f76482e, this.f76483f, this.f76484g, this.f76485h, this.f76486i, cVar);
    }

    @Override // yh.p
    public /* bridge */ /* synthetic */ Object invoke(q0 q0Var, kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.my, new Class[]{Object.class, Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(q0Var, cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.d q0 q0Var, @dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{q0Var, cVar}, this, changeQuickRedirect, false, bb.c.m.ly, new Class[]{q0.class, kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AccelWorldShareKt$fastShotScreenShotShareDialog$1$onUploadSuccess$1) create(q0Var, cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, bb.c.m.jy, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        kotlin.coroutines.intrinsics.b.h();
        if (this.f76479b != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        t0.n(obj);
        Context context = this.f76480c.get();
        if (context != null) {
            String[] strArr = this.f76481d;
            boolean z10 = this.f76482e;
            ScreenShareInfoObj screenShareInfoObj = this.f76483f;
            ScreenStyleInfoObj screenStyleInfoObj = this.f76484g;
            List<Bitmap> list = this.f76485h;
            com.max.hbshare.c.b bVar = this.f76486i;
            JsonObject jsonObject = new JsonObject();
            if (strArr.length == 1) {
                jsonObject.addProperty("img_url", strArr[0]);
            } else {
                JsonArray jsonArray = new JsonArray();
                for (String str : strArr) {
                    jsonArray.add(str);
                }
                jsonObject.add("img_urls", jsonArray);
            }
            if (!z10) {
                AccelWorldShareKt.b(context, screenShareInfoObj, screenStyleInfoObj, list, bVar);
            }
        }
        return b2.f124493a;
    }
}
