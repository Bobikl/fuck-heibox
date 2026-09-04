package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.max.hbcommon.bean.segmentfilter.FilterGroup;
import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameCommentsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 7907105717988823915L;
    private List<FilterGroup> filters;
    private String game_comment_num;
    private List<LinkInfoObj> links;
    private String play_state;
    private String score;
    private List<KeyDescObj> sort_type_list;

    public List<FilterGroup> getFilters() {
        return this.filters;
    }

    public String getGame_comment_num() {
        return this.game_comment_num;
    }

    public List<LinkInfoObj> getLinks() {
        return this.links;
    }

    public String getPlay_state() {
        return this.play_state;
    }

    public String getScore() {
        return this.score;
    }

    public List<KeyDescObj> getSort_type_list() {
        return this.sort_type_list;
    }

    public void setFilters(List<FilterGroup> list) {
        this.filters = list;
    }

    public void setGame_comment_num(String str) {
        this.game_comment_num = str;
    }

    public void setLinks(List<LinkInfoObj> list) {
        this.links = list;
    }

    public void setPlay_state(String str) {
        this.play_state = str;
    }

    public void setScore(String str) {
        this.score = str;
    }

    public void setSort_type_list(List<KeyDescObj> list) {
        this.sort_type_list = list;
    }
}
