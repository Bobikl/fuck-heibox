package com.github.mikephil.charting.utils;

import android.content.res.AssetManager;
import android.os.Environment;
import android.util.Log;
import com.github.mikephil.charting.data.BarEntry;
import com.github.mikephil.charting.data.Entry;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
public class FileUtils {
    private static final String LOG = "MPChart-FileUtils";

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    public static List<BarEntry> loadBarEntriesFromAssets(AssetManager assetManager, String str) throws Throwable {
        ArrayList arrayList = new ArrayList();
        ?? r10 = 0;
        float f10 = 0.0f;
        r10 = 0;
        r10 = 0;
        try {
            try {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(assetManager.open(str), "UTF-8"));
                    try {
                        for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                            String[] strArrSplit = line.split("#");
                            f10 = Float.parseFloat(strArrSplit[1]);
                            arrayList.add(new BarEntry(f10, Float.parseFloat(strArrSplit[0])));
                        }
                        bufferedReader.close();
                        r10 = f10;
                    } catch (IOException e10) {
                        e = e10;
                        r10 = bufferedReader;
                        Log.e(LOG, e.toString());
                        if (r10 != 0) {
                            r10.close();
                            r10 = r10;
                        }
                        return arrayList;
                    } catch (Throwable th2) {
                        th = th2;
                        r10 = bufferedReader;
                        if (r10 != 0) {
                            try {
                                r10.close();
                            } catch (IOException e11) {
                                Log.e(LOG, e11.toString());
                            }
                        }
                        throw th;
                    }
                } catch (IOException e12) {
                    Log.e(LOG, e12.toString());
                }
            } catch (IOException e13) {
                e = e13;
            }
            return arrayList;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [float[]] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v13, types: [float] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x0081 -> B:37:0x0088). Please report as a decompilation issue!!! */
    public static List<Entry> loadEntriesFromAssets(AssetManager assetManager, String str) throws Throwable {
        ?? r10;
        ArrayList arrayList = new ArrayList();
        ?? r11 = 0;
        ?? r12 = 0;
        BufferedReader bufferedReader = null;
        r11 = 0;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(assetManager.open(str), "UTF-8"));
                    try {
                        String line = bufferedReader2.readLine();
                        while (line != null) {
                            String[] strArrSplit = line.split("#");
                            if (strArrSplit.length <= 2) {
                                r10 = Float.parseFloat(strArrSplit[1]);
                                arrayList.add(new Entry(r10, Float.parseFloat(strArrSplit[0])));
                            } else {
                                int length = strArrSplit.length - 1;
                                r10 = new float[length];
                                for (int i10 = 0; i10 < length; i10++) {
                                    r10[i10] = Float.parseFloat(strArrSplit[i10]);
                                }
                                arrayList.add(new BarEntry(Integer.parseInt(strArrSplit[strArrSplit.length - 1]), (float[]) r10));
                            }
                            line = bufferedReader2.readLine();
                            r12 = r10;
                        }
                        bufferedReader2.close();
                        r11 = r12;
                    } catch (IOException e10) {
                        e = e10;
                        bufferedReader = bufferedReader2;
                        Log.e(LOG, e.toString());
                        r11 = bufferedReader;
                        if (bufferedReader != null) {
                            bufferedReader.close();
                            r11 = bufferedReader;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        r11 = bufferedReader2;
                        if (r11 != 0) {
                            try {
                                r11.close();
                            } catch (IOException e11) {
                                Log.e(LOG, e11.toString());
                            }
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            } catch (IOException e12) {
                e = e12;
            }
        } catch (IOException e13) {
            Log.e(LOG, e13.toString());
            r11 = r11;
        }
        return arrayList;
    }

    public static List<Entry> loadEntriesFromFile(String str) {
        File file = new File(Environment.getExternalStorageDirectory(), str);
        ArrayList arrayList = new ArrayList();
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] strArrSplit = line.split("#");
                if (strArrSplit.length <= 2) {
                    arrayList.add(new Entry(Float.parseFloat(strArrSplit[0]), Integer.parseInt(strArrSplit[1])));
                } else {
                    int length = strArrSplit.length - 1;
                    float[] fArr = new float[length];
                    for (int i10 = 0; i10 < length; i10++) {
                        fArr[i10] = Float.parseFloat(strArrSplit[i10]);
                    }
                    arrayList.add(new BarEntry(Integer.parseInt(strArrSplit[strArrSplit.length - 1]), fArr));
                }
            }
        } catch (IOException e10) {
            Log.e(LOG, e10.toString());
        }
        return arrayList;
    }

    public static void saveToSdCard(List<Entry> list, String str) {
        File file = new File(Environment.getExternalStorageDirectory(), str);
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException e10) {
                Log.e(LOG, e10.toString());
            }
        }
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            for (Entry entry : list) {
                bufferedWriter.append((CharSequence) (entry.getY() + "#" + entry.getX()));
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e11) {
            Log.e(LOG, e11.toString());
        }
    }
}
