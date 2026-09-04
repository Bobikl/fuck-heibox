package com.starlightc.ucropplus.ui;

import com.max.network.utils.DownloadResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.model.UCropPlusViewModel;
import com.starlightc.ucropplus.util.TypefaceUtil;
import java.io.File;
import kotlin.b2;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref;
import kotlin.t0;

/* JADX INFO: compiled from: UCropPlusActivity.kt */
/* JADX INFO: loaded from: classes4.dex */
@kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.ui.UCropPlusActivity$downloadTypeface$1$1$1", f = "UCropPlusActivity.kt", i = {}, l = {273}, m = "invokeSuspend", n = {}, s = {})
public final class UCropPlusActivity$downloadTypeface$1$1$1 extends SuspendLambda implements yh.l<kotlin.coroutines.c<? super b2>, Object> {
    public static ChangeQuickRedirect changeQuickRedirect;
    final /* synthetic */ yh.l<DownloadResultBuilder<String>, b2> $builder;
    final /* synthetic */ Ref.ObjectRef<String> $downloadUrl;
    final /* synthetic */ String $name;
    int label;
    final /* synthetic */ UCropPlusActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    UCropPlusActivity$downloadTypeface$1$1$1(UCropPlusActivity uCropPlusActivity, Ref.ObjectRef<String> objectRef, String str, yh.l<? super DownloadResultBuilder<String>, b2> lVar, kotlin.coroutines.c<? super UCropPlusActivity$downloadTypeface$1$1$1> cVar) {
        super(1, cVar);
        this.this$0 = uCropPlusActivity;
        this.$downloadUrl = objectRef;
        this.$name = str;
        this.$builder = lVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.d
    public final kotlin.coroutines.c<b2> create(@dl.d kotlin.coroutines.c<?> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50622, new Class[]{kotlin.coroutines.c.class}, kotlin.coroutines.c.class);
        return patchProxyResultProxy.isSupported ? (kotlin.coroutines.c) patchProxyResultProxy.result : new UCropPlusActivity$downloadTypeface$1$1$1(this.this$0, this.$downloadUrl, this.$name, this.$builder, cVar);
    }

    @Override // yh.l
    public /* bridge */ /* synthetic */ Object invoke(kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50624, new Class[]{Object.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
    }

    @dl.e
    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(@dl.e kotlin.coroutines.c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50623, new Class[]{kotlin.coroutines.c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((UCropPlusActivity$downloadTypeface$1$1$1) create(cVar)).invokeSuspend(b2.f124493a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @dl.e
    public final Object invokeSuspend(@dl.d Object obj) throws Throwable {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50621, new Class[]{Object.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objH = kotlin.coroutines.intrinsics.b.h();
        int i10 = this.label;
        if (i10 == 0) {
            t0.n(obj);
            UCropPlusViewModel uCropPlusViewModelAccess$getViewModel = UCropPlusActivity.access$getViewModel(this.this$0);
            String str = this.$downloadUrl.f124891b;
            String str2 = TypefaceUtil.INSTANCE.getTypefaceDir(this.this$0).getPath() + File.separator + this.$name + ".ttf";
            yh.l<DownloadResultBuilder<String>, b2> lVar = this.$builder;
            this.label = 1;
            if (uCropPlusViewModelAccess$getViewModel.downloadTypeface(str, str2, lVar, this) == objH) {
                return objH;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            t0.n(obj);
        }
        return b2.f124493a;
    }
}
