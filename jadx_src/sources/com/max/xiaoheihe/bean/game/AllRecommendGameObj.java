package com.max.xiaoheihe.bean.game;

import com.max.xiaoheihe.bean.MenuObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AllRecommendGameObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<AllRecommendGameCategoryObj> all_list;
    private List<AllRecommendGameHeaderObj> header;
    private List<MenuObj> menu;
    private List<MenuObj> menu_v2;

    public List<AllRecommendGameCategoryObj> getAll_list() {
        return this.all_list;
    }

    public List<AllRecommendGameHeaderObj> getHeader() {
        return this.header;
    }

    public List<MenuObj> getMenu() {
        return this.menu;
    }

    public List<MenuObj> getMenu_v2() {
        return this.menu_v2;
    }

    public void setAll_list(List<AllRecommendGameCategoryObj> list) {
        this.all_list = list;
    }

    public void setHeader(List<AllRecommendGameHeaderObj> list) {
        this.header = list;
    }

    public void setMenu(List<MenuObj> list) {
        this.menu = list;
    }

    public void setMenu_v2(List<MenuObj> list) {
        this.menu_v2 = list;
    }
}
