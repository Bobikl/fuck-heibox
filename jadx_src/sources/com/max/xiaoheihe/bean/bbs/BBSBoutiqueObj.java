package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class BBSBoutiqueObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6678140375339848698L;
    private String award_coin;
    private String award_exp;
    private String award_mi_coin;
    private String score;

    public String getAward_coin() {
        return this.award_coin;
    }

    public String getAward_exp() {
        return this.award_exp;
    }

    public String getAward_mi_coin() {
        return this.award_mi_coin;
    }

    public String getScore() {
        return this.score;
    }

    public void setAward_coin(String str) {
        this.award_coin = str;
    }

    public void setAward_exp(String str) {
        this.award_exp = str;
    }

    public void setAward_mi_coin(String str) {
        this.award_mi_coin = str;
    }

    public void setScore(String str) {
        this.score = str;
    }
}
