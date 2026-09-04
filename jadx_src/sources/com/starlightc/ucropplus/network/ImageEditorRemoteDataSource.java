package com.starlightc.ucropplus.network;

import com.max.network.entities.ApiResponse;
import com.max.network.holder.ServiceHolder;
import com.max.network.interfaces.ResultHandler;
import com.max.network.model.RemoteDataSource;
import com.max.network.utils.DownloadResultBuilder;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.model.AdvanceTypefaceList;
import com.starlightc.ucropplus.model.ImageModuleList;
import com.starlightc.ucropplus.model.ImageModuleTabListObj;
import com.starlightc.ucropplus.model.StickerGroupInfoList;
import com.starlightc.ucropplus.model.TextTypefaceInfoList;
import dl.d;
import dl.e;
import kotlin.b0;
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.u;
import kotlin.t0;
import kotlin.z;
import okhttp3.d0;
import yh.a;
import yh.l;

/* JADX INFO: compiled from: ImageEditorRemoteDataSource.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageEditorRemoteDataSource extends RemoteDataSource {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final z service$delegate;

    /* JADX INFO: renamed from: com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$downloadTypeface$2, reason: invalid class name */
    /* JADX INFO: compiled from: ImageEditorRemoteDataSource.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$downloadTypeface$2", f = "ImageEditorRemoteDataSource.kt", i = {}, l = {52}, m = "invokeSuspend", n = {}, s = {})
    public static final class AnonymousClass2 extends SuspendLambda implements l<c<? super d0>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $url;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, c<? super AnonymousClass2> cVar) {
            super(1, cVar);
            this.$url = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final c<b2> create(@d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50218, new Class[]{c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : ImageEditorRemoteDataSource.this.new AnonymousClass2(this.$url, cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(c<? super d0> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50220, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@e c<? super d0> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50219, new Class[]{c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((AnonymousClass2) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50217, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                ImageEditorApi imageEditorApiAccess$getService = ImageEditorRemoteDataSource.access$getService(ImageEditorRemoteDataSource.this);
                String str = this.$url;
                this.label = 1;
                obj = imageEditorApiAccess$getService.downloadLargeFile(str, this);
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

    /* JADX INFO: renamed from: com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$getAdvanceTypefaceList$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ImageEditorRemoteDataSource.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$getAdvanceTypefaceList$2", f = "ImageEditorRemoteDataSource.kt", i = {}, l = {45}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13132 extends SuspendLambda implements l<c<? super ApiResponse<AdvanceTypefaceList>>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ int $limit;
        final /* synthetic */ int $offset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13132(int i10, int i11, c<? super C13132> cVar) {
            super(1, cVar);
            this.$offset = i10;
            this.$limit = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final c<b2> create(@d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50222, new Class[]{c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : ImageEditorRemoteDataSource.this.new C13132(this.$offset, this.$limit, cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(c<? super ApiResponse<AdvanceTypefaceList>> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50224, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@e c<? super ApiResponse<AdvanceTypefaceList>> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50223, new Class[]{c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13132) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50221, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                ImageEditorApi imageEditorApiAccess$getService = ImageEditorRemoteDataSource.access$getService(ImageEditorRemoteDataSource.this);
                int i11 = this.$offset;
                int i12 = this.$limit;
                this.label = 1;
                obj = imageEditorApiAccess$getService.getAdvanceTypefaceList(i11, i12, this);
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

    /* JADX INFO: renamed from: com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$getImageModuleList$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ImageEditorRemoteDataSource.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$getImageModuleList$2", f = "ImageEditorRemoteDataSource.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13142 extends SuspendLambda implements l<c<? super ApiResponse<ImageModuleList>>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        final /* synthetic */ String $key;
        final /* synthetic */ int $limit;
        final /* synthetic */ int $offset;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C13142(String str, int i10, int i11, c<? super C13142> cVar) {
            super(1, cVar);
            this.$key = str;
            this.$offset = i10;
            this.$limit = i11;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final c<b2> create(@d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50226, new Class[]{c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : ImageEditorRemoteDataSource.this.new C13142(this.$key, this.$offset, this.$limit, cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(c<? super ApiResponse<ImageModuleList>> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50228, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@e c<? super ApiResponse<ImageModuleList>> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50227, new Class[]{c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13142) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50225, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                ImageEditorApi imageEditorApiAccess$getService = ImageEditorRemoteDataSource.access$getService(ImageEditorRemoteDataSource.this);
                String str = this.$key;
                int i11 = this.$offset;
                int i12 = this.$limit;
                this.label = 1;
                obj = imageEditorApiAccess$getService.getImageModuleList(str, i11, i12, this);
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

    /* JADX INFO: renamed from: com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$getImageModuleTabList$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ImageEditorRemoteDataSource.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$getImageModuleTabList$2", f = "ImageEditorRemoteDataSource.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13152 extends SuspendLambda implements l<c<? super ApiResponse<ImageModuleTabListObj>>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        C13152(c<? super C13152> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final c<b2> create(@d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50230, new Class[]{c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : ImageEditorRemoteDataSource.this.new C13152(cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(c<? super ApiResponse<ImageModuleTabListObj>> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50232, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@e c<? super ApiResponse<ImageModuleTabListObj>> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50231, new Class[]{c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13152) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50229, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                ImageEditorApi imageEditorApiAccess$getService = ImageEditorRemoteDataSource.access$getService(ImageEditorRemoteDataSource.this);
                this.label = 1;
                obj = imageEditorApiAccess$getService.getImageModuleTabList(this);
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

    /* JADX INFO: renamed from: com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$getStickerList$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ImageEditorRemoteDataSource.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$getStickerList$2", f = "ImageEditorRemoteDataSource.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13162 extends SuspendLambda implements l<c<? super ApiResponse<StickerGroupInfoList>>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        C13162(c<? super C13162> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final c<b2> create(@d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50234, new Class[]{c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : ImageEditorRemoteDataSource.this.new C13162(cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(c<? super ApiResponse<StickerGroupInfoList>> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50236, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@e c<? super ApiResponse<StickerGroupInfoList>> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50235, new Class[]{c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13162) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50233, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                ImageEditorApi imageEditorApiAccess$getService = ImageEditorRemoteDataSource.access$getService(ImageEditorRemoteDataSource.this);
                String strO = com.max.hbcache.c.o(com.max.hbcache.c.f66113b0, null);
                this.label = 1;
                obj = imageEditorApiAccess$getService.getStickerList(strO, this);
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

    /* JADX INFO: renamed from: com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$getTypefaceInfoList$2, reason: invalid class name and case insensitive filesystem */
    /* JADX INFO: compiled from: ImageEditorRemoteDataSource.kt */
    @kotlin.coroutines.jvm.internal.d(c = "com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$getTypefaceInfoList$2", f = "ImageEditorRemoteDataSource.kt", i = {}, l = {21}, m = "invokeSuspend", n = {}, s = {})
    public static final class C13172 extends SuspendLambda implements l<c<? super ApiResponse<TextTypefaceInfoList>>, Object> {
        public static ChangeQuickRedirect changeQuickRedirect;
        int label;

        C13172(c<? super C13172> cVar) {
            super(1, cVar);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @d
        public final c<b2> create(@d c<?> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50238, new Class[]{c.class}, c.class);
            return patchProxyResultProxy.isSupported ? (c) patchProxyResultProxy.result : ImageEditorRemoteDataSource.this.new C13172(cVar);
        }

        @Override // yh.l
        public /* bridge */ /* synthetic */ Object invoke(c<? super ApiResponse<TextTypefaceInfoList>> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50240, new Class[]{Object.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke2(cVar);
        }

        @e
        /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(@e c<? super ApiResponse<TextTypefaceInfoList>> cVar) {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50239, new Class[]{c.class}, Object.class);
            return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : ((C13172) create(cVar)).invokeSuspend(b2.f124493a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @e
        public final Object invokeSuspend(@d Object obj) throws Throwable {
            PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50237, new Class[]{Object.class}, Object.class);
            if (patchProxyResultProxy.isSupported) {
                return patchProxyResultProxy.result;
            }
            Object objH = b.h();
            int i10 = this.label;
            if (i10 == 0) {
                t0.n(obj);
                ImageEditorApi imageEditorApiAccess$getService = ImageEditorRemoteDataSource.access$getService(ImageEditorRemoteDataSource.this);
                this.label = 1;
                obj = imageEditorApiAccess$getService.getTypefaceInfoList(this);
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

    /* JADX WARN: Multi-variable type inference failed */
    public ImageEditorRemoteDataSource() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public ImageEditorRemoteDataSource(@e ResultHandler resultHandler) {
        super(resultHandler);
        this.service$delegate = b0.c(new a<ImageEditorApi>() { // from class: com.starlightc.ucropplus.network.ImageEditorRemoteDataSource$service$2
            public static ChangeQuickRedirect changeQuickRedirect;

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // yh.a
            @d
            public final ImageEditorApi invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50241, new Class[0], ImageEditorApi.class);
                return patchProxyResultProxy.isSupported ? (ImageEditorApi) patchProxyResultProxy.result : (ImageEditorApi) ServiceHolder.Companion.getInstance().getApiService(new ImageEditorConfigProvider().getGroup());
            }

            /* JADX WARN: Type inference failed for: r0v3, types: [com.starlightc.ucropplus.network.ImageEditorApi, java.lang.Object] */
            @Override // yh.a
            public /* bridge */ /* synthetic */ ImageEditorApi invoke() {
                PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50242, new Class[0], Object.class);
                return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : invoke();
            }
        });
    }

    public /* synthetic */ ImageEditorRemoteDataSource(ResultHandler resultHandler, int i10, u uVar) {
        this((i10 & 1) != 0 ? null : resultHandler);
    }

    public static final /* synthetic */ ImageEditorApi access$getService(ImageEditorRemoteDataSource imageEditorRemoteDataSource) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageEditorRemoteDataSource}, null, changeQuickRedirect, true, 50216, new Class[]{ImageEditorRemoteDataSource.class}, ImageEditorApi.class);
        return patchProxyResultProxy.isSupported ? (ImageEditorApi) patchProxyResultProxy.result : imageEditorRemoteDataSource.getService();
    }

    private final ImageEditorApi getService() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50209, new Class[0], ImageEditorApi.class);
        return patchProxyResultProxy.isSupported ? (ImageEditorApi) patchProxyResultProxy.result : (ImageEditorApi) this.service$delegate.getValue();
    }

    @e
    public final Object downloadTypeface(@d String str, @d String str2, @d l<? super DownloadResultBuilder<String>, b2> lVar, @d c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, lVar, cVar}, this, changeQuickRedirect, false, 50215, new Class[]{String.class, String.class, l.class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        DownloadResultBuilder<String> downloadResultBuilder = new DownloadResultBuilder<>(null, 1, null);
        lVar.invoke(downloadResultBuilder);
        Object objDownloadFile = downloadFile(str2, downloadResultBuilder, new AnonymousClass2(str, null), cVar);
        return objDownloadFile == b.h() ? objDownloadFile : b2.f124493a;
    }

    @e
    public final Object getAdvanceTypefaceList(int i10, int i11, @d c<? super ApiResponse<AdvanceTypefaceList>> cVar) {
        Object[] objArr = {new Integer(i10), new Integer(i11), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50214, new Class[]{cls, cls, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : executeHttp(new C13132(i10, i11, null), cVar);
    }

    @e
    public final Object getImageModuleList(@e String str, int i10, int i11, @d c<? super ApiResponse<ImageModuleList>> cVar) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50213, new Class[]{String.class, cls, cls, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : executeHttp(new C13142(str, i10, i11, null), cVar);
    }

    @e
    public final Object getImageModuleTabList(@d c<? super ApiResponse<ImageModuleTabListObj>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50212, new Class[]{c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : executeHttp(new C13152(null), cVar);
    }

    @e
    public final Object getStickerList(@d c<? super ApiResponse<StickerGroupInfoList>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50211, new Class[]{c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : executeHttp(new C13162(null), cVar);
    }

    @e
    public final Object getTypefaceInfoList(@d c<? super ApiResponse<TextTypefaceInfoList>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50210, new Class[]{c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : executeHttp(new C13172(null), cVar);
    }
}
