package com.max.xiaoheihe.bean.story;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: StoryModeListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class VideoInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String cover;

    @e
    private String duration;
    private int height;

    @e
    private String play_url;
    private int width;

    public VideoInfoObj() {
        this(null, 0, null, null, 0, 31, null);
    }

    public VideoInfoObj(@e String str, int i10, @e String str2, @e String str3, int i11) {
        this.duration = str;
        this.width = i10;
        this.play_url = str2;
        this.cover = str3;
        this.height = i11;
    }

    public /* synthetic */ VideoInfoObj(String str, int i10, String str2, String str3, int i11, int i12, u uVar) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? 0 : i10, (i12 & 4) != 0 ? null : str2, (i12 & 8) == 0 ? str3 : null, (i12 & 16) != 0 ? 0 : i11);
    }

    public static /* synthetic */ VideoInfoObj copy$default(VideoInfoObj videoInfoObj, String str, int i10, String str2, String str3, int i11, int i12, Object obj) {
        int i13 = i10;
        int i14 = i11;
        Object[] objArr = {videoInfoObj, str, new Integer(i13), str2, str3, new Integer(i14), new Integer(i12), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 15988, new Class[]{VideoInfoObj.class, String.class, cls, String.class, String.class, cls, cls, Object.class}, VideoInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (VideoInfoObj) patchProxyResultProxy.result;
        }
        String str4 = (i12 & 1) != 0 ? videoInfoObj.duration : str;
        if ((i12 & 2) != 0) {
            i13 = videoInfoObj.width;
        }
        String str5 = (i12 & 4) != 0 ? videoInfoObj.play_url : str2;
        String str6 = (i12 & 8) != 0 ? videoInfoObj.cover : str3;
        if ((i12 & 16) != 0) {
            i14 = videoInfoObj.height;
        }
        return videoInfoObj.copy(str4, i13, str5, str6, i14);
    }

    @e
    public final String component1() {
        return this.duration;
    }

    public final int component2() {
        return this.width;
    }

    @e
    public final String component3() {
        return this.play_url;
    }

    @e
    public final String component4() {
        return this.cover;
    }

    public final int component5() {
        return this.height;
    }

    @d
    public final VideoInfoObj copy(@e String str, int i10, @e String str2, @e String str3, int i11) {
        Object[] objArr = {str, new Integer(i10), str2, str3, new Integer(i11)};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, this, changeQuickRedirect2, false, 15987, new Class[]{String.class, cls, String.class, String.class, cls}, VideoInfoObj.class);
        return patchProxyResultProxy.isSupported ? (VideoInfoObj) patchProxyResultProxy.result : new VideoInfoObj(str, i10, str2, str3, i11);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15991, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VideoInfoObj)) {
            return false;
        }
        VideoInfoObj videoInfoObj = (VideoInfoObj) obj;
        return f0.g(this.duration, videoInfoObj.duration) && this.width == videoInfoObj.width && f0.g(this.play_url, videoInfoObj.play_url) && f0.g(this.cover, videoInfoObj.cover) && this.height == videoInfoObj.height;
    }

    @e
    public final String getCover() {
        return this.cover;
    }

    @e
    public final String getDuration() {
        return this.duration;
    }

    public final int getHeight() {
        return this.height;
    }

    @e
    public final String getPlay_url() {
        return this.play_url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15990, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.duration;
        int iHashCode = (((str == null ? 0 : str.hashCode()) * 31) + this.width) * 31;
        String str2 = this.play_url;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.cover;
        return ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + this.height;
    }

    public final void setCover(@e String str) {
        this.cover = str;
    }

    public final void setDuration(@e String str) {
        this.duration = str;
    }

    public final void setHeight(int i10) {
        this.height = i10;
    }

    public final void setPlay_url(@e String str) {
        this.play_url = str;
    }

    public final void setWidth(int i10) {
        this.width = i10;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15989, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "VideoInfoObj(duration=" + this.duration + ", width=" + this.width + ", play_url=" + this.play_url + ", cover=" + this.cover + ", height=" + this.height + ')';
    }
}
