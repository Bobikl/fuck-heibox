package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameMobileBundleObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = 6492595266364508140L;
    private String button_desc;
    private String description;
    private GameMobileBundleDetailObj detail;

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    private String f76969id;
    private String img;
    private String name;
    private String time_desc;

    public String getButton_desc() {
        return this.button_desc;
    }

    public String getDescription() {
        return this.description;
    }

    public GameMobileBundleDetailObj getDetail() {
        return this.detail;
    }

    public String getId() {
        return this.f76969id;
    }

    public String getImg() {
        return this.img;
    }

    public String getName() {
        return this.name;
    }

    public String getTime_desc() {
        return this.time_desc;
    }

    public void setButton_desc(String str) {
        this.button_desc = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setDetail(GameMobileBundleDetailObj gameMobileBundleDetailObj) {
        this.detail = gameMobileBundleDetailObj;
    }

    public void setId(String str) {
        this.f76969id = str;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setTime_desc(String str) {
        this.time_desc = str;
    }
}
