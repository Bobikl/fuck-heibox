package com.max.xiaoheihe.bean.game;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class HardwarePerformance implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -6062364217053049781L;
    private String performance;
    private String protocol;
    private List<String> support_system;
    private String total_score;

    public String getPerformance() {
        return this.performance;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public List<String> getSupport_system() {
        return this.support_system;
    }

    public String getTotal_score() {
        return this.total_score;
    }

    public void setPerformance(String str) {
        this.performance = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }

    public void setSupport_system(List<String> list) {
        this.support_system = list;
    }

    public void setTotal_score(String str) {
        this.total_score = str;
    }
}
