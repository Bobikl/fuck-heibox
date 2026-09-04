package com.taobao.downloader.adpater;

import com.taobao.downloader.request.ModifyParam;
import com.taobao.downloader.request.task.SingleTask;
import com.taobao.downloader.request.task.TaskParam;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public interface TaskManager {
    void addTask(List<SingleTask> list, TaskParam taskParam);

    void modifyTask(int i10, int i11);

    void modifyTask(int i10, ModifyParam modifyParam);
}
