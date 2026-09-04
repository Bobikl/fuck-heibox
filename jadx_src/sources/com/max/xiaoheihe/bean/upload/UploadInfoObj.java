package com.max.xiaoheihe.bean.upload;

import androidx.compose.runtime.internal.o;
import com.max.xiaoheihe.bean.bbs.PostDataObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: UploadInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class UploadInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bucket;

    @e
    private String cosPath;

    @e
    private String key;

    @e
    private String path;
    private float progressPercent;

    @e
    private String scope;

    @e
    private UploadState status;

    @e
    private String type;

    @e
    private PostDataObj videoPostData;

    @e
    private String videoThumbPath;

    @e
    private String videoThumbUrl;

    public UploadInfoObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this(str, str2, str3, str4, null, null, null, null, 0.0f, null, null, 2016, null);
    }

    public UploadInfoObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e PostDataObj postDataObj, @e UploadState uploadState, float f10, @e String str7, @e String str8) {
        this.path = str;
        this.key = str2;
        this.type = str3;
        this.scope = str4;
        this.bucket = str5;
        this.cosPath = str6;
        this.videoPostData = postDataObj;
        this.status = uploadState;
        this.progressPercent = f10;
        this.videoThumbUrl = str7;
        this.videoThumbPath = str8;
    }

    public /* synthetic */ UploadInfoObj(String str, String str2, String str3, String str4, String str5, String str6, PostDataObj postDataObj, UploadState uploadState, float f10, String str7, String str8, int i10, u uVar) {
        this(str, str2, str3, str4, str5, (i10 & 32) != 0 ? null : str6, (i10 & 64) != 0 ? null : postDataObj, (i10 & 128) != 0 ? UploadState.NONE : uploadState, (i10 & 256) != 0 ? 0.0f : f10, (i10 & 512) != 0 ? null : str7, (i10 & 1024) != 0 ? null : str8);
    }

    public static /* synthetic */ UploadInfoObj copy$default(UploadInfoObj uploadInfoObj, String str, String str2, String str3, String str4, String str5, String str6, PostDataObj postDataObj, UploadState uploadState, float f10, String str7, String str8, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{uploadInfoObj, str, str2, str3, str4, str5, str6, postDataObj, uploadState, new Float(f10), str7, str8, new Integer(i10), obj}, null, changeQuickRedirect, true, 16222, new Class[]{UploadInfoObj.class, String.class, String.class, String.class, String.class, String.class, String.class, PostDataObj.class, UploadState.class, Float.TYPE, String.class, String.class, Integer.TYPE, Object.class}, UploadInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (UploadInfoObj) patchProxyResultProxy.result;
        }
        return uploadInfoObj.copy((i10 & 1) != 0 ? uploadInfoObj.path : str, (i10 & 2) != 0 ? uploadInfoObj.key : str2, (i10 & 4) != 0 ? uploadInfoObj.type : str3, (i10 & 8) != 0 ? uploadInfoObj.scope : str4, (i10 & 16) != 0 ? uploadInfoObj.bucket : str5, (i10 & 32) != 0 ? uploadInfoObj.cosPath : str6, (i10 & 64) != 0 ? uploadInfoObj.videoPostData : postDataObj, (i10 & 128) != 0 ? uploadInfoObj.status : uploadState, (i10 & 256) != 0 ? uploadInfoObj.progressPercent : f10, (i10 & 512) != 0 ? uploadInfoObj.videoThumbUrl : str7, (i10 & 1024) != 0 ? uploadInfoObj.videoThumbPath : str8);
    }

    @e
    public final String component1() {
        return this.path;
    }

    @e
    public final String component10() {
        return this.videoThumbUrl;
    }

    @e
    public final String component11() {
        return this.videoThumbPath;
    }

    @e
    public final String component2() {
        return this.key;
    }

    @e
    public final String component3() {
        return this.type;
    }

    @e
    public final String component4() {
        return this.scope;
    }

    @e
    public final String component5() {
        return this.bucket;
    }

    @e
    public final String component6() {
        return this.cosPath;
    }

    @e
    public final PostDataObj component7() {
        return this.videoPostData;
    }

    @e
    public final UploadState component8() {
        return this.status;
    }

    public final float component9() {
        return this.progressPercent;
    }

    @d
    public final UploadInfoObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5, @e String str6, @e PostDataObj postDataObj, @e UploadState uploadState, float f10, @e String str7, @e String str8) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, postDataObj, uploadState, new Float(f10), str7, str8}, this, changeQuickRedirect, false, 16221, new Class[]{String.class, String.class, String.class, String.class, String.class, String.class, PostDataObj.class, UploadState.class, Float.TYPE, String.class, String.class}, UploadInfoObj.class);
        return patchProxyResultProxy.isSupported ? (UploadInfoObj) patchProxyResultProxy.result : new UploadInfoObj(str, str2, str3, str4, str5, str6, postDataObj, uploadState, f10, str7, str8);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 16225, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UploadInfoObj)) {
            return false;
        }
        UploadInfoObj uploadInfoObj = (UploadInfoObj) obj;
        return f0.g(this.path, uploadInfoObj.path) && f0.g(this.key, uploadInfoObj.key) && f0.g(this.type, uploadInfoObj.type) && f0.g(this.scope, uploadInfoObj.scope) && f0.g(this.bucket, uploadInfoObj.bucket) && f0.g(this.cosPath, uploadInfoObj.cosPath) && f0.g(this.videoPostData, uploadInfoObj.videoPostData) && this.status == uploadInfoObj.status && Float.compare(this.progressPercent, uploadInfoObj.progressPercent) == 0 && f0.g(this.videoThumbUrl, uploadInfoObj.videoThumbUrl) && f0.g(this.videoThumbPath, uploadInfoObj.videoThumbPath);
    }

    @e
    public final String getBucket() {
        return this.bucket;
    }

    @e
    public final String getCosPath() {
        return this.cosPath;
    }

    @e
    public final String getKey() {
        return this.key;
    }

    @e
    public final String getPath() {
        return this.path;
    }

    public final float getProgressPercent() {
        return this.progressPercent;
    }

    @e
    public final String getScope() {
        return this.scope;
    }

    @e
    public final UploadState getStatus() {
        return this.status;
    }

    @e
    public final String getType() {
        return this.type;
    }

    @e
    public final PostDataObj getVideoPostData() {
        return this.videoPostData;
    }

    @e
    public final String getVideoThumbPath() {
        return this.videoThumbPath;
    }

    @e
    public final String getVideoThumbUrl() {
        return this.videoThumbUrl;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16224, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.path;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.key;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.type;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.scope;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.bucket;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.cosPath;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        PostDataObj postDataObj = this.videoPostData;
        int iHashCode7 = (iHashCode6 + (postDataObj == null ? 0 : postDataObj.hashCode())) * 31;
        UploadState uploadState = this.status;
        int iHashCode8 = (((iHashCode7 + (uploadState == null ? 0 : uploadState.hashCode())) * 31) + Float.floatToIntBits(this.progressPercent)) * 31;
        String str7 = this.videoThumbUrl;
        int iHashCode9 = (iHashCode8 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.videoThumbPath;
        return iHashCode9 + (str8 != null ? str8.hashCode() : 0);
    }

    public final void setBucket(@e String str) {
        this.bucket = str;
    }

    public final void setCosPath(@e String str) {
        this.cosPath = str;
    }

    public final void setKey(@e String str) {
        this.key = str;
    }

    public final void setPath(@e String str) {
        this.path = str;
    }

    public final void setProgressPercent(float f10) {
        this.progressPercent = f10;
    }

    public final void setScope(@e String str) {
        this.scope = str;
    }

    public final void setStatus(@e UploadState uploadState) {
        this.status = uploadState;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    public final void setVideoPostData(@e PostDataObj postDataObj) {
        this.videoPostData = postDataObj;
    }

    public final void setVideoThumbPath(@e String str) {
        this.videoThumbPath = str;
    }

    public final void setVideoThumbUrl(@e String str) {
        this.videoThumbUrl = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 16223, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "UploadInfoObj(path=" + this.path + ", key=" + this.key + ", type=" + this.type + ", scope=" + this.scope + ", bucket=" + this.bucket + ", cosPath=" + this.cosPath + ", videoPostData=" + this.videoPostData + ", status=" + this.status + ", progressPercent=" + this.progressPercent + ", videoThumbUrl=" + this.videoThumbUrl + ", videoThumbPath=" + this.videoThumbPath + ')';
    }
}
