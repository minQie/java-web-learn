package priv.wmc.common.utils;

import priv.wmc.constant.StaticConfig;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 时间工具类
 *
 * @author 王敏聪
 * @date 2019/11/15 11:46
 */
public final class DateUtils {

    private DateUtils() {}

    public static String getDateString(String format) {
        return new SimpleDateFormat(format).format(new Date());
    }

    public static String getDateString(Date date) {
        return getDateString(date, StaticConfig.DATE_TIME_PATTERN);
    }

    @SuppressWarnings("WeakerAccess")
    public static String getDateString(Date date, String format) {
        return new SimpleDateFormat(format).format(date);
    }

}