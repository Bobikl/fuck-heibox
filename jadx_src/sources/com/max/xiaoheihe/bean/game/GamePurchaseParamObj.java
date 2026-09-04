package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GamePurchaseParamObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 5649053165325648446L;
    private String guide_url;
    private String has_guide;
    private String key;
    private String title;
    private List<GamePurchaseParamValueObj> values;

    public String getGuide_url() {
        return this.guide_url;
    }

    public String getHas_guide() {
        return this.has_guide;
    }

    public String getKey() {
        return this.key;
    }

    public String getTitle() {
        return this.title;
    }

    public List<GamePurchaseParamValueObj> getValues() {
        return this.values;
    }

    public void setGuide_url(String str) {
        this.guide_url = str;
    }

    public void setHas_guide(String str) {
        this.has_guide = str;
    }

    public void setKey(String str) {
        this.key = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setValues(List<GamePurchaseParamValueObj> list) {
        this.values = list;
    }
}
