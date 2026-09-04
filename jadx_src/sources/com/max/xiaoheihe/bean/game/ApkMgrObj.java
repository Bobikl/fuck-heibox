package com.max.xiaoheihe.bean.game;

import com.lzy.okserver.download.b;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes3.dex */
public class ApkMgrObj {
    public static final int ITEM_TYPE_FINISHED_TITLE = 2;
    public static final int ITEM_TYPE_TASK = 0;
    public static final int ITEM_TYPE_UNFINISHED_TITLE = 1;
    public static ChangeQuickRedirect changeQuickRedirect;
    private int itemType;
    private b task;

    public int getItemType() {
        return this.itemType;
    }

    public b getTask() {
        return this.task;
    }

    public void setItemType(int i10) {
        this.itemType = i10;
    }

    public void setTask(b bVar) {
        this.task = bVar;
    }
}
