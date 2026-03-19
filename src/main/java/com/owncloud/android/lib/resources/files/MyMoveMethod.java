package com.owncloud.android.lib.resources.files;

import org.apache.commons.httpclient.HttpStatus;
import org.apache.jackrabbit.webdav.client.methods.MoveMethod;

public class MyMoveMethod extends MoveMethod {
    public MyMoveMethod(String uri, String destinationUri, boolean overwrite) {
        super(uri, destinationUri, overwrite);
    }

    @Override
    protected boolean isSuccess(int status) {
        return status == HttpStatus.SC_OK || status == HttpStatus.SC_CREATED || status == HttpStatus.SC_NO_CONTENT;
    }
}
