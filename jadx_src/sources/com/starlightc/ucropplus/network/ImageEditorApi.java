package com.starlightc.ucropplus.network;

import androidx.constraintlayout.core.motion.utils.w;
import com.max.network.entities.ApiResponse;
import com.max.network.interfaces.ApiService;
import com.starlightc.ucropplus.model.AdvanceTypefaceList;
import com.starlightc.ucropplus.model.ImageModuleList;
import com.starlightc.ucropplus.model.ImageModuleTabListObj;
import com.starlightc.ucropplus.model.StickerGroupInfoList;
import com.starlightc.ucropplus.model.TextTypefaceInfoList;
import dl.d;
import dl.e;
import kotlin.coroutines.c;
import ll.f;
import ll.t;

/* JADX INFO: compiled from: ImageEditorApi.kt */
/* JADX INFO: loaded from: classes4.dex */
public interface ImageEditorApi extends ApiService {
    @f("bbs/app/api/image_editor/advance_typeface/list")
    @e
    Object getAdvanceTypefaceList(@t(w.c.R) int i10, @t("limit") int i11, @d c<? super ApiResponse<AdvanceTypefaceList>> cVar);

    @f("bbs/app/api/image_editor/module/list")
    @e
    Object getImageModuleList(@e @t("key") String str, @t(w.c.R) int i10, @t("limit") int i11, @d c<? super ApiResponse<ImageModuleList>> cVar);

    @f("bbs/app/api/image_editor/module/tab_list")
    @e
    Object getImageModuleTabList(@d c<? super ApiResponse<ImageModuleTabListObj>> cVar);

    @f("bbs/app/api/image_editor/sticker/list")
    @e
    Object getStickerList(@e @t("sticker_version") String str, @d c<? super ApiResponse<StickerGroupInfoList>> cVar);

    @f("bbs/app/api/typeface")
    @e
    Object getTypefaceInfoList(@d c<? super ApiResponse<TextTypefaceInfoList>> cVar);
}
