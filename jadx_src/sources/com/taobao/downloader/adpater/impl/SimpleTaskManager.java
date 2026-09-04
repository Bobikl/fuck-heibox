package com.taobao.downloader.adpater.impl;

import com.taobao.downloader.adpater.TaskManager;
import com.taobao.downloader.download.IDownloader;
import com.taobao.downloader.request.ModifyParam;
import com.taobao.downloader.request.task.SingleTask;
import com.taobao.downloader.request.task.TaskParam;
import com.taobao.downloader.util.ThreadUtil;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: classes4.dex */
public class SimpleTaskManager implements TaskManager {
    private ConcurrentHashMap<Integer, IDownloader> downloaderMap = new ConcurrentHashMap<>();

    @Override // com.taobao.downloader.adpater.TaskManager
    public void addTask(final List<SingleTask> list, final TaskParam taskParam) {
        final IDownloader downloader = new SimpleDownloadFactory().getDownloader(taskParam.userParam);
        this.downloaderMap.put(Integer.valueOf(taskParam.taskId), downloader);
        ThreadUtil.execute(new Runnable() { // from class: com.taobao.downloader.adpater.impl.SimpleTaskManager.1
            @Override // java.lang.Runnable
            public void run() {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    downloader.download((SingleTask) it.next(), taskParam.listener);
                }
                SimpleTaskManager.this.downloaderMap.remove(Integer.valueOf(taskParam.taskId));
            }
        }, false);
    }

    @Override // com.taobao.downloader.adpater.TaskManager
    public void modifyTask(int i10, int i11) {
        IDownloader iDownloader = this.downloaderMap.get(Integer.valueOf(i10));
        if (iDownloader != null) {
            if (1 == i11) {
                iDownloader.pause();
            } else if (2 == i11) {
                iDownloader.cancel();
            }
        }
    }

    @Override // com.taobao.downloader.adpater.TaskManager
    public void modifyTask(int i10, ModifyParam modifyParam) {
        modifyTask(i10, modifyParam.status.intValue());
    }
}
