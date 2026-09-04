package com.max.xiaoheihe.bean.game.pubg;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class VacStatsObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -8762364639705593352L;
    private String DaysSinceLastBan;
    private String NumberOfVACBans;

    public String getDaysSinceLastBan() {
        return this.DaysSinceLastBan;
    }

    public String getNumberOfVACBans() {
        return this.NumberOfVACBans;
    }

    public void setDaysSinceLastBan(String str) {
        this.DaysSinceLastBan = str;
    }

    public void setNumberOfVACBans(String str) {
        this.NumberOfVACBans = str;
    }
}
