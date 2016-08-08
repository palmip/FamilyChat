package com.lwk.familycontact.storage.db;

import com.lwk.familycontact.im.HxSdkHelper;

/**
 * Created by LWK
 * TODO 数据库参数
 * 2016/8/8
 */
public class DbParams
{
    public static final int DB_VERSION = 1;

    public static String getDbName()
    {
        return new StringBuffer().append(HxSdkHelper.getInstance().getCurLoginUser())
                .append("_contact.db").toString().trim();
    }
}