package com.taobao.downloader.request;

import android.text.TextUtils;
import com.taobao.downloader.util.Dlog;
import j5.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class DownloadRequest {
    private static final String TAG = "DownloadRequest";
    public List<Item> downloadList = new ArrayList();
    public Param downloadParam = new Param();

    public DownloadRequest() {
    }

    public DownloadRequest(String str) {
        Item item = new Item();
        item.url = str;
        this.downloadList.add(item);
    }

    public DownloadRequest(String... strArr) {
        for (String str : strArr) {
            Item item = new Item();
            item.url = str;
            this.downloadList.add(item);
        }
    }

    public boolean validate() {
        List<Item> list;
        if (this.downloadParam == null || (list = this.downloadList) == null || list.isEmpty()) {
            Dlog.w(TAG, c.f124302j, "param is null");
            return false;
        }
        if (TextUtils.isEmpty(this.downloadParam.fileStorePath)) {
            Dlog.w(TAG, c.f124302j, "param fileStorePath is null");
            return false;
        }
        Iterator<Item> it = this.downloadList.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty(it.next().url)) {
                Dlog.w(TAG, c.f124302j, "param url is null");
                return false;
            }
        }
        ArrayList arrayList = new ArrayList();
        for (Item item : this.downloadList) {
            if (!arrayList.contains(item)) {
                arrayList.add(item);
            }
        }
        this.downloadList = arrayList;
        return true;
    }
}
