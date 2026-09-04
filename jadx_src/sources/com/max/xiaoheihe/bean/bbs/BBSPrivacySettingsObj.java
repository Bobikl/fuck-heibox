package com.max.xiaoheihe.bean.bbs;

import com.max.hbcommon.bean.KeyDescObj;
import com.meituan.robust.ChangeQuickRedirect;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class BBSPrivacySettingsObj {
    public static ChangeQuickRedirect changeQuickRedirect;
    private List<KeyDescObj> filter_options;
    private List<KeyDescObj> privacy_options;

    public List<KeyDescObj> getFilter_options() {
        return this.filter_options;
    }

    public List<KeyDescObj> getPrivacy_options() {
        return this.privacy_options;
    }

    public void setFilter_options(List<KeyDescObj> list) {
        this.filter_options = list;
    }

    public void setPrivacy_options(List<KeyDescObj> list) {
        this.privacy_options = list;
    }
}
