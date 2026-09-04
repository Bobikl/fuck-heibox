package com.igexin.push.config;

import android.content.Context;
import com.huawei.hms.framework.common.ContainerUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;

/* JADX INFO: loaded from: classes.dex */
public class m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static String f63449a = "FileConfig";

    public static void a() throws Throwable {
        InputStream inputStreamOpen;
        Closeable closeable = null;
        try {
            inputStreamOpen = com.igexin.push.core.d.f63671e.getResources().getAssets().open(com.igexin.push.core.d.f63669c + ".properties");
            try {
                a(inputStreamOpen);
            } catch (Exception unused) {
            } catch (Throwable th2) {
                th = th2;
                closeable = inputStreamOpen;
                com.igexin.push.util.m.a(closeable);
                throw th;
            }
        } catch (Exception unused2) {
            inputStreamOpen = null;
        } catch (Throwable th3) {
            th = th3;
        }
        com.igexin.push.util.m.a(inputStreamOpen);
        if (!new File(com.igexin.push.core.d.S).exists()) {
            com.igexin.push.core.d.S = com.igexin.push.util.d.d(com.igexin.push.core.d.f63671e) + com.igexin.push.core.d.f63669c + ".properties";
            if (!new File(com.igexin.push.core.d.S).exists()) {
                return;
            }
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(com.igexin.push.core.d.S);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader.readLine();
                        if (line == null) {
                            com.igexin.push.util.m.a(bufferedReader);
                            com.igexin.push.util.m.a(fileInputStream);
                            return;
                        } else if (!line.startsWith("#")) {
                            String[] strArrSplit = line.split(ContainerUtils.KEY_VALUE_DELIMITER);
                            if (strArrSplit.length >= 2) {
                                String strTrim = strArrSplit[0].trim();
                                String strTrim2 = strArrSplit[1].trim();
                                if (strTrim.equals("sdk.debug")) {
                                    com.igexin.a.a.c.b.f63207a = Boolean.valueOf(strTrim2).booleanValue();
                                } else {
                                    continue;
                                }
                            }
                        }
                    } catch (Exception unused3) {
                        closeable = bufferedReader;
                        inputStreamOpen = fileInputStream;
                        com.igexin.push.util.m.a(closeable);
                        com.igexin.push.util.m.a(inputStreamOpen);
                        return;
                    } catch (Throwable th4) {
                        th = th4;
                        closeable = bufferedReader;
                        inputStreamOpen = fileInputStream;
                        com.igexin.push.util.m.a(closeable);
                        com.igexin.push.util.m.a(inputStreamOpen);
                        throw th;
                    }
                }
            } catch (Exception unused4) {
            } catch (Throwable th5) {
                th = th5;
            }
        } catch (Exception unused5) {
        } catch (Throwable th6) {
            th = th6;
        }
    }

    public static void a(Context context) {
        try {
            byte[] bArrA = com.igexin.push.util.d.a(context.getFilesDir().getPath() + "/conf_n.pid");
            if (bArrA != null) {
                l.f63433k = Boolean.parseBoolean(new String(bArrA));
            }
        } catch (Throwable th2) {
            com.igexin.a.a.c.b.a(f63449a + "|load need confgi error = " + th2.toString(), new Object[0]);
        }
    }

    public static void a(InputStream inputStream) throws Throwable {
        BufferedReader bufferedReader = null;
        try {
            try {
                BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));
                while (true) {
                    try {
                        String line = bufferedReader2.readLine();
                        if (line == null) {
                            break;
                        }
                        if (!line.startsWith("#")) {
                            String[] strArrSplit = line.split(ContainerUtils.KEY_VALUE_DELIMITER);
                            if (strArrSplit.length >= 2) {
                                String strTrim = strArrSplit[0].trim();
                                String strTrim2 = strArrSplit[1].trim();
                                if (strTrim.equals("sdk.cm_address")) {
                                    SDKUrlConfig.setXfrAddressIps(strTrim2.split(Constants.ACCEPT_TIME_SEPARATOR_SP));
                                } else if (strTrim.equals("sdk.config_address")) {
                                    SDKUrlConfig.CONFIG_ADDRESS_IPS = strTrim2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                } else if (strTrim.equals("sdk.bi_address")) {
                                    SDKUrlConfig.BI_ADDRESS_IPS = strTrim2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                } else if (strTrim.equals("sdk.state_address")) {
                                    SDKUrlConfig.STATE_ADDRESS_IPS = strTrim2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                } else if (strTrim.equals("sdk.cm_address_backup")) {
                                    SDKUrlConfig.XFR_ADDRESS_BAK = strTrim2.split(Constants.ACCEPT_TIME_SEPARATOR_SP);
                                } else if (strTrim.equals("sdk.debug")) {
                                    com.igexin.a.a.c.b.f63207a = Boolean.parseBoolean(strTrim2);
                                } else if (strTrim.equals("sdk.domainbackup.enable")) {
                                    l.f63428f = Boolean.parseBoolean(strTrim2);
                                } else if (strTrim.equals("sdk.feature.sendmessage.enable")) {
                                    l.f63429g = Boolean.parseBoolean(strTrim2);
                                } else if (strTrim.equals("sdk.stay.backup.time")) {
                                    l.f63436n = Long.parseLong(strTrim2) * 1000;
                                } else if (strTrim.equals("sdk.enter.backup.detect.failed.cnt")) {
                                    l.f63437o = Integer.parseInt(strTrim2);
                                } else if (strTrim.equals("sdk.login.failed.cnt")) {
                                    l.f63438p = Integer.parseInt(strTrim2);
                                } else if (strTrim.equals("sdk.detect.ip.expired.time")) {
                                    l.f63439q = Long.parseLong(strTrim2) * 1000;
                                } else if (strTrim.equals("sdk.detect.interval.time")) {
                                    l.f63440r = Long.parseLong(strTrim2) * 1000;
                                }
                            }
                        }
                    } catch (Exception unused) {
                        bufferedReader = bufferedReader2;
                        if (bufferedReader == null) {
                            return;
                        } else {
                            bufferedReader.close();
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        bufferedReader = bufferedReader2;
                        if (bufferedReader != null) {
                            try {
                                bufferedReader.close();
                            } catch (Exception e10) {
                                e10.printStackTrace();
                            }
                        }
                        throw th;
                    }
                }
                bufferedReader2.close();
            } catch (Exception e11) {
                e11.printStackTrace();
            }
        } catch (Exception unused2) {
        } catch (Throwable th3) {
            th = th3;
        }
    }
}
