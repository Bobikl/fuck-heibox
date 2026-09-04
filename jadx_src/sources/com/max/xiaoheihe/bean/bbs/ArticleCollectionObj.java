package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: ArticleCollection.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class ArticleCollectionObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String count;

    @e
    private String obj_id;

    @e
    private String priority;

    @e
    private String protocol;

    @e
    private String title;

    public ArticleCollectionObj(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        this.title = str;
        this.count = str2;
        this.priority = str3;
        this.protocol = str4;
        this.obj_id = str5;
    }

    public static /* synthetic */ ArticleCollectionObj copy$default(ArticleCollectionObj articleCollectionObj, String str, String str2, String str3, String str4, String str5, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{articleCollectionObj, str, str2, str3, str4, str5, new Integer(i10), obj}, null, changeQuickRedirect, true, 14157, new Class[]{ArticleCollectionObj.class, String.class, String.class, String.class, String.class, String.class, Integer.TYPE, Object.class}, ArticleCollectionObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (ArticleCollectionObj) patchProxyResultProxy.result;
        }
        return articleCollectionObj.copy((i10 & 1) != 0 ? articleCollectionObj.title : str, (i10 & 2) != 0 ? articleCollectionObj.count : str2, (i10 & 4) != 0 ? articleCollectionObj.priority : str3, (i10 & 8) != 0 ? articleCollectionObj.protocol : str4, (i10 & 16) != 0 ? articleCollectionObj.obj_id : str5);
    }

    @e
    public final String component1() {
        return this.title;
    }

    @e
    public final String component2() {
        return this.count;
    }

    @e
    public final String component3() {
        return this.priority;
    }

    @e
    public final String component4() {
        return this.protocol;
    }

    @e
    public final String component5() {
        return this.obj_id;
    }

    @d
    public final ArticleCollectionObj copy(@e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 14156, new Class[]{String.class, String.class, String.class, String.class, String.class}, ArticleCollectionObj.class);
        return patchProxyResultProxy.isSupported ? (ArticleCollectionObj) patchProxyResultProxy.result : new ArticleCollectionObj(str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14160, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ArticleCollectionObj)) {
            return false;
        }
        ArticleCollectionObj articleCollectionObj = (ArticleCollectionObj) obj;
        return f0.g(this.title, articleCollectionObj.title) && f0.g(this.count, articleCollectionObj.count) && f0.g(this.priority, articleCollectionObj.priority) && f0.g(this.protocol, articleCollectionObj.protocol) && f0.g(this.obj_id, articleCollectionObj.obj_id);
    }

    @e
    public final String getCount() {
        return this.count;
    }

    @e
    public final String getObj_id() {
        return this.obj_id;
    }

    @e
    public final String getPriority() {
        return this.priority;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14159, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.count;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.priority;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.protocol;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.obj_id;
        return iHashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setCount(@e String str) {
        this.count = str;
    }

    public final void setObj_id(@e String str) {
        this.obj_id = str;
    }

    public final void setPriority(@e String str) {
        this.priority = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14158, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "ArticleCollectionObj(title=" + this.title + ", count=" + this.count + ", priority=" + this.priority + ", protocol=" + this.protocol + ", obj_id=" + this.obj_id + ')';
    }
}
