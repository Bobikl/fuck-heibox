package com.tencent.qcloud.core.http;

import android.content.ContentResolver;
import android.net.Uri;
import android.text.TextUtils;
import com.tencent.qcloud.core.common.QCloudClientException;
import com.tencent.qcloud.core.common.QCloudProgressListener;
import com.tencent.qcloud.core.common.QCloudServiceException;
import com.tencent.qcloud.core.util.QCloudHttpUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import okhttp3.internal.Util;
import okio.Buffer;

/* JADX INFO: loaded from: classes4.dex */
public class ResponseFileConverter<T> extends ResponseBodyConverter<T> implements ProgressBody {
    private ContentResolver contentResolver;
    private Uri contentUri;
    private CountingSink countingSink;
    private String filePath;
    protected boolean isQuic = false;
    private long offset;
    protected QCloudProgressListener progressListener;

    public ResponseFileConverter(Uri uri, ContentResolver contentResolver, long j10) {
        this.contentUri = uri;
        this.contentResolver = contentResolver;
        this.offset = j10;
    }

    public ResponseFileConverter(String str, long j10) {
        this.filePath = str;
        this.offset = j10;
    }

    private T downloadToAbsolutePath(HttpResponse<T> httpResponse, long j10) throws Throwable {
        File file = new File(this.filePath);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new QCloudClientException(new IOException("local file directory can not create."));
        }
        if (httpResponse.response.q() == null) {
            throw new QCloudServiceException("response body is empty !");
        }
        try {
            writeRandomAccessFile(file, httpResponse.byteStream(), j10);
            return null;
        } catch (IOException e10) {
            e10.printStackTrace();
            throw new QCloudClientException("write local file error for " + e10.toString(), e10);
        }
    }

    private T pipeToContentUri(HttpResponse<T> httpResponse, long j10) throws QCloudServiceException, QCloudClientException {
        OutputStream outputStream = getOutputStream();
        InputStream inputStreamByteStream = httpResponse.byteStream();
        byte[] bArr = new byte[8192];
        this.countingSink = new CountingSink(new Buffer(), j10, this.progressListener);
        while (true) {
            try {
                try {
                    int i10 = inputStreamByteStream.read(bArr);
                    if (i10 == -1) {
                        Util.closeQuietly(outputStream);
                        return null;
                    }
                    outputStream.write(bArr, 0, i10);
                    this.countingSink.writeBytesInternal(i10);
                } catch (IOException e10) {
                    e10.printStackTrace();
                    throw new QCloudClientException("write local uri error for " + e10.toString(), e10);
                }
            } catch (Throwable th2) {
                Util.closeQuietly(outputStream);
                throw th2;
            }
        }
    }

    private void writeRandomAccessFile(File file, InputStream inputStream, long j10) throws Throwable {
        if (inputStream == null) {
            throw new QCloudClientException(new IOException("response body stream is null"));
        }
        RandomAccessFile randomAccessFile = null;
        try {
            RandomAccessFile randomAccessFile2 = new RandomAccessFile(file, "rws");
            try {
                long j11 = this.offset;
                if (j11 > 0) {
                    randomAccessFile2.seek(j11);
                }
                byte[] bArr = new byte[8192];
                this.countingSink = new CountingSink(new Buffer(), j10, this.progressListener);
                while (true) {
                    int i10 = inputStream.read(bArr);
                    if (i10 == -1) {
                        Util.closeQuietly(randomAccessFile2);
                        return;
                    } else {
                        randomAccessFile2.write(bArr, 0, i10);
                        this.countingSink.writeBytesInternal(i10);
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                randomAccessFile = randomAccessFile2;
                if (randomAccessFile != null) {
                    Util.closeQuietly(randomAccessFile);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
        }
    }

    @Override // com.tencent.qcloud.core.http.ResponseBodyConverter
    public T convert(HttpResponse<T> httpResponse) throws QCloudServiceException, QCloudClientException {
        if (this.isQuic) {
            return null;
        }
        HttpResponse.checkResponseSuccessful(httpResponse);
        long[] contentRange = QCloudHttpUtils.parseContentRange(httpResponse.header("Content-Range"));
        long jContentLength = contentRange != null ? (contentRange[1] - contentRange[0]) + 1 : httpResponse.contentLength();
        if (!TextUtils.isEmpty(this.filePath)) {
            return downloadToAbsolutePath(httpResponse, jContentLength);
        }
        if (this.contentUri != null) {
            return pipeToContentUri(httpResponse, jContentLength);
        }
        throw new QCloudClientException(new IllegalArgumentException("filePath or ContentUri are both null"));
    }

    public void enableQuic(boolean z10) {
        this.isQuic = z10;
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public long getBytesTransferred() {
        CountingSink countingSink = this.countingSink;
        if (countingSink != null) {
            return countingSink.getTotalTransferred();
        }
        return 0L;
    }

    public OutputStream getOutputStream() throws QCloudClientException {
        if (TextUtils.isEmpty(this.filePath)) {
            Uri uri = this.contentUri;
            if (uri == null) {
                throw new QCloudClientException(new IllegalArgumentException("filePath or ContentUri are both null"));
            }
            try {
                return this.contentResolver.openOutputStream(uri);
            } catch (FileNotFoundException e10) {
                throw new QCloudClientException(e10);
            }
        }
        File file = new File(this.filePath);
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new QCloudClientException(new IOException("local file directory can not create."));
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException e11) {
            throw new QCloudClientException(e11);
        }
    }

    public QCloudProgressListener getProgressListener() {
        return this.progressListener;
    }

    @Override // com.tencent.qcloud.core.http.ProgressBody
    public void setProgressListener(QCloudProgressListener qCloudProgressListener) {
        this.progressListener = qCloudProgressListener;
    }
}
