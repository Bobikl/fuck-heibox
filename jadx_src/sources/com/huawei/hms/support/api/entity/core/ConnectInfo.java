package com.huawei.hms.support.api.entity.core;

import com.huawei.hms.core.aidl.IMessageEntity;
import com.huawei.hms.core.aidl.annotation.Packed;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ConnectInfo implements IMessageEntity {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Packed
    private List<String> f62664a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Packed
    private List<Scope> f62665b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Packed
    private String f62666c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Packed
    private String f62667d;

    public ConnectInfo() {
    }

    public ConnectInfo(List<String> list, List<Scope> list2, String str, String str2) {
        this.f62664a = list;
        this.f62665b = list2;
        this.f62666c = str;
        this.f62667d = str2;
    }

    public List<String> getApiNameList() {
        return this.f62664a;
    }

    public String getFingerprint() {
        return this.f62666c;
    }

    public List<Scope> getScopeList() {
        return this.f62665b;
    }

    public String getSubAppID() {
        return this.f62667d;
    }

    public void setApiNameList(List<String> list) {
        this.f62664a = list;
    }

    public void setFingerprint(String str) {
        this.f62666c = str;
    }

    public void setScopeList(List<Scope> list) {
        this.f62665b = list;
    }

    public void setSubAppID(String str) {
        this.f62667d = str;
    }
}
