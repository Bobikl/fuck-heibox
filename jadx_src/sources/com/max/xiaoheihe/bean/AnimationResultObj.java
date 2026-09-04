package com.max.xiaoheihe.bean;

import androidx.compose.runtime.internal.o;
import bb.c;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: AnimationResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class AnimationResultObj implements Serializable {

    @d
    public static final String SOURCE_TYPE_DOT_JSON = "dot_json";

    @d
    public static final String SOURCE_TYPE_DOT_LOTTIE = "dot_lottie";
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String md5;

    @e
    private String source_type;

    @e
    private String type;

    @e
    private String url;

    @d
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* JADX INFO: compiled from: AnimationResultObj.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(u uVar) {
            this();
        }
    }

    public AnimationResultObj(@e String str, @e String str2, @e String str3, @e String str4) {
        this.type = str;
        this.source_type = str2;
        this.url = str3;
        this.md5 = str4;
    }

    public static /* synthetic */ AnimationResultObj copy$default(AnimationResultObj animationResultObj, String str, String str2, String str3, String str4, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{animationResultObj, str, str2, str3, str4, new Integer(i10), obj}, null, changeQuickRedirect, true, c.m.wL, new Class[]{AnimationResultObj.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, AnimationResultObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (AnimationResultObj) patchProxyResultProxy.result;
        }
        return animationResultObj.copy((i10 & 1) != 0 ? animationResultObj.type : str, (i10 & 2) != 0 ? animationResultObj.source_type : str2, (i10 & 4) != 0 ? animationResultObj.url : str3, (i10 & 8) != 0 ? animationResultObj.md5 : str4);
    }

    @e
    public final String component1() {
        return this.type;
    }

    @e
    public final String component2() {
        return this.source_type;
    }

    @e
    public final String component3() {
        return this.url;
    }

    @e
    public final String component4() {
        return this.md5;
    }

    @d
    public final AnimationResultObj copy(@e String str, @e String str2, @e String str3, @e String str4) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, changeQuickRedirect, false, c.m.vL, new Class[]{String.class, String.class, String.class, String.class}, AnimationResultObj.class);
        return patchProxyResultProxy.isSupported ? (AnimationResultObj) patchProxyResultProxy.result : new AnimationResultObj(str, str2, str3, str4);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, c.m.uL, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!f0.g(AnimationResultObj.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        f0.n(obj, "null cannot be cast to non-null type com.max.xiaoheihe.bean.AnimationResultObj");
        return f0.g(this.type, ((AnimationResultObj) obj).type);
    }

    @e
    public final String getMd5() {
        return this.md5;
    }

    @e
    public final String getSource_type() {
        return this.source_type;
    }

    @e
    public final String getType() {
        return this.type;
    }

    @e
    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.yL, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.source_type;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.url;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.md5;
        return iHashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final void setMd5(@e String str) {
        this.md5 = str;
    }

    public final void setSource_type(@e String str) {
        this.source_type = str;
    }

    public final void setType(@e String str) {
        this.type = str;
    }

    public final void setUrl(@e String str) {
        this.url = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, c.m.xL, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "AnimationResultObj(type=" + this.type + ", source_type=" + this.source_type + ", url=" + this.url + ", md5=" + this.md5 + ')';
    }
}
