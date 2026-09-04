package com.tencent.thumbplayer.tcmedia.f.a;

import android.content.Context;
import com.tencent.thumbplayer.tcmedia.api.TPTimeRange;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester;
import com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequesterListener;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.api.richmedia.TPRichMediaFeatureData;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeature;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeRichMediaFeatureData;
import com.tencent.thumbplayer.tcmedia.core.richmedia.TPNativeTimeRange;
import com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequester;
import com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener;
import com.tencent.thumbplayer.tcmedia.core.richmedia.async.TPNativeRichMediaAsyncRequester;
import com.tencent.thumbplayer.tcmedia.utils.TPLogUtil;

/* JADX INFO: loaded from: classes4.dex */
public class a implements ITPRichMediaAsyncRequester {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ITPNativeRichMediaAsyncRequester f102620a;

    /* JADX INFO: renamed from: com.tencent.thumbplayer.tcmedia.f.a.a$a, reason: collision with other inner class name */
    public class C1020a implements ITPNativeRichMediaAsyncRequesterListener {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ITPRichMediaAsyncRequesterListener f102622b;

        public C1020a(ITPRichMediaAsyncRequesterListener iTPRichMediaAsyncRequesterListener) {
            this.f102622b = iTPRichMediaAsyncRequesterListener;
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onFeatureDataRequestFailure(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i10, int i11, int i12) {
            this.f102622b.onFeatureDataRequestFailure(a.this, i10, i11, i12);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onFeatureDataRequestSuccess(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i10, int i11, TPNativeRichMediaFeatureData tPNativeRichMediaFeatureData) {
            this.f102622b.onFeatureDataRequestSuccess(a.this, i10, i11, new TPRichMediaFeatureData(tPNativeRichMediaFeatureData));
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onRequesterError(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester, int i10) {
            this.f102622b.onRequesterError(a.this, i10);
        }

        @Override // com.tencent.thumbplayer.tcmedia.core.richmedia.async.ITPNativeRichMediaAsyncRequesterListener
        public void onRequesterPrepared(ITPNativeRichMediaAsyncRequester iTPNativeRichMediaAsyncRequester) {
            this.f102622b.onRequesterPrepared(a.this);
        }
    }

    public a(Context context) {
        this.f102620a = new TPNativeRichMediaAsyncRequester(context);
    }

    private TPRichMediaFeature[] a(TPNativeRichMediaFeature[] tPNativeRichMediaFeatureArr) {
        if (tPNativeRichMediaFeatureArr == null || tPNativeRichMediaFeatureArr.length == 0) {
            return new TPRichMediaFeature[0];
        }
        TPRichMediaFeature[] tPRichMediaFeatureArr = new TPRichMediaFeature[tPNativeRichMediaFeatureArr.length];
        for (int i10 = 0; i10 < tPNativeRichMediaFeatureArr.length; i10++) {
            tPRichMediaFeatureArr[i10] = new TPRichMediaFeature(tPNativeRichMediaFeatureArr[i10]);
        }
        return tPRichMediaFeatureArr;
    }

    private TPNativeTimeRange[] a(TPTimeRange[] tPTimeRangeArr) {
        if (tPTimeRangeArr == null || tPTimeRangeArr.length == 0) {
            return new TPNativeTimeRange[0];
        }
        TPNativeTimeRange[] tPNativeTimeRangeArr = new TPNativeTimeRange[tPTimeRangeArr.length];
        for (int i10 = 0; i10 < tPTimeRangeArr.length; i10++) {
            TPTimeRange tPTimeRange = tPTimeRangeArr[i10];
            if (tPTimeRange == null) {
                return new TPNativeTimeRange[0];
            }
            tPNativeTimeRangeArr[i10] = new TPNativeTimeRange(tPTimeRange.getStartTimeMs(), tPTimeRange.getEndTimeMs());
        }
        return tPNativeTimeRangeArr;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public void cancelRequest(int i10) {
        this.f102620a.cancelRequest(i10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public TPRichMediaFeature[] getFeatures() {
        return a(this.f102620a.getFeatures());
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public void prepareAsync() {
        this.f102620a.prepareAsync();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public void release() {
        this.f102620a.release();
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeMs(int i10, long j10) {
        return this.f102620a.requestFeatureDataAsyncAtTimeMs(i10, j10);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeMsArray(int i10, long[] jArr) {
        return this.f102620a.requestFeatureDataAsyncAtTimeMsArray(i10, jArr);
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeRange(int i10, TPTimeRange tPTimeRange) {
        if (tPTimeRange != null) {
            return this.f102620a.requestFeatureDataAsyncAtTimeRange(i10, new TPNativeTimeRange(tPTimeRange.getStartTimeMs(), tPTimeRange.getEndTimeMs()));
        }
        TPLogUtil.w("TPRichMediaAsyncRequester", "requestFeatureDataAsyncAtTimeRange, timeRange == null");
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public int requestFeatureDataAsyncAtTimeRanges(int i10, TPTimeRange[] tPTimeRangeArr) {
        TPNativeTimeRange[] tPNativeTimeRangeArrA = a(tPTimeRangeArr);
        if (tPNativeTimeRangeArrA.length != 0) {
            return this.f102620a.requestFeatureDataAsyncAtTimeRanges(i10, tPNativeTimeRangeArrA);
        }
        TPLogUtil.w("TPRichMediaAsyncRequester", "requestFeatureDataAsyncAtTimeRanges, toNativeTimeRanges return empty array");
        return -1;
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public void setRequesterListener(ITPRichMediaAsyncRequesterListener iTPRichMediaAsyncRequesterListener) {
        this.f102620a.setRequesterListener(new C1020a(iTPRichMediaAsyncRequesterListener));
    }

    @Override // com.tencent.thumbplayer.tcmedia.api.richmedia.ITPRichMediaAsyncRequester
    public void setRichMediaSource(String str) {
        this.f102620a.setRichMediaSource(str);
    }
}
