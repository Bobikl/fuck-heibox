package com.starlightc.ucropplus.network;

import com.max.network.entities.ApiResponse;
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
import kotlin.b2;
import kotlin.coroutines.c;
import kotlin.coroutines.intrinsics.b;
import yh.l;

/* JADX INFO: compiled from: ImageEditorRepository.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageEditorRepository {
    public static ChangeQuickRedirect changeQuickRedirect;

    @d
    private final ImageEditorRemoteDataSource remoteDataSource = new ImageEditorRemoteDataSource(null, 1, 0 == true ? 1 : 0);

    @e
    public final Object downloadTypeface(@d String str, @d String str2, @d l<? super DownloadResultBuilder<String>, b2> lVar, @d c<? super b2> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, lVar, cVar}, this, changeQuickRedirect, false, 50248, new Class[]{String.class, String.class, l.class, c.class}, Object.class);
        if (patchProxyResultProxy.isSupported) {
            return patchProxyResultProxy.result;
        }
        Object objDownloadTypeface = this.remoteDataSource.downloadTypeface(str, str2, lVar, cVar);
        return objDownloadTypeface == b.h() ? objDownloadTypeface : b2.f124493a;
    }

    @e
    public final Object getAdvanceTypefaceList(int i10, int i11, @d c<? super ApiResponse<AdvanceTypefaceList>> cVar) {
        Object[] objArr = {new Integer(i10), new Integer(i11), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50247, new Class[]{cls, cls, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : this.remoteDataSource.getAdvanceTypefaceList(i10, i11, cVar);
    }

    @e
    public final Object getImageModuleList(@e String str, int i10, int i11, @d c<? super ApiResponse<ImageModuleList>> cVar) {
        Object[] objArr = {str, new Integer(i10), new Integer(i11), cVar};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50246, new Class[]{String.class, cls, cls, c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : this.remoteDataSource.getImageModuleList(str, i10, i11, cVar);
    }

    @e
    public final Object getImageModuleTabList(@d c<? super ApiResponse<ImageModuleTabListObj>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50245, new Class[]{c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : this.remoteDataSource.getImageModuleTabList(cVar);
    }

    @e
    public final Object getStickerList(@d c<? super ApiResponse<StickerGroupInfoList>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50244, new Class[]{c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : this.remoteDataSource.getStickerList(cVar);
    }

    @e
    public final Object getTypefaceInfoList(@d c<? super ApiResponse<TextTypefaceInfoList>> cVar) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{cVar}, this, changeQuickRedirect, false, 50243, new Class[]{c.class}, Object.class);
        return patchProxyResultProxy.isSupported ? patchProxyResultProxy.result : this.remoteDataSource.getTypefaceInfoList(cVar);
    }
}
