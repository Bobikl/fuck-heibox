package org.apache.tools.ant.taskdefs;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: compiled from: ExecuteStreamHandler.java */
/* JADX INFO: loaded from: classes5.dex */
public interface q1 {
    void e1(InputStream inputStream) throws IOException;

    void o1(OutputStream outputStream) throws IOException;

    void q1(InputStream inputStream) throws IOException;

    void start() throws IOException;

    void stop();
}
