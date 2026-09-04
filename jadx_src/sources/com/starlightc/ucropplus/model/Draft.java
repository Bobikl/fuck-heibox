package com.starlightc.ucropplus.model;

import com.max.hbcommon.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.model.puzzle.ImageModuleObj;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: Draft.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class Draft implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String draftPath;

    @e
    private ImageFilterInfo filter;

    @e
    private ImageModuleObj imageModule;

    @e
    private ImageCropState info;

    @e
    private String src;

    @d
    private ArrayList<StickerStateInfo> stickers;

    public Draft(@e String str, @e String str2, @e ImageCropState imageCropState, @d ArrayList<StickerStateInfo> stickers, @e ImageFilterInfo imageFilterInfo, @e ImageModuleObj imageModuleObj) {
        f0.p(stickers, "stickers");
        this.src = str;
        this.draftPath = str2;
        this.info = imageCropState;
        this.stickers = stickers;
        this.filter = imageFilterInfo;
        this.imageModule = imageModuleObj;
    }

    public static /* synthetic */ Draft copy$default(Draft draft, String str, String str2, ImageCropState imageCropState, ArrayList arrayList, ImageFilterInfo imageFilterInfo, ImageModuleObj imageModuleObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{draft, str, str2, imageCropState, arrayList, imageFilterInfo, imageModuleObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 50062, new Class[]{Draft.class, String.class, String.class, ImageCropState.class, ArrayList.class, ImageFilterInfo.class, ImageModuleObj.class, Integer.TYPE, Object.class}, Draft.class);
        if (patchProxyResultProxy.isSupported) {
            return (Draft) patchProxyResultProxy.result;
        }
        return draft.copy((i10 & 1) != 0 ? draft.src : str, (i10 & 2) != 0 ? draft.draftPath : str2, (i10 & 4) != 0 ? draft.info : imageCropState, (i10 & 8) != 0 ? draft.stickers : arrayList, (i10 & 16) != 0 ? draft.filter : imageFilterInfo, (i10 & 32) != 0 ? draft.imageModule : imageModuleObj);
    }

    @e
    public final String component1() {
        return this.src;
    }

    @e
    public final String component2() {
        return this.draftPath;
    }

    @e
    public final ImageCropState component3() {
        return this.info;
    }

    @d
    public final ArrayList<StickerStateInfo> component4() {
        return this.stickers;
    }

    @e
    public final ImageFilterInfo component5() {
        return this.filter;
    }

    @e
    public final ImageModuleObj component6() {
        return this.imageModule;
    }

    @d
    public final Draft copy(@e String str, @e String str2, @e ImageCropState imageCropState, @d ArrayList<StickerStateInfo> stickers, @e ImageFilterInfo imageFilterInfo, @e ImageModuleObj imageModuleObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, imageCropState, stickers, imageFilterInfo, imageModuleObj}, this, changeQuickRedirect, false, 50061, new Class[]{String.class, String.class, ImageCropState.class, ArrayList.class, ImageFilterInfo.class, ImageModuleObj.class}, Draft.class);
        if (patchProxyResultProxy.isSupported) {
            return (Draft) patchProxyResultProxy.result;
        }
        f0.p(stickers, "stickers");
        return new Draft(str, str2, imageCropState, stickers, imageFilterInfo, imageModuleObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50060, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Draft)) {
            return false;
        }
        Draft draft = (Draft) obj;
        return f0.g(draft.src, this.src) && f0.g(draft.draftPath, this.draftPath) && c.y(draft.stickers, this.stickers) && f0.g(draft.info, this.info) && f0.g(draft.filter, this.filter) && f0.g(draft.imageModule, this.imageModule);
    }

    @e
    public final String getDraftPath() {
        return this.draftPath;
    }

    @e
    public final ImageFilterInfo getFilter() {
        return this.filter;
    }

    @e
    public final ImageModuleObj getImageModule() {
        return this.imageModule;
    }

    @e
    public final ImageCropState getInfo() {
        return this.info;
    }

    @e
    public final String getSrc() {
        return this.src;
    }

    @d
    public final ArrayList<StickerStateInfo> getStickers() {
        return this.stickers;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50064, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.src;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.draftPath;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImageCropState imageCropState = this.info;
        int iHashCode3 = (((iHashCode2 + (imageCropState == null ? 0 : imageCropState.hashCode())) * 31) + this.stickers.hashCode()) * 31;
        ImageFilterInfo imageFilterInfo = this.filter;
        int iHashCode4 = (iHashCode3 + (imageFilterInfo == null ? 0 : imageFilterInfo.hashCode())) * 31;
        ImageModuleObj imageModuleObj = this.imageModule;
        return iHashCode4 + (imageModuleObj != null ? imageModuleObj.hashCode() : 0);
    }

    public final void setDraftPath(@e String str) {
        this.draftPath = str;
    }

    public final void setFilter(@e ImageFilterInfo imageFilterInfo) {
        this.filter = imageFilterInfo;
    }

    public final void setImageModule(@e ImageModuleObj imageModuleObj) {
        this.imageModule = imageModuleObj;
    }

    public final void setInfo(@e ImageCropState imageCropState) {
        this.info = imageCropState;
    }

    public final void setSrc(@e String str) {
        this.src = str;
    }

    public final void setStickers(@d ArrayList<StickerStateInfo> arrayList) {
        if (PatchProxy.proxy(new Object[]{arrayList}, this, changeQuickRedirect, false, 50059, new Class[]{ArrayList.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(arrayList, "<set-?>");
        this.stickers = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50063, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "Draft(src=" + this.src + ", draftPath=" + this.draftPath + ", info=" + this.info + ", stickers=" + this.stickers + ", filter=" + this.filter + ", imageModule=" + this.imageModule + ')';
    }
}
