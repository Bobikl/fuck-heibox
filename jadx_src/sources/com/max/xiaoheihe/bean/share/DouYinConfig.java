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
public final class DouYinConfig implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String douyin_bg_url;

    @e
    private String douyin_hashtag;

    public DouYinConfig(@e String str, @e String str2) {
        this.douyin_hashtag = str;
        this.douyin_bg_url = str2;
    }

    public static /* synthetic */ DouYinConfig copy$default(DouYinConfig douYinConfig, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{douYinConfig, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 15898, new Class[]{DouYinConfig.class, String.class, String.class, Integer.TYPE, Object.class}, DouYinConfig.class);
        if (patchProxyResultProxy.isSupported) {
            return (DouYinConfig) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = douYinConfig.douyin_hashtag;
        }
        if ((i10 & 2) != 0) {
            str2 = douYinConfig.douyin_bg_url;
        }
        return douYinConfig.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.douyin_hashtag;
    }

    @e
    public final String component2() {
        return this.douyin_bg_url;
    }

    @d
    public final DouYinConfig copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 15897, new Class[]{String.class, String.class}, DouYinConfig.class);
        return patchProxyResultProxy.isSupported ? (DouYinConfig) patchProxyResultProxy.result : new DouYinConfig(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 15901, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DouYinConfig)) {
            return false;
        }
        DouYinConfig douYinConfig = (DouYinConfig) obj;
        return f0.g(this.douyin_hashtag, douYinConfig.douyin_hashtag) && f0.g(this.douyin_bg_url, douYinConfig.douyin_bg_url);
    }

    @e
    public final String getDouyin_bg_url() {
        return this.douyin_bg_url;
    }

    @e
    public final String getDouyin_hashtag() {
        return this.douyin_hashtag;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15900, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.douyin_hashtag;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.douyin_bg_url;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDouyin_bg_url(@e String str) {
        this.douyin_bg_url = str;
    }

    public final void setDouyin_hashtag(@e String str) {
        this.douyin_hashtag = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 15899, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "DouYinConfig(douyin_hashtag=" + this.douyin_hashtag + ", douyin_bg_url=" + this.douyin_bg_url + ')';
    }
}
