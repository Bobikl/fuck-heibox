package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.news.FeedsContentBaseObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSFollowedMomentsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6003691768165663391L;
    private String lastval;
    private KeyDescObj login_card;
    private List<FeedsContentBaseObj> moments;

    public String getLastval() {
        return this.lastval;
    }

    public KeyDescObj getLogin_card() {
        return this.login_card;
    }

    public List<FeedsContentBaseObj> getMoments() {
        return this.moments;
    }

    public void setLastval(String str) {
        this.lastval = str;
    }

    public void setLogin_card(KeyDescObj keyDescObj) {
        this.login_card = keyDescObj;
    }

    public void setMoments(List<FeedsContentBaseObj> list) {
        this.moments = list;
    }
}
