package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallSpecButtonObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -3666760312108604982L;
    private List<String> sku_list;
    private String text;

    public List<String> getSku_list() {
        return this.sku_list;
    }

    public String getText() {
        return this.text;
    }

    public void setSku_list(List<String> list) {
        this.sku_list = list;
    }

    public void setText(String str) {
        this.text = str;
    }
}
