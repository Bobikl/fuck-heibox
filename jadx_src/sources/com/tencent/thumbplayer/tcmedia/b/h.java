package com.tencent.thumbplayer.tcmedia.b;

import android.text.TextUtils;
import com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip;
import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public class h extends d implements ITPMediaTrackClip, Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f102443a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f102444b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f102445c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f102446d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f102447e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f102448f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f102449g;

    private h() {
    }

    public h(String str, int i10) {
        this(str, i10, 0L, -1L);
    }

    public h(String str, int i10, long j10, long j11) {
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("TPMediaCompositionTrackClip : clipPath empty");
        }
        this.f102443a = i10;
        this.f102447e = str;
        this.f102445c = j10;
        this.f102446d = j11;
        if (j10 < 0) {
            this.f102445c = 0L;
        }
        if (j11 <= 0) {
            this.f102446d = getOriginalDurationMs();
        }
        this.f102444b = f.a(this.f102443a);
    }

    public void a(String str) {
        this.f102447e = str;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public ITPMediaTrackClip clone(int i10) {
        if (i10 != 3 && i10 != 2 && i10 != 1) {
            return null;
        }
        h hVar = new h();
        hVar.f102443a = i10;
        hVar.f102444b = f.a(this.f102443a);
        hVar.f102445c = this.f102445c;
        hVar.f102446d = this.f102446d;
        hVar.f102447e = this.f102447e;
        return hVar;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return this.f102444b == hVar.getClipId() && this.f102443a == hVar.getMediaType();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public int getClipId() {
        return this.f102444b;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getEndTimeMs() {
        return this.f102446d;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public String getFilePath() {
        return this.f102447e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public int getMediaType() {
        return this.f102443a;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getOriginalDurationMs() {
        return this.f102449g;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getStartPositionMs() {
        return this.f102448f;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public long getStartTimeMs() {
        return this.f102445c;
    }

    @Override // com.tencent.thumbplayer.tcmedia.b.d, com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaAsset
    public String getUrl() {
        return this.f102447e;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setCutTimeRange(long j10, long j11) {
        if (j10 >= getOriginalDurationMs()) {
            throw new IllegalArgumentException("setCutTimeRange: Start time is greater than duration");
        }
        if (j11 > getOriginalDurationMs()) {
            throw new IllegalArgumentException("setCutTimeRange: Start time is greater than duration");
        }
        if (j10 < 0) {
            j10 = 0;
        }
        if (j11 <= 0) {
            j11 = getOriginalDurationMs();
        }
        if (j10 >= j11) {
            throw new IllegalArgumentException("setCutTimeRange: Start time is greater than end time");
        }
        this.f102445c = j10;
        this.f102446d = j11;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setOriginalDurationMs(long j10) {
        this.f102449g = j10;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.composition.ITPMediaTrackClip
    public void setStartPositionMs(long j10) {
        this.f102448f = j10;
    }
}
