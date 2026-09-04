package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class GameUserNumObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -2787641607542809843L;
    private String current_online_url;
    private List<GameDetailDataObj> game_data;
    private List<GamePeakValueObj> peak_values;
    private String peak_values_desc;

    public String getCurrent_online_url() {
        return this.current_online_url;
    }

    public List<GameDetailDataObj> getGame_data() {
        return this.game_data;
    }

    public List<GamePeakValueObj> getPeak_values() {
        return this.peak_values;
    }

    public String getPeak_values_desc() {
        return this.peak_values_desc;
    }

    public void setCurrent_online_url(String str) {
        this.current_online_url = str;
    }

    public void setGame_data(List<GameDetailDataObj> list) {
        this.game_data = list;
    }

    public void setPeak_values(List<GamePeakValueObj> list) {
        this.peak_values = list;
    }

    public void setPeak_values_desc(String str) {
        this.peak_values_desc = str;
    }
}
