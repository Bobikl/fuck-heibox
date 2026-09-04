package com.tencent.rtmp.downloader;

import com.tencent.liteav.txcvodplayer.b.d;
import com.tencent.rtmp.TXPlayerDrmBuilder;
import com.tencent.rtmp.downloader.a.a;

/* JADX INFO: loaded from: classes4.dex */
public class TXVodDownloadMediaInfo {
    public static final int STATE_ERROR = 3;
    public static final int STATE_FINISH = 4;
    public static final int STATE_INIT = 0;
    public static final int STATE_START = 1;
    public static final int STATE_STOP = 2;
    protected a dataSource;
    protected int downloadSegments;

    @Deprecated
    protected int downloadSize;
    protected TXPlayerDrmBuilder drmBuilder;
    protected int duration;

    @Deprecated
    protected d netApi;
    protected String playPath;
    protected int playableDuration;
    protected long playableSize;
    protected float progress;
    protected int segments;

    @Deprecated
    protected int size;
    protected int speed;
    protected long totalSize;
    protected String url;
    protected String userName = "default";
    protected int tid = -1;
    protected int downloadState = 0;
    protected long preferredResolution = 921600;
    protected boolean isResourceBroken = false;

    public TXVodDownloadDataSource getDataSource() {
        return this.dataSource;
    }

    public long getDownloadSize() {
        return (this.playableSize != 0 || this.totalSize <= 0 || getProgress() <= 0.0f) ? Math.min(this.playableSize, this.totalSize) : Math.min((long) (this.totalSize * getProgress()), this.totalSize);
    }

    public int getDownloadState() {
        return this.downloadState;
    }

    public TXPlayerDrmBuilder getDrmBuilder() {
        return this.drmBuilder;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getPlayPath() {
        return this.playPath;
    }

    public int getPlayableDuration() {
        return (this.playableDuration != 0 || this.duration <= 0 || getProgress() <= 0.0f) ? this.playableDuration : Math.min((int) (this.duration * getProgress()), this.duration);
    }

    public long getPreferredResolution() {
        return this.preferredResolution;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0029  */
    public float getProgress() {
        float fMin;
        int i10;
        int i11;
        int i12 = this.playableDuration;
        if (i12 <= 0 || (i11 = this.duration) <= 0) {
            long j10 = this.playableSize;
            if (j10 > 0) {
                long j11 = this.totalSize;
                if (j11 > 0) {
                    fMin = Math.min(j10 / j11, 1.0f);
                } else {
                    fMin = 0.0f;
                }
            } else {
                fMin = 0.0f;
            }
        } else {
            fMin = Math.min(i12 / i11, 1.0f);
        }
        int i13 = this.downloadSegments;
        if (i13 > 0 && (i10 = this.segments) > 0) {
            fMin = Math.min(i13 / i10, 1.0f);
        }
        float f10 = this.progress;
        return f10 > 0.0f ? Math.max(fMin, f10) : fMin;
    }

    public long getSize() {
        return this.totalSize;
    }

    public int getSpeed() {
        return this.speed;
    }

    public int getTaskId() {
        return this.tid;
    }

    public String getUrl() {
        return this.url;
    }

    public String getUserName() {
        a aVar = this.dataSource;
        return aVar != null ? aVar.getUserName() : this.userName;
    }

    public boolean isDownloadFinished() {
        return this.downloadState == 4;
    }

    public boolean isResourceBroken() {
        return this.isResourceBroken;
    }
}
