package com.max.xiaoheihe.bean.account;

import com.google.gson.annotations.SerializedName;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.bbs.BBSTopicObj;
import com.meituan.robust.ChangeQuickRedirect;
import com.tencent.open.SocialConstants;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class InterestProfileObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8966748613477480360L;

    @SerializedName(alternate = {SocialConstants.PARAM_APP_DESC}, value = "description")
    private String description;
    private String is_v5;
    private List<KeyDescObj> options;
    private String title;
    private List<InterestProfileGroupObj> topic_group_list;
    private List<BBSTopicObj> topic_options;
    private String type;

    public String getDescription() {
        return this.description;
    }

    public String getIs_v5() {
        return this.is_v5;
    }

    public List<KeyDescObj> getOptions() {
        return this.options;
    }

    public String getTitle() {
        return this.title;
    }

    public List<InterestProfileGroupObj> getTopic_group_list() {
        return this.topic_group_list;
    }

    public List<BBSTopicObj> getTopic_options() {
        return this.topic_options;
    }

    public String getType() {
        return this.type;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIs_v5(String str) {
        this.is_v5 = str;
    }

    public void setOptions(List<KeyDescObj> list) {
        this.options = list;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTopic_group_list(List<InterestProfileGroupObj> list) {
        this.topic_group_list = list;
    }

    public void setTopic_options(List<BBSTopicObj> list) {
        this.topic_options = list;
    }

    public void setType(String str) {
        this.type = str;
    }
}
