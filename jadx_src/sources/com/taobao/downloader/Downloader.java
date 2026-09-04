package com.taobao.downloader;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import com.max.xiaoheihe.module.bbs.ChannelsDetailActivity;
import com.taobao.downloader.adpater.BizPriManager;
import com.taobao.downloader.adpater.CloundConfigAdapter;
import com.taobao.downloader.adpater.FileCacheManager;
import com.taobao.downloader.adpater.impl.SimpleDownloadFactory;
import com.taobao.downloader.adpater.impl.SimpleFileCacheManager;
import com.taobao.downloader.adpater.impl.SimpleTaskManager;
import com.taobao.downloader.request.DownloadListener;
import com.taobao.downloader.request.DownloadRequest;
import com.taobao.downloader.request.Item;
import com.taobao.downloader.request.ModifyParam;
import com.taobao.downloader.request.Param;
import com.taobao.downloader.request.task.SingleTask;
import com.taobao.downloader.request.task.TaskParam;
import com.taobao.downloader.util.Dlog;
import com.taobao.downloader.util.FileUtils;
import com.taobao.downloader.util.IdGenerator;
import com.taobao.downloader.util.MonitorUtil;
import com.taobao.downloader.wrapper.ListenerWrapper;
import java.lang.reflect.Method;
import java.util.ArrayList;
import lg.a;

/* JADX INFO: loaded from: classes4.dex */
public class Downloader {
    private static final String TAG = "Downloader";
    private static volatile Downloader mDownloader;
    private Class<?> classInstance;

    private Downloader() {
        try {
            Class<?> cls = Class.forName("com.taobao.downloader.TbDownloader");
            this.classInstance = cls;
            Method declaredMethod = cls.getDeclaredMethod("initDownLoad", new Class[0]);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(null, new Object[0]);
            }
        } catch (Exception e10) {
            e10.printStackTrace();
        }
        if (Configuration.downloadFactory == null) {
            Configuration.downloadFactory = new SimpleDownloadFactory();
        }
        if (Configuration.taskManager == null) {
            Configuration.taskManager = new SimpleTaskManager();
        }
        if (Configuration.fileCacheManager == null) {
            Configuration.fileCacheManager = new SimpleFileCacheManager();
        }
    }

    public static Downloader getInstance() {
        if (mDownloader == null) {
            synchronized (Downloader.class) {
                if (mDownloader == null) {
                    mDownloader = new Downloader();
                }
            }
        }
        return mDownloader;
    }

    public static void init(Context context) {
        if (context == null) {
            Dlog.e(TAG, a.f131415h, "context is null");
        } else {
            Configuration.sContext = context.getApplicationContext();
        }
    }

    public void cancel(int i10) {
        Configuration.taskManager.modifyTask(i10, 2);
    }

    public int download(DownloadRequest downloadRequest, DownloadListener downloadListener) {
        FileCacheManager fileCacheManager;
        Dlog.d(TAG, ChannelsDetailActivity.f79595e4, "start download");
        if (Configuration.sContext == null) {
            try {
                Configuration.sContext = ((Application) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, new Object[0])).getApplicationContext();
            } catch (Exception unused) {
                return -100;
            }
        }
        if (downloadRequest != null && TextUtils.isEmpty(downloadRequest.downloadParam.fileStorePath) && (fileCacheManager = Configuration.fileCacheManager) != null) {
            downloadRequest.downloadParam.fileStorePath = fileCacheManager.getTmpCache();
        }
        if (downloadRequest == null || !downloadRequest.validate()) {
            if (downloadListener != null) {
                downloadListener.onFinish(false);
            }
            MonitorUtil.monitorFail("add", "paramerror", null, null);
            return -100;
        }
        BizPriManager bizPriManager = Configuration.bizPriManager;
        if (bizPriManager != null) {
            Param param = downloadRequest.downloadParam;
            param.priority = bizPriManager.getPriBy(param);
        }
        TaskParam taskParam = new TaskParam();
        int iNextId = IdGenerator.nextId();
        taskParam.taskId = iNextId;
        Dlog.d(TAG, ChannelsDetailActivity.f79595e4, "assign taskId", Integer.valueOf(iNextId));
        taskParam.userParam = downloadRequest.downloadParam;
        taskParam.inputItems = downloadRequest.downloadList;
        taskParam.listener = new ListenerWrapper(downloadRequest, downloadListener);
        ArrayList arrayList = new ArrayList();
        for (Item item : downloadRequest.downloadList) {
            SingleTask singleTask = new SingleTask();
            singleTask.item = item;
            Param param2 = downloadRequest.downloadParam;
            singleTask.param = param2;
            singleTask.storeDir = param2.fileStorePath;
            arrayList.add(singleTask);
        }
        Configuration.taskManager.addTask(arrayList, taskParam);
        return taskParam.taskId;
    }

    public int fetch(String str, String str2, DownloadListener downloadListener) {
        CloundConfigAdapter cloundConfigAdapter = Configuration.cloundConfigAdapter;
        DownloadRequest downloadRequest = cloundConfigAdapter == null ? new DownloadRequest(str) : cloundConfigAdapter.make(str);
        if (!TextUtils.isEmpty(str2)) {
            downloadRequest.downloadParam.bizId = str2;
        }
        return download(downloadRequest, downloadListener);
    }

    public String getLocalFile(String str, Item item) {
        return FileUtils.getLocalFile(str, item);
    }

    public void modify(int i10, ModifyParam modifyParam) {
        Configuration.taskManager.modifyTask(i10, modifyParam);
    }

    public void resume(int i10) {
        Configuration.taskManager.modifyTask(i10, 0);
    }

    public void suspend(int i10) {
        Configuration.taskManager.modifyTask(i10, 1);
    }
}
