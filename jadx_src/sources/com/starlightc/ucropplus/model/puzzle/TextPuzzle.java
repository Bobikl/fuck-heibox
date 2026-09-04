package com.starlightc.ucropplus.model.puzzle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import com.starlightc.ucropplus.model.RemoteTextRenderInfo;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TextPuzzle.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class TextPuzzle extends BasePuzzleInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private RemoteTextRenderInfo advance_typeface;

    @e
    private String can_change;

    @e
    private String text;

    @e
    private String textcolor;

    @e
    private String textsize;

    @e
    private String typeface_name;

    @e
    private String typeface_url;

    public TextPuzzle(@e String str, @e String str2, @e String str3, @e String str4, @e RemoteTextRenderInfo remoteTextRenderInfo, @e String str5, @e String str6) {
        super(null, null, null, null, 15, null);
        this.text = str;
        this.can_change = str2;
        this.textsize = str3;
        this.textcolor = str4;
        this.advance_typeface = remoteTextRenderInfo;
        this.typeface_name = str5;
        this.typeface_url = str6;
    }

    public static /* synthetic */ TextPuzzle copy$default(TextPuzzle textPuzzle, String str, String str2, String str3, String str4, RemoteTextRenderInfo remoteTextRenderInfo, String str5, String str6, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{textPuzzle, str, str2, str3, str4, remoteTextRenderInfo, str5, str6, new Integer(i10), obj}, null, changeQuickRedirect, true, 50205, new Class[]{TextPuzzle.class, String.class, String.class, String.class, String.class, RemoteTextRenderInfo.class, String.class, String.class, Integer.TYPE, Object.class}, TextPuzzle.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextPuzzle) patchProxyResultProxy.result;
        }
        return textPuzzle.copy((i10 & 1) != 0 ? textPuzzle.text : str, (i10 & 2) != 0 ? textPuzzle.can_change : str2, (i10 & 4) != 0 ? textPuzzle.textsize : str3, (i10 & 8) != 0 ? textPuzzle.textcolor : str4, (i10 & 16) != 0 ? textPuzzle.advance_typeface : remoteTextRenderInfo, (i10 & 32) != 0 ? textPuzzle.typeface_name : str5, (i10 & 64) != 0 ? textPuzzle.typeface_url : str6);
    }

    @e
    public final String component1() {
        return this.text;
    }

    @e
    public final String component2() {
        return this.can_change;
    }

    @e
    public final String component3() {
        return this.textsize;
    }

    @e
    public final String component4() {
        return this.textcolor;
    }

    @e
    public final RemoteTextRenderInfo component5() {
        return this.advance_typeface;
    }

    @e
    public final String component6() {
        return this.typeface_name;
    }

    @e
    public final String component7() {
        return this.typeface_url;
    }

    @d
    public final TextPuzzle copy(@e String str, @e String str2, @e String str3, @e String str4, @e RemoteTextRenderInfo remoteTextRenderInfo, @e String str5, @e String str6) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, remoteTextRenderInfo, str5, str6}, this, changeQuickRedirect, false, 50204, new Class[]{String.class, String.class, String.class, String.class, RemoteTextRenderInfo.class, String.class, String.class}, TextPuzzle.class);
        return patchProxyResultProxy.isSupported ? (TextPuzzle) patchProxyResultProxy.result : new TextPuzzle(str, str2, str3, str4, remoteTextRenderInfo, str5, str6);
    }

    @Override // com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50203, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TextPuzzle)) {
            return false;
        }
        TextPuzzle textPuzzle = (TextPuzzle) obj;
        if (f0.g(textPuzzle.text, this.text) && f0.g(textPuzzle.can_change, this.can_change) && f0.g(textPuzzle.textsize, this.textsize) && f0.g(textPuzzle.textcolor, this.textcolor) && f0.g(textPuzzle.advance_typeface, this.advance_typeface) && f0.g(textPuzzle.typeface_name, this.typeface_name)) {
            return super.equals(obj);
        }
        return false;
    }

    @e
    public final RemoteTextRenderInfo getAdvance_typeface() {
        return this.advance_typeface;
    }

    @e
    public final String getCan_change() {
        return this.can_change;
    }

    @e
    public final String getText() {
        return this.text;
    }

    @e
    public final String getTextcolor() {
        return this.textcolor;
    }

    @e
    public final String getTextsize() {
        return this.textsize;
    }

    @e
    public final String getTypeface_name() {
        return this.typeface_name;
    }

    @e
    public final String getTypeface_url() {
        return this.typeface_url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50207, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.text;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.can_change;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.textsize;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.textcolor;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        RemoteTextRenderInfo remoteTextRenderInfo = this.advance_typeface;
        int iHashCode5 = (iHashCode4 + (remoteTextRenderInfo == null ? 0 : remoteTextRenderInfo.hashCode())) * 31;
        String str5 = this.typeface_name;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.typeface_url;
        return iHashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setAdvance_typeface(@e RemoteTextRenderInfo remoteTextRenderInfo) {
        this.advance_typeface = remoteTextRenderInfo;
    }

    public final void setCan_change(@e String str) {
        this.can_change = str;
    }

    public final void setText(@e String str) {
        this.text = str;
    }

    public final void setTextcolor(@e String str) {
        this.textcolor = str;
    }

    public final void setTextsize(@e String str) {
        this.textsize = str;
    }

    public final void setTypeface_name(@e String str) {
        this.typeface_name = str;
    }

    public final void setTypeface_url(@e String str) {
        this.typeface_url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50206, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TextPuzzle(text=" + this.text + ", can_change=" + this.can_change + ", textsize=" + this.textsize + ", textcolor=" + this.textcolor + ", advance_typeface=" + this.advance_typeface + ", typeface_name=" + this.typeface_name + ", typeface_url=" + this.typeface_url + ')';
    }
}
