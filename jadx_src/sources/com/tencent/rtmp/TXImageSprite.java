package com.tencent.rtmp;

import android.content.Context;
import android.graphics.Bitmap;
import bb.c;
import com.tencent.liteav.base.datareport.Event4XReporter;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.ugc.datereport.UGCDataReportDef;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class TXImageSprite {
    private static final String TAG = "TXImageSprite";
    private Context mContext;
    private com.tencent.rtmp.a.a mImageSprite;

    public TXImageSprite(Context context) {
        this.mContext = context.getApplicationContext();
    }

    public Bitmap getThumbnail(float f10) {
        com.tencent.rtmp.a.a aVar = this.mImageSprite;
        if (aVar != null) {
            return aVar.getThumbnail(f10);
        }
        return null;
    }

    public void release() {
        com.tencent.rtmp.a.a aVar = this.mImageSprite;
        if (aVar != null) {
            aVar.release();
            this.mImageSprite = null;
        }
    }

    public void setVTTUrlAndImageUrls(String str, List<String> list) {
        LiteavLog.i(TAG, "setVTTUrlAndImageUrls, vttUrl: " + str + " images: " + list);
        if (this.mImageSprite != null) {
            release();
        }
        if (str == null || list == null || list.size() == 0) {
            return;
        }
        new Event4XReporter(UGCDataReportDef.COMMAND_ID_DAU, 1004, "", true, 1).reportDau(c.b.Vq, 0, "");
        com.tencent.rtmp.a.a aVar = new com.tencent.rtmp.a.a(this.mContext);
        this.mImageSprite = aVar;
        aVar.setVTTUrlAndImageUrls(str, list);
    }
}
