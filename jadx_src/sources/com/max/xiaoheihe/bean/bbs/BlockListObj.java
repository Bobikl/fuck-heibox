package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BlockListObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 1355977340355001390L;
    private List<BBSTopicObj> block_topics;
    private List<BBSUserInfoObj> block_users;

    public List<BBSTopicObj> getBlock_topics() {
        return this.block_topics;
    }

    public List<BBSUserInfoObj> getBlock_users() {
        return this.block_users;
    }

    public void setBlock_topics(List<BBSTopicObj> list) {
        this.block_topics = list;
    }

    public void setBlock_users(List<BBSUserInfoObj> list) {
        this.block_users = list;
    }
}
