package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.utils.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: PlatformCardBgObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PlatformCardBgObj implements Serializable {
    public static final float DEFAULT_PLATFORM_HEIGHT = 150.0f;
    public static final float DEFAULT_PLATFORM_HIGH_HEIGHT = 168.0f;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String bgUrl;

    @e
    private String bgVideoUrl;

    @e
    private String maskUrl;

    @d
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private int bgDrawableResourceId = -1;
    private int maskDrawableResourceId = -1;
    private int defaultBgResourceId = -1;
    private int defaultMaskResourceId = -1;
    private float height = 150.0f;

    /* JADX INFO: compiled from: PlatformCardBgObj.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13912, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlatformCardBgObj)) {
            return false;
        }
        PlatformCardBgObj platformCardBgObj = (PlatformCardBgObj) obj;
        if (f0.g(this.bgUrl, platformCardBgObj.bgUrl) && f0.g(this.bgVideoUrl, platformCardBgObj.bgVideoUrl) && this.bgDrawableResourceId == platformCardBgObj.bgDrawableResourceId && f0.g(this.maskUrl, platformCardBgObj.maskUrl) && this.maskDrawableResourceId == platformCardBgObj.maskDrawableResourceId && this.defaultBgResourceId == platformCardBgObj.defaultBgResourceId && this.defaultMaskResourceId == platformCardBgObj.defaultMaskResourceId) {
            if (this.height == platformCardBgObj.height) {
                return true;
            }
        }
        return false;
    }

    public final int getBgDrawableResourceId() {
        return this.bgDrawableResourceId;
    }

    @e
    public final String getBgUrl() {
        return this.bgUrl;
    }

    @e
    public final String getBgVideoUrl() {
        return this.bgVideoUrl;
    }

    public final int getDefaultBgResourceId() {
        return this.defaultBgResourceId;
    }

    public final int getDefaultMaskResourceId() {
        return this.defaultMaskResourceId;
    }

    public final float getHeight() {
        return this.height;
    }

    public final int getMaskDrawableResourceId() {
        return this.maskDrawableResourceId;
    }

    @e
    public final String getMaskUrl() {
        return this.maskUrl;
    }

    public final boolean hasBg() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13907, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return hasBgUrl() || hasBgResourceId() || this.defaultBgResourceId != -1;
    }

    public final boolean hasBgResourceId() {
        return this.bgDrawableResourceId != -1;
    }

    public final boolean hasBgUrl() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13909, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !c.u(this.bgUrl);
    }

    public final boolean hasBgVideoUrl() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13910, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !c.u(this.bgVideoUrl);
    }

    public final boolean hasMask() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13908, new Class[0], Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        return hasMaskUrl() || hasMaskResourceId() || this.defaultMaskResourceId != -1;
    }

    public final boolean hasMaskResourceId() {
        return this.maskDrawableResourceId != -1;
    }

    public final boolean hasMaskUrl() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13911, new Class[0], Boolean.TYPE);
        return patchProxyResultProxy.isSupported ? ((Boolean) patchProxyResultProxy.result).booleanValue() : !c.u(this.maskUrl);
    }

    public final void setBgDrawableResourceId(int i10) {
        this.bgDrawableResourceId = i10;
    }

    public final void setBgUrl(@e String str) {
        this.bgUrl = str;
    }

    public final void setBgVideoUrl(@e String str) {
        this.bgVideoUrl = str;
    }

    public final void setDefaultBgResourceId(int i10) {
        this.defaultBgResourceId = i10;
    }

    public final void setDefaultMaskResourceId(int i10) {
        this.defaultMaskResourceId = i10;
    }

    public final void setHeight(float f10) {
        this.height = f10;
    }

    public final void setMaskDrawableResourceId(int i10) {
        this.maskDrawableResourceId = i10;
    }

    public final void setMaskUrl(@e String str) {
        this.maskUrl = str;
    }
}
