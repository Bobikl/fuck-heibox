package com.max.xiaoheihe.bean.account;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.account.AvatarDecorationObj;
import com.max.xiaoheihe.bean.account.avatar.AvatarDecorListObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class AvatarDecorCategoriesObj implements Serializable {
    public static final String CATES_FRAME = "frame";
    public static final String CATES_MINE = "mine";
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6166906273757519201L;
    private List<KeyDescObj> cates;
    private List<AvatarDecorListObj> contents;
    private List<AvatarDecorationObj> items;
    private String session;

    public List<KeyDescObj> getCates() {
        return this.cates;
    }

    public List<AvatarDecorListObj> getContents() {
        return this.contents;
    }

    public List<AvatarDecorationObj> getItems() {
        return this.items;
    }

    public String getSession() {
        return this.session;
    }

    public void setCates(List<KeyDescObj> list) {
        this.cates = list;
    }

    public void setContents(List<AvatarDecorListObj> list) {
        this.contents = list;
    }

    public void setItems(List<AvatarDecorationObj> list) {
        this.items = list;
    }

    public void setSession(String str) {
        this.session = str;
    }
}
