package com.efs.sdk.base;

import android.app.Application;
import android.content.Context;
import android.os.Message;
import android.text.TextUtils;
import android.util.Pair;
import android.webkit.ValueCallback;
import androidx.annotation.n0;
import com.efs.sdk.base.core.b.e;
import com.efs.sdk.base.core.c.d;
import com.efs.sdk.base.core.config.GlobalEnvStruct;
import com.efs.sdk.base.core.config.a.c;
import com.efs.sdk.base.core.controller.ControllerCenter;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.core.util.a;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.observer.IConfigCallback;
import com.efs.sdk.base.observer.IEfsReporterObserver;
import com.efs.sdk.base.processor.action.ILogEncryptAction;
import com.efs.sdk.base.protocol.ILogProtocol;
import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes6.dex */
public class EfsReporter {
    private static ControllerCenter sControllerCenter;

    public static class Builder {
        private static Map<String, EfsReporter> sInstanceMap = new ConcurrentHashMap();
        private static boolean sUseAppContext = true;
        private final String TAG;
        private GlobalEnvStruct mGlobalEnvStruct;

        public interface IPublicParams {
            Map<String, String> getRecordHeaders();
        }

        public Builder(@n0 Application application, @n0 String str, @n0 String str2) {
            this(application.getApplicationContext(), str, str2);
        }

        public Builder(@n0 Context context, @n0 String str, @n0 String str2) {
            this.TAG = "efs.reporter.builder";
            Context contextCheckContext = checkContext(context);
            if (TextUtils.isEmpty(str)) {
                throw new RuntimeException("EfsReporter init, appid is empty");
            }
            if (TextUtils.isEmpty(str2)) {
                throw new RuntimeException("EfsReporter init, secret is empty");
            }
            GlobalEnvStruct globalEnvStruct = new GlobalEnvStruct();
            this.mGlobalEnvStruct = globalEnvStruct;
            globalEnvStruct.mAppContext = contextCheckContext;
            globalEnvStruct.setAppid(str);
            this.mGlobalEnvStruct.setSecret(str2);
        }

        private static Context checkContext(Context context) {
            if (context == null) {
                Log.e("context can not be null!");
                throw null;
            }
            if (!sUseAppContext || (context instanceof Application) || ((context = context.getApplicationContext()) != null && (context instanceof Application))) {
                return context;
            }
            Log.e("Can not get Application context from given context!");
            throw new IllegalArgumentException("Can not get Application context from given context!");
        }

        private void checkParam(String str) {
            GlobalEnvStruct globalEnvStruct = sInstanceMap.get(str).getGlobalEnvStruct();
            if (!globalEnvStruct.mAppContext.equals(getGlobalEnvStruct().mAppContext)) {
                throw new RuntimeException("efs-core: duplicate init, but application context is different");
            }
            if (!TextUtils.isEmpty(globalEnvStruct.getSecret()) && !globalEnvStruct.getSecret().equals(getGlobalEnvStruct().getSecret())) {
                throw new RuntimeException("efs-core: duplicate init, but secret is different");
            }
            if (globalEnvStruct.isIntl() != getGlobalEnvStruct().isIntl()) {
                throw new RuntimeException("efs-core: duplicate init, but intl setting is different");
            }
            if (!TextUtils.isEmpty(getGlobalEnvStruct().getUid()) && !getGlobalEnvStruct().getUid().equals(globalEnvStruct.getUid())) {
                Log.w("efs.reporter.builder", "efs-core: duplicate init, but  uid is different");
            }
            if (getGlobalEnvStruct().getPublicParamMap() == null || getGlobalEnvStruct().getPublicParamMap().size() <= 0) {
                return;
            }
            globalEnvStruct.addPublicParams(getGlobalEnvStruct().getPublicParamMap());
        }

        public Builder addEfsReporterObserver(IEfsReporterObserver iEfsReporterObserver) {
            this.mGlobalEnvStruct.addConfigObserver(iEfsReporterObserver);
            return this;
        }

        public EfsReporter build() {
            String appid = getGlobalEnvStruct().getAppid();
            if (!sInstanceMap.containsKey(appid)) {
                synchronized (EfsReporter.class) {
                    if (!sInstanceMap.containsKey(appid)) {
                        EfsReporter efsReporter = new EfsReporter(this);
                        sInstanceMap.put(appid, efsReporter);
                        return efsReporter;
                    }
                }
            }
            Log.w("efs.reporter.builder", "efs-core: duplicate init");
            checkParam(appid);
            return sInstanceMap.get(appid);
        }

