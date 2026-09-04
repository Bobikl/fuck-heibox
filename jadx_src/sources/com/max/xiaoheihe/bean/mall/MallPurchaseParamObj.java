package com.max.xiaoheihe.bean.mall;

import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MallPurchaseParamObj {
    public static ChangeQuickRedirect changeQuickRedirect;

    /* JADX INFO: renamed from: cat, reason: collision with root package name */
    private List<MallCatObj> f77005cat;
    private String faq;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f77006id;
    private String title;

    public List<MallCatObj> getCat() {
        return this.f77005cat;
    }

    public String getFaq() {
        return this.faq;
    }

    public String getId() {
        return this.f77006id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCat(List<MallCatObj> list) {
        this.f77005cat = list;
    }

    public void setFaq(String str) {
        this.faq = str;
    }

    public void setId(String str) {
        this.f77006id = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
