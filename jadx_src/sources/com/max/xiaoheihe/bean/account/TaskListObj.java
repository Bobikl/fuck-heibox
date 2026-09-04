package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TaskListObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<TaskInfoObj> tasks;
    private String title;

    public List<TaskInfoObj> getTasks() {
        return this.tasks;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTasks(List<TaskInfoObj> list) {
        this.tasks = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
