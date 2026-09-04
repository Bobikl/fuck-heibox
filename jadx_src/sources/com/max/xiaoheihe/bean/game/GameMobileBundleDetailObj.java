package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameMobileBundleDetailObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1920768400430017027L;
    private List<String> bundle_desc;
    private String button_desc;
    private List<String> content_desc;
    private String state_desc;

    public List<String> getBundle_desc() {
        return this.bundle_desc;
    }

    public String getButton_desc() {
        return this.button_desc;
    }

    public List<String> getContent_desc() {
        return this.content_desc;
    }

    public String getState_desc() {
        return this.state_desc;
    }

    public void setBundle_desc(List<String> list) {
        this.bundle_desc = list;
    }

    public void setButton_desc(String str) {
        this.button_desc = str;
    }

    public void setContent_desc(List<String> list) {
        this.content_desc = list;
    }

    public void setState_desc(String str) {
        this.state_desc = str;
    }
}
