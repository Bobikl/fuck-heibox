package com.max.xiaoheihe.bean.bbs;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class HashtagNumObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -1389086796725593961L;
    private String content_num;
    private String participant_num;

    public String getContent_num() {
        return this.content_num;
    }

    public String getParticipant_num() {
        return this.participant_num;
    }

    public void setContent_num(String str) {
        this.content_num = str;
    }

    public void setParticipant_num(String str) {
        this.participant_num = str;
    }
}
