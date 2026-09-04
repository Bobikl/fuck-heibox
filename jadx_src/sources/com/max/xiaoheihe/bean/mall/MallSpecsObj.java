package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallSpecsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7262623922098709565L;
    private List<MallSpecButtonObj> buttons;
    private int checkedItem = -1;
    private String title;

    public List<MallSpecButtonObj> getButtons() {
        return this.buttons;
    }

    public int getCheckedItem() {
        return this.checkedItem;
    }

    public String getTitle() {
        return this.title;
    }

    public void setButtons(List<MallSpecButtonObj> list) {
        this.buttons = list;
    }

    public void setCheckedItem(int i10) {
        this.checkedItem = i10;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
