package com.efs.sdk.base.core.config;

import android.content.Context;
import android.os.Message;
import android.util.Pair;
import android.webkit.ValueCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class GlobalEnvStruct {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42463a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42464b;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f42470h;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private ILogEncryptAction f42475m;
    public Context mAppContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f42465c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f42466d = true;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f42467e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Boolean f42468f = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f42469g = false;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f42471i = false;
    public long configRefreshDelayMills = 5000;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private long f42472j = 10000;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private long f42473k = 10000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Map<String, String> f42474l = new HashMap(5);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ConcurrentHashMap<Integer, List<ValueCallback<Pair<Message, Message>>>> f42476n = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private List<IEfsReporterObserver> f42477o = new ArrayList(5);

    public void addConfigObserver(IEfsReporterObserver iEfsReporterObserver) {
        if (this.f42477o.contains(iEfsReporterObserver)) {
            return;
        }
        this.f42477o.add(iEfsReporterObserver);
    }

    public void addPublicParams(Map<String, String> map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        HashMap map2 = new HashMap(this.f42474l);
        map2.putAll(map);
        this.f42474l = map2;
    }

    public String getAppid() {
        return this.f42463a;
    }

    public List<ValueCallback<Pair<Message, Message>>> getCallback(int i10) {
        return (!this.f42476n.containsKey(Integer.valueOf(i10)) || this.f42476n.get(Integer.valueOf(i10)) == null) ? Collections.emptyList() : this.f42476n.get(Integer.valueOf(i10));
    }

    public List<IEfsReporterObserver> getEfsReporterObservers() {
        return this.f42477o;
    }

    public ILogEncryptAction getLogEncryptAction() {
        return this.f42475m;
    }

    public long getLogSendDelayMills() {
        return this.f42472j;
    }

    public long getLogSendIntervalMills() {
        return this.f42473k;
    }

    public Map<String, String> getPublicParamMap() {
        Map<String, String> map = this.f42474l;
        return map == null ? Collections.emptyMap() : map;
    }

    public String getSecret() {
        return this.f42464b;
    }

    public String getUid() {
        return this.f42470h;
    }

    public boolean isDebug() {
        return this.f42467e;
    }

    public boolean isEnableSendLog() {
        return this.f42466d;
    }

    public boolean isEnableWaStat() {
        return this.f42465c;
    }

    public boolean isIntl() {
        return this.f42471i;
    }

    public boolean isPrintLogDetail() {
        return this.f42469g;
    }

    public void registerCallback(int i10, ValueCallback<Pair<Message, Message>> valueCallback) {
        if (valueCallback == null) {
            return;
        }
        List<ValueCallback<Pair<Message, Message>>> linkedList = this.f42476n.get(Integer.valueOf(i10));
        if (linkedList == null) {
            linkedList = new LinkedList<>();
            this.f42476n.putIfAbsent(Integer.valueOf(i10), linkedList);
        }
        linkedList.add(valueCallback);
    }

    public void setAppid(String str) {
        this.f42463a = str;
    }

    public void setDebug(boolean z10) {
        this.f42467e = z10;
    }

    public void setEnableSendLog(boolean z10) {
        this.f42466d = z10;
    }

    public void setEnableWaStat(boolean z10) {
        this.f42465c = z10;
    }

    public void setIsIntl(boolean z10) {
        this.f42471i = z10;
    }

    public void setLogEncryptAction(ILogEncryptAction iLogEncryptAction) {
        this.f42475m = iLogEncryptAction;
    }

    public void setPrintLogDetail(boolean z10) {
        this.f42469g = z10;
    }

    public void setSecret(String str) {
        this.f42464b = str;
    }

    public void setUid(String str) {
        this.f42470h = str;
    }
}
