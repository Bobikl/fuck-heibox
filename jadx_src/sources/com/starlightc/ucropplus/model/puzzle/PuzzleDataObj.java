package com.starlightc.ucropplus.model.puzzle;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.max.hbcommon.utils.c;
import com.max.hbimage.b;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.util.TypefaceUtil;
import dl.d;
import dl.e;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PuzzleDataObj.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class PuzzleDataObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private BackgroundObj background;

    @e
    private String height;

    @e
    private String max_pic_num;

    @e
    private String min_pic_num;

    @e
    private ArrayList<BasePuzzleInfo> puzzle_list;

    public PuzzleDataObj(@e ArrayList<BasePuzzleInfo> arrayList, @e String str, @e String str2, @e String str3, @e BackgroundObj backgroundObj) {
        this.puzzle_list = arrayList;
        this.height = str;
        this.min_pic_num = str2;
        this.max_pic_num = str3;
        this.background = backgroundObj;
    }

    public static /* synthetic */ PuzzleDataObj copy$default(PuzzleDataObj puzzleDataObj, ArrayList arrayList, String str, String str2, String str3, BackgroundObj backgroundObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{puzzleDataObj, arrayList, str, str2, str3, backgroundObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 50195, new Class[]{PuzzleDataObj.class, ArrayList.class, String.class, String.class, String.class, BackgroundObj.class, Integer.TYPE, Object.class}, PuzzleDataObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PuzzleDataObj) patchProxyResultProxy.result;
        }
        return puzzleDataObj.copy((i10 & 1) != 0 ? puzzleDataObj.puzzle_list : arrayList, (i10 & 2) != 0 ? puzzleDataObj.height : str, (i10 & 4) != 0 ? puzzleDataObj.min_pic_num : str2, (i10 & 8) != 0 ? puzzleDataObj.max_pic_num : str3, (i10 & 16) != 0 ? puzzleDataObj.background : backgroundObj);
    }

    @e
    public final ArrayList<BasePuzzleInfo> component1() {
        return this.puzzle_list;
    }

    @e
    public final String component2() {
        return this.height;
    }

    @e
    public final String component3() {
        return this.min_pic_num;
    }

    @e
    public final String component4() {
        return this.max_pic_num;
    }

    @e
    public final BackgroundObj component5() {
        return this.background;
    }

    @d
    public final PuzzleDataObj copy(@e ArrayList<BasePuzzleInfo> arrayList, @e String str, @e String str2, @e String str3, @e BackgroundObj backgroundObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{arrayList, str, str2, str3, backgroundObj}, this, changeQuickRedirect, false, 50194, new Class[]{ArrayList.class, String.class, String.class, String.class, BackgroundObj.class}, PuzzleDataObj.class);
        return patchProxyResultProxy.isSupported ? (PuzzleDataObj) patchProxyResultProxy.result : new PuzzleDataObj(arrayList, str, str2, str3, backgroundObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50193, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PuzzleDataObj)) {
            return false;
        }
        PuzzleDataObj puzzleDataObj = (PuzzleDataObj) obj;
        return c.y(puzzleDataObj.puzzle_list, this.puzzle_list) && f0.g(puzzleDataObj.height, this.height) && f0.g(puzzleDataObj.min_pic_num, this.min_pic_num) && f0.g(puzzleDataObj.max_pic_num, this.max_pic_num) && f0.g(puzzleDataObj.background, this.background);
    }

    @e
    public final BackgroundObj getBackground() {
        return this.background;
    }

    @e
    public final String getHeight() {
        return this.height;
    }

    @e
    public final String getMax_pic_num() {
        return this.max_pic_num;
    }

    @e
    public final String getMin_pic_num() {
        return this.min_pic_num;
    }

    @e
    public final ArrayList<BasePuzzleInfo> getPuzzle_list() {
        return this.puzzle_list;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50197, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        ArrayList<BasePuzzleInfo> arrayList = this.puzzle_list;
        int iHashCode = (arrayList == null ? 0 : arrayList.hashCode()) * 31;
        String str = this.height;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.min_pic_num;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.max_pic_num;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        BackgroundObj backgroundObj = this.background;
        return iHashCode4 + (backgroundObj != null ? backgroundObj.hashCode() : 0);
    }

    public final int needLoadPictureNum() {
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50191, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (c.w(this.puzzle_list)) {
            return 0;
        }
        ArrayList<BasePuzzleInfo> arrayList = this.puzzle_list;
        f0.m(arrayList);
        for (BasePuzzleInfo basePuzzleInfo : arrayList) {
            if (basePuzzleInfo instanceof StaticPicturePuzzle) {
                StaticPicturePuzzle staticPicturePuzzle = (StaticPicturePuzzle) basePuzzleInfo;
                if (!c.u(staticPicturePuzzle.getUrl())) {
                    Bitmap bitmapDecodeFile = null;
                    File fileP = b.p(staticPicturePuzzle.getUrl());
                    if (fileP != null && fileP.exists()) {
                        bitmapDecodeFile = BitmapFactory.decodeFile(fileP.getPath());
                    }
                    if (bitmapDecodeFile == null) {
                        i10++;
                    }
                }
            }
        }
        return i10;
    }

    public final int needLoadTypefaceNum() {
        String typeface_name;
        int i10 = 0;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50192, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        if (c.w(this.puzzle_list)) {
            return 0;
        }
        ArrayList<BasePuzzleInfo> arrayList = this.puzzle_list;
        f0.m(arrayList);
        for (BasePuzzleInfo basePuzzleInfo : arrayList) {
            if ((basePuzzleInfo instanceof TextPuzzle) && (typeface_name = ((TextPuzzle) basePuzzleInfo).getTypeface_name()) != null && TypefaceUtil.INSTANCE.getCachedRemoteTypeface(typeface_name) == null) {
                i10++;
            }
        }
        return i10;
    }

    public final boolean needLoading() {
        String typeface_name;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50190, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (c.w(this.puzzle_list)) {
            return false;
        }
        ArrayList<BasePuzzleInfo> arrayList = this.puzzle_list;
        f0.m(arrayList);
        for (BasePuzzleInfo basePuzzleInfo : arrayList) {
            if (basePuzzleInfo instanceof StaticPicturePuzzle) {
                StaticPicturePuzzle staticPicturePuzzle = (StaticPicturePuzzle) basePuzzleInfo;
                if (c.u(staticPicturePuzzle.getUrl())) {
                    continue;
                } else {
                    Bitmap bitmapDecodeFile = null;
                    File fileP = b.p(staticPicturePuzzle.getUrl());
                    if (fileP != null && fileP.exists()) {
                        bitmapDecodeFile = BitmapFactory.decodeFile(fileP.getPath());
                    }
                    if (bitmapDecodeFile == null) {
                        return true;
                    }
                }
            } else if ((basePuzzleInfo instanceof TextPuzzle) && (typeface_name = ((TextPuzzle) basePuzzleInfo).getTypeface_name()) != null && TypefaceUtil.INSTANCE.getCachedRemoteTypeface(typeface_name) == null) {
                return true;
            }
        }
        return false;
    }

    public final void setBackground(@e BackgroundObj backgroundObj) {
        this.background = backgroundObj;
    }

    public final void setHeight(@e String str) {
        this.height = str;
    }

    public final void setMax_pic_num(@e String str) {
        this.max_pic_num = str;
    }

    public final void setMin_pic_num(@e String str) {
        this.min_pic_num = str;
    }

    public final void setPuzzle_list(@e ArrayList<BasePuzzleInfo> arrayList) {
        this.puzzle_list = arrayList;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50196, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PuzzleDataObj(puzzle_list=" + this.puzzle_list + ", height=" + this.height + ", min_pic_num=" + this.min_pic_num + ", max_pic_num=" + this.max_pic_num + ", background=" + this.background + ')';
    }
}
