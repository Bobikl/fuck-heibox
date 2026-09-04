package com.starlightc.ucropplus.model.puzzle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ImageModuleObj.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ImageModuleObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String desc;

    @e
    private String module_id;

    @e
    private String name;

    @e
    private PuzzleDataObj puzzle_data;

    @e
    private String sample_img;

    public ImageModuleObj(@e String str, @e String str2, @e String str3, @e String str4, @e PuzzleDataObj puzzleDataObj) {
        this.module_id = str;
        this.name = str2;
        this.sample_img = str3;
        this.desc = str4;
        this.puzzle_data = puzzleDataObj;
    }

    public static /* synthetic */ ImageModuleObj copy$default(ImageModuleObj imageModuleObj, String str, String str2, String str3, String str4, PuzzleDataObj puzzleDataObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{imageModuleObj, str, str2, str3, str4, puzzleDataObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 50181, new Class[]{ImageModuleObj.class, String.class, String.class, String.class, String.class, PuzzleDataObj.class, Integer.TYPE, Object.class}, ImageModuleObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ImageModuleObj) patchProxyResultProxy.result;
        }
        return imageModuleObj.copy((i10 & 1) != 0 ? imageModuleObj.module_id : str, (i10 & 2) != 0 ? imageModuleObj.name : str2, (i10 & 4) != 0 ? imageModuleObj.sample_img : str3, (i10 & 8) != 0 ? imageModuleObj.desc : str4, (i10 & 16) != 0 ? imageModuleObj.puzzle_data : puzzleDataObj);
    }

    @e
    public final String component1() {
        return this.module_id;
    }

    @e
    public final String component2() {
        return this.name;
    }

    @e
    public final String component3() {
        return this.sample_img;
    }

    @e
    public final String component4() {
        return this.desc;
    }

    @e
    public final PuzzleDataObj component5() {
        return this.puzzle_data;
    }

    @d
    public final ImageModuleObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e PuzzleDataObj puzzleDataObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, puzzleDataObj}, this, changeQuickRedirect, false, 50180, new Class[]{String.class, String.class, String.class, String.class, PuzzleDataObj.class}, ImageModuleObj.class);
        return patchProxyResultProxy.isSupported ? (ImageModuleObj) patchProxyResultProxy.result : new ImageModuleObj(str, str2, str3, str4, puzzleDataObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50179, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ImageModuleObj)) {
            return false;
        }
        ImageModuleObj imageModuleObj = (ImageModuleObj) obj;
        return f0.g(imageModuleObj.module_id, this.module_id) && f0.g(imageModuleObj.name, this.name) && f0.g(imageModuleObj.sample_img, this.sample_img) && f0.g(imageModuleObj.desc, this.desc) && f0.g(imageModuleObj.puzzle_data, this.puzzle_data);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getModule_id() {
        return this.module_id;
    }

    @e
    public final String getName() {
        return this.name;
    }

    @e
    public final PuzzleDataObj getPuzzle_data() {
        return this.puzzle_data;
    }

    @e
    public final String getSample_img() {
        return this.sample_img;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50183, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.module_id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.name;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.sample_img;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        PuzzleDataObj puzzleDataObj = this.puzzle_data;
        return iHashCode4 + (puzzleDataObj != null ? puzzleDataObj.hashCode() : 0);
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setModule_id(@e String str) {
        this.module_id = str;
    }

    public final void setName(@e String str) {
        this.name = str;
    }

    public final void setPuzzle_data(@e PuzzleDataObj puzzleDataObj) {
        this.puzzle_data = puzzleDataObj;
    }

    public final void setSample_img(@e String str) {
        this.sample_img = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50182, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ImageModuleObj(module_id=" + this.module_id + ", name=" + this.name + ", sample_img=" + this.sample_img + ", desc=" + this.desc + ", puzzle_data=" + this.puzzle_data + ')';
    }
}
