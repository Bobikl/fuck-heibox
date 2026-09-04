package com.tencent.ugc.videoprocessor.watermark;

import android.text.TextUtils;
import com.max.mediaselector.lib.config.f;
import com.tencent.liteav.base.util.LiteavLog;
import com.tencent.liteav.base.util.Size;
import com.tencent.ugc.TXVideoEditConstants;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPaster;
import com.tencent.ugc.videoprocessor.watermark.data.AnimatedPasterJsonConfig;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class AnimatedPasterFilterChain extends PasterBase {
    private static final String TAG = "AnimatedPasterFilterChain";
    private List<TXVideoEditConstants.TXAnimatedPaster> mAnimatedPasterList;
    private CopyOnWriteArrayList<AnimatedPaster> mNormalizedList = new CopyOnWriteArrayList<>();

    private TXVideoEditConstants.TXAnimatedPaster construct(TXVideoEditConstants.TXAnimatedPaster tXAnimatedPaster, TXVideoEditConstants.TXRect tXRect) {
        TXVideoEditConstants.TXAnimatedPaster tXAnimatedPaster2 = new TXVideoEditConstants.TXAnimatedPaster();
        tXAnimatedPaster2.frame = tXRect;
        tXAnimatedPaster2.animatedPasterPathFolder = tXAnimatedPaster.animatedPasterPathFolder;
        tXAnimatedPaster2.startTime = tXAnimatedPaster.startTime;
        tXAnimatedPaster2.endTime = tXAnimatedPaster.endTime;
        tXAnimatedPaster2.rotation = tXAnimatedPaster.rotation;
        return tXAnimatedPaster2;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0047 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r1v3 */
    private String parseJsonFromFile(String str) throws Throwable {
        IOException e10;
        BufferedReader bufferedReader;
        String str2 = "";
        ?? r10 = 0;
        try {
            try {
                bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            break;
                        }
                        str2 = str2 + line;
                    } catch (IOException e11) {
                        e10 = e11;
                        LiteavLog.e(TAG, "read file failed.", e10);
                        if (bufferedReader != null) {
                        }
                        return str2;
                    }
                }
                bufferedReader.close();
            } catch (Throwable th2) {
                th = th2;
                r10 = str;
                if (r10 != 0) {
                    try {
                        r10.close();
                    } catch (IOException unused) {
                    }
                }
                throw th;
            }
        } catch (IOException e12) {
            e10 = e12;
            bufferedReader = null;
        } catch (Throwable th3) {
            th = th3;
            if (r10 != 0) {
                r10.close();
            }
            throw th;
        }
        try {
            bufferedReader.close();
        } catch (IOException unused2) {
        }
        return str2;
    }

    private AnimatedPasterJsonConfig parsePaster(String str) throws Throwable {
        String jsonFromFile = parseJsonFromFile(str + AnimatedPasterJsonConfig.FILE_NAME);
        if (TextUtils.isEmpty(jsonFromFile)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(jsonFromFile);
            AnimatedPasterJsonConfig animatedPasterJsonConfig = new AnimatedPasterJsonConfig();
            try {
                animatedPasterJsonConfig.mName = jSONObject.getString("name");
                animatedPasterJsonConfig.mCount = jSONObject.getInt("count");
                animatedPasterJsonConfig.mPeriod = jSONObject.getInt("period");
                animatedPasterJsonConfig.mWidth = jSONObject.getInt("width");
                animatedPasterJsonConfig.mHeight = jSONObject.getInt("height");
                animatedPasterJsonConfig.mKeyframe = jSONObject.getInt(AnimatedPasterJsonConfig.CONFIG_KEYFRAME);
                JSONArray jSONArray = jSONObject.getJSONArray(AnimatedPasterJsonConfig.CONFIG_KEYFRAME_ARRAY);
                for (int i10 = 0; i10 < animatedPasterJsonConfig.mCount; i10++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i10);
                    AnimatedPasterJsonConfig.PasterPicture pasterPicture = new AnimatedPasterJsonConfig.PasterPicture();
                    pasterPicture.mPictureName = jSONObject2.getString("picture");
                    animatedPasterJsonConfig.mFrameArray.add(pasterPicture);
                }
            } catch (JSONException e10) {
                LiteavLog.e(TAG, "failed to get value from json.", e10);
            }
            return animatedPasterJsonConfig;
        } catch (JSONException e11) {
            LiteavLog.e(TAG, "parse invalid json string", e11);
            return null;
        }
    }

    @Override // com.tencent.ugc.videoprocessor.watermark.PasterBase
    public void clear() {
        super.clear();
        this.mNormalizedList.clear();
        List<TXVideoEditConstants.TXAnimatedPaster> list = this.mAnimatedPasterList;
        if (list != null) {
            list.clear();
        }
        this.mAnimatedPasterList = null;
    }

    public List<AnimatedPaster> getAnimatedPasterList() {
        return this.mNormalizedList;
    }

    @Override // com.tencent.ugc.videoprocessor.watermark.PasterBase
    public void normalized(int i10, int i11, int i12) throws Throwable {
        int i13;
        int i14;
        List<TXVideoEditConstants.TXAnimatedPaster> list = this.mAnimatedPasterList;
        if (list == null || list.size() == 0) {
            return;
        }
        Iterator<TXVideoEditConstants.TXAnimatedPaster> it = this.mAnimatedPasterList.iterator();
        while (it.hasNext()) {
            TXVideoEditConstants.TXAnimatedPaster next = it.next();
            if (next != null) {
                TXVideoEditConstants.TXAnimatedPaster tXAnimatedPasterConstruct = construct(next, calculateRect(i10, i11, i12, next.frame));
                AnimatedPasterJsonConfig paster = parsePaster(tXAnimatedPasterConstruct.animatedPasterPathFolder);
                if (paster != null && (i13 = paster.mCount) > 0) {
                    long j10 = tXAnimatedPasterConstruct.startTime;
                    long j11 = tXAnimatedPasterConstruct.endTime - j10;
                    int i15 = paster.mPeriod;
                    int i16 = i15 / i13;
                    int i17 = (int) (j11 / ((long) i15));
                    if (j11 % ((long) i15) > 0) {
                        i17++;
                    }
                    int i18 = 0;
                    while (i18 < i17) {
                        int i19 = 0;
                        while (true) {
                            if (i19 >= paster.mCount) {
                                i14 = i18;
                                break;
                            }
                            long j12 = ((long) i16) + j10;
                            i14 = i18;
                            if (j12 > tXAnimatedPasterConstruct.endTime) {
                                break;
                            }
                            AnimatedPasterJsonConfig.PasterPicture pasterPicture = paster.mFrameArray.get(i19);
                            AnimatedPaster animatedPaster = new AnimatedPaster();
                            animatedPaster.mPasterPath = tXAnimatedPasterConstruct.animatedPasterPathFolder + pasterPicture.mPictureName + f.f75141t;
                            animatedPaster.mFrame = tXAnimatedPasterConstruct.frame;
                            animatedPaster.mStartTime = j10;
                            animatedPaster.mEndTime = j12;
                            animatedPaster.mRotation = tXAnimatedPasterConstruct.rotation;
                            this.mNormalizedList.add(animatedPaster);
                            j10 = animatedPaster.mEndTime;
                            i19++;
                            i18 = i14;
                            it = it;
                            paster = paster;
                        }
                        i18 = i14 + 1;
                        it = it;
                        paster = paster;
                    }
                }
            }
        }
    }

    public void setAnimatedPasterList(List<TXVideoEditConstants.TXAnimatedPaster> list, Size size) {
        this.mRenderSize = size;
        this.mAnimatedPasterList = list;
        this.mNormalizedList.clear();
    }
}
