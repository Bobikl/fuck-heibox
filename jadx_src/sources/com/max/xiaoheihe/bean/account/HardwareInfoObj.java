package com.max.xiaoheihe.bean.account;

import com.meituan.robust.ChangeQuickRedirect;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class HardwareInfoObj implements Serializable {
    public static ChangeQuickRedirect changeQuickRedirect = null;
    private static final long serialVersionUID = -487939660741870001L;
    private String board;
    private String cpu;
    private String gpu;
    private String perf_level;
    private String protocol;

    public String getBoard() {
        return this.board;
    }

    public String getCpu() {
        return this.cpu;
    }

    public String getGpu() {
        return this.gpu;
    }

    public String getPerf_level() {
        return this.perf_level;
    }

    public String getProtocol() {
        return this.protocol;
    }

    public void setBoard(String str) {
        this.board = str;
    }

    public void setCpu(String str) {
        this.cpu = str;
    }

    public void setGpu(String str) {
        this.gpu = str;
    }

    public void setPerf_level(String str) {
        this.perf_level = str;
    }

    public void setProtocol(String str) {
        this.protocol = str;
    }
}
