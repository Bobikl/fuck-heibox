package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: PostModuleListObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostModuleListObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String draft_num;

    @e
    private String more_tools_protocol;

    @e
    private List<PostModuleObj> tools;

    public PostModuleListObj(@e List<PostModuleObj> list, @e String str, @e String str2) {
        this.tools = list;
        this.draft_num = str;
        this.more_tools_protocol = str2;
    }

    public static /* synthetic */ PostModuleListObj copy$default(PostModuleListObj postModuleListObj, List list, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postModuleListObj, list, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 14419, new Class[]{PostModuleListObj.class, List.class, String.class, String.class, Integer.TYPE, Object.class}, PostModuleListObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostModuleListObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            list = postModuleListObj.tools;
        }
        if ((i10 & 2) != 0) {
            str = postModuleListObj.draft_num;
        }
        if ((i10 & 4) != 0) {
            str2 = postModuleListObj.more_tools_protocol;
        }
        return postModuleListObj.copy(list, str, str2);
    }

    @e
    public final List<PostModuleObj> component1() {
        return this.tools;
    }

    @e
    public final String component2() {
        return this.draft_num;
    }

    @e
    public final String component3() {
        return this.more_tools_protocol;
    }

    @d
    public final PostModuleListObj copy(@e List<PostModuleObj> list, @e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{list, str, str2}, this, changeQuickRedirect, false, 14418, new Class[]{List.class, String.class, String.class}, PostModuleListObj.class);
        return patchProxyResultProxy.isSupported ? (PostModuleListObj) patchProxyResultProxy.result : new PostModuleListObj(list, str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14422, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostModuleListObj)) {
            return false;
        }
        PostModuleListObj postModuleListObj = (PostModuleListObj) obj;
        return f0.g(this.tools, postModuleListObj.tools) && f0.g(this.draft_num, postModuleListObj.draft_num) && f0.g(this.more_tools_protocol, postModuleListObj.more_tools_protocol);
    }

    @e
    public final String getDraft_num() {
        return this.draft_num;
    }

    @e
    public final String getMore_tools_protocol() {
        return this.more_tools_protocol;
    }

    @e
    public final List<PostModuleObj> getTools() {
        return this.tools;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14421, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        List<PostModuleObj> list = this.tools;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        String str = this.draft_num;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.more_tools_protocol;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final void setDraft_num(@e String str) {
        this.draft_num = str;
    }

    public final void setMore_tools_protocol(@e String str) {
        this.more_tools_protocol = str;
    }

    public final void setTools(@e List<PostModuleObj> list) {
        this.tools = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14420, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostModuleListObj(tools=" + this.tools + ", draft_num=" + this.draft_num + ", more_tools_protocol=" + this.more_tools_protocol + ')';
    }
}
