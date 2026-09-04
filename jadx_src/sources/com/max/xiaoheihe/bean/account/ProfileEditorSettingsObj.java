package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class ProfileEditorSettingsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -5769239417661914661L;
    private String custom_avatar_enabled;
    private String edit_enabled;

    public String getCustom_avatar_enabled() {
        return this.custom_avatar_enabled;
    }

    public String getEdit_enabled() {
        return this.edit_enabled;
    }

    public void setCustom_avatar_enabled(String str) {
        this.custom_avatar_enabled = str;
    }

    public void setEdit_enabled(String str) {
        this.edit_enabled = str;
    }
}
