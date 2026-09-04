package com.google.auto.service.processor;

import com.google.common.io.m;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: ServicesFiles.java */
/* JADX INFO: loaded from: classes7.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f56580a = "META-INF/services";

    private c() {
    }

    static String a(String str) {
        return "META-INF/services/" + str;
    }

    static Set<String> b(InputStream inputStream) throws Throwable {
        HashSet hashSet = new HashSet();
        m mVarA = m.a();
        try {
            BufferedReader bufferedReader = (BufferedReader) mVarA.b(new BufferedReader(new InputStreamReader(inputStream, com.google.common.base.c.f56721c)));
            while (true) {
                String line = bufferedReader.readLine();
                if (line == null) {
                    mVarA.close();
                    return hashSet;
                }
                int iIndexOf = line.indexOf(35);
                if (iIndexOf >= 0) {
                    line = line.substring(0, iIndexOf);
                }
                String strTrim = line.trim();
                if (!strTrim.isEmpty()) {
                    hashSet.add(strTrim);
                }
            }
        } catch (Throwable th2) {
            try {
                throw mVarA.c(th2);
            } catch (Throwable th3) {
                mVarA.close();
                throw th3;
            }
        }
    }

    static void c(Collection<String> collection, OutputStream outputStream) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, com.google.common.base.c.f56721c));
        Iterator<String> it = collection.iterator();
        while (it.hasNext()) {
            bufferedWriter.write(it.next());
            bufferedWriter.newLine();
        }
        bufferedWriter.flush();
    }
}
