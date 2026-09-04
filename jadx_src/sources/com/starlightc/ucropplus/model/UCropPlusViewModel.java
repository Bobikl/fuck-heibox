package com.starlightc.ucropplus.model;

import androidx.lifecycle.w0;
import com.max.network.entities.ApiResponse;
import com.max.network.utils.DownloadResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.network.ImageEditorRepository;
import dl.d;
import dl.e;
import kotlin.b0;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.t0;
import kotlin.z;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.u;
import kotlinx.coroutines.flow.v;
import yh.a;
import yh.l;

/* JADX INFO: compiled from: UCropPlusViewModel.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class UCropPlusViewModel extends w0 {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final j<ApiResponse<TextTypefaceInfoList>> _typefaceStateFlow = v.a(new ApiResponse(null, null, null, null, 15, null));

    @d
    private final j<ApiResponse<StickerGroupInfoList>> _stickerStateFlow = v.a(new ApiResponse(null, null, null, null, 15, null));

    @d
    private final z remoteRepo$delegate = b0.c(new a<ImageEditorRepository>() { // from class: com.starlightc.ucropplus.model.UCropPlusViewModel$remoteRepo$2
        public static ChangeQuickRedirect changeQuickRedirect;

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // yh.a
        @d
        public final ImageEditorRepository invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50155, new Class[0], ImageEditorRepository.class);
            return patchProxyResultProxy.isSupported ? (ImageEditorRepository) patchProxyResultProxy.result : new ImageEditorRepository();
        }

        /* JADX WARN: Type inference failed for: r0v3, types: [com.starlightc.ucropplus.network.ImageEditorRepository, java.lang.Object] */
        @Override // yh.a
        public /* bridge */ /* synthetic */ ImageEditorRepository invoke() {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50156, new Class[0], Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
        }
    });

    /* JADX INFO: renamed from: com.starlightc.ucropplus.model.UCropPlusViewModel$getStickerList$1, reason: invalid class name */
    /* JADX INFO: compiled from: UCropPlusViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.model.UCropPlusViewModel", f = "UCropPlusViewModel.kt", i = {}, l = {26}, m = "getStickerList", n = {}, s = {})
    public static final class AnonymousClass1 extends ContinuationImpl {
        public static ChangeQuickRedirect changeQuickRedirect;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(c<? super AnonymousClass1> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50153, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UCropPlusViewModel.this.getStickerList(this);
        }
    }

    /* JADX INFO: renamed from: com.starlightc.ucropplus.model.UCropPlusViewModel$getTypefaceInfoList$1, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: UCropPlusViewModel.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.model.UCropPlusViewModel", f = "UCropPlusViewModel.kt", i = {}, l = {22}, m = "getTypefaceInfoList", n = {}, s = {})
    public static final class C13121 extends ContinuationImpl {
        public static ChangeQuickRedirect changeQuickRedirect;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        C13121(c<? super C13121> cVar) {
            super(cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50154, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return UCropPlusViewModel.this.getTypefaceInfoList(this);
        }
    }

    private final ImageEditorRepository getRemoteRepo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50149, new Class[0], ImageEditorRepository.class);
        return patchProxyResultProxy.isSupported ? (ImageEditorRepository) patchProxyResultProxy.result : (ImageEditorRepository) this.remoteRepo$delegate.getValue();
    }

    @e
    public final Object downloadTypeface(@d String str, @d String str2, @d l<? super DownloadResultBuilder<String>, b2> lVar, @d c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, lVar, cVar}, this, changeQuickRedirect, false, 50152, new Class[]{String.class, String.class, l.class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objDownloadTypeface = getRemoteRepo().downloadTypeface(str, str2, lVar, cVar);
        return objDownloadTypeface == b.h() ? objDownloadTypeface : b2.f124493a;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    @e
    public final Object getStickerList(@d c<? super b2> cVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        j jVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50151, new Class[]{c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) cVar;
            int i10 = anonymousClass1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                anonymousClass1.label = i10 - Integer.MIN_VALUE;
            } else {
                anonymousClass1 = new AnonymousClass1(cVar);
            }
        } else {
            anonymousClass1 = new AnonymousClass1(cVar);
        }
        Object obj = anonymousClass1.result;
        Object objH = b.h();
        int i11 = anonymousClass1.label;
        if (i11 == 0) {
            t0.n(obj);
            j<ApiResponse<StickerGroupInfoList>> jVar2 = this._stickerStateFlow;
            ImageEditorRepository remoteRepo = getRemoteRepo();
            anonymousClass1.L$0 = jVar2;
            anonymousClass1.label = 1;
            Object stickerList = remoteRepo.getStickerList(anonymousClass1);
            if (stickerList == objH) {
                return objH;
            }
            jVar = jVar2;
            obj = stickerList;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) anonymousClass1.L$0;
            t0.n(obj);
        }
        jVar.setValue(obj);
        return b2.f124493a;
    }

    @d
    public final u<ApiResponse<StickerGroupInfoList>> getStickerStateFlow() {
        return this._stickerStateFlow;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0033  */
    @e
    public final Object getTypefaceInfoList(@d c<? super b2> cVar) throws Throwable {
        C13121 c13121;
        j jVar;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50150, new Class[]{c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        if (cVar instanceof C13121) {
            c13121 = (C13121) cVar;
            int i10 = c13121.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                c13121.label = i10 - Integer.MIN_VALUE;
            } else {
                c13121 = new C13121(cVar);
            }
        } else {
            c13121 = new C13121(cVar);
        }
        Object obj = c13121.result;
        Object objH = b.h();
        int i11 = c13121.label;
        if (i11 == 0) {
            t0.n(obj);
            j<ApiResponse<TextTypefaceInfoList>> jVar2 = this._typefaceStateFlow;
            ImageEditorRepository remoteRepo = getRemoteRepo();
            c13121.L$0 = jVar2;
            c13121.label = 1;
            Object typefaceInfoList = remoteRepo.getTypefaceInfoList(c13121);
            if (typefaceInfoList == objH) {
                return objH;
            }
            jVar = jVar2;
            obj = typefaceInfoList;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jVar = (j) c13121.L$0;
            t0.n(obj);
        }
        jVar.setValue(obj);
        return b2.f124493a;
    }

    @d
    public final u<ApiResponse<TextTypefaceInfoList>> getTypefaceStateFlow() {
        return this._typefaceStateFlow;
    }
}
