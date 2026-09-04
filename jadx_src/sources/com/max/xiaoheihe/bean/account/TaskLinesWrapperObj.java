package com.max.xiaoheihe.bean.account;

import androidx.compose.runtime.internal.o;
import com.meituan.robust.ChangeQuickRedirect;
import com.meituan.robust.PatchProxy;
import com.meituan.robust.PatchProxyResult;
import dl.d;
import dl.e;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.f0;

/* JADX INFO: compiled from: TaskLinesWrapperObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class TaskLinesWrapperObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private Boolean all_finish;

    @d
    private List<TaskLineObj> task_line_items;

    public TaskLinesWrapperObj(@e Boolean bool, @d List<TaskLineObj> task_line_items) {
        f0.p(task_line_items, "task_line_items");
        this.all_finish = bool;
        this.task_line_items = task_line_items;
    }

    public static /* synthetic */ TaskLinesWrapperObj copy$default(TaskLinesWrapperObj taskLinesWrapperObj, Boolean bool, List list, int i10, Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{taskLinesWrapperObj, bool, list, new Integer(i10), obj}, null, changeQuickRedirect, true, 13986, new Class[]{TaskLinesWrapperObj.class, Boolean.class, List.class, Integer.TYPE, Object.class}, TaskLinesWrapperObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TaskLinesWrapperObj) patchProxyResultProxy.result;
        }
        if ((i10 & 1) != 0) {
            bool = taskLinesWrapperObj.all_finish;
        }
        if ((i10 & 2) != 0) {
            list = taskLinesWrapperObj.task_line_items;
        }
        return taskLinesWrapperObj.copy(bool, list);
    }

    @e
    public final Boolean component1() {
        return this.all_finish;
    }

    @d
    public final List<TaskLineObj> component2() {
        return this.task_line_items;
    }

    @d
    public final TaskLinesWrapperObj copy(@e Boolean bool, @d List<TaskLineObj> task_line_items) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{bool, task_line_items}, this, changeQuickRedirect, false, 13985, new Class[]{Boolean.class, List.class}, TaskLinesWrapperObj.class);
        if (patchProxyResultProxy.isSupported) {
            return (TaskLinesWrapperObj) patchProxyResultProxy.result;
        }
        f0.p(task_line_items, "task_line_items");
        return new TaskLinesWrapperObj(bool, task_line_items);
    }

    public boolean equals(@e Object obj) {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[]{obj}, this, changeQuickRedirect, false, 13989, new Class[]{Object.class}, Boolean.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Boolean) patchProxyResultProxy.result).booleanValue();
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TaskLinesWrapperObj)) {
            return false;
        }
        TaskLinesWrapperObj taskLinesWrapperObj = (TaskLinesWrapperObj) obj;
        return f0.g(this.all_finish, taskLinesWrapperObj.all_finish) && f0.g(this.task_line_items, taskLinesWrapperObj.task_line_items);
    }

    @e
    public final Boolean getAll_finish() {
        return this.all_finish;
    }

    @d
    public final List<TaskLineObj> getTask_line_items() {
        return this.task_line_items;
    }

    public int hashCode() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13988, new Class[0], Integer.TYPE);
        if (patchProxyResultProxy.isSupported) {
            return ((Integer) patchProxyResultProxy.result).intValue();
        }
        Boolean bool = this.all_finish;
        return ((bool != null ? bool.hashCode() : 0) * 31) + this.task_line_items.hashCode();
    }

    public final void setAll_finish(@e Boolean bool) {
        this.all_finish = bool;
    }

    public final void setTask_line_items(@d List<TaskLineObj> list) {
        if (PatchProxy.proxy(new Object[]{list}, this, changeQuickRedirect, false, 13984, new Class[]{List.class}, Void.TYPE).isSupported) {
            return;
        }
        f0.p(list, "<set-?>");
        this.task_line_items = list;
    }

    @d
    public String toString() {
        PatchProxyResult patchProxyResultProxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 13987, new Class[0], String.class);
        if (patchProxyResultProxy.isSupported) {
            return (String) patchProxyResultProxy.result;
        }
        return "TaskLinesWrapperObj(all_finish=" + this.all_finish + ", task_line_items=" + this.task_line_items + ')';
    }
}
