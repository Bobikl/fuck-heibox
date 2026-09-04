package com.max.xiaoheihe.bean.account.steaminfo;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BindTaskInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 999122622918290530L;
    private String bind_steam;
    private String open_steam_info;
    private DialogMsgObj task_message;

    public String getBind_steam() {
        return this.bind_steam;
    }

    public String getOpen_steam_info() {
        return this.open_steam_info;
    }

    public DialogMsgObj getTask_message() {
        return this.task_message;
    }

    public void setBind_steam(String str) {
        this.bind_steam = str;
    }

    public void setOpen_steam_info(String str) {
        this.open_steam_info = str;
    }

    public void setTask_message(DialogMsgObj dialogMsgObj) {
        this.task_message = dialogMsgObj;
    }
}
