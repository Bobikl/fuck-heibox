package com.tencent.thumbplayer.tcmedia.b;

import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class a extends d implements ITPMediaTrackClip, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102421a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102422b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f102423c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f102424d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f102425e;

    public a(int i10) {
        this.f102421a = i10;
        this.f102422b = f.a(i10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public ITPMediaTrackClip clone(int i10) {
        if (i10 != 3 && i10 != 2 && i10 != 1) {
            return null;
        }
        a aVar = new a(i10);
        aVar.f102422b = f.a(i10);
        aVar.f102423c = this.f102423c;
        aVar.f102424d = this.f102424d;
        return aVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f102422b == aVar.getClipId() && this.f102421a == aVar.getMediaType();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public int getClipId() {
        return this.f102422b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getEndTimeMs() {
        return this.f102424d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public String getFilePath() {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return this.f102421a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getOriginalDurationMs() {
        return this.f102424d - this.f102423c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getStartPositionMs() {
        return this.f102425e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getStartTimeMs() {
        return this.f102423c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        return null;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setCutTimeRange(long j10, long j11) {
        if (j10 < 0) {
            j10 = 0;
        }
        if (j10 >= j11) {
            throw new IllegalArgumentException("setCutTimeRange: Start time is greater than end time");
        }
        this.f102423c = j10;
        this.f102424d = j11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setOriginalDurationMs(long j10) {
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setStartPositionMs(long j10) {
        this.f102425e = j10;
    }
}
