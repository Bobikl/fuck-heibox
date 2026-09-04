package org.apache.tools.ant.taskdefs.optional.jlink;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: compiled from: ClassNameReader.java */
/* JADX INFO: loaded from: classes5.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f135227a = -889275714;

    public static String a(InputStream inputStream) throws IOException {
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        if (dataInputStream.readInt() != f135227a) {
            return null;
        }
        dataInputStream.readInt();
        Object[] objArr = new b(dataInputStream).f135241b;
        dataInputStream.readUnsignedShort();
        return (String) objArr[((Integer) objArr[dataInputStream.readUnsignedShort()]).intValue()];
    }
}
