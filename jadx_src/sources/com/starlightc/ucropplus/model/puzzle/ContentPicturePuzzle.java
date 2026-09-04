package com.starlightc.ucropplus.model.puzzle;

import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ContentPicturePuzzle.kt */
/* JADX INFO: loaded from: classes4.dex */
public final class ContentPicturePuzzle extends BasePuzzleInfo {
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String radius;

    public ContentPicturePuzzle(@e String str) {
        super(null, null, null, null, 15, null);
        this.radius = str;
    }

    public static /* synthetic */ ContentPicturePuzzle copy$default(ContentPicturePuzzle contentPicturePuzzle, String str, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{contentPicturePuzzle, str, new Integer(i10), obj}, null, changeQuickRedirect, true, 50171, new Class[]{ContentPicturePuzzle.class, String.class, Integer.TYPE, Object.class}, ContentPicturePuzzle.class);
        if (patchProxyResultProxy.isSupported) {
            return (ContentPicturePuzzle) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = contentPicturePuzzle.radius;
        }
        return contentPicturePuzzle.copy(str);
    }

    @e
    public final String component1() {
        return this.radius;
    }

    @d
    public final ContentPicturePuzzle copy(@e String str) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 50170, new Class[]{String.class}, ContentPicturePuzzle.class);
        return patchProxyResultProxy.isSupported ? (ContentPicturePuzzle) patchProxyResultProxy.result : new ContentPicturePuzzle(str);
    }

    @Override // com.starlightc.ucropplus.model.puzzle.BasePuzzleInfo
    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 50169, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if ((obj instanceof ContentPicturePuzzle) && f0.g(((ContentPicturePuzzle) obj).radius, this.radius)) {
            return super.equals(obj);
        }
        return false;
    }

    @e
    public final String getRadius() {
        return this.radius;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50173, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.radius;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final void setRadius(@e String str) {
        this.radius = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 50172, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ContentPicturePuzzle(radius=" + this.radius + ')';
    }
}
