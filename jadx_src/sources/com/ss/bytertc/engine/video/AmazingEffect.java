package com.ss.bytertc.engine.video;

import android.util.Log;
import com.ss.bytertc.engine.NativeAmazingEffectFunctions;
import com.ss.bytertc.engine.type.ErrorCode;
import com.ss.bytertc.engine.utils.LogUtil;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class AmazingEffect extends IAmazingEffect {
    private static final String TAG = "AmazingEffect";
    private static boolean mLibraryLoaded = false;
    private static final String sSoLibraryName = "volcenginertc";
    private long mNativeAmazingEffect;

    static {
        try {
            System.loadLibrary("effect");
            System.loadLibrary("volcenginertc");
            mLibraryLoaded = true;
            Log.i(TAG, "Loading library: effect");
        } catch (UnsatisfiedLinkError e10) {
            mLibraryLoaded = false;
            Log.e(TAG, "Failed to load native library: effect", e10);
        }
    }

    public AmazingEffect(long j10) {
        this.mNativeAmazingEffect = j10;
        LogUtil.i(TAG, "create amazing effect");
    }

    private boolean amazingEffectInvalid() {
        return this.mNativeAmazingEffect == 0;
    }

    public static String getEffectSDKVersion() {
        return !mLibraryLoaded ? "unkonw" : NativeAmazingEffectFunctions.nativeGetEffectSDKVersion();
    }

    @Override // com.ss.bytertc.engine.video.IAmazingEffect
    public int appendEffectNodes(List<String> list) {
        if (amazingEffectInvalid()) {
            LogUtil.e(TAG, "invalid, appendEffectNodes failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        }
        if (list == null) {
            LogUtil.e(TAG, "param invalid, appendEffectNodes failed.");
            return -1;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        return NativeAmazingEffectFunctions.nativeAppendAmazingEffectNodes(this.mNativeAmazingEffect, strArr);
    }

    public void dispose() {
        LogUtil.i(TAG, "dispose amazing effect");
        this.mNativeAmazingEffect = 0L;
    }

    @Override // com.ss.bytertc.engine.video.IAmazingEffect
    public int removeEffectNodes(List<String> list) {
        if (amazingEffectInvalid()) {
            LogUtil.e(TAG, "invalid, removeEffectNodes failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        }
        if (list == null) {
            LogUtil.e(TAG, "param invalid, appendEffectNodes failed.");
            return -1;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        return NativeAmazingEffectFunctions.nativeRemoveAmazingEffectNodes(this.mNativeAmazingEffect, strArr);
    }

    @Override // com.ss.bytertc.engine.video.IAmazingEffect
    public int replaceEffectNodes(List<String> list, List<String> list2) {
        if (amazingEffectInvalid()) {
            LogUtil.e(TAG, "invalid, removeEffectNodes failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        }
        if (list == null || list2 == null) {
            LogUtil.e(TAG, "param invalid, appendEffectNodes failed.");
            return -1;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        String[] strArr2 = new String[list2.size()];
        list2.toArray(strArr2);
        return NativeAmazingEffectFunctions.nativeReplaceAmazingEffectNodes(this.mNativeAmazingEffect, strArr, strArr2);
    }

    @Override // com.ss.bytertc.engine.video.IAmazingEffect
    public int setAlgoModelResourceFinder(IRtcResourceFinder iRtcResourceFinder) {
        if (amazingEffectInvalid()) {
            LogUtil.e(TAG, "invalid, setAlgoModelResourceFinder failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        }
        EffectResourceFinderAdapter.sFinder = iRtcResourceFinder;
        return 0;
    }

    @Override // com.ss.bytertc.engine.video.IAmazingEffect
    public int setEffectNodes(List<String> list) {
        if (amazingEffectInvalid()) {
            LogUtil.e(TAG, "invalid, setEffectNodes failed.");
            return ErrorCode.ERROR_CODE_KICKED_OUT;
        }
        if (list == null) {
            LogUtil.e(TAG, "param invalid, appendEffectNodes failed.");
            return -1;
        }
        String[] strArr = new String[list.size()];
        list.toArray(strArr);
        return NativeAmazingEffectFunctions.nativeSetAmazingEffectNodes(this.mNativeAmazingEffect, strArr);
    }

    @Override // com.ss.bytertc.engine.video.IAmazingEffect
    public void setVirtualBackgroundFilePath(String str, int i10) {
        if (amazingEffectInvalid()) {
            LogUtil.e(TAG, "invalid, updateEffectNode failed.");
        } else {
            NativeAmazingEffectFunctions.nativeSetVirtualBackgroundFilePath(this.mNativeAmazingEffect, str, i10);
        }
    }

    @Override // com.ss.bytertc.engine.video.IAmazingEffect
    public int updateEffectNode(String str, String str2, float f10) {
        if (!amazingEffectInvalid()) {
            return NativeAmazingEffectFunctions.nativeUpdateAmazingEffectNode(this.mNativeAmazingEffect, str, str2, f10);
        }
        LogUtil.e(TAG, "invalid, updateEffectNode failed.");
        return ErrorCode.ERROR_CODE_KICKED_OUT;
    }
}
