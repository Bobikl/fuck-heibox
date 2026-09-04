package com.max.hbcommon.bean;

import com.flyco.tablayout.listener.CustomTabEntity;
import com.meituan.robust.ChangeQuickRedirect;

/* JADX INFO: loaded from: classes9.dex */
public class TabEntity implements CustomTabEntity {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String title;

    public TabEntity(String str) {
        this.title = str;
    }

    @Override // com.flyco.tablayout.listener.CustomTabEntity
    public int getTabSelectedIcon() {
        return 0;
    }

    @Override // com.flyco.tablayout.listener.CustomTabEntity
    public String getTabTitle() {
        return this.title;
    }

    @Override // com.flyco.tablayout.listener.CustomTabEntity
    public int getTabUnselectedIcon() {
        return 0;
    }
}
