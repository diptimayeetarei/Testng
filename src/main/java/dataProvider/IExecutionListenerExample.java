package dataProvider;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.testng.IExecutionListener;

public class IExecutionListenerExample implements IExecutionListener {
	private long startTime;
	@Override
	public void onExecutionStart() {
		System.out.println("TestNg is going to Start");
		startTime= System.currentTimeMillis();
		String timeStamp = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss").format(Calendar.getInstance().getTime());
		System.out.println("TestNg is started at :" +timeStamp);
	}

	@Override
	public void onExecutionFinish() {
		System.out.println("TestNg is finished at : " + ((System.currentTimeMillis())-startTime) + "ms");
		
	}

}
