package com.tencent.ugc;

import android.graphics.Bitmap;
import com.tencent.liteav.beauty.TXBeautyManager;
import com.tencent.liteav.beauty.TXBeautyManagerImpl;
import com.tencent.ugc.datereport.UGCDataReport;

/* JADX INFO: loaded from: classes4.dex */
public class UGCBeautyManager implements TXBeautyManager {
    private static final long MIN_REPORT_TIME_INTERVAL = 3000;
    private TXBeautyManagerImpl mBeautyManagerImpl;
    private long mLastBeautyStyleReportTs;
    private long mLastSetFilterReportTs;
    private long mLastSetRuddyLevelReportTs;
    private long mLastWhitenessLevelReportTs;

    public UGCBeautyManager(long j10) {
        this.mBeautyManagerImpl = new TXBeautyManagerImpl(j10);
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void enableSharpnessEnhancement(boolean z10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.enableSharpnessEnhancement(z10);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.setBeautyLevel(f10);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setBeautyStyle(int i10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.setBeautyStyle(i10);
        }
        if (this.mLastBeautyStyleReportTs <= 0 || System.currentTimeMillis() - this.mLastBeautyStyleReportTs >= 3000) {
            UGCDataReport.reportDAU(1057, i10, null);
            this.mLastBeautyStyleReportTs = System.currentTimeMillis();
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setChinLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setChinLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeAngleLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setEyeAngleLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeDistanceLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setEyeDistanceLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeLightenLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setEyeLightenLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setEyeScaleLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setEyeScaleLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceBeautyLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setFaceBeautyLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceNarrowLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setFaceNarrowLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceShortLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setFaceShortLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceSlimLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setFaceSlimLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setFaceVLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setFaceVLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilter(Bitmap bitmap) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.setFilter(bitmap);
        }
        if (this.mLastSetFilterReportTs <= 0 || System.currentTimeMillis() - this.mLastSetFilterReportTs >= 3000) {
            UGCDataReport.reportDAU(1060);
            this.mLastSetFilterReportTs = System.currentTimeMillis();
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setFilterStrength(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.setFilterStrength(f10);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setForeheadLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setForeheadLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setGreenScreenFile(String str) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setGreenScreenFile(str);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setLipsThicknessLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setLipsThicknessLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionMute(boolean z10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.setMotionMute(z10);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setMotionTmpl(String str) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.setMotionTmpl(str);
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setMouthShapeLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setMouthShapeLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNosePositionLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setNosePositionLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNoseSlimLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setNoseSlimLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setNoseWingLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setNoseWingLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setPounchRemoveLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setPounchRemoveLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setRuddyLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.setRuddyLevel(f10);
        }
        if (this.mLastSetRuddyLevelReportTs <= 0 || System.currentTimeMillis() - this.mLastSetRuddyLevelReportTs >= 3000) {
            UGCDataReport.reportDAU(1059);
            this.mLastSetRuddyLevelReportTs = System.currentTimeMillis();
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setSmileLinesRemoveLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setSmileLinesRemoveLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setToothWhitenLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setToothWhitenLevel(f10);
        }
        return 0;
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public void setWhitenessLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            tXBeautyManagerImpl.setWhitenessLevel(f10);
        }
        if (this.mLastWhitenessLevelReportTs <= 0 || System.currentTimeMillis() - this.mLastWhitenessLevelReportTs >= 3000) {
            UGCDataReport.reportDAU(1058);
            this.mLastWhitenessLevelReportTs = System.currentTimeMillis();
        }
    }

    @Override // com.tencent.liteav.beauty.TXBeautyManager
    public int setWrinkleRemoveLevel(float f10) {
        TXBeautyManagerImpl tXBeautyManagerImpl = this.mBeautyManagerImpl;
        if (tXBeautyManagerImpl != null) {
            return tXBeautyManagerImpl.setToothWhitenLevel(f10);
        }
        return 0;
    }
}
