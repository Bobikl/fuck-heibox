package com.max.xiaoheihe.bean.account;

import com.alibaba.fastjson.annotation.JSONField;
import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.game.GameObj;
import com.max.xiaoheihe.module.bbs.post_edit.NewLinkEditFragment;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class MyGameListObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1290509854602865404L;

    @SerializedName(alternate = {NewLinkEditFragment.f82060c5}, value = "game_list")
    @JSONField(alternateNames = {NewLinkEditFragment.f82060c5}, name = "game_list")
    private List<GameObj> game_list;
    private String lastval;
    private String not_in_db_desc;
    private String selected_sort;
    private List<KeyDescObj> th_list;

    public List<GameObj> getGame_list() {
        return this.game_list;
    }

    public String getLastval() {
        return this.lastval;
    }

    public String getNot_in_db_desc() {
        return this.not_in_db_desc;
    }

    public String getSelected_sort() {
        return this.selected_sort;
    }

    public List<KeyDescObj> getTh_list() {
        return this.th_list;
    }

    public MyGameListObj setGame_list(List<GameObj> list) {
        this.game_list = list;
        return this;
    }

    public MyGameListObj setLastval(String str) {
        this.lastval = str;
        return this;
    }

    public void setNot_in_db_desc(String str) {
        this.not_in_db_desc = str;
    }

    public void setSelected_sort(String str) {
        this.selected_sort = str;
    }

    public void setTh_list(List<KeyDescObj> list) {
        this.th_list = list;
    }
}
