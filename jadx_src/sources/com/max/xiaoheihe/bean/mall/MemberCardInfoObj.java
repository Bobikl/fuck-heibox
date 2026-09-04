package com.max.xiaoheihe.bean.mall;

import androidx.compose.runtime.internal.o;
import com.max.hbcommon.bean.KeyDescObj;
import com.max.xiaoheihe.bean.rich.RichAttributeModelObj;
import com.meituan.robust.ChangeQuickRedirect;
import dl.e;
import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: MemberBulletinResultObj.kt */
/* JADX INFO: loaded from: classes3.dex */
@o(parameters = 0)
public final class MemberCardInfoObj implements Serializable {
    public static final int $stable = 8;
    public static ChangeQuickRedirect changeQuickRedirect;

    @e
    private String background;

    @e
    private KeyDescObj button;

    @e
    private ProgressBarObj progress_bar;

    @e
    private String sub_title;

    @e
    private RichAttributeModelObj sub_title_attr;

    @e
    private String sub_title_color;

    @e
    private String title;

    @e
    private ArrayList<String> title_color;

    public MemberCardInfoObj(@e String str, @e ArrayList<String> arrayList, @e ProgressBarObj progressBarObj, @e String str2, @e String str3, @e RichAttributeModelObj richAttributeModelObj, @e String str4, @e KeyDescObj keyDescObj) {
        this.title = str;
        this.title_color = arrayList;
        this.progress_bar = progressBarObj;
        this.sub_title = str2;
        this.sub_title_color = str3;
        this.sub_title_attr = richAttributeModelObj;
        this.background = str4;
        this.button = keyDescObj;
    }

    @e
    public final String getBackground() {
        return this.background;
    }

    @e
    public final KeyDescObj getButton() {
        return this.button;
    }

    @e
    public final ProgressBarObj getProgress_bar() {
        return this.progress_bar;
    }

    @e
    public final String getSub_title() {
        return this.sub_title;
    }

    @e
    public final RichAttributeModelObj getSub_title_attr() {
        return this.sub_title_attr;
    }

    @e
    public final String getSub_title_color() {
        return this.sub_title_color;
    }

    @e
    public final String getTitle() {
        return this.title;
    }

    @e
    public final ArrayList<String> getTitle_color() {
        return this.title_color;
    }

    public final void setBackground(@e String str) {
        this.background = str;
    }

    public final void setButton(@e KeyDescObj keyDescObj) {
        this.button = keyDescObj;
    }

    public final void setProgress_bar(@e ProgressBarObj progressBarObj) {
        this.progress_bar = progressBarObj;
    }

    public final void setSub_title(@e String str) {
        this.sub_title = str;
    }

    public final void setSub_title_attr(@e RichAttributeModelObj richAttributeModelObj) {
        this.sub_title_attr = richAttributeModelObj;
    }

    public final void setSub_title_color(@e String str) {
        this.sub_title_color = str;
    }

    public final void setTitle(@e String str) {
        this.title = str;
    }

    public final void setTitle_color(@e ArrayList<String> arrayList) {
        this.title_color = arrayList;
    }
}
