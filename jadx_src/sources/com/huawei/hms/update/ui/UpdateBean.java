package com.huawei.hms.update.ui;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public class UpdateBean implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f62728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f62729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f62730c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f62731d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f62732e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f62733f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private ArrayList f62734g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f62735h = true;

    private static <T> T a(T t10) {
        return t10;
    }

    public String getClientAppId() {
        return (String) a(this.f62732e);
    }

    public String getClientAppName() {
        return (String) a(this.f62733f);
    }

    public String getClientPackageName() {
        return (String) a(this.f62730c);
    }

    public int getClientVersionCode() {
        return ((Integer) a(Integer.valueOf(this.f62731d))).intValue();
    }

    public boolean getResolutionInstallHMS() {
        return this.f62729b;
    }

    public ArrayList getTypeList() {
        return (ArrayList) a(this.f62734g);
    }

    public boolean isHmsOrApkUpgrade() {
        return ((Boolean) a(Boolean.valueOf(this.f62728a))).booleanValue();
    }

    public boolean isNeedConfirm() {
        return ((Boolean) a(Boolean.valueOf(this.f62735h))).booleanValue();
    }

    public void setClientAppId(String str) {
        this.f62732e = str;
    }

    public void setClientAppName(String str) {
        this.f62733f = str;
    }

    public void setClientPackageName(String str) {
        this.f62730c = str;
    }

    public void setClientVersionCode(int i10) {
        this.f62731d = i10;
    }

    public void setHmsOrApkUpgrade(boolean z10) {
        this.f62728a = z10;
    }

    public void setNeedConfirm(boolean z10) {
        this.f62735h = z10;
    }

    public void setResolutionInstallHMS(boolean z10) {
        this.f62729b = z10;
    }

    public void setTypeList(ArrayList arrayList) {
        this.f62734g = arrayList;
    }
}
