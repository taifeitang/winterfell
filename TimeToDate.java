import java.text.SimpleDateFormat;
import java.util.TimeZone;

/*������������λ�ȡ��ͬʱ����ʱ�����ڵķ���*/
public class TimeToDate {	
	public static void main(String[] args) {
		long t=System.currentTimeMillis();//�õ���ǰʱ�䣬��ָ��һ����׼ʱ�䣨1970-1-1 00:00:00 +0:00���������ڵĺ�����
		System.out.println("�����ʾ��"+t);
		SimpleDateFormat sdf=new SimpleDateFormat("YYYY-MM-dd hh:mm:ss");
		String localDate=sdf.format(t);
		System.out.println("����ʱ�䣺"+localDate);
		sdf.setTimeZone(TimeZone.getTimeZone("GMT8"));
		String zt=sdf.format(t);
		System.out.println("������ʱ�䣺"+zt);
		sdf.setTimeZone(TimeZone.getTimeZone("GMT7"));
		String zts=sdf.format(t);
		System.out.println("������ʱ�䣺"+zts);
	}

}
