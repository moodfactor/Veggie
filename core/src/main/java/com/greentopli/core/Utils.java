package com.greentopli.core;

import java.util.Calendar;

/**
 * Created by rnztx on 19/10/16.
 */

public class Utils {
	public static long getDateExcludingTime(){
		return getDateExcludingTime(Calendar.getInstance());
	}

	/**
	 * Striping out time details so that we can compare only by long value
	 */
	public static long getDateExcludingTime(Calendar calendar){
		calendar.clear(Calendar.HOUR_OF_DAY);
		calendar.clear(Calendar.AM_PM);
		calendar.clear(Calendar.MINUTE);
		calendar.clear(Calendar.SECOND);
		calendar.clear(Calendar.MILLISECOND);
		return calendar.getTimeInMillis();
	}
}