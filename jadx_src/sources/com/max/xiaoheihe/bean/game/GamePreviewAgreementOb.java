package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GamePreviewAgreementOb implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String text;
    private String title;

    public String getText() {
        return this.text;
    }

    public String getTitle() {
        return this.title;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
