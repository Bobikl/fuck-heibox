package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSTopicCategoryObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String board;
    private boolean checked;
    private List<BBSTopicObj> children;
    private String color;
    private String desc;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76957id;
    private String isExpanded;
    private String is_open;
    private String key;
    private String name;
    private String show_count;

    public String getBoard() {
        return this.board;
    }

    public List<BBSTopicObj> getChildren() {
        return this.children;
    }

    public String getColor() {
        return this.color;
    }

    public String getDesc() {
        return this.desc;
    }

    public String getId() {
        return this.f76957id;
    }

    public String getIsExpanded() {
        return this.isExpanded;
    }

    public String getIs_open() {
        return this.is_open;
    }

    public String getKey() {
        return this.key;
    }

    public String getName() {
        return this.name;
    }

    public String getShow_count() {
        return this.show_count;
    }

    public boolean isChecked() {
        return this.checked;
    }

    public void setBoard(String str) {
        this.board = str;
    }

    public void setChecked(boolean z10) {
        this.checked = z10;
    }

    public void setChildren(List<BBSTopicObj> list) {
        this.children = list;
    }

    public void setColor(String str) {
        this.color = str;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setId(String str) {
        this.f76957id = str;
    }

    public void setIsExpanded(String str) {
        this.isExpanded = str;
    }

    public void setIs_open(String str) {
        this.is_open = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setShow_count(String str) {
        this.show_count = str;
    }
}
