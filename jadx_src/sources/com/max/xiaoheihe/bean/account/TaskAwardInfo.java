package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TaskAwardInfo.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TaskAwardInfo implements Serializable {
    public static final int $stable = 0;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private final String desc;

    @e
    private final String icon;

    public TaskAwardInfo(@e String str, @e String str2) {
        this.icon = str;
        this.desc = str2;
    }

    public static /* synthetic */ TaskAwardInfo copy$default(TaskAwardInfo taskAwardInfo, String str, String str2, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{taskAwardInfo, str, str2, new Integer(i10), obj}, null, changeQuickRedirect, true, 13975, new Class[]{TaskAwardInfo.class, String.class, String.class, Integer.TYPE, Object.class}, TaskAwardInfo.class);
        if (patchProxyResultProxy.isSupported) {
            return (TaskAwardInfo) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            str = taskAwardInfo.icon;
        }
        if ((i10 & 2) != 0) {
            str2 = taskAwardInfo.desc;
        }
        return taskAwardInfo.copy(str, str2);
    }

    @e
    public final String component1() {
        return this.icon;
    }

    @e
    public final String component2() {
        return this.desc;
    }

    @d
    public final TaskAwardInfo copy(@e String str, @e String str2) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{str, str2}, this, changeQuickRedirect, false, 13974, new Class[]{String.class, String.class}, TaskAwardInfo.class);
        return patchProxyResultProxy.isSupported ? (TaskAwardInfo) patchProxyResultProxy.result : new TaskAwardInfo(str, str2);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13978, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskAwardInfo)) {
            return false;
        }
        TaskAwardInfo taskAwardInfo = (TaskAwardInfo) obj;
        return f0.g(this.icon, taskAwardInfo.icon) && f0.g(this.desc, taskAwardInfo.desc);
    }

    @e
    public final String getDesc() {
        return this.desc;
    }

    @e
    public final String getIcon() {
        return this.icon;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13977, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        String str = this.icon;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.desc;
        return iHashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13976, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TaskAwardInfo(icon=" + this.icon + ", desc=" + this.desc + ')';
    }
}
