package com.max.xiaoheihe.bean.game;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ScreenshotInfoObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ScreenshotInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private List<GameScreenPicShotObj> screenshots;

    @e
    private String total;

    public ScreenshotInfoObj(@e String str, @e List<GameScreenPicShotObj> list) {
        this.total = str;
        this.screenshots = list;
    }

    public static /* synthetic */ ScreenshotInfoObj copy$default(ScreenshotInfoObj screenshotInfoObj, String str, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{screenshotInfoObj, str, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 14994, new Class[]{ScreenshotInfoObj.class, String.class, List.class, Integer.TYPE, Object.class}, ScreenshotInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ScreenshotInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = screenshotInfoObj.total;
        }
        if ((i10 & 2) != 0) {
            list = screenshotInfoObj.screenshots;
        }
        return screenshotInfoObj.copy(str, list);
    }

    @e
    public final String component1() {
        return this.total;
    }

    @e
    public final List<GameScreenPicShotObj> component2() {
        return this.screenshots;
    }

    @d
    public final ScreenshotInfoObj copy(@e String str, @e List<GameScreenPicShotObj> list) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, list}, this, changeQuickRedirect, false, 14993, new Class[]{String.class, List.class}, ScreenshotInfoObj.class);
        return patchProxyResultProxy.isSupported ? (ScreenshotInfoObj) patchProxyResultProxy.result : new ScreenshotInfoObj(str, list);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14997, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ScreenshotInfoObj)) {
            return false;
        }
        ScreenshotInfoObj screenshotInfoObj = (ScreenshotInfoObj) obj;
        return f0.g(this.total, screenshotInfoObj.total) && f0.g(this.screenshots, screenshotInfoObj.screenshots);
    }

    @e
    public final List<GameScreenPicShotObj> getScreenshots() {
        return this.screenshots;
    }

    @e
    public final String getTotal() {
        return this.total;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14996, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.total;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<GameScreenPicShotObj> list = this.screenshots;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    public final void setScreenshots(@e List<GameScreenPicShotObj> list) {
        this.screenshots = list;
    }

    public final void setTotal(@e String str) {
        this.total = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14995, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ScreenshotInfoObj(total=" + this.total + ", screenshots=" + this.screenshots + ')';
    }
}
