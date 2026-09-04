package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class GameReleaseTimeObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect;
    private String game_count;
    private String release_date;
    private String release_time;

    public String getGame_count() {
        return this.game_count;
    }

    public String getRelease_date() {
        return this.release_date;
    }

    public String getRelease_time() {
        return this.release_time;
    }

    public void setGame_count(String str) {
        this.game_count = str;
    }

    public void setRelease_date(String str) {
        this.release_date = str;
    }

    public void setRelease_time(String str) {
        this.release_time = str;
    }
}
