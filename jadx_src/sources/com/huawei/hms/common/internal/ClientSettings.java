package com.huawei.hms.common.internal;

import android.app.Activity;
import com.huawei.hms.support.api.client.SubAppInfo;
import com.huawei.hms.support.api.entity.auth.Scope;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: loaded from: classes7.dex */
public class ClientSettings {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f60523a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f60524b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<Scope> f60525c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f60526d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<String> f60527e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f60528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private SubAppInfo f60529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private WeakReference<Activity> f60530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f60531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String f60532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f60533k;

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2) {
        this.f60523a = str;
        this.f60524b = str2;
        this.f60525c = list;
        this.f60526d = str3;
        this.f60527e = list2;
    }

    public ClientSettings(String str, String str2, List<Scope> list, String str3, List<String> list2, SubAppInfo subAppInfo) {
        this(str, str2, list, str3, list2);
        this.f60529g = subAppInfo;
    }

    public List<String> getApiName() {
        return this.f60527e;
    }

    public String getAppID() {
        return this.f60526d;
    }

    public String getClientClassName() {
        return this.f60524b;
    }

    public String getClientPackageName() {
        return this.f60523a;
    }

    public Activity getCpActivity() {
        WeakReference<Activity> weakReference = this.f60530h;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    public String getCpID() {
        return this.f60528f;
    }

    public String getInnerHmsPkg() {
        return this.f60532j;
    }

    public List<Scope> getScopes() {
        return this.f60525c;
    }

    public SubAppInfo getSubAppID() {
        return this.f60529g;
    }

    public boolean isHasActivity() {
        return this.f60531i;
    }

    public boolean isUseInnerHms() {
        return this.f60533k;
    }

    public void setApiName(List<String> list) {
        this.f60527e = list;
    }

    public void setAppID(String str) {
        this.f60526d = str;
    }

    public void setClientClassName(String str) {
        this.f60524b = str;
    }

    public void setClientPackageName(String str) {
        this.f60523a = str;
    }

    public void setCpActivity(Activity activity) {
        this.f60530h = new WeakReference<>(activity);
        this.f60531i = true;
    }

    public void setCpID(String str) {
        this.f60528f = str;
    }

    public void setInnerHmsPkg(String str) {
        this.f60532j = str;
    }

    public void setScopes(List<Scope> list) {
        this.f60525c = list;
    }

    public void setSubAppId(SubAppInfo subAppInfo) {
        this.f60529g = subAppInfo;
    }

    public void setUseInnerHms(boolean z10) {
        this.f60533k = z10;
    }
}
