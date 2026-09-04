package com.max.xiaoheihe.bean.bbs;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: AutoSavaDataObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class PostEditAutoSaveDataWrapper<T> {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Boolean canEditModifyPostPlan;

    @e
    private Boolean isEdit;

    @e
    private T postEditAutoSaveData;

    @e
    private String postTypeName;

    public PostEditAutoSaveDataWrapper(@e String str, @e Boolean bool, @e Boolean bool2, @e T t10) {
        this.postTypeName = str;
        this.isEdit = bool;
        this.canEditModifyPostPlan = bool2;
        this.postEditAutoSaveData = t10;
    }

    public static /* synthetic */ PostEditAutoSaveDataWrapper copy$default(PostEditAutoSaveDataWrapper postEditAutoSaveDataWrapper, String str, Boolean bool, Boolean bool2, Object obj, int i10, Object obj2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{postEditAutoSaveDataWrapper, str, bool, bool2, obj, new Integer(i10), obj2}, null, changeQuickRedirect, true, 14394, new Class[]{PostEditAutoSaveDataWrapper.class, String.class, Boolean.class, Boolean.class, Object.class, Integer.TYPE, Object.class}, PostEditAutoSaveDataWrapper.class);
        if (patchProxyResultProxy.isSupported) {
            return (PostEditAutoSaveDataWrapper) patchProxyResultProxy.result;
        }
        return postEditAutoSaveDataWrapper.copy((i10 & 1) != 0 ? postEditAutoSaveDataWrapper.postTypeName : str, (i10 & 2) != 0 ? postEditAutoSaveDataWrapper.isEdit : bool, (i10 & 4) != 0 ? postEditAutoSaveDataWrapper.canEditModifyPostPlan : bool2, (i10 & 8) != 0 ? postEditAutoSaveDataWrapper.postEditAutoSaveData : obj);
    }

    @e
    public final String component1() {
        return this.postTypeName;
    }

    @e
    public final Boolean component2() {
        return this.isEdit;
    }

    @e
    public final Boolean component3() {
        return this.canEditModifyPostPlan;
    }

    @e
    public final T component4() {
        return this.postEditAutoSaveData;
    }

    @d
    public final PostEditAutoSaveDataWrapper<T> copy(@e String str, @e Boolean bool, @e Boolean bool2, @e T t10) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, bool, bool2, t10}, this, changeQuickRedirect, false, 14393, new Class[]{String.class, Boolean.class, Boolean.class, Object.class}, PostEditAutoSaveDataWrapper.class);
        return patchProxyResultProxy.isSupported ? (PostEditAutoSaveDataWrapper) patchProxyResultProxy.result : new PostEditAutoSaveDataWrapper<>(str, bool, bool2, t10);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 14397, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PostEditAutoSaveDataWrapper)) {
            return false;
        }
        PostEditAutoSaveDataWrapper postEditAutoSaveDataWrapper = (PostEditAutoSaveDataWrapper) obj;
        return f0.g(this.postTypeName, postEditAutoSaveDataWrapper.postTypeName) && f0.g(this.isEdit, postEditAutoSaveDataWrapper.isEdit) && f0.g(this.canEditModifyPostPlan, postEditAutoSaveDataWrapper.canEditModifyPostPlan) && f0.g(this.postEditAutoSaveData, postEditAutoSaveDataWrapper.postEditAutoSaveData);
    }

    @e
    public final Boolean getCanEditModifyPostPlan() {
        return this.canEditModifyPostPlan;
    }

    @e
    public final T getPostEditAutoSaveData() {
        return this.postEditAutoSaveData;
    }

    @e
    public final String getPostTypeName() {
        return this.postTypeName;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14396, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.postTypeName;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.isEdit;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canEditModifyPostPlan;
        int iHashCode3 = (iHashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        T t10 = this.postEditAutoSaveData;
        return iHashCode3 + (t10 != null ? t10.hashCode() : 0);
    }

    @e
    public final Boolean isEdit() {
        return this.isEdit;
    }

    public final void setCanEditModifyPostPlan(@e Boolean bool) {
        this.canEditModifyPostPlan = bool;
    }

    public final void setEdit(@e Boolean bool) {
        this.isEdit = bool;
    }

    public final void setPostEditAutoSaveData(@e T t10) {
        this.postEditAutoSaveData = t10;
    }

    public final void setPostTypeName(@e String str) {
        this.postTypeName = str;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 14395, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "PostEditAutoSaveDataWrapper(postTypeName=" + this.postTypeName + ", isEdit=" + this.isEdit + ", canEditModifyPostPlan=" + this.canEditModifyPostPlan + ", postEditAutoSaveData=" + this.postEditAutoSaveData + ')';
    }
}
