package com.starlightc.ucropplus.model.puzzle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: StaticPicturePuzzle.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class StaticPicturePuzzle extends BasePuzzleInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String path;

    @e
    private String radius;

    @e
    private String url;

    public StaticPicturePuzzle(@e String str, @e String str2, @e String str3) {
        super(null, null, null, null, 15, null);
        this.url = str;
        this.radius = str2;
        this.path = str3;
    }

    public static /* synthetic */ StaticPicturePuzzle copy$default(StaticPicturePuzzle staticPicturePuzzle, String str, String str2, String str3, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{staticPicturePuzzle, str, str2, str3, new Integer(i10), obj}, null, changeQuickRedirect, true, 50200, new Class[]{StaticPicturePuzzle.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, StaticPicturePuzzle.class);
        if (patchProxyResultProxy.isSupported) {
            return (StaticPicturePuzzle) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = staticPicturePuzzle.url;
        }
        if ((i10 & 2) != 0) {
            str2 = staticPicturePuzzle.radius;
        }
        if ((i10 & 4) != 0) {
            str3 = staticPicturePuzzle.path;
        }
        return staticPicturePuzzle.copy(str, str2, str3);
    }

    @e
    public final String component1() {
        return this.url;
    }

    @e
    public final String component2() {
        return this.radius;
    }

    @e
    public final String component3() {
        return this.path;
    }

    @d
    public final StaticPicturePuzzle copy(@e String str, @e String str2, @e String str3) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3}, this, changeQuickRedirect, false, 50199, new Class[]{String.class, String.class, String.class}, StaticPicturePuzzle.class);
        return patchProxyResultProxy.isSupported ? (StaticPicturePuzzle) patchProxyResultProxy.result : new StaticPicturePuzzle(str, str2, str3);
    }

    @Override // com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50198, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StaticPicturePuzzle)) {
            return false;
        }
        StaticPicturePuzzle staticPicturePuzzle = (StaticPicturePuzzle) obj;
        if (f0.g(staticPicturePuzzle.radius, this.radius) && f0.g(staticPicturePuzzle.url, this.url) && f0.g(staticPicturePuzzle.path, this.path)) {
            return super.equals(obj);
        }
        return false;
    }

    @e
    public final String getPath() {
        return this.path;
    }

    @e
    public final String getRadius() {
        return this.radius;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50202, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.url;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.radius;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.path;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final void setPath(@e String str) {
        this.path = str;
    }

    public final void setRadius(@e String str) {
        this.radius = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50201, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "StaticPicturePuzzle(url=" + this.url + ", radius=" + this.radius + ", path=" + this.path + ')';
    }
}
