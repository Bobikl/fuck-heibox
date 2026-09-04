package com.ishumei.smantifraud.l1111l111111Il;

import android.text.TextUtils;
import com.tencent.cos.xml.common.COSRequestHeaderKey;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class l11l11IlIIll implements Runnable {
    private static String l1111l111111Il = "sm-async-thread";
    private static final int l111l11111I1l = 3;
    private static final String l111l11111lIl = "POST";
    private String l111l1111lI1l;
    private l111l11111Il l111l1111lIl;
    private String l111l1111llIl;
    private int l11l1111lIIl;
    private static final int[] l111l11111Il = {2000, 5000, 15000, 30000};
    private static Executor l111l1111l1Il = new ThreadPoolExecutor(0, 4, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(20), new ThreadFactory() { // from class: com.ishumei.smantifraud.l1111l111111Il.l11l11IlIIll.1
        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "sm-async-thread");
        }
    }, new ThreadPoolExecutor.DiscardOldestPolicy());

    private l11l11IlIIll(String str, String str2, l111l11111Il l111l11111il) {
        this.l111l1111lI1l = str;
        this.l111l1111llIl = str2;
        this.l111l1111lIl = l111l11111il;
    }

    public static void l1111l111111Il(String str, String str2, l111l11111Il l111l11111il) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || l111l11111il == null || !l111l11111il.l111l1111lI1l()) {
            return;
        }
        l111l1111l1Il.execute(new l11l11IlIIll(str, str2, l111l11111il));
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0163 A[Catch: Exception -> 0x016b, TryCatch #5 {Exception -> 0x016b, blocks: (B:74:0x015e, B:76:0x0163, B:78:0x0168), top: B:105:0x015e }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0168 A[Catch: Exception -> 0x016b, TRY_LEAVE, TryCatch #5 {Exception -> 0x016b, blocks: (B:74:0x015e, B:76:0x0163, B:78:0x0168), top: B:105:0x015e }] */
    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        InputStream inputStream;
        OutputStream outputStream;
        InputStream inputStream2;
        InputStream inputStream3;
        try {
            JSONObject jSONObject = new JSONObject(this.l111l1111llIl);
            jSONObject.put("retry", 1);
            String string = jSONObject.toString();
            while (!com.ishumei.smantifraud.l111l11111lIl.l111l1111l1Il.l111l1111l1Il) {
                HttpURLConnection httpURLConnection = null;
                inputStream = null;
                inputStream = null;
                InputStream inputStream4 = null;
                HttpURLConnection httpURLConnection2 = null;
                HttpURLConnection httpURLConnection3 = null;
                try {
                    int i10 = this.l11l1111lIIl;
                    Thread.sleep(i10 >= 3 ? l111l11111Il[3] : l111l11111Il[i10 % 3]);
                    if (this.l111l1111lIl.l111l11111lIl() >= 0 && this.l11l1111lIIl > this.l111l1111lIl.l111l11111lIl()) {
                        this.l11l1111lIIl++;
                        return;
                    }
                    HttpURLConnection httpURLConnection4 = (HttpURLConnection) new URL(this.l111l1111lI1l).openConnection();
                    try {
                        httpURLConnection4.setDoInput(true);
                        httpURLConnection4.setDoOutput(true);
                        httpURLConnection4.setUseCaches(false);
                        httpURLConnection4.setInstanceFollowRedirects(true);
                        httpURLConnection4.setRequestMethod("POST");
                        httpURLConnection4.setRequestProperty("Content-Type", COSRequestHeaderKey.APPLICATION_OCTET_STREAM);
                        httpURLConnection4.setRequestProperty("Connection", "Close");
                        httpURLConnection4.setConnectTimeout(30000);
                        httpURLConnection4.setReadTimeout(30000);
                        httpURLConnection4.setFixedLengthStreamingMode(string.getBytes().length);
                        httpURLConnection4.connect();
                        outputStream = httpURLConnection4.getOutputStream();
                        try {
                            outputStream.write(string.getBytes());
                            outputStream.flush();
                            if (httpURLConnection4.getResponseCode() != 200) {
                                this.l11l1111lIIl++;
                                try {
                                    httpURLConnection4.disconnect();
                                    outputStream.close();
                                } catch (Exception unused) {
                                }
                            } else {
                                inputStream4 = httpURLConnection4.getInputStream();
                                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream4));
                                StringBuilder sb2 = new StringBuilder();
                                while (true) {
                                    String line = bufferedReader.readLine();
                                    if (line == null) {
                                        break;
                                    } else {
                                        sb2.append(line);
                                    }
                                }
                                JSONObject jSONObject2 = new JSONObject(sb2.toString());
                                if (jSONObject2.optInt("code") == 1902) {
                                    this.l11l1111lIIl++;
                                    try {
                                        httpURLConnection4.disconnect();
                                        outputStream.close();
                                        if (inputStream4 != null) {
                                            inputStream4.close();
                                            return;
                                        }
                                        return;
                                    } catch (Exception unused2) {
                                        return;
                                    }
                                }
                                if (jSONObject2.has("detail")) {
                                    JSONObject jSONObjectOptJSONObject = jSONObject2.optJSONObject("detail");
                                    if (jSONObjectOptJSONObject != null && !TextUtils.isEmpty(jSONObjectOptJSONObject.optString("deviceId"))) {
                                        com.ishumei.smantifraud.l111l11111lIl.l1111l111111Il.l111l11111Il.l1111l111111Il().l1111l111111Il(jSONObjectOptJSONObject.optString("deviceId"), true);
                                        this.l11l1111lIIl++;
                                        try {
                                            httpURLConnection4.disconnect();
                                            outputStream.close();
                                            if (inputStream4 != null) {
                                                inputStream4.close();
                                                return;
                                            }
                                            return;
                                        } catch (Exception unused3) {
                                            return;
                                        }
                                    }
                                    this.l11l1111lIIl++;
                                    httpURLConnection4.disconnect();
                                    outputStream.close();
                                    if (inputStream4 != null) {
                                        inputStream4.close();
                                    }
                                } else {
                                    this.l11l1111lIIl++;
                                    httpURLConnection4.disconnect();
                                    outputStream.close();
                                    if (inputStream4 != null) {
                                        inputStream4.close();
                                    }
                                }
                            }
                        } catch (InterruptedException unused4) {
                            inputStream3 = inputStream4;
                            httpURLConnection2 = httpURLConnection4;
                            this.l11l1111lIIl++;
                            if (httpURLConnection2 != null) {
                                httpURLConnection2.disconnect();
                            }
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream3 != null) {
                                inputStream3.close();
                                return;
                            }
                            return;
                        } catch (Exception unused5) {
                            inputStream2 = inputStream4;
                            httpURLConnection3 = httpURLConnection4;
                            this.l11l1111lIIl++;
                            if (httpURLConnection3 != null) {
                                httpURLConnection3.disconnect();
                            }
                            if (outputStream != null) {
                                outputStream.close();
                            }
                            if (inputStream2 != null) {
                                inputStream2.close();
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            inputStream = inputStream4;
                            httpURLConnection = httpURLConnection4;
                            this.l11l1111lIIl++;
                            if (httpURLConnection != null) {
                                try {
                                    httpURLConnection.disconnect();
                                    if (outputStream != null) {
                                        outputStream.close();
                                    }
                                    if (inputStream != null) {
                                        inputStream.close();
                                    }
                                } catch (Exception unused6) {
                                    throw th;
                                }
                            } else {
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                if (inputStream != null) {
                                    inputStream.close();
                                }
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused7) {
                        inputStream3 = null;
                        outputStream = null;
                    } catch (Exception unused8) {
                        outputStream = null;
                        httpURLConnection3 = httpURLConnection4;
                        inputStream2 = null;
                    } catch (Throwable th3) {
                        th = th3;
                        inputStream = null;
                        outputStream = null;
                    }
                } catch (InterruptedException unused9) {
                    inputStream3 = null;
                    outputStream = null;
                } catch (Exception unused10) {
                    inputStream2 = null;
                    outputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    inputStream = null;
                    outputStream = null;
                }
            }
        } catch (Exception unused11) {
        }
    }
}
