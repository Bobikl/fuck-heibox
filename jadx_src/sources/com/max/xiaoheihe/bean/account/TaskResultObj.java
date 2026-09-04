package com.max.xiaoheihe.bean.account;

import com.max.xiaoheihe.bean.bbs.BBSUserInfoObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class TaskResultObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String description;
    private String exp_rule_protocol;
    private SignInInfo sign_v2_info;
    private TaskLinesWrapperObj task_lines;
    private List<TaskListObj> task_list;
    private BBSUserInfoObj user;

    public String getDescription() {
        return this.description;
    }

    public String getExp_rule_protocol() {
        return this.exp_rule_protocol;
    }

    public SignInInfo getSign_v2_info() {
        return this.sign_v2_info;
    }

    public TaskLinesWrapperObj getTask_lines() {
        return this.task_lines;
    }

    public List<TaskListObj> getTask_list() {
        return this.task_list;
    }

    public BBSUserInfoObj getUser() {
        return this.user;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setExp_rule_protocol(String str) {
        this.exp_rule_protocol = str;
    }

    public void setSign_v2_info(SignInInfo signInInfo) {
        this.sign_v2_info = signInInfo;
    }

    public void setTask_lines(TaskLinesWrapperObj taskLinesWrapperObj) {
        this.task_lines = taskLinesWrapperObj;
    }

    public void setTask_list(List<TaskListObj> list) {
        this.task_list = list;
    }

    public void setUser(BBSUserInfoObj bBSUserInfoObj) {
        this.user = bBSUserInfoObj;
    }
}
