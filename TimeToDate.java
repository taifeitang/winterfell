import java.text.SimpleDateFormat;
import java.util.TimeZone;

/*此类描述了如何获取不同时区的时间日期的方法*/
public class TimeToDate {	
	public static void main(String[] args) {
		long t=System.currentTimeMillis();//得到当前时间，是指从一个基准时间（1970-1-1 00:00:00 +0:00），到现在的毫秒数
		System.out.println("毫秒表示："+t);
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		String localDate=sdf.format(t);
		System.out.println("当地时间："+localDate);
		sdf.setTimeZone(TimeZone.getTimeZone("GMT8"));
		String zt=sdf.format(t);
		System.out.println("东八区时间："+zt);
		sdf.setTimeZone(TimeZone.getTimeZone("GMT7"));
		String zts=sdf.format(t);
		System.out.println("东七区时间："+zts);
	}

}
