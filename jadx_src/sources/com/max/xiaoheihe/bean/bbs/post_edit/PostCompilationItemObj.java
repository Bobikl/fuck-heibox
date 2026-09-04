package com.max.xiaoheihe.bean.bbs.post_edit;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostCompilationsObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostCompilationItemObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int count;

    @e
    private String desc;

    @e
    private String heybox_id;

    @e
    private String image_url;

    @e
    private String modified_time;

    @d
    private String obj_id;

    @e
    private String protocol;

    @d
    private String title;

    public PostCompilationItemObj(int i10, @d String title, @d String obj_id, @e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        f0.p(title, "title");
        f0.p(obj_id, "obj_id");
        this.count = i10;
        this.title = title;
        this.obj_id = obj_id;
        this.modified_time = str;
        this.image_url = str2;
        this.heybox_id = str3;
        this.desc = str4;
        this.protocol = str5;
    }

    public static /* synthetic */ PostCompilationItemObj copy$default(PostCompilationItemObj postCompilationItemObj, int i10, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i11, Object obj) {
        int i12 = i10;
        Object[] objArr = {postCompilationItemObj, new Integer(i12), str, str2, str3, str4, str5, str6, str7, new Integer(i11), obj};
        ChangeQuickRedirect changeQuickRedirect2 = changeQuickRedirect;
        Class cls = Integer.TYPE;
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(objArr, null, changeQuickRedirect2, true, 14546, new Class[]{PostCompilationItemObj.class, cls, String.class, String.class, String.class, String.class, String.class, String.class, String.class, cls, Object.class}, PostCompilationItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostCompilationItemObj) patchProxyResultProxy.result;
        }
        if ((i11 & 1) != 0) {
            i12 = postCompilationItemObj.count;
        }
        return postCompilationItemObj.copy(i12, (i11 & 2) != 0 ? postCompilationItemObj.title : str, (i11 & 4) != 0 ? postCompilationItemObj.obj_id : str2, (i11 & 8) != 0 ? postCompilationItemObj.modified_time : str3, (i11 & 16) != 0 ? postCompilationItemObj.image_url : str4, (i11 & 32) != 0 ? postCompilationItemObj.heybox_id : str5, (i11 & 64) != 0 ? postCompilationItemObj.desc : str6, (i11 & 128) != 0 ? postCompilationItemObj.protocol : str7);
    }

    public final int component1() {
        return this.count;
    }

    @d
    public final String component2() {
        return this.title;
    }

    @d
    public final String component3() {
        return this.obj_id;
    }

    @e
    public final String component4() {
        return this.modified_time;
    }

    @e
    public final String component5() {
        return this.image_url;
    }

    @e
    public final String component6() {
        return this.heybox_id;
    }

    @e
    public final String component7() {
        return this.desc;
    }

    @e
    public final String component8() {
        return this.protocol;
    }

    @d
    public final PostCompilationItemObj copy(int i10, @d String title, @d String obj_id, @e String str, @e String str2, @e String str3, @e String str4, @e String str5) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{new Integer(i10), title, obj_id, str, str2, str3, str4, str5}, this, changeQuickRedirect, false, 14545, new Class[]{Integer.TYPE, String.class, String.class, String.class, String.class, String.class, String.class, String.class}, PostCompilationItemObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostCompilationItemObj) patchProxyResultProxy.result;
        }
        f0.p(title, "title");
        f0.p(obj_id, "obj_id");
        return new PostCompilationItemObj(i10, title, obj_id, str, str2, str3, str4, str5);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14549, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostCompilationItemObj)) {
            return false;
        }
        PostCompilationItemObj postCompilationItemObj = (PostCompilationItemObj) obj;
        return this.count == postCompilationItemObj.count && f0.g(this.title, postCompilationItemObj.title) && f0.g(this.obj_id, postCompilationItemObj.obj_id) && f0.g(this.modified_time, postCompilationItemObj.modified_time) && f0.g(this.image_url, postCompilationItemObj.image_url) && f0.g(this.heybox_id, postCompilationItemObj.heybox_id) && f0.g(this.desc, postCompilationItemObj.desc) && f0.g(this.protocol, postCompilationItemObj.protocol);
    }

    public final int getCount() {
        return this.count;
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getHeybox_id() {
        return this.heybox_id;
    }

    @e
    public final String getImage_url() {
        return this.image_url;
    }

    @e
    public final String getModified_time() {
        return this.modified_time;
    }

    @d
    public final String getObj_id() {
        return this.obj_id;
    }

    @e
    public final String getProtocol() {
        return this.protocol;
    }

    @d
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14548, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        int iHashCode = ((((this.count * 31) + this.title.hashCode()) * 31) + this.obj_id.hashCode()) * 31;
        String str = this.modified_time;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.image_url;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.heybox_id;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.desc;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.protocol;
        return iHashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final void setCount(int i10) {
        this.count = i10;
    }

    public final void setDesc(@e String str) {
        this.desc = str;
    }

    public final void setHeybox_id(@e String str) {
        this.heybox_id = str;
    }

    public final void setImage_url(@e String str) {
        this.image_url = str;
    }

    public final void setModified_time(@e String str) {
        this.modified_time = str;
    }

    public final void setObj_id(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14544, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.obj_id = str;
    }

    public final void setProtocol(@e String str) {
        this.protocol = str;
    }

    public final void setTitle(@d String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 14543, new Class[]{String.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(str, "<set-?>");
        this.title = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14547, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostCompilationItemObj(count=" + this.count + ", title=" + this.title + ", obj_id=" + this.obj_id + ", modified_time=" + this.modified_time + ", image_url=" + this.image_url + ", heybox_id=" + this.heybox_id + ", desc=" + this.desc + ", protocol=" + this.protocol + ')';
    }
}