        public Builder configRefreshAction(@n0 IConfigRefreshAction iConfigRefreshAction) {
            c.a().f42491b = iConfigRefreshAction;
            return this;
        }

        public Builder configRefreshDelayMills(long j10) {
            this.mGlobalEnvStruct.configRefreshDelayMills = j10;
            return this;
        }

        public Builder debug(boolean z10) {
            this.mGlobalEnvStruct.setDebug(z10);
            return this;
        }

        public Builder efsDirRootName(String str) {
            a.a(str);
            return this;
        }

        public Builder enableSendLog(boolean z10) {
            this.mGlobalEnvStruct.setEnableSendLog(z10);
            return this;
        }

        public Builder enableWaStat(boolean z10) {
            this.mGlobalEnvStruct.setEnableWaStat(z10);
            return this;
        }

        public GlobalEnvStruct getGlobalEnvStruct() {
            return this.mGlobalEnvStruct;
        }

        public Builder intl(boolean z10) {
            this.mGlobalEnvStruct.setIsIntl(z10);
            return this;
        }

        public Builder logEncryptAction(ILogEncryptAction iLogEncryptAction) {
            this.mGlobalEnvStruct.setLogEncryptAction(iLogEncryptAction);
            return this;
        }

        public Builder maxConcurrentUploadCnt(int i10) {
            d.a().f42448a = i10;
            return this;
        }

        public Builder printLogDetail(boolean z10) {
            this.mGlobalEnvStruct.setPrintLogDetail(z10);
            return this;
        }

        public Builder publicParams(@n0 IPublicParams iPublicParams) {
            if (iPublicParams.getRecordHeaders() != null && iPublicParams.getRecordHeaders().size() > 0) {
                this.mGlobalEnvStruct.addPublicParams(iPublicParams.getRecordHeaders());
            }
            return this;
        }

        public Builder publicParams(@n0 Map<String, String> map) {
            if (map.size() > 0) {
                this.mGlobalEnvStruct.addPublicParams(map);
            }
            return this;
        }

        public Builder uid(String str) {
            this.mGlobalEnvStruct.setUid(str);
            return this;
        }
    }

    private EfsReporter(Builder builder) {
        sControllerCenter = new ControllerCenter(builder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @n0
    public GlobalEnvStruct getGlobalEnvStruct() {
        return ControllerCenter.getGlobalEnvStruct();
    }

    public void addPublicParams(@n0 Map<String, String> map) {
        if (map.size() > 0) {
            getGlobalEnvStruct().addPublicParams(map);
        }
    }

    public void flushRecordLogImmediately(String str) {
        e eVarA = com.efs.sdk.base.core.b.a.b.f42431a.f42429c.a((byte) 1);
        if (eVarA != null) {
            eVarA.a(str);
        }
    }

    public Map<String, String> getAllConfig() {
        return c.a().c();
    }

    public Map<String, Object> getAllSdkConfig() {
        return new HashMap(c.a().f42493d.f42488f);
    }

    public void getAllSdkConfig(String[] strArr, IConfigCallback iConfigCallback) {
        c cVarA = c.a();
        cVarA.f42494e.put(iConfigCallback, strArr);
        if (cVarA.f42493d.f42488f.isEmpty()) {
            return;
        }
        cVarA.d();
    }

    public void refreshConfig(String str) {
        c.a().a(str);
    }

    public void registerCallback(int i10, ValueCallback<Pair<Message, Message>> valueCallback) {
        getGlobalEnvStruct().registerCallback(i10, valueCallback);
    }

    public void send(ILogProtocol iLogProtocol) {
        sControllerCenter.send(iLogProtocol);
    }

    public HttpResponse sendSyncImediatelly(String str, int i10, String str2, File file) {
        return sendSyncImediatelly(str, i10, str2, true, file);
    }

    public HttpResponse sendSyncImediatelly(String str, int i10, String str2, boolean z10, File file) {
        return sControllerCenter.sendSyncImmediately(str, i10, str2, z10, file);
    }

    public void setEnableRefreshConfigFromRemote(boolean z10) {
        c.a().f42492c = z10;
    }
}
