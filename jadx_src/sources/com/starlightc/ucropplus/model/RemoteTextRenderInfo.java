package com.starlightc.ucropplus.model;

import androidx.compose.foundation.b0;
import com.max.hbcommon.utils.c;
import com.max.hbcommon.utils.l;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: RemoteTextRenderInfo.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class RemoteTextRenderInfo implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private int f98059id;
    private boolean is_remote_typeface;

    @e
    private String shadow_color;
    private boolean shadow_enable;
    private float shadow_offset_x;
    private float shadow_offset_y;

    @e
    private ArrayList<StrokeObj> stroke_list;

    @e
    private String text_color;
    private float text_size;

    @e
    private String typeface;

    @e
    private String typeface_name;

    public RemoteTextRenderInfo(@e String str, boolean z10, float f10, float f11, @e ArrayList<StrokeObj> arrayList, int i10, @e String str2, float f12, @e String str3, @e String str4, boolean z11) {
        this.shadow_color = str;
        this.shadow_enable = z10;
        this.shadow_offset_x = f10;
        this.shadow_offset_y = f11;
        this.stroke_list = arrayList;
        this.f98059id = i10;
        this.text_color = str2;
        this.text_size = f12;
        this.typeface = str3;
        this.typeface_name = str4;
        this.is_remote_typeface = z11;
    }

    public /* synthetic */ RemoteTextRenderInfo(String str, boolean z10, float f10, float f11, ArrayList arrayList, int i10, String str2, float f12, String str3, String str4, boolean z11, int i11, u uVar) {
        this(str, (i11 & 2) != 0 ? false : z10, (i11 & 4) != 0 ? 0.0f : f10, (i11 & 8) != 0 ? 0.0f : f11, (i11 & 16) != 0 ? null : arrayList, (i11 & 32) != 0 ? 0 : i10, str2, (i11 & 128) != 0 ? 15.0f : f12, (i11 & 256) != 0 ? null : str3, (i11 & 512) != 0 ? null : str4, (i11 & 1024) != 0 ? false : z11);
    }

    public static /* synthetic */ RemoteTextRenderInfo copy$default(RemoteTextRenderInfo remoteTextRenderInfo, String str, boolean z10, float f10, float f11, ArrayList arrayList, int i10, String str2, float f12, String str3, String str4, boolean z11, int i11, Object obj) {
        Object[] objArr = {remoteTextRenderInfo, str, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Float(f11), arrayList, new Integer(i10), str2, new Float(f12), str3, str4, new Byte(z11 ? (byte) 1 : (byte) 0), new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        Class cls2 = Float.TYPE;
        Class cls3 = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 50091, new Class[]{RemoteTextRenderInfo.class, String.class, cls, cls2, cls2, ArrayList.class, cls3, String.class, cls2, String.class, String.class, cls, cls3, Object.class}, RemoteTextRenderInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (RemoteTextRenderInfo) patchProxyResultProxy.result;
        }
        return remoteTextRenderInfo.copy((i11 & 1) != 0 ? remoteTextRenderInfo.shadow_color : str, (i11 & 2) != 0 ? remoteTextRenderInfo.shadow_enable : z10 ? 1 : 0, (i11 & 4) != 0 ? remoteTextRenderInfo.shadow_offset_x : f10, (i11 & 8) != 0 ? remoteTextRenderInfo.shadow_offset_y : f11, (i11 & 16) != 0 ? remoteTextRenderInfo.stroke_list : arrayList, (i11 & 32) != 0 ? remoteTextRenderInfo.f98059id : i10, (i11 & 64) != 0 ? remoteTextRenderInfo.text_color : str2, (i11 & 128) != 0 ? remoteTextRenderInfo.text_size : f12, (i11 & 256) != 0 ? remoteTextRenderInfo.typeface : str3, (i11 & 512) != 0 ? remoteTextRenderInfo.typeface_name : str4, (i11 & 1024) != 0 ? remoteTextRenderInfo.is_remote_typeface : z11 ? 1 : 0);
    }

    @e
    public final String component1() {
        return this.shadow_color;
    }

    @e
    public final String component10() {
        return this.typeface_name;
    }

    public final boolean component11() {
        return this.is_remote_typeface;
    }

    public final boolean component2() {
        return this.shadow_enable;
    }

    public final float component3() {
        return this.shadow_offset_x;
    }

    public final float component4() {
        return this.shadow_offset_y;
    }

    @e
    public final ArrayList<StrokeObj> component5() {
        return this.stroke_list;
    }

    public final int component6() {
        return this.f98059id;
    }

    @e
    public final String component7() {
        return this.text_color;
    }

    public final float component8() {
        return this.text_size;
    }

    @e
    public final String component9() {
        return this.typeface;
    }

    @d
    public final RemoteTextRenderInfo copy(@e String str, boolean z10, float f10, float f11, @e ArrayList<StrokeObj> arrayList, int i10, @e String str2, float f12, @e String str3, @e String str4, boolean z11) {
        Object[] objArr = {str, new Byte(z10 ? (byte) 1 : (byte) 0), new Float(f10), new Float(f11), arrayList, new Integer(i10), str2, new Float(f12), str3, str4, new Byte(z11 ? (byte) 1 : (byte) 0)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Boolean.TYPE;
        Class cls2 = Float.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 50090, new Class[]{String.class, cls, cls2, cls2, ArrayList.class, Integer.TYPE, String.class, cls2, String.class, String.class, cls}, RemoteTextRenderInfo.class);
        return patchProxyResultProxy.isSupported ? (RemoteTextRenderInfo) patchProxyResultProxy.result : new RemoteTextRenderInfo(str, z10, f10, f11, arrayList, i10, str2, f12, str3, str4, z11);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50089, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoteTextRenderInfo)) {
            return false;
        }
        RemoteTextRenderInfo remoteTextRenderInfo = (RemoteTextRenderInfo) obj;
        if (!f0.g(remoteTextRenderInfo.shadow_color, this.shadow_color) || remoteTextRenderInfo.shadow_enable != this.shadow_enable) {
            return false;
        }
        if (!(remoteTextRenderInfo.shadow_offset_x == this.shadow_offset_x)) {
            return false;
        }
        if (!(remoteTextRenderInfo.shadow_offset_y == this.shadow_offset_y) || c.y(remoteTextRenderInfo.stroke_list, this.stroke_list) || remoteTextRenderInfo.f98059id != this.f98059id || !f0.g(remoteTextRenderInfo.text_color, this.text_color)) {
            return false;
        }
        if ((remoteTextRenderInfo.text_size == this.text_size) && f0.g(remoteTextRenderInfo.typeface, this.typeface) && f0.g(remoteTextRenderInfo.typeface_name, this.typeface_name) && remoteTextRenderInfo.is_remote_typeface == this.is_remote_typeface) {
            return super.equals(obj);
        }
        return false;
    }

    public final int getId() {
        return this.f98059id;
    }

    @e
    public final String getShadow_color() {
        return this.shadow_color;
    }

    public final boolean getShadow_enable() {
        return this.shadow_enable;
    }

    public final float getShadow_offset_x() {
        return this.shadow_offset_x;
    }

    public final float getShadow_offset_y() {
        return this.shadow_offset_y;
    }

    @e
    public final ArrayList<StrokeObj> getStroke_list() {
        return this.stroke_list;
    }

    @e
    public final String getText_color() {
        return this.text_color;
    }

    public final float getText_size() {
        return this.text_size;
    }

    @e
    public final String getTypeface() {
        return this.typeface;
    }

    @e
    public final String getTypeface_name() {
        return this.typeface_name;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50093, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.shadow_color;
        int iHashCode = (((((((str == null ? 0 : str.hashCode()) * 31) + b0.a(this.shadow_enable)) * 31) + Float.floatToIntBits(this.shadow_offset_x)) * 31) + Float.floatToIntBits(this.shadow_offset_y)) * 31;
        ArrayList<StrokeObj> arrayList = this.stroke_list;
        int iHashCode2 = (((iHashCode + (arrayList == null ? 0 : arrayList.hashCode())) * 31) + this.f98059id) * 31;
        String str2 = this.text_color;
        int iHashCode3 = (((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31) + Float.floatToIntBits(this.text_size)) * 31;
        String str3 = this.typeface;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.typeface_name;
        return ((iHashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31) + b0.a(this.is_remote_typeface);
    }

    public final boolean is_remote_typeface() {
        return this.is_remote_typeface;
    }

    public final void setId(int i10) {
        this.f98059id = i10;
    }

    public final void setShadow_color(@e String str) {
        this.shadow_color = str;
    }

    public final void setShadow_enable(boolean z10) {
        this.shadow_enable = z10;
    }

    public final void setShadow_offset_x(float f10) {
        this.shadow_offset_x = f10;
    }

    public final void setShadow_offset_y(float f10) {
        this.shadow_offset_y = f10;
    }

    public final void setStroke_list(@e ArrayList<StrokeObj> arrayList) {
        this.stroke_list = arrayList;
    }

    public final void setText_color(@e String str) {
        this.text_color = str;
    }

    public final void setText_size(float f10) {
        this.text_size = f10;
    }

    public final void setTypeface(@e String str) {
        this.typeface = str;
    }

    public final void setTypeface_name(@e String str) {
        this.typeface_name = str;
    }

    public final void set_remote_typeface(boolean z10) {
        this.is_remote_typeface = z10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50092, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "RemoteTextRenderInfo(shadow_color=" + this.shadow_color + ", shadow_enable=" + this.shadow_enable + ", shadow_offset_x=" + this.shadow_offset_x + ", shadow_offset_y=" + this.shadow_offset_y + ", stroke_list=" + this.stroke_list + ", id=" + this.f98059id + ", text_color=" + this.text_color + ", text_size=" + this.text_size + ", typeface=" + this.typeface + ", typeface_name=" + this.typeface_name + ", is_remote_typeface=" + this.is_remote_typeface + ')';
    }

    @d
    public final TextRenderInfo toTextRenderInfo() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50088, new Class[0], TextRenderInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (TextRenderInfo) patchProxyResultProxy.result;
        }
        TextRenderInfo textRenderInfo = new TextRenderInfo(0, false, 0.0f, 0.0f, null, 0, 0, 0.0f, null, null, false, null, false, 8191, null);
        if (!c.u(this.shadow_color)) {
            textRenderInfo.setShadowColor(l.g(this.shadow_color));
        }
        textRenderInfo.setShadowEnable(this.shadow_enable);
        textRenderInfo.setShadowOffsetX(this.shadow_offset_x);
        textRenderInfo.setShadowOffsetY(this.shadow_offset_y);
        textRenderInfo.setStrokeList(this.stroke_list);
        if (!c.u(this.text_color)) {
            textRenderInfo.setTextColor(l.g(this.text_color));
        }
        textRenderInfo.setTextSize(this.text_size);
        textRenderInfo.setRemoteTypeface(true);
        textRenderInfo.setUseRate(true);
        return textRenderInfo;
    }
}
