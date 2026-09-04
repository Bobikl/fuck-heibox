package com.max.commentimagepainter.sharecard.bean;

import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: CmCardsObj.kt */
/* JADX INFO: loaded from: classes8.dex */
public final class LevelInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Integer level;

    public LevelInfoObj(@e Integer num) {
        this.level = num;
    }

    public static /* synthetic */ LevelInfoObj copy$default(LevelInfoObj levelInfoObj, Integer num, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{levelInfoObj, num, new Integer(i10), obj}, null, changeQuickRedirect, true, c.b.Sj, new Class[]{LevelInfoObj.class, Integer.class, Integer.TYPE, Object.class}, LevelInfoObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (LevelInfoObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            num = levelInfoObj.level;
        }
        return levelInfoObj.copy(num);
    }

    @e
    public final Integer component1() {
        return this.level;
    }

    @d
    public final LevelInfoObj copy(@e Integer num) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{num}, this, changeQuickRedirect, false, c.b.Rj, new Class[]{Integer.class}, LevelInfoObj.class);
        return patchProxyResultProxy.isSupported ? (LevelInfoObj) patchProxyResultProxy.result : new LevelInfoObj(num);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.b.Vj, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        return (obj instanceof LevelInfoObj) && f0.g(this.level, ((LevelInfoObj) obj).level);
    }

    @e
    public final Integer getLevel() {
        return this.level;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Uj, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Integer num = this.level;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final void setLevel(@e Integer num) {
        this.level = num;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.b.Tj, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "LevelInfoObj(level=" + this.level + ')';
    }
}
