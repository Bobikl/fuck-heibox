package com.tencent.vasdolly.helper;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.util.Log;
import com.tencent.vasdolly.reader.ChannelReader;
import com.tencent.vasdolly.reader.IdValueReader;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class ChannelReaderUtil {
    private static final String TAG = "ChannelReaderUtil";
    private static String mChannelCache;

    public static Map<Integer, ByteBuffer> getAllIdValueMap(Context context) {
        return IdValueReader.getAllIdValueMap(new File(getApkPath(context)));
    }

    private static String getApkPath(Context context) {
        try {
            ApplicationInfo applicationInfo = context.getApplicationInfo();
            if (applicationInfo == null) {
                return null;
            }
            return applicationInfo.sourceDir;
        } catch (Throwable th2) {
            th2.printStackTrace();
            return null;
        }
    }

    public static byte[] getByteValueById(Context context, int i10) {
        return IdValueReader.getByteValueById(new File(getApkPath(context)), i10);
    }

    public static String getChannel(Context context) {
        if (mChannelCache == null) {
            String channelByV2 = getChannelByV2(context);
            if (channelByV2 == null) {
                channelByV2 = getChannelByV1(context);
            }
            mChannelCache = channelByV2;
        }
        return mChannelCache;
    }

    public static String getChannelByV1(Context context) {
        String channelByV1 = ChannelReader.getChannelByV1(new File(getApkPath(context)));
        Log.i(TAG, "getChannelByV1 , channel = " + channelByV1);
        return channelByV1;
    }

    public static String getChannelByV2(Context context) {
        String channelByV2 = ChannelReader.getChannelByV2(new File(getApkPath(context)));
        Log.i(TAG, "getChannelByV2 , channel = " + channelByV2);
        return channelByV2;
    }

    public static String getStringValueById(Context context, int i10) {
        String stringValueById = IdValueReader.getStringValueById(new File(getApkPath(context)), i10);
        Log.i(TAG, "id = " + i10 + " , value = " + stringValueById);
        return stringValueById;
    }
}
