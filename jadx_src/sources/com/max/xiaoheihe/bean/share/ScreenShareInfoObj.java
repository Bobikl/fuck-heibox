package com.max.xiaoheihe.bean.share;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ScreenShareInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ScreenShareInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private DouYinConfig douyin_config;

    @e
    private PostConfigObj post_config;

    @e
    private ScreenReportObj report;

    @e
    private String save_to_disk;

    public ScreenShareInfoObj(@e PostConfigObj postConfigObj, @e String str, @e DouYinConfig douYinConfig, @e ScreenReportObj screenReportObj) {
        this.post_config = postConfigObj;
        this.save_to_disk = str;
        this.douyin_config = douYinConfig;
        this.report = screenReportObj;
    }

    public static /* synthetic */ ScreenShareInfoObj copy$default(ScreenShareInfoObj screenShareInfoObj, PostConfigObj postConfigObj, String str, DouYinConfig douYinConfig, ScreenReportObj screenReportObj, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{screenShareInfoObj, postConfigObj, str, douYinConfig, screenReportObj, new Integer(i10), obj}, null, changeQuickRedirect, true, 15918, new Class[]{ScreenShareInfoObj.class, PostConfigObj.class, String.class, DouYinConfig.class, ScreenReportObj.class, Integer.TYPE, Object.class}, ScreenShareInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ScreenShareInfoObj) patchProxyResultProxy.result;
        }
        return screenShareInfoObj.copy((i10 & 1) != 0 ? screenShareInfoObj.post_config : postConfigObj, (i10 & 2) != 0 ? screenShareInfoObj.save_to_disk : str, (i10 & 4) != 0 ? screenShareInfoObj.douyin_config : douYinConfig, (i10 & 8) != 0 ? screenShareInfoObj.report : screenReportObj);
    }

    @e
    public final PostConfigObj component1() {
        return this.post_config;
    }

    @e
    public final String component2() {
        return this.save_to_disk;
    }

    @e
    public final DouYinConfig component3() {
        return this.douyin_config;
    }

    @e
    public final ScreenReportObj component4() {
        return this.report;
    }

    @d
    public final ScreenShareInfoObj copy(@e PostConfigObj postConfigObj, @e String str, @e DouYinConfig douYinConfig, @e ScreenReportObj screenReportObj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postConfigObj, str, douYinConfig, screenReportObj}, this, changeQuickRedirect, false, 15917, new Class[]{PostConfigObj.class, String.class, DouYinConfig.class, ScreenReportObj.class}, ScreenShareInfoObj.class);
        return patchProxyResultProxy.isSupported ? (ScreenShareInfoObj) patchProxyResultProxy.result : new ScreenShareInfoObj(postConfigObj, str, douYinConfig, screenReportObj);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15921, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenShareInfoObj)) {
            return false;
        }
        ScreenShareInfoObj screenShareInfoObj = (ScreenShareInfoObj) obj;
        return f0.g(this.post_config, screenShareInfoObj.post_config) && f0.g(this.save_to_disk, screenShareInfoObj.save_to_disk) && f0.g(this.douyin_config, screenShareInfoObj.douyin_config) && f0.g(this.report, screenShareInfoObj.report);
    }

    @e
    public final DouYinConfig getDouyin_config() {
        return this.douyin_config;
    }

    @e
    public final PostConfigObj getPost_config() {
        return this.post_config;
    }

    @e
    public final ScreenReportObj getReport() {
        return this.report;
    }

    @e
    public final String getSave_to_disk() {
        return this.save_to_disk;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15920, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        PostConfigObj postConfigObj = this.post_config;
        int iHashCode = (postConfigObj == null ? 0 : postConfigObj.hashCode()) * 31;
        String str = this.save_to_disk;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        DouYinConfig douYinConfig = this.douyin_config;
        int iHashCode3 = (iHashCode2 + (douYinConfig == null ? 0 : douYinConfig.hashCode())) * 31;
        ScreenReportObj screenReportObj = this.report;
        return iHashCode3 + (screenReportObj != null ? screenReportObj.hashCode() : 0);
    }

    public final void setDouyin_config(@e DouYinConfig douYinConfig) {
        this.douyin_config = douYinConfig;
    }

    public final void setPost_config(@e PostConfigObj postConfigObj) {
        this.post_config = postConfigObj;
    }

    public final void setReport(@e ScreenReportObj screenReportObj) {
        this.report = screenReportObj;
    }

    public final void setSave_to_disk(@e String str) {
        this.save_to_disk = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15919, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ScreenShareInfoObj(post_config=" + this.post_config + ", save_to_disk=" + this.save_to_disk + ", douyin_config=" + this.douyin_config + ", report=" + this.report + ')';
    }
}
