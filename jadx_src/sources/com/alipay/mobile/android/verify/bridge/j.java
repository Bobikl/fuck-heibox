package com.alipay.mobile.android.verify.bridge;

import android.content.Context;
import android.text.TextUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: compiled from: Utils.java */
/* JADX INFO: loaded from: classes6.dex */
public class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ExecutorService f39362a = Executors.newCachedThreadPool();

    public static JSONObject a(String str) {
        if (TextUtils.isEmpty(str)) {
            com.alipay.mobile.android.verify.logger.f.k("Utils").d("empty json string", new Object[0]);
            return null;
        }
        try {
            return JSON.parseObject(str);
        } catch (Exception e10) {
            com.alipay.mobile.android.verify.logger.f.k("Utils").k(e10, "parse object error", new Object[0]);
            return null;
        }
    }

    public static String b(Context context) {
        String line;
        InputStream inputStreamOpen = null;
        try {
            inputStreamOpen = context.getAssets().open("bridge/bridge.js");
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen));
            StringBuilder sb2 = new StringBuilder();
            do {
                line = bufferedReader.readLine();
                if (!TextUtils.isEmpty(line)) {
                    sb2.append(line);
                }
            } while (!TextUtils.isEmpty(line));
            bufferedReader.close();
            String string = sb2.toString();
            if (inputStreamOpen != null) {
                try {
                } catch (IOException e10) {
                    com.alipay.mobile.android.verify.logger.f.k("Utils").k(e10, "close assets stream got error", new Object[0]);
                }
            }
            return string;
        } catch (IOException e11) {
            com.alipay.mobile.android.verify.logger.f.k("Utils").k(e11, "load bridge from assets got error", new Object[0]);
            if (inputStreamOpen != null) {
                try {
                } catch (IOException e12) {
                    com.alipay.mobile.android.verify.logger.f.k("Utils").k(e12, "close assets stream got error", new Object[0]);
                }
            }
            return "";
        } finally {
            if (inputStreamOpen != null) {
                try {
                    inputStreamOpen.close();
                } catch (IOException e13) {
                    com.alipay.mobile.android.verify.logger.f.k("Utils").k(e13, "close assets stream got error", new Object[0]);
                }
            }
        }
    }

    public static void c(Runnable runnable) {
        try {
            f39362a.submit(runnable);
        } catch (Exception e10) {
            com.alipay.mobile.android.verify.logger.f.k("Utils").k(e10, "execute runnable got error", new Object[0]);
        }
    }
}
